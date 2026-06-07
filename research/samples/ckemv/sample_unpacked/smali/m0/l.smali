.class public final Lm0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La1/a;


# instance fields
.field public final a:Lx0/k;


# direct methods
.method public constructor <init>(Le2/U;)V
    .locals 3

    new-instance v0, Lx0/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lm0/l;->a:Lx0/k;

    new-instance v0, LL1/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, LL1/a;-><init>(ILjava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2, v0}, Le2/Z;->J(ZZLW1/l;)Le2/C;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, Lm0/l;->a:Lx0/k;

    invoke-virtual {v0, p1, p2}, Lx0/i;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final cancel(Z)Z
    .locals 1

    iget-object v0, p0, Lm0/l;->a:Lx0/k;

    invoke-virtual {v0, p1}, Lx0/i;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/l;->a:Lx0/k;

    invoke-virtual {v0}, Lx0/i;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Lm0/l;->a:Lx0/k;

    invoke-virtual {v0, p1, p2, p3}, Lx0/i;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lm0/l;->a:Lx0/k;

    iget-object v0, v0, Lx0/i;->a:Ljava/lang/Object;

    instance-of v0, v0, Lx0/a;

    return v0
.end method

.method public final isDone()Z
    .locals 1

    iget-object v0, p0, Lm0/l;->a:Lx0/k;

    invoke-virtual {v0}, Lx0/i;->isDone()Z

    move-result v0

    return v0
.end method
