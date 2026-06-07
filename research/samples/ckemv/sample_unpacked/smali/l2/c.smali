.class public final Ll2/c;
.super Le2/J;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final d:Ll2/c;

.field public static final e:Le2/r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ll2/c;

    invoke-direct {v0}, Le2/r;-><init>()V

    sput-object v0, Ll2/c;->d:Ll2/c;

    sget-object v0, Ll2/l;->d:Ll2/l;

    sget v1, Lj2/w;->a:I

    const/16 v2, 0x40

    if-ge v2, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/16 v2, 0xc

    const-string v3, "kotlinx.coroutines.io.parallelism"

    const/4 v4, 0x0

    invoke-static {v3, v1, v4, v4, v2}, Lj2/a;->l(Ljava/lang/String;IIII)I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "Expected positive parallelism level, but got "

    const/4 v3, 0x1

    if-lt v1, v3, :cond_3

    sget v4, Ll2/k;->d:I

    if-lt v1, v4, :cond_1

    goto :goto_1

    :cond_1
    if-lt v1, v3, :cond_2

    new-instance v2, Lj2/i;

    invoke-direct {v2, v0, v1}, Lj2/i;-><init>(Ll2/l;I)V

    move-object v0, v2

    :goto_1
    sput-object v0, Ll2/c;->e:Le2/r;

    return-void

    :cond_2
    invoke-static {v2, v1}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2, v1}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final I(LO1/i;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Ll2/c;->e:Le2/r;

    invoke-virtual {v0, p1, p2}, Le2/r;->I(LO1/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final J(LO1/i;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Ll2/c;->e:Le2/r;

    invoke-virtual {v0, p1, p2}, Le2/r;->J(LO1/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, LO1/j;->b:LO1/j;

    invoke-virtual {p0, v0, p1}, Ll2/c;->I(LO1/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method
