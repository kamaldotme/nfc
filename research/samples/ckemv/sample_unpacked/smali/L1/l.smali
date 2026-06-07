.class public abstract LL1/l;
.super Lv0/f;
.source "SourceFile"


# direct methods
.method public static Q(Ljava/util/List;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static varargs R([Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "elements"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-lez v0, :cond_0

    invoke-static {p0}, LL1/j;->Q([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, LL1/t;->b:LL1/t;

    :goto_0
    return-object p0
.end method
