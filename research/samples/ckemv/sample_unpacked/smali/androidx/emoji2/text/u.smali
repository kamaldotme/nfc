.class public final Landroidx/emoji2/text/u;
.super Landroid/text/style/ReplacementSpan;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Paint$FontMetricsInt;

.field public final b:Landroidx/emoji2/text/n;

.field public c:F


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/n;)V
    .locals 1

    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    new-instance v0, Landroid/graphics/Paint$FontMetricsInt;

    invoke-direct {v0}, Landroid/graphics/Paint$FontMetricsInt;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/u;->a:Landroid/graphics/Paint$FontMetricsInt;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Landroidx/emoji2/text/u;->c:F

    const-string v0, "metadata cannot be null"

    invoke-static {p1, v0}, Lm0/z;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/emoji2/text/u;->b:Landroidx/emoji2/text/n;

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 10

    move-object/from16 v7, p9

    invoke-static {}, Landroidx/emoji2/text/j;->a()Landroidx/emoji2/text/j;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v0, p7

    int-to-float v5, v0

    move-object v8, p0

    iget-object v0, v8, Landroidx/emoji2/text/u;->b:Landroidx/emoji2/text/n;

    iget-object v1, v0, Landroidx/emoji2/text/n;->b:Lv0/i;

    iget-object v2, v1, Lv0/i;->e:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Typeface;

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v9

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget v0, v0, Landroidx/emoji2/text/n;->a:I

    mul-int/lit8 v2, v0, 0x2

    const/4 v3, 0x2

    iget-object v0, v1, Lv0/i;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, [C

    move-object v0, p1

    move v4, p5

    move-object/from16 v6, p9

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    invoke-virtual {v7, v9}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 4

    iget-object p2, p0, Landroidx/emoji2/text/u;->a:Landroid/graphics/Paint$FontMetricsInt;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    iget p1, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    sub-int/2addr p1, p3

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    const/high16 p3, 0x3f800000    # 1.0f

    mul-float/2addr p1, p3

    iget-object p3, p0, Landroidx/emoji2/text/u;->b:Landroidx/emoji2/text/n;

    invoke-virtual {p3}, Landroidx/emoji2/text/n;->c()LR/a;

    move-result-object p4

    const/16 v0, 0xe

    invoke-virtual {p4, v0}, LJ/z;->a(I)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v3, p4, LJ/z;->d:Ljava/lang/Object;

    check-cast v3, Ljava/nio/ByteBuffer;

    iget p4, p4, LJ/z;->a:I

    add-int/2addr v1, p4

    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p4

    goto :goto_0

    :cond_0
    move p4, v2

    :goto_0
    int-to-float p4, p4

    div-float/2addr p1, p4

    iput p1, p0, Landroidx/emoji2/text/u;->c:F

    invoke-virtual {p3}, Landroidx/emoji2/text/n;->c()LR/a;

    move-result-object p1

    invoke-virtual {p1, v0}, LJ/z;->a(I)I

    move-result p4

    if-eqz p4, :cond_1

    iget-object v0, p1, LJ/z;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    iget p1, p1, LJ/z;->a:I

    add-int/2addr p4, p1

    invoke-virtual {v0, p4}, Ljava/nio/ByteBuffer;->getShort(I)S

    :cond_1
    invoke-virtual {p3}, Landroidx/emoji2/text/n;->c()LR/a;

    move-result-object p1

    const/16 p3, 0xc

    invoke-virtual {p1, p3}, LJ/z;->a(I)I

    move-result p3

    if-eqz p3, :cond_2

    iget-object p4, p1, LJ/z;->d:Ljava/lang/Object;

    check-cast p4, Ljava/nio/ByteBuffer;

    iget p1, p1, LJ/z;->a:I

    add-int/2addr p3, p1

    invoke-virtual {p4, p3}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v2

    :cond_2
    int-to-float p1, v2

    iget p3, p0, Landroidx/emoji2/text/u;->c:F

    mul-float/2addr p1, p3

    float-to-int p1, p1

    int-to-short p1, p1

    if-eqz p5, :cond_3

    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iget p2, p2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    :cond_3
    return p1
.end method
