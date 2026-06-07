.class public final LJ1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LJ1/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La0/b;Lf/G;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LJ1/l;->a:I

    const/16 v0, 0x14

    const/4 v1, 0x1

    .line 6
    iput v1, p0, LJ1/l;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput v0, p0, LJ1/l;->b:I

    .line 9
    iput-object p1, p0, LJ1/l;->c:Ljava/lang/Object;

    .line 10
    iput-object p2, p0, LJ1/l;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LJ1/l;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, LJ1/l;->c:Ljava/lang/Object;

    .line 16
    iput-object p2, p0, LJ1/l;->d:Ljava/lang/Object;

    .line 17
    iput p3, p0, LJ1/l;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LJ1/l;->a:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput v0, p0, LJ1/l;->b:I

    .line 13
    iput-object p1, p0, LJ1/l;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm2/p;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LJ1/l;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LJ1/l;->c:Ljava/lang/Object;

    .line 4
    iput p2, p0, LJ1/l;->b:I

    .line 5
    iput-object p3, p0, LJ1/l;->d:Ljava/lang/Object;

    return-void
.end method

.method public static b(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)LJ1/l;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual/range {p0 .. p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v2

    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v3

    :goto_0
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v4, v5, :cond_0

    if-eq v4, v6, :cond_0

    goto :goto_0

    :cond_0
    if-ne v4, v5, :cond_21

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "gradient"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const/4 v9, 0x0

    if-nez v8, :cond_2

    const-string v5, "selector"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v0, v2, v3, v1}, Lz/c;->b(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v0

    new-instance v1, LJ1/l;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-direct {v1, v9, v0, v2}, LJ1/l;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v1

    :cond_1
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": unsupported complex color tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_20

    sget-object v4, Lw/a;->d:[I

    invoke-static {v0, v1, v3, v4}, Lz/b;->f(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    const-string v7, "startX"

    invoke-static {v2, v7}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_3

    move v11, v8

    goto :goto_1

    :cond_3
    const/16 v7, 0x8

    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v11, v7

    :goto_1
    const-string v7, "startY"

    invoke-static {v2, v7}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_4

    move v12, v8

    goto :goto_2

    :cond_4
    const/16 v7, 0x9

    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v12, v7

    :goto_2
    const-string v7, "endX"

    invoke-static {v2, v7}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_5

    move v13, v8

    goto :goto_3

    :cond_5
    const/16 v7, 0xa

    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v13, v7

    :goto_3
    const-string v7, "endY"

    invoke-static {v2, v7}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_6

    move v14, v8

    goto :goto_4

    :cond_6
    const/16 v7, 0xb

    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v14, v7

    :goto_4
    const-string v7, "centerX"

    invoke-static {v2, v7}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    const/4 v10, 0x3

    if-nez v7, :cond_7

    move v7, v8

    goto :goto_5

    :cond_7
    invoke-virtual {v4, v10, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    :goto_5
    const-string v15, "centerY"

    invoke-static {v2, v15}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_8

    move v15, v8

    goto :goto_6

    :cond_8
    const/4 v15, 0x4

    invoke-virtual {v4, v15, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v15

    :goto_6
    const-string v9, "type"

    invoke-static {v2, v9}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v9

    const/4 v10, 0x0

    if-nez v9, :cond_9

    move v9, v10

    goto :goto_7

    :cond_9
    invoke-virtual {v4, v5, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    :goto_7
    const-string v5, "startColor"

    invoke-static {v2, v5}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_a

    move v5, v10

    goto :goto_8

    :cond_a
    invoke-virtual {v4, v10, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    :goto_8
    const-string v8, "centerColor"

    invoke-static {v2, v8}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v19

    invoke-static {v2, v8}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_b

    move v8, v10

    goto :goto_9

    :cond_b
    const/4 v8, 0x7

    invoke-virtual {v4, v8, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    :goto_9
    const-string v6, "endColor"

    invoke-static {v2, v6}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_c

    move v6, v10

    goto :goto_a

    :cond_c
    const/4 v6, 0x1

    invoke-virtual {v4, v6, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v21

    move/from16 v6, v21

    :goto_a
    const-string v10, "tileMode"

    invoke-static {v2, v10}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_d

    move/from16 v22, v7

    const/4 v7, 0x0

    goto :goto_b

    :cond_d
    const/4 v10, 0x6

    move/from16 v22, v7

    const/4 v7, 0x0

    invoke-virtual {v4, v10, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v10

    move v7, v10

    :goto_b
    const-string v10, "gradientRadius"

    invoke-static {v2, v10}, Lz/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_e

    move/from16 v23, v15

    const/4 v10, 0x0

    goto :goto_c

    :cond_e
    const/4 v10, 0x5

    move/from16 v23, v15

    const/4 v15, 0x0

    invoke-virtual {v4, v10, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v10

    :goto_c
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v4

    const/4 v15, 0x1

    add-int/2addr v4, v15

    new-instance v15, Ljava/util/ArrayList;

    move/from16 v24, v10

    const/16 v10, 0x14

    invoke-direct {v15, v10}, Ljava/util/ArrayList;-><init>(I)V

    move/from16 v25, v14

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v10}, Ljava/util/ArrayList;-><init>(I)V

    :goto_d
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v10

    move/from16 v26, v13

    const/4 v13, 0x1

    if-eq v10, v13, :cond_14

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v13

    move/from16 v27, v12

    if-ge v13, v4, :cond_f

    const/4 v12, 0x3

    if-eq v10, v12, :cond_15

    :cond_f
    const/4 v12, 0x2

    if-eq v10, v12, :cond_11

    :cond_10
    :goto_e
    move/from16 v13, v26

    move/from16 v12, v27

    goto :goto_d

    :cond_11
    if-gt v13, v4, :cond_10

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v12, "item"

    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_12

    goto :goto_e

    :cond_12
    sget-object v10, Lw/a;->e:[I

    invoke-static {v0, v1, v3, v10}, Lz/b;->f(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v10

    const/4 v12, 0x0

    invoke-virtual {v10, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v13

    const/4 v12, 0x1

    invoke-virtual {v10, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v20

    if-eqz v13, :cond_13

    if-eqz v20, :cond_13

    const/4 v13, 0x0

    invoke-virtual {v10, v13, v13}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v21

    const/4 v13, 0x0

    invoke-virtual {v10, v12, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v28

    invoke-virtual {v10}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static/range {v28 .. v28}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_13
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": <item> tag requires a \'color\' attribute and a \'offset\' attribute!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    move/from16 v27, v12

    :cond_15
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_16

    new-instance v0, Lv0/e;

    invoke-direct {v0, v14, v15}, Lv0/e;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    goto :goto_f

    :cond_16
    const/4 v0, 0x0

    :goto_f
    if-eqz v0, :cond_17

    :goto_10
    const/4 v1, 0x1

    goto :goto_11

    :cond_17
    if-eqz v19, :cond_18

    new-instance v0, Lv0/e;

    invoke-direct {v0, v5, v8, v6}, Lv0/e;-><init>(III)V

    goto :goto_10

    :cond_18
    new-instance v0, Lv0/e;

    invoke-direct {v0, v5, v6}, Lv0/e;-><init>(II)V

    goto :goto_10

    :goto_11
    if-eq v9, v1, :cond_1c

    const/4 v2, 0x2

    if-eq v9, v2, :cond_1b

    new-instance v3, Landroid/graphics/LinearGradient;

    if-eq v7, v1, :cond_1a

    if-eq v7, v2, :cond_19

    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    :goto_12
    move-object/from16 v17, v1

    goto :goto_13

    :cond_19
    sget-object v1, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_12

    :cond_1a
    sget-object v1, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    goto :goto_12

    :goto_13
    iget-object v1, v0, Lv0/e;->b:Ljava/lang/Object;

    move-object v15, v1

    check-cast v15, [I

    iget-object v0, v0, Lv0/e;->c:Ljava/lang/Object;

    move-object/from16 v16, v0

    check-cast v16, [F

    const/4 v1, 0x0

    move-object v10, v3

    move/from16 v12, v27

    move/from16 v13, v26

    move/from16 v14, v25

    invoke-direct/range {v10 .. v17}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    goto :goto_16

    :cond_1b
    const/4 v1, 0x0

    new-instance v3, Landroid/graphics/SweepGradient;

    iget-object v2, v0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v2, [I

    iget-object v0, v0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v0, [F

    move/from16 v8, v22

    move/from16 v15, v23

    invoke-direct {v3, v8, v15, v2, v0}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    goto :goto_16

    :cond_1c
    move/from16 v8, v22

    move/from16 v15, v23

    const/4 v1, 0x0

    const/4 v2, 0x0

    cmpg-float v2, v24, v2

    if-lez v2, :cond_1f

    new-instance v3, Landroid/graphics/RadialGradient;

    const/4 v2, 0x1

    if-eq v7, v2, :cond_1e

    const/4 v2, 0x2

    if-eq v7, v2, :cond_1d

    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    :goto_14
    move-object/from16 v21, v2

    goto :goto_15

    :cond_1d
    sget-object v2, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_14

    :cond_1e
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    goto :goto_14

    :goto_15
    iget-object v2, v0, Lv0/e;->b:Ljava/lang/Object;

    move-object/from16 v19, v2

    check-cast v19, [I

    iget-object v0, v0, Lv0/e;->c:Ljava/lang/Object;

    move-object/from16 v20, v0

    check-cast v20, [F

    move v0, v15

    move-object v15, v3

    move/from16 v16, v8

    move/from16 v17, v0

    move/from16 v18, v24

    invoke-direct/range {v15 .. v21}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    :goto_16
    new-instance v0, LJ1/l;

    const/4 v2, 0x0

    invoke-direct {v0, v3, v2, v1}, LJ1/l;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v0

    :cond_1f
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "<gradient> tag requires \'gradientRadius\' attribute with radial type"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": invalid gradient color tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "No start tag found"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Ljava/lang/String;)V
    .locals 7

    const-string v0, ":memory:"

    invoke-static {p0, v0}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-gt v3, v0, :cond_5

    if-nez v4, :cond_0

    move v5, v3

    goto :goto_1

    :cond_0
    move v5, v0

    :goto_1
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x20

    invoke-static {v5, v6}, LX1/g;->f(II)I

    move-result v5

    if-gtz v5, :cond_1

    move v5, v1

    goto :goto_2

    :cond_1
    move v5, v2

    :goto_2
    if-nez v4, :cond_3

    if-nez v5, :cond_2

    move v4, v1

    goto :goto_0

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_5
    :goto_3
    add-int/2addr v0, v1

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/database/sqlite/SQLiteDatabase;->deleteDatabase(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_7
    :goto_4
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, LJ1/l;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lk/o0;->a(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    if-eqz v1, :cond_1

    iget-object v2, p0, LJ1/l;->d:Ljava/lang/Object;

    check-cast v2, Lk/e1;

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {v1, v2, v0}, Lk/t;->d(Landroid/graphics/drawable/Drawable;Lk/e1;[I)V

    :cond_1
    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, LJ1/l;->c:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Shader;

    if-nez v0, :cond_0

    iget-object v0, p0, LJ1/l;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Landroid/util/AttributeSet;I)V
    .locals 8

    iget-object v0, p0, LJ1/l;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v3, Le/a;->f:[I

    const/4 v2, 0x0

    invoke-static {v1, p1, v3, p2, v2}, Lv0/m;->F(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lv0/m;

    move-result-object v7

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v1, v7, Lv0/m;->d:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Landroid/content/res/TypedArray;

    move-object v1, v0

    move-object v4, p1

    move v6, p2

    invoke-static/range {v1 .. v6}, LJ/T;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    :try_start_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p2, -0x1

    iget-object v1, v7, Lv0/m;->d:Ljava/lang/Object;

    check-cast v1, Landroid/content/res/TypedArray;

    if-nez p1, :cond_0

    const/4 v2, 0x1

    :try_start_1
    invoke-virtual {v1, v2, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eq v2, p2, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, La/a;->s(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Lk/o0;->a(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    const/4 p1, 0x2

    invoke-virtual {v1, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v7, p1}, Lv0/m;->q(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {v0, p1}, LN/f;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    :cond_2
    const/4 p1, 0x3

    invoke-virtual {v1, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lk/o0;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-static {v0, p1}, LN/f;->d(Landroid/widget/ImageView;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    invoke-virtual {v7}, Lv0/m;->J()V

    return-void

    :goto_1
    invoke-virtual {v7}, Lv0/m;->J()V

    throw p1
.end method

.method public f(Lf0/c;)V
    .locals 0

    return-void
.end method

.method public g(Lf0/c;)V
    .locals 4

    const-string v0, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    invoke-virtual {p1, v0}, Lf0/c;->L(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    move v1, v2

    :goto_0
    const/4 v3, 0x0

    invoke-static {v0, v3}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    iget-object v0, p0, LJ1/l;->d:Ljava/lang/Object;

    check-cast v0, Lf/G;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lf/G;->m(Lf0/c;)V

    if-nez v1, :cond_2

    invoke-static {p1}, Lf/G;->o(Lf0/c;)LA1/h;

    move-result-object v1

    iget-boolean v3, v1, LA1/h;->a:Z

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Pre-packaged database has an invalid schema: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, LA1/h;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, LJ1/l;->k(Lf0/c;)V

    iget-object p1, v0, Lf/G;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/work/impl/WorkDatabase_Impl;

    iget-object v0, p1, Landroidx/work/impl/WorkDatabase;->f:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_2
    if-ge v2, v0, :cond_3

    iget-object v1, p1, Landroidx/work/impl/WorkDatabase;->f:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-void

    :goto_3
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public h(Lf0/c;II)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LJ1/l;->j(Lf0/c;II)V

    return-void
.end method

.method public i(Lf0/c;)V
    .locals 10

    const-string v0, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name=\'room_master_table\'"

    invoke-virtual {p1, v0}, Lf0/c;->L(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    move v1, v3

    :goto_0
    const/4 v4, 0x0

    invoke-static {v0, v4}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    if-eqz v1, :cond_3

    new-instance v0, Ld1/f;

    const-string v1, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    invoke-direct {v0, v1}, Ld1/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lf0/c;->J(Le0/e;)Landroid/database/Cursor;

    move-result-object v0

    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_1
    move-object v1, v4

    :goto_1
    invoke-static {v0, v4}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    const-string v0, "7d73d21f1bd82c9e5268b6dcf9fde2cb"

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "3071c8717539de5d5353f4c8cd59a032"

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 7d73d21f1bd82c9e5268b6dcf9fde2cb, found: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception v1

    invoke-static {v0, p1}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    iget-object v0, p0, LJ1/l;->d:Ljava/lang/Object;

    check-cast v0, Lf/G;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lf/G;->o(Lf0/c;)LA1/h;

    move-result-object v0

    iget-boolean v1, v0, LA1/h;->a:Z

    if-eqz v1, :cond_7

    invoke-virtual {p0, p1}, LJ1/l;->k(Lf0/c;)V

    :cond_4
    :goto_3
    iget-object v0, p0, LJ1/l;->d:Ljava/lang/Object;

    check-cast v0, Lf/G;

    iget-object v1, v0, Lf/G;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/work/impl/WorkDatabase_Impl;

    iput-object p1, v1, Landroidx/work/impl/WorkDatabase;->a:Lf0/c;

    const-string v1, "PRAGMA foreign_keys = ON"

    invoke-virtual {p1, v1}, Lf0/c;->A(Ljava/lang/String;)V

    iget-object v1, v0, Lf/G;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/work/impl/WorkDatabase_Impl;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Landroidx/work/impl/WorkDatabase;->d:La0/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v1, La0/f;->k:Ljava/lang/Object;

    monitor-enter v5

    :try_start_3
    iget-boolean v6, v1, La0/f;->f:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-eqz v6, :cond_5

    monitor-exit v5

    goto :goto_4

    :cond_5
    :try_start_4
    const-string v6, "PRAGMA temp_store = MEMORY;"

    invoke-virtual {p1, v6}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v6, "PRAGMA recursive_triggers=\'ON\';"

    invoke-virtual {p1, v6}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v6, "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"

    invoke-virtual {p1, v6}, Lf0/c;->A(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, La0/f;->c(Lf0/c;)V

    const-string v6, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"

    invoke-virtual {p1, v6}, Lf0/c;->i(Ljava/lang/String;)Lf0/i;

    move-result-object v6

    iput-object v6, v1, La0/f;->g:Lf0/i;

    iput-boolean v2, v1, La0/f;->f:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    monitor-exit v5

    :goto_4
    iget-object v1, v0, Lf/G;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/work/impl/WorkDatabase_Impl;

    iget-object v1, v1, Landroidx/work/impl/WorkDatabase;->f:Ljava/util/List;

    if-eqz v1, :cond_6

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_5
    if-ge v3, v1, :cond_6

    iget-object v2, v0, Lf/G;->b:Ljava/lang/Object;

    check-cast v2, Landroidx/work/impl/WorkDatabase_Impl;

    iget-object v2, v2, Landroidx/work/impl/WorkDatabase;->f:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lf0/c;->a()V

    :try_start_5
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v2, Ln0/b;->a:Lm0/r;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sget-wide v8, Ln0/o;->a:J

    sub-long/2addr v6, v8

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lf0/c;->A(Ljava/lang/String;)V

    invoke-virtual {p1}, Lf0/c;->M()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    invoke-virtual {p1}, Lf0/c;->o()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :catchall_3
    move-exception v0

    invoke-virtual {p1}, Lf0/c;->o()V

    throw v0

    :cond_6
    iput-object v4, p0, LJ1/l;->c:Ljava/lang/Object;

    return-void

    :catchall_4
    move-exception p1

    monitor-exit v5

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Pre-packaged database has an invalid schema: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, LA1/h;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_6
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :catchall_5
    move-exception v1

    invoke-static {v0, p1}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public j(Lf0/c;II)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    move/from16 v3, p3

    iget-object v4, v1, LJ1/l;->c:Ljava/lang/Object;

    check-cast v4, La0/b;

    const/4 v5, 0x0

    iget-object v6, v1, LJ1/l;->d:Ljava/lang/Object;

    check-cast v6, Lf/G;

    if-eqz v4, :cond_f

    iget-object v4, v4, La0/b;->d:LA/h;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x0

    if-ne v2, v3, :cond_0

    sget-object v4, LL1/t;->b:LL1/t;

    goto/16 :goto_6

    :cond_0
    if-le v3, v2, :cond_1

    const/4 v9, 0x1

    goto :goto_0

    :cond_1
    move v9, v5

    :goto_0
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move v11, v2

    :cond_2
    if-eqz v9, :cond_3

    if-ge v11, v3, :cond_9

    goto :goto_1

    :cond_3
    if-le v11, v3, :cond_9

    :goto_1
    iget-object v12, v4, LA/h;->c:Ljava/lang/Object;

    check-cast v12, Ljava/util/LinkedHashMap;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/TreeMap;

    if-nez v12, :cond_4

    :goto_2
    move-object v4, v7

    goto :goto_6

    :cond_4
    if-eqz v9, :cond_5

    invoke-virtual {v12}, Ljava/util/TreeMap;->descendingKeySet()Ljava/util/NavigableSet;

    move-result-object v13

    goto :goto_3

    :cond_5
    invoke-virtual {v12}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    const-string v15, "targetVersion"

    if-eqz v9, :cond_7

    add-int/lit8 v8, v11, 0x1

    invoke-static {v14, v15}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-gt v8, v15, :cond_6

    if-gt v15, v3, :cond_6

    goto :goto_4

    :cond_7
    invoke-static {v14, v15}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-gt v3, v8, :cond_6

    if-ge v8, v11, :cond_6

    :goto_4
    invoke-virtual {v12, v14}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v11

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    move v8, v5

    :goto_5
    if-nez v8, :cond_2

    goto :goto_2

    :cond_9
    move-object v4, v10

    :goto_6
    if-eqz v4, :cond_f

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, LM1/b;

    invoke-direct {v2}, LM1/b;-><init>()V

    const-string v3, "SELECT name FROM sqlite_master WHERE type = \'trigger\'"

    invoke-virtual {v0, v3}, Lf0/c;->L(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    :goto_7
    :try_start_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, LM1/b;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_a

    :cond_a
    invoke-static {v3, v7}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v2}, Lv0/f;->k(LM1/b;)LM1/b;

    move-result-object v2

    invoke-virtual {v2, v5}, LM1/b;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v2

    :cond_b
    :goto_8
    move-object v3, v2

    check-cast v3, LM1/a;

    invoke-virtual {v3}, LM1/a;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v3}, LM1/a;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v6, "triggerName"

    invoke-static {v3, v6}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "room_fts_content_sync_"

    invoke-static {v3, v6, v5}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_b

    const-string v6, "DROP TRIGGER IF EXISTS "

    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lf0/c;->A(Ljava/lang/String;)V

    goto :goto_8

    :cond_c
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb0/a;

    invoke-virtual {v3, v0}, Lb0/a;->a(Lf0/c;)V

    goto :goto_9

    :cond_d
    invoke-static/range {p1 .. p1}, Lf/G;->o(Lf0/c;)LA1/h;

    move-result-object v2

    iget-boolean v3, v2, LA1/h;->a:Z

    if-eqz v3, :cond_e

    invoke-virtual/range {p0 .. p1}, LJ1/l;->k(Lf0/c;)V

    goto :goto_c

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Migration didn\'t properly handle: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v2, LA1/h;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_a
    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    move-object v4, v0

    invoke-static {v3, v2}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4

    :cond_f
    iget-object v4, v1, LJ1/l;->c:Ljava/lang/Object;

    check-cast v4, La0/b;

    if-eqz v4, :cond_11

    invoke-virtual {v4, v2, v3}, La0/b;->a(II)Z

    move-result v4

    if-nez v4, :cond_11

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "DROP TABLE IF EXISTS `Dependency`"

    invoke-virtual {v0, v2}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v2, "DROP TABLE IF EXISTS `WorkSpec`"

    invoke-virtual {v0, v2}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v2, "DROP TABLE IF EXISTS `WorkTag`"

    invoke-virtual {v0, v2}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v2, "DROP TABLE IF EXISTS `SystemIdInfo`"

    invoke-virtual {v0, v2}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v2, "DROP TABLE IF EXISTS `WorkName`"

    invoke-virtual {v0, v2}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v2, "DROP TABLE IF EXISTS `WorkProgress`"

    invoke-virtual {v0, v2}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v2, "DROP TABLE IF EXISTS `Preference`"

    invoke-virtual {v0, v2}, Lf0/c;->A(Ljava/lang/String;)V

    iget-object v2, v6, Lf/G;->b:Ljava/lang/Object;

    check-cast v2, Landroidx/work/impl/WorkDatabase_Impl;

    iget-object v3, v2, Landroidx/work/impl/WorkDatabase;->f:Ljava/util/List;

    if-eqz v3, :cond_10

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    :goto_b
    if-ge v5, v3, :cond_10

    iget-object v4, v2, Landroidx/work/impl/WorkDatabase;->f:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln0/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_10
    invoke-static/range {p1 .. p1}, Lf/G;->m(Lf0/c;)V

    :goto_c
    return-void

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "A migration from "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k(Lf0/c;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'7d73d21f1bd82c9e5268b6dcf9fde2cb\')"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, LJ1/l;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lm2/p;->c:Lm2/p;

    iget-object v2, p0, LJ1/l;->c:Ljava/lang/Object;

    check-cast v2, Lm2/p;

    if-ne v2, v1, :cond_0

    const-string v1, "HTTP/1.0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "HTTP/1.1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, LJ1/l;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LJ1/l;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
