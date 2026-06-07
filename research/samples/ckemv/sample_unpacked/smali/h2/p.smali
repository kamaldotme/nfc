.class public abstract Lh2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld1/f;

.field public static final b:Ld1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld1/f;

    const-string v1, "NONE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh2/p;->a:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "PENDING"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh2/p;->b:Ld1/f;

    return-void
.end method

.method public static final a(Lh2/g;Lg2/q;ZLO1/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Lh2/h;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh2/h;

    iget v1, v0, Lh2/h;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/h;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/h;

    invoke-direct {v0, p3}, LQ1/b;-><init>(LO1/d;)V

    :goto_0
    iget-object p3, v0, Lh2/h;->i:Ljava/lang/Object;

    sget-object v1, LP1/a;->b:LP1/a;

    iget v2, v0, Lh2/h;->j:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-ne v2, v4, :cond_2

    iget-boolean p2, v0, Lh2/h;->h:Z

    iget-object p0, v0, Lh2/h;->g:Lg2/a;

    iget-object p1, v0, Lh2/h;->f:Lg2/t;

    iget-object v2, v0, Lh2/h;->e:Lh2/g;

    :try_start_0
    invoke-static {p3}, Lm0/z;->m0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object p3, p0

    move-object p0, v2

    goto :goto_1

    :catchall_0
    move-exception p0

    goto/16 :goto_3

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    iget-boolean p2, v0, Lh2/h;->h:Z

    iget-object p0, v0, Lh2/h;->g:Lg2/a;

    iget-object p1, v0, Lh2/h;->f:Lg2/t;

    iget-object v2, v0, Lh2/h;->e:Lh2/g;

    :try_start_1
    invoke-static {p3}, Lm0/z;->m0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_4
    invoke-static {p3}, Lm0/z;->m0(Ljava/lang/Object;)V

    :try_start_2
    iget-object p3, p1, Lg2/q;->e:Lg2/h;

    invoke-interface {p3}, Lg2/t;->iterator()Lg2/a;

    move-result-object p3

    :goto_1
    iput-object p0, v0, Lh2/h;->e:Lh2/g;

    iput-object p1, v0, Lh2/h;->f:Lg2/t;

    iput-object p3, v0, Lh2/h;->g:Lg2/a;

    iput-boolean p2, v0, Lh2/h;->h:Z

    iput v5, v0, Lh2/h;->j:I

    invoke-virtual {p3, v0}, Lg2/a;->b(Lh2/h;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v7, v2

    move-object v2, p0

    move-object p0, p3

    move-object p3, v7

    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_9

    iget-object p3, p0, Lg2/a;->b:Ljava/lang/Object;

    sget-object v6, Lg2/f;->p:Ld1/f;

    if-eq p3, v6, :cond_8

    iput-object v6, p0, Lg2/a;->b:Ljava/lang/Object;

    sget-object v6, Lg2/f;->l:Ld1/f;

    if-eq p3, v6, :cond_6

    iput-object v2, v0, Lh2/h;->e:Lh2/g;

    iput-object p1, v0, Lh2/h;->f:Lg2/t;

    iput-object p0, v0, Lh2/h;->g:Lg2/a;

    iput-boolean p2, v0, Lh2/h;->h:Z

    iput v4, v0, Lh2/h;->j:I

    invoke-interface {v2, v0, p3}, Lh2/g;->b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_1

    return-object v1

    :cond_6
    iget-object p0, p0, Lg2/a;->d:Lg2/d;

    invoke-virtual {p0}, Lg2/d;->r()Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_7

    new-instance p0, Lg2/m;

    const-string p3, "Channel was closed"

    invoke-direct {p0, p3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    :cond_7
    sget p3, Lj2/v;->a:I

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p3, "`hasNext()` has not been invoked"

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_9
    if-eqz p2, :cond_a

    invoke-interface {p1, v3}, Lg2/t;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_a
    sget-object p0, LK1/h;->a:LK1/h;

    return-object p0

    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p3

    if-eqz p2, :cond_d

    instance-of p2, p0, Ljava/util/concurrent/CancellationException;

    if-eqz p2, :cond_b

    move-object v3, p0

    check-cast v3, Ljava/util/concurrent/CancellationException;

    :cond_b
    if-nez v3, :cond_c

    new-instance v3, Ljava/util/concurrent/CancellationException;

    const-string p2, "Channel was consumed, consumer had failed"

    invoke-direct {v3, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_c
    invoke-interface {p1, v3}, Lg2/t;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_d
    throw p3
.end method
