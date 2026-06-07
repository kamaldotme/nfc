.class public final LA1/b;
.super LA1/d;
.source "SourceFile"


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lp1/a;I)V
    .locals 0

    iput p2, p0, LA1/b;->c:I

    invoke-direct {p0, p1}, LA1/f;-><init>(Lp1/a;)V

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/String;
    .locals 6

    iget v0, p0, LA1/b;->c:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(01)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    iget-object v2, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v2, Lv0/m;

    iget-object v3, v2, Lv0/m;->c:Ljava/lang/Object;

    check-cast v3, Lp1/a;

    const/4 v4, 0x4

    invoke-static {v4, v4, v3}, Lv0/m;->j(IILp1/a;)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x8

    invoke-virtual {p0, v0, v3, v1}, LA1/d;->m(Ljava/lang/StringBuilder;II)V

    const/16 v1, 0x30

    invoke-virtual {v2, v0, v1}, Lv0/m;->d(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LA1/f;->a:Ljava/lang/Object;

    check-cast v0, Lp1/a;

    iget v0, v0, Lp1/a;->c:I

    const/16 v1, 0x30

    if-lt v0, v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x8

    invoke-virtual {p0, v0, v2}, LA1/d;->l(Ljava/lang/StringBuilder;I)V

    iget-object v2, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v2, Lv0/m;

    iget-object v3, v2, Lv0/m;->c:Ljava/lang/Object;

    check-cast v3, Lp1/a;

    const/4 v4, 0x2

    invoke-static {v1, v4, v3}, Lv0/m;->j(IILp1/a;)I

    move-result v3

    const-string v4, "(393"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x29

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, v2, Lv0/m;->c:Ljava/lang/Object;

    check-cast v3, Lp1/a;

    const/16 v4, 0x32

    const/16 v5, 0xa

    invoke-static {v4, v5, v3}, Lv0/m;->j(IILp1/a;)I

    move-result v3

    div-int/lit8 v4, v3, 0x64

    if-nez v4, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    div-int/lit8 v4, v3, 0xa

    if-nez v4, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x3c

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Lv0/m;->e(Ljava/lang/String;I)LA1/k;

    move-result-object v1

    iget-object v1, v1, LA1/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :pswitch_1
    iget-object v0, p0, LA1/f;->a:Ljava/lang/Object;

    check-cast v0, Lp1/a;

    iget v0, v0, Lp1/a;->c:I

    const/16 v1, 0x30

    if-lt v0, v1, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x8

    invoke-virtual {p0, v0, v2}, LA1/d;->l(Ljava/lang/StringBuilder;I)V

    iget-object v2, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v2, Lv0/m;

    iget-object v3, v2, Lv0/m;->c:Ljava/lang/Object;

    check-cast v3, Lp1/a;

    const/4 v4, 0x2

    invoke-static {v1, v4, v3}, Lv0/m;->j(IILp1/a;)I

    move-result v1

    const-string v3, "(392"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x32

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Lv0/m;->e(Ljava/lang/String;I)LA1/k;

    move-result-object v1

    iget-object v1, v1, LA1/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
