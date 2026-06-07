.class public final Lxyz/happify/ckemv/CardRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final aid:Ljava/lang/String;

.field private final network:Ljava/lang/String;

.field private final pan:Ljava/lang/String;

.field private final rawData:Ljava/lang/String;

.field private final txs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lxyz/happify/ckemv/HarvestedTx;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lxyz/happify/ckemv/HarvestedTx;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pan"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aid"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "network"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawData"

    invoke-static {p4, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "txs"

    invoke-static {p5, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxyz/happify/ckemv/CardRecord;->pan:Ljava/lang/String;

    iput-object p2, p0, Lxyz/happify/ckemv/CardRecord;->aid:Ljava/lang/String;

    iput-object p3, p0, Lxyz/happify/ckemv/CardRecord;->network:Ljava/lang/String;

    iput-object p4, p0, Lxyz/happify/ckemv/CardRecord;->rawData:Ljava/lang/String;

    iput-object p5, p0, Lxyz/happify/ckemv/CardRecord;->txs:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lxyz/happify/ckemv/CardRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lxyz/happify/ckemv/CardRecord;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lxyz/happify/ckemv/CardRecord;->pan:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lxyz/happify/ckemv/CardRecord;->aid:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lxyz/happify/ckemv/CardRecord;->network:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lxyz/happify/ckemv/CardRecord;->rawData:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lxyz/happify/ckemv/CardRecord;->txs:Ljava/util/List;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lxyz/happify/ckemv/CardRecord;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lxyz/happify/ckemv/CardRecord;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->pan:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->network:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->rawData:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxyz/happify/ckemv/HarvestedTx;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->txs:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lxyz/happify/ckemv/CardRecord;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lxyz/happify/ckemv/HarvestedTx;",
            ">;)",
            "Lxyz/happify/ckemv/CardRecord;"
        }
    .end annotation

    const-string v0, "pan"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aid"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "network"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawData"

    invoke-static {p4, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "txs"

    invoke-static {p5, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxyz/happify/ckemv/CardRecord;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lxyz/happify/ckemv/CardRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxyz/happify/ckemv/CardRecord;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxyz/happify/ckemv/CardRecord;

    iget-object v1, p0, Lxyz/happify/ckemv/CardRecord;->pan:Ljava/lang/String;

    iget-object v3, p1, Lxyz/happify/ckemv/CardRecord;->pan:Ljava/lang/String;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lxyz/happify/ckemv/CardRecord;->aid:Ljava/lang/String;

    iget-object v3, p1, Lxyz/happify/ckemv/CardRecord;->aid:Ljava/lang/String;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lxyz/happify/ckemv/CardRecord;->network:Ljava/lang/String;

    iget-object v3, p1, Lxyz/happify/ckemv/CardRecord;->network:Ljava/lang/String;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lxyz/happify/ckemv/CardRecord;->rawData:Ljava/lang/String;

    iget-object v3, p1, Lxyz/happify/ckemv/CardRecord;->rawData:Ljava/lang/String;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lxyz/happify/ckemv/CardRecord;->txs:Ljava/util/List;

    iget-object p1, p1, Lxyz/happify/ckemv/CardRecord;->txs:Ljava/util/List;

    invoke-static {v1, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public final getNetwork()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->network:Ljava/lang/String;

    return-object v0
.end method

.method public final getPan()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->pan:Ljava/lang/String;

    return-object v0
.end method

.method public final getRawData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->rawData:Ljava/lang/String;

    return-object v0
.end method

.method public final getTxs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxyz/happify/ckemv/HarvestedTx;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->txs:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->pan:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lxyz/happify/ckemv/CardRecord;->aid:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->network:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lxyz/happify/ckemv/CardRecord;->rawData:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->txs:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lxyz/happify/ckemv/CardRecord;->pan:Ljava/lang/String;

    iget-object v1, p0, Lxyz/happify/ckemv/CardRecord;->aid:Ljava/lang/String;

    iget-object v2, p0, Lxyz/happify/ckemv/CardRecord;->network:Ljava/lang/String;

    iget-object v3, p0, Lxyz/happify/ckemv/CardRecord;->rawData:Ljava/lang/String;

    iget-object v4, p0, Lxyz/happify/ckemv/CardRecord;->txs:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "CardRecord(pan="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", aid="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", network="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", rawData="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", txs="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
