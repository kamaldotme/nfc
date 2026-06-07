.class public final LO1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/i;
.implements Ljava/io/Serializable;


# static fields
.field public static final b:LO1/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO1/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LO1/j;->b:LO1/j;

    return-void
.end method


# virtual methods
.method public final A(LO1/h;)LO1/g;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final D(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final i(LO1/h;)LO1/i;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final o(LO1/i;)LO1/i;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyCoroutineContext"

    return-object v0
.end method
