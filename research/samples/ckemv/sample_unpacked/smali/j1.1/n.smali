.class public Lj1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj1/n;->a:F

    iput p2, p0, Lj1/n;->b:F

    return-void
.end method

.method public static a(Lj1/n;Lj1/n;)F
    .locals 2

    iget v0, p0, Lj1/n;->a:F

    iget v1, p1, Lj1/n;->a:F

    iget p1, p1, Lj1/n;->b:F

    iget p0, p0, Lj1/n;->b:F

    invoke-static {v0, p0, v1, p1}, Lv0/f;->s(FFFF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lj1/n;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lj1/n;

    iget v0, p1, Lj1/n;->a:F

    iget v2, p0, Lj1/n;->a:F

    cmpl-float v0, v2, v0

    if-nez v0, :cond_0

    iget v0, p0, Lj1/n;->b:F

    iget p1, p1, Lj1/n;->b:F

    cmpl-float p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lj1/n;->a:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lj1/n;->b:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lj1/n;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lj1/n;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
