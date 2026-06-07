.class public final Lm0/e;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:Lm0/l;

.field public g:I

.field public final synthetic h:Lm0/l;

.field public final synthetic i:Landroidx/work/CoroutineWorker;


# direct methods
.method public constructor <init>(Lm0/l;Landroidx/work/CoroutineWorker;LO1/d;)V
    .locals 0

    iput-object p1, p0, Lm0/e;->h:Lm0/l;

    iput-object p2, p0, Lm0/e;->i:Landroidx/work/CoroutineWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 2

    new-instance p2, Lm0/e;

    iget-object v0, p0, Lm0/e;->h:Lm0/l;

    iget-object v1, p0, Lm0/e;->i:Landroidx/work/CoroutineWorker;

    invoke-direct {p2, v0, v1, p1}, Lm0/e;-><init>(Lm0/l;Landroidx/work/CoroutineWorker;LO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, Lm0/e;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, Lm0/e;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, Lm0/e;->k(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lm0/e;->g:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lm0/e;->f:Lm0/l;

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object v0, v0, Lm0/l;->a:Lx0/k;

    invoke-virtual {v0, p1}, Lx0/k;->j(Ljava/lang/Object;)Z

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object p1, p0, Lm0/e;->h:Lm0/l;

    iput-object p1, p0, Lm0/e;->f:Lm0/l;

    iput v1, p0, Lm0/e;->g:I

    iget-object p1, p0, Lm0/e;->i:Landroidx/work/CoroutineWorker;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not implemented"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
