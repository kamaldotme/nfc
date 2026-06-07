.class public final Lm2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm2/u;

.field public final b:Lm2/f;

.field public final c:Ljava/util/List;

.field public final d:LK1/f;


# direct methods
.method public constructor <init>(Lm2/u;Lm2/f;Ljava/util/List;LW1/a;)V
    .locals 1

    const-string v0, "tlsVersion"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cipherSuite"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localCertificates"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/i;->a:Lm2/u;

    iput-object p2, p0, Lm2/i;->b:Lm2/f;

    iput-object p3, p0, Lm2/i;->c:Ljava/util/List;

    new-instance p1, La0/l;

    const/4 p2, 0x4

    invoke-direct {p1, p2, p4}, La0/l;-><init>(ILjava/lang/Object;)V

    new-instance p2, LK1/f;

    invoke-direct {p2, p1}, LK1/f;-><init>(LW1/a;)V

    iput-object p2, p0, Lm2/i;->d:LK1/f;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lm2/i;->d:LK1/f;

    invoke-virtual {v0}, LK1/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lm2/i;

    if-eqz v0, :cond_0

    check-cast p1, Lm2/i;

    iget-object v0, p1, Lm2/i;->a:Lm2/u;

    iget-object v1, p0, Lm2/i;->a:Lm2/u;

    if-ne v0, v1, :cond_0

    iget-object v0, p1, Lm2/i;->b:Lm2/f;

    iget-object v1, p0, Lm2/i;->b:Lm2/f;

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lm2/i;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lm2/i;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lm2/i;->c:Ljava/util/List;

    iget-object v0, p0, Lm2/i;->c:Ljava/util/List;

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

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lm2/i;->a:Lm2/u;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm2/i;->b:Lm2/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p0}, Lm2/i;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm2/i;->c:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lm2/i;->a()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0}, LL1/m;->S(Ljava/lang/Iterable;)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "type"

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    instance-of v4, v2, Ljava/security/cert/X509Certificate;

    if-eqz v4, :cond_0

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Handshake{tlsVersion="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lm2/i;->a:Lm2/u;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " cipherSuite="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lm2/i;->b:Lm2/f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " peerCertificates="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " localCertificates="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lm2/i;->c:Ljava/util/List;

    invoke-static {v2}, LL1/m;->S(Ljava/lang/Iterable;)I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/cert/Certificate;

    instance-of v5, v4, Ljava/security/cert/X509Certificate;

    if-eqz v5, :cond_2

    check-cast v4, Ljava/security/cert/X509Certificate;

    invoke-virtual {v4}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_2
    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
