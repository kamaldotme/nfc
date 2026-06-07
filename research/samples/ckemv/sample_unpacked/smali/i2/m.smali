.class public final Li2/m;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:I

.field public final synthetic g:[Lh2/f;

.field public final synthetic h:I

.field public final synthetic i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic j:Lg2/h;


# direct methods
.method public constructor <init>([Lh2/f;ILjava/util/concurrent/atomic/AtomicInteger;Lg2/h;LO1/d;)V
    .locals 0

    iput-object p1, p0, Li2/m;->g:[Lh2/f;

    iput p2, p0, Li2/m;->h:I

    iput-object p3, p0, Li2/m;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p4, p0, Li2/m;->j:Lg2/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 6

    new-instance p2, Li2/m;

    iget-object v3, p0, Li2/m;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v4, p0, Li2/m;->j:Lg2/h;

    iget-object v1, p0, Li2/m;->g:[Lh2/f;

    iget v2, p0, Li2/m;->h:I

    move-object v0, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Li2/m;-><init>([Lh2/f;ILjava/util/concurrent/atomic/AtomicInteger;Lg2/h;LO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, Li2/m;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, Li2/m;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, Li2/m;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, Li2/m;->f:I

    const/4 v2, 0x0

    iget-object v3, p0, Li2/m;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v4, p0, Li2/m;->j:Lg2/h;

    const/4 v5, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v5, :cond_0

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
    iget-object p1, p0, Li2/m;->g:[Lh2/f;

    iget v1, p0, Li2/m;->h:I

    aget-object p1, p1, v1

    new-instance v6, Li2/l;

    invoke-direct {v6, v4, v1}, Li2/l;-><init>(Lg2/h;I)V

    iput v5, p0, Li2/m;->f:I

    invoke-interface {p1, v6, p0}, Lh2/f;->a(Lh2/g;LO1/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_3

    invoke-interface {v4, v2}, Lg2/u;->k(Ljava/lang/Throwable;)Z

    :cond_3
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1

    :goto_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {v4, v2}, Lg2/u;->k(Ljava/lang/Throwable;)Z

    :cond_4
    throw p1
.end method
