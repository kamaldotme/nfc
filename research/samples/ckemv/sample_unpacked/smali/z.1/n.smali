.class public abstract Lz/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/ThreadLocal;

.field public static final b:Ljava/util/WeakHashMap;

.field public static final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lz/n;->a:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/WeakHashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    sput-object v0, Lz/n;->b:Ljava/util/WeakHashMap;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz/n;->c:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;I)Landroid/graphics/Typeface;
    .locals 7

    invoke-virtual {p0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    invoke-static/range {v0 .. v6}, Lz/n;->b(Landroid/content/Context;ILandroid/util/TypedValue;ILz/b;ZZ)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;ILandroid/util/TypedValue;ILz/b;ZZ)Landroid/graphics/Typeface;
    .locals 15

    move/from16 v9, p1

    move-object/from16 v0, p2

    move/from16 v6, p3

    move-object/from16 v10, p4

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const/4 v1, 0x1

    invoke-virtual {v7, v9, v0, v1}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    iget-object v1, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-eqz v1, :cond_c

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v1, "res/"

    invoke-virtual {v8, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v11, 0x0

    const/4 v12, -0x3

    if-nez v1, :cond_0

    if-eqz v10, :cond_9

    invoke-virtual {v10, v12}, Lz/b;->a(I)V

    goto/16 :goto_1

    :cond_0
    iget v1, v0, Landroid/util/TypedValue;->assetCookie:I

    sget-object v13, LA/i;->b:Ln/f;

    invoke-static {v7, v9, v8, v1, v6}, LA/i;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1}, Ln/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_2

    if-eqz v10, :cond_1

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, LI1/k;

    const/4 v3, 0x7

    invoke-direct {v2, v10, v3, v1}, LI1/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    move-object v11, v1

    goto/16 :goto_1

    :cond_2
    if-eqz p6, :cond_3

    goto/16 :goto_1

    :cond_3
    :try_start_0
    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, ".xml"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v1

    invoke-static {v1, v7}, Lz/b;->i(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Lz/e;

    move-result-object v1

    if-nez v1, :cond_4

    if-eqz v10, :cond_9

    invoke-virtual {v10, v12}, Lz/b;->a(I)V

    goto :goto_1

    :cond_4
    iget v5, v0, Landroid/util/TypedValue;->assetCookie:I

    move-object v0, p0

    move-object v2, v7

    move/from16 v3, p1

    move-object v4, v8

    move/from16 v6, p3

    move-object/from16 v7, p4

    move/from16 v8, p5

    invoke-static/range {v0 .. v8}, LA/i;->a(Landroid/content/Context;Lz/e;Landroid/content/res/Resources;ILjava/lang/String;IILz/b;Z)Landroid/graphics/Typeface;

    move-result-object v11

    goto :goto_1

    :cond_5
    iget v14, v0, Landroid/util/TypedValue;->assetCookie:I

    sget-object v0, LA/i;->a:Lm0/z;

    move-object v1, p0

    move-object v2, v7

    move/from16 v3, p1

    move-object v4, v8

    move/from16 v5, p3

    invoke-virtual/range {v0 .. v5}, Lm0/z;->t(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v7, v9, v8, v14, v6}, LA/i;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1, v0}, Ln/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    if-eqz v10, :cond_8

    if-eqz v0, :cond_7

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, LI1/k;

    const/4 v3, 0x7

    invoke-direct {v2, v10, v3, v0}, LI1/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_7
    invoke-virtual {v10, v12}, Lz/b;->a(I)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_8
    :goto_0
    move-object v11, v0

    goto :goto_1

    :catch_0
    if-eqz v10, :cond_9

    invoke-virtual {v10, v12}, Lz/b;->a(I)V

    :cond_9
    :goto_1
    if-nez v11, :cond_b

    if-nez v10, :cond_b

    if-eqz p6, :cond_a

    goto :goto_2

    :cond_a
    new-instance v0, Landroid/content/res/Resources$NotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Font resource ID #0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " could not be retrieved."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    :goto_2
    return-object v11

    :cond_c
    new-instance v1, Landroid/content/res/Resources$NotFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Resource \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\" ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ") is not a Font: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
