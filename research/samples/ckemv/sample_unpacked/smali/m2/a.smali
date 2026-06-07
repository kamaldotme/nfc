.class public final Lm2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm2/b;

.field public final b:Ljavax/net/SocketFactory;

.field public final c:Ljavax/net/ssl/SSLSocketFactory;

.field public final d:Ljavax/net/ssl/HostnameVerifier;

.field public final e:Lm2/d;

.field public final f:Lm2/b;

.field public final g:Ljava/net/ProxySelector;

.field public final h:Lm2/l;

.field public final i:Ljava/util/List;

.field public final j:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILm2/b;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ly2/c;Lm2/d;Lm2/b;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V
    .locals 1

    const-string v0, "uriHost"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dns"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "socketFactory"

    invoke-static {p4, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxyAuthenticator"

    invoke-static {p8, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocols"

    invoke-static {p9, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionSpecs"

    invoke-static {p10, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxySelector"

    invoke-static {p11, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lm2/a;->a:Lm2/b;

    iput-object p4, p0, Lm2/a;->b:Ljavax/net/SocketFactory;

    iput-object p5, p0, Lm2/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p6, p0, Lm2/a;->d:Ljavax/net/ssl/HostnameVerifier;

    iput-object p7, p0, Lm2/a;->e:Lm2/d;

    iput-object p8, p0, Lm2/a;->f:Lm2/b;

    iput-object p11, p0, Lm2/a;->g:Ljava/net/ProxySelector;

    new-instance p3, Lm2/k;

    invoke-direct {p3}, Lm2/k;-><init>()V

    const-string p4, "http"

    const-string p6, "https"

    if-eqz p5, :cond_0

    move-object p5, p6

    goto :goto_0

    :cond_0
    move-object p5, p4

    :goto_0
    invoke-static {p5, p4}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p7

    if-eqz p7, :cond_1

    iput-object p4, p3, Lm2/k;->d:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-static {p5, p6}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_4

    iput-object p6, p3, Lm2/k;->d:Ljava/lang/Object;

    :goto_1
    const/4 p4, 0x7

    const/4 p5, 0x0

    invoke-static {p1, p5, p5, p5, p4}, Lm2/b;->f(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lv0/f;->P(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    if-eqz p4, :cond_3

    iput-object p4, p3, Lm2/k;->g:Ljava/lang/Object;

    const/4 p1, 0x1

    if-gt p1, p2, :cond_2

    const/high16 p1, 0x10000

    if-ge p2, p1, :cond_2

    iput p2, p3, Lm2/k;->b:I

    invoke-virtual {p3}, Lm2/k;->a()Lm2/l;

    move-result-object p1

    iput-object p1, p0, Lm2/a;->h:Lm2/l;

    invoke-static {p9}, Ln2/b;->v(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lm2/a;->i:Ljava/util/List;

    invoke-static {p10}, Ln2/b;->v(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lm2/a;->j:Ljava/util/List;

    return-void

    :cond_2
    const-string p1, "unexpected port: "

    invoke-static {p1, p2}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "unexpected host: "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "unexpected scheme: "

    invoke-virtual {p2, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lm2/a;)Z
    .locals 2

    const-string v0, "that"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm2/a;->a:Lm2/b;

    iget-object v1, p1, Lm2/a;->a:Lm2/b;

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm2/a;->f:Lm2/b;

    iget-object v1, p1, Lm2/a;->f:Lm2/b;

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm2/a;->i:Ljava/util/List;

    iget-object v1, p1, Lm2/a;->i:Ljava/util/List;

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm2/a;->j:Ljava/util/List;

    iget-object v1, p1, Lm2/a;->j:Ljava/util/List;

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm2/a;->g:Ljava/net/ProxySelector;

    iget-object v1, p1, Lm2/a;->g:Ljava/net/ProxySelector;

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm2/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v1, p1, Lm2/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm2/a;->d:Ljavax/net/ssl/HostnameVerifier;

    iget-object v1, p1, Lm2/a;->d:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm2/a;->e:Lm2/d;

    iget-object v1, p1, Lm2/a;->e:Lm2/d;

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm2/a;->h:Lm2/l;

    iget v0, v0, Lm2/l;->e:I

    iget-object p1, p1, Lm2/a;->h:Lm2/l;

    iget p1, p1, Lm2/l;->e:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lm2/a;

    if-eqz v0, :cond_0

    check-cast p1, Lm2/a;

    iget-object v0, p1, Lm2/a;->h:Lm2/l;

    iget-object v1, p0, Lm2/a;->h:Lm2/l;

    invoke-static {v1, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lm2/a;->a(Lm2/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lm2/a;->h:Lm2/l;

    iget-object v0, v0, Lm2/l;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm2/a;->a:Lm2/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lm2/a;->f:Lm2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm2/a;->i:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lm2/a;->j:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm2/a;->g:Ljava/net/ProxySelector;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit16 v1, v1, 0x3c1

    iget-object v0, p0, Lm2/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm2/a;->d:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lm2/a;->e:Lm2/d;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Address{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lm2/a;->h:Lm2/l;

    iget-object v2, v1, Lm2/l;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, v1, Lm2/l;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "proxySelector="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lm2/a;->g:Ljava/net/ProxySelector;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
