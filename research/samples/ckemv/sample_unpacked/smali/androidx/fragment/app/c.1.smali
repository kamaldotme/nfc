.class public final Landroidx/fragment/app/c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:Landroidx/fragment/app/T;

.field public final synthetic e:Landroidx/fragment/app/e;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/T;Landroidx/fragment/app/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/c;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, Landroidx/fragment/app/c;->b:Landroid/view/View;

    iput-boolean p3, p0, Landroidx/fragment/app/c;->c:Z

    iput-object p4, p0, Landroidx/fragment/app/c;->d:Landroidx/fragment/app/T;

    iput-object p5, p0, Landroidx/fragment/app/c;->e:Landroidx/fragment/app/e;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/c;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/fragment/app/c;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-boolean p1, p0, Landroidx/fragment/app/c;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/c;->d:Landroidx/fragment/app/T;

    iget p1, p1, Landroidx/fragment/app/T;->a:I

    invoke-static {v0, p1}, LX/d;->a(Landroid/view/View;I)V

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/c;->e:Landroidx/fragment/app/e;

    invoke-virtual {p1}, LA1/f;->d()V

    return-void
.end method
