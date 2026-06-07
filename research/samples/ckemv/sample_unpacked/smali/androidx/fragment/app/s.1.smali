.class public final Landroidx/fragment/app/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic b:Landroidx/fragment/app/G;

.field public final synthetic c:Landroidx/fragment/app/t;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/t;Landroidx/fragment/app/G;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/t;

    iput-object p2, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/G;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/G;

    iget-object v0, p1, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    invoke-virtual {p1}, Landroidx/fragment/app/G;->k()V

    iget-object p1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/t;

    iget-object v0, v0, Landroidx/fragment/app/t;->b:Landroidx/fragment/app/B;

    invoke-virtual {v0}, Landroidx/fragment/app/B;->C()LU0/e;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/fragment/app/g;->g(Landroid/view/ViewGroup;LU0/e;)Landroidx/fragment/app/g;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/g;->f()V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
