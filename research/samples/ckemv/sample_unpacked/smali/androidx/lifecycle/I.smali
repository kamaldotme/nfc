.class public abstract Landroidx/lifecycle/I;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/lifecycle/N;

.field public static final b:Landroidx/lifecycle/N;

.field public static final c:Landroidx/lifecycle/N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/N;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/I;->a:Landroidx/lifecycle/N;

    new-instance v0, Landroidx/lifecycle/N;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/I;->b:Landroidx/lifecycle/N;

    new-instance v0, Landroidx/lifecycle/N;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/I;->c:Landroidx/lifecycle/N;

    return-void
.end method

.method public static a(Landroid/app/Activity;Landroidx/lifecycle/l;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Landroidx/lifecycle/r;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/lifecycle/r;

    invoke-interface {p0}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    move-result-object p0

    instance-of v0, p0, Landroidx/lifecycle/t;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    :cond_0
    return-void
.end method

.method public static b(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    sget-object v0, Landroidx/lifecycle/F;->Companion:Landroidx/lifecycle/E;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroidx/lifecycle/F;

    invoke-direct {v0}, Landroidx/lifecycle/F;-><init>()V

    invoke-static {p0, v0}, LA/b;->j(Landroid/app/Activity;Landroidx/lifecycle/F;)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/G;

    invoke-direct {v2}, Landroid/app/Fragment;-><init>()V

    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    :cond_1
    return-void
.end method
