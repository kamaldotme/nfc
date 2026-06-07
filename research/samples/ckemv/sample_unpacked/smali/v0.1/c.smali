.class public Lv0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI1/a;
.implements Li/a;


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LC1/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lv0/c;->b:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, LC1/c;

    invoke-direct {v0, p1}, LC1/c;-><init>(LC1/c;)V

    iput-object v0, p0, Lv0/c;->c:Ljava/lang/Object;

    .line 24
    iget v0, p1, LC1/c;->i:I

    iget p1, p1, LC1/c;->h:I

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, 0x1

    new-array p1, v0, [LC1/a;

    iput-object p1, p0, Lv0/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LZ/F;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lv0/c;->b:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lv0/c;->c:Ljava/lang/Object;

    .line 33
    new-instance p1, LC1/a;

    .line 34
    invoke-direct {p1}, LC1/a;-><init>()V

    const/4 v0, 0x0

    .line 35
    iput v0, p1, LC1/a;->b:I

    .line 36
    iput-object p1, p0, Lv0/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 5

    const/4 v0, 0x3

    iput v0, p0, Lv0/c;->b:I

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lv0/c;->c:Ljava/lang/Object;

    .line 3
    new-instance v1, LS/i;

    invoke-direct {v1, p1}, LS/i;-><init>(Landroid/widget/EditText;)V

    iput-object v1, p0, Lv0/c;->d:Ljava/lang/Object;

    .line 4
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 5
    sget-object v1, LS/a;->b:LS/a;

    if-nez v1, :cond_1

    .line 6
    sget-object v1, LS/a;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 7
    :try_start_0
    sget-object v2, LS/a;->b:LS/a;

    if-nez v2, :cond_0

    .line 8
    new-instance v2, LS/a;

    .line 9
    invoke-direct {v2}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    :try_start_1
    const-string v3, "android.text.DynamicLayout$ChangeWatcher"

    .line 11
    const-class v4, LS/a;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-static {v3, v0, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, LS/a;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    :catchall_0
    :try_start_2
    sput-object v2, LS/a;->b:LS/a;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 13
    :cond_0
    :goto_0
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 14
    :cond_1
    :goto_2
    sget-object v0, LS/a;->b:LS/a;

    .line 15
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lv0/c;->b:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lv0/c;->c:Ljava/lang/Object;

    .line 19
    new-instance v0, Lv0/b;

    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p1, v1}, Lv0/b;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    .line 21
    iput-object v0, p0, Lv0/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 16
    iput p2, p0, Lv0/c;->b:I

    iput-object p1, p0, Lv0/c;->d:Ljava/lang/Object;

    iput-object p3, p0, Lv0/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ln0/g;Lv0/i;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lv0/c;->b:I

    const-string v0, "processor"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workTaskExecutor"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lv0/c;->c:Ljava/lang/Object;

    .line 30
    iput-object p2, p0, Lv0/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp1/b;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lv0/c;->b:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lv0/c;->c:Ljava/lang/Object;

    .line 27
    new-instance v0, Lq1/a;

    invoke-direct {v0, p1}, Lq1/a;-><init>(Lp1/b;)V

    iput-object v0, p0, Lv0/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public static m(Lj1/n;FF)Lj1/n;
    .locals 2

    iget v0, p0, Lj1/n;->a:F

    cmpg-float p1, v0, p1

    const/high16 v1, 0x3f800000    # 1.0f

    if-gez p1, :cond_0

    sub-float/2addr v0, v1

    goto :goto_0

    :cond_0
    add-float/2addr v0, v1

    :goto_0
    iget p0, p0, Lj1/n;->b:F

    cmpg-float p1, p0, p2

    if-gez p1, :cond_1

    sub-float/2addr p0, v1

    goto :goto_1

    :cond_1
    add-float/2addr p0, v1

    :goto_1
    new-instance p1, Lj1/n;

    invoke-direct {p1, v0, p0}, Lj1/n;-><init>(FF)V

    return-object p1
.end method

.method public static o(Lj1/n;Lj1/n;I)Lj1/n;
    .locals 2

    iget v0, p1, Lj1/n;->a:F

    iget v1, p0, Lj1/n;->a:F

    sub-float/2addr v0, v1

    add-int/lit8 p2, p2, 0x1

    int-to-float p2, p2

    div-float/2addr v0, p2

    iget p1, p1, Lj1/n;->b:F

    iget p0, p0, Lj1/n;->b:F

    sub-float/2addr p1, p0

    div-float/2addr p1, p2

    new-instance p2, Lj1/n;

    add-float/2addr v1, v0

    add-float/2addr p0, p1

    invoke-direct {p2, v1, p0}, Lj1/n;-><init>(FF)V

    return-object p2
.end method


# virtual methods
.method public a(Li/b;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast v0, Li/a;

    invoke-interface {v0, p1, p2}, Li/a;->a(Li/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public b(Li/b;Lj/m;)Z
    .locals 2

    iget-object v0, p0, Lv0/c;->d:Ljava/lang/Object;

    check-cast v0, Lf/v;

    iget-object v0, v0, Lf/v;->B:Landroid/view/ViewGroup;

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LJ/F;->c(Landroid/view/View;)V

    iget-object v0, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast v0, Li/a;

    invoke-interface {v0, p1, p2}, Li/a;->b(Li/b;Lj/m;)Z

    move-result p1

    return p1
.end method

.method public c(Li/b;Lj/m;)Z
    .locals 1

    iget-object v0, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast v0, Li/a;

    invoke-interface {v0, p1, p2}, Li/a;->c(Li/b;Lj/m;)Z

    move-result p1

    return p1
.end method

.method public d(Li/b;)V
    .locals 3

    iget-object v0, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast v0, Li/a;

    invoke-interface {v0, p1}, Li/a;->d(Li/b;)V

    iget-object p1, p0, Lv0/c;->d:Ljava/lang/Object;

    check-cast p1, Lf/v;

    iget-object v0, p1, Lf/v;->x:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lf/v;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p1, Lf/v;->y:Lf/l;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object v0, p1, Lf/v;->w:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lf/v;->z:LJ/b0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LJ/b0;->b()V

    :cond_1
    iget-object v0, p1, Lf/v;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, LJ/T;->a(Landroid/view/View;)LJ/b0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LJ/b0;->a(F)V

    iput-object v0, p1, Lf/v;->z:LJ/b0;

    new-instance v1, Lf/n;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Lf/n;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, LJ/b0;->d(LJ/c0;)V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p1, Lf/v;->v:Li/b;

    iget-object v0, p1, Lf/v;->B:Landroid/view/ViewGroup;

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LJ/F;->c(Landroid/view/View;)V

    invoke-virtual {p1}, Lf/v;->H()V

    return-void
.end method

.method public e(IIII)Landroid/view/View;
    .locals 9

    iget-object v0, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast v0, LZ/F;

    invoke-virtual {v0}, LZ/F;->e()I

    move-result v1

    invoke-virtual {v0}, LZ/F;->d()I

    move-result v2

    if-le p2, p1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    :goto_0
    const/4 v4, 0x0

    :goto_1
    if-eq p1, p2, :cond_3

    invoke-virtual {v0, p1}, LZ/F;->a(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, LZ/F;->c(Landroid/view/View;)I

    move-result v6

    invoke-virtual {v0, v5}, LZ/F;->b(Landroid/view/View;)I

    move-result v7

    iget-object v8, p0, Lv0/c;->d:Ljava/lang/Object;

    check-cast v8, LC1/a;

    iput v1, v8, LC1/a;->c:I

    iput v2, v8, LC1/a;->d:I

    iput v6, v8, LC1/a;->e:I

    iput v7, v8, LC1/a;->f:I

    if-eqz p3, :cond_1

    iput p3, v8, LC1/a;->b:I

    invoke-virtual {v8}, LC1/a;->a()Z

    move-result v6

    if-eqz v6, :cond_1

    return-object v5

    :cond_1
    if-eqz p4, :cond_2

    iput p4, v8, LC1/a;->b:I

    invoke-virtual {v8}, LC1/a;->a()Z

    move-result v6

    if-eqz v6, :cond_2

    move-object v4, v5

    :cond_2
    add-int/2addr p1, v3

    goto :goto_1

    :cond_3
    return-object v4
.end method

.method public f(I)LC1/a;
    .locals 4

    invoke-virtual {p0, p1}, Lv0/c;->i(I)I

    move-result v0

    iget-object v1, p0, Lv0/c;->d:Ljava/lang/Object;

    check-cast v1, [LC1/a;

    aget-object v0, v1, v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const/4 v2, 0x5

    if-ge v0, v2, :cond_3

    invoke-virtual {p0, p1}, Lv0/c;->i(I)I

    move-result v2

    sub-int/2addr v2, v0

    if-ltz v2, :cond_1

    aget-object v2, v1, v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {p0, p1}, Lv0/c;->i(I)I

    move-result v2

    add-int/2addr v2, v0

    array-length v3, v1

    if-ge v2, v3, :cond_2

    aget-object v2, v1, v2

    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public g(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    const-string v0, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, La0/j;->a(Ljava/lang/String;I)La0/j;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, La0/j;->g(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, v1}, La0/j;->h(Ljava/lang/String;I)V

    :goto_0
    iget-object p1, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->b()V

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v3, v1

    goto :goto_2

    :cond_1
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_2
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, La0/j;->o()V

    return-object v2

    :goto_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, La0/j;->o()V

    throw v1
.end method

.method public h(Ljava/lang/String;)Z
    .locals 4

    const-string v0, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"

    const/4 v1, 0x1

    invoke-static {v0, v1}, La0/j;->a(Ljava/lang/String;I)La0/j;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, La0/j;->g(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, v1}, La0/j;->h(Ljava/lang/String;I)V

    :goto_0
    iget-object p1, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->b()V

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    move v3, v1

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_2
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, La0/j;->o()V

    return v3

    :goto_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, La0/j;->o()V

    throw v1
.end method

.method public i(I)I
    .locals 1

    iget-object v0, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast v0, LC1/c;

    iget v0, v0, LC1/c;->h:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public j(Lj1/n;)Z
    .locals 4

    iget v0, p1, Lj1/n;->a:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-ltz v2, :cond_0

    iget-object v2, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast v2, Lp1/b;

    iget v3, v2, Lp1/b;->b:I

    int-to-float v3, v3

    cmpg-float v0, v0, v3

    if-gez v0, :cond_0

    iget p1, p1, Lj1/n;->b:F

    cmpl-float v0, p1, v1

    if-lez v0, :cond_0

    iget v0, v2, Lp1/b;->c:I

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public k(Ljava/util/List;)V
    .locals 5

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj1/n;

    iget-object v2, p0, Lv0/c;->d:Ljava/lang/Object;

    check-cast v2, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    iget-object v2, v2, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->c:Lcom/journeyapps/barcodescanner/ViewfinderView;

    iget-object v3, v2, Lcom/journeyapps/barcodescanner/ViewfinderView;->h:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/16 v4, 0x14

    if-ge v3, v4, :cond_0

    iget-object v2, v2, Lcom/journeyapps/barcodescanner/ViewfinderView;->h:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast v0, LI1/a;

    invoke-interface {v0, p1}, LI1/a;->k(Ljava/util/List;)V

    return-void
.end method

.method public l(Landroid/view/View;)Z
    .locals 4

    iget-object v0, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast v0, LZ/F;

    invoke-virtual {v0}, LZ/F;->e()I

    move-result v1

    invoke-virtual {v0}, LZ/F;->d()I

    move-result v2

    invoke-virtual {v0, p1}, LZ/F;->c(Landroid/view/View;)I

    move-result v3

    invoke-virtual {v0, p1}, LZ/F;->b(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, Lv0/c;->d:Ljava/lang/Object;

    check-cast v0, LC1/a;

    iput v1, v0, LC1/a;->c:I

    iput v2, v0, LC1/a;->d:I

    iput v3, v0, LC1/a;->e:I

    iput p1, v0, LC1/a;->f:I

    const/16 p1, 0x6003

    iput p1, v0, LC1/a;->b:I

    invoke-virtual {v0}, LC1/a;->a()Z

    move-result p1

    return p1
.end method

.method public n(LI1/b;)V
    .locals 1

    iget-object v0, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast v0, LI1/a;

    invoke-interface {v0, p1}, LI1/a;->n(LI1/b;)V

    return-void
.end method

.method public p(Ln0/m;I)V
    .locals 3

    const-string v0, "workSpecId"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lw0/o;

    iget-object v1, p0, Lv0/c;->c:Ljava/lang/Object;

    check-cast v1, Ln0/g;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2, p2}, Lw0/o;-><init>(Ln0/g;Ln0/m;ZI)V

    iget-object p1, p0, Lv0/c;->d:Ljava/lang/Object;

    check-cast p1, Lv0/i;

    invoke-virtual {p1, v0}, Lv0/i;->f(Ljava/lang/Runnable;)V

    return-void
.end method

.method public q(Lj1/n;Lj1/n;)I
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    iget v2, v0, Lj1/n;->a:F

    float-to-int v2, v2

    iget v0, v0, Lj1/n;->b:F

    float-to-int v0, v0

    iget v3, v1, Lj1/n;->a:F

    float-to-int v3, v3

    iget v1, v1, Lj1/n;->b:F

    float-to-int v1, v1

    sub-int v4, v1, v0

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    sub-int v5, v3, v2

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-le v4, v5, :cond_0

    move v4, v7

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    if-eqz v4, :cond_1

    move/from16 v16, v2

    move v2, v0

    move/from16 v0, v16

    move/from16 v17, v3

    move v3, v1

    move/from16 v1, v17

    :cond_1
    sub-int v5, v3, v2

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    sub-int v8, v1, v0

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v8

    neg-int v9, v5

    div-int/lit8 v9, v9, 0x2

    const/4 v10, -0x1

    if-ge v0, v1, :cond_2

    move v11, v7

    goto :goto_1

    :cond_2
    move v11, v10

    :goto_1
    if-ge v2, v3, :cond_3

    goto :goto_2

    :cond_3
    move v7, v10

    :goto_2
    if-eqz v4, :cond_4

    move v10, v0

    goto :goto_3

    :cond_4
    move v10, v2

    :goto_3
    move-object/from16 v12, p0

    if-eqz v4, :cond_5

    move v13, v2

    goto :goto_4

    :cond_5
    move v13, v0

    :goto_4
    iget-object v14, v12, Lv0/c;->c:Ljava/lang/Object;

    check-cast v14, Lp1/b;

    invoke-virtual {v14, v10, v13}, Lp1/b;->b(II)Z

    move-result v10

    :goto_5
    if-eq v2, v3, :cond_a

    if-eqz v4, :cond_6

    move v13, v0

    goto :goto_6

    :cond_6
    move v13, v2

    :goto_6
    if-eqz v4, :cond_7

    move v15, v2

    goto :goto_7

    :cond_7
    move v15, v0

    :goto_7
    invoke-virtual {v14, v13, v15}, Lp1/b;->b(II)Z

    move-result v13

    if-eq v13, v10, :cond_8

    add-int/lit8 v6, v6, 0x1

    move v10, v13

    :cond_8
    add-int/2addr v9, v8

    if-lez v9, :cond_9

    if-eq v0, v1, :cond_a

    add-int/2addr v0, v11

    sub-int/2addr v9, v5

    :cond_9
    add-int/2addr v2, v7

    goto :goto_5

    :cond_a
    return v6
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lv0/c;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/util/Formatter;

    invoke-direct {v0}, Ljava/util/Formatter;-><init>()V

    :try_start_0
    iget-object v1, p0, Lv0/c;->d:Ljava/lang/Object;

    check-cast v1, [LC1/a;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v5, v1, v3

    if-nez v5, :cond_0

    const-string v5, "%3d:    |   %n"

    add-int/lit8 v6, v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v5, v4}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move v4, v6

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    const-string v6, "%3d: %3d|%3d%n"

    add-int/lit8 v7, v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v8, v5, LC1/a;->f:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget v5, v5, LC1/a;->e:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v4, v8, v5}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v6, v4}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move v4, v7

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/Formatter;->close()V

    return-object v1

    :goto_2
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_2
    invoke-virtual {v0}, Ljava/util/Formatter;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
