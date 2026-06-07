.class public final Lm2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lm2/g;

.field public static final f:Lm2/g;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:[Ljava/lang/String;

.field public final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    sget-object v9, Lm2/f;->r:Lm2/f;

    sget-object v10, Lm2/f;->s:Lm2/f;

    sget-object v11, Lm2/f;->t:Lm2/f;

    sget-object v12, Lm2/f;->l:Lm2/f;

    sget-object v13, Lm2/f;->n:Lm2/f;

    sget-object v14, Lm2/f;->m:Lm2/f;

    sget-object v15, Lm2/f;->o:Lm2/f;

    sget-object v16, Lm2/f;->q:Lm2/f;

    sget-object v17, Lm2/f;->p:Lm2/f;

    move-object v0, v9

    move-object v1, v10

    move-object v2, v11

    move-object v3, v12

    move-object v4, v13

    move-object v5, v14

    move-object v6, v15

    move-object/from16 v7, v16

    move-object/from16 v8, v17

    filled-new-array/range {v0 .. v8}, [Lm2/f;

    move-result-object v8

    sget-object v18, Lm2/f;->j:Lm2/f;

    sget-object v19, Lm2/f;->k:Lm2/f;

    sget-object v20, Lm2/f;->h:Lm2/f;

    sget-object v21, Lm2/f;->i:Lm2/f;

    sget-object v22, Lm2/f;->f:Lm2/f;

    sget-object v23, Lm2/f;->g:Lm2/f;

    sget-object v24, Lm2/f;->e:Lm2/f;

    move-object v15, v8

    move-object/from16 v8, v17

    move-object/from16 v9, v18

    move-object/from16 v10, v19

    move-object/from16 v11, v20

    move-object/from16 v12, v21

    move-object/from16 v13, v22

    move-object/from16 v14, v23

    move-object/from16 v25, v15

    move-object/from16 v15, v24

    filled-new-array/range {v0 .. v15}, [Lm2/f;

    move-result-object v0

    new-instance v1, Lk/e1;

    invoke-direct {v1}, Lk/e1;-><init>()V

    const/16 v2, 0x9

    move-object/from16 v3, v25

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lm2/f;

    invoke-virtual {v1, v2}, Lk/e1;->c([Lm2/f;)V

    sget-object v2, Lm2/u;->c:Lm2/u;

    sget-object v3, Lm2/u;->d:Lm2/u;

    filled-new-array {v2, v3}, [Lm2/u;

    move-result-object v4

    invoke-virtual {v1, v4}, Lk/e1;->f([Lm2/u;)V

    invoke-virtual {v1}, Lk/e1;->d()V

    invoke-virtual {v1}, Lk/e1;->a()Lm2/g;

    new-instance v1, Lk/e1;

    invoke-direct {v1}, Lk/e1;-><init>()V

    const/16 v4, 0x10

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lm2/f;

    invoke-virtual {v1, v5}, Lk/e1;->c([Lm2/f;)V

    filled-new-array {v2, v3}, [Lm2/u;

    move-result-object v5

    invoke-virtual {v1, v5}, Lk/e1;->f([Lm2/u;)V

    invoke-virtual {v1}, Lk/e1;->d()V

    invoke-virtual {v1}, Lk/e1;->a()Lm2/g;

    move-result-object v1

    sput-object v1, Lm2/g;->e:Lm2/g;

    new-instance v1, Lk/e1;

    invoke-direct {v1}, Lk/e1;-><init>()V

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm2/f;

    invoke-virtual {v1, v0}, Lk/e1;->c([Lm2/f;)V

    sget-object v0, Lm2/u;->e:Lm2/u;

    sget-object v4, Lm2/u;->f:Lm2/u;

    filled-new-array {v2, v3, v0, v4}, [Lm2/u;

    move-result-object v0

    invoke-virtual {v1, v0}, Lk/e1;->f([Lm2/u;)V

    invoke-virtual {v1}, Lk/e1;->d()V

    invoke-virtual {v1}, Lk/e1;->a()Lm2/g;

    new-instance v0, Lm2/g;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2, v2}, Lm2/g;-><init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lm2/g;->f:Lm2/g;

    return-void
.end method

.method public constructor <init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm2/g;->a:Z

    iput-boolean p2, p0, Lm2/g;->b:Z

    iput-object p3, p0, Lm2/g;->c:[Ljava/lang/String;

    iput-object p4, p0, Lm2/g;->d:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 6

    iget-object v0, p0, Lm2/g;->c:[Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    sget-object v5, Lm2/f;->b:Lm2/b;

    invoke-virtual {v5, v4}, Lm2/b;->c(Ljava/lang/String;)Lm2/f;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, LL1/k;->Y(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final b(Ljavax/net/ssl/SSLSocket;)Z
    .locals 4

    iget-boolean v0, p0, Lm2/g;->a:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lm2/g;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v2

    sget-object v3, LN1/a;->c:LN1/a;

    invoke-static {v0, v2, v3}, Ln2/b;->i([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lm2/g;->c:[Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object p1

    sget-object v2, Lm2/f;->c:Lm2/e;

    invoke-static {v0, p1, v2}, Ln2/b;->i([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final c()Ljava/util/List;
    .locals 5

    iget-object v0, p0, Lm2/g;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-static {v4}, Lm0/z;->w(Ljava/lang/String;)Lm2/u;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, LL1/k;->Y(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lm2/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    check-cast p1, Lm2/g;

    iget-boolean v2, p1, Lm2/g;->a:Z

    iget-boolean v3, p0, Lm2/g;->a:Z

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    if-eqz v3, :cond_5

    iget-object v2, p0, Lm2/g;->c:[Ljava/lang/String;

    iget-object v3, p1, Lm2/g;->c:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lm2/g;->d:[Ljava/lang/String;

    iget-object v3, p1, Lm2/g;->d:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Lm2/g;->b:Z

    iget-boolean p1, p1, Lm2/g;->b:Z

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lm2/g;->a:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iget-object v1, p0, Lm2/g;->c:[Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const/16 v2, 0x20f

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Lm2/g;->d:[Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    :cond_1
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-boolean v0, p0, Lm2/g;->b:Z

    xor-int/lit8 v0, v0, 0x1

    add-int/2addr v2, v0

    goto :goto_1

    :cond_2
    const/16 v2, 0x11

    :goto_1
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lm2/g;->a:Z

    if-nez v0, :cond_0

    const-string v0, "ConnectionSpec()"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ConnectionSpec(cipherSuites="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lm2/g;->a()Ljava/util/List;

    move-result-object v1

    const-string v2, "[all enabled]"

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tlsVersions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm2/g;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", supportsTlsExtensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lm2/g;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
