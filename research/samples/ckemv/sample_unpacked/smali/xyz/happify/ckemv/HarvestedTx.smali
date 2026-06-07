.class public final Lxyz/happify/ckemv/HarvestedTx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final arqc:Ljava/lang/String;

.field private final atc:Ljava/lang/String;

.field private final cve_id:I

.field private final params:Ljava/lang/String;

.field private final timeMs:D


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;I)V
    .locals 1

    const-string v0, "atc"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arqc"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p5, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxyz/happify/ckemv/HarvestedTx;->atc:Ljava/lang/String;

    iput-object p2, p0, Lxyz/happify/ckemv/HarvestedTx;->arqc:Ljava/lang/String;

    iput-wide p3, p0, Lxyz/happify/ckemv/HarvestedTx;->timeMs:D

    iput-object p5, p0, Lxyz/happify/ckemv/HarvestedTx;->params:Ljava/lang/String;

    iput p6, p0, Lxyz/happify/ckemv/HarvestedTx;->cve_id:I

    return-void
.end method

.method public static synthetic copy$default(Lxyz/happify/ckemv/HarvestedTx;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;IILjava/lang/Object;)Lxyz/happify/ckemv/HarvestedTx;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lxyz/happify/ckemv/HarvestedTx;->atc:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lxyz/happify/ckemv/HarvestedTx;->arqc:Ljava/lang/String;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-wide p3, p0, Lxyz/happify/ckemv/HarvestedTx;->timeMs:D

    :cond_2
    move-wide v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p5, p0, Lxyz/happify/ckemv/HarvestedTx;->params:Ljava/lang/String;

    :cond_3
    move-object v2, p5

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget p6, p0, Lxyz/happify/ckemv/HarvestedTx;->cve_id:I

    :cond_4
    move v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-wide p5, v0

    move-object p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lxyz/happify/ckemv/HarvestedTx;->copy(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;I)Lxyz/happify/ckemv/HarvestedTx;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/HarvestedTx;->atc:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/HarvestedTx;->arqc:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lxyz/happify/ckemv/HarvestedTx;->timeMs:D

    return-wide v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/HarvestedTx;->params:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lxyz/happify/ckemv/HarvestedTx;->cve_id:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;I)Lxyz/happify/ckemv/HarvestedTx;
    .locals 8

    const-string v0, "atc"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arqc"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p5, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxyz/happify/ckemv/HarvestedTx;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lxyz/happify/ckemv/HarvestedTx;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxyz/happify/ckemv/HarvestedTx;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxyz/happify/ckemv/HarvestedTx;

    iget-object v1, p0, Lxyz/happify/ckemv/HarvestedTx;->atc:Ljava/lang/String;

    iget-object v3, p1, Lxyz/happify/ckemv/HarvestedTx;->atc:Ljava/lang/String;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lxyz/happify/ckemv/HarvestedTx;->arqc:Ljava/lang/String;

    iget-object v3, p1, Lxyz/happify/ckemv/HarvestedTx;->arqc:Ljava/lang/String;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lxyz/happify/ckemv/HarvestedTx;->timeMs:D

    iget-wide v5, p1, Lxyz/happify/ckemv/HarvestedTx;->timeMs:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lxyz/happify/ckemv/HarvestedTx;->params:Ljava/lang/String;

    iget-object v3, p1, Lxyz/happify/ckemv/HarvestedTx;->params:Ljava/lang/String;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lxyz/happify/ckemv/HarvestedTx;->cve_id:I

    iget p1, p1, Lxyz/happify/ckemv/HarvestedTx;->cve_id:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getArqc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/HarvestedTx;->arqc:Ljava/lang/String;

    return-object v0
.end method

.method public final getAtc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/HarvestedTx;->atc:Ljava/lang/String;

    return-object v0
.end method

.method public final getCve_id()I
    .locals 1

    iget v0, p0, Lxyz/happify/ckemv/HarvestedTx;->cve_id:I

    return v0
.end method

.method public final getParams()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/HarvestedTx;->params:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeMs()D
    .locals 2

    iget-wide v0, p0, Lxyz/happify/ckemv/HarvestedTx;->timeMs:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lxyz/happify/ckemv/HarvestedTx;->atc:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lxyz/happify/ckemv/HarvestedTx;->arqc:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lxyz/happify/ckemv/HarvestedTx;->timeMs:D

    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lxyz/happify/ckemv/HarvestedTx;->params:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lxyz/happify/ckemv/HarvestedTx;->cve_id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lxyz/happify/ckemv/HarvestedTx;->atc:Ljava/lang/String;

    iget-object v1, p0, Lxyz/happify/ckemv/HarvestedTx;->arqc:Ljava/lang/String;

    iget-wide v2, p0, Lxyz/happify/ckemv/HarvestedTx;->timeMs:D

    iget-object v4, p0, Lxyz/happify/ckemv/HarvestedTx;->params:Ljava/lang/String;

    iget v5, p0, Lxyz/happify/ckemv/HarvestedTx;->cve_id:I

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "HarvestedTx(atc="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", arqc="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timeMs="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", params="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cve_id="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
