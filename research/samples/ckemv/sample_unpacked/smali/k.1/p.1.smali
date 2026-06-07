.class public Lk/p;
.super Landroid/widget/Button;
.source "SourceFile"


# instance fields
.field public final b:Lk/o;

.field public final c:Lk/Z;

.field public d:Lk/w;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, Lk/d1;->a(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lk/c1;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lk/o;

    invoke-direct {p1, p0}, Lk/o;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lk/p;->b:Lk/o;

    invoke-virtual {p1, p2, p3}, Lk/o;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Lk/Z;

    invoke-direct {p1, p0}, Lk/Z;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lk/p;->c:Lk/Z;

    invoke-virtual {p1, p2, p3}, Lk/Z;->f(Landroid/util/AttributeSet;I)V

    invoke-virtual {p1}, Lk/Z;->b()V

    invoke-direct {p0}, Lk/p;->getEmojiTextViewHelper()Lk/w;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lk/w;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()Lk/w;
    .locals 1

    iget-object v0, p0, Lk/p;->d:Lk/w;

    if-nez v0, :cond_0

    new-instance v0, Lk/w;

    invoke-direct {v0, p0}, Lk/w;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lk/p;->d:Lk/w;

    :cond_0
    iget-object v0, p0, Lk/p;->d:Lk/w;

    return-object v0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, Lk/p;->b:Lk/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk/o;->a()V

    :cond_0
    iget-object v0, p0, Lk/p;->c:Lk/Z;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lk/Z;->b()V

    :cond_1
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    sget-boolean v0, Lk/r1;->b:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lk/p;->c:Lk/Z;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lk/Z;->i:Lk/j0;

    iget v0, v0, Lk/j0;->e:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    sget-boolean v0, Lk/r1;->b:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lk/p;->c:Lk/Z;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lk/Z;->i:Lk/j0;

    iget v0, v0, Lk/j0;->d:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    sget-boolean v0, Lk/r1;->b:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lk/p;->c:Lk/Z;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lk/Z;->i:Lk/j0;

    iget v0, v0, Lk/j0;->c:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    sget-boolean v0, Lk/r1;->b:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lk/p;->c:Lk/Z;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lk/Z;->i:Lk/j0;

    iget-object v0, v0, Lk/j0;->f:[I

    return-object v0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget-boolean v0, Lk/r1;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Lk/p;->c:Lk/Z;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lk/Z;->i:Lk/j0;

    iget v0, v0, Lk/j0;->a:I

    return v0

    :cond_2
    return v1
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 2

    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    instance-of v1, v0, LN/t;

    if-eqz v1, :cond_0

    check-cast v0, LN/t;

    iget-object v0, v0, LN/t;->a:Landroid/view/ActionMode$Callback;

    :cond_0
    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lk/p;->b:Lk/o;

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

    iget-object v0, p0, Lk/p;->b:Lk/o;

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

    iget-object v0, p0, Lk/p;->c:Lk/Z;

    invoke-virtual {v0}, Lk/Z;->d()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lk/p;->c:Lk/Z;

    invoke-virtual {v0}, Lk/Z;->e()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    iget-object p1, p0, Lk/p;->c:Lk/Z;

    if-eqz p1, :cond_0

    sget-boolean p2, Lk/r1;->b:Z

    if-nez p2, :cond_0

    iget-object p1, p1, Lk/Z;->i:Lk/j0;

    invoke-virtual {p1}, Lk/j0;->a()V

    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, Lk/p;->c:Lk/Z;

    if-eqz p1, :cond_0

    sget-boolean p2, Lk/r1;->b:Z

    if-nez p2, :cond_0

    iget-object p1, p1, Lk/Z;->i:Lk/j0;

    invoke-virtual {p1}, Lk/j0;->f()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lk/j0;->a()V

    :cond_0
    return-void
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, Lk/p;->getEmojiTextViewHelper()Lk/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk/w;->b(Z)V

    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    sget-boolean v0, Lk/r1;->b:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk/p;->c:Lk/Z;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3, p4}, Lk/Z;->i(IIII)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 1

    sget-boolean v0, Lk/r1;->b:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk/p;->c:Lk/Z;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lk/Z;->j([II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 1

    sget-boolean v0, Lk/r1;->b:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk/p;->c:Lk/Z;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lk/Z;->k(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lk/p;->b:Lk/o;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lk/o;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lk/p;->b:Lk/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk/o;->f(I)V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p1, p0}, La/a;->N(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Lk/p;->getEmojiTextViewHelper()Lk/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk/w;->c(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, Lk/p;->getEmojiTextViewHelper()Lk/w;

    move-result-object v0

    iget-object v0, v0, Lk/w;->b:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Lu2/d;

    invoke-virtual {v0, p1}, Lu2/d;->m([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportAllCaps(Z)V
    .locals 1

    iget-object v0, p0, Lk/p;->c:Lk/Z;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lk/Z;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lk/p;->b:Lk/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk/o;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lk/p;->b:Lk/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk/o;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lk/p;->c:Lk/Z;

    invoke-virtual {v0, p1}, Lk/Z;->l(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Lk/Z;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lk/p;->c:Lk/Z;

    invoke-virtual {v0, p1}, Lk/Z;->m(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0}, Lk/Z;->b()V

    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lk/p;->c:Lk/Z;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lk/Z;->g(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public final setTextSize(IF)V
    .locals 2

    sget-boolean v0, Lk/r1;->b:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lk/p;->c:Lk/Z;

    if-eqz v1, :cond_1

    if-nez v0, :cond_1

    iget-object v0, v1, Lk/Z;->i:Lk/j0;

    invoke-virtual {v0}, Lk/j0;->f()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p1, p2}, Lk/j0;->g(IF)V

    :cond_1
    :goto_0
    return-void
.end method
