.class public final Lxyz/happify/ckemv/MeResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final cves:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lxyz/happify/ckemv/CveConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final latest_version:Lxyz/happify/ckemv/AppVersion;

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lxyz/happify/ckemv/AppVersion;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lxyz/happify/ckemv/CveConfig;",
            ">;",
            "Lxyz/happify/ckemv/AppVersion;",
            ")V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cves"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxyz/happify/ckemv/MeResponse;->name:Ljava/lang/String;

    iput-object p2, p0, Lxyz/happify/ckemv/MeResponse;->cves:Ljava/util/List;

    iput-object p3, p0, Lxyz/happify/ckemv/MeResponse;->latest_version:Lxyz/happify/ckemv/AppVersion;

    return-void
.end method

.method public static synthetic copy$default(Lxyz/happify/ckemv/MeResponse;Ljava/lang/String;Ljava/util/List;Lxyz/happify/ckemv/AppVersion;ILjava/lang/Object;)Lxyz/happify/ckemv/MeResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lxyz/happify/ckemv/MeResponse;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lxyz/happify/ckemv/MeResponse;->cves:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lxyz/happify/ckemv/MeResponse;->latest_version:Lxyz/happify/ckemv/AppVersion;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lxyz/happify/ckemv/MeResponse;->copy(Ljava/lang/String;Ljava/util/List;Lxyz/happify/ckemv/AppVersion;)Lxyz/happify/ckemv/MeResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/MeResponse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxyz/happify/ckemv/CveConfig;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxyz/happify/ckemv/MeResponse;->cves:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lxyz/happify/ckemv/AppVersion;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/MeResponse;->latest_version:Lxyz/happify/ckemv/AppVersion;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lxyz/happify/ckemv/AppVersion;)Lxyz/happify/ckemv/MeResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lxyz/happify/ckemv/CveConfig;",
            ">;",
            "Lxyz/happify/ckemv/AppVersion;",
            ")",
            "Lxyz/happify/ckemv/MeResponse;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cves"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxyz/happify/ckemv/MeResponse;

    invoke-direct {v0, p1, p2, p3}, Lxyz/happify/ckemv/MeResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lxyz/happify/ckemv/AppVersion;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxyz/happify/ckemv/MeResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxyz/happify/ckemv/MeResponse;

    iget-object v1, p0, Lxyz/happify/ckemv/MeResponse;->name:Ljava/lang/String;

    iget-object v3, p1, Lxyz/happify/ckemv/MeResponse;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lxyz/happify/ckemv/MeResponse;->cves:Ljava/util/List;

    iget-object v3, p1, Lxyz/happify/ckemv/MeResponse;->cves:Ljava/util/List;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lxyz/happify/ckemv/MeResponse;->latest_version:Lxyz/happify/ckemv/AppVersion;

    iget-object p1, p1, Lxyz/happify/ckemv/MeResponse;->latest_version:Lxyz/happify/ckemv/AppVersion;

    invoke-static {v1, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCves()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxyz/happify/ckemv/CveConfig;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxyz/happify/ckemv/MeResponse;->cves:Ljava/util/List;

    return-object v0
.end method

.method public final getLatest_version()Lxyz/happify/ckemv/AppVersion;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/MeResponse;->latest_version:Lxyz/happify/ckemv/AppVersion;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/MeResponse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lxyz/happify/ckemv/MeResponse;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lxyz/happify/ckemv/MeResponse;->cves:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lxyz/happify/ckemv/MeResponse;->latest_version:Lxyz/happify/ckemv/AppVersion;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lxyz/happify/ckemv/AppVersion;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lxyz/happify/ckemv/MeResponse;->name:Ljava/lang/String;

    iget-object v1, p0, Lxyz/happify/ckemv/MeResponse;->cves:Ljava/util/List;

    iget-object v2, p0, Lxyz/happify/ckemv/MeResponse;->latest_version:Lxyz/happify/ckemv/AppVersion;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "MeResponse(name="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cves="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", latest_version="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
