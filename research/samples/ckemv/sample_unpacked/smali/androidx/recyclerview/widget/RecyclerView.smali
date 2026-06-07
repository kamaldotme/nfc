.class public Landroidx/recyclerview/widget/RecyclerView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field public static final t0:[I

.field public static final u0:[Ljava/lang/Class;

.field public static final v0:LQ/d;


# instance fields
.field public A:Z

.field public B:I

.field public C:I

.field public D:LZ/C;

.field public E:Landroid/widget/EdgeEffect;

.field public F:Landroid/widget/EdgeEffect;

.field public G:Landroid/widget/EdgeEffect;

.field public H:Landroid/widget/EdgeEffect;

.field public I:LZ/D;

.field public J:I

.field public K:I

.field public L:Landroid/view/VelocityTracker;

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:I

.field public R:LZ/J;

.field public final S:I

.field public final T:I

.field public final U:F

.field public final V:F

.field public W:Z

.field public final a0:LZ/V;

.field public final b:LU0/e;

.field public b0:LZ/n;

.field public final c:LZ/N;

.field public final c0:LC0/b;

.field public d:LZ/P;

.field public final d0:LZ/T;

.field public final e:LG/e;

.field public e0:LZ/K;

.field public final f:Lv0/m;

.field public f0:Ljava/util/ArrayList;

.field public final g:Lv0/e;

.field public g0:Z

.field public h:Z

.field public h0:Z

.field public final i:Landroid/graphics/Rect;

.field public final i0:LZ/y;

.field public final j:Landroid/graphics/Rect;

.field public j0:Z

.field public final k:Landroid/graphics/RectF;

.field public k0:LZ/Y;

.field public l:LZ/z;

.field public final l0:[I

.field public m:LZ/H;

.field public m0:LJ/n;

.field public final n:Ljava/util/ArrayList;

.field public final n0:[I

.field public final o:Ljava/util/ArrayList;

.field public final o0:[I

.field public p:LZ/l;

.field public final p0:[I

.field public q:Z

.field public final q0:Ljava/util/ArrayList;

.field public r:Z

.field public final r0:LF0/h;

.field public s:Z

.field public final s0:LZ/y;

.field public t:I

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:I

.field public final y:Landroid/view/accessibility/AccessibilityManager;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const v0, 0x1010436

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v1, Landroid/content/Context;

    const-class v2, Landroid/util/AttributeSet;

    filled-new-array {v1, v2, v0, v0}, [Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->u0:[Ljava/lang/Class;

    new-instance v0, LQ/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LQ/d;-><init>(I)V

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->v0:LQ/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f03035b

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 19

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p3

    const/4 v0, 0x4

    .line 2
    invoke-direct/range {p0 .. p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance v1, LU0/e;

    const/16 v2, 0xf

    invoke-direct {v1, v2, v10}, LU0/e;-><init>(ILjava/lang/Object;)V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->b:LU0/e;

    .line 4
    new-instance v1, LZ/N;

    invoke-direct {v1, v10}, LZ/N;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    .line 5
    new-instance v1, Lv0/e;

    invoke-direct {v1}, Lv0/e;-><init>()V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->g:Lv0/e;

    .line 6
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->i:Landroid/graphics/Rect;

    .line 7
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/graphics/Rect;

    .line 8
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->k:Landroid/graphics/RectF;

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->o:Ljava/util/ArrayList;

    const/4 v14, 0x0

    .line 11
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->t:I

    .line 12
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    .line 13
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->A:Z

    .line 14
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->B:I

    .line 15
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->C:I

    .line 16
    new-instance v1, LZ/C;

    .line 17
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->D:LZ/C;

    .line 19
    new-instance v1, LZ/i;

    .line 20
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v15, 0x0

    .line 21
    iput-object v15, v1, LZ/D;->a:LZ/y;

    .line 22
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/D;->b:Ljava/util/ArrayList;

    const-wide/16 v2, 0x78

    .line 23
    iput-wide v2, v1, LZ/D;->c:J

    .line 24
    iput-wide v2, v1, LZ/D;->d:J

    const-wide/16 v2, 0xfa

    .line 25
    iput-wide v2, v1, LZ/D;->e:J

    .line 26
    iput-wide v2, v1, LZ/D;->f:J

    const/4 v9, 0x1

    .line 27
    iput-boolean v9, v1, LZ/i;->g:Z

    .line 28
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/i;->h:Ljava/util/ArrayList;

    .line 29
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/i;->i:Ljava/util/ArrayList;

    .line 30
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/i;->j:Ljava/util/ArrayList;

    .line 31
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/i;->k:Ljava/util/ArrayList;

    .line 32
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/i;->l:Ljava/util/ArrayList;

    .line 33
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/i;->m:Ljava/util/ArrayList;

    .line 34
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/i;->n:Ljava/util/ArrayList;

    .line 35
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/i;->o:Ljava/util/ArrayList;

    .line 36
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/i;->p:Ljava/util/ArrayList;

    .line 37
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/i;->q:Ljava/util/ArrayList;

    .line 38
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/i;->r:Ljava/util/ArrayList;

    .line 39
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    .line 40
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->J:I

    const/4 v7, -0x1

    .line 41
    iput v7, v10, Landroidx/recyclerview/widget/RecyclerView;->K:I

    const/4 v1, 0x1

    .line 42
    iput v1, v10, Landroidx/recyclerview/widget/RecyclerView;->U:F

    .line 43
    iput v1, v10, Landroidx/recyclerview/widget/RecyclerView;->V:F

    .line 44
    iput-boolean v9, v10, Landroidx/recyclerview/widget/RecyclerView;->W:Z

    .line 45
    new-instance v1, LZ/V;

    invoke-direct {v1, v10}, LZ/V;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    .line 46
    new-instance v1, LC0/b;

    .line 47
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->c0:LC0/b;

    .line 49
    new-instance v1, LZ/T;

    .line 50
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 51
    iput v7, v1, LZ/T;->a:I

    .line 52
    iput v14, v1, LZ/T;->b:I

    .line 53
    iput v14, v1, LZ/T;->c:I

    .line 54
    iput v9, v1, LZ/T;->d:I

    .line 55
    iput v14, v1, LZ/T;->e:I

    .line 56
    iput-boolean v14, v1, LZ/T;->f:Z

    .line 57
    iput-boolean v14, v1, LZ/T;->g:Z

    .line 58
    iput-boolean v14, v1, LZ/T;->h:Z

    .line 59
    iput-boolean v14, v1, LZ/T;->i:Z

    .line 60
    iput-boolean v14, v1, LZ/T;->j:Z

    .line 61
    iput-boolean v14, v1, LZ/T;->k:Z

    .line 62
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    .line 63
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->g0:Z

    .line 64
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->h0:Z

    .line 65
    new-instance v1, LZ/y;

    invoke-direct {v1, v10}, LZ/y;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->i0:LZ/y;

    .line 66
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->j0:Z

    const/4 v8, 0x2

    .line 67
    new-array v2, v8, [I

    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->l0:[I

    .line 68
    new-array v2, v8, [I

    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->n0:[I

    .line 69
    new-array v2, v8, [I

    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->o0:[I

    .line 70
    new-array v2, v8, [I

    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->p0:[I

    .line 71
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->q0:Ljava/util/ArrayList;

    .line 72
    new-instance v2, LF0/h;

    invoke-direct {v2, v0, v10}, LF0/h;-><init>(ILjava/lang/Object;)V

    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->r0:LF0/h;

    .line 73
    new-instance v2, LZ/y;

    invoke-direct {v2, v10}, LZ/y;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->s0:LZ/y;

    .line 74
    invoke-virtual {v10, v9}, Landroid/view/View;->setScrollContainer(Z)V

    .line 75
    invoke-virtual {v10, v9}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 76
    invoke-static/range {p1 .. p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    .line 77
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    iput v3, v10, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 78
    invoke-static {v2}, LJ/U;->a(Landroid/view/ViewConfiguration;)F

    move-result v3

    .line 79
    iput v3, v10, Landroidx/recyclerview/widget/RecyclerView;->U:F

    .line 80
    invoke-static {v2}, LJ/U;->b(Landroid/view/ViewConfiguration;)F

    move-result v3

    .line 81
    iput v3, v10, Landroidx/recyclerview/widget/RecyclerView;->V:F

    .line 82
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v3

    iput v3, v10, Landroidx/recyclerview/widget/RecyclerView;->S:I

    .line 83
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v2

    iput v2, v10, Landroidx/recyclerview/widget/RecyclerView;->T:I

    .line 84
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v2

    if-ne v2, v8, :cond_0

    move v2, v9

    goto :goto_0

    :cond_0
    move v2, v14

    :goto_0
    invoke-virtual {v10, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 85
    iget-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    .line 86
    iput-object v1, v2, LZ/D;->a:LZ/y;

    .line 87
    new-instance v1, LG/e;

    new-instance v2, LZ/y;

    invoke-direct {v2, v10}, LZ/y;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-direct {v1, v2}, LG/e;-><init>(LZ/y;)V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->e:LG/e;

    .line 88
    new-instance v1, Lv0/m;

    new-instance v2, LZ/y;

    invoke-direct {v2, v10}, LZ/y;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-direct {v1, v2}, Lv0/m;-><init>(LZ/y;)V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    .line 89
    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    .line 90
    invoke-static/range {p0 .. p0}, LJ/J;->c(Landroid/view/View;)I

    move-result v1

    const/16 v6, 0x8

    if-nez v1, :cond_1

    .line 91
    invoke-static {v10, v6}, LJ/J;->m(Landroid/view/View;I)V

    .line 92
    :cond_1
    invoke-static/range {p0 .. p0}, LJ/B;->c(Landroid/view/View;)I

    move-result v1

    if-nez v1, :cond_2

    .line 93
    invoke-static {v10, v9}, LJ/B;->s(Landroid/view/View;I)V

    .line 94
    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "accessibility"

    .line 95
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->y:Landroid/view/accessibility/AccessibilityManager;

    .line 96
    new-instance v1, LZ/Y;

    invoke-direct {v1, v10}, LZ/Y;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {v10, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(LZ/Y;)V

    .line 97
    sget-object v3, LY/a;->a:[I

    invoke-virtual {v11, v12, v3, v13, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 98
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v1, v4, :cond_3

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move-object/from16 v16, v5

    move v15, v6

    move/from16 v6, p3

    .line 99
    invoke-static/range {v1 .. v6}, LA/b;->p(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    move-object/from16 v6, v16

    goto :goto_1

    :cond_3
    move v15, v6

    move-object v6, v5

    .line 100
    :goto_1
    invoke-virtual {v6, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 101
    invoke-virtual {v6, v8, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    if-ne v1, v7, :cond_4

    const/high16 v1, 0x40000

    .line 102
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 103
    :cond_4
    invoke-virtual {v6, v9, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, v10, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    const/4 v7, 0x3

    .line 104
    invoke-virtual {v6, v7, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x6

    .line 105
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/graphics/drawable/StateListDrawable;

    const/4 v1, 0x7

    .line 106
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 107
    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/graphics/drawable/StateListDrawable;

    const/4 v1, 0x5

    .line 108
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v16

    if-eqz v3, :cond_5

    if-eqz v4, :cond_5

    if-eqz v5, :cond_5

    if-eqz v16, :cond_5

    .line 109
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 110
    new-instance v2, LZ/l;

    const v7, 0x7f060090

    .line 111
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    const v8, 0x7f060092

    .line 112
    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    const v9, 0x7f060091

    .line 113
    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v9

    move-object v1, v2

    move-object/from16 v2, p0

    move-object/from16 v18, v6

    move-object/from16 v6, v16

    const/16 v16, 0x3

    const/16 v17, 0x2

    invoke-direct/range {v1 .. v9}, LZ/l;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V

    goto :goto_2

    .line 114
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trying to set fast scroller without both required drawables."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    move-object/from16 v18, v6

    move/from16 v16, v7

    move/from16 v17, v8

    .line 116
    :goto_2
    invoke-virtual/range {v18 .. v18}, Landroid/content/res/TypedArray;->recycle()V

    .line 117
    const-string v1, ": Could not instantiate the LayoutManager: "

    if-eqz v15, :cond_a

    .line 118
    invoke-virtual {v15}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 119
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_a

    .line 120
    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    if-ne v3, v4, :cond_7

    .line 121
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    .line 122
    :cond_7
    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_3

    .line 123
    :cond_8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-class v5, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 124
    :goto_3
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 125
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    goto :goto_4

    :catch_0
    move-exception v0

    goto/16 :goto_8

    :catch_1
    move-exception v0

    goto/16 :goto_9

    :catch_2
    move-exception v0

    goto/16 :goto_a

    :catch_3
    move-exception v0

    goto/16 :goto_b

    :catch_4
    move-exception v0

    goto/16 :goto_c

    .line 126
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    .line 127
    :goto_4
    invoke-static {v2, v14, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    const-class v4, LZ/H;

    .line 128
    invoke-virtual {v3, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    :try_start_1
    sget-object v4, Landroidx/recyclerview/widget/RecyclerView;->u0:[Ljava/lang/Class;

    .line 130
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    .line 131
    new-array v0, v0, [Ljava/lang/Object;

    aput-object v11, v0, v14
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v7, 0x1

    :try_start_2
    aput-object v12, v0, v7

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v0, v17

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v0, v16
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0

    move-object v15, v0

    goto :goto_7

    :catch_5
    move-exception v0

    :goto_5
    move-object v5, v0

    const/4 v4, 0x0

    goto :goto_6

    :catch_6
    move-exception v0

    const/4 v7, 0x1

    goto :goto_5

    .line 132
    :goto_6
    :try_start_3
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_0

    move-object v15, v4

    move-object v4, v0

    .line 133
    :goto_7
    :try_start_4
    invoke-virtual {v4, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 134
    invoke-virtual {v4, v15}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ/H;

    invoke-virtual {v10, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(LZ/H;)V

    goto/16 :goto_d

    :catch_7
    move-exception v0

    move-object v3, v0

    .line 135
    invoke-virtual {v3, v5}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 136
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": Error creating LayoutManager "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_4 .. :try_end_4} :catch_0

    .line 137
    :goto_8
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": Class is not a LayoutManager "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 138
    :goto_9
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": Cannot access non-public constructor "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 139
    :goto_a
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 140
    :goto_b
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 141
    :goto_c
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": Unable to find LayoutManager "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_a
    const/4 v7, 0x1

    .line 142
    :goto_d
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 143
    sget-object v3, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    invoke-virtual {v11, v12, v3, v13, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v8

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_b

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move-object v5, v8

    move/from16 v6, p3

    .line 144
    invoke-static/range {v1 .. v6}, LA/b;->p(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 145
    :cond_b
    invoke-virtual {v8, v14, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 146
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 147
    invoke-virtual {v10, v0}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    return-void
.end method

.method public static D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 4

    instance-of v0, p0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    instance-of v0, p0, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0

    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v3

    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static I(Landroid/view/View;)LZ/W;
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, LZ/I;

    iget-object p0, p0, LZ/I;->a:LZ/W;

    return-object p0
.end method

.method public static synthetic a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewGroup;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static synthetic c(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->detachViewFromParent(I)V

    return-void
.end method

.method public static synthetic d(Landroidx/recyclerview/widget/RecyclerView;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method private getScrollingChildHelper()LJ/n;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m0:LJ/n;

    if-nez v0, :cond_0

    new-instance v0, LJ/n;

    invoke-direct {v0, p0}, LJ/n;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m0:LJ/n;

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m0:LJ/n;

    return-object v0
.end method

.method public static j(LZ/W;)V
    .locals 3

    iget-object v0, p0, LZ/W;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, LZ/W;->a:Landroid/view/View;

    if-ne v0, v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_1

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    iput-object v1, p0, LZ/W;->b:Ljava/lang/ref/WeakReference;

    :cond_3
    return-void
.end method


# virtual methods
.method public final A(Landroid/view/View;)Landroid/view/View;
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    move-object p1, v0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-ne v0, p0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public final B(Landroid/view/MotionEvent;)Z
    .locals 11

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->o:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_6

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LZ/l;

    iget v6, v5, LZ/l;->v:I

    const/4 v7, 0x1

    const/4 v8, 0x2

    if-ne v6, v7, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    invoke-virtual {v5, v6, v9}, LZ/l;->d(FF)Z

    move-result v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v9

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    invoke-virtual {v5, v9, v10}, LZ/l;->c(FF)Z

    move-result v9

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v10

    if-nez v10, :cond_4

    if-nez v6, :cond_0

    if-eqz v9, :cond_4

    :cond_0
    if-eqz v9, :cond_1

    iput v7, v5, LZ/l;->w:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    float-to-int v6, v6

    int-to-float v6, v6

    iput v6, v5, LZ/l;->p:F

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    iput v8, v5, LZ/l;->w:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    float-to-int v6, v6

    int-to-float v6, v6

    iput v6, v5, LZ/l;->m:F

    :cond_2
    :goto_1
    invoke-virtual {v5, v8}, LZ/l;->f(I)V

    goto :goto_2

    :cond_3
    if-ne v6, v8, :cond_4

    :goto_2
    move v6, v7

    goto :goto_3

    :cond_4
    move v6, v3

    :goto_3
    if-eqz v6, :cond_5

    const/4 v6, 0x3

    if-eq v0, v6, :cond_5

    iput-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->p:LZ/l;

    return v7

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    return v3
.end method

.method public final C([I)V
    .locals 8

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->p()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    aput v0, p1, v2

    aput v0, p1, v1

    return-void

    :cond_0
    const v3, 0x7fffffff

    const/high16 v4, -0x80000000

    move v5, v2

    :goto_0
    if-ge v5, v0, :cond_4

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v6, v5}, Lv0/m;->o(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v6

    invoke-virtual {v6}, LZ/W;->q()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, LZ/W;->c()I

    move-result v6

    if-ge v6, v3, :cond_2

    move v3, v6

    :cond_2
    if-le v6, v4, :cond_3

    move v4, v6

    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    aput v3, p1, v2

    aput v4, p1, v1

    return-void
.end method

.method public final E(I)LZ/W;
    .locals 5

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->x()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v3, v2}, Lv0/m;->w(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, LZ/W;->j()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->F(LZ/W;)I

    move-result v4

    if-ne v4, p1, :cond_2

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    iget-object v4, v3, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v1, v4}, Lv0/m;->B(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v3

    goto :goto_1

    :cond_1
    return-object v3

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public final F(LZ/W;)I
    .locals 7

    const/16 v0, 0x20c

    invoke-virtual {p1, v0}, LZ/W;->e(I)Z

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_9

    invoke-virtual {p1}, LZ/W;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LG/e;

    iget p1, p1, LZ/W;->c:I

    iget-object v0, v0, LG/e;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_8

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LZ/a;

    iget v5, v4, LZ/a;->a:I

    const/4 v6, 0x1

    if-eq v5, v6, :cond_6

    const/4 v6, 0x2

    if-eq v5, v6, :cond_4

    const/16 v6, 0x8

    if-eq v5, v6, :cond_1

    goto :goto_1

    :cond_1
    iget v5, v4, LZ/a;->b:I

    if-ne v5, p1, :cond_2

    iget p1, v4, LZ/a;->d:I

    goto :goto_1

    :cond_2
    if-ge v5, p1, :cond_3

    add-int/lit8 p1, p1, -0x1

    :cond_3
    iget v4, v4, LZ/a;->d:I

    if-gt v4, p1, :cond_7

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_4
    iget v5, v4, LZ/a;->b:I

    if-gt v5, p1, :cond_7

    iget v4, v4, LZ/a;->d:I

    add-int/2addr v5, v4

    if-le v5, p1, :cond_5

    goto :goto_2

    :cond_5
    sub-int/2addr p1, v4

    goto :goto_1

    :cond_6
    iget v5, v4, LZ/a;->b:I

    if-gt v5, p1, :cond_7

    iget v4, v4, LZ/a;->d:I

    add-int/2addr p1, v4

    :cond_7
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_8
    move v1, p1

    :cond_9
    :goto_2
    return v1
.end method

.method public final G(LZ/W;)J
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    iget-boolean v0, v0, LZ/z;->b:Z

    if-eqz v0, :cond_0

    iget-wide v0, p1, LZ/W;->e:J

    goto :goto_0

    :cond_0
    iget p1, p1, LZ/W;->c:I

    int-to-long v0, p1

    :goto_0
    return-wide v0
.end method

.method public final H(Landroid/view/View;)LZ/W;
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a direct child of "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object p1

    return-object p1
.end method

.method public final J(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 9

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LZ/I;

    iget-boolean v1, v0, LZ/I;->c:Z

    iget-object v2, v0, LZ/I;->b:Landroid/graphics/Rect;

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    iget-boolean v1, v1, LZ/T;->g:Z

    if-eqz v1, :cond_2

    iget-object v1, v0, LZ/I;->a:LZ/W;

    invoke-virtual {v1}, LZ/W;->m()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, LZ/I;->a:LZ/W;

    invoke-virtual {v1}, LZ/W;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    return-object v2

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {v2, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v5, v1

    :goto_0
    if-ge v5, v4, :cond_3

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->i:Landroid/graphics/Rect;

    invoke-virtual {v6, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LZ/E;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, LZ/I;

    iget-object v7, v7, LZ/I;->a:LZ/W;

    invoke-virtual {v7}, LZ/W;->c()I

    invoke-virtual {v6, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    iget v7, v2, Landroid/graphics/Rect;->left:I

    iget v8, v6, Landroid/graphics/Rect;->left:I

    add-int/2addr v7, v8

    iput v7, v2, Landroid/graphics/Rect;->left:I

    iget v7, v2, Landroid/graphics/Rect;->top:I

    iget v8, v6, Landroid/graphics/Rect;->top:I

    add-int/2addr v7, v8

    iput v7, v2, Landroid/graphics/Rect;->top:I

    iget v7, v2, Landroid/graphics/Rect;->right:I

    iget v8, v6, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v8

    iput v7, v2, Landroid/graphics/Rect;->right:I

    iget v7, v2, Landroid/graphics/Rect;->bottom:I

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v7, v6

    iput v7, v2, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    iput-boolean v1, v0, LZ/I;->c:Z

    return-object v2
.end method

.method public final K()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LG/e;

    invoke-virtual {v0}, LG/e;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final L()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final M(I)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0, p1}, LZ/H;->k0(I)V

    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    return-void
.end method

.method public final N()V
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->x()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_0

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v4, v2}, Lv0/m;->w(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, LZ/I;

    iput-boolean v3, v4, LZ/I;->c:Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    iget-object v0, v0, LZ/N;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LZ/W;

    iget-object v4, v4, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, LZ/I;

    if-eqz v4, :cond_1

    iput-boolean v3, v4, LZ/I;->c:Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final O(IIZ)V
    .locals 9

    add-int v0, p1, p2

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v1}, Lv0/m;->x()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    const/16 v4, 0x8

    if-ge v2, v1, :cond_2

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v5, v2}, Lv0/m;->w(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, LZ/W;->q()Z

    move-result v6

    if-nez v6, :cond_1

    iget v6, v5, LZ/W;->c:I

    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    if-lt v6, v0, :cond_0

    neg-int v4, p2

    invoke-virtual {v5, v4, p3}, LZ/W;->n(IZ)V

    iput-boolean v3, v7, LZ/T;->f:Z

    goto :goto_1

    :cond_0
    if-lt v6, p1, :cond_1

    add-int/lit8 v6, p1, -0x1

    neg-int v8, p2

    invoke-virtual {v5, v4}, LZ/W;->b(I)V

    invoke-virtual {v5, v8, p3}, LZ/W;->n(IZ)V

    iput v6, v5, LZ/W;->c:I

    iput-boolean v3, v7, LZ/T;->f:Z

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    iget-object v2, v1, LZ/N;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    sub-int/2addr v5, v3

    :goto_2
    if-ltz v5, :cond_5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZ/W;

    if-eqz v3, :cond_4

    iget v6, v3, LZ/W;->c:I

    if-lt v6, v0, :cond_3

    neg-int v6, p2

    invoke-virtual {v3, v6, p3}, LZ/W;->n(IZ)V

    goto :goto_3

    :cond_3
    if-lt v6, p1, :cond_4

    invoke-virtual {v3, v4}, LZ/W;->b(I)V

    invoke-virtual {v1, v5}, LZ/N;->e(I)V

    :cond_4
    :goto_3
    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public final P()V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:I

    return-void
.end method

.method public final Q(Z)V
    .locals 5

    const/4 v0, -0x1

    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:I

    if-ge v1, v2, :cond_4

    const/4 v1, 0x0

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:I

    if-eqz p1, :cond_4

    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->x:I

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->x:I

    if-eqz p1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    const/16 v3, 0x800

    invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    invoke-static {v1, p1}, LK/b;->b(Landroid/view/accessibility/AccessibilityEvent;I)V

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_0
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->q0:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_3

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZ/W;

    iget-object v3, v2, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-ne v3, p0, :cond_2

    invoke-virtual {v2}, LZ/W;->q()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    iget v3, v2, LZ/W;->q:I

    if-eq v3, v0, :cond_2

    sget-object v4, LJ/T;->a:Ljava/util/WeakHashMap;

    iget-object v4, v2, LZ/W;->a:Landroid/view/View;

    invoke-static {v4, v3}, LJ/B;->s(Landroid/view/View;I)V

    iput v0, v2, LZ/W;->q:I

    :cond_2
    :goto_1
    add-int/2addr v1, v0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_4
    return-void
.end method

.method public final R(Landroid/view/MotionEvent;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->K:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->K:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:I

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v2

    float-to-int p1, p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->P:I

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->N:I

    :cond_1
    return-void
.end method

.method public final S()V
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->j0:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    if-eqz v0, :cond_0

    sget-object v0, LJ/T;->a:Ljava/util/WeakHashMap;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r0:LF0/h;

    invoke-static {p0, v0}, LJ/B;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->j0:Z

    :cond_0
    return-void
.end method

.method public final T()V
    .locals 5

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LG/e;

    iget-object v1, v0, LG/e;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, LG/e;->n(Ljava/util/ArrayList;)V

    iget-object v1, v0, LG/e;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, LG/e;->n(Ljava/util/ArrayList;)V

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0}, LZ/H;->U()V

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0}, LZ/H;->w0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LG/e;

    invoke-virtual {v0}, LG/e;->m()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LG/e;

    invoke-virtual {v0}, LG/e;->d()V

    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:Z

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_2

    :cond_3
    :goto_1
    move v0, v1

    :goto_2
    iget-boolean v3, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    if-eqz v3, :cond_6

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz v3, :cond_6

    iget-boolean v3, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    if-nez v3, :cond_4

    if-nez v0, :cond_4

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-boolean v4, v4, LZ/H;->f:Z

    if-eqz v4, :cond_6

    :cond_4
    if-eqz v3, :cond_5

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    iget-boolean v3, v3, LZ/z;->b:Z

    if-eqz v3, :cond_6

    :cond_5
    move v3, v1

    goto :goto_3

    :cond_6
    move v3, v2

    :goto_3
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    iput-boolean v3, v4, LZ/T;->j:Z

    if-eqz v3, :cond_7

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz v0, :cond_7

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0}, LZ/H;->w0()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    move v1, v2

    :goto_4
    iput-boolean v1, v4, LZ/T;->k:Z

    return-void
.end method

.method public final U(Z)V
    .locals 6

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Z

    or-int/2addr p1, v0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {p1}, Lv0/m;->x()I

    move-result p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x6

    if-ge v1, p1, :cond_1

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v3, v1}, Lv0/m;->w(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, LZ/W;->q()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3, v2}, LZ/W;->b(I)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->N()V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    iget-object v1, p1, LZ/N;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    :goto_1
    if-ge v0, v3, :cond_3

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LZ/W;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v2}, LZ/W;->b(I)V

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, LZ/W;->a(Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p1, LZ/N;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-eqz v0, :cond_4

    iget-boolean v0, v0, LZ/z;->b:Z

    if-nez v0, :cond_5

    :cond_4
    invoke-virtual {p1}, LZ/N;->d()V

    :cond_5
    return-void
.end method

.method public final V(LZ/W;LA1/i;)V
    .locals 4

    iget v0, p1, LZ/W;->j:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p1, LZ/W;->j:I

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    iget-boolean v0, v0, LZ/T;->h:Z

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->g:Lv0/e;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LZ/W;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LZ/W;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LZ/W;->q()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->G(LZ/W;)J

    move-result-wide v2

    iget-object v0, v1, Lv0/e;->c:Ljava/lang/Object;

    check-cast v0, Ln/e;

    invoke-virtual {v0, v2, v3, p1}, Ln/e;->e(JLjava/lang/Object;)V

    :cond_0
    iget-object v0, v1, Lv0/e;->b:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ/f0;

    if-nez v1, :cond_1

    invoke-static {}, LZ/f0;->a()LZ/f0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iput-object p2, v1, LZ/f0;->b:LA1/i;

    iget p1, v1, LZ/f0;->a:I

    or-int/lit8 p1, p1, 0x4

    iput p1, v1, LZ/f0;->a:I

    return-void
.end method

.method public final W(Landroid/view/View;Landroid/view/View;)V
    .locals 11

    if-eqz p2, :cond_0

    move-object v0, p2

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->i:Landroid/graphics/Rect;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, LZ/I;

    if-eqz v1, :cond_1

    check-cast v0, LZ/I;

    iget-boolean v1, v0, LZ/I;->c:Z

    if-nez v1, :cond_1

    iget v1, v3, Landroid/graphics/Rect;->left:I

    iget-object v0, v0, LZ/I;->b:Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v2

    iput v1, v3, Landroid/graphics/Rect;->left:I

    iget v1, v3, Landroid/graphics/Rect;->right:I

    iget v2, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v2

    iput v1, v3, Landroid/graphics/Rect;->right:I

    iget v1, v3, Landroid/graphics/Rect;->top:I

    iget v2, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    iput v1, v3, Landroid/graphics/Rect;->top:I

    iget v1, v3, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, v0

    iput v1, v3, Landroid/graphics/Rect;->bottom:I

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p0, p2, v3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p0, p1, v3}, Landroid/view/ViewGroup;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_2
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    const/4 v1, 0x1

    xor-int/lit8 v9, v0, 0x1

    if-nez p2, :cond_3

    move v10, v1

    goto :goto_1

    :cond_3
    move v10, v4

    :goto_1
    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->i:Landroid/graphics/Rect;

    move-object v6, p0

    move-object v7, p1

    invoke-virtual/range {v5 .. v10}, LZ/H;->h0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    return-void
.end method

.method public final X()V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->e0(I)V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    :cond_4
    if-eqz v0, :cond_5

    sget-object v0, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/B;->k(Landroid/view/View;)V

    :cond_5
    return-void
.end method

.method public final Y(IILandroid/view/MotionEvent;)Z
    .locals 18

    move-object/from16 v8, p0

    move/from16 v9, p1

    move/from16 v10, p2

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    iget-object v0, v8, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    iget-object v11, v8, Landroidx/recyclerview/widget/RecyclerView;->p0:[I

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_0

    aput v13, v11, v13

    aput v13, v11, v12

    invoke-virtual {v8, v9, v10, v11}, Landroidx/recyclerview/widget/RecyclerView;->Z(II[I)V

    aget v0, v11, v13

    aget v1, v11, v12

    sub-int v2, v9, v0

    sub-int v3, v10, v1

    move v14, v0

    move v15, v1

    move/from16 v16, v2

    move/from16 v17, v3

    goto :goto_0

    :cond_0
    move v14, v13

    move v15, v14

    move/from16 v16, v15

    move/from16 v17, v16

    :goto_0
    iget-object v0, v8, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    :cond_1
    aput v13, v11, v13

    aput v13, v11, v12

    iget-object v5, v8, Landroidx/recyclerview/widget/RecyclerView;->n0:[I

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move v1, v14

    move v2, v15

    move/from16 v3, v16

    move/from16 v4, v17

    move-object v7, v11

    invoke-virtual/range {v0 .. v7}, Landroidx/recyclerview/widget/RecyclerView;->s(IIII[II[I)V

    aget v0, v11, v13

    sub-int v1, v16, v0

    aget v2, v11, v12

    sub-int v3, v17, v2

    if-nez v0, :cond_3

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move v0, v13

    goto :goto_2

    :cond_3
    :goto_1
    move v0, v12

    :goto_2
    iget v2, v8, Landroidx/recyclerview/widget/RecyclerView;->O:I

    iget-object v4, v8, Landroidx/recyclerview/widget/RecyclerView;->n0:[I

    aget v5, v4, v13

    sub-int/2addr v2, v5

    iput v2, v8, Landroidx/recyclerview/widget/RecyclerView;->O:I

    iget v2, v8, Landroidx/recyclerview/widget/RecyclerView;->P:I

    aget v4, v4, v12

    sub-int/2addr v2, v4

    iput v2, v8, Landroidx/recyclerview/widget/RecyclerView;->P:I

    iget-object v2, v8, Landroidx/recyclerview/widget/RecyclerView;->o0:[I

    aget v6, v2, v13

    add-int/2addr v6, v5

    aput v6, v2, v13

    aget v5, v2, v12

    add-int/2addr v5, v4

    aput v5, v2, v12

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v2

    const/4 v4, 0x2

    if-eq v2, v4, :cond_b

    if-eqz p3, :cond_a

    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getSource()I

    move-result v2

    const/16 v4, 0x2002

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_4

    goto/16 :goto_6

    :cond_4
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    int-to-float v1, v1

    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    int-to-float v3, v3

    const/4 v5, 0x0

    cmpg-float v6, v1, v5

    const/high16 v7, 0x3f800000    # 1.0f

    if-gez v6, :cond_5

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->v()V

    iget-object v6, v8, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    neg-float v11, v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v12

    int-to-float v12, v12

    div-float/2addr v11, v12

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v12

    int-to-float v12, v12

    div-float/2addr v4, v12

    sub-float v4, v7, v4

    invoke-static {v6, v11, v4}, LN/d;->a(Landroid/widget/EdgeEffect;FF)V

    :goto_3
    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    cmpl-float v6, v1, v5

    if-lez v6, :cond_6

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->w()V

    iget-object v6, v8, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v11

    int-to-float v11, v11

    div-float v11, v1, v11

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v12

    int-to-float v12, v12

    div-float/2addr v4, v12

    invoke-static {v6, v11, v4}, LN/d;->a(Landroid/widget/EdgeEffect;FF)V

    goto :goto_3

    :cond_6
    move v4, v13

    :goto_4
    cmpg-float v6, v3, v5

    if-gez v6, :cond_7

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->x()V

    iget-object v1, v8, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    neg-float v3, v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v2, v4

    invoke-static {v1, v3, v2}, LN/d;->a(Landroid/widget/EdgeEffect;FF)V

    goto :goto_5

    :cond_7
    cmpl-float v6, v3, v5

    if-lez v6, :cond_8

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->u()V

    iget-object v1, v8, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v2, v4

    sub-float/2addr v7, v2

    invoke-static {v1, v3, v7}, LN/d;->a(Landroid/widget/EdgeEffect;FF)V

    goto :goto_5

    :cond_8
    if-nez v4, :cond_9

    cmpl-float v1, v1, v5

    if-nez v1, :cond_9

    if-eqz v6, :cond_a

    :cond_9
    :goto_5
    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static/range {p0 .. p0}, LJ/B;->k(Landroid/view/View;)V

    :cond_a
    :goto_6
    invoke-virtual/range {p0 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->l(II)V

    :cond_b
    if-nez v14, :cond_c

    if-eqz v15, :cond_d

    :cond_c
    invoke-virtual {v8, v14, v15}, Landroidx/recyclerview/widget/RecyclerView;->t(II)V

    :cond_d
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->awakenScrollBars()Z

    move-result v1

    if-nez v1, :cond_e

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    :cond_e
    if-nez v0, :cond_10

    if-nez v14, :cond_10

    if-eqz v15, :cond_f

    goto :goto_7

    :cond_f
    move v12, v13

    goto :goto_8

    :cond_10
    :goto_7
    const/4 v12, 0x1

    :goto_8
    return v12
.end method

.method public final Z(II[I)V
    .locals 10

    const/4 v0, 0x1

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->c0()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->P()V

    sget v2, LF/k;->a:I

    const-string v2, "RV Scroll"

    invoke-static {v2}, LF/j;->a(Ljava/lang/String;)V

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->z(LZ/T;)V

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v5, p1, v3, v2}, LZ/H;->j0(ILZ/N;LZ/T;)I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v4

    :goto_0
    if-eqz p2, :cond_1

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v5, p2, v3, v2}, LZ/H;->l0(ILZ/N;LZ/T;)I

    move-result p2

    goto :goto_1

    :cond_1
    move p2, v4

    :goto_1
    invoke-static {}, LF/j;->b()V

    invoke-virtual {v1}, Lv0/m;->p()I

    move-result v2

    move v3, v4

    :goto_2
    if-ge v3, v2, :cond_4

    invoke-virtual {v1, v3}, Lv0/m;->o(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView;->H(Landroid/view/View;)LZ/W;

    move-result-object v6

    if-eqz v6, :cond_3

    iget-object v6, v6, LZ/W;->i:LZ/W;

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v7

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v5

    iget-object v6, v6, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v8

    if-ne v7, v8, :cond_2

    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v8

    if-eq v5, v8, :cond_3

    :cond_2
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v8

    add-int/2addr v8, v7

    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v9

    add-int/2addr v9, v5

    invoke-virtual {v6, v7, v5, v8, v9}, Landroid/view/View;->layout(IIII)V

    :cond_3
    add-int/2addr v3, v0

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->Q(Z)V

    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView;->d0(Z)V

    if-eqz p3, :cond_5

    aput p1, p3, v4

    aput p2, p3, v0

    :cond_5
    return-void
.end method

.method public final a0(I)V
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    iget-object v1, v0, LZ/V;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, v0, LZ/V;->d:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v0, :cond_1

    iget-object v0, v0, LZ/H;->e:LZ/u;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LZ/u;->i()V

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {v0, p1}, LZ/H;->k0(I)V

    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    return-void
.end method

.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    return-void
.end method

.method public final b0(IIZ)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, LZ/H;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    move p1, v1

    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0}, LZ/H;->e()Z

    move-result v0

    if-nez v0, :cond_3

    move p2, v1

    :cond_3
    if-nez p1, :cond_4

    if-eqz p2, :cond_8

    :cond_4
    if-eqz p3, :cond_7

    const/4 p3, 0x1

    if-eqz p1, :cond_5

    move v1, p3

    :cond_5
    if-eqz p2, :cond_6

    or-int/lit8 v1, v1, 0x2

    :cond_6
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    invoke-virtual {v0, v1, p3}, LJ/n;->h(II)Z

    :cond_7
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    const/high16 v0, -0x80000000

    const/4 v1, 0x0

    invoke-virtual {p3, p1, p2, v0, v1}, LZ/V;->b(IIILandroid/view/animation/Interpolator;)V

    :cond_8
    return-void
.end method

.method public final c0()V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    :cond_0
    return-void
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    instance-of v0, p1, LZ/I;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    check-cast p1, LZ/I;

    invoke-virtual {v0, p1}, LZ/H;->f(LZ/I;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final computeHorizontalScrollExtent()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LZ/H;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    invoke-virtual {v0, v1}, LZ/H;->j(LZ/T;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public final computeHorizontalScrollOffset()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LZ/H;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    invoke-virtual {v0, v1}, LZ/H;->k(LZ/T;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public final computeHorizontalScrollRange()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LZ/H;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    invoke-virtual {v0, v1}, LZ/H;->l(LZ/T;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public final computeVerticalScrollExtent()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LZ/H;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    invoke-virtual {v0, v1}, LZ/H;->m(LZ/T;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public final computeVerticalScrollOffset()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LZ/H;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    invoke-virtual {v0, v1}, LZ/H;->n(LZ/T;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public final computeVerticalScrollRange()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LZ/H;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    invoke-virtual {v0, v1}, LZ/H;->o(LZ/T;)I

    move-result v1

    :cond_1
    return v1
.end method

.method public final d0(Z)V
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-nez v2, :cond_1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    :cond_1
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    if-ne v2, v1, :cond_3

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->o()V

    :cond_2
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-nez p1, :cond_3

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    :cond_3
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    sub-int/2addr p1, v1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    return-void
.end method

.method public final dispatchNestedFling(FFZ)Z
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LJ/n;->a(FFZ)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LJ/n;->b(FF)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    const/4 v5, 0x0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, LJ/n;->c(II[I[II)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 8

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v7}, LJ/n;->e(IIII[II[I)Z

    move-result p1

    return p1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/View;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    return-void
.end method

.method public final dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 8

    const/4 v0, 0x1

    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LZ/E;

    invoke-virtual {v5, p1, p0}, LZ/E;->b(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V

    add-int/2addr v4, v0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    const/high16 v5, 0x43870000    # 270.0f

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    neg-int v5, v5

    add-int/2addr v5, v4

    int-to-float v4, v5

    const/4 v5, 0x0

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    if-eqz v4, :cond_2

    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v0

    goto :goto_2

    :cond_2
    move v4, v3

    :goto_2
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_3

    :cond_3
    move v4, v3

    :goto_3
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    iget-boolean v5, p0, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    if-eqz v5, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_4
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    if-eqz v5, :cond_5

    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v0

    goto :goto_4

    :cond_5
    move v5, v3

    :goto_4
    or-int/2addr v4, v5

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_6
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    iget-boolean v6, p0, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    if-eqz v6, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    goto :goto_5

    :cond_7
    move v6, v3

    :goto_5
    const/high16 v7, 0x42b40000    # 90.0f

    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->rotate(F)V

    neg-int v6, v6

    int-to-float v6, v6

    neg-int v5, v5

    int-to-float v5, v5

    invoke-virtual {p1, v6, v5}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    if-eqz v5, :cond_8

    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v5

    if-eqz v5, :cond_8

    move v5, v0

    goto :goto_6

    :cond_8
    move v5, v3

    :goto_6
    or-int/2addr v4, v5

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_9
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v2

    if-nez v2, :cond_c

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    const/high16 v5, 0x43340000    # 180.0f

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    iget-boolean v5, p0, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    if-eqz v5, :cond_a

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    neg-int v5, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    add-int/2addr v6, v5

    int-to-float v5, v6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    neg-int v6, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    add-int/2addr v7, v6

    int-to-float v6, v7

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_7

    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    neg-int v6, v6

    int-to-float v6, v6

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    :goto_7
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    if-eqz v5, :cond_b

    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_8

    :cond_b
    move v0, v3

    :goto_8
    or-int/2addr v4, v0

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_c
    if-nez v4, :cond_d

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz p1, :cond_d

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_d

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    invoke-virtual {p1}, LZ/D;->f()Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_9

    :cond_d
    if-eqz v4, :cond_e

    :goto_9
    sget-object p1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/B;->k(Landroid/view/View;)V

    :cond_e
    return-void
.end method

.method public final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p1

    return p1
.end method

.method public final e0(I)V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    invoke-virtual {v0, p1}, LJ/n;->i(I)V

    return-void
.end method

.method public final f(LZ/W;)V
    .locals 5

    iget-object v0, p1, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const/4 v2, 0x1

    if-ne v1, p0, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->H(Landroid/view/View;)LZ/W;

    move-result-object v4

    invoke-virtual {v3, v4}, LZ/N;->j(LZ/W;)V

    invoke-virtual {p1}, LZ/W;->l()Z

    move-result p1

    const/4 v3, -0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p1, v0, v3, v1, v2}, Lv0/m;->c(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    goto :goto_1

    :cond_1
    if-nez v1, :cond_2

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {p1, v0, v3, v2}, Lv0/m;->b(Landroid/view/View;IZ)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    iget-object v1, p1, Lv0/m;->c:Ljava/lang/Object;

    check-cast v1, LZ/y;

    iget-object v1, v1, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    if-ltz v1, :cond_3

    iget-object v2, p1, Lv0/m;->d:Ljava/lang/Object;

    check-cast v2, LZ/b;

    invoke-virtual {v2, v1}, LZ/b;->i(I)V

    invoke-virtual {p1, v0}, Lv0/m;->z(Landroid/view/View;)V

    :goto_1
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "view is not a child, cannot hide "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    move-result v3

    if-nez v3, :cond_0

    iget-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-nez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v6

    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    const/16 v9, 0x11

    const/16 v11, 0x21

    const/4 v13, 0x0

    const/4 v14, 0x2

    if-eqz v3, :cond_b

    if-eq v2, v14, :cond_1

    if-ne v2, v4, :cond_b

    :cond_1
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3}, LZ/H;->e()Z

    move-result v3

    if-eqz v3, :cond_3

    if-ne v2, v14, :cond_2

    const/16 v3, 0x82

    goto :goto_1

    :cond_2
    move v3, v11

    :goto_1
    invoke-virtual {v6, v0, v1, v3}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_3

    move v3, v4

    goto :goto_2

    :cond_3
    move v3, v5

    :goto_2
    if-nez v3, :cond_8

    iget-object v15, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v15}, LZ/H;->d()Z

    move-result v15

    if-eqz v15, :cond_8

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3}, LZ/H;->A()I

    move-result v3

    if-ne v3, v4, :cond_4

    move v3, v4

    goto :goto_3

    :cond_4
    move v3, v5

    :goto_3
    if-ne v2, v14, :cond_5

    move v15, v4

    goto :goto_4

    :cond_5
    move v15, v5

    :goto_4
    xor-int/2addr v3, v15

    if-eqz v3, :cond_6

    const/16 v3, 0x42

    goto :goto_5

    :cond_6
    move v3, v9

    :goto_5
    invoke-virtual {v6, v0, v1, v3}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_7

    move v3, v4

    goto :goto_6

    :cond_7
    move v3, v5

    :cond_8
    :goto_6
    if-eqz v3, :cond_a

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->A(Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_9

    return-object v13

    :cond_9
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->c0()V

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3, v1, v2, v8, v7}, LZ/H;->P(Landroid/view/View;ILZ/N;LZ/T;)Landroid/view/View;

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->d0(Z)V

    :cond_a
    invoke-virtual {v6, v0, v1, v2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    goto :goto_7

    :cond_b
    invoke-virtual {v6, v0, v1, v2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_d

    if-eqz v3, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->A(Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_c

    return-object v13

    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->c0()V

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3, v1, v2, v8, v7}, LZ/H;->P(Landroid/view/View;ILZ/N;LZ/T;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->d0(Z)V

    goto :goto_7

    :cond_d
    move-object v3, v6

    :goto_7
    if-eqz v3, :cond_f

    invoke-virtual {v3}, Landroid/view/View;->hasFocusable()Z

    move-result v6

    if-nez v6, :cond_f

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_e

    invoke-super/range {p0 .. p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    return-object v1

    :cond_e
    invoke-virtual {v0, v3, v13}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;Landroid/view/View;)V

    return-object v1

    :cond_f
    if-eqz v3, :cond_23

    if-ne v3, v0, :cond_10

    goto/16 :goto_b

    :cond_10
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->A(Landroid/view/View;)Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_11

    goto/16 :goto_b

    :cond_11
    if-nez v1, :cond_12

    goto/16 :goto_c

    :cond_12
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->A(Landroid/view/View;)Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_13

    goto/16 :goto_c

    :cond_13
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getHeight()I

    move-result v7

    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView;->i:Landroid/graphics/Rect;

    invoke-virtual {v8, v5, v5, v6, v7}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v6

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v7

    iget-object v13, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/graphics/Rect;

    invoke-virtual {v13, v5, v5, v6, v7}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v0, v1, v8}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {v0, v3, v13}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v6}, LZ/H;->A()I

    move-result v6

    if-ne v6, v4, :cond_14

    const/4 v6, -0x1

    goto :goto_8

    :cond_14
    move v6, v4

    :goto_8
    iget v15, v8, Landroid/graphics/Rect;->left:I

    iget v5, v13, Landroid/graphics/Rect;->left:I

    if-lt v15, v5, :cond_15

    iget v7, v8, Landroid/graphics/Rect;->right:I

    if-gt v7, v5, :cond_16

    :cond_15
    iget v7, v8, Landroid/graphics/Rect;->right:I

    iget v12, v13, Landroid/graphics/Rect;->right:I

    if-ge v7, v12, :cond_16

    move v5, v4

    goto :goto_9

    :cond_16
    iget v7, v8, Landroid/graphics/Rect;->right:I

    iget v12, v13, Landroid/graphics/Rect;->right:I

    if-gt v7, v12, :cond_17

    if-lt v15, v12, :cond_18

    :cond_17
    if-le v15, v5, :cond_18

    const/4 v5, -0x1

    goto :goto_9

    :cond_18
    const/4 v5, 0x0

    :goto_9
    iget v7, v8, Landroid/graphics/Rect;->top:I

    iget v12, v13, Landroid/graphics/Rect;->top:I

    if-lt v7, v12, :cond_19

    iget v15, v8, Landroid/graphics/Rect;->bottom:I

    if-gt v15, v12, :cond_1a

    :cond_19
    iget v15, v8, Landroid/graphics/Rect;->bottom:I

    iget v10, v13, Landroid/graphics/Rect;->bottom:I

    if-ge v15, v10, :cond_1a

    move/from16 v16, v4

    goto :goto_a

    :cond_1a
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    iget v10, v13, Landroid/graphics/Rect;->bottom:I

    if-gt v8, v10, :cond_1b

    if-lt v7, v10, :cond_1c

    :cond_1b
    if-le v7, v12, :cond_1c

    const/16 v16, -0x1

    goto :goto_a

    :cond_1c
    const/16 v16, 0x0

    :goto_a
    if-eq v2, v4, :cond_22

    if-eq v2, v14, :cond_21

    if-eq v2, v9, :cond_20

    if-eq v2, v11, :cond_1f

    const/16 v4, 0x42

    if-eq v2, v4, :cond_1e

    const/16 v4, 0x82

    if-ne v2, v4, :cond_1d

    if-lez v16, :cond_23

    goto :goto_c

    :cond_1d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid direction: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1e
    if-lez v5, :cond_23

    goto :goto_c

    :cond_1f
    if-gez v16, :cond_23

    goto :goto_c

    :cond_20
    if-gez v5, :cond_23

    goto :goto_c

    :cond_21
    if-gtz v16, :cond_24

    if-nez v16, :cond_23

    mul-int/2addr v5, v6

    if-ltz v5, :cond_23

    goto :goto_c

    :cond_22
    if-ltz v16, :cond_24

    if-nez v16, :cond_23

    mul-int/2addr v5, v6

    if-gtz v5, :cond_23

    goto :goto_c

    :cond_23
    :goto_b
    invoke-super/range {p0 .. p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    :cond_24
    :goto_c
    return-object v3
.end method

.method public final g(LZ/E;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v0, :cond_0

    const-string v1, "Cannot add item decoration during a scroll  or layout"

    invoke-virtual {v0, v1}, LZ/H;->c(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->N()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LZ/H;->r()LZ/I;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "RecyclerView has no LayoutManager"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LZ/H;->s(Landroid/content/Context;Landroid/util/AttributeSet;)LZ/I;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, LZ/H;->t(Landroid/view/ViewGroup$LayoutParams;)LZ/I;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "androidx.recyclerview.widget.RecyclerView"

    return-object v0
.end method

.method public getAdapter()LZ/z;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    return-object v0
.end method

.method public getBaseline()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-super {p0}, Landroid/view/View;->getBaseline()I

    move-result v0

    return v0
.end method

.method public final getChildDrawingOrder(II)I
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    move-result p1

    return p1
.end method

.method public getClipToPadding()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    return v0
.end method

.method public getCompatAccessibilityDelegate()LZ/Y;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->k0:LZ/Y;

    return-object v0
.end method

.method public getEdgeEffectFactory()LZ/C;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:LZ/C;

    return-object v0
.end method

.method public getItemAnimator()LZ/D;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    return-object v0
.end method

.method public getItemDecorationCount()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getLayoutManager()LZ/H;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    return-object v0
.end method

.method public getMaxFlingVelocity()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:I

    return v0
.end method

.method public getMinFlingVelocity()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->S:I

    return v0
.end method

.method public getNanoTime()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public getOnFlingListener()LZ/J;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->R:LZ/J;

    return-object v0
.end method

.method public getPreserveFocusAfterLayout()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Z

    return v0
.end method

.method public getRecycledViewPool()LZ/M;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    invoke-virtual {v0}, LZ/N;->c()LZ/M;

    move-result-object v0

    return-object v0
.end method

.method public getScrollState()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    return v0
.end method

.method public final h(LZ/K;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final hasNestedScrollingParent()Z
    .locals 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LJ/n;->g(I)Z

    move-result v0

    return v0
.end method

.method public final i(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot call this method while RecyclerView is computing a layout or scrolling"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->C:I

    if-lez p1, :cond_2

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final isAttachedToWindow()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    return v0
.end method

.method public final isLayoutSuppressed()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    return v0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    iget-boolean v0, v0, LJ/n;->d:Z

    return v0
.end method

.method public final k()V
    .locals 7

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->x()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, -0x1

    if-ge v2, v0, :cond_1

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v4, v2}, Lv0/m;->w(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v4

    invoke-virtual {v4}, LZ/W;->q()Z

    move-result v5

    if-nez v5, :cond_0

    iput v3, v4, LZ/W;->d:I

    iput v3, v4, LZ/W;->g:I

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    iget-object v2, v0, LZ/N;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v5, v1

    :goto_1
    if-ge v5, v4, :cond_2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LZ/W;

    iput v3, v6, LZ/W;->d:I

    iput v3, v6, LZ/W;->g:I

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    iget-object v2, v0, LZ/N;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v5, v1

    :goto_2
    if-ge v5, v4, :cond_3

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LZ/W;

    iput v3, v6, LZ/W;->d:I

    iput v3, v6, LZ/W;->g:I

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    iget-object v2, v0, LZ/N;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_3
    if-ge v1, v2, :cond_4

    iget-object v4, v0, LZ/N;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LZ/W;

    iput v3, v4, LZ/W;->d:I

    iput v3, v4, LZ/W;->g:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    return-void
.end method

.method public final l(II)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    if-lez p1, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_1

    if-gez p1, :cond_1

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    or-int/2addr v0, p1

    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    if-nez p1, :cond_2

    if-lez p2, :cond_2

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    if-nez p1, :cond_3

    if-gez p2, :cond_3

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    or-int/2addr v0, p1

    :cond_3
    if-eqz v0, :cond_4

    sget-object p1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/B;->k(Landroid/view/View;)V

    :cond_4
    return-void
.end method

.method public final m()V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LG/e;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    const-string v2, "RV FullInvalidate"

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LG/e;->h()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, LG/e;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, LF/k;->a:I

    invoke-static {v2}, LF/j;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->o()V

    invoke-static {}, LF/j;->b()V

    :cond_2
    return-void

    :cond_3
    :goto_0
    sget v0, LF/k;->a:I

    invoke-static {v2}, LF/j;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->o()V

    invoke-static {}, LF/j;->b()V

    return-void
.end method

.method public final n(II)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    add-int/2addr v1, v0

    sget-object v0, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/B;->e(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v1, v0}, LZ/H;->g(III)I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {p0}, LJ/B;->d(Landroid/view/View;)I

    move-result v0

    invoke-static {p2, v1, v0}, LZ/H;->g(III)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final o()V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    const/4 v2, 0x0

    iput-boolean v2, v1, LZ/T;->i:Z

    iget v3, v1, LZ/T;->d:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3, v0}, LZ/H;->m0(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->q()V

    goto :goto_1

    :cond_2
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->e:LG/e;

    iget-object v5, v3, LG/e;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v3, v3, LG/e;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget v3, v3, LZ/H;->n:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    if-ne v3, v5, :cond_5

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget v3, v3, LZ/H;->o:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    if-eq v3, v5, :cond_4

    goto :goto_0

    :cond_4
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3, v0}, LZ/H;->m0(Landroidx/recyclerview/widget/RecyclerView;)V

    goto :goto_1

    :cond_5
    :goto_0
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3, v0}, LZ/H;->m0(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->q()V

    :goto_1
    const/4 v3, 0x4

    invoke-virtual {v1, v3}, LZ/T;->a(I)V

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->c0()V

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->P()V

    iput v4, v1, LZ/T;->d:I

    iget-boolean v5, v1, LZ/T;->j:Z

    const/4 v6, 0x0

    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView;->g:Lv0/e;

    if-eqz v5, :cond_21

    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v5}, Lv0/m;->p()I

    move-result v5

    sub-int/2addr v5, v4

    :goto_2
    if-ltz v5, :cond_14

    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v9, v5}, Lv0/m;->o(I)Landroid/view/View;

    move-result-object v9

    invoke-static {v9}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v9

    invoke-virtual {v9}, LZ/W;->q()Z

    move-result v10

    if-eqz v10, :cond_6

    goto/16 :goto_7

    :cond_6
    invoke-virtual {v0, v9}, Landroidx/recyclerview/widget/RecyclerView;->G(LZ/W;)J

    move-result-wide v10

    iget-object v12, v0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v12, LA1/i;

    const/4 v13, 0x3

    invoke-direct {v12, v13}, LA1/i;-><init>(I)V

    invoke-virtual {v12, v9}, LA1/i;->a(LZ/W;)V

    iget-object v13, v8, Lv0/e;->c:Ljava/lang/Object;

    check-cast v13, Ln/e;

    invoke-virtual {v13, v10, v11, v6}, Ln/e;->d(JLjava/lang/Long;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LZ/W;

    if-eqz v13, :cond_12

    invoke-virtual {v13}, LZ/W;->q()Z

    move-result v14

    if-nez v14, :cond_12

    iget-object v14, v8, Lv0/e;->b:Ljava/lang/Object;

    check-cast v14, Ln/k;

    invoke-virtual {v14, v13, v6}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LZ/f0;

    if-eqz v15, :cond_7

    iget v15, v15, LZ/f0;->a:I

    and-int/2addr v15, v4

    if-eqz v15, :cond_7

    move v15, v4

    goto :goto_3

    :cond_7
    move v15, v2

    :goto_3
    invoke-virtual {v14, v9, v6}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LZ/f0;

    if-eqz v14, :cond_8

    iget v14, v14, LZ/f0;->a:I

    and-int/2addr v14, v4

    if-eqz v14, :cond_8

    move v14, v4

    goto :goto_4

    :cond_8
    move v14, v2

    :goto_4
    if-eqz v15, :cond_9

    if-ne v13, v9, :cond_9

    invoke-virtual {v8, v9, v12}, Lv0/e;->b(LZ/W;LA1/i;)V

    goto/16 :goto_7

    :cond_9
    invoke-virtual {v8, v13, v3}, Lv0/e;->n(LZ/W;I)LA1/i;

    move-result-object v6

    invoke-virtual {v8, v9, v12}, Lv0/e;->b(LZ/W;LA1/i;)V

    const/16 v12, 0x8

    invoke-virtual {v8, v9, v12}, Lv0/e;->n(LZ/W;I)LA1/i;

    move-result-object v12

    if-nez v6, :cond_e

    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v6}, Lv0/m;->p()I

    move-result v6

    move v12, v2

    :goto_5
    if-ge v12, v6, :cond_d

    iget-object v14, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v14, v12}, Lv0/m;->o(I)Landroid/view/View;

    move-result-object v14

    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v14

    if-ne v14, v9, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView;->G(LZ/W;)J

    move-result-wide v16

    cmp-long v15, v16, v10

    if-nez v15, :cond_c

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    const-string v2, " \n View Holder 2:"

    if-eqz v1, :cond_b

    iget-boolean v1, v1, LZ/z;->b:Z

    if-eqz v1, :cond_b

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    :goto_6
    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_d
    invoke-static {v13}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    goto :goto_7

    :cond_e
    invoke-virtual {v13, v2}, LZ/W;->p(Z)V

    if-eqz v15, :cond_f

    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/RecyclerView;->f(LZ/W;)V

    :cond_f
    if-eq v13, v9, :cond_11

    if-eqz v14, :cond_10

    invoke-virtual {v0, v9}, Landroidx/recyclerview/widget/RecyclerView;->f(LZ/W;)V

    :cond_10
    iput-object v9, v13, LZ/W;->h:LZ/W;

    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/RecyclerView;->f(LZ/W;)V

    invoke-virtual {v7, v13}, LZ/N;->j(LZ/W;)V

    invoke-virtual {v9, v2}, LZ/W;->p(Z)V

    iput-object v13, v9, LZ/W;->i:LZ/W;

    :cond_11
    iget-object v10, v0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    invoke-virtual {v10, v13, v9, v6, v12}, LZ/D;->a(LZ/W;LZ/W;LA1/i;LA1/i;)Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->S()V

    goto :goto_7

    :cond_12
    invoke-virtual {v8, v9, v12}, Lv0/e;->b(LZ/W;LA1/i;)V

    :cond_13
    :goto_7
    add-int/lit8 v5, v5, -0x1

    const/4 v6, 0x0

    goto/16 :goto_2

    :cond_14
    iget-object v3, v8, Lv0/e;->b:Ljava/lang/Object;

    check-cast v3, Ln/k;

    iget v5, v3, Ln/k;->d:I

    sub-int/2addr v5, v4

    :goto_8
    if-ltz v5, :cond_20

    invoke-virtual {v3, v5}, Ln/k;->h(I)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, LZ/W;

    invoke-virtual {v3, v5}, Ln/k;->i(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LZ/f0;

    iget v9, v6, LZ/f0;->a:I

    and-int/lit8 v11, v9, 0x3

    const/4 v12, 0x3

    iget-object v13, v0, Landroidx/recyclerview/widget/RecyclerView;->s0:LZ/y;

    if-ne v11, v12, :cond_15

    iget-object v9, v13, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v11, v9, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v10, v10, LZ/W;->a:Landroid/view/View;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    invoke-virtual {v11, v10, v9}, LZ/H;->f0(Landroid/view/View;LZ/N;)V

    :goto_9
    const/4 v4, 0x0

    goto/16 :goto_d

    :cond_15
    and-int/lit8 v11, v9, 0x1

    if-eqz v11, :cond_17

    iget-object v9, v6, LZ/f0;->b:LA1/i;

    if-nez v9, :cond_16

    iget-object v9, v13, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v11, v9, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v10, v10, LZ/W;->a:Landroid/view/View;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    invoke-virtual {v11, v10, v9}, LZ/H;->f0(Landroid/view/View;LZ/N;)V

    goto :goto_9

    :cond_16
    iget-object v11, v6, LZ/f0;->c:LA1/i;

    invoke-virtual {v13, v10, v9, v11}, LZ/y;->g(LZ/W;LA1/i;LA1/i;)V

    goto :goto_9

    :cond_17
    and-int/lit8 v11, v9, 0xe

    const/16 v12, 0xe

    if-ne v11, v12, :cond_18

    iget-object v9, v6, LZ/f0;->b:LA1/i;

    iget-object v11, v6, LZ/f0;->c:LA1/i;

    invoke-virtual {v13, v10, v9, v11}, LZ/y;->f(LZ/W;LA1/i;LA1/i;)V

    goto :goto_9

    :cond_18
    and-int/lit8 v11, v9, 0xc

    const/16 v12, 0xc

    if-ne v11, v12, :cond_1d

    iget-object v9, v6, LZ/f0;->b:LA1/i;

    iget-object v11, v6, LZ/f0;->c:LA1/i;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10, v2}, LZ/W;->p(Z)V

    iget-object v15, v13, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    iget-boolean v12, v15, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    if-eqz v12, :cond_19

    iget-object v12, v15, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    invoke-virtual {v12, v10, v10, v9, v11}, LZ/D;->a(LZ/W;LZ/W;LA1/i;LA1/i;)Z

    move-result v9

    if-eqz v9, :cond_1c

    invoke-virtual {v15}, Landroidx/recyclerview/widget/RecyclerView;->S()V

    goto :goto_b

    :cond_19
    iget-object v12, v15, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    check-cast v12, LZ/i;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v13, v9, LA1/i;->b:I

    iget v14, v11, LA1/i;->b:I

    if-ne v13, v14, :cond_1b

    iget v4, v9, LA1/i;->c:I

    iget v2, v11, LA1/i;->c:I

    if-eq v4, v2, :cond_1a

    goto :goto_a

    :cond_1a
    invoke-virtual {v12, v10}, LZ/D;->c(LZ/W;)V

    goto :goto_b

    :cond_1b
    :goto_a
    iget v2, v9, LA1/i;->c:I

    iget v4, v11, LA1/i;->c:I

    move-object v9, v12

    move v11, v13

    move v12, v2

    move v13, v14

    move v14, v4

    invoke-virtual/range {v9 .. v14}, LZ/i;->g(LZ/W;IIII)Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-virtual {v15}, Landroidx/recyclerview/widget/RecyclerView;->S()V

    :cond_1c
    :goto_b
    const/4 v2, 0x0

    goto :goto_9

    :cond_1d
    and-int/lit8 v2, v9, 0x4

    if-eqz v2, :cond_1f

    iget-object v2, v6, LZ/f0;->b:LA1/i;

    const/4 v4, 0x0

    invoke-virtual {v13, v10, v2, v4}, LZ/y;->g(LZ/W;LA1/i;LA1/i;)V

    :cond_1e
    :goto_c
    const/4 v2, 0x0

    goto :goto_d

    :cond_1f
    const/4 v4, 0x0

    and-int/lit8 v2, v9, 0x8

    if-eqz v2, :cond_1e

    iget-object v2, v6, LZ/f0;->b:LA1/i;

    iget-object v9, v6, LZ/f0;->c:LA1/i;

    invoke-virtual {v13, v10, v2, v9}, LZ/y;->f(LZ/W;LA1/i;LA1/i;)V

    goto :goto_c

    :goto_d
    iput v2, v6, LZ/f0;->a:I

    iput-object v4, v6, LZ/f0;->b:LA1/i;

    iput-object v4, v6, LZ/f0;->c:LA1/i;

    sget-object v2, LZ/f0;->d:LI/b;

    invoke-virtual {v2, v6}, LI/b;->c(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, -0x1

    const/4 v2, 0x0

    const/4 v4, 0x1

    goto/16 :goto_8

    :cond_20
    const/4 v4, 0x0

    goto :goto_e

    :cond_21
    move-object v4, v6

    :goto_e
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v2, v7}, LZ/H;->e0(LZ/N;)V

    iget v2, v1, LZ/T;->e:I

    iput v2, v1, LZ/T;->b:I

    const/4 v2, 0x0

    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Z

    iput-boolean v2, v1, LZ/T;->j:Z

    iput-boolean v2, v1, LZ/T;->k:Z

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iput-boolean v2, v3, LZ/H;->f:Z

    iget-object v3, v7, LZ/N;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_22

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    :cond_22
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-boolean v5, v3, LZ/H;->k:Z

    if-eqz v5, :cond_23

    iput v2, v3, LZ/H;->j:I

    iput-boolean v2, v3, LZ/H;->k:Z

    invoke-virtual {v7}, LZ/N;->k()V

    :cond_23
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3, v1}, LZ/H;->Z(LZ/T;)V

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->Q(Z)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->d0(Z)V

    iget-object v3, v8, Lv0/e;->b:Ljava/lang/Object;

    check-cast v3, Ln/k;

    invoke-virtual {v3}, Ln/k;->clear()V

    iget-object v3, v8, Lv0/e;->c:Ljava/lang/Object;

    check-cast v3, Ln/e;

    invoke-virtual {v3}, Ln/e;->a()V

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->l0:[I

    aget v5, v3, v2

    const/4 v6, 0x1

    aget v7, v3, v6

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->C([I)V

    aget v8, v3, v2

    if-ne v8, v5, :cond_24

    aget v3, v3, v6

    if-eq v3, v7, :cond_25

    :cond_24
    invoke-virtual {v0, v2, v2}, Landroidx/recyclerview/widget/RecyclerView;->t(II)V

    :cond_25
    iget-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->W:Z

    const-wide/16 v5, -0x1

    const/4 v7, -0x1

    if-eqz v3, :cond_37

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-eqz v3, :cond_37

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->hasFocus()Z

    move-result v3

    if-eqz v3, :cond_37

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result v3

    const/high16 v8, 0x60000

    if-eq v3, v8, :cond_37

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result v3

    const/high16 v8, 0x20000

    if-ne v3, v8, :cond_26

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-eqz v3, :cond_26

    goto/16 :goto_18

    :cond_26
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-nez v3, :cond_27

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v3

    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    iget-object v8, v8, Lv0/m;->e:Ljava/lang/Object;

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    goto/16 :goto_18

    :cond_27
    iget-wide v8, v1, LZ/T;->m:J

    cmp-long v3, v8, v5

    if-eqz v3, :cond_2b

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    iget-boolean v3, v3, LZ/z;->b:Z

    if-eqz v3, :cond_2b

    if-nez v3, :cond_28

    goto :goto_11

    :cond_28
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v3}, Lv0/m;->x()I

    move-result v3

    move v10, v2

    move-object v11, v4

    :goto_f
    if-ge v10, v3, :cond_2c

    iget-object v12, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v12, v10}, Lv0/m;->w(I)Landroid/view/View;

    move-result-object v12

    invoke-static {v12}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v12

    if-eqz v12, :cond_2a

    invoke-virtual {v12}, LZ/W;->j()Z

    move-result v13

    if-nez v13, :cond_2a

    iget-wide v13, v12, LZ/W;->e:J

    cmp-long v13, v13, v8

    if-nez v13, :cond_2a

    iget-object v11, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    iget-object v11, v11, Lv0/m;->e:Ljava/lang/Object;

    check-cast v11, Ljava/util/ArrayList;

    iget-object v13, v12, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_29

    move-object v11, v12

    goto :goto_10

    :cond_29
    move-object v11, v12

    goto :goto_12

    :cond_2a
    :goto_10
    add-int/lit8 v10, v10, 0x1

    goto :goto_f

    :cond_2b
    :goto_11
    move-object v11, v4

    :cond_2c
    :goto_12
    if-eqz v11, :cond_2e

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    iget-object v3, v3, Lv0/m;->e:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    iget-object v8, v11, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2e

    invoke-virtual {v8}, Landroid/view/View;->hasFocusable()Z

    move-result v3

    if-nez v3, :cond_2d

    goto :goto_13

    :cond_2d
    move-object v4, v8

    goto :goto_17

    :cond_2e
    :goto_13
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v3}, Lv0/m;->p()I

    move-result v3

    if-lez v3, :cond_35

    iget v3, v1, LZ/T;->l:I

    if-eq v3, v7, :cond_2f

    move v2, v3

    :cond_2f
    invoke-virtual {v1}, LZ/T;->b()I

    move-result v3

    move v8, v2

    :goto_14
    if-ge v8, v3, :cond_32

    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->E(I)LZ/W;

    move-result-object v9

    if-nez v9, :cond_30

    goto :goto_15

    :cond_30
    iget-object v9, v9, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->hasFocusable()Z

    move-result v10

    if-eqz v10, :cond_31

    move-object v4, v9

    goto :goto_17

    :cond_31
    add-int/lit8 v8, v8, 0x1

    goto :goto_14

    :cond_32
    :goto_15
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    :goto_16
    if-ltz v2, :cond_35

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->E(I)LZ/W;

    move-result-object v3

    if-nez v3, :cond_33

    goto :goto_17

    :cond_33
    iget-object v3, v3, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->hasFocusable()Z

    move-result v8

    if-eqz v8, :cond_34

    move-object v4, v3

    goto :goto_17

    :cond_34
    add-int/lit8 v2, v2, -0x1

    goto :goto_16

    :cond_35
    :goto_17
    if-eqz v4, :cond_37

    iget v2, v1, LZ/T;->n:I

    int-to-long v8, v2

    cmp-long v3, v8, v5

    if-eqz v3, :cond_36

    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_36

    invoke-virtual {v2}, Landroid/view/View;->isFocusable()Z

    move-result v3

    if-eqz v3, :cond_36

    move-object v4, v2

    :cond_36
    invoke-virtual {v4}, Landroid/view/View;->requestFocus()Z

    :cond_37
    :goto_18
    iput-wide v5, v1, LZ/T;->m:J

    iput v7, v1, LZ/T;->l:I

    iput v7, v1, LZ/T;->n:I

    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 5

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    move-result v2

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v2, :cond_1

    iput-boolean v1, v2, LZ/H;->g:Z

    :cond_1
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->j0:Z

    sget-object v0, LZ/n;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ/n;

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LZ/n;

    if-nez v1, :cond_3

    new-instance v1, LZ/n;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/n;->b:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, LZ/n;->e:Ljava/util/ArrayList;

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LZ/n;

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/C;->b(Landroid/view/View;)Landroid/view/Display;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/Display;->getRefreshRate()F

    move-result v1

    const/high16 v2, 0x41f00000    # 30.0f

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_2

    goto :goto_1

    :cond_2
    const/high16 v1, 0x42700000    # 60.0f

    :goto_1
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LZ/n;

    const v3, 0x4e6e6b28    # 1.0E9f

    div-float/2addr v3, v1

    float-to-long v3, v3

    iput-wide v3, v2, LZ/n;->d:J

    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LZ/n;

    iget-object v0, v0, LZ/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LZ/D;->e()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    iget-object v2, v1, LZ/V;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, v1, LZ/V;->d:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v1, :cond_1

    iget-object v1, v1, LZ/H;->e:LZ/u;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LZ/u;->i()V

    :cond_1
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v1, :cond_2

    iput-boolean v0, v1, LZ/H;->g:Z

    invoke-virtual {v1, p0}, LZ/H;->O(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->q0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r0:LF0/h;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->g:Lv0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    sget-object v0, LZ/f0;->d:LI/b;

    invoke-virtual {v0}, LI/b;->a()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LZ/n;

    if-eqz v0, :cond_4

    iget-object v0, v0, LZ/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:LZ/n;

    :cond_4
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZ/E;

    invoke-virtual {v2, p0}, LZ/E;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0}, LZ/H;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    neg-float v0, v0

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3}, LZ/H;->d()Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0xa

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v3

    goto :goto_2

    :cond_3
    :goto_1
    move v3, v2

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    const/high16 v3, 0x400000

    and-int/2addr v0, v3

    if-eqz v0, :cond_6

    const/16 v0, 0x1a

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3}, LZ/H;->e()Z

    move-result v3

    if-eqz v3, :cond_5

    neg-float v0, v0

    goto :goto_1

    :cond_5
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3}, LZ/H;->d()Z

    move-result v3

    if-eqz v3, :cond_6

    move v3, v0

    move v0, v2

    goto :goto_2

    :cond_6
    move v0, v2

    move v3, v0

    :goto_2
    cmpl-float v4, v0, v2

    if-nez v4, :cond_7

    cmpl-float v2, v3, v2

    if-eqz v2, :cond_8

    :cond_7
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->U:F

    mul-float/2addr v3, v2

    float-to-int v2, v3

    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView;->V:F

    mul-float/2addr v0, v3

    float-to-int v0, v0

    invoke-virtual {p0, v2, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->Y(IILandroid/view/MotionEvent;)Z

    :cond_8
    return v1
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->p:LZ/l;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->B(Landroid/view/MotionEvent;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->X()V

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    return v2

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {v0}, LZ/H;->d()Z

    move-result v0

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v3}, LZ/H;->e()Z

    move-result v3

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    if-nez v4, :cond_3

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v4

    iput-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    :cond_3
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    invoke-virtual {v4, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v5

    const/4 v6, 0x2

    const/high16 v7, 0x3f000000    # 0.5f

    if-eqz v4, :cond_c

    if-eq v4, v2, :cond_b

    if-eq v4, v6, :cond_7

    const/4 v0, 0x3

    if-eq v4, v0, :cond_6

    const/4 v0, 0x5

    if-eq v4, v0, :cond_5

    const/4 v0, 0x6

    if-eq v4, v0, :cond_4

    goto/16 :goto_2

    :cond_4
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->R(Landroid/view/MotionEvent;)V

    goto/16 :goto_2

    :cond_5
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->K:I

    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    add-float/2addr v0, v7

    float-to-int v0, v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v7

    float-to-int p1, p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->P:I

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->N:I

    goto/16 :goto_2

    :cond_6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->X()V

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    goto/16 :goto_2

    :cond_7
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->K:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    if-gez v4, :cond_8

    return v1

    :cond_8
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    add-float/2addr v5, v7

    float-to-int v5, v5

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v7

    float-to-int p1, p1

    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    if-eq v4, v2, :cond_10

    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    sub-int v4, v5, v4

    iget v6, p0, Landroidx/recyclerview/widget/RecyclerView;->N:I

    sub-int v6, p1, v6

    if-eqz v0, :cond_9

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    if-le v0, v4, :cond_9

    iput v5, p0, Landroidx/recyclerview/widget/RecyclerView;->O:I

    move v0, v2

    goto :goto_0

    :cond_9
    move v0, v1

    :goto_0
    if-eqz v3, :cond_a

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    if-le v3, v4, :cond_a

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->P:I

    goto :goto_1

    :cond_a
    if-eqz v0, :cond_10

    :goto_1
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    goto :goto_2

    :cond_b
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->e0(I)V

    goto :goto_2

    :cond_c
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    if-eqz v4, :cond_d

    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    :cond_d
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->K:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    add-float/2addr v4, v7

    float-to-int v4, v4

    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->O:I

    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    add-float/2addr p1, v7

    float-to-int p1, p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->P:I

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->N:I

    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    if-ne p1, v6, :cond_e

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->e0(I)V

    :cond_e
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->o0:[I

    aput v1, p1, v2

    aput v1, p1, v1

    if-eqz v3, :cond_f

    or-int/lit8 v0, v0, 0x2

    :cond_f
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, LJ/n;->h(II)Z

    :cond_10
    :goto_2
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    if-ne p1, v2, :cond_11

    move v1, v2

    :cond_11
    return v1
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    sget p1, LF/k;->a:I

    const-string p1, "RV OnLayout"

    invoke-static {p1}, LF/j;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->o()V

    invoke-static {}, LF/j;->b()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    return-void
.end method

.method public final onMeasure(II)V
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->n(II)V

    return-void

    :cond_0
    invoke-virtual {v0}, LZ/H;->J()Z

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    if-eqz v0, :cond_4

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v3, v3, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->n(II)V

    const/high16 v3, 0x40000000    # 2.0f

    if-ne v0, v3, :cond_1

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-nez v0, :cond_2

    :goto_0
    return-void

    :cond_2
    iget v0, v1, LZ/T;->d:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0, p1, p2}, LZ/H;->n0(II)V

    iput-boolean v2, v1, LZ/T;->i:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->q()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0, p1, p2}, LZ/H;->p0(II)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0}, LZ/H;->s0()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    invoke-static {v4, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-static {v5, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v0, v4, v3}, LZ/H;->n0(II)V

    iput-boolean v2, v1, LZ/T;->i:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->q()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0, p1, p2}, LZ/H;->p0(II)V

    goto :goto_2

    :cond_4
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v0, v0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->n(II)V

    return-void

    :cond_5
    iget-boolean v0, v1, LZ/T;->k:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_6
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LZ/z;->a()I

    move-result v0

    iput v0, v1, LZ/T;->e:I

    goto :goto_1

    :cond_7
    iput v2, v1, LZ/T;->e:I

    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->c0()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v0, v0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->n(II)V

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->d0(Z)V

    iput-boolean v2, v1, LZ/T;->g:Z

    :cond_8
    :goto_2
    return-void
.end method

.method public final onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, LZ/P;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, LZ/P;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->d:LZ/P;

    iget-object p1, p1, LP/b;->b:Landroid/os/Parcelable;

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->d:LZ/P;

    iget-object v0, v0, LZ/P;->d:Landroid/os/Parcelable;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, LZ/H;->a0(Landroid/os/Parcelable;)V

    :cond_1
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    new-instance v0, LZ/P;

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, LP/b;-><init>(Landroid/os/Parcelable;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d:LZ/P;

    if-eqz v1, :cond_0

    iget-object v1, v1, LZ/P;->d:Landroid/os/Parcelable;

    iput-object v1, v0, LZ/P;->d:Landroid/os/Parcelable;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LZ/H;->b0()Landroid/os/Parcelable;

    move-result-object v1

    iput-object v1, v0, LZ/P;->d:Landroid/os/Parcelable;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    iput-object v1, v0, LZ/P;->d:Landroid/os/Parcelable;

    :goto_0
    return-object v0
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    if-ne p1, p3, :cond_0

    if-eq p2, p4, :cond_1

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    :cond_1
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 23

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    iget-boolean v0, v6, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    const/4 v8, 0x0

    if-nez v0, :cond_0

    iget-boolean v0, v6, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    if-eqz v0, :cond_1

    :cond_0
    move-object v1, v6

    move v0, v8

    goto/16 :goto_25

    :cond_1
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->p:LZ/l;

    const/4 v9, 0x1

    const/4 v1, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x0

    if-nez v0, :cond_48

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->B(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v1, v6

    move v2, v9

    goto/16 :goto_24

    :cond_3
    :goto_0
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-nez v0, :cond_4

    return v8

    :cond_4
    invoke-virtual {v0}, LZ/H;->d()Z

    move-result v10

    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0}, LZ/H;->e()Z

    move-result v11

    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    if-nez v0, :cond_5

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v5

    iget-object v12, v6, Landroidx/recyclerview/widget/RecyclerView;->o0:[I

    if-nez v0, :cond_6

    aput v8, v12, v9

    aput v8, v12, v8

    :cond_6
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v13

    aget v14, v12, v8

    int-to-float v14, v14

    aget v15, v12, v9

    int-to-float v15, v15

    invoke-virtual {v13, v14, v15}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    const/high16 v14, 0x3f000000    # 0.5f

    if-eqz v0, :cond_46

    if-eq v0, v9, :cond_19

    if-eq v0, v1, :cond_b

    if-eq v0, v3, :cond_a

    const/4 v1, 0x5

    if-eq v0, v1, :cond_9

    const/4 v1, 0x6

    if-eq v0, v1, :cond_8

    :cond_7
    :goto_1
    move-object v1, v6

    move-object/from16 v21, v13

    goto/16 :goto_1f

    :cond_8
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->R(Landroid/view/MotionEvent;)V

    goto :goto_1

    :cond_9
    invoke-virtual {v7, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->K:I

    invoke-virtual {v7, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    add-float/2addr v0, v14

    float-to-int v0, v0

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->O:I

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->M:I

    invoke-virtual {v7, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    add-float/2addr v0, v14

    float-to-int v0, v0

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->P:I

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->N:I

    goto :goto_1

    :cond_a
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->X()V

    invoke-virtual {v6, v8}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    goto :goto_1

    :cond_b
    iget v0, v6, Landroidx/recyclerview/widget/RecyclerView;->K:I

    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_c

    return v8

    :cond_c
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    add-float/2addr v1, v14

    float-to-int v15, v1

    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    add-float/2addr v0, v14

    float-to-int v14, v0

    iget v0, v6, Landroidx/recyclerview/widget/RecyclerView;->O:I

    sub-int/2addr v0, v15

    iget v1, v6, Landroidx/recyclerview/widget/RecyclerView;->P:I

    sub-int/2addr v1, v14

    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->J:I

    if-eq v2, v9, :cond_11

    if-eqz v10, :cond_e

    if-lez v0, :cond_d

    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    sub-int/2addr v0, v2

    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_2

    :cond_d
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    add-int/2addr v0, v2

    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_2
    if-eqz v0, :cond_e

    move v2, v9

    goto :goto_3

    :cond_e
    move v2, v8

    :goto_3
    if-eqz v11, :cond_10

    if-lez v1, :cond_f

    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    sub-int/2addr v1, v3

    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_4

    :cond_f
    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    add-int/2addr v1, v3

    invoke-static {v8, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_4
    if-eqz v1, :cond_10

    move v2, v9

    :cond_10
    if-eqz v2, :cond_11

    invoke-virtual {v6, v9}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    :cond_11
    move/from16 v16, v0

    move/from16 v17, v1

    iget v0, v6, Landroidx/recyclerview/widget/RecyclerView;->J:I

    if-ne v0, v9, :cond_7

    iget-object v5, v6, Landroidx/recyclerview/widget/RecyclerView;->p0:[I

    aput v8, v5, v8

    aput v8, v5, v9

    if-eqz v10, :cond_12

    move/from16 v1, v16

    goto :goto_5

    :cond_12
    move v1, v8

    :goto_5
    if-eqz v11, :cond_13

    move/from16 v2, v17

    goto :goto_6

    :cond_13
    move v2, v8

    :goto_6
    iget-object v4, v6, Landroidx/recyclerview/widget/RecyclerView;->n0:[I

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object v3, v5

    move-object/from16 v19, v5

    move/from16 v5, v18

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->r(II[I[II)Z

    move-result v0

    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->n0:[I

    if-eqz v0, :cond_14

    aget v0, v19, v8

    sub-int v16, v16, v0

    aget v0, v19, v9

    sub-int v17, v17, v0

    aget v0, v12, v8

    aget v2, v1, v8

    add-int/2addr v0, v2

    aput v0, v12, v8

    aget v0, v12, v9

    aget v2, v1, v9

    add-int/2addr v0, v2

    aput v0, v12, v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v9}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_14
    move/from16 v0, v16

    move/from16 v2, v17

    aget v3, v1, v8

    sub-int/2addr v15, v3

    iput v15, v6, Landroidx/recyclerview/widget/RecyclerView;->O:I

    aget v1, v1, v9

    sub-int/2addr v14, v1

    iput v14, v6, Landroidx/recyclerview/widget/RecyclerView;->P:I

    if-eqz v10, :cond_15

    move v1, v0

    goto :goto_7

    :cond_15
    move v1, v8

    :goto_7
    if-eqz v11, :cond_16

    move v8, v2

    :cond_16
    invoke-virtual {v6, v1, v8, v7}, Landroidx/recyclerview/widget/RecyclerView;->Y(IILandroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v9}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_17
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->b0:LZ/n;

    if-eqz v1, :cond_7

    if-nez v0, :cond_18

    if-eqz v2, :cond_7

    :cond_18
    invoke-virtual {v1, v6, v0, v2}, LZ/n;->a(Landroidx/recyclerview/widget/RecyclerView;II)V

    goto/16 :goto_1

    :cond_19
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    invoke-virtual {v0, v13}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView;->T:I

    int-to-float v5, v3

    const/16 v7, 0x3e8

    invoke-virtual {v0, v7, v5}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    if-eqz v10, :cond_1a

    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    iget v5, v6, Landroidx/recyclerview/widget/RecyclerView;->K:I

    invoke-virtual {v0, v5}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    neg-float v0, v0

    goto :goto_8

    :cond_1a
    move v0, v4

    :goto_8
    if-eqz v11, :cond_1b

    iget-object v5, v6, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    iget v7, v6, Landroidx/recyclerview/widget/RecyclerView;->K:I

    invoke-virtual {v5, v7}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v5

    neg-float v5, v5

    goto :goto_9

    :cond_1b
    move v5, v4

    :goto_9
    cmpl-float v7, v0, v4

    if-nez v7, :cond_1d

    cmpl-float v7, v5, v4

    if-eqz v7, :cond_1c

    goto :goto_a

    :cond_1c
    move-object v1, v6

    move v0, v8

    move-object/from16 v21, v13

    goto/16 :goto_1d

    :cond_1d
    :goto_a
    float-to-int v0, v0

    float-to-int v5, v5

    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-nez v7, :cond_1f

    :cond_1e
    :goto_b
    move-object v1, v6

    move-object/from16 v21, v13

    goto/16 :goto_1c

    :cond_1f
    iget-boolean v10, v6, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-eqz v10, :cond_20

    goto :goto_b

    :cond_20
    invoke-virtual {v7}, LZ/H;->d()Z

    move-result v7

    iget-object v10, v6, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v10}, LZ/H;->e()Z

    move-result v10

    iget v11, v6, Landroidx/recyclerview/widget/RecyclerView;->S:I

    if-eqz v7, :cond_21

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v12

    if-ge v12, v11, :cond_22

    :cond_21
    move v0, v8

    :cond_22
    if-eqz v10, :cond_23

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v12

    if-ge v12, v11, :cond_24

    :cond_23
    move v5, v8

    :cond_24
    if-nez v0, :cond_25

    if-nez v5, :cond_25

    goto :goto_b

    :cond_25
    int-to-float v11, v0

    int-to-float v12, v5

    invoke-virtual {v6, v11, v12}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedPreFling(FF)Z

    move-result v14

    if-nez v14, :cond_1e

    if-nez v7, :cond_27

    if-eqz v10, :cond_26

    goto :goto_c

    :cond_26
    move v14, v8

    goto :goto_d

    :cond_27
    :goto_c
    move v14, v9

    :goto_d
    invoke-virtual {v6, v11, v12, v14}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedFling(FFZ)Z

    iget-object v11, v6, Landroidx/recyclerview/widget/RecyclerView;->R:LZ/J;

    if-eqz v11, :cond_42

    check-cast v11, LZ/x;

    iget-object v12, v11, LZ/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v12}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object v12

    if-nez v12, :cond_28

    goto/16 :goto_1a

    :cond_28
    iget-object v15, v11, LZ/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v15}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()LZ/z;

    move-result-object v15

    if-nez v15, :cond_29

    goto/16 :goto_1a

    :cond_29
    iget-object v15, v11, LZ/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v15}, Landroidx/recyclerview/widget/RecyclerView;->getMinFlingVelocity()I

    move-result v15

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-gt v2, v15, :cond_2a

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-le v2, v15, :cond_42

    :cond_2a
    instance-of v2, v12, LZ/S;

    if-nez v2, :cond_2b

    goto/16 :goto_1a

    :cond_2b
    if-nez v2, :cond_2c

    const/4 v15, 0x0

    goto :goto_e

    :cond_2c
    new-instance v15, LH0/a;

    iget-object v8, v11, LZ/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    const/4 v1, 0x1

    invoke-direct {v15, v11, v8, v1}, LH0/a;-><init>(Ljava/lang/Object;Landroid/content/Context;I)V

    :goto_e
    if-nez v15, :cond_2d

    goto/16 :goto_1a

    :cond_2d
    invoke-virtual {v12}, LZ/H;->z()I

    move-result v1

    if-nez v1, :cond_2f

    :goto_f
    move-object/from16 v21, v13

    :cond_2e
    :goto_10
    const/4 v1, -0x1

    :goto_11
    const/4 v2, -0x1

    goto/16 :goto_19

    :cond_2f
    invoke-virtual {v12}, LZ/H;->e()Z

    move-result v19

    if-eqz v19, :cond_30

    invoke-virtual {v11, v12}, LZ/x;->e(LZ/H;)LZ/w;

    move-result-object v11

    goto :goto_12

    :cond_30
    invoke-virtual {v12}, LZ/H;->d()Z

    move-result v19

    if-eqz v19, :cond_31

    invoke-virtual {v11, v12}, LZ/x;->d(LZ/H;)LZ/w;

    move-result-object v11

    goto :goto_12

    :cond_31
    const/4 v11, 0x0

    :goto_12
    if-nez v11, :cond_32

    goto :goto_f

    :cond_32
    invoke-virtual {v12}, LZ/H;->v()I

    move-result v8

    const/high16 v19, -0x80000000

    const v20, 0x7fffffff

    move-object/from16 v21, v13

    move/from16 v9, v19

    move/from16 v13, v20

    const/4 v4, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    :goto_13
    if-ge v4, v8, :cond_36

    move/from16 v22, v8

    invoke-virtual {v12, v4}, LZ/H;->u(I)Landroid/view/View;

    move-result-object v8

    if-nez v8, :cond_33

    goto :goto_14

    :cond_33
    invoke-static {v8, v11}, LZ/x;->b(Landroid/view/View;LZ/w;)I

    move-result v6

    if-gtz v6, :cond_34

    if-le v6, v9, :cond_34

    move v9, v6

    move-object/from16 v19, v8

    :cond_34
    if-ltz v6, :cond_35

    if-ge v6, v13, :cond_35

    move v13, v6

    move-object/from16 v16, v8

    :cond_35
    :goto_14
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v6, p0

    move/from16 v8, v22

    goto :goto_13

    :cond_36
    invoke-virtual {v12}, LZ/H;->d()Z

    move-result v4

    if-eqz v4, :cond_38

    if-lez v0, :cond_37

    :goto_15
    const/4 v4, 0x1

    goto :goto_16

    :cond_37
    const/4 v4, 0x0

    goto :goto_16

    :cond_38
    if-lez v5, :cond_37

    goto :goto_15

    :goto_16
    if-eqz v4, :cond_39

    if-eqz v16, :cond_39

    invoke-static/range {v16 .. v16}, LZ/H;->F(Landroid/view/View;)I

    move-result v1

    goto :goto_11

    :cond_39
    if-nez v4, :cond_3a

    if-eqz v19, :cond_3a

    invoke-static/range {v19 .. v19}, LZ/H;->F(Landroid/view/View;)I

    move-result v1

    goto :goto_11

    :cond_3a
    if-eqz v4, :cond_3b

    move-object/from16 v16, v19

    :cond_3b
    if-nez v16, :cond_3c

    goto :goto_10

    :cond_3c
    invoke-static/range {v16 .. v16}, LZ/H;->F(Landroid/view/View;)I

    move-result v6

    invoke-virtual {v12}, LZ/H;->z()I

    move-result v8

    if-eqz v2, :cond_3e

    move-object v2, v12

    check-cast v2, LZ/S;

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    invoke-interface {v2, v8}, LZ/S;->a(I)Landroid/graphics/PointF;

    move-result-object v2

    if-eqz v2, :cond_3e

    iget v8, v2, Landroid/graphics/PointF;->x:F

    const/4 v9, 0x0

    cmpg-float v8, v8, v9

    if-ltz v8, :cond_3d

    iget v2, v2, Landroid/graphics/PointF;->y:F

    cmpg-float v2, v2, v9

    if-gez v2, :cond_3e

    :cond_3d
    const/4 v2, 0x1

    goto :goto_17

    :cond_3e
    const/4 v2, 0x0

    :goto_17
    if-ne v2, v4, :cond_3f

    const/4 v2, -0x1

    goto :goto_18

    :cond_3f
    const/4 v2, 0x1

    :goto_18
    add-int/2addr v2, v6

    if-ltz v2, :cond_2e

    if-lt v2, v1, :cond_40

    goto/16 :goto_10

    :cond_40
    move v1, v2

    goto/16 :goto_11

    :goto_19
    if-ne v1, v2, :cond_41

    goto :goto_1b

    :cond_41
    iput v1, v15, LZ/u;->a:I

    invoke-virtual {v12, v15}, LZ/H;->v0(LZ/u;)V

    move-object/from16 v1, p0

    goto :goto_1e

    :cond_42
    :goto_1a
    move-object/from16 v21, v13

    :goto_1b
    if-eqz v14, :cond_45

    if-eqz v10, :cond_43

    or-int/lit8 v7, v7, 0x2

    :cond_43
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v7, v2}, LJ/n;->h(II)Z

    neg-int v1, v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v10

    move-object/from16 v1, p0

    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    iget-object v2, v0, LZ/V;->h:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    const/4 v3, 0x0

    iput v3, v0, LZ/V;->c:I

    iput v3, v0, LZ/V;->b:I

    iget-object v3, v0, LZ/V;->e:Landroid/view/animation/Interpolator;

    sget-object v4, Landroidx/recyclerview/widget/RecyclerView;->v0:LQ/d;

    if-eq v3, v4, :cond_44

    iput-object v4, v0, LZ/V;->e:Landroid/view/animation/Interpolator;

    new-instance v3, Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v3, v2, v4}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v3, v0, LZ/V;->d:Landroid/widget/OverScroller;

    :cond_44
    iget-object v6, v0, LZ/V;->d:Landroid/widget/OverScroller;

    const/high16 v11, -0x80000000

    const v12, 0x7fffffff

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/high16 v13, -0x80000000

    const v14, 0x7fffffff

    invoke-virtual/range {v6 .. v14}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    invoke-virtual {v0}, LZ/V;->a()V

    goto :goto_1e

    :cond_45
    move-object/from16 v1, p0

    :goto_1c
    const/4 v0, 0x0

    :goto_1d
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    :goto_1e
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->X()V

    move-object/from16 v2, v21

    goto :goto_20

    :cond_46
    move-object v1, v6

    move v0, v8

    move-object/from16 v21, v13

    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, v1, Landroidx/recyclerview/widget/RecyclerView;->K:I

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    add-float/2addr v0, v14

    float-to-int v0, v0

    iput v0, v1, Landroidx/recyclerview/widget/RecyclerView;->O:I

    iput v0, v1, Landroidx/recyclerview/widget/RecyclerView;->M:I

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    add-float/2addr v0, v14

    float-to-int v0, v0

    iput v0, v1, Landroidx/recyclerview/widget/RecyclerView;->P:I

    iput v0, v1, Landroidx/recyclerview/widget/RecyclerView;->N:I

    if-eqz v11, :cond_47

    or-int/lit8 v10, v10, 0x2

    :cond_47
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v10, v2}, LJ/n;->h(II)Z

    :goto_1f
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    move-object/from16 v2, v21

    invoke-virtual {v0, v2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :goto_20
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    const/4 v0, 0x1

    return v0

    :cond_48
    move-object v1, v6

    iget v2, v0, LZ/l;->v:I

    if-nez v2, :cond_49

    goto/16 :goto_23

    :cond_49
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_4d

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v0, v2, v4}, LZ/l;->d(FF)Z

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-virtual {v0, v4, v5}, LZ/l;->c(FF)Z

    move-result v4

    if-nez v2, :cond_4a

    if-eqz v4, :cond_54

    :cond_4a
    if-eqz v4, :cond_4c

    const/4 v4, 0x1

    iput v4, v0, LZ/l;->w:I

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    int-to-float v2, v2

    iput v2, v0, LZ/l;->p:F

    :cond_4b
    const/4 v2, 0x2

    goto :goto_21

    :cond_4c
    if-eqz v2, :cond_4b

    const/4 v2, 0x2

    iput v2, v0, LZ/l;->w:I

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    int-to-float v4, v4

    iput v4, v0, LZ/l;->m:F

    :goto_21
    invoke-virtual {v0, v2}, LZ/l;->f(I)V

    goto/16 :goto_23

    :cond_4d
    const/4 v2, 0x2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_4e

    iget v4, v0, LZ/l;->v:I

    if-ne v4, v2, :cond_4e

    const/4 v4, 0x0

    iput v4, v0, LZ/l;->m:F

    iput v4, v0, LZ/l;->p:F

    invoke-virtual {v0, v5}, LZ/l;->f(I)V

    const/4 v2, 0x0

    iput v2, v0, LZ/l;->w:I

    goto/16 :goto_23

    :cond_4e
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    if-ne v4, v2, :cond_54

    iget v4, v0, LZ/l;->v:I

    if-ne v4, v2, :cond_54

    invoke-virtual {v0}, LZ/l;->g()V

    iget v2, v0, LZ/l;->w:I

    const/high16 v4, 0x40000000    # 2.0f

    iget v5, v0, LZ/l;->b:I

    const/4 v6, 0x1

    if-ne v2, v6, :cond_51

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget-object v10, v0, LZ/l;->y:[I

    const/4 v8, 0x0

    aput v5, v10, v8

    iget v8, v0, LZ/l;->q:I

    sub-int/2addr v8, v5

    aput v8, v10, v6

    int-to-float v6, v5

    int-to-float v8, v8

    invoke-static {v8, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v6, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget v6, v0, LZ/l;->o:I

    int-to-float v6, v6

    sub-float/2addr v6, v2

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v4

    if-gez v6, :cond_4f

    goto :goto_22

    :cond_4f
    iget v8, v0, LZ/l;->p:F

    iget-object v6, v0, LZ/l;->s:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollRange()I

    move-result v11

    iget-object v6, v0, LZ/l;->s:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I

    move-result v12

    iget v13, v0, LZ/l;->q:I

    move v9, v2

    invoke-static/range {v8 .. v13}, LZ/l;->e(FF[IIII)I

    move-result v6

    if-eqz v6, :cond_50

    iget-object v8, v0, LZ/l;->s:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v9, 0x0

    invoke-virtual {v8, v6, v9}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    :cond_50
    iput v2, v0, LZ/l;->p:F

    :cond_51
    :goto_22
    iget v2, v0, LZ/l;->w:I

    const/4 v6, 0x2

    if-ne v2, v6, :cond_54

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget-object v10, v0, LZ/l;->x:[I

    const/4 v6, 0x0

    aput v5, v10, v6

    iget v6, v0, LZ/l;->r:I

    sub-int/2addr v6, v5

    const/4 v8, 0x1

    aput v6, v10, v8

    int-to-float v5, v5

    int-to-float v6, v6

    invoke-static {v6, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget v5, v0, LZ/l;->l:I

    int-to-float v5, v5

    sub-float/2addr v5, v2

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpg-float v4, v5, v4

    if-gez v4, :cond_52

    goto :goto_23

    :cond_52
    iget v8, v0, LZ/l;->m:F

    iget-object v4, v0, LZ/l;->s:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I

    move-result v11

    iget-object v4, v0, LZ/l;->s:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    move-result v12

    iget v13, v0, LZ/l;->r:I

    move v9, v2

    invoke-static/range {v8 .. v13}, LZ/l;->e(FF[IIII)I

    move-result v4

    if-eqz v4, :cond_53

    iget-object v5, v0, LZ/l;->s:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v6, 0x0

    invoke-virtual {v5, v6, v4}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    :cond_53
    iput v2, v0, LZ/l;->m:F

    :cond_54
    :goto_23
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v3, :cond_55

    if-ne v0, v2, :cond_56

    :cond_55
    const/4 v0, 0x0

    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->p:LZ/l;

    :cond_56
    :goto_24
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->X()V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    return v2

    :goto_25
    return v0
.end method

.method public final p()V
    .locals 12

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LZ/T;->a(I)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->z(LZ/T;)V

    const/4 v2, 0x0

    iput-boolean v2, v0, LZ/T;->i:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->c0()V

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->g:Lv0/e;

    iget-object v4, v3, Lv0/e;->b:Ljava/lang/Object;

    check-cast v4, Ln/k;

    invoke-virtual {v4}, Ln/k;->clear()V

    iget-object v4, v3, Lv0/e;->c:Ljava/lang/Object;

    check-cast v4, Ln/e;

    invoke-virtual {v4}, Ln/e;->a()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->P()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->T()V

    iget-boolean v5, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Z

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-eqz v5, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    if-nez v5, :cond_1

    :goto_1
    move-object v5, v6

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView;->A(Landroid/view/View;)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView;->H(Landroid/view/View;)LZ/W;

    move-result-object v5

    :goto_2
    const-wide/16 v7, -0x1

    const/4 v9, -0x1

    if-nez v5, :cond_3

    iput-wide v7, v0, LZ/T;->m:J

    iput v9, v0, LZ/T;->l:I

    iput v9, v0, LZ/T;->n:I

    goto :goto_6

    :cond_3
    iget-object v10, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    iget-boolean v10, v10, LZ/z;->b:Z

    if-eqz v10, :cond_4

    iget-wide v7, v5, LZ/W;->e:J

    :cond_4
    iput-wide v7, v0, LZ/T;->m:J

    iget-boolean v7, p0, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    if-eqz v7, :cond_5

    :goto_3
    move v7, v9

    goto :goto_4

    :cond_5
    invoke-virtual {v5}, LZ/W;->j()Z

    move-result v7

    if-eqz v7, :cond_6

    iget v7, v5, LZ/W;->d:I

    goto :goto_4

    :cond_6
    iget-object v7, v5, LZ/W;->r:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v7, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v7, v5}, Landroidx/recyclerview/widget/RecyclerView;->F(LZ/W;)I

    move-result v7

    :goto_4
    iput v7, v0, LZ/T;->l:I

    iget-object v5, v5, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v7

    :cond_8
    :goto_5
    invoke-virtual {v5}, Landroid/view/View;->isFocused()Z

    move-result v8

    if-nez v8, :cond_9

    instance-of v8, v5, Landroid/view/ViewGroup;

    if-eqz v8, :cond_9

    invoke-virtual {v5}, Landroid/view/View;->hasFocus()Z

    move-result v8

    if-eqz v8, :cond_9

    check-cast v5, Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v8

    if-eq v8, v9, :cond_8

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v7

    goto :goto_5

    :cond_9
    iput v7, v0, LZ/T;->n:I

    :goto_6
    iget-boolean v5, v0, LZ/T;->j:Z

    if-eqz v5, :cond_a

    iget-boolean v5, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:Z

    if-eqz v5, :cond_a

    move v5, v1

    goto :goto_7

    :cond_a
    move v5, v2

    :goto_7
    iput-boolean v5, v0, LZ/T;->h:Z

    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:Z

    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:Z

    iget-boolean v5, v0, LZ/T;->k:Z

    iput-boolean v5, v0, LZ/T;->g:Z

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    invoke-virtual {v5}, LZ/z;->a()I

    move-result v5

    iput v5, v0, LZ/T;->e:I

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->l0:[I

    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView;->C([I)V

    iget-boolean v5, v0, LZ/T;->j:Z

    iget-object v3, v3, Lv0/e;->b:Ljava/lang/Object;

    check-cast v3, Ln/k;

    if-eqz v5, :cond_e

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v5}, Lv0/m;->p()I

    move-result v5

    move v7, v2

    :goto_8
    if-ge v7, v5, :cond_e

    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v8, v7}, Lv0/m;->o(I)Landroid/view/View;

    move-result-object v8

    invoke-static {v8}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v8

    invoke-virtual {v8}, LZ/W;->q()Z

    move-result v10

    if-nez v10, :cond_d

    invoke-virtual {v8}, LZ/W;->h()Z

    move-result v10

    if-eqz v10, :cond_b

    iget-object v10, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    iget-boolean v10, v10, LZ/z;->b:Z

    if-nez v10, :cond_b

    goto :goto_9

    :cond_b
    iget-object v10, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    invoke-static {v8}, LZ/D;->b(LZ/W;)V

    invoke-virtual {v8}, LZ/W;->d()Ljava/util/List;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, LA1/i;

    const/4 v11, 0x3

    invoke-direct {v10, v11}, LA1/i;-><init>(I)V

    invoke-virtual {v10, v8}, LA1/i;->a(LZ/W;)V

    invoke-virtual {v3, v8, v6}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LZ/f0;

    if-nez v11, :cond_c

    invoke-static {}, LZ/f0;->a()LZ/f0;

    move-result-object v11

    invoke-virtual {v3, v8, v11}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    iput-object v10, v11, LZ/f0;->b:LA1/i;

    iget v10, v11, LZ/f0;->a:I

    or-int/lit8 v10, v10, 0x4

    iput v10, v11, LZ/f0;->a:I

    iget-boolean v10, v0, LZ/T;->h:Z

    if-eqz v10, :cond_d

    invoke-virtual {v8}, LZ/W;->m()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-virtual {v8}, LZ/W;->j()Z

    move-result v10

    if-nez v10, :cond_d

    invoke-virtual {v8}, LZ/W;->q()Z

    move-result v10

    if-nez v10, :cond_d

    invoke-virtual {v8}, LZ/W;->h()Z

    move-result v10

    if-nez v10, :cond_d

    invoke-virtual {p0, v8}, Landroidx/recyclerview/widget/RecyclerView;->G(LZ/W;)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11, v8}, Ln/e;->e(JLjava/lang/Object;)V

    :cond_d
    :goto_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    :cond_e
    iget-boolean v4, v0, LZ/T;->k:Z

    const/4 v5, 0x2

    if-eqz v4, :cond_16

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v4}, Lv0/m;->x()I

    move-result v4

    move v7, v2

    :goto_a
    if-ge v7, v4, :cond_10

    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v8, v7}, Lv0/m;->w(I)Landroid/view/View;

    move-result-object v8

    invoke-static {v8}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v8

    invoke-virtual {v8}, LZ/W;->q()Z

    move-result v10

    if-nez v10, :cond_f

    iget v10, v8, LZ/W;->d:I

    if-ne v10, v9, :cond_f

    iget v10, v8, LZ/W;->c:I

    iput v10, v8, LZ/W;->d:I

    :cond_f
    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_10
    iget-boolean v4, v0, LZ/T;->f:Z

    iput-boolean v2, v0, LZ/T;->f:Z

    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    invoke-virtual {v7, v8, v0}, LZ/H;->Y(LZ/N;LZ/T;)V

    iput-boolean v4, v0, LZ/T;->f:Z

    move v4, v2

    :goto_b
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v7}, Lv0/m;->p()I

    move-result v7

    if-ge v4, v7, :cond_15

    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v7, v4}, Lv0/m;->o(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v7

    invoke-virtual {v7}, LZ/W;->q()Z

    move-result v8

    if-eqz v8, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v3, v7, v6}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LZ/f0;

    if-eqz v8, :cond_12

    iget v8, v8, LZ/f0;->a:I

    and-int/lit8 v8, v8, 0x4

    if-eqz v8, :cond_12

    goto :goto_c

    :cond_12
    invoke-static {v7}, LZ/D;->b(LZ/W;)V

    const/16 v8, 0x2000

    invoke-virtual {v7, v8}, LZ/W;->e(I)Z

    move-result v8

    iget-object v9, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    invoke-virtual {v7}, LZ/W;->d()Ljava/util/List;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v9, LA1/i;

    const/4 v10, 0x3

    invoke-direct {v9, v10}, LA1/i;-><init>(I)V

    invoke-virtual {v9, v7}, LA1/i;->a(LZ/W;)V

    if-eqz v8, :cond_13

    invoke-virtual {p0, v7, v9}, Landroidx/recyclerview/widget/RecyclerView;->V(LZ/W;LA1/i;)V

    goto :goto_c

    :cond_13
    invoke-virtual {v3, v7, v6}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LZ/f0;

    if-nez v8, :cond_14

    invoke-static {}, LZ/f0;->a()LZ/f0;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    iget v7, v8, LZ/f0;->a:I

    or-int/2addr v7, v5

    iput v7, v8, LZ/f0;->a:I

    iput-object v9, v8, LZ/f0;->b:LA1/i;

    :goto_c
    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_15
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->k()V

    goto :goto_d

    :cond_16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->k()V

    :goto_d
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->Q(Z)V

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->d0(Z)V

    iput v5, v0, LZ/T;->d:I

    return-void
.end method

.method public final q()V
    .locals 4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->c0()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->P()V

    const/4 v0, 0x6

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    invoke-virtual {v1, v0}, LZ/T;->a(I)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LG/e;

    invoke-virtual {v0}, LG/e;->d()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    invoke-virtual {v0}, LZ/z;->a()I

    move-result v0

    iput v0, v1, LZ/T;->e:I

    const/4 v0, 0x0

    iput v0, v1, LZ/T;->c:I

    iput-boolean v0, v1, LZ/T;->g:Z

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    invoke-virtual {v2, v3, v1}, LZ/H;->Y(LZ/N;LZ/T;)V

    iput-boolean v0, v1, LZ/T;->f:Z

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->d:LZ/P;

    iget-boolean v2, v1, LZ/T;->j:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    iput-boolean v2, v1, LZ/T;->j:Z

    const/4 v2, 0x4

    iput v2, v1, LZ/T;->d:I

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->Q(Z)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->d0(Z)V

    return-void
.end method

.method public final r(II[I[II)Z
    .locals 6

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, LJ/n;->c(II[I[II)Z

    move-result p1

    return p1
.end method

.method public final removeDetachedView(Landroid/view/View;Z)V
    .locals 2

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LZ/W;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, LZ/W;->j:I

    and-int/lit16 v1, v1, -0x101

    iput v1, v0, LZ/W;->j:I

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LZ/W;->q()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Called removeDetachedView with a view which is not flagged as tmp detached."

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method public final requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v0, v0, LZ/H;->e:LZ/u;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, LZ/u;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;Landroid/view/View;)V

    :cond_2
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public final requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, LZ/H;->h0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    move-result p1

    return p1
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZ/l;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public final requestLayout()V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    :goto_0
    return-void
.end method

.method public final s(IIII[II[I)V
    .locals 8

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, LJ/n;->e(IIII[II[I)Z

    return-void
.end method

.method public final scrollBy(II)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, LZ/H;->d()Z

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v1}, LZ/H;->e()Z

    move-result v1

    if-nez v0, :cond_2

    if-eqz v1, :cond_5

    :cond_2
    const/4 v2, 0x0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    move p1, v2

    :goto_0
    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    move p2, v2

    :goto_1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->Y(IILandroid/view/MotionEvent;)Z

    :cond_5
    return-void
.end method

.method public final scrollTo(II)V
    .locals 0

    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, LK/b;->a(Landroid/view/accessibility/AccessibilityEvent;)I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    move v0, p1

    :goto_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->x:I

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->x:I

    return-void

    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public setAccessibilityDelegateCompat(LZ/Y;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->k0:LZ/Y;

    invoke-static {p0, p1}, LJ/T;->l(Landroid/view/View;LJ/c;)V

    return-void
.end method

.method public setAdapter(LZ/z;)V
    .locals 6

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutFrozen(Z)V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->b:LU0/e;

    if-eqz v1, :cond_0

    iget-object v1, v1, LZ/z;->a:LZ/A;

    invoke-virtual {v1, v2}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LZ/D;->e()V

    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v3}, LZ/H;->d0(LZ/N;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v1, v3}, LZ/H;->e0(LZ/N;)V

    :cond_2
    iget-object v1, v3, LZ/N;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3}, LZ/N;->d()V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->e:LG/e;

    iget-object v4, v1, LG/e;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, LG/e;->n(Ljava/util/ArrayList;)V

    iget-object v4, v1, LG/e;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, LG/e;->n(Ljava/util/ArrayList;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-eqz p1, :cond_3

    iget-object p1, p1, LZ/z;->a:LZ/A;

    invoke-virtual {p1, v2}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    :cond_3
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    iget-object v2, v3, LZ/N;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3}, LZ/N;->d()V

    invoke-virtual {v3}, LZ/N;->c()LZ/M;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    iget v1, v2, LZ/M;->b:I

    sub-int/2addr v1, v3

    iput v1, v2, LZ/M;->b:I

    :cond_4
    iget v1, v2, LZ/M;->b:I

    if-nez v1, :cond_5

    move v1, v0

    :goto_0
    iget-object v4, v2, LZ/M;->a:Landroid/util/SparseArray;

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-ge v1, v5, :cond_5

    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LZ/L;

    iget-object v4, v4, LZ/L;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    if-eqz p1, :cond_6

    iget p1, v2, LZ/M;->b:I

    add-int/2addr p1, v3

    iput p1, v2, LZ/M;->b:I

    :cond_6
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    iput-boolean v3, p1, LZ/T;->f:Z

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->U(Z)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public setChildDrawingOrderCallback(LZ/B;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    return-void
.end method

.method public setClipToPadding(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    :cond_1
    return-void
.end method

.method public setEdgeEffectFactory(LZ/C;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:LZ/C;

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    return-void
.end method

.method public setHasFixedSize(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Z

    return-void
.end method

.method public setItemAnimator(LZ/D;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LZ/D;->e()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    const/4 v1, 0x0

    iput-object v1, v0, LZ/D;->a:LZ/y;

    :cond_0
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:LZ/y;

    iput-object v0, p1, LZ/D;->a:LZ/y;

    :cond_1
    return-void
.end method

.method public setItemViewCacheSize(I)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    iput p1, v0, LZ/N;->e:I

    invoke-virtual {v0}, LZ/N;->k()V

    return-void
.end method

.method public setLayoutFrozen(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->suppressLayout(Z)V

    return-void
.end method

.method public setLayoutManager(LZ/H;)V
    .locals 10

    const/4 v0, 0x1

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-ne p1, v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    iget-object v3, v2, LZ/V;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v2, v2, LZ/V;->d:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->abortAnimation()V

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v2, :cond_1

    iget-object v2, v2, LZ/H;->e:LZ/u;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LZ/u;->i()V

    :cond_1
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    if-eqz v2, :cond_4

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LZ/D;->e()V

    :cond_2
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v2, v3}, LZ/H;->d0(LZ/N;)V

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v2, v3}, LZ/H;->e0(LZ/N;)V

    iget-object v2, v3, LZ/N;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3}, LZ/N;->d()V

    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iput-boolean v1, v2, LZ/H;->g:Z

    invoke-virtual {v2, p0}, LZ/H;->O(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_3
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, LZ/H;->q0(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    goto :goto_0

    :cond_4
    iget-object v2, v3, LZ/N;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3}, LZ/N;->d()V

    :goto_0
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    iget-object v4, v2, Lv0/m;->d:Ljava/lang/Object;

    check-cast v4, LZ/b;

    invoke-virtual {v4}, LZ/b;->h()V

    iget-object v4, v2, Lv0/m;->e:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    sub-int/2addr v5, v0

    :goto_1
    iget-object v6, v2, Lv0/m;->c:Ljava/lang/Object;

    check-cast v6, LZ/y;

    if-ltz v5, :cond_7

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/View;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v7

    if-eqz v7, :cond_6

    iget v8, v7, LZ/W;->p:I

    iget-object v6, v6, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    move-result v9

    if-eqz v9, :cond_5

    iput v8, v7, LZ/W;->q:I

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->q0:Ljava/util/ArrayList;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    sget-object v6, LJ/T;->a:Ljava/util/WeakHashMap;

    iget-object v6, v7, LZ/W;->a:Landroid/view/View;

    invoke-static {v6, v8}, LJ/B;->s(Landroid/view/View;I)V

    :goto_2
    iput v1, v7, LZ/W;->p:I

    :cond_6
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_7
    iget-object v2, v6, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    :goto_3
    if-ge v1, v4, :cond_8

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    invoke-virtual {v5}, Landroid/view/View;->clearAnimation()V

    add-int/2addr v1, v0

    goto :goto_3

    :cond_8
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz p1, :cond_a

    iget-object v1, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v1, :cond_9

    invoke-virtual {p1, p0}, LZ/H;->q0(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    if-eqz p1, :cond_a

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iput-boolean v0, p1, LZ/H;->g:Z

    goto :goto_4

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "LayoutManager "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already attached to a RecyclerView:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_4
    invoke-virtual {v3}, LZ/N;->k()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public setLayoutTransition(Landroid/animation/LayoutTransition;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    iget-boolean v1, v0, LJ/n;->d:Z

    if-eqz v1, :cond_0

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    iget-object v1, v0, LJ/n;->c:Landroid/view/View;

    invoke-static {v1}, LJ/H;->z(Landroid/view/View;)V

    :cond_0
    iput-boolean p1, v0, LJ/n;->d:Z

    return-void
.end method

.method public setOnFlingListener(LZ/J;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->R:LZ/J;

    return-void
.end method

.method public setOnScrollListener(LZ/K;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:LZ/K;

    return-void
.end method

.method public setPreserveFocusAfterLayout(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Z

    return-void
.end method

.method public setRecycledViewPool(LZ/M;)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    iget-object v1, v0, LZ/N;->g:LZ/M;

    if-eqz v1, :cond_0

    iget v2, v1, LZ/M;->b:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, LZ/M;->b:I

    :cond_0
    iput-object p1, v0, LZ/N;->g:LZ/M;

    if-eqz p1, :cond_1

    iget-object p1, v0, LZ/N;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()LZ/z;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, v0, LZ/N;->g:LZ/M;

    iget v0, p1, LZ/M;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, LZ/M;->b:I

    :cond_1
    return-void
.end method

.method public setRecyclerListener(LZ/O;)V
    .locals 0

    return-void
.end method

.method public setScrollState(I)V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->J:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    iget-object v1, v0, LZ/V;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, v0, LZ/V;->d:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v0, :cond_1

    iget-object v0, v0, LZ/H;->e:LZ/u;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LZ/u;->i()V

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LZ/H;->c0(I)V

    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:LZ/K;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p0, p1}, LZ/K;->a(Landroidx/recyclerview/widget/RecyclerView;I)V

    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_4

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ/K;

    invoke-virtual {v1, p0, p1}, LZ/K;->a(Landroidx/recyclerview/widget/RecyclerView;I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public setScrollingTouchSlop(I)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    :goto_0
    return-void
.end method

.method public setViewCacheExtension(LZ/U;)V
    .locals 0

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final startNestedScroll(I)Z
    .locals 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LJ/n;->h(II)Z

    move-result p1

    return p1
.end method

.method public final stopNestedScroll()V
    .locals 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()LJ/n;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LJ/n;->i(I)V

    return-void
.end method

.method public final suppressLayout(Z)V
    .locals 9

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-eq p1, v0, :cond_2

    const-string v0, "Do not suppressLayout in layout or scroll"

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->i(Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    :cond_0
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v1, v3

    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    iget-object v0, p1, LZ/V;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object p1, p1, LZ/V;->d:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-eqz p1, :cond_2

    iget-object p1, p1, LZ/H;->e:LZ/u;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LZ/u;->i()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final t(II)V
    .locals 4

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->C:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->C:I

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int v2, v0, p1

    sub-int v3, v1, p2

    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/view/View;->onScrollChanged(IIII)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:LZ/K;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1, p2}, LZ/K;->b(Landroidx/recyclerview/widget/RecyclerView;II)V

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ/K;

    invoke-virtual {v1, p0, p1, p2}, LZ/K;->b(Landroidx/recyclerview/widget/RecyclerView;II)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->C:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->C:I

    return-void
.end method

.method public final u()V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:LZ/C;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Landroid/widget/EdgeEffect;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    :goto_0
    return-void
.end method

.method public final v()V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:LZ/C;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Landroid/widget/EdgeEffect;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    :goto_0
    return-void
.end method

.method public final w()V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:LZ/C;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Landroid/widget/EdgeEffect;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    :goto_0
    return-void
.end method

.method public final x()V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:LZ/C;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/widget/EdgeEffect;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    :goto_0
    return-void
.end method

.method public final y()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", adapter:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", layout:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", context:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z(LZ/T;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    iget-object v0, v0, LZ/V;->d:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalX()I

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalY()I

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void
.end method
