.class public final Le2/z;
.super Lj2/t;
.source "SourceFile"


# static fields
.field public static final f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile _decision:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Le2/z;

    const-string v1, "_decision"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Le2/z;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Le2/z;->r(Ljava/lang/Object;)V

    return-void
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 3

    :cond_0
    sget-object v0, Le2/z;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lj2/t;->e:LO1/d;

    invoke-static {v0}, Lv0/f;->y(LO1/d;)LO1/d;

    move-result-object v0

    invoke-static {p1}, Le2/v;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lj2/a;->i(LO1/d;Ljava/lang/Object;LW1/l;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method
