.class public abstract Lg2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg2/l;

.field public static final b:I

.field public static final c:I

.field public static final d:Ld1/f;

.field public static final e:Ld1/f;

.field public static final f:Ld1/f;

.field public static final g:Ld1/f;

.field public static final h:Ld1/f;

.field public static final i:Ld1/f;

.field public static final j:Ld1/f;

.field public static final k:Ld1/f;

.field public static final l:Ld1/f;

.field public static final m:Ld1/f;

.field public static final n:Ld1/f;

.field public static final o:Ld1/f;

.field public static final p:Ld1/f;

.field public static final q:Ld1/f;

.field public static final r:Ld1/f;

.field public static final s:Ld1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lg2/l;

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lg2/l;-><init>(JLg2/l;Lg2/d;I)V

    sput-object v6, Lg2/f;->a:Lg2/l;

    const-string v0, "kotlinx.coroutines.bufferedChannel.segmentSize"

    const/16 v1, 0x20

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-static {v0, v1, v2, v2, v3}, Lj2/a;->l(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lg2/f;->b:I

    const-string v0, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v1, 0x2710

    invoke-static {v0, v1, v2, v2, v3}, Lj2/a;->l(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lg2/f;->c:I

    new-instance v0, Ld1/f;

    const-string v1, "BUFFERED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->d:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->e:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->f:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->g:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "POISONED"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->h:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->i:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->j:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->k:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->l:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->m:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->n:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->o:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->p:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "CLOSE_HANDLER_CLOSED"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->q:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->r:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg2/f;->s:Ld1/f;

    return-void
.end method

.method public static final a(Le2/e;Ljava/lang/Object;LW1/l;)Z
    .locals 5

    check-cast p0, Le2/f;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    sget-object v0, Le2/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Le2/d0;

    sget-object v3, Le2/v;->a:Ld1/f;

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Le2/d0;

    iget v4, p0, Le2/A;->d:I

    invoke-static {v2, p1, v4, p2}, Le2/f;->A(Le2/d0;Ljava/lang/Object;ILW1/l;)Ljava/lang/Object;

    move-result-object v2

    :cond_0
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Le2/f;->v()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Le2/f;->o()V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v1, :cond_0

    goto :goto_0

    :cond_2
    instance-of p1, v1, Le2/l;

    const/4 v3, 0x0

    :cond_3
    :goto_1
    if-eqz v3, :cond_4

    iget p1, p0, Le2/A;->d:I

    invoke-virtual {p0, p1}, Le2/f;->p(I)V

    const/4 p0, 0x1

    goto :goto_2

    :cond_4
    const/4 p0, 0x0

    :goto_2
    return p0
.end method
