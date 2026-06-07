.class public LL1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LL1/e;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LL1/b;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL1/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lc2/b;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LL1/b;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iget-object v0, p1, Lc2/b;->a:Lc2/c;

    .line 5
    invoke-interface {v0}, Lc2/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, LL1/b;->c:Ljava/lang/Object;

    .line 6
    iget p1, p1, Lc2/b;->b:I

    iput p1, p0, LL1/b;->b:I

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LL1/b;->a:I

    const-string v0, "array"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL1/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, LL1/b;->a:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    iget v0, p0, LL1/b;->b:I

    iget-object v1, p0, LL1/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    if-lez v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v0, p0, LL1/b;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LL1/b;->b:I

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0

    :pswitch_0
    iget v0, p0, LL1/b;->b:I

    iget-object v1, p0, LL1/b;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    :pswitch_1
    iget v0, p0, LL1/b;->b:I

    iget-object v1, p0, LL1/b;->c:Ljava/lang/Object;

    check-cast v1, LL1/e;

    invoke-virtual {v1}, LL1/e;->a()I

    move-result v1

    if-ge v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, LL1/b;->a:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    iget v0, p0, LL1/b;->b:I

    iget-object v1, p0, LL1/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    if-lez v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v0, p0, LL1/b;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LL1/b;->b:I

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    :try_start_0
    iget-object v0, p0, LL1/b;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iget v1, p0, LL1/b;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LL1/b;->b:I

    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget v1, p0, LL1/b;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LL1/b;->b:I

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    invoke-virtual {p0}, LL1/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LL1/b;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, LL1/b;->b:I

    iget-object v1, p0, LL1/b;->c:Ljava/lang/Object;

    check-cast v1, LL1/e;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, LL1/b;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
