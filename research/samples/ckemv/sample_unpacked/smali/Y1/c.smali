.class public final LY1/c;
.super LY1/a;
.source "SourceFile"


# instance fields
.field public final d:LY1/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LY1/e;-><init>()V

    new-instance v0, LY1/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY1/b;-><init>(I)V

    iput-object v0, p0, LY1/c;->d:LY1/b;

    return-void
.end method


# virtual methods
.method public final d()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, LY1/c;->d:LY1/b;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
