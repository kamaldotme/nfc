.class public final LJ1/k;
.super LJ1/n;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LJ1/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LI1/y;LI1/y;)F
    .locals 8

    iget v0, p0, LJ1/k;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p1, LI1/y;->b:I

    if-lez v0, :cond_4

    iget p1, p1, LI1/y;->c:I

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    int-to-float v1, v0

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget v3, p2, LI1/y;->b:I

    int-to-float v4, v3

    div-float/2addr v1, v4

    cmpg-float v4, v1, v2

    if-gez v4, :cond_1

    div-float v1, v2, v1

    :cond_1
    int-to-float p1, p1

    mul-float v4, p1, v2

    iget p2, p2, LI1/y;->c:I

    int-to-float p2, p2

    div-float/2addr v4, p2

    cmpg-float v5, v4, v2

    if-gez v5, :cond_2

    div-float v4, v2, v4

    :cond_2
    div-float v1, v2, v1

    div-float/2addr v1, v4

    int-to-float v0, v0

    mul-float/2addr v0, v2

    div-float/2addr v0, p1

    int-to-float p1, v3

    mul-float/2addr p1, v2

    div-float/2addr p1, p2

    div-float/2addr v0, p1

    cmpg-float p1, v0, v2

    if-gez p1, :cond_3

    div-float v0, v2, v0

    :cond_3
    div-float/2addr v2, v0

    div-float/2addr v2, v0

    div-float/2addr v2, v0

    mul-float/2addr v2, v1

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v2, 0x0

    :goto_1
    return v2

    :pswitch_0
    iget v0, p1, LI1/y;->b:I

    if-lez v0, :cond_7

    iget v0, p1, LI1/y;->c:I

    if-gtz v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p1, p2}, LI1/y;->b(LI1/y;)LI1/y;

    move-result-object v0

    iget v1, v0, LI1/y;->b:I

    int-to-float v2, v1

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    iget p1, p1, LI1/y;->b:I

    int-to-float p1, p1

    div-float/2addr v2, p1

    cmpl-float p1, v2, v3

    if-lez p1, :cond_6

    div-float p1, v3, v2

    float-to-double v4, p1

    const-wide v6, 0x3ff199999999999aL    # 1.1

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v2, v4

    :cond_6
    iget p1, p2, LI1/y;->b:I

    int-to-float p1, p1

    mul-float/2addr p1, v3

    int-to-float v1, v1

    div-float/2addr p1, v1

    iget p2, p2, LI1/y;->c:I

    int-to-float p2, p2

    mul-float/2addr p2, v3

    iget v0, v0, LI1/y;->c:I

    int-to-float v0, v0

    div-float/2addr p2, v0

    mul-float/2addr p2, p1

    div-float/2addr v3, p2

    div-float/2addr v3, p2

    div-float/2addr v3, p2

    mul-float/2addr v3, v2

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v3, 0x0

    :goto_3
    return v3

    :pswitch_1
    iget v0, p1, LI1/y;->b:I

    if-lez v0, :cond_a

    iget v0, p1, LI1/y;->c:I

    if-gtz v0, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p1, p2}, LI1/y;->a(LI1/y;)LI1/y;

    move-result-object v0

    iget v1, v0, LI1/y;->b:I

    int-to-float v2, v1

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    iget p1, p1, LI1/y;->b:I

    int-to-float p1, p1

    div-float/2addr v2, p1

    cmpl-float p1, v2, v3

    if-lez p1, :cond_9

    div-float p1, v3, v2

    float-to-double v4, p1

    const-wide v6, 0x3ff199999999999aL    # 1.1

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v2, v4

    :cond_9
    int-to-float p1, v1

    mul-float/2addr p1, v3

    iget v1, p2, LI1/y;->b:I

    int-to-float v1, v1

    div-float/2addr p1, v1

    iget v0, v0, LI1/y;->c:I

    int-to-float v0, v0

    mul-float/2addr v0, v3

    iget p2, p2, LI1/y;->c:I

    int-to-float p2, p2

    div-float/2addr v0, p2

    add-float/2addr v0, p1

    div-float/2addr v3, v0

    div-float/2addr v3, v0

    mul-float/2addr v3, v2

    goto :goto_5

    :cond_a
    :goto_4
    const/4 v3, 0x0

    :goto_5
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(LI1/y;LI1/y;)Landroid/graphics/Rect;
    .locals 5

    iget v0, p0, LJ1/k;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Landroid/graphics/Rect;

    iget v0, p2, LI1/y;->b:I

    iget p2, p2, LI1/y;->c:I

    const/4 v1, 0x0

    invoke-direct {p1, v1, v1, v0, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1

    :pswitch_0
    invoke-virtual {p1, p2}, LI1/y;->b(LI1/y;)LI1/y;

    move-result-object v0

    invoke-virtual {p1}, LI1/y;->toString()Ljava/lang/String;

    invoke-virtual {v0}, LI1/y;->toString()Ljava/lang/String;

    invoke-virtual {p2}, LI1/y;->toString()Ljava/lang/String;

    iget p1, v0, LI1/y;->b:I

    iget v1, p2, LI1/y;->b:I

    sub-int v1, p1, v1

    div-int/lit8 v1, v1, 0x2

    iget v0, v0, LI1/y;->c:I

    iget p2, p2, LI1/y;->c:I

    sub-int p2, v0, p2

    div-int/lit8 p2, p2, 0x2

    new-instance v2, Landroid/graphics/Rect;

    neg-int v3, v1

    neg-int v4, p2

    sub-int/2addr p1, v1

    sub-int/2addr v0, p2

    invoke-direct {v2, v3, v4, p1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v2

    :pswitch_1
    invoke-virtual {p1, p2}, LI1/y;->a(LI1/y;)LI1/y;

    move-result-object v0

    invoke-virtual {p1}, LI1/y;->toString()Ljava/lang/String;

    invoke-virtual {v0}, LI1/y;->toString()Ljava/lang/String;

    invoke-virtual {p2}, LI1/y;->toString()Ljava/lang/String;

    iget p1, v0, LI1/y;->b:I

    iget v1, p2, LI1/y;->b:I

    sub-int v1, p1, v1

    div-int/lit8 v1, v1, 0x2

    iget v0, v0, LI1/y;->c:I

    iget p2, p2, LI1/y;->c:I

    sub-int p2, v0, p2

    div-int/lit8 p2, p2, 0x2

    new-instance v2, Landroid/graphics/Rect;

    neg-int v3, v1

    neg-int v4, p2

    sub-int/2addr p1, v1

    sub-int/2addr v0, p2

    invoke-direct {v2, v3, v4, p1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
