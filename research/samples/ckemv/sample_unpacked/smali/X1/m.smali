.class public abstract LX1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ILjava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_8

    instance-of v0, p1, LK1/a;

    if-eqz v0, :cond_7

    instance-of v0, p1, LX1/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LX1/e;

    invoke-interface {v0}, LX1/e;->g()I

    move-result v0

    goto :goto_0

    :cond_0
    instance-of v0, p1, LW1/a;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    instance-of v0, p1, LW1/l;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    instance-of v0, p1, LW1/p;

    if-eqz v0, :cond_3

    const/4 v0, 0x2

    goto :goto_0

    :cond_3
    instance-of v0, p1, LW1/q;

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lf0/b;

    if-eqz v0, :cond_5

    const/4 v0, 0x4

    goto :goto_0

    :cond_5
    instance-of v0, p1, LW1/s;

    if-eqz v0, :cond_6

    const/4 v0, 0x6

    goto :goto_0

    :cond_6
    const/4 v0, -0x1

    :goto_0
    if-ne v0, p0, :cond_7

    goto :goto_1

    :cond_7
    const-string v0, "kotlin.jvm.functions.Function"

    invoke-static {v0, p0}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be cast to "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    const-class p0, LX1/m;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, LX1/g;->g(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_1
    return-void
.end method
