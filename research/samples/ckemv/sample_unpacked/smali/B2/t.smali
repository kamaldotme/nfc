.class public final LB2/t;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:Lxyz/happify/ckemv/MeResponse;

.field public g:Ljava/util/List;

.field public h:I

.field public final synthetic i:Lxyz/happify/ckemv/MainActivity;


# direct methods
.method public constructor <init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V
    .locals 0

    iput-object p1, p0, LB2/t;->i:Lxyz/happify/ckemv/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 1

    new-instance p2, LB2/t;

    iget-object v0, p0, LB2/t;->i:Lxyz/happify/ckemv/MainActivity;

    invoke-direct {p2, v0, p1}, LB2/t;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, LB2/t;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, LB2/t;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, LB2/t;->k(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LP1/a;->b:LP1/a;

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, LB2/t;->h:I

    const/4 v2, 0x0

    const-string v3, "dbHelper"

    iget-object v4, p0, LB2/t;->i:Lxyz/happify/ckemv/MainActivity;

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v6, :cond_1

    if-ne v1, v5, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LB2/t;->g:Ljava/util/List;

    iget-object v7, p0, LB2/t;->f:Lxyz/happify/ckemv/MeResponse;

    :try_start_0
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_2
    :goto_0
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    :cond_3
    iget-object p1, v4, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, LB2/a;->i()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_9

    const/16 v1, 0x8

    invoke-static {p1, v1}, Ld2/d;->m0(Ljava/lang/String;I)Ljava/lang/String;

    sget-object v1, Lxyz/happify/ckemv/Reporter;->INSTANCE:Lxyz/happify/ckemv/Reporter;

    const-string v7, "http://127.0.0.1:4444"

    invoke-virtual {v1, p1, v7}, Lxyz/happify/ckemv/Reporter;->fetchCves(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    const-string v8, "Error"

    invoke-static {v1, v8, v7}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_4

    goto/16 :goto_4

    :cond_4
    :try_start_1
    new-instance v7, Lb1/l;

    invoke-direct {v7}, Lb1/l;-><init>()V

    invoke-virtual {v7, v1}, Lb1/l;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lxyz/happify/ckemv/MeResponse;

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Lxyz/happify/ckemv/MeResponse;->getCves()Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_5
    move-object v1, v2

    :goto_1
    if-eqz v7, :cond_7

    invoke-virtual {v7}, Lxyz/happify/ckemv/MeResponse;->getLatest_version()Lxyz/happify/ckemv/AppVersion;

    move-result-object v8

    if-eqz v8, :cond_7

    invoke-virtual {v8}, Lxyz/happify/ckemv/AppVersion;->getMajor()I

    move-result v9

    if-gt v9, v6, :cond_6

    invoke-virtual {v8}, Lxyz/happify/ckemv/AppVersion;->getMajor()I

    move-result v9

    if-ne v9, v6, :cond_7

    invoke-virtual {v8}, Lxyz/happify/ckemv/AppVersion;->getMinor()I

    move-result v9

    const/4 v10, 0x7

    if-le v9, v10, :cond_7

    :cond_6
    invoke-virtual {v8}, Lxyz/happify/ckemv/AppVersion;->getMajor()I

    move-result v9

    invoke-virtual {v8}, Lxyz/happify/ckemv/AppVersion;->getMinor()I

    move-result v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "."

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    iput-object v7, p0, LB2/t;->f:Lxyz/happify/ckemv/MeResponse;

    iput-object v1, p0, LB2/t;->g:Ljava/util/List;

    iput v6, p0, LB2/t;->h:I

    invoke-static {v4, p1, v8, p0}, Lxyz/happify/ckemv/MainActivity;->w(Lxyz/happify/ckemv/MainActivity;Ljava/lang/String;Ljava/lang/String;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    if-eqz v1, :cond_9

    invoke-interface {v1}, Ljava/util/List;->size()I

    invoke-virtual {v7}, Lxyz/happify/ckemv/MeResponse;->getName()Ljava/lang/String;

    iget-object p1, v4, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    if-eqz p1, :cond_8

    invoke-virtual {p1, v1}, LB2/a;->A(Ljava/util/List;)V

    goto :goto_4

    :cond_8
    invoke-static {v3}, LX1/g;->h(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_9
    :goto_4
    iput-object v2, p0, LB2/t;->f:Lxyz/happify/ckemv/MeResponse;

    iput-object v2, p0, LB2/t;->g:Ljava/util/List;

    iput v5, p0, LB2/t;->h:I

    const-wide/32 v7, 0xea60

    invoke-static {v7, v8, p0}, Le2/v;->d(JLO1/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_a
    invoke-static {v3}, LX1/g;->h(Ljava/lang/String;)V

    throw v2
.end method
