.class public abstract Lu2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z = false

.field public static b:Ljava/lang/reflect/Method; = null

.field public static c:Z = false

.field public static d:Ljava/lang/reflect/Field;


# direct methods
.method public static A(Landroid/content/Context;Landroidx/fragment/app/n;ZZ)Lv0/l;
    .locals 4

    iget-object v0, p1, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    iget v2, v0, Landroidx/fragment/app/m;->f:I

    :goto_0
    if-eqz p3, :cond_4

    if-eqz p2, :cond_2

    if-nez v0, :cond_1

    :goto_1
    move p3, v1

    goto :goto_2

    :cond_1
    iget p3, v0, Landroidx/fragment/app/m;->d:I

    goto :goto_2

    :cond_2
    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget p3, v0, Landroidx/fragment/app/m;->e:I

    goto :goto_2

    :cond_4
    if-eqz p2, :cond_6

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    iget p3, v0, Landroidx/fragment/app/m;->b:I

    goto :goto_2

    :cond_6
    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    iget p3, v0, Landroidx/fragment/app/m;->c:I

    :goto_2
    invoke-virtual {p1, v1, v1, v1, v1}, Landroidx/fragment/app/n;->y(IIII)V

    iget-object v0, p1, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    const v3, 0x7f0801bb

    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    invoke-virtual {v0, v3, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_8
    iget-object p1, p1, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    move-result-object p1

    if-eqz p1, :cond_9

    return-object v1

    :cond_9
    if-nez p3, :cond_10

    if-eqz v2, :cond_10

    const/16 p1, 0x1001

    if-eq v2, p1, :cond_e

    const/16 p1, 0x1003

    if-eq v2, p1, :cond_c

    const/16 p1, 0x2002

    if-eq v2, p1, :cond_a

    const/4 p1, -0x1

    :goto_3
    move p3, p1

    goto :goto_4

    :cond_a
    if-eqz p2, :cond_b

    const p1, 0x7f020003

    goto :goto_3

    :cond_b
    const p1, 0x7f020004

    goto :goto_3

    :cond_c
    if-eqz p2, :cond_d

    const p1, 0x7f020005

    goto :goto_3

    :cond_d
    const p1, 0x7f020006

    goto :goto_3

    :cond_e
    if-eqz p2, :cond_f

    const p1, 0x7f020007

    goto :goto_3

    :cond_f
    const p1, 0x7f020008

    goto :goto_3

    :cond_10
    :goto_4
    if-eqz p3, :cond_13

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "anim"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    :try_start_0
    invoke-static {p0, p3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p2

    if-eqz p2, :cond_13

    new-instance v0, Lv0/l;

    invoke-direct {v0, p2}, Lv0/l;-><init>(Landroid/view/animation/Animation;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    :catch_0
    move-exception p0

    throw p0

    :catch_1
    :cond_11
    :try_start_1
    invoke-static {p0, p3}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object p2

    if-eqz p2, :cond_13

    new-instance v0, Lv0/l;

    invoke-direct {v0, p2}, Lv0/l;-><init>(Landroid/animation/Animator;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    return-object v0

    :catch_2
    move-exception p2

    if-nez p1, :cond_12

    invoke-static {p0, p3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p0

    if-eqz p0, :cond_13

    new-instance p1, Lv0/l;

    invoke-direct {p1, p0}, Lv0/l;-><init>(Landroid/view/animation/Animation;)V

    return-object p1

    :cond_12
    throw p2

    :cond_13
    return-object v1
.end method

.method public static final B(I)I
    .locals 3

    const-string v0, "networkType"

    invoke-static {v0, p0}, LX/d;->o(Ljava/lang/String;I)V

    invoke-static {p0}, Lq/h;->a(I)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const/4 v0, 0x6

    if-ne p0, v0, :cond_0

    const/4 v1, 0x5

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not convert "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, LX/d;->y(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " to int"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public static C(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    const-string v0, "locales"

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    invoke-static {}, Landroid/util/Xml;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_1
    invoke-interface {v1, p0, v2}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    const-string v3, "UTF-8"

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v3, v4}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-interface {v1, v2, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v3, "application_locales"

    invoke-interface {v1, v2, v3, p1}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    invoke-interface {v1, v2, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    invoke-interface {v1}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_2

    :goto_0
    :try_start_2
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_1

    :try_start_3
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    :cond_1
    throw p1

    :catch_1
    if-eqz p0, :cond_2

    goto :goto_0

    :catch_2
    :cond_2
    :goto_1
    return-void
.end method

.method public static D(LY1/d;La2/c;)I
    .locals 1

    const-string v0, "random"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p0, p1}, La/a;->E(LY1/d;La2/c;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static E(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    const-string v0, "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"

    const-string v1, ""

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v3

    const-string v4, "UTF-8"

    invoke-interface {v3, v2, v4}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v4

    :cond_0
    :goto_0
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_3

    const/4 v6, 0x3

    if-ne v5, v6, :cond_1

    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v7

    if-le v7, v4, :cond_3

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_1
    :goto_1
    if-eq v5, v6, :cond_0

    const/4 v6, 0x4

    if-ne v5, v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "locales"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v4, "application_locales"

    const/4 v5, 0x0

    invoke-interface {v3, v5, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    if-eqz v2, :cond_5

    :goto_2
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :goto_3
    if-eqz v2, :cond_4

    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    :cond_4
    throw p0

    :catch_1
    if-eqz v2, :cond_5

    goto :goto_2

    :catch_2
    :cond_5
    :goto_4
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {p0, v0}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    :catch_3
    :goto_5
    return-object v1
.end method

.method public static final F([Ljava/lang/Object;II)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    if-ge p1, p2, :cond_0

    const/4 v0, 0x0

    aput-object v0, p0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static G(Landroid/content/Context;II)I
    .locals 1

    invoke-static {p0, p1}, Lu2/d;->z(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object p0

    if-eqz p0, :cond_0

    iget p1, p0, Landroid/util/TypedValue;->type:I

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    iget p2, p0, Landroid/util/TypedValue;->data:I

    :cond_0
    return p2
.end method

.method public static H(Landroid/content/Context;ILandroid/view/animation/Interpolator;)Landroid/animation/TimeInterpolator;
    .locals 5

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    iget p1, v0, Landroid/util/TypedValue;->type:I

    const/4 p2, 0x3

    if-ne p1, p2, :cond_6

    iget-object p1, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "cubic-bezier"

    invoke-static {p1, v1}, Lu2/l;->y(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    const-string v4, "path"

    if-nez v3, :cond_2

    invoke-static {p1, v4}, Lu2/l;->y(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget p1, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-static {p0, p1}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    invoke-static {p1, v1}, Lu2/l;->y(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    sub-int/2addr p0, v2

    const/16 v0, 0xd

    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, ","

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length p1, p0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lu2/l;->q(I[Ljava/lang/String;)F

    move-result p1

    invoke-static {v2, p0}, Lu2/l;->q(I[Ljava/lang/String;)F

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1, p0}, Lu2/l;->q(I[Ljava/lang/String;)F

    move-result v1

    invoke-static {p2, p0}, Lu2/l;->q(I[Ljava/lang/String;)F

    move-result p0

    invoke-static {p1, v0, v1, p0}, LL/a;->b(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p0

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p0, p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1, v4}, Lu2/l;->y(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    sub-int/2addr p0, v2

    const/4 p2, 0x5

    invoke-virtual {p1, p2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/a;->p(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object p0

    invoke-static {p0}, LL/a;->c(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;

    move-result-object p0

    :goto_1
    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid motion easing type: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final I(Ljava/util/Set;)[B
    .locals 4

    const-string v0, "triggers"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [B

    return-object p0

    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    new-instance v1, Ljava/io/ObjectOutputStream;

    invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/c;

    iget-object v3, v2, Lm0/c;->a:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/ObjectOutputStream;->writeUTF(Ljava/lang/String;)V

    iget-boolean v2, v2, Lm0/c;->b:Z

    invoke-virtual {v1, v2}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :try_start_2
    invoke-static {v1, p0}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {v0, p0}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    const-string v0, "outputStream.toByteArray()"

    invoke-static {p0, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :catchall_1
    move-exception p0

    goto :goto_2

    :goto_1
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-static {v1, p0}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v1

    invoke-static {v0, p0}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static J(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    invoke-static {p0, p1}, LB/b;->g(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public static K(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-static {p0, p1}, LB/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static L(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-static {p0, p1}, LB/b;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static M(LW1/p;Le2/a;Le2/a;)V
    .locals 1

    :try_start_0
    invoke-static {p0, p1, p2}, Lv0/f;->q(LW1/p;Ljava/lang/Object;LO1/d;)LO1/d;

    move-result-object p0

    invoke-static {p0}, Lv0/f;->y(LO1/d;)LO1/d;

    move-result-object p0

    sget-object p1, LK1/h;->a:LK1/h;

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lj2/a;->i(LO1/d;Ljava/lang/Object;LW1/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object p1

    invoke-virtual {p2, p1}, Le2/a;->c(Ljava/lang/Object;)V

    throw p0
.end method

.method public static final N(I)I
    .locals 1

    const-string v0, "state"

    invoke-static {v0, p0}, LX/d;->o(Ljava/lang/String;I)V

    invoke-static {p0}, Lq/h;->a(I)I

    move-result p0

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, LK1/b;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return v0
.end method

.method public static O(La2/c;I)La2/a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v0, :cond_2

    iget v0, p0, La2/a;->d:I

    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    neg-int p1, p1

    :goto_1
    new-instance v0, La2/a;

    iget v1, p0, La2/a;->b:I

    iget p0, p0, La2/a;->c:I

    invoke-direct {v0, v1, p0, p1}, La2/a;-><init>(III)V

    return-object v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Step must be positive, was: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static P(II)La2/c;
    .locals 2

    const/high16 v0, -0x80000000

    if-gt p1, v0, :cond_0

    sget-object p0, La2/c;->e:La2/c;

    sget-object p0, La2/c;->e:La2/c;

    return-object p0

    :cond_0
    new-instance v0, La2/c;

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    invoke-direct {v0, p0, p1, v1}, La2/a;-><init>(III)V

    return-object v0
.end method

.method public static final a(Lp2/a;Lp2/c;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lp2/d;->i:Ljava/util/logging/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Lp2/c;->b:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%-22s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lp2/a;->a:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    return-void
.end method

.method public static final b(Lg2/r;Ls0/b;LO1/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lg2/p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lg2/p;

    iget v1, v0, Lg2/p;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg2/p;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg2/p;

    invoke-direct {v0, p2}, LQ1/b;-><init>(LO1/d;)V

    :goto_0
    iget-object p2, v0, Lg2/p;->f:Ljava/lang/Object;

    sget-object v1, LP1/a;->b:LP1/a;

    iget v2, v0, Lg2/p;->g:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lg2/p;->e:LW1/a;

    :try_start_0
    invoke-static {p2}, Lm0/z;->m0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object p2, v0, LQ1/b;->c:LO1/i;

    invoke-static {p2}, LX1/g;->b(Ljava/lang/Object;)V

    sget-object v2, Le2/s;->c:Le2/s;

    invoke-interface {p2, v2}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object p2

    if-ne p2, p0, :cond_4

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Lg2/p;->e:LW1/a;

    iput v3, v0, Lg2/p;->g:I

    new-instance p2, Le2/f;

    invoke-static {v0}, Lv0/f;->y(LO1/d;)LO1/d;

    move-result-object v0

    invoke-direct {p2, v3, v0}, Le2/f;-><init>(ILO1/d;)V

    invoke-virtual {p2}, Le2/f;->r()V

    new-instance v0, LL1/a;

    const/4 v2, 0x2

    invoke-direct {v0, v2, p2}, LL1/a;-><init>(ILjava/lang/Object;)V

    check-cast p0, Lg2/q;

    invoke-virtual {p0, v0}, Lg2/q;->e(LL1/a;)V

    invoke-virtual {p2}, Le2/f;->q()Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-interface {p1}, LW1/a;->d()Ljava/lang/Object;

    sget-object p0, LK1/h;->a:LK1/h;

    return-object p0

    :goto_2
    invoke-interface {p1}, LW1/a;->d()Ljava/lang/Object;

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "awaitClose() can only be invoked from the producer context"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c([B)Ljava/util/LinkedHashSet;
    .locals 9

    const-string v0, "bytes"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v1, p0

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const/4 p0, 0x0

    :try_start_0
    new-instance v2, Ljava/io/ObjectInputStream;

    invoke-direct {v2, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readUTF()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v6

    new-instance v7, Lm0/c;

    const-string v8, "uri"

    invoke-static {v5, v8}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v5, v6}, Lm0/c;-><init>(Landroid/net/Uri;Z)V

    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v3

    goto :goto_1

    :cond_1
    :try_start_2
    invoke-static {v2, p0}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    goto :goto_4

    :catch_0
    move-exception v2

    goto :goto_2

    :goto_1
    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v4

    :try_start_4
    invoke-static {v2, v3}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    :try_start_5
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_3
    invoke-static {v1, p0}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v0

    :goto_4
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {v1, p0}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final e(II)V
    .locals 3

    if-gt p0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "toIndex ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ") is greater than size ("

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final f(Landroid/content/Context;Lm0/a;)Ln0/s;
    .locals 30

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    const/4 v0, 0x3

    const-string v1, "context.applicationContext"

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x1

    const-string v3, "context"

    invoke-static {v7, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Lv0/i;

    iget-object v4, v8, Lm0/a;->b:Ljava/util/concurrent/ExecutorService;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    new-instance v5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v5, v12, Lv0/i;->d:Ljava/lang/Object;

    new-instance v5, Ly0/a;

    invoke-direct {v5, v12}, Ly0/a;-><init>(Lv0/i;)V

    iput-object v5, v12, Lv0/i;->e:Ljava/lang/Object;

    new-instance v5, Lf/B;

    invoke-direct {v5, v4}, Lf/B;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v5, v12, Lv0/i;->b:Ljava/lang/Object;

    new-instance v4, Le2/K;

    invoke-direct {v4, v5}, Le2/K;-><init>(Lf/B;)V

    iput-object v4, v12, Lv0/i;->c:Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v12, Lv0/i;->b:Ljava/lang/Object;

    check-cast v5, Lf/B;

    const-string v6, "workTaskExecutor.serialTaskExecutor"

    invoke-static {v5, v6}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v13, 0x7f040006

    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v6

    iget-object v13, v8, Lm0/a;->c:Lm0/r;

    const-string v14, "clock"

    invoke-static {v13, v14}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x0

    if-eqz v6, :cond_0

    new-instance v6, La0/i;

    invoke-direct {v6, v4, v14}, La0/i;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-boolean v11, v6, La0/i;->j:Z

    goto :goto_0

    :cond_0
    const-string v6, "androidx.work.workdb"

    invoke-static {v6}, Ld2/l;->R(Ljava/lang/String;)Z

    move-result v15

    xor-int/2addr v15, v11

    if-eqz v15, :cond_26

    new-instance v15, La0/i;

    invoke-direct {v15, v4, v6}, La0/i;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v6, LB2/b;

    invoke-direct {v6, v4}, LB2/b;-><init>(Ljava/lang/Object;)V

    iput-object v6, v15, La0/i;->i:Le0/b;

    move-object v6, v15

    :goto_0
    iput-object v5, v6, La0/i;->g:Ljava/util/concurrent/Executor;

    new-instance v5, Ln0/b;

    invoke-direct {v5, v13}, Ln0/b;-><init>(Lm0/r;)V

    iget-object v13, v6, La0/i;->d:Ljava/util/ArrayList;

    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-array v5, v11, [Lb0/a;

    sget-object v15, Ln0/d;->h:Ln0/d;

    aput-object v15, v5, v10

    invoke-virtual {v6, v5}, La0/i;->a([Lb0/a;)V

    new-instance v5, Ln0/h;

    invoke-direct {v5, v4, v9, v0}, Ln0/h;-><init>(Landroid/content/Context;II)V

    new-array v15, v11, [Lb0/a;

    aput-object v5, v15, v10

    invoke-virtual {v6, v15}, La0/i;->a([Lb0/a;)V

    new-array v5, v11, [Lb0/a;

    sget-object v15, Ln0/d;->i:Ln0/d;

    aput-object v15, v5, v10

    invoke-virtual {v6, v5}, La0/i;->a([Lb0/a;)V

    new-array v5, v11, [Lb0/a;

    sget-object v15, Ln0/d;->j:Ln0/d;

    aput-object v15, v5, v10

    invoke-virtual {v6, v5}, La0/i;->a([Lb0/a;)V

    new-instance v5, Ln0/h;

    const/4 v15, 0x5

    const/4 v14, 0x6

    invoke-direct {v5, v4, v15, v14}, Ln0/h;-><init>(Landroid/content/Context;II)V

    new-array v14, v11, [Lb0/a;

    aput-object v5, v14, v10

    invoke-virtual {v6, v14}, La0/i;->a([Lb0/a;)V

    new-array v5, v11, [Lb0/a;

    sget-object v14, Ln0/d;->k:Ln0/d;

    aput-object v14, v5, v10

    invoke-virtual {v6, v5}, La0/i;->a([Lb0/a;)V

    new-array v5, v11, [Lb0/a;

    sget-object v14, Ln0/d;->l:Ln0/d;

    aput-object v14, v5, v10

    invoke-virtual {v6, v5}, La0/i;->a([Lb0/a;)V

    new-array v5, v11, [Lb0/a;

    sget-object v14, Ln0/d;->m:Ln0/d;

    aput-object v14, v5, v10

    invoke-virtual {v6, v5}, La0/i;->a([Lb0/a;)V

    new-instance v5, Ln0/h;

    invoke-direct {v5, v4}, Ln0/h;-><init>(Landroid/content/Context;)V

    new-array v14, v11, [Lb0/a;

    aput-object v5, v14, v10

    invoke-virtual {v6, v14}, La0/i;->a([Lb0/a;)V

    new-instance v5, Ln0/h;

    const/16 v14, 0xa

    const/16 v15, 0xb

    invoke-direct {v5, v4, v14, v15}, Ln0/h;-><init>(Landroid/content/Context;II)V

    new-array v4, v11, [Lb0/a;

    aput-object v5, v4, v10

    invoke-virtual {v6, v4}, La0/i;->a([Lb0/a;)V

    new-array v4, v11, [Lb0/a;

    sget-object v5, Ln0/d;->d:Ln0/d;

    aput-object v5, v4, v10

    invoke-virtual {v6, v4}, La0/i;->a([Lb0/a;)V

    new-array v4, v11, [Lb0/a;

    sget-object v5, Ln0/d;->e:Ln0/d;

    aput-object v5, v4, v10

    invoke-virtual {v6, v4}, La0/i;->a([Lb0/a;)V

    new-array v4, v11, [Lb0/a;

    sget-object v5, Ln0/d;->f:Ln0/d;

    aput-object v5, v4, v10

    invoke-virtual {v6, v4}, La0/i;->a([Lb0/a;)V

    new-array v4, v11, [Lb0/a;

    sget-object v5, Ln0/d;->g:Ln0/d;

    aput-object v5, v4, v10

    invoke-virtual {v6, v4}, La0/i;->a([Lb0/a;)V

    iput-boolean v10, v6, La0/i;->l:Z

    iput-boolean v11, v6, La0/i;->m:Z

    iget-object v4, v6, La0/i;->g:Ljava/util/concurrent/Executor;

    if-nez v4, :cond_1

    iget-object v5, v6, La0/i;->h:Ljava/util/concurrent/Executor;

    if-nez v5, :cond_1

    sget-object v4, Ll/a;->d:LX/e;

    iput-object v4, v6, La0/i;->h:Ljava/util/concurrent/Executor;

    iput-object v4, v6, La0/i;->g:Ljava/util/concurrent/Executor;

    goto :goto_1

    :cond_1
    if-eqz v4, :cond_2

    iget-object v5, v6, La0/i;->h:Ljava/util/concurrent/Executor;

    if-nez v5, :cond_2

    iput-object v4, v6, La0/i;->h:Ljava/util/concurrent/Executor;

    goto :goto_1

    :cond_2
    if-nez v4, :cond_3

    iget-object v4, v6, La0/i;->h:Ljava/util/concurrent/Executor;

    iput-object v4, v6, La0/i;->g:Ljava/util/concurrent/Executor;

    :cond_3
    :goto_1
    iget-object v4, v6, La0/i;->q:Ljava/util/HashSet;

    iget-object v5, v6, La0/i;->p:Ljava/util/LinkedHashSet;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v5, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    xor-int/2addr v15, v11

    if-eqz v15, :cond_4

    goto :goto_2

    :cond_4
    const-string v0, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "

    invoke-static {v0, v14}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    iget-object v4, v6, La0/i;->i:Le0/b;

    if-nez v4, :cond_6

    new-instance v4, Ld1/e;

    invoke-direct {v4, v0}, Ld1/e;-><init>(I)V

    :cond_6
    move-object/from16 v18, v4

    iget-wide v14, v6, La0/i;->n:J

    const-wide/16 v19, 0x0

    cmp-long v4, v14, v19

    const-string v14, "Required value was null."

    if-lez v4, :cond_8

    iget-object v0, v6, La0/i;->c:Ljava/lang/String;

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot create auto-closing database for an in-memory database."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v4, La0/b;

    iget-boolean v15, v6, La0/i;->j:Z

    iget v9, v6, La0/i;->k:I

    if-eqz v9, :cond_25

    iget-object v10, v6, La0/i;->a:Landroid/content/Context;

    invoke-static {v10, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq v9, v11, :cond_9

    move/from16 v22, v9

    goto :goto_3

    :cond_9
    const-string v3, "activity"

    invoke-virtual {v10, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v9, "null cannot be cast to non-null type android.app.ActivityManager"

    invoke-static {v3, v9}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/app/ActivityManager;

    invoke-virtual {v3}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v3

    if-nez v3, :cond_a

    move/from16 v22, v0

    goto :goto_3

    :cond_a
    const/16 v22, 0x2

    :goto_3
    iget-object v3, v6, La0/i;->g:Ljava/util/concurrent/Executor;

    if-eqz v3, :cond_24

    iget-object v9, v6, La0/i;->h:Ljava/util/concurrent/Executor;

    if-eqz v9, :cond_23

    iget-boolean v14, v6, La0/i;->l:Z

    iget-boolean v0, v6, La0/i;->m:Z

    iget-object v2, v6, La0/i;->e:Ljava/util/ArrayList;

    iget-object v11, v6, La0/i;->f:Ljava/util/ArrayList;

    iget-object v7, v6, La0/i;->c:Ljava/lang/String;

    iget-object v8, v6, La0/i;->o:LA/h;

    move/from16 v21, v15

    move-object v15, v4

    move-object/from16 v16, v10

    move-object/from16 v17, v7

    move-object/from16 v19, v8

    move-object/from16 v20, v13

    move-object/from16 v23, v3

    move-object/from16 v24, v9

    move/from16 v25, v14

    move/from16 v26, v0

    move-object/from16 v27, v5

    move-object/from16 v28, v2

    move-object/from16 v29, v11

    invoke-direct/range {v15 .. v29}, La0/b;-><init>(Landroid/content/Context;Ljava/lang/String;Le0/b;LA/h;Ljava/util/ArrayList;ZILjava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLjava/util/LinkedHashSet;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    const-string v0, ".canonicalName"

    const-string v2, "klass"

    iget-object v3, v6, La0/i;->b:Ljava/lang/Class;

    invoke-static {v3, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v2

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LX1/g;->b(Ljava/lang/Object;)V

    const-string v6, "fullPackage"

    invoke-static {v2, v6}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_b

    goto :goto_4

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x1

    add-int/2addr v6, v7

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "this as java.lang.String).substring(startIndex)"

    invoke-static {v5, v6}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_4
    const/16 v6, 0x2e

    const/16 v7, 0x5f

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v5

    const-string v7, "replace(...)"

    invoke-static {v5, v7}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "_Impl"

    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_c

    move-object v2, v5

    goto :goto_5

    :cond_c
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_5
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    const/4 v7, 0x1

    invoke-static {v2, v7, v6}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const-string v6, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>"

    invoke-static {v2, v6}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v7, v0

    check-cast v7, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7, v4}, Landroidx/work/impl/WorkDatabase;->e(La0/b;)Le0/c;

    move-result-object v0

    iput-object v0, v7, Landroidx/work/impl/WorkDatabase;->c:Le0/c;

    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->i()Ljava/util/Set;

    move-result-object v0

    new-instance v2, Ljava/util/BitSet;

    invoke-direct {v2}, Ljava/util/BitSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v5, v7, Landroidx/work/impl/WorkDatabase;->g:Ljava/util/LinkedHashMap;

    iget-object v6, v4, La0/b;->n:Ljava/util/List;

    if-eqz v3, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, -0x1

    add-int/2addr v8, v9

    if-ltz v8, :cond_f

    :goto_7
    add-int/lit8 v10, v8, -0x1

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-virtual {v2, v8}, Ljava/util/BitSet;->set(I)V

    goto :goto_9

    :cond_d
    if-gez v10, :cond_e

    goto :goto_8

    :cond_e
    move v8, v10

    const/4 v9, -0x1

    goto :goto_7

    :cond_f
    :goto_8
    const/4 v8, -0x1

    :goto_9
    if-ltz v8, :cond_10

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "A required auto migration spec ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") is missing in the database configuration."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, -0x1

    add-int/2addr v0, v3

    if-ltz v0, :cond_14

    :goto_a
    add-int/lit8 v6, v0, -0x1

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_13

    if-gez v6, :cond_12

    goto :goto_b

    :cond_12
    move v0, v6

    const/4 v3, -0x1

    goto :goto_a

    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    :goto_b
    invoke-virtual {v7, v5}, Landroidx/work/impl/WorkDatabase;->g(Ljava/util/LinkedHashMap;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_15
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb0/a;

    iget v3, v2, Lb0/a;->a:I

    iget-object v5, v4, La0/b;->d:LA/h;

    iget-object v6, v5, LA/h;->c:Ljava/lang/Object;

    check-cast v6, Ljava/util/LinkedHashMap;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    if-nez v3, :cond_16

    sget-object v3, LL1/u;->b:LL1/u;

    :cond_16
    iget v6, v2, Lb0/a;->b:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    :cond_17
    filled-new-array {v2}, [Lb0/a;

    move-result-object v2

    invoke-virtual {v5, v2}, LA/h;->p([Lb0/a;)V

    goto :goto_c

    :cond_18
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v0

    const-class v2, La0/k;

    invoke-static {v2, v0}, Landroidx/work/impl/WorkDatabase;->r(Ljava/lang/Class;Le0/c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La0/k;

    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v0

    const-class v2, La0/a;

    invoke-static {v2, v0}, Landroidx/work/impl/WorkDatabase;->r(Ljava/lang/Class;Le0/c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La0/a;

    iget v0, v4, La0/b;->g:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_19

    const/4 v0, 0x1

    goto :goto_d

    :cond_19
    const/4 v0, 0x0

    :goto_d
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v2

    invoke-interface {v2, v0}, Le0/c;->setWriteAheadLoggingEnabled(Z)V

    iget-object v0, v4, La0/b;->e:Ljava/util/List;

    iput-object v0, v7, Landroidx/work/impl/WorkDatabase;->f:Ljava/util/List;

    iget-object v0, v4, La0/b;->h:Ljava/util/concurrent/Executor;

    iput-object v0, v7, Landroidx/work/impl/WorkDatabase;->b:Ljava/util/concurrent/Executor;

    const-string v0, "executor"

    iget-object v2, v4, La0/b;->i:Ljava/util/concurrent/Executor;

    invoke-static {v2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iget-boolean v0, v4, La0/b;->f:Z

    iput-boolean v0, v7, Landroidx/work/impl/WorkDatabase;->e:Z

    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->j()Ljava/util/Map;

    move-result-object v0

    new-instance v2, Ljava/util/BitSet;

    invoke-direct {v2}, Ljava/util/BitSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v5, v4, La0/b;->m:Ljava/util/List;

    if-eqz v3, :cond_1f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Class;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, -0x1

    add-int/2addr v9, v10

    if-ltz v9, :cond_1d

    :goto_f
    add-int/lit8 v11, v9, -0x1

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_1b

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->set(I)V

    goto :goto_11

    :cond_1b
    if-gez v11, :cond_1c

    goto :goto_10

    :cond_1c
    move v9, v11

    const/4 v10, -0x1

    goto :goto_f

    :cond_1d
    :goto_10
    const/4 v9, -0x1

    :goto_11
    if-ltz v9, :cond_1e

    iget-object v10, v7, Landroidx/work/impl/WorkDatabase;->j:Ljava/util/LinkedHashMap;

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v10, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_1e
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "A required type converter ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is missing in the database configuration."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1f
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, -0x1

    add-int/2addr v0, v3

    if-ltz v0, :cond_22

    :goto_12
    add-int/lit8 v4, v0, -0x1

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v6

    if-eqz v6, :cond_21

    if-gez v4, :cond_20

    goto :goto_13

    :cond_20
    move v0, v4

    goto :goto_12

    :cond_21
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected type converter "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_22
    :goto_13
    new-instance v8, Lv0/i;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lt0/a;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "taskExecutor"

    invoke-static {v12, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-direct {v2, v3, v12, v5}, Lt0/a;-><init>(Landroid/content/Context;Lv0/i;I)V

    new-instance v3, Lt0/a;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    invoke-direct {v3, v5, v12, v6}, Lt0/a;-><init>(Landroid/content/Context;Lv0/i;I)V

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget v6, Lt0/i;->a:I

    invoke-static {v12, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lt0/h;

    invoke-direct {v6, v5, v12}, Lt0/h;-><init>(Landroid/content/Context;Lv0/i;)V

    new-instance v5, Lt0/a;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-direct {v5, v0, v12, v1}, Lt0/a;-><init>(Landroid/content/Context;Lv0/i;I)V

    invoke-static {v12, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iput-object v2, v8, Lv0/i;->b:Ljava/lang/Object;

    iput-object v3, v8, Lv0/i;->c:Ljava/lang/Object;

    iput-object v6, v8, Lv0/i;->d:Ljava/lang/Object;

    iput-object v5, v8, Lv0/i;->e:Ljava/lang/Object;

    new-instance v9, Ln0/g;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v10, p1

    invoke-direct {v9, v0, v10, v12, v7}, Ln0/g;-><init>(Landroid/content/Context;Lm0/a;Lv0/i;Landroidx/work/impl/WorkDatabase;)V

    sget v0, Ln0/l;->a:I

    new-instance v11, Lq0/b;

    move-object/from16 v13, p0

    invoke-direct {v11, v13, v7, v10}, Lq0/b;-><init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lm0/a;)V

    const-class v0, Landroidx/work/impl/background/systemjob/SystemJobService;

    const/4 v1, 0x1

    invoke-static {v13, v0, v1}, Lw0/m;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v14, Lo0/c;

    new-instance v5, Lv0/c;

    invoke-direct {v5, v9, v12}, Lv0/c;-><init>(Ln0/g;Lv0/i;)V

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v8

    move-object v4, v9

    move-object v6, v12

    invoke-direct/range {v0 .. v6}, Lo0/c;-><init>(Landroid/content/Context;Lm0/a;Lv0/i;Ln0/g;Lv0/c;Lv0/i;)V

    const/4 v0, 0x2

    new-array v0, v0, [Ln0/i;

    const/4 v1, 0x0

    aput-object v11, v0, v1

    const/4 v1, 0x1

    aput-object v14, v0, v1

    invoke-static {v0}, LL1/l;->R([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v11, Ln0/s;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    move-object v0, v11

    move-object/from16 v2, p1

    move-object v3, v12

    move-object v4, v7

    move-object v6, v9

    move-object v7, v8

    invoke-direct/range {v0 .. v7}, Ln0/s;-><init>(Landroid/content/Context;Lm0/a;Lv0/i;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Ln0/g;Lv0/i;)V

    return-object v11

    :catch_0
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Failed to create an instance of "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_1
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Cannot access the constructor "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_2
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot find implementation for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " does not exist"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    const/4 v0, 0x0

    throw v0

    :cond_26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static g(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 5

    sget-object v0, LJ/T;->a:Ljava/util/WeakHashMap;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    goto/16 :goto_2

    :cond_0
    sget-object v0, LJ/S;->d:Ljava/util/ArrayList;

    const v0, 0x7f08018d

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ/S;

    const/4 v3, 0x0

    if-nez v1, :cond_1

    new-instance v1, LJ/S;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, LJ/S;->a:Ljava/util/WeakHashMap;

    iput-object v3, v1, LJ/S;->b:Landroid/util/SparseArray;

    iput-object v3, v1, LJ/S;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_1
    iget-object p0, v1, LJ/S;->c:Ljava/lang/ref/WeakReference;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p1, :cond_2

    goto :goto_2

    :cond_2
    new-instance p0, Ljava/lang/ref/WeakReference;

    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p0, v1, LJ/S;->c:Ljava/lang/ref/WeakReference;

    iget-object p0, v1, LJ/S;->b:Landroid/util/SparseArray;

    if-nez p0, :cond_3

    new-instance p0, Landroid/util/SparseArray;

    invoke-direct {p0}, Landroid/util/SparseArray;-><init>()V

    iput-object p0, v1, LJ/S;->b:Landroid/util/SparseArray;

    :cond_3
    iget-object p0, v1, LJ/S;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v0

    if-ltz v0, :cond_4

    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->removeAt(I)V

    goto :goto_0

    :cond_4
    move-object v4, v3

    :goto_0
    if-nez v4, :cond_5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljava/lang/ref/WeakReference;

    :cond_5
    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    if-eqz p0, :cond_7

    invoke-static {p0}, LJ/E;->b(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_7

    const p1, 0x7f08018e

    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v1

    if-gez p1, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LX/d;->q(Ljava/lang/Object;)V

    throw v3

    :cond_7
    :goto_1
    move v2, v1

    :cond_8
    :goto_2
    return v2
.end method

.method public static h(LJ/k;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_1

    invoke-interface {p0, p3}, LJ/k;->e(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0

    :cond_1
    instance-of v1, p2, Landroid/app/Activity;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_8

    check-cast p2, Landroid/app/Activity;

    invoke-virtual {p2}, Landroid/app/Activity;->onUserInteraction()V

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/Window;->hasFeature(I)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p2}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    move-result-object p1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x52

    if-ne v0, v1, :cond_4

    if-eqz p1, :cond_4

    sget-boolean v0, Lu2/l;->a:Z

    if-nez v0, :cond_2

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onMenuKeyEvent"

    const-class v4, Landroid/view/KeyEvent;

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lu2/l;->b:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sput-boolean v3, Lu2/l;->a:Z

    :cond_2
    sget-object v0, Lu2/l;->b:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_4

    :try_start_1
    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz p1, :cond_4

    goto :goto_1

    :catch_1
    :cond_4
    :goto_0
    invoke-virtual {p0, p3}, Landroid/view/Window;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    invoke-static {p0, p3}, LJ/T;->b(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_1

    :cond_6
    if-eqz p0, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v2

    :cond_7
    invoke-virtual {p3, p2, v2, p2}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z

    move-result v3

    :goto_1
    return v3

    :cond_8
    instance-of v1, p2, Landroid/app/Dialog;

    if-eqz v1, :cond_f

    check-cast p2, Landroid/app/Dialog;

    sget-boolean p0, Lu2/l;->c:Z

    if-nez p0, :cond_9

    :try_start_2
    const-class p0, Landroid/app/Dialog;

    const-string p1, "mOnKeyListener"

    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    sput-object p0, Lu2/l;->d:Ljava/lang/reflect/Field;

    invoke-virtual {p0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-boolean v3, Lu2/l;->c:Z

    :cond_9
    sget-object p0, Lu2/l;->d:Ljava/lang/reflect/Field;

    if-eqz p0, :cond_a

    :try_start_3
    invoke-virtual {p0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/DialogInterface$OnKeyListener;
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_2

    :catch_3
    :cond_a
    move-object p0, v2

    :goto_2
    if-eqz p0, :cond_b

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-interface {p0, p2, p1, p3}, Landroid/content/DialogInterface$OnKeyListener;->onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_b

    goto :goto_3

    :cond_b
    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, p3}, Landroid/view/Window;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_3

    :cond_c
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    invoke-static {p0, p3}, LJ/T;->b(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_3

    :cond_d
    if-eqz p0, :cond_e

    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v2

    :cond_e
    invoke-virtual {p3, p2, v2, p2}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z

    move-result v3

    :goto_3
    return v3

    :cond_f
    if-eqz p1, :cond_10

    invoke-static {p1, p3}, LJ/T;->b(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p1

    if-nez p1, :cond_11

    :cond_10
    invoke-interface {p0, p3}, LJ/k;->e(Landroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_12

    :cond_11
    move v0, v3

    :cond_12
    return v0
.end method

.method public static final i(J)Ljava/lang/String;
    .locals 12

    const-wide/32 v0, -0x3b9328e0

    cmp-long v0, p0, v0

    const-string v1, " s "

    const v2, 0x3b9aca00

    const v3, 0x1dcd6500

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v3, v3

    sub-long/2addr p0, v3

    int-to-long v2, v2

    div-long/2addr p0, v2

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0

    :cond_0
    const-wide/32 v4, -0xf404c

    cmp-long v0, p0, v4

    const-string v4, " ms"

    const v5, 0xf4240

    const v6, 0x7a120

    if-gtz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v6

    sub-long/2addr p0, v1

    int-to-long v1, v5

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-wide/16 v7, 0x0

    cmp-long v0, p0, v7

    const-string v7, " \u00b5s"

    const/16 v8, 0x3e8

    const/16 v9, 0x1f4

    if-gtz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v9

    sub-long/2addr p0, v1

    int-to-long v1, v8

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-wide/32 v10, 0xf404c

    cmp-long v0, p0, v10

    if-gez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v9

    add-long/2addr p0, v1

    int-to-long v1, v8

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    const-wide/32 v7, 0x3b9328e0

    cmp-long v0, p0, v7

    if-gez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v6

    add-long/2addr p0, v1

    int-to-long v1, v5

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v3, v3

    add-long/2addr p0, v3

    int-to-long v2, v2

    div-long/2addr p0, v2

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    const/4 p1, 0x1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%6s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/String;)Lm2/n;
    .locals 9

    sget-object v0, Lm2/n;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v1

    const/16 v2, 0x22

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "typeSubtype.group(1)"

    invoke-static {v3, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "US"

    invoke-static {v4, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v3, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "typeSubtype.group(2)"

    invoke-static {v6, v7}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, Lm2/n;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v5, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x0

    if-ge v0, v6, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v5, v0, v6}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v5, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    const/4 v6, 0x3

    invoke-virtual {v5, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    const-string v8, "\'"

    invoke-static {v6, v8, v7}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-static {v6, v8}, Ld2/l;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-le v7, v3, :cond_2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v7, v1

    invoke-virtual {v6, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v6, v7}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_1
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Parameter is not formatted correctly: \""

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "this as java.lang.String).substring(startIndex)"

    invoke-static {v0, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" for: \""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Lm2/n;

    new-array v1, v7, [Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lm2/n;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No subtype found for: \""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static k(Landroid/content/Context;II)I
    .locals 0

    invoke-static {p0, p1}, Lu2/d;->z(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object p1

    if-eqz p1, :cond_1

    iget p2, p1, Landroid/util/TypedValue;->resourceId:I

    if-eqz p2, :cond_0

    invoke-static {p0, p2}, Ly/d;->a(Landroid/content/Context;I)I

    move-result p0

    goto :goto_0

    :cond_0
    iget p0, p1, Landroid/util/TypedValue;->data:I

    :goto_0
    return p0

    :cond_1
    return p2
.end method

.method public static l(Landroid/view/View;I)I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p1, p0}, Lu2/d;->B(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;

    move-result-object p0

    iget p1, p0, Landroid/util/TypedValue;->resourceId:I

    if-eqz p1, :cond_0

    invoke-static {v0, p1}, Ly/d;->a(Landroid/content/Context;I)I

    move-result p0

    goto :goto_0

    :cond_0
    iget p0, p0, Landroid/util/TypedValue;->data:I

    :goto_0
    return p0
.end method

.method public static m(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;
    .locals 1

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Ly/f;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static n(Landroid/content/Context;Lv0/m;I)Landroid/content/res/ColorStateList;
    .locals 2

    iget-object v0, p1, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Ly/f;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1, p2}, Lv0/m;->q(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static p(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, La/a;->s(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static q(I[Ljava/lang/String;)F
    .locals 2

    aget-object p0, p1, p0

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    const/4 p1, 0x0

    cmpg-float p1, p0, p1

    if-ltz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float p1, p0, p1

    if-gtz p1, :cond_0

    return p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Motion easing control point value must be between 0 and 1; instead got: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final r(I)I
    .locals 3

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-ne p0, v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Could not convert "

    const-string v2, " to BackoffPolicy"

    invoke-static {v1, p0, v2}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return v0
.end method

.method public static final s(I)I
    .locals 3

    const/4 v0, 0x1

    if-eqz p0, :cond_2

    const/4 v1, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v1, :cond_2

    const/4 v1, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v1, :cond_2

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    if-ne p0, v0, :cond_0

    const/4 p0, 0x6

    return p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Could not convert "

    const-string v2, " to NetworkType"

    invoke-static {v1, p0, v2}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move v0, v1

    :cond_2
    return v0
.end method

.method public static final t(I)I
    .locals 3

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-ne p0, v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Could not convert "

    const-string v2, " to OutOfQuotaPolicy"

    invoke-static {v1, p0, v2}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return v0
.end method

.method public static final u(I)I
    .locals 3

    const/4 v0, 0x1

    if-eqz p0, :cond_2

    const/4 v1, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v1, :cond_2

    const/4 v1, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v1, :cond_2

    if-ne p0, v0, :cond_0

    const/4 v0, 0x6

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Could not convert "

    const-string v2, " to State"

    invoke-static {v1, p0, v2}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move v0, v1

    :cond_2
    :goto_0
    return v0
.end method

.method public static v(I)Z
    .locals 20

    if-eqz p0, :cond_5

    sget-object v1, LA/a;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [D

    const/4 v3, 0x3

    if-nez v2, :cond_0

    new-array v2, v3, [D

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->red(I)I

    move-result v1

    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->green(I)I

    move-result v4

    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->blue(I)I

    move-result v5

    array-length v6, v2

    if-ne v6, v3, :cond_4

    int-to-double v6, v1

    const-wide v8, 0x406fe00000000000L    # 255.0

    div-double/2addr v6, v8

    const-wide v10, 0x3fa4b5dcc63f1412L    # 0.04045

    cmpg-double v1, v6, v10

    const-wide v12, 0x4003333333333333L    # 2.4

    const-wide v14, 0x3ff0e147ae147ae1L    # 1.055

    const-wide v16, 0x3fac28f5c28f5c29L    # 0.055

    const-wide v18, 0x4029d70a3d70a3d7L    # 12.92

    if-gez v1, :cond_1

    div-double v6, v6, v18

    goto :goto_0

    :cond_1
    add-double v6, v6, v16

    div-double/2addr v6, v14

    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    :goto_0
    int-to-double v3, v4

    div-double/2addr v3, v8

    cmpg-double v1, v3, v10

    if-gez v1, :cond_2

    div-double v3, v3, v18

    goto :goto_1

    :cond_2
    add-double v3, v3, v16

    div-double/2addr v3, v14

    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    :goto_1
    int-to-double v0, v5

    div-double/2addr v0, v8

    cmpg-double v5, v0, v10

    if-gez v5, :cond_3

    div-double v0, v0, v18

    goto :goto_2

    :cond_3
    add-double v0, v0, v16

    div-double/2addr v0, v14

    invoke-static {v0, v1, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    :goto_2
    const-wide v8, 0x3fda64c2f837b4a2L    # 0.4124

    mul-double/2addr v8, v6

    const-wide v10, 0x3fd6e2eb1c432ca5L    # 0.3576

    mul-double/2addr v10, v3

    add-double/2addr v10, v8

    const-wide v8, 0x3fc71a9fbe76c8b4L    # 0.1805

    mul-double/2addr v8, v0

    add-double/2addr v8, v10

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    mul-double/2addr v8, v10

    const/4 v5, 0x0

    aput-wide v8, v2, v5

    const-wide v8, 0x3fcb367a0f9096bcL    # 0.2126

    mul-double/2addr v8, v6

    const-wide v12, 0x3fe6e2eb1c432ca5L    # 0.7152

    mul-double/2addr v12, v3

    add-double/2addr v12, v8

    const-wide v8, 0x3fb27bb2fec56d5dL    # 0.0722

    mul-double/2addr v8, v0

    add-double/2addr v8, v12

    mul-double/2addr v8, v10

    const/4 v12, 0x1

    aput-wide v8, v2, v12

    const-wide v13, 0x3f93c36113404ea5L    # 0.0193

    mul-double/2addr v6, v13

    const-wide v13, 0x3fbe83e425aee632L    # 0.1192

    mul-double/2addr v3, v13

    add-double/2addr v3, v6

    const-wide v6, 0x3fee6a7ef9db22d1L    # 0.9505

    mul-double/2addr v0, v6

    add-double/2addr v0, v3

    mul-double/2addr v0, v10

    const/4 v3, 0x2

    aput-wide v0, v2, v3

    div-double/2addr v8, v10

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v8, v0

    if-lez v0, :cond_6

    move v0, v12

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "outXyz must have a length of 3."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const/4 v5, 0x0

    :cond_6
    move v0, v5

    :goto_3
    return v0
.end method

.method public static w(Landroid/widget/EditText;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static x(Landroid/content/Context;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->fontScale:F

    const v0, 0x3fa66666    # 1.3f

    cmpl-float p0, p0, v0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static y(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "("

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, ")"

    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static z(IIF)I
    .locals 1

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-static {p1, p2}, LA/a;->d(II)I

    move-result p1

    invoke-static {p1, p0}, LA/a;->b(II)I

    move-result p0

    return p0
.end method


# virtual methods
.method public abstract d(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
.end method

.method public abstract o(LU0/u;FF)V
.end method
