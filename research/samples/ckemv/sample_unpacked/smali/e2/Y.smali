.class public final Le2/Y;
.super Lj2/b;
.source "SourceFile"


# instance fields
.field public final b:Lj2/k;

.field public c:Lj2/k;

.field public final synthetic d:Le2/Z;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj2/k;Le2/Z;Le2/M;)V
    .locals 0

    iput-object p2, p0, Le2/Y;->d:Le2/Z;

    iput-object p3, p0, Le2/Y;->e:Ljava/lang/Object;

    invoke-direct {p0}, Lj2/b;-><init>()V

    iput-object p1, p0, Le2/Y;->b:Lj2/k;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Lj2/k;

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Le2/Y;->b:Lj2/k;

    if-eqz p2, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Le2/Y;->c:Lj2/k;

    :goto_1
    if-eqz v1, :cond_4

    sget-object v2, Lj2/k;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_2
    invoke-virtual {v2, p1, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz p2, :cond_4

    iget-object p1, p0, Le2/Y;->c:Lj2/k;

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lj2/k;->k(Lj2/k;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p0, :cond_2

    :cond_4
    :goto_2
    return-void
.end method

.method public final c(Ljava/lang/Object;)Ld1/f;
    .locals 1

    check-cast p1, Lj2/k;

    iget-object p1, p0, Le2/Y;->d:Le2/Z;

    invoke-virtual {p1}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Le2/Y;->e:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object p1, Lj2/a;->e:Ld1/f;

    :goto_0
    return-object p1
.end method
