.class public final Lv0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/x;


# instance fields
.field public final synthetic c:I

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lv0/l;->c:I

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 6
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p1, Landroidx/lifecycle/y;

    invoke-direct {p1}, Landroidx/lifecycle/y;-><init>()V

    iput-object p1, p0, Lv0/l;->d:Ljava/lang/Object;

    .line 8
    new-instance p1, Lx0/k;

    .line 9
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lv0/l;->e:Ljava/lang/Object;

    .line 11
    sget-object p1, Lm0/x;->b:Lm0/v;

    invoke-virtual {p0, p1}, Lv0/l;->h(Lu2/d;)V

    return-void

    .line 12
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lv0/l;->d:Ljava/lang/Object;

    .line 14
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lv0/l;->e:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(LA/h;Landroid/os/Handler;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lv0/l;->c:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lv0/l;->d:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, Lv0/l;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/animation/Animator;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lv0/l;->c:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lv0/l;->d:Ljava/lang/Object;

    .line 34
    iput-object p1, p0, Lv0/l;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/animation/Animation;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lv0/l;->c:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lv0/l;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 31
    iput-object p1, p0, Lv0/l;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lv0/l;->c:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lv0/l;->d:Ljava/lang/Object;

    .line 3
    new-instance v0, Lv0/b;

    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p1, v1}, Lv0/b;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    .line 5
    iput-object v0, p0, Lv0/l;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr1/a;[I)V
    .locals 3

    const/4 v0, 0x6

    iput v0, p0, Lv0/l;->c:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    array-length v0, p2

    if-eqz v0, :cond_3

    .line 20
    iput-object p1, p0, Lv0/l;->d:Ljava/lang/Object;

    .line 21
    array-length p1, p2

    const/4 v0, 0x1

    if-le p1, v0, :cond_2

    const/4 v1, 0x0

    .line 22
    aget v2, p2, v1

    if-nez v2, :cond_2

    :goto_0
    if-ge v0, p1, :cond_0

    .line 23
    aget v2, p2, v0

    if-nez v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    if-ne v0, p1, :cond_1

    .line 24
    filled-new-array {v1}, [I

    move-result-object p1

    iput-object p1, p0, Lv0/l;->e:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    sub-int/2addr p1, v0

    .line 25
    new-array v2, p1, [I

    iput-object v2, p0, Lv0/l;->e:Ljava/lang/Object;

    .line 26
    invoke-static {p2, v0, v2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 27
    :cond_2
    iput-object p2, p0, Lv0/l;->e:Ljava/lang/Object;

    :goto_1
    return-void

    .line 28
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public static e(II)I
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v1, p0, :cond_2

    add-int/lit8 v2, v2, 0x1

    if-ne v2, p1, :cond_0

    add-int/lit8 v3, v3, 0x1

    move v2, v0

    goto :goto_1

    :cond_0
    if-le v2, p1, :cond_1

    add-int/lit8 v3, v3, 0x1

    move v2, v4

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    add-int/2addr v2, v4

    if-le v2, p1, :cond_3

    add-int/lit8 v3, v3, 0x1

    :cond_3
    return v3
.end method


# virtual methods
.method public a(Lv0/l;)Lv0/l;
    .locals 8

    iget-object v0, p1, Lv0/l;->d:Ljava/lang/Object;

    check-cast v0, Lr1/a;

    iget-object v1, p0, Lv0/l;->d:Ljava/lang/Object;

    check-cast v1, Lr1/a;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lv0/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lv0/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    iget-object v0, p0, Lv0/l;->e:Ljava/lang/Object;

    check-cast v0, [I

    array-length v2, v0

    iget-object p1, p1, Lv0/l;->e:Ljava/lang/Object;

    check-cast p1, [I

    array-length v3, p1

    if-le v2, v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_0
    array-length v2, v0

    new-array v2, v2, [I

    array-length v3, v0

    array-length v4, p1

    sub-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v4, v3

    :goto_1
    array-length v5, v0

    if-ge v4, v5, :cond_3

    sub-int v5, v4, v3

    aget v5, p1, v5

    aget v6, v0, v4

    xor-int/2addr v5, v6

    aput v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Lv0/l;

    invoke-direct {p1, v1, v2}, Lv0/l;-><init>(Lr1/a;[I)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "GenericGFPolys do not have same GenericGF field"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(I)I
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    invoke-virtual {p0, v1}, Lv0/l;->c(I)I

    move-result p1

    return p1

    :cond_0
    iget-object v2, p0, Lv0/l;->e:Ljava/lang/Object;

    check-cast v2, [I

    if-ne p1, v0, :cond_2

    array-length p1, v2

    move v3, v1

    :goto_0
    if-ge v1, p1, :cond_1

    aget v4, v2, v1

    sget-object v5, Lr1/a;->h:Lr1/a;

    xor-int/2addr v3, v4

    add-int/2addr v1, v0

    goto :goto_0

    :cond_1
    return v3

    :cond_2
    aget v1, v2, v1

    array-length v3, v2

    move v4, v0

    :goto_1
    if-ge v4, v3, :cond_3

    iget-object v5, p0, Lv0/l;->d:Ljava/lang/Object;

    check-cast v5, Lr1/a;

    invoke-virtual {v5, p1, v1}, Lr1/a;->b(II)I

    move-result v1

    aget v5, v2, v4

    xor-int/2addr v1, v5

    add-int/2addr v4, v0

    goto :goto_1

    :cond_3
    return v1
.end method

.method public c(I)I
    .locals 2

    iget-object v0, p0, Lv0/l;->e:Ljava/lang/Object;

    check-cast v0, [I

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    aget p1, v0, v1

    return p1
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lv0/l;->e:Ljava/lang/Object;

    check-cast v0, [I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lv0/l;->d:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public g()Z
    .locals 2

    iget-object v0, p0, Lv0/l;->e:Ljava/lang/Object;

    check-cast v0, [I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public h(Lu2/d;)V
    .locals 4

    iget-object v0, p0, Lv0/l;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/y;

    iget-object v1, v0, Landroidx/lifecycle/y;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Landroidx/lifecycle/y;->f:Ljava/lang/Object;

    sget-object v3, Landroidx/lifecycle/y;->k:Ljava/lang/Object;

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-object p1, v0, Landroidx/lifecycle/y;->f:Ljava/lang/Object;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Ll/a;->O()Ll/a;

    move-result-object v1

    iget-object v0, v0, Landroidx/lifecycle/y;->j:LF0/h;

    invoke-virtual {v1, v0}, Ll/a;->P(Ljava/lang/Runnable;)V

    :goto_1
    instance-of v0, p1, Lm0/w;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lv0/l;->e:Ljava/lang/Object;

    check-cast v0, Lx0/k;

    check-cast p1, Lm0/w;

    invoke-virtual {v0, p1}, Lx0/k;->j(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    instance-of v0, p1, Lm0/u;

    if-eqz v0, :cond_3

    check-cast p1, Lm0/u;

    iget-object v0, p0, Lv0/l;->e:Ljava/lang/Object;

    check-cast v0, Lx0/k;

    iget-object p1, p1, Lm0/u;->a:Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lx0/k;->k(Ljava/lang/Throwable;)Z

    :cond_3
    :goto_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public i(I)Lv0/l;
    .locals 6

    iget-object v0, p0, Lv0/l;->d:Ljava/lang/Object;

    check-cast v0, Lr1/a;

    if-nez p1, :cond_0

    iget-object p1, v0, Lr1/a;->c:Lv0/l;

    return-object p1

    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    return-object p0

    :cond_1
    iget-object v1, p0, Lv0/l;->e:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    new-array v3, v2, [I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    aget v5, v1, v4

    invoke-virtual {v0, v5, p1}, Lr1/a;->b(II)I

    move-result v5

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lv0/l;

    invoke-direct {p1, v0, v3}, Lv0/l;-><init>(Lr1/a;[I)V

    return-object p1
.end method

.method public j(LG/h;)V
    .locals 4

    iget v0, p1, LG/h;->b:I

    iget-object v1, p0, Lv0/l;->e:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    iget-object v2, p0, Lv0/l;->d:Ljava/lang/Object;

    check-cast v2, LA/h;

    if-nez v0, :cond_0

    new-instance v0, LD0/c;

    iget-object p1, p1, LG/h;->a:Landroid/graphics/Typeface;

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, p1}, LD0/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    new-instance p1, LG/a;

    const/4 v3, 0x0

    invoke-direct {p1, v0, v3, v2}, LG/a;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lv0/l;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lv0/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "0"

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lv0/l;->d()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Lv0/l;->d()I

    move-result v1

    :goto_0
    if-ltz v1, :cond_b

    invoke-virtual {p0, v1}, Lv0/l;->c(I)I

    move-result v2

    if-eqz v2, :cond_a

    if-gez v2, :cond_2

    invoke-virtual {p0}, Lv0/l;->d()I

    move-result v3

    if-ne v1, v3, :cond_1

    const-string v3, "-"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v3, " - "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    neg-int v2, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_3

    const-string v3, " + "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_2
    const/4 v3, 0x1

    if-eqz v1, :cond_4

    if-eq v2, v3, :cond_7

    :cond_4
    iget-object v4, p0, Lv0/l;->d:Ljava/lang/Object;

    check-cast v4, Lr1/a;

    if-eqz v2, :cond_9

    iget-object v4, v4, Lr1/a;->b:[I

    aget v2, v4, v2

    if-nez v2, :cond_5

    const/16 v2, 0x31

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    if-ne v2, v3, :cond_6

    const/16 v2, 0x61

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_6
    const-string v4, "a^"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_7
    :goto_3
    if-eqz v1, :cond_a

    if-ne v1, v3, :cond_8

    const/16 v2, 0x78

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_8
    const-string v2, "x^"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_9
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_a
    :goto_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_b
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_5
    return-object v0

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method
