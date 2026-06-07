.class public final LI0/d;
.super Lk/q;
.source "SourceFile"


# static fields
.field public static final A:[I

.field public static final B:[[I

.field public static final C:I

.field public static final z:[I


# instance fields
.field public final f:Ljava/util/LinkedHashSet;

.field public final g:Ljava/util/LinkedHashSet;

.field public h:Landroid/content/res/ColorStateList;

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Ljava/lang/CharSequence;

.field public m:Landroid/graphics/drawable/Drawable;

.field public n:Landroid/graphics/drawable/Drawable;

.field public o:Z

.field public p:Landroid/content/res/ColorStateList;

.field public q:Landroid/content/res/ColorStateList;

.field public r:Landroid/graphics/PorterDuff$Mode;

.field public s:I

.field public t:[I

.field public u:Z

.field public v:Ljava/lang/CharSequence;

.field public w:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field public final x:Lk0/f;

.field public final y:LI0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const v0, 0x7f0303aa

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LI0/d;->z:[I

    const v0, 0x7f0303a9

    filled-new-array {v0}, [I

    move-result-object v1

    sput-object v1, LI0/d;->A:[I

    const v1, 0x101009e

    filled-new-array {v1, v0}, [I

    move-result-object v0

    const v2, 0x10100a0

    filled-new-array {v1, v2}, [I

    move-result-object v3

    const v4, -0x10100a0

    filled-new-array {v1, v4}, [I

    move-result-object v1

    const v5, -0x101009e

    filled-new-array {v5, v2}, [I

    move-result-object v2

    filled-new-array {v5, v4}, [I

    move-result-object v4

    filled-new-array {v0, v3, v1, v2, v4}, [[I

    move-result-object v0

    sput-object v0, LI0/d;->B:[[I

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "drawable"

    const-string v2, "android"

    const-string v3, "btn_check_material_anim"

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    sput v0, LI0/d;->C:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 11

    const v6, 0x7f0300a0

    const v0, 0x7f110409

    invoke-static {p1, p2, v6, v0}, LZ0/a;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, v6}, Lk/q;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, LI0/d;->f:Ljava/util/LinkedHashSet;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, LI0/d;->g:Ljava/util/LinkedHashSet;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Lk0/f;

    invoke-direct {v0, p1}, Lk0/f;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v2, Lz/n;->a:Ljava/lang/ThreadLocal;

    const v2, 0x7f0700b2

    invoke-static {v1, v2, p1}, Lz/i;->a(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, v0, Lk0/g;->b:Landroid/graphics/drawable/Drawable;

    iget-object v1, v0, Lk0/f;->g:Lk0/c;

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    new-instance p1, Lk0/e;

    iget-object v1, v0, Lk0/g;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    invoke-direct {p1, v1}, Lk0/e;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    iput-object v0, p0, LI0/d;->x:Lk0/f;

    new-instance p1, LI0/a;

    invoke-direct {p1, p0}, LI0/a;-><init>(LI0/d;)V

    iput-object p1, p0, LI0/d;->y:LI0/a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0}, LN/c;->a(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LI0/d;->m:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, LI0/d;->getSuperButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, LI0/d;->p:Landroid/content/res/ColorStateList;

    const/4 v7, 0x0

    invoke-interface {p0, v7}, LN/v;->setSupportButtonTintList(Landroid/content/res/ColorStateList;)V

    sget-object v8, LA0/a;->m:[I

    const/4 v9, 0x0

    new-array v5, v9, [I

    const v10, 0x7f110409

    invoke-static {p1, p2, v6, v10}, LO0/k;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    move-object v0, p1

    move-object v1, p2

    move-object v2, v8

    move v3, v6

    move v4, v10

    invoke-static/range {v0 .. v5}, LO0/k;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    new-instance v0, Lv0/m;

    invoke-virtual {p1, p2, v8, v6, v10}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lv0/m;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lv0/m;->r(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, LI0/d;->n:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, LI0/d;->m:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const v1, 0x7f03021e

    invoke-static {p1, v1, v9}, Lu2/d;->A(Landroid/content/Context;IZ)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v9, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-virtual {p2, v2, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    sget v4, LI0/d;->C:I

    if-ne v1, v4, :cond_0

    if-nez v3, :cond_0

    invoke-super {p0, v7}, Lk/q;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    const v1, 0x7f0700b1

    invoke-static {p1, v1}, La/a;->s(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, LI0/d;->m:Landroid/graphics/drawable/Drawable;

    iput-boolean v2, p0, LI0/d;->o:Z

    iget-object v1, p0, LI0/d;->n:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_0

    const v1, 0x7f0700b3

    invoke-static {p1, v1}, La/a;->s(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, LI0/d;->n:Landroid/graphics/drawable/Drawable;

    :cond_0
    const/4 v1, 0x3

    invoke-static {p1, v0, v1}, Lu2/l;->n(Landroid/content/Context;Lv0/m;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, LI0/d;->q:Landroid/content/res/ColorStateList;

    const/4 p1, 0x4

    const/4 v1, -0x1

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v1}, LO0/k;->g(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    iput-object p1, p0, LI0/d;->r:Landroid/graphics/PorterDuff$Mode;

    const/16 p1, 0xa

    invoke-virtual {p2, p1, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, LI0/d;->i:Z

    const/4 p1, 0x6

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, LI0/d;->j:Z

    const/16 p1, 0x9

    invoke-virtual {p2, p1, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, LI0/d;->k:Z

    const/16 p1, 0x8

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, LI0/d;->l:Ljava/lang/CharSequence;

    const/4 p1, 0x7

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p2, p1, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    invoke-virtual {p0, p1}, LI0/d;->setCheckedState(I)V

    :cond_1
    invoke-virtual {v0}, Lv0/m;->J()V

    invoke-virtual {p0}, LI0/d;->a()V

    return-void
.end method

.method private getButtonStateDescription()Ljava/lang/String;
    .locals 2

    iget v0, p0, LI0/d;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100070

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100072

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100071

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;
    .locals 7

    iget-object v0, p0, LI0/d;->h:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    const v0, 0x7f0300df

    invoke-static {p0, v0}, Lu2/l;->l(Landroid/view/View;I)I

    move-result v0

    const v1, 0x7f0300e2

    invoke-static {p0, v1}, Lu2/l;->l(Landroid/view/View;I)I

    move-result v1

    const v2, 0x7f030108

    invoke-static {p0, v2}, Lu2/l;->l(Landroid/view/View;I)I

    move-result v2

    const v3, 0x7f0300f2

    invoke-static {p0, v3}, Lu2/l;->l(Landroid/view/View;I)I

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v2, v1, v4}, Lu2/l;->z(IIF)I

    move-result v1

    invoke-static {v2, v0, v4}, Lu2/l;->z(IIF)I

    move-result v0

    const v4, 0x3f0a3d71    # 0.54f

    invoke-static {v2, v3, v4}, Lu2/l;->z(IIF)I

    move-result v4

    const v5, 0x3ec28f5c    # 0.38f

    invoke-static {v2, v3, v5}, Lu2/l;->z(IIF)I

    move-result v6

    invoke-static {v2, v3, v5}, Lu2/l;->z(IIF)I

    move-result v2

    filled-new-array {v1, v0, v4, v6, v2}, [I

    move-result-object v0

    new-instance v1, Landroid/content/res/ColorStateList;

    sget-object v2, LI0/d;->B:[[I

    invoke-direct {v1, v2, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v1, p0, LI0/d;->h:Landroid/content/res/ColorStateList;

    :cond_0
    iget-object v0, p0, LI0/d;->h:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method private getSuperButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LI0/d;->p:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-super {p0}, Landroid/widget/CompoundButton;->getButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-super {p0}, Landroid/widget/CompoundButton;->getButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-interface {p0}, LN/v;->getSupportButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, LI0/d;->m:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, LI0/d;->p:Landroid/content/res/ColorStateList;

    invoke-static {p0}, LN/b;->b(Landroid/widget/CompoundButton;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move-object v0, v3

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v2, :cond_1

    invoke-static {v0, v2}, LB/b;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_1
    :goto_0
    iput-object v0, p0, LI0/d;->m:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, LI0/d;->n:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, LI0/d;->q:Landroid/content/res/ColorStateList;

    iget-object v2, p0, LI0/d;->r:Landroid/graphics/PorterDuff$Mode;

    if-nez v0, :cond_2

    move-object v0, v3

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v2, :cond_3

    invoke-static {v0, v2}, LB/b;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_3
    :goto_1
    iput-object v0, p0, LI0/d;->n:Landroid/graphics/drawable/Drawable;

    iget-boolean v0, p0, LI0/d;->o:Z

    if-nez v0, :cond_4

    goto/16 :goto_4

    :cond_4
    iget-object v0, p0, LI0/d;->x:Lk0/f;

    if-eqz v0, :cond_f

    iget-object v1, v0, Lk0/g;->b:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, LI0/d;->y:LI0/a;

    if-eqz v1, :cond_6

    check-cast v1, Landroid/graphics/drawable/AnimatedVectorDrawable;

    iget-object v4, v2, LI0/a;->a:Lk0/b;

    if-nez v4, :cond_5

    new-instance v4, Lk0/b;

    invoke-direct {v4, v2}, Lk0/b;-><init>(LI0/a;)V

    iput-object v4, v2, LI0/a;->a:Lk0/b;

    :cond_5
    iget-object v4, v2, LI0/a;->a:Lk0/b;

    invoke-virtual {v1, v4}, Landroid/graphics/drawable/AnimatedVectorDrawable;->unregisterAnimationCallback(Landroid/graphics/drawable/Animatable2$AnimationCallback;)Z

    :cond_6
    iget-object v1, v0, Lk0/f;->f:Ljava/util/ArrayList;

    iget-object v4, v0, Lk0/f;->c:Lk0/d;

    if-eqz v1, :cond_8

    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v1, v0, Lk0/f;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, v0, Lk0/f;->e:LD0/a;

    if-eqz v1, :cond_8

    iget-object v5, v4, Lk0/d;->b:Landroid/animation/AnimatorSet;

    invoke-virtual {v5, v1}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    iput-object v3, v0, Lk0/f;->e:LD0/a;

    :cond_8
    :goto_2
    iget-object v1, v0, Lk0/g;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_a

    check-cast v1, Landroid/graphics/drawable/AnimatedVectorDrawable;

    iget-object v3, v2, LI0/a;->a:Lk0/b;

    if-nez v3, :cond_9

    new-instance v3, Lk0/b;

    invoke-direct {v3, v2}, Lk0/b;-><init>(LI0/a;)V

    iput-object v3, v2, LI0/a;->a:Lk0/b;

    :cond_9
    iget-object v2, v2, LI0/a;->a:Lk0/b;

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/AnimatedVectorDrawable;->registerAnimationCallback(Landroid/graphics/drawable/Animatable2$AnimationCallback;)V

    goto :goto_3

    :cond_a
    if-nez v2, :cond_b

    goto :goto_3

    :cond_b
    iget-object v1, v0, Lk0/f;->f:Ljava/util/ArrayList;

    if-nez v1, :cond_c

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lk0/f;->f:Ljava/util/ArrayList;

    :cond_c
    iget-object v1, v0, Lk0/f;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_3

    :cond_d
    iget-object v1, v0, Lk0/f;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lk0/f;->e:LD0/a;

    if-nez v1, :cond_e

    new-instance v1, LD0/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2, v0}, LD0/a;-><init>(ILjava/lang/Object;)V

    iput-object v1, v0, Lk0/f;->e:LD0/a;

    :cond_e
    iget-object v1, v4, Lk0/d;->b:Landroid/animation/AnimatorSet;

    iget-object v2, v0, Lk0/f;->e:LD0/a;

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_f
    :goto_3
    iget-object v1, p0, LI0/d;->m:Landroid/graphics/drawable/Drawable;

    instance-of v2, v1, Landroid/graphics/drawable/AnimatedStateListDrawable;

    if-eqz v2, :cond_10

    if-eqz v0, :cond_10

    check-cast v1, Landroid/graphics/drawable/AnimatedStateListDrawable;

    const v2, 0x7f080062

    const v3, 0x7f0801b0

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/graphics/drawable/AnimatedStateListDrawable;->addTransition(IILandroid/graphics/drawable/Drawable;Z)V

    iget-object v1, p0, LI0/d;->m:Landroid/graphics/drawable/Drawable;

    check-cast v1, Landroid/graphics/drawable/AnimatedStateListDrawable;

    const v2, 0x7f0800c2

    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/graphics/drawable/AnimatedStateListDrawable;->addTransition(IILandroid/graphics/drawable/Drawable;Z)V

    :cond_10
    :goto_4
    iget-object v0, p0, LI0/d;->m:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_11

    iget-object v1, p0, LI0/d;->p:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_11

    invoke-static {v0, v1}, LB/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_11
    iget-object v0, p0, LI0/d;->n:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_12

    iget-object v1, p0, LI0/d;->q:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_12

    invoke-static {v0, v1}, LB/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_12
    iget-object v0, p0, LI0/d;->m:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, LI0/d;->n:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_13

    move-object v0, v1

    goto :goto_8

    :cond_13
    if-nez v1, :cond_14

    goto :goto_8

    :cond_14
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_15

    goto :goto_5

    :cond_15
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    :goto_5
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    if-eq v4, v3, :cond_16

    goto :goto_6

    :cond_16
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    :goto_6
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    if-gt v2, v3, :cond_17

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    if-gt v4, v3, :cond_17

    goto :goto_7

    :cond_17
    int-to-float v2, v2

    int-to-float v3, v4

    div-float/2addr v2, v3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    cmpl-float v3, v2, v3

    if-ltz v3, :cond_18

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v4, v3

    div-float/2addr v4, v2

    float-to-int v4, v4

    move v2, v3

    goto :goto_7

    :cond_18
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    int-to-float v3, v4

    mul-float/2addr v2, v3

    float-to-int v2, v2

    :goto_7
    new-instance v3, Landroid/graphics/drawable/LayerDrawable;

    filled-new-array {v0, v1}, [Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0, v2, v4}, Landroid/graphics/drawable/LayerDrawable;->setLayerSize(III)V

    const/16 v1, 0x11

    invoke-virtual {v3, v0, v1}, Landroid/graphics/drawable/LayerDrawable;->setLayerGravity(II)V

    move-object v0, v3

    :goto_8
    invoke-super {p0, v0}, Lk/q;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    return-void
.end method

.method public getButtonDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, LI0/d;->m:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getButtonIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, LI0/d;->n:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getButtonIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LI0/d;->q:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getButtonIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, LI0/d;->r:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LI0/d;->p:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getCheckedState()I
    .locals 1

    iget v0, p0, LI0/d;->s:I

    return v0
.end method

.method public getErrorAccessibilityLabel()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LI0/d;->l:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final isChecked()Z
    .locals 2

    iget v0, p0, LI0/d;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-boolean v0, p0, LI0/d;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LI0/d;->p:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    iget-object v0, p0, LI0/d;->q:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LI0/d;->setUseMaterialThemeColors(Z)V

    :cond_0
    return-void
.end method

.method public final onCreateDrawableState(I)[I
    .locals 3

    const/4 v0, 0x2

    add-int/2addr p1, v0

    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    move-result-object p1

    invoke-virtual {p0}, LI0/d;->getCheckedState()I

    move-result v1

    if-ne v1, v0, :cond_0

    sget-object v0, LI0/d;->z:[I

    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    :cond_0
    iget-boolean v0, p0, LI0/d;->k:Z

    if-eqz v0, :cond_1

    sget-object v0, LI0/d;->A:[I

    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    :cond_1
    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    const v2, 0x10100a0

    if-ge v0, v1, :cond_4

    aget v1, p1, v0

    if-ne v1, v2, :cond_2

    move-object v1, p1

    goto :goto_1

    :cond_2
    if-nez v1, :cond_3

    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    aput v2, v1, v0

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    array-length v0, p1

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    array-length v0, p1

    aput v2, v1, v0

    :goto_1
    iput-object v1, p0, LI0/d;->t:[I

    return-object p1
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    iget-boolean v0, p0, LI0/d;->j:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, LN/c;->a(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, LO0/k;->e(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    mul-int/2addr v2, v1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    int-to-float v3, v2

    const/4 v4, 0x0

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v1, p1, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    iget v3, p1, Landroid/graphics/Rect;->top:I

    iget v4, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v2

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    invoke-static {v0, v1, v3, v4, p1}, LB/b;->f(Landroid/graphics/drawable/Drawable;IIII)V

    :cond_1
    return-void

    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, LI0/d;->k:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI0/d;->l:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, LI0/c;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, LI0/c;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget p1, p1, LI0/c;->b:I

    invoke-virtual {p0, p1}, LI0/d;->setCheckedState(I)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, LI0/c;

    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {p0}, LI0/d;->getCheckedState()I

    move-result v0

    iput v0, v1, LI0/c;->b:I

    return-object v1
.end method

.method public setButtonDrawable(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, La/a;->s(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, LI0/d;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 2
    iput-object p1, p0, LI0/d;->m:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, LI0/d;->o:Z

    .line 4
    invoke-virtual {p0}, LI0/d;->a()V

    return-void
.end method

.method public setButtonIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, LI0/d;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, LI0/d;->a()V

    return-void
.end method

.method public setButtonIconDrawableResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, La/a;->s(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, LI0/d;->setButtonIconDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LI0/d;->q:Landroid/content/res/ColorStateList;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, LI0/d;->q:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, LI0/d;->a()V

    return-void
.end method

.method public setButtonIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, LI0/d;->r:Landroid/graphics/PorterDuff$Mode;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, LI0/d;->r:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, LI0/d;->a()V

    return-void
.end method

.method public setButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LI0/d;->p:Landroid/content/res/ColorStateList;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, LI0/d;->p:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, LI0/d;->a()V

    return-void
.end method

.method public setButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-interface {p0, p1}, LN/v;->setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0}, LI0/d;->a()V

    return-void
.end method

.method public setCenterIfNoTextEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, LI0/d;->j:Z

    return-void
.end method

.method public setChecked(Z)V
    .locals 0

    invoke-virtual {p0, p1}, LI0/d;->setCheckedState(I)V

    return-void
.end method

.method public setCheckedState(I)V
    .locals 3

    iget v0, p0, LI0/d;->s:I

    if-eq v0, p1, :cond_7

    iput p1, p0, LI0/d;->s:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt p1, v2, :cond_1

    iget-object p1, p0, LI0/d;->v:Ljava/lang/CharSequence;

    if-nez p1, :cond_1

    invoke-direct {p0}, LI0/d;->getButtonStateDescription()Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setStateDescription(Ljava/lang/CharSequence;)V

    :cond_1
    iget-boolean p1, p0, LI0/d;->u:Z

    if-eqz p1, :cond_2

    return-void

    :cond_2
    iput-boolean v1, p0, LI0/d;->u:Z

    iget-object p1, p0, LI0/d;->g:Ljava/util/LinkedHashSet;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_4
    :goto_1
    iget p1, p0, LI0/d;->s:I

    const/4 v1, 0x2

    if-eq p1, v1, :cond_5

    iget-object p1, p0, LI0/d;->w:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    if-eqz p1, :cond_5

    invoke-virtual {p0}, LI0/d;->isChecked()Z

    move-result v1

    invoke-interface {p1, p0, v1}, Landroid/widget/CompoundButton$OnCheckedChangeListener;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-class v1, Landroid/view/autofill/AutofillManager;

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/autofill/AutofillManager;

    if-eqz p1, :cond_6

    invoke-virtual {p1, p0}, Landroid/view/autofill/AutofillManager;->notifyValueChanged(Landroid/view/View;)V

    :cond_6
    iput-boolean v0, p0, LI0/d;->u:Z

    :cond_7
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public setErrorAccessibilityLabel(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, LI0/d;->l:Ljava/lang/CharSequence;

    return-void
.end method

.method public setErrorAccessibilityLabelResource(I)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, LI0/d;->setErrorAccessibilityLabel(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setErrorShown(Z)V
    .locals 1

    iget-boolean v0, p0, LI0/d;->k:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, LI0/d;->k:Z

    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    iget-object p1, p0, LI0/d;->f:Ljava/util/LinkedHashSet;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .locals 0

    iput-object p1, p0, LI0/d;->w:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method public setStateDescription(Ljava/lang/CharSequence;)V
    .locals 2

    iput-object p1, p0, LI0/d;->v:Ljava/lang/CharSequence;

    if-nez p1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    if-nez p1, :cond_1

    invoke-direct {p0}, LI0/d;->getButtonStateDescription()Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setStateDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setStateDescription(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setUseMaterialThemeColors(Z)V
    .locals 0

    iput-boolean p1, p0, LI0/d;->i:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, LI0/d;->getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {p0, p1}, LN/b;->c(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-static {p0, p1}, LN/b;->c(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    :goto_0
    return-void
.end method

.method public final toggle()V
    .locals 1

    invoke-virtual {p0}, LI0/d;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, LI0/d;->setChecked(Z)V

    return-void
.end method
