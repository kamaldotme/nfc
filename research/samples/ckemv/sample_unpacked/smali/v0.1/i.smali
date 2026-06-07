.class public final Lv0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li/a;


# instance fields
.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    sparse-switch p1, :sswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ln/b;

    .line 3
    invoke-direct {p1}, Ln/k;-><init>()V

    .line 4
    iput-object p1, p0, Lv0/i;->b:Ljava/lang/Object;

    .line 5
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lv0/i;->c:Ljava/lang/Object;

    .line 6
    new-instance p1, Ln/e;

    invoke-direct {p1}, Ln/e;-><init>()V

    iput-object p1, p0, Lv0/i;->d:Ljava/lang/Object;

    .line 7
    new-instance p1, Ln/b;

    .line 8
    invoke-direct {p1}, Ln/k;-><init>()V

    .line 9
    iput-object p1, p0, Lv0/i;->e:Ljava/lang/Object;

    return-void

    .line 10
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, LI/b;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, LI/b;-><init>(I)V

    iput-object p1, p0, Lv0/i;->b:Ljava/lang/Object;

    .line 12
    new-instance p1, Ln/k;

    invoke-direct {p1}, Ln/k;-><init>()V

    iput-object p1, p0, Lv0/i;->c:Ljava/lang/Object;

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lv0/i;->d:Ljava/lang/Object;

    .line 14
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lv0/i;->e:Ljava/lang/Object;

    return-void

    .line 15
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lv0/i;->c:Ljava/lang/Object;

    .line 17
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lv0/i;->d:Ljava/lang/Object;

    .line 18
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lv0/i;->e:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/graphics/Typeface;LR/b;)V
    .locals 5

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lv0/i;->e:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, Lv0/i;->b:Ljava/lang/Object;

    .line 22
    new-instance p1, Landroidx/emoji2/text/r;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Landroidx/emoji2/text/r;-><init>(I)V

    iput-object p1, p0, Lv0/i;->d:Ljava/lang/Object;

    const/4 p1, 0x6

    .line 23
    invoke-virtual {p2, p1}, LJ/z;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 24
    iget v2, p2, LJ/z;->a:I

    add-int/2addr v0, v2

    .line 25
    iget-object v2, p2, LJ/z;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 26
    iget-object v0, p2, LJ/z;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 27
    new-array v0, v0, [C

    iput-object v0, p0, Lv0/i;->c:Ljava/lang/Object;

    .line 28
    invoke-virtual {p2, p1}, LJ/z;->a(I)I

    move-result p1

    if-eqz p1, :cond_1

    .line 29
    iget v0, p2, LJ/z;->a:I

    add-int/2addr p1, v0

    .line 30
    iget-object v0, p2, LJ/z;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 31
    iget-object p1, p2, LJ/z;->d:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_4

    .line 32
    new-instance v0, Landroidx/emoji2/text/n;

    invoke-direct {v0, p0, p2}, Landroidx/emoji2/text/n;-><init>(Lv0/i;I)V

    .line 33
    invoke-virtual {v0}, Landroidx/emoji2/text/n;->c()LR/a;

    move-result-object v2

    const/4 v3, 0x4

    .line 34
    invoke-virtual {v2, v3}, LJ/z;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, LJ/z;->d:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v2, v2, LJ/z;->a:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    :goto_3
    mul-int/lit8 v3, p2, 0x2

    .line 35
    iget-object v4, p0, Lv0/i;->c:Ljava/lang/Object;

    check-cast v4, [C

    invoke-static {v2, v4, v3}, Ljava/lang/Character;->toChars(I[CI)I

    .line 36
    invoke-virtual {v0}, Landroidx/emoji2/text/n;->b()I

    move-result v2

    const/4 v3, 0x1

    if-lez v2, :cond_3

    move v2, v3

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    const-string v4, "invalid metadata codepoint length"

    invoke-static {v2, v4}, Lm0/z;->i(ZLjava/lang/String;)V

    .line 37
    invoke-virtual {v0}, Landroidx/emoji2/text/n;->b()I

    move-result v2

    sub-int/2addr v2, v3

    iget-object v3, p0, Lv0/i;->d:Ljava/lang/Object;

    check-cast v3, Landroidx/emoji2/text/r;

    invoke-virtual {v3, v0, v1, v2}, Landroidx/emoji2/text/r;->a(Landroidx/emoji2/text/n;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method


# virtual methods
.method public a(Li/b;Landroid/view/MenuItem;)Z
    .locals 2

    invoke-virtual {p0, p1}, Lv0/i;->h(Li/b;)Li/g;

    move-result-object p1

    new-instance v0, Lj/t;

    iget-object v1, p0, Lv0/i;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    check-cast p2, LC/a;

    invoke-direct {v0, v1, p2}, Lj/t;-><init>(Landroid/content/Context;LC/a;)V

    iget-object p2, p0, Lv0/i;->b:Ljava/lang/Object;

    check-cast p2, Landroid/view/ActionMode$Callback;

    invoke-interface {p2, p1, v0}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public b(Li/b;Lj/m;)Z
    .locals 3

    invoke-virtual {p0, p1}, Lv0/i;->h(Li/b;)Li/g;

    move-result-object p1

    iget-object v0, p0, Lv0/i;->e:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Menu;

    if-nez v1, :cond_0

    new-instance v1, Lj/C;

    iget-object v2, p0, Lv0/i;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2, p2}, Lj/C;-><init>(Landroid/content/Context;Lj/m;)V

    invoke-virtual {v0, p2, v1}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p2, p0, Lv0/i;->b:Ljava/lang/Object;

    check-cast p2, Landroid/view/ActionMode$Callback;

    invoke-interface {p2, p1, v1}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public c(Li/b;Lj/m;)Z
    .locals 3

    invoke-virtual {p0, p1}, Lv0/i;->h(Li/b;)Li/g;

    move-result-object p1

    iget-object v0, p0, Lv0/i;->e:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Menu;

    if-nez v1, :cond_0

    new-instance v1, Lj/C;

    iget-object v2, p0, Lv0/i;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2, p2}, Lj/C;-><init>(Landroid/content/Context;Lj/m;)V

    invoke-virtual {v0, p2, v1}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p2, p0, Lv0/i;->b:Ljava/lang/Object;

    check-cast p2, Landroid/view/ActionMode$Callback;

    invoke-interface {p2, p1, v1}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public d(Li/b;)V
    .locals 1

    invoke-virtual {p0, p1}, Lv0/i;->h(Li/b;)Li/g;

    move-result-object p1

    iget-object v0, p0, Lv0/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ActionMode$Callback;

    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    return-void
.end method

.method public e(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 4

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lv0/i;->c:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3, p2, p3}, Lv0/i;->e(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "This graph contains cyclic dependencies"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lv0/i;->b:Ljava/lang/Object;

    check-cast v0, Lf/B;

    invoke-virtual {v0, p1}, Lf/B;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g(Lq2/i;)V
    .locals 11

    const-string v0, "call"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv0/i;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    monitor-enter p0

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz p1, :cond_4

    monitor-exit p0

    sget-object p1, Ln2/b;->a:[B

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lv0/i;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "readyAsyncCalls.iterator()"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    iget-object v0, p0, Lv0/i;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v0

    const/16 v1, 0x40

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    throw v2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_0
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lv0/i;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    iget-object v0, p0, Lv0/i;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    monitor-enter p0

    :try_start_4
    iget-object p1, p0, Lv0/i;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez p1, :cond_2

    new-instance p1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v9, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v9}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Ln2/b;->f:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " Dispatcher"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "name"

    invoke-static {v1, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ln2/a;

    invoke-direct {v10, v0, v1}, Ln2/a;-><init>(ZLjava/lang/String;)V

    const v5, 0x7fffffff

    const-wide/16 v6, 0x3c

    const/4 v4, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object p1, p0, Lv0/i;->b:Ljava/lang/Object;

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    iget-object p1, p0, Lv0/i;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    throw v2

    :goto_2
    monitor-exit p0

    throw p1

    :cond_3
    return-void

    :catchall_2
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1

    :cond_4
    :try_start_6
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Call wasn\'t in-flight!"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public h(Li/b;)Li/g;
    .locals 5

    iget-object v0, p0, Lv0/i;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li/g;

    if-eqz v3, :cond_0

    iget-object v4, v3, Li/g;->b:Li/b;

    if-ne v4, p1, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Li/g;

    iget-object v2, p0, Lv0/i;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2, p1}, Li/g;-><init>(Landroid/content/Context;Li/b;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public i(Lv0/j;)Lv0/g;
    .locals 6

    const-string v0, "id"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    const/4 v1, 0x2

    invoke-static {v0, v1}, La0/j;->a(Ljava/lang/String;I)La0/j;

    move-result-object v0

    iget-object v2, p1, Lv0/j;->a:Ljava/lang/String;

    const/4 v3, 0x1

    if-nez v2, :cond_0

    invoke-virtual {v0, v3}, La0/j;->g(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2, v3}, La0/j;->h(Ljava/lang/String;I)V

    :goto_0
    iget p1, p1, Lv0/j;->b:I

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, La0/j;->x(IJ)V

    iget-object p1, p0, Lv0/i;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->b()V

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string v2, "work_spec_id"

    invoke-static {p1, v2}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2

    const-string v3, "generation"

    invoke-static {p1, v3}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "system_id"

    invoke-static {p1, v4}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    new-instance v4, Lv0/g;

    invoke-direct {v4, v2, v3, v1}, Lv0/g;-><init>(IILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v4

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_2
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, La0/j;->o()V

    return-object v1

    :goto_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, La0/j;->o()V

    throw v1
.end method

.method public j(Lv0/g;)V
    .locals 2

    iget-object v0, p0, Lv0/i;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->b()V

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    iget-object v1, p0, Lv0/i;->c:Ljava/lang/Object;

    check-cast v1, Lv0/b;

    invoke-virtual {v1, p1}, Lv0/b;->t(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    throw p1
.end method
