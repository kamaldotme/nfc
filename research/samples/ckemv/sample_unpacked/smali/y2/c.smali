.class public final Ly2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/net/ssl/HostnameVerifier;


# static fields
.field public static final a:Ly2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly2/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly2/c;->a:Ly2/c;

    return-void
.end method

.method public static a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;
    .locals 5

    sget-object v0, LL1/t;->b:LL1/t;

    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object p0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    if-ge v3, v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_4
    return-object v1

    :catch_0
    return-object v0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 13

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ltz v1, :cond_a

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-gt v1, v2, :cond_9

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move v5, v2

    :goto_0
    if-ge v5, v1, :cond_7

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x80

    const-wide/16 v8, 0x1

    if-ge v6, v7, :cond_0

    add-long/2addr v3, v8

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    const/16 v7, 0x800

    if-ge v6, v7, :cond_1

    const/4 v6, 0x2

    :goto_2
    int-to-long v6, v6

    add-long/2addr v3, v6

    goto :goto_1

    :cond_1
    const v7, 0xd800

    if-lt v6, v7, :cond_6

    const v7, 0xdfff

    if-le v6, v7, :cond_2

    goto :goto_5

    :cond_2
    add-int/lit8 v10, v5, 0x1

    if-ge v10, v1, :cond_3

    invoke-virtual {p0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    goto :goto_3

    :cond_3
    move v11, v2

    :goto_3
    const v12, 0xdbff

    if-gt v6, v12, :cond_5

    const v6, 0xdc00

    if-lt v11, v6, :cond_5

    if-le v11, v7, :cond_4

    goto :goto_4

    :cond_4
    const/4 v6, 0x4

    int-to-long v6, v6

    add-long/2addr v3, v6

    add-int/lit8 v5, v5, 0x2

    goto :goto_0

    :cond_5
    :goto_4
    add-long/2addr v3, v8

    move v5, v10

    goto :goto_0

    :cond_6
    :goto_5
    const/4 v6, 0x3

    goto :goto_2

    :cond_7
    long-to-int p0, v3

    if-ne v0, p0, :cond_8

    const/4 v2, 0x1

    :cond_8
    return v2

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "endIndex > string.length: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " > "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    const-string p0, "endIndex < beginIndex: "

    const-string v0, " < 0"

    invoke-static {p0, v1, v0}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
    .locals 11

    const/4 v0, 0x1

    const-string v1, "host"

    invoke-static {p0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ln2/b;->a:[B

    sget-object v1, Ln2/b;->e:LX1/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, LX1/j;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-static {p0}, Lv0/f;->P(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x7

    invoke-static {p1, v1}, Ly2/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    move v0, v2

    goto/16 :goto_3

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lv0/f;->P(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_3

    :cond_3
    invoke-static {p0}, Ly2/c;->b(Ljava/lang/String;)Z

    move-result v1

    const-string v3, "this as java.lang.String).toLowerCase(locale)"

    const-string v4, "US"

    if-eqz v1, :cond_4

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v1, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    const/4 v1, 0x2

    invoke-static {p1, v1}, Ly2/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_0

    :cond_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_7

    goto :goto_1

    :cond_7
    const-string v5, "."

    invoke-static {p0, v5, v2}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-nez v6, :cond_6

    const-string v6, ".."

    invoke-static {p0, v6}, Ld2/l;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_1

    :cond_8
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_9

    goto :goto_1

    :cond_9
    invoke-static {v1, v5, v2}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-nez v7, :cond_6

    invoke-static {v1, v6}, Ld2/l;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_1

    :cond_a
    invoke-static {p0, v5}, Ld2/l;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_b

    invoke-virtual {p0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_b
    move-object v6, p0

    :goto_2
    invoke-static {v1, v5}, Ld2/l;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_c

    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_c
    invoke-static {v1}, Ly2/c;->b(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v5, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_d
    const-string v5, "*"

    invoke-static {v1, v5}, Ld2/d;->X(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_e

    invoke-static {v6, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_e
    const-string v5, "*."

    invoke-static {v1, v5, v2}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x2a

    const/4 v8, 0x4

    invoke-static {v1, v7, v0, v2, v8}, Ld2/d;->b0(Ljava/lang/CharSequence;CIZI)I

    move-result v7

    const/4 v9, -0x1

    if-eq v7, v9, :cond_f

    goto/16 :goto_1

    :cond_f
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v10

    if-ge v7, v10, :cond_10

    goto/16 :goto_1

    :cond_10
    invoke-static {v5, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    goto/16 :goto_1

    :cond_11
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v5, "this as java.lang.String).substring(startIndex)"

    invoke-static {v1, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v1}, Ld2/l;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_12

    goto/16 :goto_1

    :cond_12
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v5, v1

    if-lez v5, :cond_13

    sub-int/2addr v5, v0

    const/16 v1, 0x2e

    invoke-static {v6, v1, v5, v8}, Ld2/d;->e0(Ljava/lang/CharSequence;CII)I

    move-result v1

    if-eq v1, v9, :cond_13

    goto/16 :goto_1

    :cond_13
    :goto_3
    return v0
.end method


# virtual methods
.method public final verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 2

    const-string v0, "host"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly2/c;->b(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-interface {p2}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object p2

    aget-object p2, p2, v1

    const-string v0, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p2, v0}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/security/cert/X509Certificate;

    invoke-static {p1, p2}, Ly2/c;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result v1
    :try_end_0
    .catch Ljavax/net/ssl/SSLException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return v1
.end method
