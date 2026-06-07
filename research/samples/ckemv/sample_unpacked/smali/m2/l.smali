.class public final Lm2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:[C


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ljava/util/List;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lm2/l;->j:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/l;->a:Ljava/lang/String;

    iput-object p2, p0, Lm2/l;->b:Ljava/lang/String;

    iput-object p3, p0, Lm2/l;->c:Ljava/lang/String;

    iput-object p4, p0, Lm2/l;->d:Ljava/lang/String;

    iput p5, p0, Lm2/l;->e:I

    iput-object p7, p0, Lm2/l;->f:Ljava/util/List;

    iput-object p8, p0, Lm2/l;->g:Ljava/lang/String;

    iput-object p9, p0, Lm2/l;->h:Ljava/lang/String;

    const-string p2, "https"

    invoke-static {p1, p2}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lm2/l;->i:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lm2/l;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lm2/l;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    const/4 v1, 0x4

    const/16 v2, 0x3a

    iget-object v3, p0, Lm2/l;->h:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v3, v2, v0, v4, v1}, Ld2/d;->b0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x6

    const/16 v2, 0x40

    invoke-static {v3, v2, v4, v4, v1}, Ld2/d;->b0(Ljava/lang/CharSequence;CIZI)I

    move-result v1

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lm2/l;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    const/16 v1, 0x2f

    const/4 v2, 0x0

    iget-object v3, p0, Lm2/l;->h:Ljava/lang/String;

    const/4 v4, 0x4

    invoke-static {v3, v1, v0, v2, v4}, Ld2/d;->b0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "?#"

    invoke-static {v0, v1, v3, v2}, Ln2/b;->e(IILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 7

    iget-object v0, p0, Lm2/l;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    const/4 v1, 0x0

    iget-object v2, p0, Lm2/l;->h:Ljava/lang/String;

    const/16 v3, 0x2f

    const/4 v4, 0x4

    invoke-static {v2, v3, v0, v1, v4}, Ld2/d;->b0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    const-string v4, "?#"

    invoke-static {v0, v1, v2, v4}, Ln2/b;->e(IILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-ge v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v2, v3, v0, v1}, Ln2/b;->f(Ljava/lang/String;CII)I

    move-result v5

    invoke-virtual {v2, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v6, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v6}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v5

    goto :goto_0

    :cond_0
    return-object v4
.end method

.method public final d()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lm2/l;->f:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x6

    const/16 v1, 0x3f

    iget-object v2, p0, Lm2/l;->h:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v2, v1, v3, v3, v0}, Ld2/d;->b0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v3, 0x23

    invoke-static {v2, v3, v0, v1}, Ln2/b;->f(Ljava/lang/String;CII)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lm2/l;->b:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lm2/l;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    const-string v1, ":@"

    iget-object v2, p0, Lm2/l;->h:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v0, v3, v2, v1}, Ln2/b;->e(IILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lm2/l;

    if-eqz v0, :cond_0

    check-cast p1, Lm2/l;

    iget-object p1, p1, Lm2/l;->h:Ljava/lang/String;

    iget-object v0, p0, Lm2/l;->h:Ljava/lang/String;

    invoke-static {p1, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f()Ljava/net/URI;
    .locals 20

    move-object/from16 v1, p0

    new-instance v0, Lm2/k;

    invoke-direct {v0}, Lm2/k;-><init>()V

    iget-object v2, v1, Lm2/l;->a:Ljava/lang/String;

    iput-object v2, v0, Lm2/k;->d:Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lm2/l;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lm2/k;->e:Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lm2/l;->a()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lm2/k;->f:Ljava/lang/Object;

    iget-object v3, v1, Lm2/l;->d:Ljava/lang/String;

    iput-object v3, v0, Lm2/k;->g:Ljava/lang/Object;

    const-string v3, "scheme"

    invoke-static {v2, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "http"

    invoke-static {v2, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_0

    const/16 v2, 0x50

    goto :goto_0

    :cond_0
    const-string v3, "https"

    invoke-static {v2, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x1bb

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    iget v3, v1, Lm2/l;->e:I

    if-eq v3, v2, :cond_2

    move v4, v3

    :cond_2
    iput v4, v0, Lm2/k;->b:I

    iget-object v2, v0, Lm2/k;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {p0 .. p0}, Lm2/l;->c()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual/range {p0 .. p0}, Lm2/l;->d()Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    if-eqz v4, :cond_3

    const/4 v9, 0x0

    const/16 v12, 0xd3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, " \"\'<>#"

    const/4 v8, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static/range {v4 .. v12}, Lm2/b;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lm2/b;->g(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    goto :goto_1

    :cond_3
    move-object v4, v3

    :goto_1
    iput-object v4, v0, Lm2/k;->i:Ljava/util/List;

    iget-object v4, v1, Lm2/l;->g:Ljava/lang/String;

    const/4 v5, 0x0

    if-nez v4, :cond_4

    move-object v4, v3

    goto :goto_2

    :cond_4
    const/4 v4, 0x6

    const/16 v6, 0x23

    iget-object v7, v1, Lm2/l;->h:Ljava/lang/String;

    invoke-static {v7, v6, v5, v5, v4}, Ld2/d;->b0(Ljava/lang/CharSequence;CIZI)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v7, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v6, "this as java.lang.String).substring(startIndex)"

    invoke-static {v4, v6}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    iput-object v4, v0, Lm2/k;->h:Ljava/lang/Object;

    iget-object v4, v0, Lm2/k;->g:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    const-string v6, "replaceAll(...)"

    const-string v7, ""

    const-string v8, "compile(...)"

    if-eqz v4, :cond_5

    const-string v9, "[\"<>^`{|}]"

    invoke-static {v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v9

    invoke-static {v9, v8}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    move-object v4, v3

    :goto_3
    iput-object v4, v0, Lm2/k;->g:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v9, v5

    :goto_4
    if-ge v9, v4, :cond_6

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Ljava/lang/String;

    const/16 v17, 0x0

    const/16 v19, 0xe3

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-string v14, "[]"

    const/4 v15, 0x1

    const/16 v16, 0x1

    const/16 v18, 0x0

    invoke-static/range {v11 .. v19}, Lm2/b;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v9, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_6
    iget-object v2, v0, Lm2/k;->i:Ljava/util/List;

    check-cast v2, Ljava/util/ArrayList;

    if-eqz v2, :cond_8

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    :goto_5
    if-ge v5, v4, :cond_8

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_7

    const/16 v16, 0x1

    const/16 v18, 0xc3

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v13, "\\^`{|}"

    const/4 v14, 0x1

    const/4 v15, 0x1

    const/16 v17, 0x0

    invoke-static/range {v10 .. v18}, Lm2/b;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v9

    goto :goto_6

    :cond_7
    move-object v9, v3

    :goto_6
    invoke-interface {v2, v5, v9}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_8
    iget-object v2, v0, Lm2/k;->h:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_9

    const/4 v15, 0x0

    const/16 v17, 0xa3

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, " \"#<>\\^`{|}"

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/16 v16, 0x1

    invoke-static/range {v9 .. v17}, Lm2/b;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v3

    :cond_9
    iput-object v3, v0, Lm2/k;->h:Ljava/lang/Object;

    invoke-virtual {v0}, Lm2/k;->toString()Ljava/lang/String;

    move-result-object v2

    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    :try_start_1
    const-string v3, "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-static {v3, v8}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v6}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-string v2, "{\n      // Unlikely edge\u2026Unexpected!\n      }\n    }"

    invoke-static {v0, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_7
    return-object v0

    :catch_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lm2/l;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm2/l;->h:Ljava/lang/String;

    return-object v0
.end method
