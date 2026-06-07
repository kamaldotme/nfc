.class public final LL1/i;
.super LL1/f;
.source "SourceFile"


# static fields
.field public static final e:[Ljava/lang/Object;


# instance fields
.field public b:I

.field public c:[Ljava/lang/Object;

.field public d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, LL1/i;->e:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LL1/f;-><init>()V

    sget-object v0, LL1/i;->e:[Ljava/lang/Object;

    iput-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LL1/i;->d:I

    return v0
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, LL1/i;->d:I

    if-ltz p1, :cond_8

    if-gt p1, v0, :cond_8

    if-ne p1, v0, :cond_0

    .line 2
    invoke-virtual {p0, p2}, LL1/i;->c(Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    const-string v1, "<this>"

    const/4 v2, 0x1

    if-nez p1, :cond_2

    add-int/2addr v0, v2

    .line 4
    invoke-virtual {p0, v0}, LL1/i;->e(I)V

    .line 5
    iget p1, p0, LL1/i;->b:I

    if-nez p1, :cond_1

    .line 6
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {p1, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    array-length p1, p1

    :cond_1
    sub-int/2addr p1, v2

    .line 8
    iput p1, p0, LL1/i;->b:I

    .line 9
    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    aput-object p2, v0, p1

    .line 10
    iget p1, p0, LL1/i;->d:I

    add-int/2addr p1, v2

    .line 11
    iput p1, p0, LL1/i;->d:I

    return-void

    :cond_2
    add-int/2addr v0, v2

    .line 12
    invoke-virtual {p0, v0}, LL1/i;->e(I)V

    .line 13
    iget v0, p0, LL1/i;->b:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, LL1/i;->g(I)I

    move-result v0

    .line 14
    iget v3, p0, LL1/i;->d:I

    add-int/lit8 v4, v3, 0x1

    shr-int/2addr v4, v2

    const/4 v5, 0x0

    if-ge p1, v4, :cond_6

    if-nez v0, :cond_3

    .line 15
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {p1, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    array-length p1, p1

    sub-int/2addr p1, v2

    goto :goto_0

    :cond_3
    add-int/lit8 p1, v0, -0x1

    .line 17
    :goto_0
    iget v0, p0, LL1/i;->b:I

    if-nez v0, :cond_4

    .line 18
    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    array-length v0, v0

    :cond_4
    sub-int/2addr v0, v2

    .line 20
    iget v1, p0, LL1/i;->b:I

    if-lt p1, v1, :cond_5

    .line 21
    iget-object v3, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v4, v3, v1

    aput-object v4, v3, v0

    add-int/lit8 v4, v1, 0x1

    add-int/lit8 v5, p1, 0x1

    .line 22
    invoke-static {v3, v3, v1, v4, v5}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_1

    .line 23
    :cond_5
    iget-object v3, p0, LL1/i;->c:[Ljava/lang/Object;

    add-int/lit8 v4, v1, -0x1

    array-length v6, v3

    invoke-static {v3, v3, v4, v1, v6}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 24
    iget-object v1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v3, v1

    sub-int/2addr v3, v2

    aget-object v4, v1, v5

    aput-object v4, v1, v3

    add-int/lit8 v3, p1, 0x1

    .line 25
    invoke-static {v1, v1, v5, v2, v3}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 26
    :goto_1
    iget-object v1, p0, LL1/i;->c:[Ljava/lang/Object;

    aput-object p2, v1, p1

    .line 27
    iput v0, p0, LL1/i;->b:I

    goto :goto_3

    .line 28
    :cond_6
    iget p1, p0, LL1/i;->b:I

    add-int/2addr v3, p1

    invoke-virtual {p0, v3}, LL1/i;->g(I)I

    move-result p1

    if-ge v0, p1, :cond_7

    .line 29
    iget-object v1, p0, LL1/i;->c:[Ljava/lang/Object;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v1, v1, v3, v0, p1}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_2

    .line 30
    :cond_7
    iget-object v1, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {v1, v1, v2, v5, p1}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 31
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v1, p1

    sub-int/2addr v1, v2

    aget-object v1, p1, v1

    aput-object v1, p1, v5

    add-int/lit8 v1, v0, 0x1

    .line 32
    array-length v3, p1

    sub-int/2addr v3, v2

    invoke-static {p1, p1, v1, v0, v3}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 33
    :goto_2
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    aput-object p2, p1, v0

    .line 34
    :goto_3
    iget p1, p0, LL1/i;->d:I

    add-int/2addr p1, v2

    .line 35
    iput p1, p0, LL1/i;->d:I

    return-void

    .line 36
    :cond_8
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "index: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, LL1/i;->c(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 8

    const-string v0, "elements"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v0, p0, LL1/i;->d:I

    if-ltz p1, :cond_c

    if-gt p1, v0, :cond_c

    .line 2
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 3
    :cond_0
    iget v0, p0, LL1/i;->d:I

    if-ne p1, v0, :cond_1

    .line 4
    invoke-virtual {p0, p2}, LL1/i;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    .line 5
    :cond_1
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, LL1/i;->e(I)V

    .line 6
    iget v0, p0, LL1/i;->b:I

    .line 7
    iget v2, p0, LL1/i;->d:I

    add-int/2addr v2, v0

    .line 8
    invoke-virtual {p0, v2}, LL1/i;->g(I)I

    move-result v0

    .line 9
    iget v2, p0, LL1/i;->b:I

    add-int/2addr v2, p1

    invoke-virtual {p0, v2}, LL1/i;->g(I)I

    move-result v2

    .line 10
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v3

    .line 11
    iget v4, p0, LL1/i;->d:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    shr-int/2addr v4, v5

    if-ge p1, v4, :cond_7

    .line 12
    iget p1, p0, LL1/i;->b:I

    sub-int v0, p1, v3

    if-lt v2, p1, :cond_4

    if-ltz v0, :cond_2

    .line 13
    iget-object v1, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {v1, v1, v0, p1, v2}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_0

    .line 14
    :cond_2
    iget-object v4, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v6, v4

    add-int/2addr v0, v6

    sub-int v6, v2, p1

    .line 15
    array-length v7, v4

    sub-int/2addr v7, v0

    if-lt v7, v6, :cond_3

    .line 16
    invoke-static {v4, v4, v0, p1, v2}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_0

    :cond_3
    add-int v6, p1, v7

    .line 17
    invoke-static {v4, v4, v0, p1, v6}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 18
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    iget v4, p0, LL1/i;->b:I

    add-int/2addr v4, v7

    invoke-static {p1, p1, v1, v4, v2}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_0

    .line 19
    :cond_4
    iget-object v4, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v6, v4

    invoke-static {v4, v4, v0, p1, v6}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    if-lt v3, v2, :cond_5

    .line 20
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v4, p1

    sub-int/2addr v4, v3

    invoke-static {p1, p1, v4, v1, v2}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_0

    .line 21
    :cond_5
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v4, p1

    sub-int/2addr v4, v3

    invoke-static {p1, p1, v4, v1, v3}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 22
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {p1, p1, v1, v3, v2}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 23
    :goto_0
    iput v0, p0, LL1/i;->b:I

    sub-int/2addr v2, v3

    if-gez v2, :cond_6

    .line 24
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length p1, p1

    add-int/2addr v2, p1

    .line 25
    :cond_6
    invoke-virtual {p0, v2, p2}, LL1/i;->d(ILjava/util/Collection;)V

    goto :goto_2

    :cond_7
    add-int p1, v2, v3

    if-ge v2, v0, :cond_a

    add-int/2addr v3, v0

    .line 26
    iget-object v4, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v6, v4

    if-gt v3, v6, :cond_8

    .line 27
    invoke-static {v4, v4, p1, v2, v0}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_1

    .line 28
    :cond_8
    array-length v6, v4

    if-lt p1, v6, :cond_9

    .line 29
    array-length v1, v4

    sub-int/2addr p1, v1

    invoke-static {v4, v4, p1, v2, v0}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_1

    .line 30
    :cond_9
    array-length v6, v4

    sub-int/2addr v3, v6

    sub-int v3, v0, v3

    .line 31
    invoke-static {v4, v4, v1, v3, v0}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 32
    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {v0, v0, p1, v2, v3}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_1

    .line 33
    :cond_a
    iget-object v4, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {v4, v4, v3, v1, v0}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 34
    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v4, v0

    if-lt p1, v4, :cond_b

    .line 35
    array-length v1, v0

    sub-int/2addr p1, v1

    array-length v1, v0

    invoke-static {v0, v0, p1, v2, v1}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_1

    .line 36
    :cond_b
    array-length v4, v0

    sub-int/2addr v4, v3

    array-length v6, v0

    invoke-static {v0, v0, v1, v4, v6}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 37
    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v1, v0

    sub-int/2addr v1, v3

    invoke-static {v0, v0, p1, v2, v1}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 38
    :goto_1
    invoke-virtual {p0, v2, p2}, LL1/i;->d(ILjava/util/Collection;)V

    :goto_2
    return v5

    .line 39
    :cond_c
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "index: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 2

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 41
    :cond_0
    invoke-virtual {p0}, LL1/i;->a()I

    move-result v0

    .line 42
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, LL1/i;->e(I)V

    .line 43
    iget v0, p0, LL1/i;->b:I

    .line 44
    invoke-virtual {p0}, LL1/i;->a()I

    move-result v1

    add-int/2addr v1, v0

    .line 45
    invoke-virtual {p0, v1}, LL1/i;->g(I)I

    move-result v0

    invoke-virtual {p0, v0, p1}, LL1/i;->d(ILjava/util/Collection;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final b(I)Ljava/lang/Object;
    .locals 8

    iget v0, p0, LL1/i;->d:I

    if-ltz p1, :cond_6

    if-ge p1, v0, :cond_6

    invoke-static {p0}, LL1/l;->Q(Ljava/util/List;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, LL1/i;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget p1, p0, LL1/i;->b:I

    invoke-static {p0}, LL1/l;->Q(Ljava/util/List;)I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, LL1/i;->g(I)I

    move-result p1

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v3, v0, p1

    aput-object v2, v0, p1

    iget p1, p0, LL1/i;->d:I

    sub-int/2addr p1, v1

    iput p1, p0, LL1/i;->d:I

    return-object v3

    :cond_0
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "ArrayDeque is empty."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-nez p1, :cond_2

    invoke-virtual {p0}, LL1/i;->h()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    iget v0, p0, LL1/i;->b:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, LL1/i;->g(I)I

    move-result v0

    iget-object v3, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v4, v3, v0

    iget v5, p0, LL1/i;->d:I

    shr-int/2addr v5, v1

    const/4 v6, 0x0

    if-ge p1, v5, :cond_4

    iget p1, p0, LL1/i;->b:I

    if-lt v0, p1, :cond_3

    add-int/lit8 v5, p1, 0x1

    invoke-static {v3, v3, v5, p1, v0}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_0

    :cond_3
    invoke-static {v3, v3, v1, v6, v0}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v0, p1

    sub-int/2addr v0, v1

    aget-object v0, p1, v0

    aput-object v0, p1, v6

    iget v0, p0, LL1/i;->b:I

    add-int/lit8 v3, v0, 0x1

    array-length v5, p1

    sub-int/2addr v5, v1

    invoke-static {p1, p1, v3, v0, v5}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    :goto_0
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    iget v0, p0, LL1/i;->b:I

    aput-object v2, p1, v0

    invoke-virtual {p0, v0}, LL1/i;->f(I)I

    move-result p1

    iput p1, p0, LL1/i;->b:I

    goto :goto_2

    :cond_4
    iget p1, p0, LL1/i;->b:I

    invoke-static {p0}, LL1/l;->Q(Ljava/util/List;)I

    move-result v3

    add-int/2addr v3, p1

    invoke-virtual {p0, v3}, LL1/i;->g(I)I

    move-result p1

    if-gt v0, p1, :cond_5

    iget-object v3, p0, LL1/i;->c:[Ljava/lang/Object;

    add-int/lit8 v5, v0, 0x1

    add-int/lit8 v6, p1, 0x1

    invoke-static {v3, v3, v0, v5, v6}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_1

    :cond_5
    iget-object v3, p0, LL1/i;->c:[Ljava/lang/Object;

    add-int/lit8 v5, v0, 0x1

    array-length v7, v3

    invoke-static {v3, v3, v0, v5, v7}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v3, v0

    sub-int/2addr v3, v1

    aget-object v5, v0, v6

    aput-object v5, v0, v3

    add-int/lit8 v3, p1, 0x1

    invoke-static {v0, v0, v6, v1, v3}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    :goto_1
    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    aput-object v2, v0, p1

    :goto_2
    iget p1, p0, LL1/i;->d:I

    sub-int/2addr p1, v1

    iput p1, p0, LL1/i;->d:I

    return-object v4

    :cond_6
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "index: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, LL1/i;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, LL1/i;->e(I)V

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    iget v1, p0, LL1/i;->b:I

    invoke-virtual {p0}, LL1/i;->a()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p0, v2}, LL1/i;->g(I)I

    move-result v1

    aput-object p1, v0, v1

    invoke-virtual {p0}, LL1/i;->a()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LL1/i;->d:I

    return-void
.end method

.method public final clear()V
    .locals 6

    iget v0, p0, LL1/i;->b:I

    iget v1, p0, LL1/i;->d:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, LL1/i;->g(I)I

    move-result v0

    iget v1, p0, LL1/i;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-ge v1, v0, :cond_0

    iget-object v4, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {v4, v3, v1, v0}, LL1/j;->T([Ljava/lang/Object;Ld1/f;II)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LL1/i;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, LL1/i;->c:[Ljava/lang/Object;

    iget v4, p0, LL1/i;->b:I

    array-length v5, v1

    invoke-static {v1, v4, v5, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iget-object v1, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {v1, v3, v2, v0}, LL1/j;->T([Ljava/lang/Object;Ld1/f;II)V

    :cond_1
    :goto_0
    iput v2, p0, LL1/i;->b:I

    iput v2, p0, LL1/i;->d:I

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0, p1}, LL1/i;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d(ILjava/util/Collection;)V
    .locals 4

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iget-object v1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v1, v1

    :goto_0
    if-ge p1, v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget p1, p0, LL1/i;->b:I

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LL1/i;->a()I

    move-result p1

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, LL1/i;->d:I

    return-void
.end method

.method public final e(I)V
    .locals 4

    if-ltz p1, :cond_6

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v1, v0

    if-gt p1, v1, :cond_0

    return-void

    :cond_0
    sget-object v1, LL1/i;->e:[Ljava/lang/Object;

    if-ne v0, v1, :cond_2

    const/16 v0, 0xa

    if-ge p1, v0, :cond_1

    move p1, v0

    :cond_1
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    return-void

    :cond_2
    array-length v1, v0

    shr-int/lit8 v2, v1, 0x1

    add-int/2addr v1, v2

    sub-int v2, v1, p1

    if-gez v2, :cond_3

    move v1, p1

    :cond_3
    const v2, 0x7ffffff7

    sub-int v3, v1, v2

    if-lez v3, :cond_5

    if-le p1, v2, :cond_4

    const p1, 0x7fffffff

    move v1, p1

    goto :goto_0

    :cond_4
    move v1, v2

    :cond_5
    :goto_0
    new-array p1, v1, [Ljava/lang/Object;

    iget v1, p0, LL1/i;->b:I

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v1, v0

    iget v2, p0, LL1/i;->b:I

    sub-int/2addr v1, v2

    invoke-static {v0, p1, v1, v3, v2}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iput v3, p0, LL1/i;->b:I

    iput-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Deque is too big."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(I)I
    .locals 2

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    const-string v1, "<this>"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    :goto_0
    return p1
.end method

.method public final g(I)I
    .locals 2

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    array-length v0, v0

    sub-int/2addr p1, v0

    :cond_0
    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, LL1/i;->a()I

    move-result v0

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    iget v1, p0, LL1/i;->b:I

    add-int/2addr v1, p1

    invoke-virtual {p0, v1}, LL1/i;->g(I)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1

    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "index: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final h()Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, LL1/i;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    iget v1, p0, LL1/i;->b:I

    aget-object v2, v0, v1

    const/4 v3, 0x0

    aput-object v3, v0, v1

    invoke-virtual {p0, v1}, LL1/i;->f(I)I

    move-result v0

    iput v0, p0, LL1/i;->b:I

    invoke-virtual {p0}, LL1/i;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LL1/i;->d:I

    return-object v2

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "ArrayDeque is empty."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 4

    iget v0, p0, LL1/i;->b:I

    invoke-virtual {p0}, LL1/i;->a()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, LL1/i;->g(I)I

    move-result v0

    iget v1, p0, LL1/i;->b:I

    if-ge v1, v0, :cond_1

    :goto_0
    if-ge v1, v0, :cond_5

    iget-object v2, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-static {p1, v2}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget p1, p0, LL1/i;->b:I

    :goto_1
    sub-int/2addr v1, p1

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-lt v1, v0, :cond_5

    iget-object v2, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v2, v2

    :goto_2
    if-ge v1, v2, :cond_3

    iget-object v3, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v3, v3, v1

    invoke-static {p1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget p1, p0, LL1/i;->b:I

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_3
    if-ge v1, v0, :cond_5

    iget-object v2, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-static {p1, v2}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length p1, p1

    add-int/2addr v1, p1

    iget p1, p0, LL1/i;->b:I

    goto :goto_1

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    const/4 p1, -0x1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    invoke-virtual {p0}, LL1/i;->a()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 4

    iget v0, p0, LL1/i;->b:I

    iget v1, p0, LL1/i;->d:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, LL1/i;->g(I)I

    move-result v0

    iget v1, p0, LL1/i;->b:I

    const/4 v2, -0x1

    if-ge v1, v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    if-gt v1, v0, :cond_5

    :goto_0
    iget-object v3, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v3, v3, v0

    invoke-static {p1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget p1, p0, LL1/i;->b:I

    :goto_1
    sub-int/2addr v0, p1

    return v0

    :cond_0
    if-eq v0, v1, :cond_5

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    if-le v1, v0, :cond_5

    add-int/lit8 v0, v0, -0x1

    :goto_2
    if-ge v2, v0, :cond_3

    iget-object v1, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-static {p1, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length p1, p1

    add-int/2addr v0, p1

    iget p1, p0, LL1/i;->b:I

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_3
    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    const-string v1, "<this>"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iget v1, p0, LL1/i;->b:I

    if-gt v1, v0, :cond_5

    :goto_3
    iget-object v3, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v3, v3, v0

    invoke-static {p1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget p1, p0, LL1/i;->b:I

    goto :goto_1

    :cond_4
    if-eq v0, v1, :cond_5

    add-int/lit8 v0, v0, -0x1

    goto :goto_3

    :cond_5
    return v2
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0, p1}, LL1/i;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LL1/i;->b(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 11

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LL1/i;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_9

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v0, v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget v0, p0, LL1/i;->b:I

    iget v2, p0, LL1/i;->d:I

    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, LL1/i;->g(I)I

    move-result v0

    iget v2, p0, LL1/i;->b:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ge v2, v0, :cond_3

    move v5, v2

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v6, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v6, v6, v2

    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v7

    xor-int/2addr v7, v3

    if-eqz v7, :cond_1

    iget-object v7, p0, LL1/i;->c:[Ljava/lang/Object;

    add-int/lit8 v8, v5, 0x1

    aput-object v6, v7, v5

    move v5, v8

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {p1, v4, v5, v0}, LL1/j;->T([Ljava/lang/Object;Ld1/f;II)V

    goto :goto_6

    :cond_3
    iget-object v5, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v5, v5

    move v7, v1

    move v6, v2

    :goto_2
    if-ge v2, v5, :cond_5

    iget-object v8, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v9, v8, v2

    aput-object v4, v8, v2

    invoke-interface {p1, v9}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v8

    xor-int/2addr v8, v3

    if-eqz v8, :cond_4

    iget-object v8, p0, LL1/i;->c:[Ljava/lang/Object;

    add-int/lit8 v10, v6, 0x1

    aput-object v9, v8, v6

    move v6, v10

    goto :goto_3

    :cond_4
    move v7, v3

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v6}, LL1/i;->g(I)I

    move-result v2

    move v5, v2

    :goto_4
    if-ge v1, v0, :cond_7

    iget-object v2, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v6, v2, v1

    aput-object v4, v2, v1

    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v2, v3

    if-eqz v2, :cond_6

    iget-object v2, p0, LL1/i;->c:[Ljava/lang/Object;

    aput-object v6, v2, v5

    invoke-virtual {p0, v5}, LL1/i;->f(I)I

    move-result v5

    goto :goto_5

    :cond_6
    move v7, v3

    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    move v1, v7

    :goto_6
    if-eqz v1, :cond_9

    iget p1, p0, LL1/i;->b:I

    sub-int/2addr v5, p1

    if-gez v5, :cond_8

    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length p1, p1

    add-int/2addr v5, p1

    :cond_8
    iput v5, p0, LL1/i;->d:I

    :cond_9
    :goto_7
    return v1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 11

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LL1/i;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_9

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v0, v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget v0, p0, LL1/i;->b:I

    iget v2, p0, LL1/i;->d:I

    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, LL1/i;->g(I)I

    move-result v0

    iget v2, p0, LL1/i;->b:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ge v2, v0, :cond_3

    move v5, v2

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v6, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v6, v6, v2

    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    iget-object v7, p0, LL1/i;->c:[Ljava/lang/Object;

    add-int/lit8 v8, v5, 0x1

    aput-object v6, v7, v5

    move v5, v8

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    invoke-static {p1, v4, v5, v0}, LL1/j;->T([Ljava/lang/Object;Ld1/f;II)V

    goto :goto_6

    :cond_3
    iget-object v5, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v5, v5

    move v7, v1

    move v6, v2

    :goto_2
    if-ge v2, v5, :cond_5

    iget-object v8, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v9, v8, v2

    aput-object v4, v8, v2

    invoke-interface {p1, v9}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object v8, p0, LL1/i;->c:[Ljava/lang/Object;

    add-int/lit8 v10, v6, 0x1

    aput-object v9, v8, v6

    move v6, v10

    goto :goto_3

    :cond_4
    move v7, v3

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v6}, LL1/i;->g(I)I

    move-result v2

    move v5, v2

    :goto_4
    if-ge v1, v0, :cond_7

    iget-object v2, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v6, v2, v1

    aput-object v4, v2, v1

    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, LL1/i;->c:[Ljava/lang/Object;

    aput-object v6, v2, v5

    invoke-virtual {p0, v5}, LL1/i;->f(I)I

    move-result v5

    goto :goto_5

    :cond_6
    move v7, v3

    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    move v1, v7

    :goto_6
    if-eqz v1, :cond_9

    iget p1, p0, LL1/i;->b:I

    sub-int/2addr v5, p1

    if-gez v5, :cond_8

    iget-object p1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length p1, p1

    add-int/2addr v5, p1

    :cond_8
    iput v5, p0, LL1/i;->d:I

    :cond_9
    :goto_7
    return v1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LL1/i;->a()I

    move-result v0

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    iget v0, p0, LL1/i;->b:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, LL1/i;->g(I)I

    move-result p1

    iget-object v0, p0, LL1/i;->c:[Ljava/lang/Object;

    aget-object v1, v0, p1

    aput-object p2, v0, p1

    return-object v1

    :cond_0
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "index: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LL1/i;->a()I

    move-result v0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, LL1/i;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5

    const-string v0, "array"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    array-length v0, p1

    .line 4
    iget v1, p0, LL1/i;->d:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>"

    invoke-static {p1, v0}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Ljava/lang/Object;

    .line 6
    :goto_0
    iget v0, p0, LL1/i;->b:I

    .line 7
    iget v1, p0, LL1/i;->d:I

    add-int/2addr v1, v0

    .line 8
    invoke-virtual {p0, v1}, LL1/i;->g(I)I

    move-result v0

    .line 9
    iget v1, p0, LL1/i;->b:I

    const/4 v2, 0x0

    if-ge v1, v0, :cond_1

    .line 10
    iget-object v3, p0, LL1/i;->c:[Ljava/lang/Object;

    .line 11
    invoke-static {v3, p1, v2, v1, v0}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {p0}, LL1/i;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    .line 13
    iget-object v1, p0, LL1/i;->c:[Ljava/lang/Object;

    iget v3, p0, LL1/i;->b:I

    array-length v4, v1

    invoke-static {v1, p1, v2, v3, v4}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 14
    iget-object v1, p0, LL1/i;->c:[Ljava/lang/Object;

    array-length v3, v1

    iget v4, p0, LL1/i;->b:I

    sub-int/2addr v3, v4

    invoke-static {v1, p1, v3, v2, v0}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 15
    :cond_2
    :goto_1
    iget v0, p0, LL1/i;->d:I

    .line 16
    array-length v1, p1

    if-ge v0, v1, :cond_3

    const/4 v1, 0x0

    .line 17
    aput-object v1, p1, v0

    :cond_3
    return-object p1
.end method
