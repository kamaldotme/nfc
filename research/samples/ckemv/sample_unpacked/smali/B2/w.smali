.class public final LB2/w;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final b:Landroid/graphics/Paint;

.field public final c:Ljava/util/ArrayList;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 14

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v0, 0x40400000    # 3.0f

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iput-object p1, p0, LB2/w;->b:Landroid/graphics/Paint;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LB2/w;->c:Ljava/util/ArrayList;

    iput-boolean v0, p0, LB2/w;->d:Z

    const/4 p1, 0x0

    :goto_0
    const/16 v1, 0x10

    if-ge p1, v1, :cond_0

    iget-object v1, p0, LB2/w;->c:Ljava/util/ArrayList;

    new-instance v2, LB2/v;

    new-instance v3, La2/c;

    const/16 v4, 0x64

    const/16 v5, 0x1f4

    invoke-direct {v3, v4, v5, v0}, La2/a;-><init>(III)V

    sget-object v6, LY1/e;->b:LY1/d;

    invoke-static {v6, v3}, Lu2/l;->D(LY1/d;La2/c;)I

    move-result v3

    int-to-float v3, v3

    new-instance v7, La2/c;

    invoke-direct {v7, v4, v5, v0}, La2/a;-><init>(III)V

    invoke-static {v6, v7}, Lu2/l;->D(LY1/d;La2/c;)I

    move-result v4

    int-to-float v4, v4

    new-instance v5, La2/c;

    const/16 v7, 0x14

    const/16 v8, 0x50

    invoke-direct {v5, v7, v8, v0}, La2/a;-><init>(III)V

    invoke-static {v6, v5}, Lu2/l;->D(LY1/d;La2/c;)I

    move-result v5

    int-to-float v5, v5

    new-instance v7, La2/c;

    const/16 v8, -0xa

    const/16 v9, 0xa

    invoke-direct {v7, v8, v9, v0}, La2/a;-><init>(III)V

    invoke-static {v6, v7}, Lu2/l;->D(LY1/d;La2/c;)I

    move-result v7

    int-to-float v7, v7

    new-instance v10, La2/c;

    invoke-direct {v10, v8, v9, v0}, La2/a;-><init>(III)V

    invoke-static {v6, v10}, Lu2/l;->D(LY1/d;La2/c;)I

    move-result v8

    int-to-float v8, v8

    new-instance v9, La2/c;

    const/16 v10, 0x32

    const/16 v11, 0xff

    invoke-direct {v9, v10, v11, v0}, La2/a;-><init>(III)V

    invoke-static {v6, v9}, Lu2/l;->D(LY1/d;La2/c;)I

    move-result v9

    new-instance v12, La2/c;

    invoke-direct {v12, v10, v11, v0}, La2/a;-><init>(III)V

    invoke-static {v6, v12}, Lu2/l;->D(LY1/d;La2/c;)I

    move-result v12

    new-instance v13, La2/c;

    invoke-direct {v13, v10, v11, v0}, La2/a;-><init>(III)V

    invoke-static {v6, v13}, Lu2/l;->D(LY1/d;La2/c;)I

    move-result v6

    invoke-static {v9, v12, v6}, Landroid/graphics/Color;->rgb(III)I

    move-result v6

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput v3, v2, LB2/v;->a:F

    iput v4, v2, LB2/v;->b:F

    iput v5, v2, LB2/v;->c:F

    iput v7, v2, LB2/v;->d:F

    iput v8, v2, LB2/v;->e:F

    iput v6, v2, LB2/v;->f:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/Thread;

    new-instance v0, LB2/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LB2/u;-><init>(ILjava/lang/Object;)V

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LB2/w;->d:Z

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    const-string v0, "canvas"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    const-string v0, "#121212"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    iget-object v0, p0, LB2/w;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v9, p0, LB2/w;->b:Landroid/graphics/Paint;

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LB2/v;

    iget v3, v2, LB2/v;->f:I

    invoke-virtual {v9, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget v3, v2, LB2/v;->a:F

    iget v4, v2, LB2/v;->b:F

    iget v2, v2, LB2/v;->c:F

    invoke-virtual {p1, v3, v4, v2, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    const-string v1, "#33FFFFFF"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_3

    add-int/lit8 v10, v2, 0x1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v11

    move v12, v10

    :goto_2
    if-ge v12, v11, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LB2/v;

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LB2/v;

    iget v5, v4, LB2/v;->a:F

    iget v6, v3, LB2/v;->a:F

    sub-float/2addr v5, v6

    float-to-double v5, v5

    iget v7, v4, LB2/v;->b:F

    iget v8, v3, LB2/v;->b:F

    sub-float/2addr v7, v8

    float-to-double v7, v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    double-to-float v5, v5

    const/high16 v6, 0x43480000    # 200.0f

    cmpg-float v5, v5, v6

    if-gez v5, :cond_1

    iget v5, v3, LB2/v;->a:F

    iget v6, v3, LB2/v;->b:F

    iget v7, v4, LB2/v;->a:F

    iget v8, v4, LB2/v;->b:F

    move-object v3, p1

    move v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move-object v8, v9

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_2
    move v2, v10

    goto :goto_1

    :cond_3
    const/high16 p1, 0x40400000    # 3.0f

    invoke-virtual {v9, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method
