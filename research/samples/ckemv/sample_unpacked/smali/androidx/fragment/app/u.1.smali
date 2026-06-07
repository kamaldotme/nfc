.class public final Landroidx/fragment/app/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/b;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroidx/fragment/app/B;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/B;I)V
    .locals 0

    iput p2, p0, Landroidx/fragment/app/u;->b:I

    iput-object p1, p0, Landroidx/fragment/app/u;->c:Landroidx/fragment/app/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Landroidx/fragment/app/u;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/activity/result/a;

    iget-object v0, p0, Landroidx/fragment/app/u;->c:Landroidx/fragment/app/B;

    iget-object v1, v0, Landroidx/fragment/app/B;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/y;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v1, Landroidx/fragment/app/y;->b:Ljava/lang/String;

    iget-object v0, v0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0, v1}, Lv0/m;->l(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget v1, p1, Landroidx/activity/result/a;->b:I

    const-string v1, "FragmentManager"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    iget-object p1, p1, Landroidx/activity/result/a;->c:Landroid/content/Intent;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    :goto_0
    return-void

    :pswitch_0
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [I

    move v2, v1

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v1

    goto :goto_2

    :cond_3
    const/4 v3, -0x1

    :goto_2
    aput v3, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    iget-object p1, p0, Landroidx/fragment/app/u;->c:Landroidx/fragment/app/B;

    iget-object v0, p1, Landroidx/fragment/app/B;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/y;

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    iget-object v0, v0, Landroidx/fragment/app/y;->b:Ljava/lang/String;

    iget-object p1, p1, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {p1, v0}, Lv0/m;->l(Ljava/lang/String;)Landroidx/fragment/app/n;

    :goto_3
    return-void

    :pswitch_1
    check-cast p1, Landroidx/activity/result/a;

    iget-object v0, p0, Landroidx/fragment/app/u;->c:Landroidx/fragment/app/B;

    iget-object v1, v0, Landroidx/fragment/app/B;->w:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/y;

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    iget-object v1, v1, Landroidx/fragment/app/y;->b:Ljava/lang/String;

    iget-object v0, v0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0, v1}, Lv0/m;->l(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    iget v1, p1, Landroidx/activity/result/a;->b:I

    const-string v1, "FragmentManager"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    iget-object p1, p1, Landroidx/activity/result/a;->c:Landroid/content/Intent;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_8
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
