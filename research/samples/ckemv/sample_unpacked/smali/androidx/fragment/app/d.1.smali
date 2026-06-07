.class public final Landroidx/fragment/app/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroidx/fragment/app/e;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/fragment/app/d;->a:Landroid/view/ViewGroup;

    iput-object p1, p0, Landroidx/fragment/app/d;->b:Landroid/view/View;

    iput-object p3, p0, Landroidx/fragment/app/d;->c:Landroidx/fragment/app/e;

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    new-instance p1, LF0/h;

    const/16 v0, 0x8

    invoke-direct {p1, v0, p0}, LF0/h;-><init>(ILjava/lang/Object;)V

    iget-object v0, p0, Landroidx/fragment/app/d;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
