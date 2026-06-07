.class public final Lxyz/happify/ckemv/CveConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final amount:I

.field private final id:I

.field private final mastercard_tags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final visa_tags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;ILjava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mastercard_tags"

    invoke-static {p4, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visa_tags"

    invoke-static {p5, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lxyz/happify/ckemv/CveConfig;->id:I

    iput-object p2, p0, Lxyz/happify/ckemv/CveConfig;->name:Ljava/lang/String;

    iput p3, p0, Lxyz/happify/ckemv/CveConfig;->amount:I

    iput-object p4, p0, Lxyz/happify/ckemv/CveConfig;->mastercard_tags:Ljava/util/Map;

    iput-object p5, p0, Lxyz/happify/ckemv/CveConfig;->visa_tags:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lxyz/happify/ckemv/CveConfig;ILjava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lxyz/happify/ckemv/CveConfig;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lxyz/happify/ckemv/CveConfig;->id:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lxyz/happify/ckemv/CveConfig;->name:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lxyz/happify/ckemv/CveConfig;->amount:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lxyz/happify/ckemv/CveConfig;->mastercard_tags:Ljava/util/Map;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lxyz/happify/ckemv/CveConfig;->visa_tags:Ljava/util/Map;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move p3, p1

    move-object p4, p7

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lxyz/happify/ckemv/CveConfig;->copy(ILjava/lang/String;ILjava/util/Map;Ljava/util/Map;)Lxyz/happify/ckemv/CveConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lxyz/happify/ckemv/CveConfig;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/CveConfig;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lxyz/happify/ckemv/CveConfig;->amount:I

    return v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxyz/happify/ckemv/CveConfig;->mastercard_tags:Ljava/util/Map;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxyz/happify/ckemv/CveConfig;->visa_tags:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;ILjava/util/Map;Ljava/util/Map;)Lxyz/happify/ckemv/CveConfig;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lxyz/happify/ckemv/CveConfig;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mastercard_tags"

    invoke-static {p4, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visa_tags"

    invoke-static {p5, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxyz/happify/ckemv/CveConfig;

    move-object v1, v0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lxyz/happify/ckemv/CveConfig;-><init>(ILjava/lang/String;ILjava/util/Map;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxyz/happify/ckemv/CveConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxyz/happify/ckemv/CveConfig;

    iget v1, p0, Lxyz/happify/ckemv/CveConfig;->id:I

    iget v3, p1, Lxyz/happify/ckemv/CveConfig;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lxyz/happify/ckemv/CveConfig;->name:Ljava/lang/String;

    iget-object v3, p1, Lxyz/happify/ckemv/CveConfig;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lxyz/happify/ckemv/CveConfig;->amount:I

    iget v3, p1, Lxyz/happify/ckemv/CveConfig;->amount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lxyz/happify/ckemv/CveConfig;->mastercard_tags:Ljava/util/Map;

    iget-object v3, p1, Lxyz/happify/ckemv/CveConfig;->mastercard_tags:Ljava/util/Map;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lxyz/happify/ckemv/CveConfig;->visa_tags:Ljava/util/Map;

    iget-object p1, p1, Lxyz/happify/ckemv/CveConfig;->visa_tags:Ljava/util/Map;

    invoke-static {v1, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAmount()I
    .locals 1

    iget v0, p0, Lxyz/happify/ckemv/CveConfig;->amount:I

    return v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lxyz/happify/ckemv/CveConfig;->id:I

    return v0
.end method

.method public final getMastercard_tags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxyz/happify/ckemv/CveConfig;->mastercard_tags:Ljava/util/Map;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxyz/happify/ckemv/CveConfig;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getVisa_tags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxyz/happify/ckemv/CveConfig;->visa_tags:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lxyz/happify/ckemv/CveConfig;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lxyz/happify/ckemv/CveConfig;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lxyz/happify/ckemv/CveConfig;->amount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lxyz/happify/ckemv/CveConfig;->mastercard_tags:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lxyz/happify/ckemv/CveConfig;->visa_tags:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lxyz/happify/ckemv/CveConfig;->id:I

    iget-object v1, p0, Lxyz/happify/ckemv/CveConfig;->name:Ljava/lang/String;

    iget v2, p0, Lxyz/happify/ckemv/CveConfig;->amount:I

    iget-object v3, p0, Lxyz/happify/ckemv/CveConfig;->mastercard_tags:Ljava/util/Map;

    iget-object v4, p0, Lxyz/happify/ckemv/CveConfig;->visa_tags:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "CveConfig(id="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", amount="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mastercard_tags="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", visa_tags="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
