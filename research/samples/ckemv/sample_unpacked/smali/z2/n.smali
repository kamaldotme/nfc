.class public final Lz2/n;
.super LL1/e;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final b:[Lz2/i;


# direct methods
.method public constructor <init>([Lz2/i;)V
    .locals 0

    invoke-direct {p0}, LL1/e;-><init>()V

    iput-object p1, p0, Lz2/n;->b:[Lz2/i;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lz2/n;->b:[Lz2/i;

    array-length v0, v0

    return v0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lz2/i;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lz2/i;

    invoke-super {p0, p1}, LL1/e;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz2/n;->b:[Lz2/i;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lz2/i;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lz2/i;

    invoke-super {p0, p1}, LL1/e;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lz2/i;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lz2/i;

    invoke-super {p0, p1}, LL1/e;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
