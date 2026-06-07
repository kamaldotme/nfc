.class public final LZ/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final f:Ljava/lang/ThreadLocal;

.field public static final g:LO0/l;


# instance fields
.field public b:Ljava/util/ArrayList;

.field public c:J

.field public d:J

.field public e:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, LZ/n;->f:Ljava/lang/ThreadLocal;

    new-instance v0, LO0/l;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LO0/l;-><init>(I)V

    sput-object v0, LZ/n;->g:LO0/l;

    return-void
.end method

.method public static c(Landroidx/recyclerview/widget/RecyclerView;IJ)LZ/W;
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->x()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v3, v2}, Lv0/m;->w(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v3

    iget v4, v3, LZ/W;->c:I

    if-ne v4, p1, :cond_0

    invoke-virtual {v3}, LZ/W;->h()Z

    move-result v3

    if-nez v3, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    :try_start_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->P()V

    invoke-virtual {v0, p1, p2, p3}, LZ/N;->i(IJ)LZ/W;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LZ/W;->g()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, LZ/W;->h()Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p1, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v0, p2}, LZ/N;->f(Landroid/view/View;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    invoke-virtual {v0, p1, v1}, LZ/N;->a(LZ/W;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_1
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->Q(Z)V

    return-object p1

    :goto_2
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->Q(Z)V

    throw p1
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 4

    iget-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView;->q:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, LZ/n;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v0

    iput-wide v0, p0, LZ/n;->c:J

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->c0:LC0/b;

    iput p2, p1, LC0/b;->a:I

    iput p3, p1, LC0/b;->b:I

    return-void
.end method

.method public final b(J)V
    .locals 16

    move-object/from16 v1, p0

    const/4 v0, 0x1

    iget-object v2, v1, LZ/n;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    :goto_0
    if-ge v5, v3, :cond_1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    move-result v8

    if-nez v8, :cond_0

    iget-object v8, v7, Landroidx/recyclerview/widget/RecyclerView;->c0:LC0/b;

    invoke-virtual {v8, v7, v4}, LC0/b;->c(Landroidx/recyclerview/widget/RecyclerView;Z)V

    iget v7, v8, LC0/b;->c:I

    add-int/2addr v6, v7

    :cond_0
    add-int/2addr v5, v0

    goto :goto_0

    :cond_1
    iget-object v5, v1, LZ/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->ensureCapacity(I)V

    move v6, v4

    move v7, v6

    :goto_1
    if-ge v6, v3, :cond_6

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v8}, Landroid/view/View;->getWindowVisibility()I

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_5

    :cond_2
    iget-object v9, v8, Landroidx/recyclerview/widget/RecyclerView;->c0:LC0/b;

    iget v10, v9, LC0/b;->a:I

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v10

    iget v11, v9, LC0/b;->b:I

    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    move-result v11

    add-int/2addr v11, v10

    move v10, v4

    :goto_2
    iget v12, v9, LC0/b;->c:I

    mul-int/lit8 v12, v12, 0x2

    if-ge v10, v12, :cond_5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-lt v7, v12, :cond_3

    new-instance v12, LZ/m;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LZ/m;

    :goto_3
    iget-object v13, v9, LC0/b;->d:Ljava/lang/Object;

    check-cast v13, [I

    add-int/lit8 v14, v10, 0x1

    aget v14, v13, v14

    if-gt v14, v11, :cond_4

    move v15, v0

    goto :goto_4

    :cond_4
    move v15, v4

    :goto_4
    iput-boolean v15, v12, LZ/m;->a:Z

    iput v11, v12, LZ/m;->b:I

    iput v14, v12, LZ/m;->c:I

    iput-object v8, v12, LZ/m;->d:Landroidx/recyclerview/widget/RecyclerView;

    aget v13, v13, v10

    iput v13, v12, LZ/m;->e:I

    add-int/2addr v7, v0

    add-int/lit8 v10, v10, 0x2

    goto :goto_2

    :cond_5
    :goto_5
    add-int/2addr v6, v0

    goto :goto_1

    :cond_6
    sget-object v2, LZ/n;->g:LO0/l;

    invoke-static {v5, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    move v2, v4

    :goto_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_f

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZ/m;

    iget-object v6, v3, LZ/m;->d:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v6, :cond_7

    goto/16 :goto_c

    :cond_7
    iget-boolean v7, v3, LZ/m;->a:Z

    if-eqz v7, :cond_8

    const-wide v7, 0x7fffffffffffffffL

    goto :goto_7

    :cond_8
    move-wide/from16 v7, p1

    :goto_7
    iget v9, v3, LZ/m;->e:I

    invoke-static {v6, v9, v7, v8}, LZ/n;->c(Landroidx/recyclerview/widget/RecyclerView;IJ)LZ/W;

    move-result-object v6

    if-eqz v6, :cond_e

    iget-object v7, v6, LZ/W;->b:Ljava/lang/ref/WeakReference;

    if-eqz v7, :cond_e

    invoke-virtual {v6}, LZ/W;->g()Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-virtual {v6}, LZ/W;->h()Z

    move-result v7

    if-nez v7, :cond_e

    iget-object v6, v6, LZ/W;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    if-nez v6, :cond_9

    goto/16 :goto_a

    :cond_9
    iget-boolean v7, v6, Landroidx/recyclerview/widget/RecyclerView;->z:Z

    if-eqz v7, :cond_c

    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v7}, Lv0/m;->x()I

    move-result v7

    if-eqz v7, :cond_c

    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz v7, :cond_a

    invoke-virtual {v7}, LZ/D;->e()V

    :cond_a
    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v8, v6, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    if-eqz v7, :cond_b

    invoke-virtual {v7, v8}, LZ/H;->d0(LZ/N;)V

    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v7, v8}, LZ/H;->e0(LZ/N;)V

    :cond_b
    iget-object v7, v8, LZ/N;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v8}, LZ/N;->d()V

    :cond_c
    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->c0:LC0/b;

    invoke-virtual {v7, v6, v0}, LC0/b;->c(Landroidx/recyclerview/widget/RecyclerView;Z)V

    iget v8, v7, LC0/b;->c:I

    if-eqz v8, :cond_e

    :try_start_0
    const-string v8, "RV Nested Prefetch"

    sget v9, LF/k;->a:I

    invoke-static {v8}, LF/j;->a(Ljava/lang/String;)V

    iget-object v8, v6, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    iget-object v9, v6, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    iput v0, v8, LZ/T;->d:I

    invoke-virtual {v9}, LZ/z;->a()I

    move-result v9

    iput v9, v8, LZ/T;->e:I

    iput-boolean v4, v8, LZ/T;->g:Z

    iput-boolean v4, v8, LZ/T;->h:Z

    iput-boolean v4, v8, LZ/T;->i:Z

    move v8, v4

    :goto_8
    iget v9, v7, LC0/b;->c:I

    mul-int/lit8 v9, v9, 0x2

    if-ge v8, v9, :cond_d

    iget-object v9, v7, LC0/b;->d:Ljava/lang/Object;

    check-cast v9, [I

    aget v9, v9, v8

    move-wide/from16 v10, p1

    invoke-static {v6, v9, v10, v11}, LZ/n;->c(Landroidx/recyclerview/widget/RecyclerView;IJ)LZ/W;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v8, v8, 0x2

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_d
    move-wide/from16 v10, p1

    invoke-static {}, LF/j;->b()V

    goto :goto_b

    :goto_9
    sget v2, LF/k;->a:I

    invoke-static {}, LF/j;->b()V

    throw v0

    :cond_e
    :goto_a
    move-wide/from16 v10, p1

    :goto_b
    iput-boolean v4, v3, LZ/m;->a:Z

    iput v4, v3, LZ/m;->b:I

    iput v4, v3, LZ/m;->c:I

    const/4 v6, 0x0

    iput-object v6, v3, LZ/m;->d:Landroidx/recyclerview/widget/RecyclerView;

    iput v4, v3, LZ/m;->e:I

    add-int/2addr v2, v0

    goto/16 :goto_6

    :cond_f
    :goto_c
    return-void
.end method

.method public final run()V
    .locals 9

    const-wide/16 v0, 0x0

    :try_start_0
    const-string v2, "RV Prefetch"

    sget v3, LF/k;->a:I

    invoke-static {v2}, LF/j;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, LZ/n;->b:Ljava/util/ArrayList;

    :try_start_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_0

    iput-wide v0, p0, LZ/n;->c:J

    invoke-static {}, LF/j;->b()V

    return-void

    :cond_0
    :try_start_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    move-wide v5, v0

    :goto_0
    if-ge v4, v3, :cond_2

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v7}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v7

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    cmp-long v2, v5, v0

    if-nez v2, :cond_3

    iput-wide v0, p0, LZ/n;->c:J

    invoke-static {}, LF/j;->b()V

    return-void

    :cond_3
    :try_start_3
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    iget-wide v4, p0, LZ/n;->d:J

    add-long/2addr v2, v4

    invoke-virtual {p0, v2, v3}, LZ/n;->b(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iput-wide v0, p0, LZ/n;->c:J

    invoke-static {}, LF/j;->b()V

    return-void

    :goto_2
    iput-wide v0, p0, LZ/n;->c:J

    sget v0, LF/k;->a:I

    invoke-static {}, LF/j;->b()V

    throw v2
.end method
