.class public final LI1/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LI1/t;

.field public final b:I

.field public final c:I

.field public d:Landroid/graphics/Rect;

.field public e:Z


# direct methods
.method public constructor <init>([BIIII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LI1/t;

    invoke-direct {v0, p2, p3, p1}, LI1/t;-><init>(II[B)V

    iput-object v0, p0, LI1/z;->a:LI1/t;

    iput p5, p0, LI1/z;->c:I

    iput p4, p0, LI1/z;->b:I

    mul-int p4, p2, p3

    array-length p5, p1

    if-gt p4, p5, :cond_0

    return-void

    :cond_0
    new-instance p4, Ljava/lang/IllegalArgumentException;

    new-instance p5, Ljava/lang/StringBuilder;

    const-string v0, "Image data does not match the resolution. "

    invoke-direct {p5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "x"

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " > "

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p4, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p4
.end method
