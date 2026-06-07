.class public final LH1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LH1/c;

    check-cast p2, LH1/c;

    iget p1, p1, LH1/c;->c:F

    iget p2, p2, LH1/c;->c:F

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method
