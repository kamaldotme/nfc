.class public final Landroidx/fragment/app/q;
.super Lv0/f;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/P;
.implements Landroidx/activity/v;
.implements Landroidx/activity/result/h;
.implements Landroidx/fragment/app/E;


# instance fields
.field public final d:Landroid/app/Activity;

.field public final e:Landroid/content/Context;

.field public final f:Landroid/os/Handler;

.field public final g:Landroidx/fragment/app/B;

.field public final synthetic h:Lf/g;


# direct methods
.method public constructor <init>(Lxyz/happify/ckemv/MainActivity;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/q;->h:Lf/g;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Landroidx/fragment/app/B;

    invoke-direct {v1}, Landroidx/fragment/app/B;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    iput-object p1, p0, Landroidx/fragment/app/q;->d:Landroid/app/Activity;

    iput-object p1, p0, Landroidx/fragment/app/q;->e:Landroid/content/Context;

    iput-object v0, p0, Landroidx/fragment/app/q;->f:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final C(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q;->h:Lf/g;

    invoke-virtual {v0, p1}, Lf/g;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final F()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q;->h:Lf/g;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final c()Landroidx/lifecycle/O;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q;->h:Lf/g;

    invoke-virtual {v0}, Landroidx/activity/k;->c()Landroidx/lifecycle/O;

    move-result-object v0

    return-object v0
.end method

.method public final d()Landroidx/lifecycle/t;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q;->h:Lf/g;

    iget-object v0, v0, Lf/g;->s:Landroidx/lifecycle/t;

    return-object v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q;->h:Lf/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
