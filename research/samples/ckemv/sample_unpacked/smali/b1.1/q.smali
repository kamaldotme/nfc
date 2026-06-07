.class public final Lb1/q;
.super Lb1/n;
.source "SourceFile"


# instance fields
.field public final b:Ld1/o;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld1/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld1/o;-><init>(Z)V

    iput-object v0, p0, Lb1/q;->b:Ld1/o;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Lb1/q;

    if-eqz v0, :cond_0

    check-cast p1, Lb1/q;

    iget-object p1, p1, Lb1/q;->b:Ld1/o;

    iget-object v0, p0, Lb1/q;->b:Ld1/o;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lb1/q;->b:Ld1/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
