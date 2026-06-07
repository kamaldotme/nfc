.class public final Lm2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final b:[Ljava/lang/String;


# direct methods
.method public constructor <init>([Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/j;->b:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "name"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm2/j;->b:[Ljava/lang/String;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x2

    const/4 v2, 0x0

    const/4 v3, -0x2

    invoke-static {v1, v2, v3}, Lm0/z;->I(III)I

    move-result v2

    if-gt v2, v1, :cond_1

    :goto_0
    aget-object v3, v0, v1

    invoke-static {p1, v3}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    aget-object p1, v0, v1

    goto :goto_1

    :cond_0
    if-eq v1, v2, :cond_1

    add-int/lit8 v1, v1, -0x2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lm2/j;->b:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final c()Lf/G;
    .locals 4

    new-instance v0, Lf/G;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lf/G;-><init>(I)V

    iget-object v1, v0, Lf/G;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    const-string v2, "<this>"

    invoke-static {v1, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lm2/j;->b:[Ljava/lang/String;

    const-string v3, "elements"

    invoke-static {v2, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LL1/j;->Q([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final d(I)Ljava/lang/String;
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Lm2/j;->b:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lm2/j;

    if-eqz v0, :cond_0

    check-cast p1, Lm2/j;

    iget-object p1, p1, Lm2/j;->b:[Ljava/lang/String;

    iget-object v0, p0, Lm2/j;->b:[Ljava/lang/String;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lm2/j;->b:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 6

    invoke-virtual {p0}, Lm2/j;->size()I

    move-result v0

    new-array v1, v0, [LK1/c;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0, v2}, Lm2/j;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2}, Lm2/j;->d(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, LK1/c;

    invoke-direct {v5, v3, v4}, LK1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v5, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, LL1/b;

    invoke-direct {v0, v1}, LL1/b;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lm2/j;->b:[Ljava/lang/String;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lm2/j;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Lm2/j;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2}, Lm2/j;->d(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Ln2/b;->p(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v4, "\u2588\u2588"

    :cond_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
