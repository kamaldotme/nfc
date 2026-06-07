.class public final Lm0/f;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:I

.field public final synthetic g:Landroidx/work/CoroutineWorker;


# direct methods
.method public constructor <init>(Landroidx/work/CoroutineWorker;LO1/d;)V
    .locals 0

    iput-object p1, p0, Lm0/f;->g:Landroidx/work/CoroutineWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 1

    new-instance p2, Lm0/f;

    iget-object v0, p0, Lm0/f;->g:Landroidx/work/CoroutineWorker;

    invoke-direct {p2, v0, p1}, Lm0/f;-><init>(Landroidx/work/CoroutineWorker;LO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, Lm0/f;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, Lm0/f;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, Lm0/f;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, Lm0/f;->f:I

    const/4 v2, 0x1

    iget-object v3, p0, Lm0/f;->g:Landroidx/work/CoroutineWorker;

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    :try_start_1
    iput v2, p0, Lm0/f;->f:I

    invoke-virtual {v3}, Landroidx/work/CoroutineWorker;->f()Lm0/p;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lm0/p;

    iget-object v0, v3, Landroidx/work/CoroutineWorker;->g:Lx0/k;

    invoke-virtual {v0, p1}, Lx0/k;->j(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    iget-object v0, v3, Landroidx/work/CoroutineWorker;->g:Lx0/k;

    invoke-virtual {v0, p1}, Lx0/k;->k(Ljava/lang/Throwable;)Z

    :goto_2
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
