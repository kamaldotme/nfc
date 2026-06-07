.class public final Lj/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public final a:Landroid/view/ActionProvider;

.field public final synthetic b:Lj/t;

.field public c:Lf/G;


# direct methods
.method public constructor <init>(Lj/t;Landroid/view/ActionProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/p;->b:Lj/t;

    iput-object p2, p0, Lj/p;->a:Landroid/view/ActionProvider;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lj/p;->a:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->isVisible()Z

    move-result v0

    return v0
.end method

.method public final b(Landroid/view/MenuItem;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lj/p;->a:Landroid/view/ActionProvider;

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lj/p;->a:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->overridesItemVisibility()Z

    move-result v0

    return v0
.end method

.method public final d(Lf/G;)V
    .locals 0

    iput-object p1, p0, Lj/p;->c:Lf/G;

    iget-object p1, p0, Lj/p;->a:Landroid/view/ActionProvider;

    invoke-virtual {p1, p0}, Landroid/view/ActionProvider;->setVisibilityListener(Landroid/view/ActionProvider$VisibilityListener;)V

    return-void
.end method

.method public final onActionProviderVisibilityChanged(Z)V
    .locals 1

    iget-object p1, p0, Lj/p;->c:Lf/G;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lf/G;->b:Ljava/lang/Object;

    check-cast p1, Lj/o;

    iget-object p1, p1, Lj/o;->n:Lj/m;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lj/m;->h:Z

    invoke-virtual {p1, v0}, Lj/m;->p(Z)V

    :cond_0
    return-void
.end method
