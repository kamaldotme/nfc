.class public final Ld1/m;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ld1/o;


# direct methods
.method public synthetic constructor <init>(Ld1/o;I)V
    .locals 0

    iput p2, p0, Ld1/m;->b:I

    iput-object p1, p0, Ld1/m;->c:Ld1/o;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget v0, p0, Ld1/m;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld1/m;->c:Ld1/o;

    invoke-virtual {v0}, Ld1/o;->clear()V

    return-void

    :pswitch_0
    iget-object v0, p0, Ld1/m;->c:Ld1/o;

    invoke-virtual {v0}, Ld1/o;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    iget v0, p0, Ld1/m;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld1/m;->c:Ld1/o;

    invoke-virtual {v0, p1}, Ld1/o;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Ld1/m;->c:Ld1/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    :try_start_0
    invoke-virtual {v0, v2, v1}, Ld1/o;->a(Ljava/lang/Object;Z)Ld1/n;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_1

    iget-object v2, v0, Ld1/n;->h:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move-object v3, v0

    :cond_1
    if-eqz v3, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget v0, p0, Ld1/m;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ld1/l;

    iget-object v1, p0, Ld1/m;->c:Ld1/o;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ld1/l;-><init>(Ld1/o;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Ld1/l;

    iget-object v1, p0, Ld1/m;->c:Ld1/o;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld1/l;-><init>(Ld1/o;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 5

    iget v0, p0, Ld1/m;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld1/m;->c:Ld1/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {v0, p1, v1}, Ld1/o;->a(Ljava/lang/Object;Z)Ld1/n;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    const/4 p1, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2, p1}, Ld1/o;->c(Ld1/n;Z)V

    :cond_1
    if-eqz v2, :cond_2

    move v1, p1

    :cond_2
    return v1

    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Ld1/m;->c:Ld1/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    :try_start_1
    invoke-virtual {v0, v2, v1}, Ld1/o;->a(Ljava/lang/Object;Z)Ld1/n;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    :cond_4
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_5

    iget-object v4, v2, Ld1/n;->h:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    move-object v3, v2

    :cond_5
    if-nez v3, :cond_6

    goto :goto_1

    :cond_6
    const/4 v1, 0x1

    invoke-virtual {v0, v3, v1}, Ld1/o;->c(Ld1/n;Z)V

    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Ld1/m;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld1/m;->c:Ld1/o;

    iget v0, v0, Ld1/o;->e:I

    return v0

    :pswitch_0
    iget-object v0, p0, Ld1/m;->c:Ld1/o;

    iget v0, v0, Ld1/o;->e:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
