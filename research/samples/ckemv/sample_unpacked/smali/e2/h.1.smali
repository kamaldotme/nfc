.class public final Le2/h;
.super Le2/T;
.source "SourceFile"


# instance fields
.field public final f:Le2/f;


# direct methods
.method public constructor <init>(Le2/f;)V
    .locals 0

    invoke-direct {p0}, Lj2/k;-><init>()V

    iput-object p1, p0, Le2/h;->f:Le2/f;

    return-void
.end method


# virtual methods
.method public final bridge synthetic h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Le2/h;->p(Ljava/lang/Throwable;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method

.method public final p(Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p0}, Le2/V;->o()Le2/Z;

    move-result-object p1

    iget-object v0, p0, Le2/h;->f:Le2/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Le2/Z;->B()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-virtual {v0}, Le2/f;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, v0, Le2/f;->e:LO1/d;

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {v1, v2}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lj2/h;

    :goto_0
    sget-object v2, Lj2/h;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lj2/a;->d:Ld1/f;

    invoke-static {v3, v4}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_1
    invoke-virtual {v2, v1, v4, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_3
    instance-of v4, v3, Ljava/lang/Throwable;

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    :goto_1
    invoke-virtual {v0, p1}, Le2/f;->n(Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Le2/f;->v()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {v0}, Le2/f;->o()V

    :cond_5
    :goto_2
    return-void

    :cond_6
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v3, :cond_4

    goto :goto_0
.end method
