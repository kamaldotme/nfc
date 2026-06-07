.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field public final b:Landroid/util/SparseArray;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lr/e;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Z

.field public j:I

.field public k:Lt/k;

.field public l:Lv0/r;

.field public m:I

.field public n:Ljava/util/HashMap;

.field public final o:Landroid/util/SparseArray;

.field public final p:Lq1/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    .line 4
    new-instance p1, Lr/e;

    invoke-direct {p1}, Lr/e;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    .line 6
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    const v0, 0x7fffffff

    .line 7
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    .line 8
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    const/16 v0, 0x107

    .line 10
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lt/k;

    .line 12
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lv0/r;

    const/4 v0, -0x1

    .line 13
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    .line 15
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    .line 16
    new-instance v0, Lq1/a;

    invoke-direct {v0, p0}, Lq1/a;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lq1/a;

    .line 17
    invoke-virtual {p0, p2, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 18
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    .line 21
    new-instance p1, Lr/e;

    invoke-direct {p1}, Lr/e;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    const/4 p1, 0x0

    .line 22
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    .line 23
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    const p1, 0x7fffffff

    .line 24
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    .line 25
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    const/16 p1, 0x107

    .line 27
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lt/k;

    .line 29
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lv0/r;

    const/4 p1, -0x1

    .line 30
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    .line 31
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    .line 32
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    .line 33
    new-instance p1, Lq1/a;

    invoke-direct {p1, p0}, Lq1/a;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lq1/a;

    .line 34
    invoke-virtual {p0, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static a()Lt/d;
    .locals 7

    new-instance v0, Lt/d;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 v1, -0x1

    iput v1, v0, Lt/d;->a:I

    iput v1, v0, Lt/d;->b:I

    const/high16 v2, -0x40800000    # -1.0f

    iput v2, v0, Lt/d;->c:F

    iput v1, v0, Lt/d;->d:I

    iput v1, v0, Lt/d;->e:I

    iput v1, v0, Lt/d;->f:I

    iput v1, v0, Lt/d;->g:I

    iput v1, v0, Lt/d;->h:I

    iput v1, v0, Lt/d;->i:I

    iput v1, v0, Lt/d;->j:I

    iput v1, v0, Lt/d;->k:I

    iput v1, v0, Lt/d;->l:I

    iput v1, v0, Lt/d;->m:I

    const/4 v3, 0x0

    iput v3, v0, Lt/d;->n:I

    const/4 v4, 0x0

    iput v4, v0, Lt/d;->o:F

    iput v1, v0, Lt/d;->p:I

    iput v1, v0, Lt/d;->q:I

    iput v1, v0, Lt/d;->r:I

    iput v1, v0, Lt/d;->s:I

    iput v1, v0, Lt/d;->t:I

    iput v1, v0, Lt/d;->u:I

    iput v1, v0, Lt/d;->v:I

    iput v1, v0, Lt/d;->w:I

    iput v1, v0, Lt/d;->x:I

    iput v1, v0, Lt/d;->y:I

    const/high16 v4, 0x3f000000    # 0.5f

    iput v4, v0, Lt/d;->z:F

    iput v4, v0, Lt/d;->A:F

    const/4 v5, 0x0

    iput-object v5, v0, Lt/d;->B:Ljava/lang/String;

    const/4 v6, 0x1

    iput v6, v0, Lt/d;->C:I

    iput v2, v0, Lt/d;->D:F

    iput v2, v0, Lt/d;->E:F

    iput v3, v0, Lt/d;->F:I

    iput v3, v0, Lt/d;->G:I

    iput v3, v0, Lt/d;->H:I

    iput v3, v0, Lt/d;->I:I

    iput v3, v0, Lt/d;->J:I

    iput v3, v0, Lt/d;->K:I

    iput v3, v0, Lt/d;->L:I

    iput v3, v0, Lt/d;->M:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Lt/d;->N:F

    iput v2, v0, Lt/d;->O:F

    iput v1, v0, Lt/d;->P:I

    iput v1, v0, Lt/d;->Q:I

    iput v1, v0, Lt/d;->R:I

    iput-boolean v3, v0, Lt/d;->S:Z

    iput-boolean v3, v0, Lt/d;->T:Z

    iput-object v5, v0, Lt/d;->U:Ljava/lang/String;

    iput-boolean v6, v0, Lt/d;->V:Z

    iput-boolean v6, v0, Lt/d;->W:Z

    iput-boolean v3, v0, Lt/d;->X:Z

    iput-boolean v3, v0, Lt/d;->Y:Z

    iput-boolean v3, v0, Lt/d;->Z:Z

    iput v1, v0, Lt/d;->a0:I

    iput v1, v0, Lt/d;->b0:I

    iput v1, v0, Lt/d;->c0:I

    iput v1, v0, Lt/d;->d0:I

    iput v1, v0, Lt/d;->e0:I

    iput v1, v0, Lt/d;->f0:I

    iput v4, v0, Lt/d;->g0:F

    new-instance v1, Lr/d;

    invoke-direct {v1}, Lr/d;-><init>()V

    iput-object v1, v0, Lt/d;->k0:Lr/d;

    return-object v0
.end method

.method private getPaddingWidth()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    if-lez v1, :cond_0

    move v2, v1

    :cond_0
    return v2
.end method


# virtual methods
.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final b(Landroid/view/View;)Lr/d;
    .locals 0

    if-ne p1, p0, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Lt/d;

    iget-object p1, p1, Lt/d;->k0:Lr/d;

    :goto_0
    return-object p1
.end method

.method public final c(Landroid/util/AttributeSet;I)V
    .locals 7

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    iput-object p0, v0, Lr/d;->U:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lq1/a;

    iput-object v1, v0, Lr/e;->g0:Lq1/a;

    iget-object v2, v0, Lr/e;->f0:Ls/e;

    iput-object v1, v2, Ls/e;->f:Lq1/a;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lt/k;

    const/4 v2, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget-object v4, Lt/o;->b:[I

    invoke-virtual {v3, p1, v4, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    move v3, v2

    :goto_0
    if-ge v3, p2, :cond_7

    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v4

    const/16 v5, 0x9

    if-ne v4, v5, :cond_0

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    goto :goto_2

    :cond_0
    const/16 v5, 0xa

    if-ne v4, v5, :cond_1

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    goto :goto_2

    :cond_1
    const/4 v5, 0x7

    if-ne v4, v5, :cond_2

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    goto :goto_2

    :cond_2
    const/16 v5, 0x8

    if-ne v4, v5, :cond_3

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    goto :goto_2

    :cond_3
    const/16 v5, 0x59

    if-ne v4, v5, :cond_4

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    goto :goto_2

    :cond_4
    const/16 v5, 0x26

    if-ne v4, v5, :cond_5

    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-eqz v4, :cond_6

    :try_start_0
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lv0/r;

    goto :goto_2

    :cond_5
    const/16 v5, 0x12

    if-ne v4, v5, :cond_6

    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    :try_start_1
    new-instance v5, Lt/k;

    invoke-direct {v5}, Lt/k;-><init>()V

    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lt/k;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Lt/k;->e(Landroid/content/Context;I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lt/k;

    :goto_1
    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    :cond_6
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_8
    iget p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    iput p1, v0, Lr/e;->p0:I

    const/16 p2, 0x100

    and-int/2addr p1, p2

    if-ne p1, p2, :cond_9

    const/4 v2, 0x1

    :cond_9
    sput-boolean v2, Lq/e;->p:Z

    return-void
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Lt/d;

    return p1
.end method

.method public final d(I)V
    .locals 9

    new-instance v0, Lv0/r;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, v0, Lv0/r;->b:Ljava/lang/Object;

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, v0, Lv0/r;->c:Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-eq v2, v4, :cond_7

    if-eqz v2, :cond_5

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v7, 0x4

    const/4 v8, 0x3

    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v6, "Variant"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v8

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :catch_1
    move-exception p1

    goto/16 :goto_5

    :sswitch_1
    const-string v6, "layoutDescription"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_2

    :sswitch_2
    const-string v6, "StateSet"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_2

    :sswitch_3
    const-string v6, "State"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v5

    goto :goto_2

    :sswitch_4
    const-string v6, "ConstraintSet"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v7

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v2, -0x1

    :goto_2
    if-eqz v2, :cond_6

    if-eq v2, v4, :cond_6

    if-eq v2, v5, :cond_4

    if-eq v2, v8, :cond_3

    if-eq v2, v7, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v0, v1, p1}, Lv0/r;->y(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    goto :goto_3

    :cond_3
    new-instance v2, Lt/e;

    invoke-direct {v2, v1, p1}, Lt/e;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    if-eqz v3, :cond_6

    iget-object v4, v3, Lcom/google/android/material/datepicker/l;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-instance v3, Lcom/google/android/material/datepicker/l;

    invoke-direct {v3, v1, p1}, Lcom/google/android/material/datepicker/l;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    iget-object v2, v0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v2, Landroid/util/SparseArray;

    iget v4, v3, Lcom/google/android/material/datepicker/l;->b:I

    invoke-virtual {v2, v4, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :cond_6
    :goto_3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_6

    :goto_5
    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_7
    :goto_6
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lv0/r;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x50764adb -> :sswitch_4
        0x4c7d471 -> :sswitch_3
        0x526c4e31 -> :sswitch_2
        0x62ce7272 -> :sswitch_1
        0x7155a865 -> :sswitch_0
    .end sparse-switch
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v0, p0

    const/4 v1, 0x0

    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_0

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt/b;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    move v5, v1

    :goto_1
    if-ge v5, v2, :cond_3

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_2

    check-cast v6, Ljava/lang/String;

    const-string v7, ","

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x4

    if-ne v7, v8, :cond_2

    aget-object v7, v6, v1

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x1

    aget-object v8, v6, v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/4 v9, 0x2

    aget-object v9, v6, v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x3

    aget-object v6, v6, v10

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    int-to-float v7, v7

    const/high16 v10, 0x44870000    # 1080.0f

    div-float/2addr v7, v10

    mul-float/2addr v7, v3

    float-to-int v7, v7

    int-to-float v8, v8

    const/high16 v11, 0x44f00000    # 1920.0f

    div-float/2addr v8, v11

    mul-float/2addr v8, v4

    float-to-int v8, v8

    int-to-float v9, v9

    div-float/2addr v9, v10

    mul-float/2addr v9, v3

    float-to-int v9, v9

    int-to-float v6, v6

    div-float/2addr v6, v11

    mul-float/2addr v6, v4

    float-to-int v6, v6

    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v10, -0x10000

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v14, v7

    int-to-float v13, v8

    add-int/2addr v7, v9

    int-to-float v7, v7

    move-object/from16 v10, p1

    move v11, v14

    move v12, v13

    move v9, v13

    move v13, v7

    move/from16 v16, v14

    move v14, v9

    move-object/from16 v17, v15

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v8, v6

    int-to-float v6, v8

    move v11, v7

    move v12, v9

    move v14, v6

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v12, v6

    move/from16 v13, v16

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v11, v16

    move v14, v9

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const v8, -0xff0100

    invoke-virtual {v15, v8}, Landroid/graphics/Paint;->setColor(I)V

    move v12, v9

    move v13, v7

    move v14, v6

    move-object v8, v15

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v12, v6

    move v14, v9

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_3
    return-void
.end method

.method public final e(Lr/e;III)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    add-int v10, v7, v9

    invoke-direct/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingWidth()I

    move-result v11

    iget-object v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lq1/a;

    iput v7, v12, Lq1/a;->a:I

    iput v9, v12, Lq1/a;->b:I

    iput v11, v12, Lq1/a;->c:I

    iput v10, v12, Lq1/a;->d:I

    move/from16 v9, p3

    iput v9, v12, Lq1/a;->e:I

    move/from16 v9, p4

    iput v9, v12, Lq1/a;->f:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingStart()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v13

    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    const/4 v14, 0x1

    if-gtz v9, :cond_1

    if-lez v13, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v15

    iget v15, v15, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v16, 0x400000

    and-int v15, v15, v16

    if-eqz v15, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v15

    if-ne v14, v15, :cond_2

    move v9, v13

    :cond_2
    :goto_1
    sub-int/2addr v4, v11

    sub-int/2addr v6, v10

    iget v10, v12, Lq1/a;->d:I

    iget v11, v12, Lq1/a;->c:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v12

    const/high16 v15, 0x40000000    # 2.0f

    const/high16 v13, -0x80000000

    if-eq v3, v13, :cond_6

    if-eqz v3, :cond_4

    if-eq v3, v15, :cond_3

    move/from16 v17, v8

    goto :goto_4

    :cond_3
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int/2addr v14, v11

    invoke-static {v14, v4}, Ljava/lang/Math;->min(II)I

    move-result v14

    move/from16 v17, v14

    const/4 v14, 0x1

    goto :goto_4

    :cond_4
    if-nez v12, :cond_5

    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    :goto_2
    move/from16 v17, v14

    :goto_3
    const/4 v14, 0x2

    goto :goto_4

    :cond_5
    move/from16 v17, v8

    goto :goto_3

    :cond_6
    if-nez v12, :cond_7

    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    goto :goto_2

    :cond_7
    move/from16 v17, v4

    goto :goto_3

    :goto_4
    if-eq v5, v13, :cond_b

    if-eqz v5, :cond_9

    if-eq v5, v15, :cond_8

    move v13, v8

    :goto_5
    const/4 v12, 0x1

    goto :goto_8

    :cond_8
    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    sub-int/2addr v12, v10

    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    move-result v12

    move v13, v12

    goto :goto_5

    :cond_9
    if-nez v12, :cond_a

    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    :goto_6
    move v13, v12

    :goto_7
    const/4 v12, 0x2

    goto :goto_8

    :cond_a
    move v13, v8

    goto :goto_7

    :cond_b
    if-nez v12, :cond_c

    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    goto :goto_6

    :cond_c
    move v13, v6

    goto :goto_7

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v15

    iget-object v8, v1, Lr/e;->f0:Ls/e;

    move/from16 v19, v6

    move/from16 v6, v17

    if-ne v6, v15, :cond_d

    invoke-virtual/range {p1 .. p1}, Lr/d;->i()I

    move-result v15

    if-eq v13, v15, :cond_e

    :cond_d
    const/4 v15, 0x1

    goto :goto_a

    :cond_e
    :goto_9
    const/4 v15, 0x0

    goto :goto_b

    :goto_a
    iput-boolean v15, v8, Ls/e;->c:Z

    goto :goto_9

    :goto_b
    iput v15, v1, Lr/d;->N:I

    iput v15, v1, Lr/d;->O:I

    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int/2addr v15, v11

    move-object/from16 v17, v8

    iget-object v8, v1, Lr/d;->u:[I

    move/from16 v20, v4

    const/4 v4, 0x0

    aput v15, v8, v4

    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    sub-int/2addr v15, v10

    const/16 v18, 0x1

    aput v15, v8, v18

    iput v4, v1, Lr/d;->Q:I

    iput v4, v1, Lr/d;->R:I

    invoke-virtual {v1, v14}, Lr/d;->w(I)V

    invoke-virtual {v1, v6}, Lr/d;->y(I)V

    invoke-virtual {v1, v12}, Lr/d;->x(I)V

    invoke-virtual {v1, v13}, Lr/d;->v(I)V

    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    sub-int/2addr v6, v11

    if-gez v6, :cond_f

    iput v4, v1, Lr/d;->Q:I

    goto :goto_c

    :cond_f
    iput v6, v1, Lr/d;->Q:I

    :goto_c
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    sub-int/2addr v6, v10

    if-gez v6, :cond_10

    iput v4, v1, Lr/d;->R:I

    goto :goto_d

    :cond_10
    iput v6, v1, Lr/d;->R:I

    :goto_d
    iput v9, v1, Lr/e;->j0:I

    iput v7, v1, Lr/e;->k0:I

    iget-object v4, v1, Lr/e;->e0:Lv0/m;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v1, Lr/e;->g0:Lq1/a;

    iget-object v7, v1, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lr/d;->i()I

    move-result v10

    and-int/lit16 v11, v2, 0x80

    const/16 v12, 0x80

    if-ne v11, v12, :cond_11

    const/4 v11, 0x1

    goto :goto_e

    :cond_11
    const/4 v11, 0x0

    :goto_e
    if-nez v11, :cond_13

    const/16 v12, 0x40

    and-int/2addr v2, v12

    if-ne v2, v12, :cond_12

    goto :goto_f

    :cond_12
    const/4 v2, 0x0

    goto :goto_10

    :cond_13
    :goto_f
    const/4 v2, 0x1

    :goto_10
    const/4 v12, 0x3

    if-eqz v2, :cond_1c

    const/4 v13, 0x0

    :goto_11
    if-ge v13, v7, :cond_1c

    iget-object v14, v1, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lr/d;

    iget-object v15, v14, Lr/d;->c0:[I

    const/16 v18, 0x0

    aget v0, v15, v18

    if-ne v0, v12, :cond_14

    const/4 v0, 0x1

    :goto_12
    const/16 v21, 0x1

    goto :goto_13

    :cond_14
    const/4 v0, 0x0

    goto :goto_12

    :goto_13
    aget v15, v15, v21

    if-ne v15, v12, :cond_15

    const/4 v15, 0x1

    goto :goto_14

    :cond_15
    const/4 v15, 0x0

    :goto_14
    if-eqz v0, :cond_16

    if-eqz v15, :cond_16

    iget v0, v14, Lr/d;->L:F

    const/4 v15, 0x0

    cmpl-float v0, v0, v15

    if-lez v0, :cond_16

    const/4 v0, 0x1

    goto :goto_15

    :cond_16
    const/4 v0, 0x0

    :goto_15
    invoke-virtual {v14}, Lr/d;->q()Z

    move-result v15

    if-eqz v15, :cond_18

    if-eqz v0, :cond_18

    :cond_17
    :goto_16
    const/high16 v0, 0x40000000    # 2.0f

    const/4 v2, 0x0

    goto :goto_17

    :cond_18
    invoke-virtual {v14}, Lr/d;->r()Z

    move-result v15

    if-eqz v15, :cond_19

    if-eqz v0, :cond_19

    goto :goto_16

    :cond_19
    instance-of v0, v14, Lr/g;

    if-eqz v0, :cond_1a

    goto :goto_16

    :cond_1a
    invoke-virtual {v14}, Lr/d;->q()Z

    move-result v0

    if-nez v0, :cond_17

    invoke-virtual {v14}, Lr/d;->r()Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_16

    :cond_1b
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p0

    goto :goto_11

    :cond_1c
    const/high16 v0, 0x40000000    # 2.0f

    :goto_17
    if-ne v3, v0, :cond_1d

    if-eq v5, v0, :cond_1e

    :cond_1d
    if-eqz v11, :cond_1f

    :cond_1e
    const/4 v0, 0x1

    goto :goto_18

    :cond_1f
    const/4 v0, 0x0

    :goto_18
    and-int/2addr v0, v2

    if-eqz v0, :cond_3e

    const/4 v0, 0x0

    aget v13, v8, v0

    move/from16 v0, v20

    invoke-static {v13, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v13, 0x1

    aget v8, v8, v13

    move/from16 v14, v19

    invoke-static {v8, v14}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/high16 v14, 0x40000000    # 2.0f

    if-ne v3, v14, :cond_20

    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v15

    if-eq v15, v0, :cond_20

    invoke-virtual {v1, v0}, Lr/d;->y(I)V

    iget-object v0, v1, Lr/e;->f0:Ls/e;

    iput-boolean v13, v0, Ls/e;->b:Z

    :cond_20
    if-ne v5, v14, :cond_21

    invoke-virtual/range {p1 .. p1}, Lr/d;->i()I

    move-result v0

    if-eq v0, v8, :cond_21

    invoke-virtual {v1, v8}, Lr/d;->v(I)V

    iget-object v0, v1, Lr/e;->f0:Ls/e;

    iput-boolean v13, v0, Ls/e;->b:Z

    :cond_21
    if-ne v3, v14, :cond_37

    if-ne v5, v14, :cond_37

    and-int/lit8 v0, v11, 0x1

    move-object/from16 v8, v17

    iget-boolean v11, v8, Ls/e;->b:Z

    iget-object v13, v8, Ls/e;->a:Lr/e;

    if-nez v11, :cond_23

    iget-boolean v11, v8, Ls/e;->c:Z

    if-eqz v11, :cond_22

    goto :goto_19

    :cond_22
    const/4 v15, 0x0

    goto :goto_1b

    :cond_23
    :goto_19
    iget-object v11, v13, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_24

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lr/d;

    const/4 v15, 0x0

    iput-boolean v15, v14, Lr/d;->a:Z

    iget-object v12, v14, Lr/d;->d:Ls/j;

    invoke-virtual {v12}, Ls/j;->n()V

    iget-object v12, v14, Lr/d;->e:Ls/l;

    invoke-virtual {v12}, Ls/l;->m()V

    const/4 v12, 0x3

    goto :goto_1a

    :cond_24
    const/4 v15, 0x0

    iput-boolean v15, v13, Lr/d;->a:Z

    iget-object v11, v13, Lr/d;->d:Ls/j;

    invoke-virtual {v11}, Ls/j;->n()V

    iget-object v11, v13, Lr/d;->e:Ls/l;

    invoke-virtual {v11}, Ls/l;->m()V

    iput-boolean v15, v8, Ls/e;->c:Z

    :goto_1b
    iget-object v11, v8, Ls/e;->d:Lr/e;

    invoke-virtual {v8, v11}, Ls/e;->b(Lr/e;)V

    iput v15, v13, Lr/d;->N:I

    iput v15, v13, Lr/d;->O:I

    invoke-virtual {v13, v15}, Lr/d;->h(I)I

    move-result v11

    const/4 v12, 0x1

    invoke-virtual {v13, v12}, Lr/d;->h(I)I

    move-result v14

    iget-boolean v12, v8, Ls/e;->b:Z

    if-eqz v12, :cond_25

    invoke-virtual {v8}, Ls/e;->c()V

    :cond_25
    invoke-virtual {v13}, Lr/d;->m()I

    move-result v12

    invoke-virtual {v13}, Lr/d;->n()I

    move-result v15

    iget-object v2, v13, Lr/d;->d:Ls/j;

    move-object/from16 v19, v6

    iget-object v6, v2, Ls/m;->h:Ls/f;

    invoke-virtual {v6, v12}, Ls/f;->d(I)V

    iget-object v6, v13, Lr/d;->e:Ls/l;

    move/from16 v20, v9

    iget-object v9, v6, Ls/m;->h:Ls/f;

    invoke-virtual {v9, v15}, Ls/f;->d(I)V

    invoke-virtual {v8}, Ls/e;->g()V

    iget-object v9, v8, Ls/e;->e:Ljava/util/ArrayList;

    move/from16 v21, v10

    iget-object v10, v2, Ls/m;->e:Ls/g;

    move-object/from16 v22, v4

    iget-object v4, v6, Ls/m;->e:Ls/g;

    move/from16 v23, v7

    const/4 v7, 0x2

    if-eq v11, v7, :cond_28

    if-ne v14, v7, :cond_26

    goto :goto_1c

    :cond_26
    move/from16 v24, v5

    :cond_27
    const/4 v0, 0x1

    goto :goto_1e

    :cond_28
    :goto_1c
    if-eqz v0, :cond_2a

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_29
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_2a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Ls/m;

    invoke-virtual/range {v24 .. v24}, Ls/m;->k()Z

    move-result v24

    if-nez v24, :cond_29

    const/4 v0, 0x0

    :cond_2a
    if-eqz v0, :cond_2b

    const/4 v7, 0x2

    if-ne v11, v7, :cond_2b

    const/4 v7, 0x1

    invoke-virtual {v13, v7}, Lr/d;->w(I)V

    move/from16 v24, v5

    const/4 v7, 0x0

    invoke-virtual {v8, v13, v7}, Ls/e;->d(Lr/e;I)I

    move-result v5

    invoke-virtual {v13, v5}, Lr/d;->y(I)V

    invoke-virtual {v13}, Lr/d;->l()I

    move-result v5

    invoke-virtual {v10, v5}, Ls/g;->d(I)V

    goto :goto_1d

    :cond_2b
    move/from16 v24, v5

    :goto_1d
    if-eqz v0, :cond_27

    const/4 v0, 0x2

    if-ne v14, v0, :cond_27

    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lr/d;->x(I)V

    invoke-virtual {v8, v13, v0}, Ls/e;->d(Lr/e;I)I

    move-result v5

    invoke-virtual {v13, v5}, Lr/d;->v(I)V

    invoke-virtual {v13}, Lr/d;->i()I

    move-result v5

    invoke-virtual {v4, v5}, Ls/g;->d(I)V

    :goto_1e
    iget-object v5, v13, Lr/d;->c0:[I

    const/4 v7, 0x0

    aget v1, v5, v7

    if-eq v1, v0, :cond_2d

    const/4 v0, 0x4

    if-ne v1, v0, :cond_2c

    goto :goto_1f

    :cond_2c
    const/4 v0, 0x0

    goto :goto_20

    :cond_2d
    :goto_1f
    invoke-virtual {v13}, Lr/d;->l()I

    move-result v0

    add-int/2addr v0, v12

    iget-object v1, v2, Ls/m;->i:Ls/f;

    invoke-virtual {v1, v0}, Ls/f;->d(I)V

    sub-int/2addr v0, v12

    invoke-virtual {v10, v0}, Ls/g;->d(I)V

    invoke-virtual {v8}, Ls/e;->g()V

    const/4 v0, 0x1

    aget v1, v5, v0

    if-eq v1, v0, :cond_2e

    const/4 v0, 0x4

    if-ne v1, v0, :cond_2f

    :cond_2e
    invoke-virtual {v13}, Lr/d;->i()I

    move-result v0

    add-int/2addr v0, v15

    iget-object v1, v6, Ls/m;->i:Ls/f;

    invoke-virtual {v1, v0}, Ls/f;->d(I)V

    sub-int/2addr v0, v15

    invoke-virtual {v4, v0}, Ls/g;->d(I)V

    :cond_2f
    invoke-virtual {v8}, Ls/e;->g()V

    const/4 v0, 0x1

    :goto_20
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_31

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls/m;

    iget-object v4, v2, Ls/m;->b:Lr/d;

    if-ne v4, v13, :cond_30

    iget-boolean v4, v2, Ls/m;->g:Z

    if-nez v4, :cond_30

    goto :goto_21

    :cond_30
    invoke-virtual {v2}, Ls/m;->e()V

    goto :goto_21

    :cond_31
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_32
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_36

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls/m;

    if-nez v0, :cond_33

    iget-object v4, v2, Ls/m;->b:Lr/d;

    if-ne v4, v13, :cond_33

    goto :goto_22

    :cond_33
    iget-object v4, v2, Ls/m;->h:Ls/f;

    iget-boolean v4, v4, Ls/f;->j:Z

    if-nez v4, :cond_34

    :goto_23
    const/4 v0, 0x0

    goto :goto_24

    :cond_34
    iget-object v4, v2, Ls/m;->i:Ls/f;

    iget-boolean v4, v4, Ls/f;->j:Z

    if-nez v4, :cond_35

    instance-of v4, v2, Ls/h;

    if-nez v4, :cond_35

    goto :goto_23

    :cond_35
    iget-object v4, v2, Ls/m;->e:Ls/g;

    iget-boolean v4, v4, Ls/f;->j:Z

    if-nez v4, :cond_32

    instance-of v4, v2, Ls/c;

    if-nez v4, :cond_32

    instance-of v2, v2, Ls/h;

    if-nez v2, :cond_32

    goto :goto_23

    :cond_36
    const/4 v0, 0x1

    :goto_24
    invoke-virtual {v13, v11}, Lr/d;->w(I)V

    invoke-virtual {v13, v14}, Lr/d;->x(I)V

    move-object/from16 v1, p1

    move v4, v0

    move/from16 v6, v24

    const/high16 v0, 0x40000000    # 2.0f

    const/4 v2, 0x2

    goto/16 :goto_28

    :cond_37
    move-object/from16 v22, v4

    move/from16 v24, v5

    move-object/from16 v19, v6

    move/from16 v23, v7

    move/from16 v20, v9

    move/from16 v21, v10

    move-object/from16 v8, v17

    iget-boolean v0, v8, Ls/e;->b:Z

    iget-object v1, v8, Ls/e;->a:Lr/e;

    if-eqz v0, :cond_39

    iget-object v0, v1, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_38

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr/d;

    const/4 v4, 0x0

    iput-boolean v4, v2, Lr/d;->a:Z

    iget-object v5, v2, Lr/d;->d:Ls/j;

    iget-object v6, v5, Ls/m;->e:Ls/g;

    iput-boolean v4, v6, Ls/f;->j:Z

    iput-boolean v4, v5, Ls/m;->g:Z

    invoke-virtual {v5}, Ls/j;->n()V

    iget-object v2, v2, Lr/d;->e:Ls/l;

    iget-object v5, v2, Ls/m;->e:Ls/g;

    iput-boolean v4, v5, Ls/f;->j:Z

    iput-boolean v4, v2, Ls/m;->g:Z

    invoke-virtual {v2}, Ls/l;->m()V

    goto :goto_25

    :cond_38
    const/4 v4, 0x0

    iput-boolean v4, v1, Lr/d;->a:Z

    iget-object v0, v1, Lr/d;->d:Ls/j;

    iget-object v2, v0, Ls/m;->e:Ls/g;

    iput-boolean v4, v2, Ls/f;->j:Z

    iput-boolean v4, v0, Ls/m;->g:Z

    invoke-virtual {v0}, Ls/j;->n()V

    iget-object v0, v1, Lr/d;->e:Ls/l;

    iget-object v2, v0, Ls/m;->e:Ls/g;

    iput-boolean v4, v2, Ls/f;->j:Z

    iput-boolean v4, v0, Ls/m;->g:Z

    invoke-virtual {v0}, Ls/l;->m()V

    invoke-virtual {v8}, Ls/e;->c()V

    goto :goto_26

    :cond_39
    const/4 v4, 0x0

    :goto_26
    iget-object v0, v8, Ls/e;->d:Lr/e;

    invoke-virtual {v8, v0}, Ls/e;->b(Lr/e;)V

    iput v4, v1, Lr/d;->N:I

    iput v4, v1, Lr/d;->O:I

    iget-object v0, v1, Lr/d;->d:Ls/j;

    iget-object v0, v0, Ls/m;->h:Ls/f;

    invoke-virtual {v0, v4}, Ls/f;->d(I)V

    iget-object v0, v1, Lr/d;->e:Ls/l;

    iget-object v0, v0, Ls/m;->h:Ls/f;

    invoke-virtual {v0, v4}, Ls/f;->d(I)V

    const/high16 v0, 0x40000000    # 2.0f

    move-object/from16 v1, p1

    if-ne v3, v0, :cond_3a

    invoke-virtual {v1, v4, v11}, Lr/e;->D(IZ)Z

    move-result v2

    const/4 v4, 0x1

    and-int/2addr v2, v4

    move v5, v2

    move v2, v4

    move/from16 v6, v24

    goto :goto_27

    :cond_3a
    const/4 v4, 0x1

    move v5, v4

    move/from16 v6, v24

    const/4 v2, 0x0

    :goto_27
    if-ne v6, v0, :cond_3b

    invoke-virtual {v1, v4, v11}, Lr/e;->D(IZ)Z

    move-result v7

    and-int v4, v5, v7

    add-int/lit8 v2, v2, 0x1

    goto :goto_28

    :cond_3b
    move v4, v5

    :goto_28
    if-eqz v4, :cond_3f

    if-ne v3, v0, :cond_3c

    const/4 v3, 0x1

    goto :goto_29

    :cond_3c
    const/4 v3, 0x0

    :goto_29
    if-ne v6, v0, :cond_3d

    const/4 v0, 0x1

    goto :goto_2a

    :cond_3d
    const/4 v0, 0x0

    :goto_2a
    invoke-virtual {v1, v3, v0}, Lr/e;->z(ZZ)V

    goto :goto_2b

    :cond_3e
    move-object/from16 v22, v4

    move-object/from16 v19, v6

    move/from16 v23, v7

    move/from16 v20, v9

    move/from16 v21, v10

    const/4 v2, 0x0

    const/4 v4, 0x0

    :cond_3f
    :goto_2b
    if-eqz v4, :cond_40

    const/4 v0, 0x2

    if-eq v2, v0, :cond_64

    :cond_40
    if-lez v23, :cond_46

    iget-object v0, v1, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v2, v1, Lr/e;->g0:Lq1/a;

    const/4 v15, 0x0

    :goto_2c
    if-ge v15, v0, :cond_44

    iget-object v3, v1, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr/d;

    instance-of v4, v3, Lr/h;

    if-eqz v4, :cond_41

    :goto_2d
    move-object/from16 v5, v22

    const/4 v7, 0x3

    goto :goto_2e

    :cond_41
    iget-object v4, v3, Lr/d;->d:Ls/j;

    iget-object v4, v4, Ls/m;->e:Ls/g;

    iget-boolean v4, v4, Ls/f;->j:Z

    if-eqz v4, :cond_42

    iget-object v4, v3, Lr/d;->e:Ls/l;

    iget-object v4, v4, Ls/m;->e:Ls/g;

    iget-boolean v4, v4, Ls/f;->j:Z

    if-eqz v4, :cond_42

    goto :goto_2d

    :cond_42
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lr/d;->h(I)I

    move-result v5

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lr/d;->h(I)I

    move-result v6

    const/4 v7, 0x3

    if-ne v5, v7, :cond_43

    iget v5, v3, Lr/d;->j:I

    if-eq v5, v4, :cond_43

    if-ne v6, v7, :cond_43

    iget v5, v3, Lr/d;->k:I

    if-eq v5, v4, :cond_43

    move-object/from16 v5, v22

    goto :goto_2e

    :cond_43
    move-object/from16 v5, v22

    const/4 v4, 0x0

    invoke-virtual {v5, v2, v3, v4}, Lv0/m;->E(Lq1/a;Lr/d;Z)Z

    :goto_2e
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v22, v5

    goto :goto_2c

    :cond_44
    move-object/from16 v5, v22

    iget-object v0, v2, Lq1/a;->g:Ljava/lang/Object;

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v15, 0x0

    :goto_2f
    if-ge v15, v2, :cond_45

    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v15, v15, 0x1

    goto :goto_2f

    :cond_45
    iget-object v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_47

    const/4 v15, 0x0

    :goto_30
    if-ge v15, v2, :cond_47

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt/b;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v15, v15, 0x1

    goto :goto_30

    :cond_46
    move-object/from16 v5, v22

    :cond_47
    iget v0, v1, Lr/e;->p0:I

    iget-object v2, v5, Lv0/m;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    move/from16 v4, v20

    move/from16 v6, v21

    if-lez v23, :cond_48

    invoke-virtual {v5, v1, v4, v6}, Lv0/m;->K(Lr/e;II)V

    :cond_48
    if-lez v3, :cond_62

    iget-object v7, v1, Lr/d;->c0:[I

    const/4 v15, 0x0

    aget v8, v7, v15

    const/4 v9, 0x2

    if-ne v8, v9, :cond_49

    const/4 v8, 0x1

    :goto_31
    const/4 v10, 0x1

    goto :goto_32

    :cond_49
    move v8, v15

    goto :goto_31

    :goto_32
    aget v7, v7, v10

    if-ne v7, v9, :cond_4a

    const/4 v7, 0x1

    goto :goto_33

    :cond_4a
    move v7, v15

    :goto_33
    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v9

    iget-object v10, v5, Lv0/m;->e:Ljava/lang/Object;

    check-cast v10, Lr/e;

    iget v11, v10, Lr/d;->Q:I

    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lr/d;->i()I

    move-result v11

    iget v10, v10, Lr/d;->R:I

    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    move v11, v15

    move v12, v11

    :goto_34
    if-ge v11, v3, :cond_50

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lr/d;

    instance-of v15, v14, Lr/g;

    if-nez v15, :cond_4b

    move/from16 v16, v0

    move-object/from16 v1, v19

    goto/16 :goto_36

    :cond_4b
    invoke-virtual {v14}, Lr/d;->l()I

    move-result v15

    invoke-virtual {v14}, Lr/d;->i()I

    move-result v13

    move/from16 v16, v0

    move-object/from16 v1, v19

    const/4 v0, 0x1

    invoke-virtual {v5, v1, v14, v0}, Lv0/m;->E(Lq1/a;Lr/d;Z)Z

    move-result v19

    or-int v0, v12, v19

    invoke-virtual {v14}, Lr/d;->l()I

    move-result v12

    move/from16 v19, v0

    invoke-virtual {v14}, Lr/d;->i()I

    move-result v0

    if-eq v12, v15, :cond_4d

    invoke-virtual {v14, v12}, Lr/d;->y(I)V

    if-eqz v8, :cond_4c

    invoke-virtual {v14}, Lr/d;->m()I

    move-result v12

    iget v15, v14, Lr/d;->J:I

    add-int/2addr v12, v15

    if-le v12, v9, :cond_4c

    invoke-virtual {v14}, Lr/d;->m()I

    move-result v12

    iget v15, v14, Lr/d;->J:I

    add-int/2addr v12, v15

    const/4 v15, 0x4

    invoke-virtual {v14, v15}, Lr/d;->g(I)Lr/c;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lr/c;->c()I

    move-result v15

    add-int/2addr v15, v12

    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    move-result v9

    :cond_4c
    const/4 v15, 0x1

    goto :goto_35

    :cond_4d
    move/from16 v15, v19

    :goto_35
    if-eq v0, v13, :cond_4f

    invoke-virtual {v14, v0}, Lr/d;->v(I)V

    if-eqz v7, :cond_4e

    invoke-virtual {v14}, Lr/d;->n()I

    move-result v0

    iget v12, v14, Lr/d;->K:I

    add-int/2addr v0, v12

    if-le v0, v10, :cond_4e

    invoke-virtual {v14}, Lr/d;->n()I

    move-result v0

    iget v12, v14, Lr/d;->K:I

    add-int/2addr v0, v12

    const/4 v12, 0x5

    invoke-virtual {v14, v12}, Lr/d;->g(I)Lr/c;

    move-result-object v12

    invoke-virtual {v12}, Lr/c;->c()I

    move-result v12

    add-int/2addr v12, v0

    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    move-result v10

    :cond_4e
    const/4 v15, 0x1

    :cond_4f
    check-cast v14, Lr/g;

    iget-boolean v0, v14, Lr/g;->l0:Z

    or-int/2addr v0, v15

    move v12, v0

    :goto_36
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v19, v1

    move/from16 v0, v16

    const/4 v15, 0x0

    move-object/from16 v1, p1

    goto/16 :goto_34

    :cond_50
    move/from16 v16, v0

    move-object/from16 v1, v19

    const/4 v0, 0x2

    const/4 v15, 0x0

    :goto_37
    if-ge v15, v0, :cond_5e

    const/4 v11, 0x0

    :goto_38
    if-ge v11, v3, :cond_5c

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lr/d;

    instance-of v14, v13, Lr/i;

    if-eqz v14, :cond_51

    instance-of v14, v13, Lr/g;

    if-eqz v14, :cond_55

    :cond_51
    instance-of v14, v13, Lr/h;

    if-eqz v14, :cond_52

    goto :goto_39

    :cond_52
    iget v14, v13, Lr/d;->V:I

    const/16 v0, 0x8

    if-ne v14, v0, :cond_53

    goto :goto_39

    :cond_53
    iget-object v0, v13, Lr/d;->d:Ls/j;

    iget-object v0, v0, Ls/m;->e:Ls/g;

    iget-boolean v0, v0, Ls/f;->j:Z

    if-eqz v0, :cond_54

    iget-object v0, v13, Lr/d;->e:Ls/l;

    iget-object v0, v0, Ls/m;->e:Ls/g;

    iget-boolean v0, v0, Ls/f;->j:Z

    if-eqz v0, :cond_54

    goto :goto_39

    :cond_54
    instance-of v0, v13, Lr/g;

    if-eqz v0, :cond_56

    :cond_55
    :goto_39
    move-object/from16 v21, v1

    move-object/from16 v19, v2

    move/from16 v20, v3

    const/4 v1, 0x5

    const/4 v3, 0x4

    goto/16 :goto_3e

    :cond_56
    invoke-virtual {v13}, Lr/d;->l()I

    move-result v0

    invoke-virtual {v13}, Lr/d;->i()I

    move-result v14

    move-object/from16 v19, v2

    iget v2, v13, Lr/d;->P:I

    move/from16 v20, v3

    const/4 v3, 0x1

    invoke-virtual {v5, v1, v13, v3}, Lv0/m;->E(Lq1/a;Lr/d;Z)Z

    move-result v21

    or-int v12, v12, v21

    invoke-virtual {v13}, Lr/d;->l()I

    move-result v3

    move-object/from16 v21, v1

    invoke-virtual {v13}, Lr/d;->i()I

    move-result v1

    if-eq v3, v0, :cond_58

    invoke-virtual {v13, v3}, Lr/d;->y(I)V

    if-eqz v8, :cond_57

    invoke-virtual {v13}, Lr/d;->m()I

    move-result v0

    iget v3, v13, Lr/d;->J:I

    add-int/2addr v0, v3

    if-le v0, v9, :cond_57

    invoke-virtual {v13}, Lr/d;->m()I

    move-result v0

    iget v3, v13, Lr/d;->J:I

    add-int/2addr v0, v3

    const/4 v3, 0x4

    invoke-virtual {v13, v3}, Lr/d;->g(I)Lr/c;

    move-result-object v12

    invoke-virtual {v12}, Lr/c;->c()I

    move-result v12

    add-int/2addr v12, v0

    invoke-static {v9, v12}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_3a

    :cond_57
    const/4 v3, 0x4

    :goto_3a
    const/4 v12, 0x1

    goto :goto_3b

    :cond_58
    const/4 v3, 0x4

    :goto_3b
    if-eq v1, v14, :cond_5a

    invoke-virtual {v13, v1}, Lr/d;->v(I)V

    if-eqz v7, :cond_59

    invoke-virtual {v13}, Lr/d;->n()I

    move-result v0

    iget v1, v13, Lr/d;->K:I

    add-int/2addr v0, v1

    if-le v0, v10, :cond_59

    invoke-virtual {v13}, Lr/d;->n()I

    move-result v0

    iget v1, v13, Lr/d;->K:I

    add-int/2addr v0, v1

    const/4 v1, 0x5

    invoke-virtual {v13, v1}, Lr/d;->g(I)Lr/c;

    move-result-object v12

    invoke-virtual {v12}, Lr/c;->c()I

    move-result v12

    add-int/2addr v12, v0

    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    move-result v10

    goto :goto_3c

    :cond_59
    const/4 v1, 0x5

    :goto_3c
    const/4 v12, 0x1

    goto :goto_3d

    :cond_5a
    const/4 v1, 0x5

    :goto_3d
    iget-boolean v0, v13, Lr/d;->w:Z

    if-eqz v0, :cond_5b

    iget v0, v13, Lr/d;->P:I

    if-eq v2, v0, :cond_5b

    const/4 v12, 0x1

    :cond_5b
    :goto_3e
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, v19

    move/from16 v3, v20

    move-object/from16 v1, v21

    const/4 v0, 0x2

    goto/16 :goto_38

    :cond_5c
    move-object/from16 v21, v1

    move-object/from16 v19, v2

    move/from16 v20, v3

    const/4 v1, 0x5

    const/4 v3, 0x4

    move-object/from16 v0, p1

    move-object/from16 v2, v21

    if-eqz v12, :cond_5d

    invoke-virtual {v5, v0, v4, v6}, Lv0/m;->K(Lr/e;II)V

    const/4 v12, 0x0

    :cond_5d
    add-int/lit8 v15, v15, 0x1

    move-object v1, v2

    move-object/from16 v2, v19

    move/from16 v3, v20

    const/4 v0, 0x2

    goto/16 :goto_37

    :cond_5e
    move-object/from16 v0, p1

    if-eqz v12, :cond_61

    invoke-virtual {v5, v0, v4, v6}, Lv0/m;->K(Lr/e;II)V

    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v1

    if-ge v1, v9, :cond_5f

    invoke-virtual {v0, v9}, Lr/d;->y(I)V

    const/4 v15, 0x1

    goto :goto_3f

    :cond_5f
    const/4 v15, 0x0

    :goto_3f
    invoke-virtual/range {p1 .. p1}, Lr/d;->i()I

    move-result v1

    if-ge v1, v10, :cond_60

    invoke-virtual {v0, v10}, Lr/d;->v(I)V

    goto :goto_40

    :cond_60
    if-eqz v15, :cond_61

    :goto_40
    invoke-virtual {v5, v0, v4, v6}, Lv0/m;->K(Lr/e;II)V

    :cond_61
    :goto_41
    move/from16 v1, v16

    goto :goto_42

    :cond_62
    move/from16 v16, v0

    move-object v0, v1

    goto :goto_41

    :goto_42
    iput v1, v0, Lr/e;->p0:I

    const/16 v0, 0x100

    and-int/2addr v1, v0

    if-ne v1, v0, :cond_63

    const/4 v8, 0x1

    goto :goto_43

    :cond_63
    const/4 v8, 0x0

    :goto_43
    sput-boolean v8, Lq/e;->p:Z

    :cond_64
    return-void
.end method

.method public final forceLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    invoke-super {p0}, Landroid/view/View;->forceLayout()V

    return-void
.end method

.method public final bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->a()Lt/d;

    move-result-object v0

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 11

    .line 1
    new-instance v0, Lt/d;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 2
    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v2, -0x1

    .line 3
    iput v2, v0, Lt/d;->a:I

    .line 4
    iput v2, v0, Lt/d;->b:I

    const/high16 v3, -0x40800000    # -1.0f

    .line 5
    iput v3, v0, Lt/d;->c:F

    .line 6
    iput v2, v0, Lt/d;->d:I

    .line 7
    iput v2, v0, Lt/d;->e:I

    .line 8
    iput v2, v0, Lt/d;->f:I

    .line 9
    iput v2, v0, Lt/d;->g:I

    .line 10
    iput v2, v0, Lt/d;->h:I

    .line 11
    iput v2, v0, Lt/d;->i:I

    .line 12
    iput v2, v0, Lt/d;->j:I

    .line 13
    iput v2, v0, Lt/d;->k:I

    .line 14
    iput v2, v0, Lt/d;->l:I

    .line 15
    iput v2, v0, Lt/d;->m:I

    const/4 v4, 0x0

    .line 16
    iput v4, v0, Lt/d;->n:I

    const/4 v5, 0x0

    .line 17
    iput v5, v0, Lt/d;->o:F

    .line 18
    iput v2, v0, Lt/d;->p:I

    .line 19
    iput v2, v0, Lt/d;->q:I

    .line 20
    iput v2, v0, Lt/d;->r:I

    .line 21
    iput v2, v0, Lt/d;->s:I

    .line 22
    iput v2, v0, Lt/d;->t:I

    .line 23
    iput v2, v0, Lt/d;->u:I

    .line 24
    iput v2, v0, Lt/d;->v:I

    .line 25
    iput v2, v0, Lt/d;->w:I

    .line 26
    iput v2, v0, Lt/d;->x:I

    .line 27
    iput v2, v0, Lt/d;->y:I

    const/high16 v6, 0x3f000000    # 0.5f

    .line 28
    iput v6, v0, Lt/d;->z:F

    .line 29
    iput v6, v0, Lt/d;->A:F

    const/4 v7, 0x0

    .line 30
    iput-object v7, v0, Lt/d;->B:Ljava/lang/String;

    const/4 v8, 0x1

    .line 31
    iput v8, v0, Lt/d;->C:I

    .line 32
    iput v3, v0, Lt/d;->D:F

    .line 33
    iput v3, v0, Lt/d;->E:F

    .line 34
    iput v4, v0, Lt/d;->F:I

    .line 35
    iput v4, v0, Lt/d;->G:I

    .line 36
    iput v4, v0, Lt/d;->H:I

    .line 37
    iput v4, v0, Lt/d;->I:I

    .line 38
    iput v4, v0, Lt/d;->J:I

    .line 39
    iput v4, v0, Lt/d;->K:I

    .line 40
    iput v4, v0, Lt/d;->L:I

    .line 41
    iput v4, v0, Lt/d;->M:I

    const/high16 v3, 0x3f800000    # 1.0f

    .line 42
    iput v3, v0, Lt/d;->N:F

    .line 43
    iput v3, v0, Lt/d;->O:F

    .line 44
    iput v2, v0, Lt/d;->P:I

    .line 45
    iput v2, v0, Lt/d;->Q:I

    .line 46
    iput v2, v0, Lt/d;->R:I

    .line 47
    iput-boolean v4, v0, Lt/d;->S:Z

    .line 48
    iput-boolean v4, v0, Lt/d;->T:Z

    .line 49
    iput-object v7, v0, Lt/d;->U:Ljava/lang/String;

    .line 50
    iput-boolean v8, v0, Lt/d;->V:Z

    .line 51
    iput-boolean v8, v0, Lt/d;->W:Z

    .line 52
    iput-boolean v4, v0, Lt/d;->X:Z

    .line 53
    iput-boolean v4, v0, Lt/d;->Y:Z

    .line 54
    iput-boolean v4, v0, Lt/d;->Z:Z

    .line 55
    iput v2, v0, Lt/d;->a0:I

    .line 56
    iput v2, v0, Lt/d;->b0:I

    .line 57
    iput v2, v0, Lt/d;->c0:I

    .line 58
    iput v2, v0, Lt/d;->d0:I

    .line 59
    iput v2, v0, Lt/d;->e0:I

    .line 60
    iput v2, v0, Lt/d;->f0:I

    .line 61
    iput v6, v0, Lt/d;->g0:F

    .line 62
    new-instance v3, Lr/d;

    invoke-direct {v3}, Lr/d;-><init>()V

    iput-object v3, v0, Lt/d;->k0:Lr/d;

    .line 63
    sget-object v3, Lt/o;->b:[I

    invoke-virtual {v1, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 64
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    move v3, v4

    :goto_0
    if-ge v3, v1, :cond_6

    .line 65
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v6

    .line 66
    sget-object v7, Lt/c;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v7, v6}, Landroid/util/SparseIntArray;->get(I)I

    move-result v7

    const/4 v9, 0x2

    const/4 v10, -0x2

    packed-switch v7, :pswitch_data_0

    packed-switch v7, :pswitch_data_1

    goto/16 :goto_3

    .line 67
    :pswitch_0
    invoke-virtual {p1, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Lt/d;->U:Ljava/lang/String;

    goto/16 :goto_3

    .line 68
    :pswitch_1
    iget v7, v0, Lt/d;->Q:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v6

    iput v6, v0, Lt/d;->Q:I

    goto/16 :goto_3

    .line 69
    :pswitch_2
    iget v7, v0, Lt/d;->P:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v6

    iput v6, v0, Lt/d;->P:I

    goto/16 :goto_3

    .line 70
    :pswitch_3
    invoke-virtual {p1, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->G:I

    goto/16 :goto_3

    .line 71
    :pswitch_4
    invoke-virtual {p1, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->F:I

    goto/16 :goto_3

    .line 72
    :pswitch_5
    iget v7, v0, Lt/d;->E:F

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v0, Lt/d;->E:F

    goto/16 :goto_3

    .line 73
    :pswitch_6
    iget v7, v0, Lt/d;->D:F

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v0, Lt/d;->D:F

    goto/16 :goto_3

    .line 74
    :pswitch_7
    invoke-virtual {p1, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Lt/d;->B:Ljava/lang/String;

    .line 75
    iput v2, v0, Lt/d;->C:I

    if-eqz v6, :cond_5

    .line 76
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    .line 77
    iget-object v7, v0, Lt/d;->B:Ljava/lang/String;

    const/16 v9, 0x2c

    invoke-virtual {v7, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    if-lez v7, :cond_2

    add-int/lit8 v9, v6, -0x1

    if-ge v7, v9, :cond_2

    .line 78
    iget-object v9, v0, Lt/d;->B:Ljava/lang/String;

    invoke-virtual {v9, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 79
    const-string v10, "W"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 80
    iput v4, v0, Lt/d;->C:I

    goto :goto_1

    .line 81
    :cond_0
    const-string v10, "H"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 82
    iput v8, v0, Lt/d;->C:I

    :cond_1
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    move v7, v4

    .line 83
    :goto_2
    iget-object v9, v0, Lt/d;->B:Ljava/lang/String;

    const/16 v10, 0x3a

    invoke-virtual {v9, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v9

    if-ltz v9, :cond_4

    add-int/lit8 v6, v6, -0x1

    if-ge v9, v6, :cond_4

    .line 84
    iget-object v6, v0, Lt/d;->B:Ljava/lang/String;

    invoke-virtual {v6, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 85
    iget-object v7, v0, Lt/d;->B:Ljava/lang/String;

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v7, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 86
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_5

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_5

    .line 87
    :try_start_0
    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    .line 88
    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    cmpl-float v9, v6, v5

    if-lez v9, :cond_5

    cmpl-float v9, v7, v5

    if-lez v9, :cond_5

    .line 89
    iget v9, v0, Lt/d;->C:I

    if-ne v9, v8, :cond_3

    div-float/2addr v7, v6

    .line 90
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    goto/16 :goto_3

    :cond_3
    div-float/2addr v6, v7

    .line 91
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_4

    goto/16 :goto_3

    .line 92
    :cond_4
    iget-object v6, v0, Lt/d;->B:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 93
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_5

    .line 94
    :try_start_1
    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_4

    goto/16 :goto_3

    .line 95
    :pswitch_8
    iget v7, v0, Lt/d;->O:F

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iput v6, v0, Lt/d;->O:F

    .line 96
    iput v9, v0, Lt/d;->I:I

    goto/16 :goto_3

    .line 97
    :pswitch_9
    :try_start_2
    iget v7, v0, Lt/d;->M:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lt/d;->M:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_3

    .line 98
    :catch_0
    iget v7, v0, Lt/d;->M:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    if-ne v6, v10, :cond_5

    .line 99
    iput v10, v0, Lt/d;->M:I

    goto/16 :goto_3

    .line 100
    :pswitch_a
    :try_start_3
    iget v7, v0, Lt/d;->K:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lt/d;->K:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_3

    .line 101
    :catch_1
    iget v7, v0, Lt/d;->K:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    if-ne v6, v10, :cond_5

    .line 102
    iput v10, v0, Lt/d;->K:I

    goto/16 :goto_3

    .line 103
    :pswitch_b
    iget v7, v0, Lt/d;->N:F

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iput v6, v0, Lt/d;->N:F

    .line 104
    iput v9, v0, Lt/d;->H:I

    goto/16 :goto_3

    .line 105
    :pswitch_c
    :try_start_4
    iget v7, v0, Lt/d;->L:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lt/d;->L:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto/16 :goto_3

    .line 106
    :catch_2
    iget v7, v0, Lt/d;->L:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    if-ne v6, v10, :cond_5

    .line 107
    iput v10, v0, Lt/d;->L:I

    goto/16 :goto_3

    .line 108
    :pswitch_d
    :try_start_5
    iget v7, v0, Lt/d;->J:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lt/d;->J:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    goto/16 :goto_3

    .line 109
    :catch_3
    iget v7, v0, Lt/d;->J:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    if-ne v6, v10, :cond_5

    .line 110
    iput v10, v0, Lt/d;->J:I

    goto/16 :goto_3

    .line 111
    :pswitch_e
    invoke-virtual {p1, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->I:I

    goto/16 :goto_3

    .line 112
    :pswitch_f
    invoke-virtual {p1, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->H:I

    goto/16 :goto_3

    .line 113
    :pswitch_10
    iget v7, v0, Lt/d;->A:F

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v0, Lt/d;->A:F

    goto/16 :goto_3

    .line 114
    :pswitch_11
    iget v7, v0, Lt/d;->z:F

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v0, Lt/d;->z:F

    goto/16 :goto_3

    .line 115
    :pswitch_12
    iget-boolean v7, v0, Lt/d;->T:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, v0, Lt/d;->T:Z

    goto/16 :goto_3

    .line 116
    :pswitch_13
    iget-boolean v7, v0, Lt/d;->S:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, v0, Lt/d;->S:Z

    goto/16 :goto_3

    .line 117
    :pswitch_14
    iget v7, v0, Lt/d;->y:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v0, Lt/d;->y:I

    goto/16 :goto_3

    .line 118
    :pswitch_15
    iget v7, v0, Lt/d;->x:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v0, Lt/d;->x:I

    goto/16 :goto_3

    .line 119
    :pswitch_16
    iget v7, v0, Lt/d;->w:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v0, Lt/d;->w:I

    goto/16 :goto_3

    .line 120
    :pswitch_17
    iget v7, v0, Lt/d;->v:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v0, Lt/d;->v:I

    goto/16 :goto_3

    .line 121
    :pswitch_18
    iget v7, v0, Lt/d;->u:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v0, Lt/d;->u:I

    goto/16 :goto_3

    .line 122
    :pswitch_19
    iget v7, v0, Lt/d;->t:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v0, Lt/d;->t:I

    goto/16 :goto_3

    .line 123
    :pswitch_1a
    iget v7, v0, Lt/d;->s:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->s:I

    if-ne v7, v2, :cond_5

    .line 124
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->s:I

    goto/16 :goto_3

    .line 125
    :pswitch_1b
    iget v7, v0, Lt/d;->r:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->r:I

    if-ne v7, v2, :cond_5

    .line 126
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->r:I

    goto/16 :goto_3

    .line 127
    :pswitch_1c
    iget v7, v0, Lt/d;->q:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->q:I

    if-ne v7, v2, :cond_5

    .line 128
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->q:I

    goto/16 :goto_3

    .line 129
    :pswitch_1d
    iget v7, v0, Lt/d;->p:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->p:I

    if-ne v7, v2, :cond_5

    .line 130
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->p:I

    goto/16 :goto_3

    .line 131
    :pswitch_1e
    iget v7, v0, Lt/d;->l:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->l:I

    if-ne v7, v2, :cond_5

    .line 132
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->l:I

    goto/16 :goto_3

    .line 133
    :pswitch_1f
    iget v7, v0, Lt/d;->k:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->k:I

    if-ne v7, v2, :cond_5

    .line 134
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->k:I

    goto/16 :goto_3

    .line 135
    :pswitch_20
    iget v7, v0, Lt/d;->j:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->j:I

    if-ne v7, v2, :cond_5

    .line 136
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->j:I

    goto/16 :goto_3

    .line 137
    :pswitch_21
    iget v7, v0, Lt/d;->i:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->i:I

    if-ne v7, v2, :cond_5

    .line 138
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->i:I

    goto/16 :goto_3

    .line 139
    :pswitch_22
    iget v7, v0, Lt/d;->h:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->h:I

    if-ne v7, v2, :cond_5

    .line 140
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->h:I

    goto/16 :goto_3

    .line 141
    :pswitch_23
    iget v7, v0, Lt/d;->g:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->g:I

    if-ne v7, v2, :cond_5

    .line 142
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->g:I

    goto/16 :goto_3

    .line 143
    :pswitch_24
    iget v7, v0, Lt/d;->f:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->f:I

    if-ne v7, v2, :cond_5

    .line 144
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->f:I

    goto/16 :goto_3

    .line 145
    :pswitch_25
    iget v7, v0, Lt/d;->e:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->e:I

    if-ne v7, v2, :cond_5

    .line 146
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->e:I

    goto :goto_3

    .line 147
    :pswitch_26
    iget v7, v0, Lt/d;->d:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->d:I

    if-ne v7, v2, :cond_5

    .line 148
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->d:I

    goto :goto_3

    .line 149
    :pswitch_27
    iget v7, v0, Lt/d;->c:F

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, v0, Lt/d;->c:F

    goto :goto_3

    .line 150
    :pswitch_28
    iget v7, v0, Lt/d;->b:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v6

    iput v6, v0, Lt/d;->b:I

    goto :goto_3

    .line 151
    :pswitch_29
    iget v7, v0, Lt/d;->a:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v6

    iput v6, v0, Lt/d;->a:I

    goto :goto_3

    .line 152
    :pswitch_2a
    iget v7, v0, Lt/d;->o:F

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    const/high16 v7, 0x43b40000    # 360.0f

    rem-float/2addr v6, v7

    iput v6, v0, Lt/d;->o:F

    cmpg-float v9, v6, v5

    if-gez v9, :cond_5

    sub-float v6, v7, v6

    rem-float/2addr v6, v7

    .line 153
    iput v6, v0, Lt/d;->o:F

    goto :goto_3

    .line 154
    :pswitch_2b
    iget v7, v0, Lt/d;->n:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    iput v6, v0, Lt/d;->n:I

    goto :goto_3

    .line 155
    :pswitch_2c
    iget v7, v0, Lt/d;->m:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v0, Lt/d;->m:I

    if-ne v7, v2, :cond_5

    .line 156
    invoke-virtual {p1, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->m:I

    goto :goto_3

    .line 157
    :pswitch_2d
    iget v7, v0, Lt/d;->R:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, v0, Lt/d;->R:I

    :catch_4
    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 158
    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 159
    invoke-virtual {v0}, Lt/d;->a()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2c
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 6

    .line 160
    new-instance v0, Lt/d;

    .line 161
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, -0x1

    .line 162
    iput p1, v0, Lt/d;->a:I

    .line 163
    iput p1, v0, Lt/d;->b:I

    const/high16 v1, -0x40800000    # -1.0f

    .line 164
    iput v1, v0, Lt/d;->c:F

    .line 165
    iput p1, v0, Lt/d;->d:I

    .line 166
    iput p1, v0, Lt/d;->e:I

    .line 167
    iput p1, v0, Lt/d;->f:I

    .line 168
    iput p1, v0, Lt/d;->g:I

    .line 169
    iput p1, v0, Lt/d;->h:I

    .line 170
    iput p1, v0, Lt/d;->i:I

    .line 171
    iput p1, v0, Lt/d;->j:I

    .line 172
    iput p1, v0, Lt/d;->k:I

    .line 173
    iput p1, v0, Lt/d;->l:I

    .line 174
    iput p1, v0, Lt/d;->m:I

    const/4 v2, 0x0

    .line 175
    iput v2, v0, Lt/d;->n:I

    const/4 v3, 0x0

    .line 176
    iput v3, v0, Lt/d;->o:F

    .line 177
    iput p1, v0, Lt/d;->p:I

    .line 178
    iput p1, v0, Lt/d;->q:I

    .line 179
    iput p1, v0, Lt/d;->r:I

    .line 180
    iput p1, v0, Lt/d;->s:I

    .line 181
    iput p1, v0, Lt/d;->t:I

    .line 182
    iput p1, v0, Lt/d;->u:I

    .line 183
    iput p1, v0, Lt/d;->v:I

    .line 184
    iput p1, v0, Lt/d;->w:I

    .line 185
    iput p1, v0, Lt/d;->x:I

    .line 186
    iput p1, v0, Lt/d;->y:I

    const/high16 v3, 0x3f000000    # 0.5f

    .line 187
    iput v3, v0, Lt/d;->z:F

    .line 188
    iput v3, v0, Lt/d;->A:F

    const/4 v4, 0x0

    .line 189
    iput-object v4, v0, Lt/d;->B:Ljava/lang/String;

    const/4 v5, 0x1

    .line 190
    iput v5, v0, Lt/d;->C:I

    .line 191
    iput v1, v0, Lt/d;->D:F

    .line 192
    iput v1, v0, Lt/d;->E:F

    .line 193
    iput v2, v0, Lt/d;->F:I

    .line 194
    iput v2, v0, Lt/d;->G:I

    .line 195
    iput v2, v0, Lt/d;->H:I

    .line 196
    iput v2, v0, Lt/d;->I:I

    .line 197
    iput v2, v0, Lt/d;->J:I

    .line 198
    iput v2, v0, Lt/d;->K:I

    .line 199
    iput v2, v0, Lt/d;->L:I

    .line 200
    iput v2, v0, Lt/d;->M:I

    const/high16 v1, 0x3f800000    # 1.0f

    .line 201
    iput v1, v0, Lt/d;->N:F

    .line 202
    iput v1, v0, Lt/d;->O:F

    .line 203
    iput p1, v0, Lt/d;->P:I

    .line 204
    iput p1, v0, Lt/d;->Q:I

    .line 205
    iput p1, v0, Lt/d;->R:I

    .line 206
    iput-boolean v2, v0, Lt/d;->S:Z

    .line 207
    iput-boolean v2, v0, Lt/d;->T:Z

    .line 208
    iput-object v4, v0, Lt/d;->U:Ljava/lang/String;

    .line 209
    iput-boolean v5, v0, Lt/d;->V:Z

    .line 210
    iput-boolean v5, v0, Lt/d;->W:Z

    .line 211
    iput-boolean v2, v0, Lt/d;->X:Z

    .line 212
    iput-boolean v2, v0, Lt/d;->Y:Z

    .line 213
    iput-boolean v2, v0, Lt/d;->Z:Z

    .line 214
    iput p1, v0, Lt/d;->a0:I

    .line 215
    iput p1, v0, Lt/d;->b0:I

    .line 216
    iput p1, v0, Lt/d;->c0:I

    .line 217
    iput p1, v0, Lt/d;->d0:I

    .line 218
    iput p1, v0, Lt/d;->e0:I

    .line 219
    iput p1, v0, Lt/d;->f0:I

    .line 220
    iput v3, v0, Lt/d;->g0:F

    .line 221
    new-instance p1, Lr/d;

    invoke-direct {p1}, Lr/d;-><init>()V

    iput-object p1, v0, Lt/d;->k0:Lr/d;

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    return v0
.end method

.method public getMinHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    iget v0, v0, Lr/e;->p0:I

    return v0
.end method

.method public onLayout(ZIIII)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    move p4, p3

    :goto_0
    if-ge p4, p1, :cond_1

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lt/d;

    iget-object v1, v0, Lt/d;->k0:Lr/d;

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Lt/d;->Y:Z

    if-nez v2, :cond_0

    iget-boolean v0, v0, Lt/d;->Z:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lr/d;->m()I

    move-result v0

    invoke-virtual {v1}, Lr/d;->n()I

    move-result v2

    invoke-virtual {v1}, Lr/d;->l()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1}, Lr/d;->i()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :goto_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_2

    :goto_2
    if-ge p3, p2, :cond_2

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lt/b;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public onMeasure(II)V
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v4, 0x400000

    and-int/2addr v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    if-ne v5, v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    iput-boolean v3, v6, Lr/e;->h0:Z

    iget-boolean v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    if-eqz v3, :cond_4c

    iput-boolean v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    move v7, v4

    :goto_1
    if-ge v7, v3, :cond_2

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->isLayoutRequested()Z

    move-result v8

    if-eqz v8, :cond_1

    move v3, v5

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_2
    if-eqz v3, :cond_47

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v10

    move v11, v4

    :goto_3
    if-ge v11, v10, :cond_4

    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    invoke-virtual {v0, v12}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)Lr/d;

    move-result-object v12

    if-nez v12, :cond_3

    goto :goto_4

    :cond_3
    invoke-virtual {v12}, Lr/d;->s()V

    :goto_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_4
    iget-object v11, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    const/4 v13, -0x1

    if-eqz v9, :cond_d

    move v14, v4

    :goto_5
    if-ge v14, v10, :cond_d

    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v15

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v15}, Landroid/view/View;->getId()I

    move-result v7

    invoke-virtual {v8, v7}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15}, Landroid/view/View;->getId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    instance-of v5, v7, Ljava/lang/String;

    if-eqz v5, :cond_7

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    if-nez v5, :cond_5

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    iput-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    :cond_5
    const-string v5, "/"

    invoke-virtual {v7, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-eq v5, v13, :cond_6

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v7, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_6

    :cond_6
    move-object v5, v7

    :goto_6
    iget-object v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    invoke-virtual {v12, v5, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    const/16 v5, 0x2f

    invoke-virtual {v7, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-eq v5, v13, :cond_8

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v7, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    :cond_8
    invoke-virtual {v15}, Landroid/view/View;->getId()I

    move-result v5

    if-nez v5, :cond_9

    :goto_7
    move-object v5, v6

    goto :goto_8

    :cond_9
    invoke-virtual {v11, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    if-nez v8, :cond_a

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_a

    if-eq v8, v0, :cond_a

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    if-ne v5, v0, :cond_a

    invoke-virtual {v0, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_a
    if-ne v8, v0, :cond_b

    goto :goto_7

    :cond_b
    if-nez v8, :cond_c

    const/4 v5, 0x0

    goto :goto_8

    :cond_c
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Lt/d;

    iget-object v5, v5, Lt/d;->k0:Lr/d;

    :goto_8
    iput-object v7, v5, Lr/d;->W:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v14, v14, 0x1

    const/4 v5, 0x1

    goto/16 :goto_5

    :cond_d
    iget v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    if-eq v5, v13, :cond_e

    move v5, v4

    :goto_9
    if-ge v5, v10, :cond_e

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getId()I

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_e
    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lt/k;

    if-eqz v5, :cond_f

    invoke-virtual {v5, v0}, Lt/k;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_f
    iget-object v5, v6, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-lez v7, :cond_18

    move v12, v4

    :goto_a
    if-ge v12, v7, :cond_18

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lt/b;

    invoke-virtual {v14}, Landroid/view/View;->isInEditMode()Z

    move-result v15

    if-eqz v15, :cond_10

    iget-object v15, v14, Lt/b;->f:Ljava/lang/String;

    invoke-virtual {v14, v15}, Lt/b;->setIds(Ljava/lang/String;)V

    :cond_10
    iget-object v15, v14, Lt/b;->e:Lr/i;

    if-nez v15, :cond_11

    move-object/from16 v18, v5

    move/from16 v17, v7

    goto/16 :goto_f

    :cond_11
    iput v4, v15, Lr/i;->e0:I

    iget-object v15, v15, Lr/i;->d0:[Lr/d;

    const/4 v13, 0x0

    invoke-static {v15, v13}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    move v13, v4

    :goto_b
    iget v15, v14, Lt/b;->c:I

    if-ge v13, v15, :cond_17

    iget-object v15, v14, Lt/b;->b:[I

    aget v15, v15, v13

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v4, v15}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-nez v4, :cond_12

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    iget-object v8, v14, Lt/b;->g:Ljava/util/HashMap;

    invoke-virtual {v8, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v17, v4

    invoke-virtual {v14, v0, v15}, Lt/b;->d(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I

    move-result v4

    move-object/from16 v18, v5

    if-eqz v4, :cond_13

    iget-object v5, v14, Lt/b;->b:[I

    aput v4, v5, v13

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v8, v5, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    goto :goto_c

    :cond_12
    move-object/from16 v17, v4

    move-object/from16 v18, v5

    :cond_13
    move-object/from16 v4, v17

    :goto_c
    if-eqz v4, :cond_16

    iget-object v5, v14, Lt/b;->e:Lr/i;

    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)Lr/d;

    move-result-object v4

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq v4, v5, :cond_16

    if-nez v4, :cond_14

    goto :goto_d

    :cond_14
    iget v8, v5, Lr/i;->e0:I

    const/4 v15, 0x1

    add-int/2addr v8, v15

    iget-object v15, v5, Lr/i;->d0:[Lr/d;

    move/from16 v17, v7

    array-length v7, v15

    if-le v8, v7, :cond_15

    array-length v7, v15

    const/4 v8, 0x2

    mul-int/2addr v7, v8

    invoke-static {v15, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Lr/d;

    iput-object v7, v5, Lr/i;->d0:[Lr/d;

    :cond_15
    iget-object v7, v5, Lr/i;->d0:[Lr/d;

    iget v8, v5, Lr/i;->e0:I

    aput-object v4, v7, v8

    const/4 v4, 0x1

    add-int/2addr v8, v4

    iput v8, v5, Lr/i;->e0:I

    goto :goto_e

    :cond_16
    :goto_d
    move/from16 v17, v7

    :goto_e
    add-int/lit8 v13, v13, 0x1

    move/from16 v7, v17

    move-object/from16 v5, v18

    const/4 v4, 0x0

    goto :goto_b

    :cond_17
    move-object/from16 v18, v5

    move/from16 v17, v7

    iget-object v4, v14, Lt/b;->e:Lr/i;

    invoke-virtual {v4}, Lr/i;->B()V

    :goto_f
    add-int/lit8 v12, v12, 0x1

    move/from16 v7, v17

    move-object/from16 v5, v18

    const/4 v4, 0x0

    const/4 v13, -0x1

    goto/16 :goto_a

    :cond_18
    const/4 v4, 0x0

    :goto_10
    if-ge v4, v10, :cond_19

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v4, v4, 0x1

    goto :goto_10

    :cond_19
    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroid/util/SparseArray;

    invoke-virtual {v4}, Landroid/util/SparseArray;->clear()V

    const/4 v5, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v4, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v5, 0x0

    :goto_11
    if-ge v5, v10, :cond_1a

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)Lr/d;

    move-result-object v8

    invoke-virtual {v7}, Landroid/view/View;->getId()I

    move-result v7

    invoke-virtual {v4, v7, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_11

    :cond_1a
    const/4 v5, 0x0

    :goto_12
    if-ge v5, v10, :cond_47

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)Lr/d;

    move-result-object v8

    if-nez v8, :cond_1c

    :cond_1b
    :goto_13
    move-object/from16 v24, v6

    move/from16 v23, v10

    const/4 v0, 0x2

    const/4 v2, -0x1

    goto/16 :goto_27

    :cond_1c
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Lt/d;

    iget-object v13, v6, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v13, v8, Lr/d;->I:Lr/d;

    if-eqz v13, :cond_1d

    check-cast v13, Lr/e;

    iget-object v13, v13, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v13, 0x0

    iput-object v13, v8, Lr/d;->I:Lr/d;

    goto :goto_14

    :cond_1d
    const/4 v13, 0x0

    :goto_14
    iput-object v6, v8, Lr/d;->I:Lr/d;

    invoke-virtual {v12}, Lt/d;->a()V

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v14

    iput v14, v8, Lr/d;->V:I

    iput-object v7, v8, Lr/d;->U:Ljava/lang/Object;

    instance-of v14, v7, Lt/b;

    if-eqz v14, :cond_1e

    check-cast v7, Lt/b;

    iget-boolean v14, v6, Lr/e;->h0:Z

    invoke-virtual {v7, v8, v14}, Lt/b;->f(Lr/d;Z)V

    :cond_1e
    iget-boolean v7, v12, Lt/d;->Y:Z

    if-eqz v7, :cond_22

    check-cast v8, Lr/h;

    iget v7, v12, Lt/d;->h0:I

    iget v14, v12, Lt/d;->i0:I

    iget v12, v12, Lt/d;->j0:F

    const/high16 v15, -0x40800000    # -1.0f

    cmpl-float v16, v12, v15

    if-eqz v16, :cond_20

    if-lez v16, :cond_1f

    iput v12, v8, Lr/h;->d0:F

    const/4 v12, -0x1

    iput v12, v8, Lr/h;->e0:I

    iput v12, v8, Lr/h;->f0:I

    goto :goto_13

    :cond_1f
    const/4 v12, -0x1

    goto :goto_13

    :cond_20
    const/4 v12, -0x1

    if-eq v7, v12, :cond_21

    if-le v7, v12, :cond_1b

    iput v15, v8, Lr/h;->d0:F

    iput v7, v8, Lr/h;->e0:I

    iput v12, v8, Lr/h;->f0:I

    goto :goto_13

    :cond_21
    if-eq v14, v12, :cond_1b

    if-le v14, v12, :cond_1b

    iput v15, v8, Lr/h;->d0:F

    iput v12, v8, Lr/h;->e0:I

    iput v14, v8, Lr/h;->f0:I

    goto :goto_13

    :cond_22
    iget v7, v12, Lt/d;->a0:I

    iget v14, v12, Lt/d;->b0:I

    iget v15, v12, Lt/d;->c0:I

    iget v13, v12, Lt/d;->d0:I

    move/from16 v23, v10

    iget v10, v12, Lt/d;->e0:I

    iget v1, v12, Lt/d;->f0:I

    iget v2, v12, Lt/d;->g0:F

    iget v0, v12, Lt/d;->m:I

    move-object/from16 v24, v6

    const/4 v6, -0x1

    if-eq v0, v6, :cond_23

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lr/d;

    if-eqz v22, :cond_2f

    iget v0, v12, Lt/d;->o:F

    iget v1, v12, Lt/d;->n:I

    const/16 v19, 0x7

    const/16 v21, 0x0

    move-object/from16 v17, v8

    move/from16 v18, v19

    move/from16 v20, v1

    invoke-virtual/range {v17 .. v22}, Lr/d;->o(IIIILr/d;)V

    iput v0, v8, Lr/d;->v:F

    goto/16 :goto_1a

    :cond_23
    move v0, v6

    if-eq v7, v0, :cond_25

    invoke-virtual {v4, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lr/d;

    if-eqz v22, :cond_24

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v17, v8

    const/4 v6, 0x2

    move/from16 v18, v6

    move/from16 v19, v6

    move/from16 v20, v0

    move/from16 v21, v10

    invoke-virtual/range {v17 .. v22}, Lr/d;->o(IIIILr/d;)V

    :cond_24
    :goto_15
    const/4 v0, -0x1

    goto :goto_16

    :cond_25
    if-eq v14, v0, :cond_26

    invoke-virtual {v4, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lr/d;

    if-eqz v22, :cond_24

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v17, v8

    const/4 v6, 0x2

    move/from16 v18, v6

    const/4 v6, 0x4

    move/from16 v19, v6

    move/from16 v20, v0

    move/from16 v21, v10

    invoke-virtual/range {v17 .. v22}, Lr/d;->o(IIIILr/d;)V

    goto :goto_15

    :cond_26
    :goto_16
    if-eq v15, v0, :cond_27

    invoke-virtual {v4, v15}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lr/d;

    if-eqz v22, :cond_28

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v17, v8

    const/4 v6, 0x4

    move/from16 v18, v6

    const/4 v6, 0x2

    move/from16 v19, v6

    move/from16 v20, v0

    move/from16 v21, v1

    invoke-virtual/range {v17 .. v22}, Lr/d;->o(IIIILr/d;)V

    goto :goto_17

    :cond_27
    if-eq v13, v0, :cond_28

    invoke-virtual {v4, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lr/d;

    if-eqz v22, :cond_28

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v17, v8

    const/4 v6, 0x4

    move/from16 v18, v6

    move/from16 v19, v6

    move/from16 v20, v0

    move/from16 v21, v1

    invoke-virtual/range {v17 .. v22}, Lr/d;->o(IIIILr/d;)V

    :cond_28
    :goto_17
    iget v0, v12, Lt/d;->h:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_29

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lr/d;

    if-eqz v22, :cond_2a

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v12, Lt/d;->u:I

    move-object/from16 v17, v8

    const/4 v6, 0x3

    move/from16 v18, v6

    move/from16 v19, v6

    move/from16 v20, v0

    move/from16 v21, v1

    invoke-virtual/range {v17 .. v22}, Lr/d;->o(IIIILr/d;)V

    goto :goto_18

    :cond_29
    iget v0, v12, Lt/d;->i:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2a

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lr/d;

    if-eqz v22, :cond_2a

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v12, Lt/d;->u:I

    move-object/from16 v17, v8

    const/4 v6, 0x3

    move/from16 v18, v6

    const/4 v6, 0x5

    move/from16 v19, v6

    move/from16 v20, v0

    move/from16 v21, v1

    invoke-virtual/range {v17 .. v22}, Lr/d;->o(IIIILr/d;)V

    :cond_2a
    :goto_18
    iget v0, v12, Lt/d;->j:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2b

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lr/d;

    if-eqz v22, :cond_2c

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v12, Lt/d;->w:I

    move-object/from16 v17, v8

    const/4 v6, 0x5

    move/from16 v18, v6

    const/4 v6, 0x3

    move/from16 v19, v6

    move/from16 v20, v0

    move/from16 v21, v1

    invoke-virtual/range {v17 .. v22}, Lr/d;->o(IIIILr/d;)V

    goto :goto_19

    :cond_2b
    iget v0, v12, Lt/d;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2c

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lr/d;

    if-eqz v22, :cond_2c

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v12, Lt/d;->w:I

    move-object/from16 v17, v8

    const/4 v6, 0x5

    move/from16 v18, v6

    move/from16 v19, v6

    move/from16 v20, v0

    move/from16 v21, v1

    invoke-virtual/range {v17 .. v22}, Lr/d;->o(IIIILr/d;)V

    :cond_2c
    :goto_19
    iget v0, v12, Lt/d;->l:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2d

    invoke-virtual {v11, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget v1, v12, Lt/d;->l:I

    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr/d;

    if-eqz v1, :cond_2d

    if-eqz v0, :cond_2d

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    instance-of v6, v6, Lt/d;

    if-eqz v6, :cond_2d

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lt/d;

    const/4 v6, 0x1

    iput-boolean v6, v12, Lt/d;->X:Z

    iput-boolean v6, v0, Lt/d;->X:Z

    const/4 v7, 0x6

    invoke-virtual {v8, v7}, Lr/d;->g(I)Lr/c;

    move-result-object v10

    invoke-virtual {v1, v7}, Lr/d;->g(I)Lr/c;

    move-result-object v1

    const/4 v7, 0x0

    const/4 v13, -0x1

    invoke-virtual {v10, v1, v7, v13, v6}, Lr/c;->b(Lr/c;IIZ)Z

    iput-boolean v6, v8, Lr/d;->w:Z

    iget-object v0, v0, Lt/d;->k0:Lr/d;

    iput-boolean v6, v0, Lr/d;->w:Z

    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lr/d;->g(I)Lr/c;

    move-result-object v1

    invoke-virtual {v1}, Lr/c;->h()V

    const/4 v0, 0x5

    invoke-virtual {v8, v0}, Lr/d;->g(I)Lr/c;

    move-result-object v1

    invoke-virtual {v1}, Lr/c;->h()V

    :cond_2d
    const/4 v0, 0x0

    cmpl-float v1, v2, v0

    if-ltz v1, :cond_2e

    iput v2, v8, Lr/d;->S:F

    :cond_2e
    iget v1, v12, Lt/d;->A:F

    cmpl-float v2, v1, v0

    if-ltz v2, :cond_2f

    iput v1, v8, Lr/d;->T:F

    :cond_2f
    :goto_1a
    if-eqz v9, :cond_31

    iget v0, v12, Lt/d;->P:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_30

    iget v2, v12, Lt/d;->Q:I

    if-eq v2, v1, :cond_31

    :cond_30
    iget v1, v12, Lt/d;->Q:I

    iput v0, v8, Lr/d;->N:I

    iput v1, v8, Lr/d;->O:I

    :cond_31
    iget-boolean v0, v12, Lt/d;->V:Z

    const/4 v1, -0x2

    if-nez v0, :cond_34

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_33

    iget-boolean v0, v12, Lt/d;->S:Z

    if-eqz v0, :cond_32

    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lr/d;->w(I)V

    :goto_1b
    const/4 v2, 0x2

    goto :goto_1c

    :cond_32
    const/4 v0, 0x3

    const/4 v2, 0x4

    invoke-virtual {v8, v2}, Lr/d;->w(I)V

    goto :goto_1b

    :goto_1c
    invoke-virtual {v8, v2}, Lr/d;->g(I)Lr/c;

    move-result-object v2

    iget v6, v12, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v6, v2, Lr/c;->e:I

    const/4 v2, 0x4

    invoke-virtual {v8, v2}, Lr/d;->g(I)Lr/c;

    move-result-object v2

    iget v6, v12, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v6, v2, Lr/c;->e:I

    goto :goto_1d

    :cond_33
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lr/d;->w(I)V

    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lr/d;->y(I)V

    goto :goto_1d

    :cond_34
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lr/d;->w(I)V

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v8, v0}, Lr/d;->y(I)V

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v0, v1, :cond_35

    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lr/d;->w(I)V

    :cond_35
    :goto_1d
    iget-boolean v0, v12, Lt/d;->W:Z

    if-nez v0, :cond_38

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_37

    iget-boolean v0, v12, Lt/d;->T:Z

    if-eqz v0, :cond_36

    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lr/d;->x(I)V

    :goto_1e
    const/4 v1, 0x3

    goto :goto_1f

    :cond_36
    const/4 v0, 0x3

    const/4 v1, 0x4

    invoke-virtual {v8, v1}, Lr/d;->x(I)V

    goto :goto_1e

    :goto_1f
    invoke-virtual {v8, v1}, Lr/d;->g(I)Lr/c;

    move-result-object v1

    iget v6, v12, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v6, v1, Lr/c;->e:I

    const/4 v1, 0x5

    invoke-virtual {v8, v1}, Lr/d;->g(I)Lr/c;

    move-result-object v1

    iget v6, v12, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v6, v1, Lr/c;->e:I

    goto :goto_20

    :cond_37
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lr/d;->x(I)V

    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lr/d;->v(I)V

    goto :goto_20

    :cond_38
    const/4 v0, 0x1

    const/4 v2, -0x1

    invoke-virtual {v8, v0}, Lr/d;->x(I)V

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v8, v0}, Lr/d;->v(I)V

    iget v0, v12, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v0, v1, :cond_39

    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lr/d;->x(I)V

    :cond_39
    :goto_20
    iget-object v0, v12, Lt/d;->B:Ljava/lang/String;

    if-eqz v0, :cond_3a

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_3b

    :cond_3a
    const/4 v1, 0x0

    goto/16 :goto_25

    :cond_3b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v6, 0x2c

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-lez v6, :cond_3e

    add-int/lit8 v7, v1, -0x1

    if-ge v6, v7, :cond_3e

    const/4 v7, 0x0

    invoke-virtual {v0, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    const-string v7, "W"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3c

    const/4 v7, 0x0

    goto :goto_21

    :cond_3c
    const-string v7, "H"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3d

    const/4 v7, 0x1

    goto :goto_21

    :cond_3d
    move v7, v2

    :goto_21
    add-int/lit8 v6, v6, 0x1

    goto :goto_22

    :cond_3e
    move v7, v2

    const/4 v6, 0x0

    :goto_22
    const/16 v10, 0x3a

    invoke-virtual {v0, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    if-ltz v10, :cond_40

    add-int/lit8 v1, v1, -0x1

    if-ge v10, v1, :cond_40

    invoke-virtual {v0, v6, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v10, v10, 0x1

    invoke-virtual {v0, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_41

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_41

    :try_start_1
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/4 v6, 0x0

    cmpl-float v10, v1, v6

    if-lez v10, :cond_41

    cmpl-float v10, v0, v6

    if-lez v10, :cond_41

    const/4 v6, 0x1

    if-ne v7, v6, :cond_3f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    goto :goto_23

    :cond_3f
    div-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_23
    const/4 v1, 0x0

    goto :goto_24

    :cond_40
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_41

    :try_start_2
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_23

    :catch_1
    :cond_41
    const/4 v0, 0x0

    goto :goto_23

    :goto_24
    cmpl-float v6, v0, v1

    if-lez v6, :cond_42

    iput v0, v8, Lr/d;->L:F

    iput v7, v8, Lr/d;->M:I

    goto :goto_26

    :goto_25
    iput v1, v8, Lr/d;->L:F

    :cond_42
    :goto_26
    iget v0, v12, Lt/d;->D:F

    iget-object v1, v8, Lr/d;->Z:[F

    const/4 v6, 0x0

    aput v0, v1, v6

    iget v0, v12, Lt/d;->E:F

    const/4 v6, 0x1

    aput v0, v1, v6

    iget v0, v12, Lt/d;->F:I

    iput v0, v8, Lr/d;->X:I

    iget v0, v12, Lt/d;->G:I

    iput v0, v8, Lr/d;->Y:I

    iget v0, v12, Lt/d;->H:I

    iget v1, v12, Lt/d;->J:I

    iget v6, v12, Lt/d;->L:I

    iget v7, v12, Lt/d;->N:F

    iput v0, v8, Lr/d;->j:I

    iput v1, v8, Lr/d;->m:I

    const v1, 0x7fffffff

    if-ne v6, v1, :cond_43

    const/4 v6, 0x0

    :cond_43
    iput v6, v8, Lr/d;->n:I

    iput v7, v8, Lr/d;->o:F

    const/4 v6, 0x0

    cmpl-float v10, v7, v6

    const/high16 v6, 0x3f800000    # 1.0f

    if-lez v10, :cond_44

    cmpg-float v7, v7, v6

    if-gez v7, :cond_44

    if-nez v0, :cond_44

    const/4 v0, 0x2

    iput v0, v8, Lr/d;->j:I

    :cond_44
    iget v0, v12, Lt/d;->I:I

    iget v7, v12, Lt/d;->K:I

    iget v10, v12, Lt/d;->M:I

    iget v12, v12, Lt/d;->O:F

    iput v0, v8, Lr/d;->k:I

    iput v7, v8, Lr/d;->p:I

    if-ne v10, v1, :cond_45

    const/4 v10, 0x0

    :cond_45
    iput v10, v8, Lr/d;->q:I

    iput v12, v8, Lr/d;->r:F

    const/4 v1, 0x0

    cmpl-float v1, v12, v1

    if-lez v1, :cond_46

    cmpg-float v1, v12, v6

    if-gez v1, :cond_46

    if-nez v0, :cond_46

    const/4 v0, 0x2

    iput v0, v8, Lr/d;->k:I

    goto :goto_27

    :cond_46
    const/4 v0, 0x2

    :goto_27
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v10, v23

    move-object/from16 v6, v24

    goto/16 :goto_12

    :cond_47
    move-object/from16 v24, v6

    move-object/from16 v0, v24

    if-eqz v3, :cond_4b

    iget-object v1, v0, Lr/e;->e0:Lv0/m;

    iget-object v1, v1, Lv0/m;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v2, v0, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v5, 0x0

    :goto_28
    if-ge v5, v2, :cond_4a

    iget-object v3, v0, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr/d;

    iget-object v4, v3, Lr/d;->c0:[I

    const/4 v6, 0x0

    aget v7, v4, v6

    const/4 v6, 0x3

    const/4 v8, 0x4

    if-eq v7, v6, :cond_48

    if-eq v7, v8, :cond_48

    const/4 v7, 0x1

    aget v4, v4, v7

    if-eq v4, v6, :cond_48

    if-ne v4, v8, :cond_49

    :cond_48
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_49
    add-int/lit8 v5, v5, 0x1

    goto :goto_28

    :cond_4a
    iget-object v1, v0, Lr/e;->f0:Ls/e;

    const/4 v2, 0x1

    iput-boolean v2, v1, Ls/e;->b:Z

    :cond_4b
    :goto_29
    move-object/from16 v1, p0

    goto :goto_2a

    :cond_4c
    move-object v0, v6

    goto :goto_29

    :goto_2a
    iget v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    move/from16 v3, p1

    move/from16 v4, p2

    invoke-virtual {v1, v0, v2, v3, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->e(Lr/e;III)V

    invoke-virtual {v0}, Lr/d;->l()I

    move-result v2

    invoke-virtual {v0}, Lr/d;->i()I

    move-result v5

    iget-boolean v6, v0, Lr/e;->q0:Z

    iget-boolean v0, v0, Lr/e;->r0:Z

    iget-object v7, v1, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lq1/a;

    iget v8, v7, Lq1/a;->d:I

    iget v7, v7, Lq1/a;->c:I

    add-int/2addr v2, v7

    add-int/2addr v5, v8

    const/4 v7, 0x0

    invoke-static {v2, v3, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    invoke-static {v5, v4, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v3

    const v4, 0xffffff

    and-int/2addr v2, v4

    and-int/2addr v3, v4

    iget v4, v1, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget v4, v1, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/high16 v4, 0x1000000

    if-eqz v6, :cond_4d

    or-int/2addr v2, v4

    :cond_4d
    if-eqz v0, :cond_4e

    or-int/2addr v3, v4

    :cond_4e
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)Lr/d;

    move-result-object v0

    instance-of v1, p1, Lt/m;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    instance-of v0, v0, Lr/h;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lt/d;

    new-instance v1, Lr/h;

    invoke-direct {v1}, Lr/h;-><init>()V

    iput-object v1, v0, Lt/d;->k0:Lr/d;

    iput-boolean v2, v0, Lt/d;->Y:Z

    iget v0, v0, Lt/d;->R:I

    invoke-virtual {v1, v0}, Lr/h;->B(I)V

    :cond_0
    instance-of v0, p1, Lt/b;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lt/b;

    invoke-virtual {v0}, Lt/b;->g()V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lt/d;

    iput-boolean v2, v1, Lt/d;->Z:Z

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)Lr/d;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    iget-object v1, v1, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    iput-object v1, v0, Lr/d;->I:Lr/d;

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    return-void
.end method

.method public final removeView(Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public final requestLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Z

    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setConstraintSet(Lt/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lt/k;

    return-void
.end method

.method public setId(I)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    invoke-super {p0, p1}, Landroid/view/View;->setId(I)V

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v1, p1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setOnConstraintsChanged(Lt/l;)V
    .locals 0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:Lv0/r;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:Lr/e;

    iput p1, v0, Lr/e;->p0:I

    const/16 v0, 0x100

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    sput-boolean p1, Lq/e;->p:Z

    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
