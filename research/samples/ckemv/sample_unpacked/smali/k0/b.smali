.class public final Lk0/b;
.super Landroid/graphics/drawable/Animatable2$AnimationCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:LI0/a;


# direct methods
.method public constructor <init>(LI0/a;)V
    .locals 0

    iput-object p1, p0, Lk0/b;->a:LI0/a;

    invoke-direct {p0}, Landroid/graphics/drawable/Animatable2$AnimationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lk0/b;->a:LI0/a;

    iget-object v0, v0, LI0/a;->b:LI0/d;

    iget-object v0, v0, LI0/d;->p:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, LB/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public final onAnimationStart(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    iget-object v0, p0, Lk0/b;->a:LI0/a;

    iget-object v0, v0, LI0/a;->b:LI0/d;

    iget-object v1, v0, LI0/d;->p:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_0

    iget-object v0, v0, LI0/d;->t:[I

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    invoke-static {p1, v0}, LB/b;->g(Landroid/graphics/drawable/Drawable;I)V

    :cond_0
    return-void
.end method
