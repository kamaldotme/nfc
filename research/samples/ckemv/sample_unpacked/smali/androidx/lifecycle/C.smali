.class public final Landroidx/lifecycle/C;
.super Landroidx/lifecycle/f;
.source "SourceFile"


# instance fields
.field final synthetic this$0:Landroidx/lifecycle/D;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/D;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/C;->this$0:Landroidx/lifecycle/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string p2, "activity"

    invoke-static {p1, p2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-ge p2, v0, :cond_0

    sget p2, Landroidx/lifecycle/G;->c:I

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const-string p2, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {p1, p2}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment"

    invoke-static {p1, p2}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/lifecycle/G;

    iget-object p2, p0, Landroidx/lifecycle/C;->this$0:Landroidx/lifecycle/D;

    iget-object p2, p2, Landroidx/lifecycle/D;->i:LA/h;

    iput-object p2, p1, Landroidx/lifecycle/G;->b:LA/h;

    :cond_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/C;->this$0:Landroidx/lifecycle/D;

    iget v0, p1, Landroidx/lifecycle/D;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Landroidx/lifecycle/D;->c:I

    if-nez v0, :cond_0

    iget-object v0, p1, Landroidx/lifecycle/D;->f:Landroid/os/Handler;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object p1, p1, Landroidx/lifecycle/D;->h:LB2/u;

    const-wide/16 v1, 0x2bc

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string p2, "activity"

    invoke-static {p1, p2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Landroidx/lifecycle/B;

    iget-object v0, p0, Landroidx/lifecycle/C;->this$0:Landroidx/lifecycle/D;

    invoke-direct {p2, v0}, Landroidx/lifecycle/B;-><init>(Landroidx/lifecycle/D;)V

    invoke-static {p1, p2}, Landroidx/lifecycle/A;->a(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/C;->this$0:Landroidx/lifecycle/D;

    iget v0, p1, Landroidx/lifecycle/D;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Landroidx/lifecycle/D;->b:I

    if-nez v0, :cond_0

    iget-boolean v0, p1, Landroidx/lifecycle/D;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/lifecycle/D;->g:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/lifecycle/D;->e:Z

    :cond_0
    return-void
.end method
