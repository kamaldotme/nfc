.class public final Landroidx/activity/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:LL1/i;

.field public c:Landroidx/fragment/app/v;

.field public final d:Landroid/window/OnBackInvokedCallback;

.field public e:Landroid/window/OnBackInvokedDispatcher;

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/u;->a:Ljava/lang/Runnable;

    new-instance p1, LL1/i;

    invoke-direct {p1}, LL1/i;-><init>()V

    iput-object p1, p0, Landroidx/activity/u;->b:LL1/i;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_1

    const/16 v0, 0x22

    if-lt p1, v0, :cond_0

    sget-object p1, Landroidx/activity/r;->a:Landroidx/activity/r;

    new-instance v0, Landroidx/activity/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/activity/m;-><init>(Landroidx/activity/u;I)V

    new-instance v1, Landroidx/activity/m;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Landroidx/activity/m;-><init>(Landroidx/activity/u;I)V

    new-instance v2, Landroidx/activity/n;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Landroidx/activity/n;-><init>(Landroidx/activity/u;I)V

    new-instance v3, Landroidx/activity/n;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, Landroidx/activity/n;-><init>(Landroidx/activity/u;I)V

    invoke-virtual {p1, v0, v1, v2, v3}, Landroidx/activity/r;->a(LW1/l;LW1/l;LW1/a;LW1/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/activity/p;->a:Landroidx/activity/p;

    new-instance v0, Landroidx/activity/n;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Landroidx/activity/n;-><init>(Landroidx/activity/u;I)V

    invoke-virtual {p1, v0}, Landroidx/activity/p;->a(LW1/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Landroidx/activity/u;->d:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/r;Landroidx/fragment/app/v;)V
    .locals 9

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    move-result-object p1

    iget-object v0, p1, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/m;->b:Landroidx/lifecycle/m;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;

    invoke-direct {v0, p0, p1, p2}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;-><init>(Landroidx/activity/u;Landroidx/lifecycle/t;Landroidx/fragment/app/v;)V

    iget-object p1, p2, Landroidx/fragment/app/v;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroidx/activity/u;->d()V

    new-instance p1, Landroidx/activity/t;

    const-class v4, Landroidx/activity/u;

    const-string v5, "updateEnabledCallbacks"

    const/4 v2, 0x0

    const-string v6, "updateEnabledCallbacks()V"

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    move-object v3, p0

    invoke-direct/range {v1 .. v8}, Landroidx/activity/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iput-object p1, p2, Landroidx/fragment/app/v;->c:LW1/a;

    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Landroidx/activity/u;->b:LL1/i;

    invoke-virtual {v0}, LL1/i;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroidx/fragment/app/v;

    iget-boolean v3, v3, Landroidx/fragment/app/v;->a:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Landroidx/fragment/app/v;

    iput-object v2, p0, Landroidx/activity/u;->c:Landroidx/fragment/app/v;

    if-eqz v1, :cond_3

    const/4 v0, 0x1

    iget-object v1, v1, Landroidx/fragment/app/v;->d:Landroidx/fragment/app/B;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/B;->w(Z)Z

    iget-object v0, v1, Landroidx/fragment/app/B;->h:Landroidx/fragment/app/v;

    iget-boolean v0, v0, Landroidx/fragment/app/v;->a:Z

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Landroidx/fragment/app/B;->J()Z

    goto :goto_1

    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/B;->g:Landroidx/activity/u;

    invoke-virtual {v0}, Landroidx/activity/u;->b()V

    :goto_1
    return-void

    :cond_3
    iget-object v0, p0, Landroidx/activity/u;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_4
    return-void
.end method

.method public final c(Z)V
    .locals 5

    iget-object v0, p0, Landroidx/activity/u;->e:Landroid/window/OnBackInvokedDispatcher;

    iget-object v1, p0, Landroidx/activity/u;->d:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    sget-object v3, Landroidx/activity/p;->a:Landroidx/activity/p;

    if-eqz p1, :cond_0

    iget-boolean v4, p0, Landroidx/activity/u;->f:Z

    if-nez v4, :cond_0

    invoke-virtual {v3, v0, v2, v1}, Landroidx/activity/p;->b(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/activity/u;->f:Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Landroidx/activity/u;->f:Z

    if-eqz p1, :cond_1

    invoke-virtual {v3, v0, v1}, Landroidx/activity/p;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/activity/u;->f:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 4

    iget-boolean v0, p0, Landroidx/activity/u;->g:Z

    iget-object v1, p0, Landroidx/activity/u;->b:LL1/i;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LL1/i;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/v;

    iget-boolean v2, v2, Landroidx/fragment/app/v;->a:Z

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    :cond_2
    :goto_0
    iput-boolean v3, p0, Landroidx/activity/u;->g:Z

    if-eq v3, v0, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_3

    invoke-virtual {p0, v3}, Landroidx/activity/u;->c(Z)V

    :cond_3
    return-void
.end method
