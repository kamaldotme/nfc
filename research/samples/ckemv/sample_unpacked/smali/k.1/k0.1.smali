.class public final Lk/k0;
.super Landroid/widget/ToggleButton;
.source "SourceFile"


# instance fields
.field public final b:Lk/o;

.field public final c:Lk/Z;

.field public d:Lk/w;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x101004b

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lk/c1;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lk/o;

    invoke-direct {p1, p0}, Lk/o;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lk/k0;->b:Lk/o;

    invoke-virtual {p1, p2, v0}, Lk/o;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Lk/Z;

    invoke-direct {p1, p0}, Lk/Z;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lk/k0;->c:Lk/Z;

    invoke-virtual {p1, p2, v0}, Lk/Z;->f(Landroid/util/AttributeSet;I)V

    invoke-direct {p0}, Lk/k0;->getEmojiTextViewHelper()Lk/w;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lk/w;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()Lk/w;
    .locals 1

    iget-object v0, p0, Lk/k0;->d:Lk/w;

    if-nez v0, :cond_0

    new-instance v0, Lk/w;

    invoke-direct {v0, p0}, Lk/w;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lk/k0;->d:Lk/w;

    :cond_0
    iget-object v0, p0, Lk/k0;->d:Lk/w;

    return-object v0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/ToggleButton;->drawableStateChanged()V

    iget-object v0, p0, Lk/k0;->b:Lk/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk/o;->a()V

    :cond_0
    iget-object v0, p0, Lk/k0;->c:Lk/Z;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lk/Z;->b()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lk/k0;->b:Lk/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk/o;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lk/k0;->b:Lk/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk/o;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lk/k0;->c:Lk/Z;

    invoke-virtual {v0}, Lk/Z;->d()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lk/k0;->c:Lk/Z;

    invoke-virtual {v0}, Lk/Z;->e()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, Lk/k0;->getEmojiTextViewHelper()Lk/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk/w;->b(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lk/k0;->b:Lk/o;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lk/o;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lk/k0;->b:Lk/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk/o;->f(I)V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lk/k0;->c:Lk/Z;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lk/Z;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lk/k0;->c:Lk/Z;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lk/Z;->b()V

    :cond_0
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Lk/k0;->getEmojiTextViewHelper()Lk/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk/w;->c(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, Lk/k0;->getEmojiTextViewHelper()Lk/w;

    move-result-object v0

    iget-object v0, v0, Lk/w;->b:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Lu2/d;

    invoke-virtual {v0, p1}, Lu2/d;->m([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lk/k0;->b:Lk/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk/o;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lk/k0;->b:Lk/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk/o;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lk/k0;->c:Lk/Z;

    invoke-virtual {v0, p1}, Lk/Z;->l(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Lk/Z;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lk/k0;->c:Lk/Z;

    invoke-virtual {v0, p1}, Lk/Z;->m(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0}, Lk/Z;->b()V

    return-void
.end method
