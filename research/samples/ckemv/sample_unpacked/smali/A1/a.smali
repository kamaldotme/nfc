.class public final LA1/a;
.super LA1/e;
.source "SourceFile"


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lp1/a;I)V
    .locals 0

    iput p2, p0, LA1/a;->c:I

    invoke-direct {p0, p1}, LA1/f;-><init>(Lp1/a;)V

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LA1/f;->a:Ljava/lang/Object;

    check-cast v0, Lp1/a;

    iget v0, v0, Lp1/a;->c:I

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, LA1/d;->l(Ljava/lang/StringBuilder;I)V

    const/16 v1, 0x2d

    const/16 v2, 0xf

    invoke-virtual {p0, v0, v1, v2}, LA1/e;->p(Ljava/lang/StringBuilder;II)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0
.end method

.method public final n(Ljava/lang/StringBuilder;I)V
    .locals 1

    iget v0, p0, LA1/a;->c:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x2710

    if-ge p2, v0, :cond_0

    const-string p2, "(3202)"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string p2, "(3203)"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void

    :pswitch_0
    const-string p2, "(3103)"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o(I)I
    .locals 1

    iget v0, p0, LA1/a;->c:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x2710

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v0

    :goto_0
    :pswitch_0
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
