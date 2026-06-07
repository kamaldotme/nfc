.class public final Lk/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lk/t;

.field public c:I

.field public d:Lk/e1;

.field public e:Lk/e1;

.field public f:Lk/e1;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lk/o;->c:I

    iput-object p1, p0, Lk/o;->a:Landroid/view/View;

    invoke-static {}, Lk/t;->a()Lk/t;

    move-result-object p1

    iput-object p1, p0, Lk/o;->b:Lk/t;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lk/o;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v2, p0, Lk/o;->d:Lk/e1;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lk/o;->f:Lk/e1;

    if-nez v2, :cond_0

    new-instance v2, Lk/e1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lk/o;->f:Lk/e1;

    :cond_0
    iget-object v2, p0, Lk/o;->f:Lk/e1;

    const/4 v3, 0x0

    iput-object v3, v2, Lk/e1;->c:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-boolean v4, v2, Lk/e1;->b:Z

    iput-object v3, v2, Lk/e1;->d:Ljava/io/Serializable;

    iput-boolean v4, v2, Lk/e1;->a:Z

    sget-object v3, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LJ/H;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    iput-boolean v4, v2, Lk/e1;->b:Z

    iput-object v3, v2, Lk/e1;->c:Ljava/lang/Object;

    :cond_1
    invoke-static {v0}, LJ/H;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v3

    if-eqz v3, :cond_2

    iput-boolean v4, v2, Lk/e1;->a:Z

    iput-object v3, v2, Lk/e1;->d:Ljava/io/Serializable;

    :cond_2
    iget-boolean v3, v2, Lk/e1;->b:Z

    if-nez v3, :cond_3

    iget-boolean v3, v2, Lk/e1;->a:Z

    if-eqz v3, :cond_4

    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {v1, v2, v0}, Lk/t;->d(Landroid/graphics/drawable/Drawable;Lk/e1;[I)V

    return-void

    :cond_4
    iget-object v2, p0, Lk/o;->e:Lk/e1;

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {v1, v2, v0}, Lk/t;->d(Landroid/graphics/drawable/Drawable;Lk/e1;[I)V

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lk/o;->d:Lk/e1;

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {v1, v2, v0}, Lk/t;->d(Landroid/graphics/drawable/Drawable;Lk/e1;[I)V

    :cond_6
    :goto_0
    return-void
.end method

.method public final b()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lk/o;->e:Lk/e1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lk/e1;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final c()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lk/o;->e:Lk/e1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lk/e1;->d:Ljava/io/Serializable;

    check-cast v0, Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final d(Landroid/util/AttributeSet;I)V
    .locals 10

    iget-object v0, p0, Lk/o;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v4, Le/a;->z:[I

    const/4 v8, 0x0

    invoke-static {v1, p1, v4, p2, v8}, Lv0/m;->F(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lv0/m;

    move-result-object v1

    iget-object v2, v1, Lv0/m;->d:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, Landroid/content/res/TypedArray;

    iget-object v2, p0, Lk/o;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v5, v1, Lv0/m;->d:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Landroid/content/res/TypedArray;

    move-object v5, p1

    move v7, p2

    invoke-static/range {v2 .. v7}, LJ/T;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    :try_start_0
    invoke-virtual {v9, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    const/4 p2, -0x1

    if-eqz p1, :cond_0

    invoke-virtual {v9, v8, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    iput p1, p0, Lk/o;->c:I

    iget-object p1, p0, Lk/o;->b:Lk/t;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget v3, p0, Lk/o;->c:I

    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v4, p1, Lk/t;->a:Lk/O0;

    invoke-virtual {v4, v2, v3}, Lk/O0;->h(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit p1

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lk/o;->g(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_0
    :goto_0
    const/4 p1, 0x1

    invoke-virtual {v9, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, p1}, Lv0/m;->q(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {v0, p1}, LJ/H;->q(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    :cond_1
    const/4 p1, 0x2

    invoke-virtual {v9, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v9, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lk/o0;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-static {v0, p1}, LJ/H;->r(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_2
    invoke-virtual {v1}, Lv0/m;->J()V

    return-void

    :goto_1
    invoke-virtual {v1}, Lv0/m;->J()V

    throw p1
.end method

.method public final e()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lk/o;->c:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lk/o;->g(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lk/o;->a()V

    return-void
.end method

.method public final f(I)V
    .locals 3

    iput p1, p0, Lk/o;->c:I

    iget-object v0, p0, Lk/o;->b:Lk/t;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lk/o;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lk/t;->a:Lk/O0;

    invoke-virtual {v2, v1, p1}, Lk/O0;->h(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lk/o;->g(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lk/o;->a()V

    return-void
.end method

.method public final g(Landroid/content/res/ColorStateList;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lk/o;->d:Lk/e1;

    if-nez v0, :cond_0

    new-instance v0, Lk/e1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk/o;->d:Lk/e1;

    :cond_0
    iget-object v0, p0, Lk/o;->d:Lk/e1;

    iput-object p1, v0, Lk/e1;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lk/e1;->b:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lk/o;->d:Lk/e1;

    :goto_0
    invoke-virtual {p0}, Lk/o;->a()V

    return-void
.end method

.method public final h(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lk/o;->e:Lk/e1;

    if-nez v0, :cond_0

    new-instance v0, Lk/e1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk/o;->e:Lk/e1;

    :cond_0
    iget-object v0, p0, Lk/o;->e:Lk/e1;

    iput-object p1, v0, Lk/e1;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lk/e1;->b:Z

    invoke-virtual {p0}, Lk/o;->a()V

    return-void
.end method

.method public final i(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lk/o;->e:Lk/e1;

    if-nez v0, :cond_0

    new-instance v0, Lk/e1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk/o;->e:Lk/e1;

    :cond_0
    iget-object v0, p0, Lk/o;->e:Lk/e1;

    iput-object p1, v0, Lk/e1;->d:Ljava/io/Serializable;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lk/e1;->a:Z

    invoke-virtual {p0}, Lk/o;->a()V

    return-void
.end method
