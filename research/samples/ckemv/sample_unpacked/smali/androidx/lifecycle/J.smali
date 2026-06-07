.class public final Landroidx/lifecycle/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/c;


# instance fields
.field public final a:Ld0/d;

.field public b:Z

.field public c:Landroid/os/Bundle;

.field public final d:LK1/f;


# direct methods
.method public constructor <init>(Ld0/d;Lf/g;)V
    .locals 1

    const-string v0, "savedStateRegistry"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/J;->a:Ld0/d;

    new-instance p1, La0/l;

    const/4 v0, 0x1

    invoke-direct {p1, v0, p2}, La0/l;-><init>(ILjava/lang/Object;)V

    new-instance p2, LK1/f;

    invoke-direct {p2, p1}, LK1/f;-><init>(LW1/a;)V

    iput-object p2, p0, Landroidx/lifecycle/J;->d:LK1/f;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Landroidx/lifecycle/J;->c:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/J;->d:LK1/f;

    invoke-virtual {v1}, LK1/f;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/K;

    iget-object v1, v1, Landroidx/lifecycle/K;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/lifecycle/J;->b:Z

    return-object v0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0
.end method
