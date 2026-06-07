.class public final Lv0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF/c;


# static fields
.field public static f:Lv0/m;


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lv0/m;->b:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    .line 16
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LZ/y;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lv0/m;->b:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lv0/m;->c:Ljava/lang/Object;

    .line 45
    new-instance p1, LZ/b;

    invoke-direct {p1}, LZ/b;-><init>()V

    iput-object p1, p0, Lv0/m;->d:Ljava/lang/Object;

    .line 46
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lv0/m;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lv0/m;->b:I

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lv0/m;->c:Ljava/lang/Object;

    .line 49
    iput-object p2, p0, Lv0/m;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lv0/m;->b:I

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Lf/E;

    .line 52
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    .line 54
    iput-object p1, p0, Lv0/m;->c:Ljava/lang/Object;

    .line 55
    iput-object p2, p0, Lv0/m;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/e;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lv0/m;->b:I

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/m;->c:Ljava/lang/Object;

    iput-object p2, p0, Lv0/m;->d:Ljava/lang/Object;

    iput-object p3, p0, Lv0/m;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/r;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lv0/m;->b:I

    const-string v0, "provider"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p1}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    .line 3
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lv0/m;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lv0/m;->b:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lv0/m;->c:Ljava/lang/Object;

    .line 6
    new-instance v0, Lv0/b;

    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, p1, v1}, Lv0/b;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    .line 8
    new-instance v0, Lv0/h;

    const/4 v1, 0x2

    .line 9
    invoke-direct {v0, p1, v1}, Lv0/h;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    .line 10
    iput-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    .line 11
    new-instance v0, Lv0/h;

    const/4 v1, 0x3

    .line 12
    invoke-direct {v0, p1, v1}, Lv0/h;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    .line 13
    iput-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp1/a;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lv0/m;->b:I

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, LA1/i;

    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, v1}, LA1/i;-><init>(I)V

    .line 38
    iput v1, v0, LA1/i;->b:I

    const/4 v1, 0x1

    .line 39
    iput v1, v0, LA1/i;->c:I

    .line 40
    iput-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    .line 42
    iput-object p1, p0, Lv0/m;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp1/b;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v2, 0xa

    iput v2, v0, Lv0/m;->b:I

    .line 17
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/16 v3, 0x8

    .line 18
    iget v4, v1, Lp1/b;->c:I

    if-lt v4, v3, :cond_9

    const/16 v3, 0x90

    if-gt v4, v3, :cond_9

    and-int/lit8 v3, v4, 0x1

    if-nez v3, :cond_9

    .line 19
    sget-object v5, Lt1/b;->h:[Lt1/b;

    if-nez v3, :cond_8

    .line 20
    iget v3, v1, Lp1/b;->b:I

    and-int/lit8 v5, v3, 0x1

    if-nez v5, :cond_8

    .line 21
    sget-object v5, Lt1/b;->h:[Lt1/b;

    const/4 v6, 0x0

    :goto_0
    const/16 v7, 0x1e

    if-ge v6, v7, :cond_7

    aget-object v7, v5, v6

    .line 22
    iget v8, v7, Lt1/b;->b:I

    if-ne v8, v4, :cond_6

    iget v9, v7, Lt1/b;->c:I

    if-ne v9, v3, :cond_6

    .line 23
    iput-object v7, v0, Lv0/m;->e:Ljava/lang/Object;

    if-ne v4, v8, :cond_5

    .line 24
    iget v3, v7, Lt1/b;->d:I

    div-int/2addr v8, v3

    .line 25
    iget v4, v7, Lt1/b;->e:I

    div-int/2addr v9, v4

    mul-int v5, v8, v3

    mul-int v6, v9, v4

    .line 26
    new-instance v7, Lp1/b;

    invoke-direct {v7, v6, v5}, Lp1/b;-><init>(II)V

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v8, :cond_4

    mul-int v6, v5, v3

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_3

    mul-int v11, v10, v4

    const/4 v12, 0x0

    :goto_3
    if-ge v12, v3, :cond_2

    add-int/lit8 v13, v3, 0x2

    mul-int/2addr v13, v5

    add-int/lit8 v13, v13, 0x1

    add-int/2addr v13, v12

    add-int v14, v6, v12

    const/4 v15, 0x0

    :goto_4
    if-ge v15, v4, :cond_1

    add-int/lit8 v16, v4, 0x2

    mul-int v16, v16, v10

    add-int/lit8 v16, v16, 0x1

    add-int v2, v16, v15

    .line 27
    invoke-virtual {v1, v2, v13}, Lp1/b;->b(II)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int v2, v11, v15

    .line 28
    invoke-virtual {v7, v2, v14}, Lp1/b;->f(II)V

    :cond_0
    add-int/lit8 v15, v15, 0x1

    goto :goto_4

    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 29
    :cond_4
    iput-object v7, v0, Lv0/m;->c:Ljava/lang/Object;

    .line 30
    new-instance v1, Lp1/b;

    iget v2, v7, Lp1/b;->b:I

    iget v3, v7, Lp1/b;->c:I

    invoke-direct {v1, v2, v3}, Lp1/b;-><init>(II)V

    iput-object v1, v0, Lv0/m;->d:Ljava/lang/Object;

    return-void

    .line 31
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Dimension of bitMatrix must match the version size"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 32
    :cond_7
    invoke-static {}, Lj1/d;->a()Lj1/d;

    move-result-object v1

    throw v1

    .line 33
    :cond_8
    invoke-static {}, Lj1/d;->a()Lj1/d;

    move-result-object v1

    throw v1

    .line 34
    :cond_9
    invoke-static {}, Lj1/d;->a()Lj1/d;

    move-result-object v1

    throw v1
.end method

.method public constructor <init>(Lr/e;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lv0/m;->b:I

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    .line 58
    new-instance v0, Ls/b;

    .line 59
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    .line 61
    iput-object p1, p0, Lv0/m;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv0/i;LU0/e;Landroidx/emoji2/text/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lv0/m;->b:I

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p2, p0, Lv0/m;->c:Ljava/lang/Object;

    .line 64
    iput-object p1, p0, Lv0/m;->d:Ljava/lang/Object;

    .line 65
    iput-object p3, p0, Lv0/m;->e:Ljava/lang/Object;

    return-void
.end method

.method public static F(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lv0/m;
    .locals 1

    new-instance v0, Lv0/m;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lv0/m;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v0
.end method

.method public static g(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 7

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result p1

    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result p1

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    const/4 v3, -0x1

    if-eq p1, v3, :cond_6

    if-eq v2, v3, :cond_6

    if-eq p1, v2, :cond_1

    goto :goto_1

    :cond_1
    const-class v3, Landroidx/emoji2/text/u;

    invoke-interface {p0, p1, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroidx/emoji2/text/u;

    if-eqz v2, :cond_6

    array-length v3, v2

    if-lez v3, :cond_6

    array-length v3, v2

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_6

    aget-object v5, v2, v4

    invoke-interface {p0, v5}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-interface {p0, v5}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    if-eqz p2, :cond_2

    if-eq v6, p1, :cond_4

    :cond_2
    if-nez p2, :cond_3

    if-eq v5, p1, :cond_4

    :cond_3
    if-le p1, v6, :cond_5

    if-ge p1, v5, :cond_5

    :cond_4
    invoke-interface {p0, v6, v5}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    return v0

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v1
.end method

.method public static j(IILp1/a;)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v0, p1, :cond_1

    add-int v2, p0, v0

    invoke-virtual {p2, v2}, Lp1/a;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    sub-int v2, p1, v0

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    shl-int v2, v3, v2

    or-int/2addr v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method


# virtual methods
.method public A(I)Z
    .locals 5

    add-int/lit8 v0, p1, 0x1

    iget-object v1, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v1, Lp1/a;

    iget v2, v1, Lp1/a;->c:I

    const/4 v3, 0x0

    if-le v0, v2, :cond_0

    return v3

    :cond_0
    move v0, v3

    :goto_0
    const/4 v2, 0x5

    if-ge v0, v2, :cond_3

    add-int v2, v0, p1

    iget v4, v1, Lp1/a;->c:I

    if-ge v2, v4, :cond_3

    const/4 v4, 0x2

    if-ne v0, v4, :cond_1

    add-int/lit8 v2, p1, 0x2

    invoke-virtual {v1, v2}, Lp1/a;->a(I)Z

    move-result v2

    if-nez v2, :cond_2

    return v3

    :cond_1
    invoke-virtual {v1, v2}, Lp1/a;->a(I)Z

    move-result v2

    if-eqz v2, :cond_2

    return v3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public B(Landroid/view/View;)Z
    .locals 1

    iget-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public C(Landroidx/fragment/app/G;)V
    .locals 3

    iget-object v0, p1, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-object v1, v0, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    iget-object v2, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {p1, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public D(Landroidx/fragment/app/G;)V
    .locals 3

    iget-object p1, p1, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-boolean v0, p1, Landroidx/fragment/app/n;->B:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/D;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/D;->b(Landroidx/fragment/app/n;)V

    :cond_0
    iget-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    iget-object v1, p1, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/G;

    if-nez v0, :cond_1

    return-void

    :cond_1
    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public E(Lq1/a;Lr/d;Z)Z
    .locals 6

    iget-object v0, p2, Lr/d;->c0:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    iget-object v3, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v3, Ls/b;

    iput v2, v3, Ls/b;->a:I

    const/4 v2, 0x1

    aget v0, v0, v2

    iput v0, v3, Ls/b;->b:I

    invoke-virtual {p2}, Lr/d;->l()I

    move-result v0

    iput v0, v3, Ls/b;->c:I

    invoke-virtual {p2}, Lr/d;->i()I

    move-result v0

    iput v0, v3, Ls/b;->d:I

    iput-boolean v1, v3, Ls/b;->i:Z

    iput-boolean p3, v3, Ls/b;->j:Z

    iget p3, v3, Ls/b;->a:I

    const/4 v0, 0x3

    if-ne p3, v0, :cond_0

    move p3, v2

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    iget v4, v3, Ls/b;->b:I

    if-ne v4, v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const/4 v4, 0x0

    if-eqz p3, :cond_2

    iget p3, p2, Lr/d;->L:F

    cmpl-float p3, p3, v4

    if-lez p3, :cond_2

    move p3, v2

    goto :goto_2

    :cond_2
    move p3, v1

    :goto_2
    if-eqz v0, :cond_3

    iget v0, p2, Lr/d;->L:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iget-object v4, p2, Lr/d;->l:[I

    const/4 v5, 0x4

    if-eqz p3, :cond_4

    aget p3, v4, v1

    if-ne p3, v5, :cond_4

    iput v2, v3, Ls/b;->a:I

    :cond_4
    if-eqz v0, :cond_5

    aget p3, v4, v2

    if-ne p3, v5, :cond_5

    iput v2, v3, Ls/b;->b:I

    :cond_5
    invoke-virtual {p1, p2, v3}, Lq1/a;->d(Lr/d;Ls/b;)V

    iget p1, v3, Ls/b;->e:I

    invoke-virtual {p2, p1}, Lr/d;->y(I)V

    iget p1, v3, Ls/b;->f:I

    invoke-virtual {p2, p1}, Lr/d;->v(I)V

    iget-boolean p1, v3, Ls/b;->h:Z

    iput-boolean p1, p2, Lr/d;->w:Z

    iget p1, v3, Ls/b;->g:I

    iput p1, p2, Lr/d;->P:I

    if-lez p1, :cond_6

    goto :goto_4

    :cond_6
    move v2, v1

    :goto_4
    iput-boolean v2, p2, Lr/d;->w:Z

    iput-boolean v1, v3, Ls/b;->j:Z

    iget-boolean p1, v3, Ls/b;->i:Z

    return p1
.end method

.method public G(Landroidx/lifecycle/l;)V
    .locals 2

    iget-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/L;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/L;->run()V

    :cond_0
    new-instance v0, Landroidx/lifecycle/L;

    iget-object v1, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/t;

    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/L;-><init>(Landroidx/lifecycle/t;Landroidx/lifecycle/l;)V

    iput-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    iget-object p1, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public H(IIII)Z
    .locals 0

    if-gez p1, :cond_0

    add-int/2addr p1, p3

    add-int/lit8 p3, p3, 0x4

    and-int/lit8 p3, p3, 0x7

    rsub-int/lit8 p3, p3, 0x4

    add-int/2addr p2, p3

    :cond_0
    if-gez p2, :cond_1

    add-int/2addr p2, p4

    add-int/lit8 p4, p4, 0x4

    and-int/lit8 p3, p4, 0x7

    rsub-int/lit8 p3, p3, 0x4

    add-int/2addr p1, p3

    :cond_1
    iget-object p3, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast p3, Lp1/b;

    invoke-virtual {p3, p2, p1}, Lp1/b;->f(II)V

    iget-object p3, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast p3, Lp1/b;

    invoke-virtual {p3, p2, p1}, Lp1/b;->b(II)Z

    move-result p1

    return p1
.end method

.method public I(IIII)I
    .locals 5

    add-int/lit8 v0, p1, -0x2

    add-int/lit8 v1, p2, -0x2

    invoke-virtual {p0, v0, v1, p3, p4}, Lv0/m;->H(IIII)Z

    move-result v2

    shl-int/lit8 v2, v2, 0x1

    add-int/lit8 v3, p2, -0x1

    invoke-virtual {p0, v0, v3, p3, p4}, Lv0/m;->H(IIII)Z

    move-result v0

    if-eqz v0, :cond_0

    or-int/lit8 v2, v2, 0x1

    :cond_0
    shl-int/lit8 v0, v2, 0x1

    add-int/lit8 v2, p1, -0x1

    invoke-virtual {p0, v2, v1, p3, p4}, Lv0/m;->H(IIII)Z

    move-result v4

    if-eqz v4, :cond_1

    or-int/lit8 v0, v0, 0x1

    :cond_1
    shl-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v2, v3, p3, p4}, Lv0/m;->H(IIII)Z

    move-result v4

    if-eqz v4, :cond_2

    or-int/lit8 v0, v0, 0x1

    :cond_2
    shl-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v2, p2, p3, p4}, Lv0/m;->H(IIII)Z

    move-result v2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x1

    :cond_3
    shl-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, p1, v1, p3, p4}, Lv0/m;->H(IIII)Z

    move-result v1

    if-eqz v1, :cond_4

    or-int/lit8 v0, v0, 0x1

    :cond_4
    shl-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, p1, v3, p3, p4}, Lv0/m;->H(IIII)Z

    move-result v1

    if-eqz v1, :cond_5

    or-int/lit8 v0, v0, 0x1

    :cond_5
    shl-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, p1, p2, p3, p4}, Lv0/m;->H(IIII)Z

    move-result p1

    if-eqz p1, :cond_6

    or-int/lit8 v0, v0, 0x1

    :cond_6
    return v0
.end method

.method public J()V
    .locals 1

    iget-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public K(Lr/e;II)V
    .locals 3

    iget v0, p1, Lr/d;->Q:I

    iget v1, p1, Lr/d;->R:I

    const/4 v2, 0x0

    iput v2, p1, Lr/d;->Q:I

    iput v2, p1, Lr/d;->R:I

    invoke-virtual {p1, p2}, Lr/d;->y(I)V

    invoke-virtual {p1, p3}, Lr/d;->v(I)V

    if-gez v0, :cond_0

    iput v2, p1, Lr/d;->Q:I

    goto :goto_0

    :cond_0
    iput v0, p1, Lr/d;->Q:I

    :goto_0
    if-gez v1, :cond_1

    iput v2, p1, Lr/d;->R:I

    goto :goto_1

    :cond_1
    iput v1, p1, Lr/d;->R:I

    :goto_1
    iget-object p1, p0, Lv0/m;->e:Ljava/lang/Object;

    check-cast p1, Lr/e;

    invoke-virtual {p1}, Lr/e;->E()V

    return-void
.end method

.method public L(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, LZ/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object p1

    if-eqz p1, :cond_1

    iget v1, p1, LZ/W;->p:I

    iget-object v0, v0, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    move-result v2

    if-eqz v2, :cond_0

    iput v1, p1, LZ/W;->q:I

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->q0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, LJ/T;->a:Ljava/util/WeakHashMap;

    iget-object v0, p1, LZ/W;->a:Landroid/view/View;

    invoke-static {v0, v1}, LJ/B;->s(Landroid/view/View;I)V

    :goto_0
    const/4 v0, 0x0

    iput v0, p1, LZ/W;->p:I

    :cond_1
    return-void
.end method

.method public a(Landroidx/fragment/app/n;)V
    .locals 3

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/fragment/app/n;->l:Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment already added: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Landroid/view/View;IZ)V
    .locals 2

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, LZ/y;

    if-gez p2, :cond_0

    iget-object p2, v0, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Lv0/m;->v(I)I

    move-result p2

    :goto_0
    iget-object v1, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v1, LZ/b;

    invoke-virtual {v1, p2, p3}, LZ/b;->e(IZ)V

    if-eqz p3, :cond_1

    invoke-virtual {p0, p1}, Lv0/m;->z(Landroid/view/View;)V

    :cond_1
    iget-object p3, v0, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    return-void
.end method

.method public c(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
    .locals 2

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, LZ/y;

    if-gez p2, :cond_0

    iget-object p2, v0, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Lv0/m;->v(I)I

    move-result p2

    :goto_0
    iget-object v1, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v1, LZ/b;

    invoke-virtual {v1, p2, p4}, LZ/b;->e(IZ)V

    if-eqz p4, :cond_1

    invoke-virtual {p0, p1}, Lv0/m;->z(Landroid/view/View;)V

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object p4

    iget-object v0, v0, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p4, :cond_4

    invoke-virtual {p4}, LZ/W;->l()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p4}, LZ/W;->q()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Called attach on a child which is not detached: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iget v1, p4, LZ/W;->j:I

    and-int/lit16 v1, v1, -0x101

    iput v1, p4, LZ/W;->j:I

    :cond_4
    invoke-static {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public d(Ljava/lang/StringBuilder;I)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-virtual {p0, v1, p2}, Lv0/m;->e(Ljava/lang/String;I)LA1/k;

    move-result-object v1

    iget-object v2, v1, LA1/k;->b:Ljava/lang/String;

    invoke-static {v2}, LA1/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-boolean v2, v1, LA1/k;->d:Z

    if-eqz v2, :cond_1

    iget v2, v1, LA1/k;->c:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    iget v1, v1, LA1/m;->a:I

    if-eq p2, v1, :cond_2

    move p2, v1

    move-object v1, v2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;I)LA1/k;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lv0/m;->e:Ljava/lang/Object;

    check-cast v2, Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    if-eqz v1, :cond_0

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, v0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v1, LA1/i;

    move/from16 v4, p2

    iput v4, v1, LA1/i;->b:I

    :goto_0
    iget v4, v1, LA1/i;->b:I

    iget v5, v1, LA1/i;->c:I

    iget-object v6, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v6, Lp1/a;

    const/16 v7, 0x24

    const/4 v9, 0x5

    const/4 v11, 0x2

    const/16 v16, 0x2f

    const/16 v12, 0x3a

    const/16 v13, 0x20

    const/16 v14, 0xf

    const/16 v15, 0x3f

    const/16 v3, 0x10

    if-ne v5, v11, :cond_e

    :goto_1
    iget v5, v1, LA1/i;->b:I

    add-int/lit8 v11, v5, 0x5

    iget v8, v6, Lp1/a;->c:I

    if-le v11, v8, :cond_1

    goto/16 :goto_6

    :cond_1
    invoke-static {v5, v9, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v11

    const/4 v10, 0x6

    if-lt v11, v9, :cond_2

    if-ge v11, v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v11, v5, 0x6

    if-le v11, v8, :cond_3

    goto/16 :goto_6

    :cond_3
    invoke-static {v5, v10, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v5

    if-lt v5, v3, :cond_8

    if-ge v5, v15, :cond_8

    :goto_2
    iget v5, v1, LA1/i;->b:I

    invoke-static {v5, v9, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v8

    if-ne v8, v14, :cond_4

    new-instance v8, LA1/j;

    add-int/lit8 v5, v5, 0x5

    invoke-direct {v8, v7, v5}, LA1/j;-><init>(CI)V

    goto :goto_5

    :cond_4
    if-lt v8, v9, :cond_5

    if-ge v8, v14, :cond_5

    new-instance v10, LA1/j;

    add-int/lit8 v5, v5, 0x5

    add-int/lit8 v8, v8, 0x2b

    int-to-char v8, v8

    invoke-direct {v10, v8, v5}, LA1/j;-><init>(CI)V

    :goto_3
    move-object v8, v10

    goto :goto_5

    :cond_5
    invoke-static {v5, v10, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v8

    if-lt v8, v13, :cond_6

    if-ge v8, v12, :cond_6

    new-instance v10, LA1/j;

    add-int/lit8 v5, v5, 0x6

    add-int/lit8 v8, v8, 0x21

    int-to-char v8, v8

    invoke-direct {v10, v8, v5}, LA1/j;-><init>(CI)V

    goto :goto_3

    :cond_6
    packed-switch v8, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Decoding invalid alphanumeric value: "

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    move/from16 v8, v16

    goto :goto_4

    :pswitch_1
    const/16 v8, 0x2e

    goto :goto_4

    :pswitch_2
    const/16 v8, 0x2d

    goto :goto_4

    :pswitch_3
    const/16 v8, 0x2c

    goto :goto_4

    :pswitch_4
    const/16 v8, 0x2a

    :goto_4
    new-instance v10, LA1/j;

    add-int/lit8 v5, v5, 0x6

    invoke-direct {v10, v8, v5}, LA1/j;-><init>(CI)V

    goto :goto_3

    :goto_5
    iget v5, v8, LA1/m;->a:I

    iput v5, v1, LA1/i;->b:I

    iget-char v8, v8, LA1/j;->b:C

    if-ne v8, v7, :cond_7

    new-instance v3, LA1/k;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, v5}, LA1/k;-><init>(Ljava/lang/String;I)V

    new-instance v5, LA1/h;

    const/4 v6, 0x1

    invoke-direct {v5, v3, v6}, LA1/h;-><init>(Ljava/lang/Object;Z)V

    goto :goto_c

    :cond_7
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    :cond_8
    :goto_6
    iget v3, v1, LA1/i;->b:I

    add-int/lit8 v5, v3, 0x3

    iget v7, v6, Lp1/a;->c:I

    if-le v5, v7, :cond_9

    goto :goto_8

    :cond_9
    :goto_7
    if-ge v3, v5, :cond_c

    invoke-virtual {v6, v3}, Lp1/a;->a(I)Z

    move-result v7

    if-eqz v7, :cond_b

    :goto_8
    iget v3, v1, LA1/i;->b:I

    invoke-virtual {v0, v3}, Lv0/m;->A(I)Z

    move-result v3

    if-eqz v3, :cond_d

    iget v3, v1, LA1/i;->b:I

    add-int/lit8 v5, v3, 0x5

    if-ge v5, v8, :cond_a

    add-int/lit8 v3, v3, 0x5

    iput v3, v1, LA1/i;->b:I

    :goto_9
    const/4 v7, 0x3

    goto :goto_a

    :cond_a
    iput v8, v1, LA1/i;->b:I

    goto :goto_9

    :goto_a
    iput v7, v1, LA1/i;->c:I

    goto :goto_b

    :cond_b
    const/4 v7, 0x3

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_c
    const/4 v7, 0x3

    iget v3, v1, LA1/i;->b:I

    add-int/2addr v3, v7

    iput v3, v1, LA1/i;->b:I

    const/4 v3, 0x1

    iput v3, v1, LA1/i;->c:I

    :cond_d
    :goto_b
    new-instance v5, LA1/h;

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-direct {v5, v6, v3}, LA1/h;-><init>(Ljava/lang/Object;Z)V

    :goto_c
    iget-boolean v3, v5, LA1/h;->a:Z

    :goto_d
    move-object v6, v5

    const/4 v5, 0x0

    goto/16 :goto_22

    :cond_e
    const/16 v8, 0x8

    const/4 v10, 0x7

    const/4 v12, 0x3

    if-ne v5, v12, :cond_1f

    :goto_e
    iget v5, v1, LA1/i;->b:I

    add-int/lit8 v12, v5, 0x5

    iget v13, v6, Lp1/a;->c:I

    if-le v12, v13, :cond_f

    goto/16 :goto_12

    :cond_f
    invoke-static {v5, v9, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v12

    const/16 v15, 0x74

    const/16 v11, 0x40

    if-lt v12, v9, :cond_10

    if-ge v12, v3, :cond_10

    goto :goto_f

    :cond_10
    add-int/lit8 v12, v5, 0x7

    if-le v12, v13, :cond_11

    goto/16 :goto_12

    :cond_11
    invoke-static {v5, v10, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v12

    if-lt v12, v11, :cond_12

    if-ge v12, v15, :cond_12

    goto :goto_f

    :cond_12
    add-int/lit8 v12, v5, 0x8

    if-le v12, v13, :cond_13

    goto/16 :goto_12

    :cond_13
    invoke-static {v5, v8, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v5

    const/16 v12, 0xe8

    if-lt v5, v12, :cond_19

    const/16 v12, 0xfd

    if-ge v5, v12, :cond_19

    :goto_f
    iget v5, v1, LA1/i;->b:I

    invoke-static {v5, v9, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v12

    if-ne v12, v14, :cond_14

    new-instance v11, LA1/j;

    add-int/lit8 v5, v5, 0x5

    invoke-direct {v11, v7, v5}, LA1/j;-><init>(CI)V

    goto/16 :goto_11

    :cond_14
    if-lt v12, v9, :cond_15

    if-ge v12, v14, :cond_15

    new-instance v11, LA1/j;

    add-int/lit8 v5, v5, 0x5

    add-int/lit8 v12, v12, 0x2b

    int-to-char v12, v12

    invoke-direct {v11, v12, v5}, LA1/j;-><init>(CI)V

    goto/16 :goto_11

    :cond_15
    invoke-static {v5, v10, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v12

    const/16 v13, 0x5a

    if-lt v12, v11, :cond_16

    if-ge v12, v13, :cond_16

    new-instance v11, LA1/j;

    add-int/lit8 v5, v5, 0x7

    add-int/lit8 v12, v12, 0x1

    int-to-char v12, v12

    invoke-direct {v11, v12, v5}, LA1/j;-><init>(CI)V

    goto/16 :goto_11

    :cond_16
    if-lt v12, v13, :cond_17

    if-ge v12, v15, :cond_17

    new-instance v11, LA1/j;

    add-int/lit8 v5, v5, 0x7

    add-int/lit8 v12, v12, 0x7

    int-to-char v12, v12

    invoke-direct {v11, v12, v5}, LA1/j;-><init>(CI)V

    goto/16 :goto_11

    :cond_17
    invoke-static {v5, v8, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v11

    packed-switch v11, :pswitch_data_1

    invoke-static {}, Lj1/d;->a()Lj1/d;

    move-result-object v1

    throw v1

    :pswitch_5
    const/16 v11, 0x20

    goto :goto_10

    :pswitch_6
    const/16 v11, 0x5f

    goto :goto_10

    :pswitch_7
    const/16 v11, 0x3f

    goto :goto_10

    :pswitch_8
    const/16 v11, 0x3e

    goto :goto_10

    :pswitch_9
    const/16 v11, 0x3d

    goto :goto_10

    :pswitch_a
    const/16 v11, 0x3c

    goto :goto_10

    :pswitch_b
    const/16 v11, 0x3b

    goto :goto_10

    :pswitch_c
    const/16 v11, 0x3a

    goto :goto_10

    :pswitch_d
    move/from16 v11, v16

    goto :goto_10

    :pswitch_e
    const/16 v11, 0x2e

    goto :goto_10

    :pswitch_f
    const/16 v11, 0x2d

    goto :goto_10

    :pswitch_10
    const/16 v11, 0x2c

    goto :goto_10

    :pswitch_11
    const/16 v11, 0x2b

    goto :goto_10

    :pswitch_12
    const/16 v11, 0x2a

    goto :goto_10

    :pswitch_13
    const/16 v11, 0x29

    goto :goto_10

    :pswitch_14
    const/16 v11, 0x28

    goto :goto_10

    :pswitch_15
    const/16 v11, 0x27

    goto :goto_10

    :pswitch_16
    const/16 v11, 0x26

    goto :goto_10

    :pswitch_17
    const/16 v11, 0x25

    goto :goto_10

    :pswitch_18
    const/16 v11, 0x22

    goto :goto_10

    :pswitch_19
    const/16 v11, 0x21

    :goto_10
    new-instance v12, LA1/j;

    add-int/lit8 v5, v5, 0x8

    invoke-direct {v12, v11, v5}, LA1/j;-><init>(CI)V

    move-object v11, v12

    :goto_11
    iget v5, v11, LA1/m;->a:I

    iput v5, v1, LA1/i;->b:I

    iget-char v11, v11, LA1/j;->b:C

    if-ne v11, v7, :cond_18

    new-instance v3, LA1/k;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, v5}, LA1/k;-><init>(Ljava/lang/String;I)V

    new-instance v5, LA1/h;

    const/4 v6, 0x1

    invoke-direct {v5, v3, v6}, LA1/h;-><init>(Ljava/lang/Object;Z)V

    goto :goto_18

    :cond_18
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v11, 0x2

    const/16 v13, 0x20

    const/16 v15, 0x3f

    goto/16 :goto_e

    :cond_19
    :goto_12
    iget v3, v1, LA1/i;->b:I

    add-int/lit8 v5, v3, 0x3

    iget v7, v6, Lp1/a;->c:I

    if-le v5, v7, :cond_1a

    goto :goto_14

    :cond_1a
    :goto_13
    if-ge v3, v5, :cond_1d

    invoke-virtual {v6, v3}, Lp1/a;->a(I)Z

    move-result v7

    if-eqz v7, :cond_1c

    :goto_14
    iget v3, v1, LA1/i;->b:I

    invoke-virtual {v0, v3}, Lv0/m;->A(I)Z

    move-result v3

    if-eqz v3, :cond_1e

    iget v3, v1, LA1/i;->b:I

    add-int/lit8 v5, v3, 0x5

    if-ge v5, v13, :cond_1b

    add-int/lit8 v3, v3, 0x5

    iput v3, v1, LA1/i;->b:I

    :goto_15
    const/4 v3, 0x2

    goto :goto_16

    :cond_1b
    iput v13, v1, LA1/i;->b:I

    goto :goto_15

    :goto_16
    iput v3, v1, LA1/i;->c:I

    goto :goto_17

    :cond_1c
    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_1d
    iget v3, v1, LA1/i;->b:I

    const/4 v5, 0x3

    add-int/2addr v3, v5

    iput v3, v1, LA1/i;->b:I

    const/4 v3, 0x1

    iput v3, v1, LA1/i;->c:I

    :cond_1e
    :goto_17
    new-instance v3, LA1/h;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v3, v6, v5}, LA1/h;-><init>(Ljava/lang/Object;Z)V

    move-object v5, v3

    :goto_18
    iget-boolean v3, v5, LA1/h;->a:Z

    goto/16 :goto_d

    :cond_1f
    :goto_19
    iget v3, v1, LA1/i;->b:I

    add-int/lit8 v5, v3, 0x7

    iget v7, v6, Lp1/a;->c:I

    const/4 v9, 0x4

    if-le v5, v7, :cond_20

    add-int/lit8 v3, v3, 0x4

    if-gt v3, v7, :cond_28

    goto :goto_1b

    :cond_20
    move v5, v3

    :goto_1a
    add-int/lit8 v11, v3, 0x3

    if-ge v5, v11, :cond_22

    invoke-virtual {v6, v5}, Lp1/a;->a(I)Z

    move-result v11

    if-eqz v11, :cond_21

    goto :goto_1b

    :cond_21
    add-int/lit8 v5, v5, 0x1

    goto :goto_1a

    :cond_22
    invoke-virtual {v6, v11}, Lp1/a;->a(I)Z

    move-result v3

    if-eqz v3, :cond_28

    :goto_1b
    iget v3, v1, LA1/i;->b:I

    add-int/lit8 v5, v3, 0x7

    const/16 v11, 0xa

    if-le v5, v7, :cond_24

    invoke-static {v3, v9, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v3

    if-nez v3, :cond_23

    new-instance v3, LA1/l;

    invoke-direct {v3, v7, v11, v11}, LA1/l;-><init>(III)V

    goto :goto_1c

    :cond_23
    new-instance v5, LA1/l;

    add-int/lit8 v3, v3, -0x1

    invoke-direct {v5, v7, v3, v11}, LA1/l;-><init>(III)V

    move-object v3, v5

    goto :goto_1c

    :cond_24
    invoke-static {v3, v10, v6}, Lv0/m;->j(IILp1/a;)I

    move-result v3

    sub-int/2addr v3, v8

    div-int/lit8 v7, v3, 0xb

    rem-int/lit8 v3, v3, 0xb

    new-instance v9, LA1/l;

    invoke-direct {v9, v5, v7, v3}, LA1/l;-><init>(III)V

    move-object v3, v9

    :goto_1c
    iget v5, v3, LA1/m;->a:I

    iput v5, v1, LA1/i;->b:I

    iget v7, v3, LA1/l;->c:I

    iget v3, v3, LA1/l;->b:I

    if-ne v3, v11, :cond_26

    if-ne v7, v11, :cond_25

    new-instance v3, LA1/k;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, v5}, LA1/k;-><init>(Ljava/lang/String;I)V

    goto :goto_1d

    :cond_25
    new-instance v3, LA1/k;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v5, v7, v6}, LA1/k;-><init>(IILjava/lang/String;)V

    :goto_1d
    new-instance v5, LA1/h;

    const/4 v6, 0x1

    invoke-direct {v5, v3, v6}, LA1/h;-><init>(Ljava/lang/Object;Z)V

    :goto_1e
    move-object v3, v5

    const/4 v5, 0x0

    goto :goto_21

    :cond_26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-ne v7, v11, :cond_27

    new-instance v3, LA1/k;

    iget v5, v1, LA1/i;->b:I

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, v5}, LA1/k;-><init>(Ljava/lang/String;I)V

    new-instance v5, LA1/h;

    const/4 v11, 0x1

    invoke-direct {v5, v3, v11}, LA1/h;-><init>(Ljava/lang/Object;Z)V

    goto :goto_1e

    :cond_27
    const/4 v11, 0x1

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto/16 :goto_19

    :cond_28
    iget v3, v1, LA1/i;->b:I

    add-int/lit8 v5, v3, 0x1

    if-le v5, v7, :cond_29

    goto :goto_20

    :cond_29
    const/4 v5, 0x0

    :goto_1f
    if-ge v5, v9, :cond_2b

    add-int v8, v5, v3

    if-ge v8, v7, :cond_2b

    invoke-virtual {v6, v8}, Lp1/a;->a(I)Z

    move-result v8

    if-eqz v8, :cond_2a

    goto :goto_20

    :cond_2a
    add-int/lit8 v5, v5, 0x1

    goto :goto_1f

    :cond_2b
    const/4 v3, 0x2

    iput v3, v1, LA1/i;->c:I

    iget v3, v1, LA1/i;->b:I

    add-int/2addr v3, v9

    iput v3, v1, LA1/i;->b:I

    :goto_20
    new-instance v3, LA1/h;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v3, v6, v5}, LA1/h;-><init>(Ljava/lang/Object;Z)V

    :goto_21
    iget-boolean v6, v3, LA1/h;->a:Z

    move/from16 v17, v6

    move-object v6, v3

    move/from16 v3, v17

    :goto_22
    iget v7, v1, LA1/i;->b:I

    if-eq v4, v7, :cond_2c

    goto :goto_23

    :cond_2c
    if-eqz v3, :cond_2e

    :goto_23
    if-eqz v3, :cond_2d

    goto :goto_24

    :cond_2d
    move v3, v5

    goto/16 :goto_0

    :cond_2e
    :goto_24
    iget-object v1, v6, LA1/h;->b:Ljava/lang/Object;

    check-cast v1, LA1/k;

    if-eqz v1, :cond_2f

    iget-boolean v3, v1, LA1/k;->d:Z

    if-eqz v3, :cond_2f

    new-instance v3, LA1/k;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget v1, v1, LA1/k;->c:I

    invoke-direct {v3, v7, v1, v2}, LA1/k;-><init>(IILjava/lang/String;)V

    return-object v3

    :cond_2f
    new-instance v1, LA1/k;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v7}, LA1/k;-><init>(Ljava/lang/String;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x3a
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xe8
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
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public f(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->b()V

    iget-object v1, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v1, Lv0/h;

    invoke-virtual {v1}, La0/m;->a()Lf0/i;

    move-result-object v2

    const/4 v3, 0x1

    if-nez p1, :cond_0

    invoke-interface {v2, v3}, Le0/d;->g(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v2, p1, v3}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    invoke-virtual {v2}, Lf0/i;->b()I

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v1, v2}, La0/m;->p(Lf0/i;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v1, v2}, La0/m;->p(Lf0/i;)V

    throw p1
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget-object v1, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/e;

    invoke-virtual {v0}, LA1/f;->d()V

    return-void
.end method

.method public i(I)V
    .locals 4

    invoke-virtual {p0, p1}, Lv0/m;->v(I)I

    move-result p1

    iget-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, LZ/b;

    invoke-virtual {v0, p1}, LZ/b;->g(I)Z

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, LZ/y;

    iget-object v0, v0, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LZ/W;->l()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, LZ/W;->q()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "called detach on an already detached child "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/16 v2, 0x100

    invoke-virtual {v1, v2}, LZ/W;->b(I)V

    :cond_2
    invoke-static {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->c(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method public k(Ljava/lang/String;)Landroidx/fragment/app/n;
    .locals 1

    iget-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/G;

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public l(Ljava/lang/String;)Landroidx/fragment/app/n;
    .locals 3

    iget-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/G;

    if-eqz v1, :cond_0

    iget-object v1, v1, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-object v2, v1, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iget-object v1, v1, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v1, p1}, Lv0/m;->l(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_0

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public m()Ljava/util/ArrayList;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/G;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public n()Ljava/util/ArrayList;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/G;

    if-eqz v2, :cond_0

    iget-object v2, v2, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public o(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0, p1}, Lv0/m;->v(I)I

    move-result p1

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, LZ/y;

    iget-object v0, v0, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public p()I
    .locals 2

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, LZ/y;

    iget-object v0, v0, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget-object v1, p0, Lv0/m;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public q(I)Landroid/content/res/ColorStateList;
    .locals 3

    iget-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {v2, v1}, Ly/f;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public r(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, v1}, La/a;->s(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public s(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    iget-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lk/t;->a()Lk/t;

    move-result-object v0

    iget-object v1, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lk/t;->a:Lk/O0;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, p1, v3}, Lk/O0;->f(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public t(IILk/U;)Landroid/graphics/Typeface;
    .locals 9

    iget-object v0, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    const/4 p1, 0x0

    if-nez v3, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    check-cast v0, Landroid/util/TypedValue;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/util/TypedValue;

    sget-object v0, Lz/n;->a:Ljava/lang/ThreadLocal;

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    const/4 v7, 0x1

    move v5, p2

    move-object v6, p3

    invoke-static/range {v2 .. v8}, Lz/n;->b(Landroid/content/Context;ILandroid/util/TypedValue;ILz/b;ZZ)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lv0/m;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v1, LZ/b;

    invoke-virtual {v1}, LZ/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hidden list:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv0/m;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public u()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public v(I)I
    .locals 5

    const/4 v0, -0x1

    if-gez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v1, LZ/y;

    iget-object v1, v1, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    move v2, p1

    :goto_0
    if-ge v2, v1, :cond_3

    iget-object v3, p0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v3, LZ/b;

    invoke-virtual {v3, v2}, LZ/b;->b(I)I

    move-result v4

    sub-int v4, v2, v4

    sub-int v4, p1, v4

    if-nez v4, :cond_2

    :goto_1
    invoke-virtual {v3, v2}, LZ/b;->d(I)Z

    move-result p1

    if-eqz p1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    add-int/2addr v2, v4

    goto :goto_0

    :cond_3
    return v0
.end method

.method public w(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, LZ/y;

    iget-object v0, v0, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public x()I
    .locals 1

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, LZ/y;

    iget-object v0, v0, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public y(Ljava/lang/CharSequence;IILandroidx/emoji2/text/n;)Z
    .locals 7

    const/4 v0, 0x1

    iget v1, p4, Landroidx/emoji2/text/n;->c:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_4

    iget-object v1, p0, Lv0/m;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/emoji2/text/g;

    invoke-virtual {p4}, Landroidx/emoji2/text/n;->c()LR/a;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, LJ/z;->a(I)I

    move-result v5

    if-eqz v5, :cond_0

    iget-object v6, v4, LJ/z;->d:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    iget v4, v4, LJ/z;->a:I

    add-int/2addr v5, v4

    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    :cond_0
    check-cast v1, Landroidx/emoji2/text/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Landroidx/emoji2/text/d;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr p2, v0

    goto :goto_0

    :cond_2
    iget-object p1, v1, Landroidx/emoji2/text/d;->a:Landroid/text/TextPaint;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget p3, LA/f;->a:I

    invoke-static {p1, p2}, LA/e;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v2

    goto :goto_1

    :cond_3
    move p1, v0

    :goto_1
    iput p1, p4, Landroidx/emoji2/text/n;->c:I

    :cond_4
    iget p1, p4, Landroidx/emoji2/text/n;->c:I

    if-ne p1, v2, :cond_5

    goto :goto_2

    :cond_5
    move v0, v3

    :goto_2
    return v0
.end method

.method public z(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lv0/m;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, LZ/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object p1

    if-eqz p1, :cond_2

    iget v1, p1, LZ/W;->q:I

    const/4 v2, -0x1

    iget-object v3, p1, LZ/W;->a:Landroid/view/View;

    if-eq v1, v2, :cond_0

    iput v1, p1, LZ/W;->p:I

    goto :goto_0

    :cond_0
    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v3}, LJ/B;->c(Landroid/view/View;)I

    move-result v1

    iput v1, p1, LZ/W;->p:I

    :goto_0
    iget-object v0, v0, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    move-result v1

    const/4 v2, 0x4

    if-eqz v1, :cond_1

    iput v2, p1, LZ/W;->q:I

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->q0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object p1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v3, v2}, LJ/B;->s(Landroid/view/View;I)V

    :cond_2
    :goto_1
    return-void
.end method
