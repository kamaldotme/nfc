.class public abstract Ln2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B

.field public static final b:Lm2/j;

.field public static final c:Lm2/s;

.field public static final d:Ljava/util/TimeZone;

.field public static final e:LX1/j;

.field public static final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    const/4 v0, 0x1

    const/4 v1, 0x0

    new-array v2, v1, [B

    sput-object v2, Ln2/b;->a:[B

    new-array v3, v1, [Ljava/lang/String;

    invoke-static {v3}, Lu2/d;->v([Ljava/lang/String;)Lm2/j;

    move-result-object v3

    sput-object v3, Ln2/b;->b:Lm2/j;

    new-instance v3, Lz2/f;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v1, v1, v2}, Lz2/f;->I(II[B)V

    int-to-long v8, v1

    new-instance v2, Lm2/s;

    invoke-direct {v2, v8, v9, v3, v1}, Lm2/s;-><init>(JLz2/h;I)V

    sput-object v2, Ln2/b;->c:Lm2/s;

    move-wide v4, v8

    move-wide v6, v8

    invoke-static/range {v4 .. v9}, Ln2/b;->b(JJJ)V

    sget-object v2, Lz2/i;->e:Lz2/i;

    const-string v2, "efbbbf"

    invoke-static {v2}, Ld1/e;->h(Ljava/lang/String;)Lz2/i;

    move-result-object v2

    const-string v3, "feff"

    invoke-static {v3}, Ld1/e;->h(Ljava/lang/String;)Lz2/i;

    move-result-object v3

    const-string v4, "fffe"

    invoke-static {v4}, Ld1/e;->h(Ljava/lang/String;)Lz2/i;

    move-result-object v4

    const-string v5, "0000ffff"

    invoke-static {v5}, Ld1/e;->h(Ljava/lang/String;)Lz2/i;

    move-result-object v5

    const-string v6, "ffff0000"

    invoke-static {v6}, Ld1/e;->h(Ljava/lang/String;)Lz2/i;

    move-result-object v6

    filled-new-array {v2, v3, v4, v5, v6}, [Lz2/i;

    move-result-object v2

    new-instance v7, Ljava/util/ArrayList;

    new-instance v3, LL1/h;

    invoke-direct {v3, v2, v1}, LL1/h;-><init>([Ljava/lang/Object;Z)V

    invoke-direct {v7, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-le v3, v0, :cond_0

    invoke-static {v7}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    const/4 v11, 0x5

    invoke-direct {v3, v11}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v1

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v11, :cond_1

    aget-object v6, v2, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v0

    goto :goto_0

    :cond_1
    new-array v4, v1, [Ljava/lang/Integer;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/Integer;

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const-string v4, "elements"

    invoke-static {v3, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v3

    if-nez v4, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v10, v3

    goto :goto_1

    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    new-instance v6, LL1/h;

    invoke-direct {v6, v3, v0}, LL1/h;-><init>([Ljava/lang/Object;Z)V

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v10, v4

    :goto_1
    move v3, v1

    move v4, v3

    :goto_2
    if-ge v3, v11, :cond_b

    aget-object v6, v2, v3

    add-int/lit8 v8, v4, 0x1

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v12

    const-string v13, ")."

    if-ltz v9, :cond_a

    if-gt v9, v12, :cond_9

    sub-int/2addr v9, v0

    move v12, v1

    :goto_3
    if-gt v12, v9, :cond_7

    add-int v13, v12, v9

    ushr-int/2addr v13, v0

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Comparable;

    if-ne v14, v6, :cond_3

    move v14, v1

    goto :goto_4

    :cond_3
    if-nez v14, :cond_4

    move v14, v5

    goto :goto_4

    :cond_4
    if-nez v6, :cond_5

    move v14, v0

    goto :goto_4

    :cond_5
    invoke-interface {v14, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v14

    :goto_4
    if-gez v14, :cond_6

    add-int/lit8 v12, v13, 0x1

    goto :goto_3

    :cond_6
    if-lez v14, :cond_8

    add-int/lit8 v9, v13, -0x1

    goto :goto_3

    :cond_7
    add-int/2addr v12, v0

    neg-int v13, v12

    :cond_8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v10, v13, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/2addr v3, v0

    move v4, v8

    goto :goto_2

    :cond_9
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "toIndex ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") is greater than size ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "fromIndex (0) is greater than toIndex ("

    invoke-static {v1, v9, v13}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz2/i;

    invoke-virtual {v3}, Lz2/i;->c()I

    move-result v3

    if-lez v3, :cond_12

    move v3, v1

    :goto_5
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_f

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz2/i;

    add-int/lit8 v5, v3, 0x1

    move v6, v5

    :goto_6
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v6, v8, :cond_e

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lz2/i;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v9, "prefix"

    invoke-static {v4, v9}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lz2/i;->c()I

    move-result v9

    invoke-virtual {v8, v4, v9}, Lz2/i;->h(Lz2/i;I)Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-virtual {v8}, Lz2/i;->c()I

    move-result v9

    invoke-virtual {v4}, Lz2/i;->c()I

    move-result v12

    if-eq v9, v12, :cond_d

    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    if-le v8, v9, :cond_c

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-interface {v10, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_6

    :cond_c
    add-int/2addr v6, v0

    goto :goto_6

    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "duplicate option: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    move v3, v5

    goto :goto_5

    :cond_f
    new-instance v12, Lz2/f;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const/4 v6, 0x0

    move-object v5, v12

    invoke-static/range {v3 .. v10}, Lu2/d;->b(JLz2/f;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    iget-wide v3, v12, Lz2/f;->c:J

    const/4 v5, 0x4

    int-to-long v5, v5

    div-long/2addr v3, v5

    long-to-int v3, v3

    new-array v3, v3, [I

    move v4, v1

    :goto_7
    invoke-virtual {v12}, Lz2/f;->v()Z

    move-result v5

    if-nez v5, :cond_10

    add-int/lit8 v5, v4, 0x1

    invoke-virtual {v12}, Lz2/f;->H()I

    move-result v6

    aput v6, v3, v4

    move v4, v5

    goto :goto_7

    :cond_10
    new-instance v3, Lz2/n;

    invoke-static {v2, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v4, "copyOf(this, size)"

    invoke-static {v2, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, [Lz2/i;

    invoke-direct {v3, v2}, Lz2/n;-><init>([Lz2/i;)V

    const-string v2, "GMT"

    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    sput-object v2, Ln2/b;->d:Ljava/util/TimeZone;

    new-instance v2, LX1/j;

    invoke-direct {v2, v0}, LX1/j;-><init>(I)V

    sput-object v2, Ln2/b;->e:LX1/j;

    const-class v0, Lm2/o;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "okhttp3."

    invoke-static {v0, v2}, Ld2/d;->h0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Client"

    invoke-static {v0, v2}, Ld2/l;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v3, v2

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_11
    sput-object v0, Ln2/b;->f:Ljava/lang/String;

    return-void

    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "the empty byte string is not a supported option"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final a(Lm2/l;Lm2/l;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm2/l;->d:Ljava/lang/String;

    iget-object v1, p1, Lm2/l;->d:Ljava/lang/String;

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lm2/l;->e:I

    iget v1, p1, Lm2/l;->e:I

    if-ne v0, v1, :cond_0

    iget-object p0, p0, Lm2/l;->a:Ljava/lang/String;

    iget-object p1, p1, Lm2/l;->a:Ljava/lang/String;

    invoke-static {p0, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(JJJ)V
    .locals 4

    or-long v0, p2, p4

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    cmp-long v0, p2, p0

    if-gtz v0, :cond_0

    sub-long/2addr p0, p2

    cmp-long p0, p0, p4

    if-ltz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p0
.end method

.method public static final c(Ljava/io/Closeable;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :catch_1
    move-exception p0

    throw p0
.end method

.method public static final d(Ljava/net/Socket;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bio == null"

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    throw p0

    :catch_2
    move-exception p0

    throw p0
.end method

.method public static final e(IILjava/lang/String;Ljava/lang/String;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    if-ge p0, p1, :cond_1

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {p3, v0}, Ld2/d;->W(Ljava/lang/CharSequence;C)Z

    move-result v0

    if-eqz v0, :cond_0

    return p0

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    return p1
.end method

.method public static final f(Ljava/lang/String;CII)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, p1, :cond_0

    return p2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return p3
.end method

.method public static final g(Lz2/v;Ljava/util/concurrent/TimeUnit;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeUnit"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x64

    :try_start_0
    invoke-static {p0, v0, p1}, Ln2/b;->s(Lz2/v;ILjava/util/concurrent/TimeUnit;)Z

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final varargs h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "format"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final i([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    if-eqz p1, :cond_5

    array-length v0, p1

    if-nez v0, :cond_1

    goto :goto_3

    :cond_1
    array-length v0, p0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    aget-object v3, p0, v2

    move v4, v1

    :goto_1
    array-length v5, p1

    const/4 v6, 0x1

    if-ge v4, v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    move v5, v1

    :goto_2
    if-eqz v5, :cond_4

    add-int/lit8 v5, v4, 0x1

    :try_start_0
    aget-object v4, p1, v4
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {p2, v3, v4}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    if-nez v4, :cond_3

    return v6

    :cond_3
    move v4, v5

    goto :goto_1

    :catch_0
    move-exception p0

    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    :goto_3
    return v1
.end method

.method public static final j(Lm2/r;)J
    .locals 2

    const-string v0, "Content-Length"

    iget-object p0, p0, Lm2/r;->g:Lm2/j;

    invoke-virtual {p0, v0}, Lm2/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-wide/16 v0, -0x1

    if-eqz p0, :cond_0

    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-wide v0
.end method

.method public static final varargs k([Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "elements"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LL1/l;->R([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    const-string v0, "unmodifiableList(listOf(*elements.clone()))"

    invoke-static {p0, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final l(Ljava/lang/String;)I
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x1f

    invoke-static {v2, v3}, LX1/g;->f(II)I

    move-result v3

    if-lez v3, :cond_1

    const/16 v3, 0x7f

    invoke-static {v2, v3}, LX1/g;->f(II)I

    move-result v2

    if-ltz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v1

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static final m(IILjava/lang/String;)I
    .locals 2

    :goto_0
    if-ge p0, p1, :cond_5

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0xc

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v1, 0xd

    if-ne v0, v1, :cond_3

    goto :goto_1

    :cond_3
    const/16 v1, 0x20

    if-ne v0, v1, :cond_4

    :goto_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_4
    return p0

    :cond_5
    return p1
.end method

.method public static final n(IILjava/lang/String;)I
    .locals 2

    add-int/lit8 p1, p1, -0x1

    if-gt p0, p1, :cond_5

    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0xc

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v1, 0xd

    if-ne v0, v1, :cond_3

    goto :goto_1

    :cond_3
    const/16 v1, 0x20

    if-ne v0, v1, :cond_4

    :goto_1
    if-eq p1, p0, :cond_5

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_4
    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_5
    return p0
.end method

.method public static final o([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;
    .locals 8

    const-string v0, "other"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, p0, v3

    array-length v5, p1

    move v6, v2

    :goto_1
    if-ge v6, v5, :cond_1

    aget-object v7, p1, v6

    invoke-interface {p2, v4, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    new-array p0, v2, [Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static final p(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Authorization"

    invoke-static {p0, v0}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Cookie"

    invoke-static {p0, v0}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Proxy-Authorization"

    invoke-static {p0, v0}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Set-Cookie"

    invoke-static {p0, v0}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final q(C)I
    .locals 2

    const/16 v0, 0x30

    if-gt v0, p0, :cond_0

    const/16 v1, 0x3a

    if-ge p0, v1, :cond_0

    sub-int/2addr p0, v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x61

    if-gt v0, p0, :cond_1

    const/16 v0, 0x67

    if-ge p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x57

    goto :goto_0

    :cond_1
    const/16 v0, 0x41

    if-gt v0, p0, :cond_2

    const/16 v0, 0x47

    if-ge p0, v0, :cond_2

    add-int/lit8 p0, p0, -0x37

    goto :goto_0

    :cond_2
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method public static final r(Lz2/h;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lz2/h;->E()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    invoke-interface {p0}, Lz2/h;->E()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-interface {p0}, Lz2/h;->E()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static final s(Lz2/v;ILjava/util/concurrent/TimeUnit;)Z
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeUnit"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-interface {p0}, Lz2/v;->c()Lz2/x;

    move-result-object v2

    invoke-virtual {v2}, Lz2/x;->e()Z

    move-result v2

    const-wide v3, 0x7fffffffffffffffL

    if-eqz v2, :cond_0

    invoke-interface {p0}, Lz2/v;->c()Lz2/x;

    move-result-object v2

    invoke-virtual {v2}, Lz2/x;->c()J

    move-result-wide v5

    sub-long/2addr v5, v0

    goto :goto_0

    :cond_0
    move-wide v5, v3

    :goto_0
    invoke-interface {p0}, Lz2/v;->c()Lz2/x;

    move-result-object v2

    int-to-long v7, p1

    invoke-virtual {p2, v7, v8}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    invoke-static {v5, v6, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    add-long/2addr p1, v0

    invoke-virtual {v2, p1, p2}, Lz2/x;->d(J)Lz2/x;

    :try_start_0
    new-instance p1, Lz2/f;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    :goto_1
    const-wide/16 v7, 0x2000

    invoke-interface {p0, p1, v7, v8}, Lz2/v;->z(Lz2/f;J)J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long p2, v7, v9

    if-eqz p2, :cond_1

    iget-wide v7, p1, Lz2/f;->c:J

    invoke-virtual {p1, v7, v8}, Lz2/f;->u(J)V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    cmp-long p1, v5, v3

    if-nez p1, :cond_2

    invoke-interface {p0}, Lz2/v;->c()Lz2/x;

    move-result-object p0

    invoke-virtual {p0}, Lz2/x;->a()Lz2/x;

    goto :goto_2

    :cond_2
    invoke-interface {p0}, Lz2/v;->c()Lz2/x;

    move-result-object p0

    add-long/2addr v0, v5

    invoke-virtual {p0, v0, v1}, Lz2/x;->d(J)Lz2/x;

    :goto_2
    const/4 p0, 0x1

    goto :goto_5

    :catchall_0
    move-exception p1

    cmp-long p2, v5, v3

    if-nez p2, :cond_3

    invoke-interface {p0}, Lz2/v;->c()Lz2/x;

    move-result-object p0

    invoke-virtual {p0}, Lz2/x;->a()Lz2/x;

    goto :goto_3

    :cond_3
    invoke-interface {p0}, Lz2/v;->c()Lz2/x;

    move-result-object p0

    add-long/2addr v0, v5

    invoke-virtual {p0, v0, v1}, Lz2/x;->d(J)Lz2/x;

    :goto_3
    throw p1

    :catch_0
    cmp-long p1, v5, v3

    if-nez p1, :cond_4

    invoke-interface {p0}, Lz2/v;->c()Lz2/x;

    move-result-object p0

    invoke-virtual {p0}, Lz2/x;->a()Lz2/x;

    goto :goto_4

    :cond_4
    invoke-interface {p0}, Lz2/v;->c()Lz2/x;

    move-result-object p0

    add-long/2addr v0, v5

    invoke-virtual {p0, v0, v1}, Lz2/x;->d(J)Lz2/x;

    :goto_4
    const/4 p0, 0x0

    :goto_5
    return p0
.end method

.method public static final t(Ljava/util/List;)Lm2/j;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt2/b;

    iget-object v2, v1, Lt2/b;->a:Lz2/i;

    invoke-virtual {v2}, Lz2/i;->j()Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Lt2/b;->b:Lz2/i;

    invoke-virtual {v1}, Lz2/i;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ld2/d;->n0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lm2/j;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-direct {p0, v0}, Lm2/j;-><init>([Ljava/lang/String;)V

    return-object p0
.end method

.method public static final u(Lm2/l;Z)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ":"

    iget-object v1, p0, Lm2/l;->d:Ljava/lang/String;

    invoke-static {v1, v0}, Ld2/d;->X(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget v0, p0, Lm2/l;->e:I

    if-nez p1, :cond_3

    iget-object p0, p0, Lm2/l;->a:Ljava/lang/String;

    const-string p1, "scheme"

    invoke-static {p0, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "http"

    invoke-static {p0, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p0, 0x50

    goto :goto_0

    :cond_1
    const-string p1, "https"

    invoke-static {p0, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/16 p0, 0x1bb

    goto :goto_0

    :cond_2
    const/4 p0, -0x1

    :goto_0
    if-eq v0, p0, :cond_4

    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3a

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_4
    return-object v1
.end method

.method public static final v(Ljava/util/List;)Ljava/util/List;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    const-string v0, "unmodifiableList(toMutableList())"

    invoke-static {p0, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final w(Ljava/lang/String;I)I
    .locals 2

    if-eqz p0, :cond_2

    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    const p0, 0x7fffffff

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gez v0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    long-to-int p0, p0

    :goto_0
    return p0

    :catch_0
    :cond_2
    return p1
.end method

.method public static final x(IILjava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Ln2/b;->m(IILjava/lang/String;)I

    move-result p0

    invoke-static {p0, p1, p2}, Ln2/b;->n(IILjava/lang/String;)I

    move-result p1

    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p0, p1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
