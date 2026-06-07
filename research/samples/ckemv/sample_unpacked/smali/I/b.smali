.class public LI/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:[Ljava/lang/Object;

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LI/b;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 5
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, LI/b;->b:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LI/b;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    .line 2
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LI/b;->b:[Ljava/lang/Object;

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The max pool size must be > 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, LI/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, LI/b;->c:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    add-int/lit8 v2, v0, -0x1

    iget-object v3, p0, LI/b;->b:[Ljava/lang/Object;

    aget-object v4, v3, v2

    aput-object v1, v3, v2

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LI/b;->c:I

    move-object v1, v4

    :cond_0
    return-object v1

    :pswitch_0
    iget v0, p0, LI/b;->c:I

    const/4 v1, 0x0

    if-lez v0, :cond_1

    add-int/lit8 v2, v0, -0x1

    iget-object v3, p0, LI/b;->b:[Ljava/lang/Object;

    aget-object v4, v3, v2

    aput-object v1, v3, v2

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LI/b;->c:I

    move-object v1, v4

    :cond_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lq/c;)V
    .locals 3

    iget v0, p0, LI/b;->c:I

    iget-object v1, p0, LI/b;->b:[Ljava/lang/Object;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aput-object p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LI/b;->c:I

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, LI/b;->c:I

    iget-object v3, p0, LI/b;->b:[Ljava/lang/Object;

    if-ge v1, v2, :cond_1

    aget-object v2, v3, v1

    if-eq v2, p1, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already in the pool!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    array-length v1, v3

    if-ge v2, v1, :cond_2

    aput-object p1, v3, v2

    const/4 p1, 0x1

    add-int/2addr v2, p1

    iput v2, p0, LI/b;->c:I

    return p1

    :cond_2
    return v0
.end method
