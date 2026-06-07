.class public abstract Le2/r;
.super LO1/a;
.source "SourceFile"

# interfaces
.implements LO1/f;


# static fields
.field public static final c:Le2/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Le2/q;

    sget-object v1, LO1/e;->b:LO1/e;

    sget-object v2, Le2/p;->c:Le2/p;

    invoke-direct {v0, v1, v2}, Le2/q;-><init>(LO1/h;LW1/l;)V

    sput-object v0, Le2/r;->c:Le2/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, LO1/e;->b:LO1/e;

    invoke-direct {p0, v0}, LO1/a;-><init>(LO1/h;)V

    return-void
.end method


# virtual methods
.method public final A(LO1/h;)LO1/g;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Le2/q;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Le2/q;

    iget-object v1, p0, LO1/a;->b:LO1/h;

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq v1, p1, :cond_0

    iget-object v0, p1, Le2/q;->c:LO1/h;

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p1, p0}, Le2/q;->a(LO1/g;)LO1/g;

    move-result-object p1

    instance-of v0, p1, LO1/g;

    if-eqz v0, :cond_2

    move-object v2, p1

    goto :goto_0

    :cond_1
    sget-object v0, LO1/e;->b:LO1/e;

    if-ne v0, p1, :cond_2

    move-object v2, p0

    :cond_2
    :goto_0
    return-object v2
.end method

.method public abstract I(LO1/i;Ljava/lang/Runnable;)V
.end method

.method public J(LO1/i;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Le2/r;->I(LO1/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public K()Z
    .locals 1

    instance-of v0, p0, Le2/i0;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final i(LO1/h;)LO1/i;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Le2/q;

    sget-object v2, LO1/j;->b:LO1/j;

    if-eqz v1, :cond_2

    check-cast p1, Le2/q;

    iget-object v1, p0, LO1/a;->b:LO1/h;

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq v1, p1, :cond_0

    iget-object v0, p1, Le2/q;->c:LO1/h;

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p1, p0}, Le2/q;->a(LO1/g;)LO1/g;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, p0

    goto :goto_0

    :cond_2
    sget-object v0, LO1/e;->b:LO1/e;

    if-ne v0, p1, :cond_1

    :goto_0
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Le2/v;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
