.class public final Lxyz/happify/ckemv/AppVersion;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final hash:Ljava/lang/String;

.field private final major:I

.field private final minor:I


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 1

    const-string v0, "hash"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lxyz/happify/ckemv/AppVersion;->major:I

    iput p2, p0, Lxyz/happify/ckemv/AppVersion;->minor:I

    iput-object p3, p0, Lxyz/happify/ckemv/AppVersion;->hash:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lxyz/happify/ckemv/AppVersion;IILjava/lang/String;ILjava/lang/Object;)Lxyz/happify/ckemv/AppVersion;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lxyz/happify/ckemv/AppVersion;->major:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lxyz/happify/ckemv/AppVersion;->minor:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lxyz/happify/ckemv/AppVersion;->hash:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lxyz/happify/ckemv/AppVersion;->copy(IILjava/lang/String;)Lxyz/happify/ckemv/AppVersion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lxyz/happify/ckemv/AppVersion;->major:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lxyz/happify/ckemv/AppVersion;->minor:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/AppVersion;->hash:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IILjava/lang/String;)Lxyz/happify/ckemv/AppVersion;
    .locals 1

    const-string v0, "hash"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxyz/happify/ckemv/AppVersion;

    invoke-direct {v0, p1, p2, p3}, Lxyz/happify/ckemv/AppVersion;-><init>(IILjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxyz/happify/ckemv/AppVersion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxyz/happify/ckemv/AppVersion;

    iget v1, p0, Lxyz/happify/ckemv/AppVersion;->major:I

    iget v3, p1, Lxyz/happify/ckemv/AppVersion;->major:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lxyz/happify/ckemv/AppVersion;->minor:I

    iget v3, p1, Lxyz/happify/ckemv/AppVersion;->minor:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lxyz/happify/ckemv/AppVersion;->hash:Ljava/lang/String;

    iget-object p1, p1, Lxyz/happify/ckemv/AppVersion;->hash:Ljava/lang/String;

    invoke-static {v1, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getHash()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/AppVersion;->hash:Ljava/lang/String;

    return-object v0
.end method

.method public final getMajor()I
    .locals 1

    iget v0, p0, Lxyz/happify/ckemv/AppVersion;->major:I

    return v0
.end method

.method public final getMinor()I
    .locals 1

    iget v0, p0, Lxyz/happify/ckemv/AppVersion;->minor:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lxyz/happify/ckemv/AppVersion;->major:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lxyz/happify/ckemv/AppVersion;->minor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lxyz/happify/ckemv/AppVersion;->hash:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lxyz/happify/ckemv/AppVersion;->major:I

    iget v1, p0, Lxyz/happify/ckemv/AppVersion;->minor:I

    iget-object v2, p0, Lxyz/happify/ckemv/AppVersion;->hash:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "AppVersion(major="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", minor="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", hash="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, LX/d;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
