.class public final LA1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA1/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    .line 2
    iput p3, p0, LA1/i;->a:I

    iput p1, p0, LA1/i;->b:I

    iput p2, p0, LA1/i;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LZ/W;)V
    .locals 1

    iget-object p1, p1, LZ/W;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, p0, LA1/i;->b:I

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, LA1/i;->c:I

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    return-void
.end method

.method public b()Lj1/n;
    .locals 3

    new-instance v0, Lj1/n;

    iget v1, p0, LA1/i;->b:I

    int-to-float v1, v1

    iget v2, p0, LA1/i;->c:I

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lj1/n;-><init>(FF)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, LA1/i;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, LA1/i;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, LA1/i;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
