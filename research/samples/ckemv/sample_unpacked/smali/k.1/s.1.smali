.class public final Lk/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/io/Serializable;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x7

    const/4 v1, 0x0

    iput v1, p0, Lk/s;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v1, 0x7f070072

    const v2, 0x7f070028

    const v3, 0x7f070074

    .line 8
    filled-new-array {v3, v1, v2}, [I

    move-result-object v1

    iput-object v1, p0, Lk/s;->b:Ljava/lang/Object;

    .line 9
    new-array v1, v0, [I

    fill-array-data v1, :array_0

    iput-object v1, p0, Lk/s;->c:Ljava/io/Serializable;

    .line 10
    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lk/s;->d:Ljava/lang/Object;

    const v0, 0x7f070037

    const v1, 0x7f070058

    const v2, 0x7f070059

    .line 11
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Lk/s;->e:Ljava/lang/Object;

    const v0, 0x7f07006b

    const v1, 0x7f070075

    .line 12
    filled-new-array {v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Lk/s;->f:Ljava/lang/Object;

    const v0, 0x7f07002c

    const v1, 0x7f070032

    const v2, 0x7f07002b

    const v3, 0x7f070031

    .line 13
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Lk/s;->g:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x7f070040
        0x7f070063
        0x7f070047
        0x7f070042
        0x7f070043
        0x7f070046
        0x7f070045
    .end array-data

    :array_1
    .array-data 4
        0x7f070071
        0x7f070073
        0x7f070039
        0x7f07006d
        0x7f07006e
        0x7f07006f
        0x7f070070
    .end array-data
.end method

.method public constructor <init>(Lm2/l;Ljava/lang/String;Lm2/j;LX0/o;Ljava/util/Map;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk/s;->a:I

    const-string v0, "method"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lk/s;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lk/s;->c:Ljava/io/Serializable;

    .line 4
    iput-object p3, p0, Lk/s;->d:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, Lk/s;->e:Ljava/lang/Object;

    .line 6
    iput-object p5, p0, Lk/s;->f:Ljava/lang/Object;

    return-void
.end method

.method public static a([II)Z
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p0, v2

    if-ne v3, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 6

    const v0, 0x7f0300e0

    invoke-static {p0, v0}, Lk/c1;->c(Landroid/content/Context;I)I

    move-result v0

    const v1, 0x7f0300dd

    invoke-static {p0, v1}, Lk/c1;->b(Landroid/content/Context;I)I

    move-result p0

    sget-object v1, Lk/c1;->b:[I

    sget-object v2, Lk/c1;->d:[I

    invoke-static {v0, p1}, LA/a;->b(II)I

    move-result v3

    sget-object v4, Lk/c1;->c:[I

    invoke-static {v0, p1}, LA/a;->b(II)I

    move-result v0

    sget-object v5, Lk/c1;->f:[I

    filled-new-array {v1, v2, v4, v5}, [[I

    move-result-object v1

    filled-new-array {p0, v3, v0, p1}, [I

    move-result-object p0

    new-instance p1, Landroid/content/res/ColorStateList;

    invoke-direct {p1, v1, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object p1
.end method

.method public static c(Lk/O0;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    const v2, 0x7f070067

    invoke-virtual {p0, p1, v2}, Lk/O0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const v3, 0x7f070068

    invoke-virtual {p0, p1, v3}, Lk/O0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    instance-of p1, v2, Landroid/graphics/drawable/BitmapDrawable;

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p1

    if-ne p1, p2, :cond_0

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    if-ne p1, p2, :cond_0

    check-cast v2, Landroid/graphics/drawable/BitmapDrawable;

    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-direct {p1, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_0
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p2, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v2, v3, v3, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v4, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    move-object p1, v4

    :goto_0
    sget-object v4, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-virtual {p1, v4}, Landroid/graphics/drawable/BitmapDrawable;->setTileModeX(Landroid/graphics/Shader$TileMode;)V

    instance-of v4, p0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    if-ne v4, p2, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    if-ne v4, p2, :cond_1

    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    goto :goto_1

    :cond_1
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p2, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v3, v3, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p0, v5}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    new-instance p0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {p0, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    :goto_1
    new-instance p2, Landroid/graphics/drawable/LayerDrawable;

    const/4 v4, 0x3

    new-array v4, v4, [Landroid/graphics/drawable/Drawable;

    aput-object v2, v4, v3

    aput-object p0, v4, v1

    aput-object p1, v4, v0

    invoke-direct {p2, v4}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/high16 p0, 0x1020000

    invoke-virtual {p2, v3, p0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    const p0, 0x102000f

    invoke-virtual {p2, v1, p0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    const p0, 0x102000d

    invoke-virtual {p2, v0, p0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    return-object p2
.end method

.method public static f(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    .locals 1

    sget-object v0, Lk/o0;->a:[I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-nez p2, :cond_0

    sget-object p2, Lk/t;->b:Landroid/graphics/PorterDuff$Mode;

    :cond_0
    sget-object v0, Lk/t;->b:Landroid/graphics/PorterDuff$Mode;

    const-class v0, Lk/t;

    monitor-enter v0

    :try_start_0
    invoke-static {p1, p2}, Lk/O0;->g(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 8

    const v0, 0x7f07003c

    if-ne p2, v0, :cond_0

    const p2, 0x7f050015

    invoke-static {p1, p2}, Ly/f;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_0
    const v0, 0x7f07006a

    if-ne p2, v0, :cond_1

    const p2, 0x7f050018

    invoke-static {p1, p2}, Ly/f;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_1
    const v0, 0x7f070069

    const/4 v1, 0x0

    if-ne p2, v0, :cond_3

    const/4 p2, 0x3

    new-array v0, p2, [[I

    new-array p2, p2, [I

    const v2, 0x7f030112

    invoke-static {p1, v2}, Lk/c1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    const/4 v4, 0x2

    const v5, 0x7f0300df

    const/4 v6, 0x1

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v7

    if-eqz v7, :cond_2

    sget-object v2, Lk/c1;->b:[I

    aput-object v2, v0, v1

    invoke-virtual {v3, v2, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    aput v2, p2, v1

    sget-object v1, Lk/c1;->e:[I

    aput-object v1, v0, v6

    invoke-static {p1, v5}, Lk/c1;->c(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v6

    sget-object p1, Lk/c1;->f:[I

    aput-object p1, v0, v4

    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    aput p1, p2, v4

    goto :goto_0

    :cond_2
    sget-object v3, Lk/c1;->b:[I

    aput-object v3, v0, v1

    invoke-static {p1, v2}, Lk/c1;->b(Landroid/content/Context;I)I

    move-result v3

    aput v3, p2, v1

    sget-object v1, Lk/c1;->e:[I

    aput-object v1, v0, v6

    invoke-static {p1, v5}, Lk/c1;->c(Landroid/content/Context;I)I

    move-result v1

    aput v1, p2, v6

    sget-object v1, Lk/c1;->f:[I

    aput-object v1, v0, v4

    invoke-static {p1, v2}, Lk/c1;->c(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v4

    :goto_0
    new-instance p1, Landroid/content/res/ColorStateList;

    invoke-direct {p1, v0, p2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object p1

    :cond_3
    const v0, 0x7f070030

    if-ne p2, v0, :cond_4

    const p2, 0x7f0300dd

    invoke-static {p1, p2}, Lk/c1;->c(Landroid/content/Context;I)I

    move-result p2

    invoke-static {p1, p2}, Lk/s;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_4
    const v0, 0x7f07002a

    if-ne p2, v0, :cond_5

    invoke-static {p1, v1}, Lk/s;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_5
    const v0, 0x7f07002f

    if-ne p2, v0, :cond_6

    const p2, 0x7f0300db

    invoke-static {p1, p2}, Lk/c1;->c(Landroid/content/Context;I)I

    move-result p2

    invoke-static {p1, p2}, Lk/s;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_6
    const v0, 0x7f070065

    if-eq p2, v0, :cond_c

    const v0, 0x7f070066

    if-ne p2, v0, :cond_7

    goto :goto_1

    :cond_7
    iget-object v0, p0, Lk/s;->c:Ljava/io/Serializable;

    check-cast v0, [I

    invoke-static {v0, p2}, Lk/s;->a([II)Z

    move-result v0

    if-eqz v0, :cond_8

    const p2, 0x7f0300e1

    invoke-static {p1, p2}, Lk/c1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_8
    iget-object v0, p0, Lk/s;->f:Ljava/lang/Object;

    check-cast v0, [I

    invoke-static {v0, p2}, Lk/s;->a([II)Z

    move-result v0

    if-eqz v0, :cond_9

    const p2, 0x7f050014

    invoke-static {p1, p2}, Ly/f;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_9
    iget-object v0, p0, Lk/s;->g:Ljava/lang/Object;

    check-cast v0, [I

    invoke-static {v0, p2}, Lk/s;->a([II)Z

    move-result v0

    if-eqz v0, :cond_a

    const p2, 0x7f050013

    invoke-static {p1, p2}, Ly/f;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_a
    const v0, 0x7f070062

    if-ne p2, v0, :cond_b

    const p2, 0x7f050016

    invoke-static {p1, p2}, Ly/f;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_b
    const/4 p1, 0x0

    return-object p1

    :cond_c
    :goto_1
    const p2, 0x7f050017

    invoke-static {p1, p2}, Ly/f;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public e()LG/e;
    .locals 3

    new-instance v0, LG/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LG/e;-><init>(Z)V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, v0, LG/e;->f:Ljava/lang/Object;

    iget-object v1, p0, Lk/s;->b:Ljava/lang/Object;

    check-cast v1, Lm2/l;

    iput-object v1, v0, LG/e;->c:Ljava/lang/Object;

    iget-object v1, p0, Lk/s;->c:Ljava/io/Serializable;

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, LG/e;->b:Ljava/lang/Object;

    iget-object v1, p0, Lk/s;->e:Ljava/lang/Object;

    check-cast v1, LX0/o;

    iput-object v1, v0, LG/e;->e:Ljava/lang/Object;

    iget-object v1, p0, Lk/s;->f:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    move-object v1, v2

    :goto_0
    iput-object v1, v0, LG/e;->f:Ljava/lang/Object;

    iget-object v1, p0, Lk/s;->d:Ljava/lang/Object;

    check-cast v1, Lm2/j;

    invoke-virtual {v1}, Lm2/j;->c()Lf/G;

    move-result-object v1

    iput-object v1, v0, LG/e;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lk/s;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Request{method="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lk/s;->c:Ljava/io/Serializable;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/s;->b:Ljava/lang/Object;

    check-cast v1, Lm2/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/s;->d:Ljava/lang/Object;

    check-cast v1, Lm2/j;

    invoke-virtual {v1}, Lm2/j;->size()I

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, ", headers=["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lm2/j;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    move-object v3, v1

    check-cast v3, LL1/b;

    invoke-virtual {v3}, LL1/b;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, LL1/b;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-ltz v2, :cond_1

    check-cast v3, LK1/c;

    iget-object v5, v3, LK1/c;->b:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v3, v3, LK1/c;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    if-lez v2, :cond_0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v2, v4

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Index overflow has happened."

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lk/s;->f:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_4

    const-string v2, ", tags="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_4
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
