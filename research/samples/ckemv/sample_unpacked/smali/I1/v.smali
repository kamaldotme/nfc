.class public final LI1/v;
.super La/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LI1/v;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final G(Landroid/content/Intent;I)Ljava/lang/Object;
    .locals 9

    iget v1, p0, LI1/v;->b:I

    packed-switch v1, :pswitch_data_0

    new-instance v1, Landroidx/activity/result/a;

    invoke-direct {v1, p1, p2}, Landroidx/activity/result/a;-><init>(Landroid/content/Intent;I)V

    return-object v1

    :pswitch_0
    sget-object v1, LL1/u;->b:LL1/u;

    const/4 v2, -0x1

    if-eq p2, v2, :cond_0

    goto/16 :goto_3

    :cond_0
    if-nez p1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v0, "androidx.activity.result.contract.extra.PERMISSIONS"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v2, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object v2

    if-eqz v2, :cond_6

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    array-length v3, v2

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_4

    aget v6, v2, v5

    if-nez v6, :cond_3

    const/4 v6, 0x1

    goto :goto_1

    :cond_3
    move v6, v4

    :goto_1
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    invoke-static {v0}, LL1/j;->V([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v0}, LL1/m;->S(Ljava/lang/Iterable;)I

    move-result v0

    invoke-static {v1}, LL1/m;->S(Ljava/lang/Iterable;)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    new-instance v5, LK1/c;

    invoke-direct {v5, v0, v1}, LK1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v4}, LL1/x;->P(Ljava/util/ArrayList;)Ljava/util/Map;

    move-result-object v1

    :cond_6
    :goto_3
    return-object v1

    :pswitch_1
    new-instance v1, Landroidx/activity/result/a;

    invoke-direct {v1, p1, p2}, Landroidx/activity/result/a;-><init>(Landroid/content/Intent;I)V

    return-object v1

    :pswitch_2
    const/4 v1, -0x1

    if-ne p2, v1, :cond_8

    const-string v0, "SCAN_RESULT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "SCAN_RESULT_FORMAT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "SCAN_RESULT_BYTES"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v3

    const-string v0, "SCAN_RESULT_ORIENTATION"

    const/high16 v4, -0x80000000

    invoke-virtual {p1, v0, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v4, :cond_7

    const/4 v0, 0x0

    :goto_4
    move-object v4, v0

    goto :goto_5

    :cond_7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_4

    :goto_5
    const-string v0, "SCAN_RESULT_ERROR_CORRECTION_LEVEL"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "SCAN_RESULT_IMAGE_PATH"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, LI1/w;

    move-object v0, v8

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, LI1/w;-><init>(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V

    goto :goto_6

    :cond_8
    new-instance v8, LI1/w;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v8

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, LI1/w;-><init>(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V

    :goto_6
    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Landroidx/activity/k;LI1/x;)Landroid/content/Intent;
    .locals 4

    iget v0, p0, LI1/v;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Landroid/content/Intent;

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2

    :pswitch_0
    check-cast p2, [Ljava/lang/String;

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-string v0, "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "androidx.activity.result.contract.extra.PERMISSIONS"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "Intent(ACTION_REQUEST_PE\u2026EXTRA_PERMISSIONS, input)"

    invoke-static {p1, p2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_1
    check-cast p2, Landroidx/activity/result/i;

    new-instance p1, Landroid/content/Intent;

    const-string v0, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v0, p2, Landroidx/activity/result/i;->c:Landroid/content/Intent;

    if-eqz v0, :cond_0

    const-string v1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-string v1, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "intentSender"

    iget-object v1, p2, Landroidx/activity/result/i;->b:Landroid/content/IntentSender;

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/activity/result/i;

    iget v2, p2, Landroidx/activity/result/i;->e:I

    const/4 v3, 0x0

    iget p2, p2, Landroidx/activity/result/i;->d:I

    invoke-direct {v0, v1, v3, p2, v2}, Landroidx/activity/result/i;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    move-object p2, v0

    :cond_0
    const-string v0, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p2, "FragmentManager"

    const/4 v0, 0x2

    invoke-static {p2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_1
    return-object p1

    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p2, LI1/x;->c:Ljava/lang/Class;

    if-nez v1, :cond_2

    const-class v1, Lcom/journeyapps/barcodescanner/CaptureActivity;

    iput-object v1, p2, LI1/x;->c:Ljava/lang/Class;

    :cond_2
    iget-object v1, p2, LI1/x;->c:Ljava/lang/Class;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "com.google.zxing.client.android.SCAN"

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p2, LI1/x;->b:Ljava/util/List;

    if-eqz p1, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p2, LI1/x;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_3

    const/16 v3, 0x2c

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_4
    const-string v1, "SCAN_FORMATS"

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_5
    const/high16 p1, 0x4000000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p1, 0x80000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object p1, p2, LI1/x;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    instance-of v2, p2, Ljava/lang/Integer;

    if-eqz v2, :cond_6

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_1

    :cond_6
    instance-of v2, p2, Ljava/lang/Long;

    if-eqz v2, :cond_7

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_1

    :cond_7
    instance-of v2, p2, Ljava/lang/Boolean;

    if-eqz v2, :cond_8

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_1

    :cond_8
    instance-of v2, p2, Ljava/lang/Double;

    if-eqz v2, :cond_9

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_1

    :cond_9
    instance-of v2, p2, Ljava/lang/Float;

    if-eqz v2, :cond_a

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_1

    :cond_a
    instance-of v2, p2, Landroid/os/Bundle;

    if-eqz v2, :cond_b

    check-cast p2, Landroid/os/Bundle;

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    goto :goto_1

    :cond_b
    instance-of v2, p2, [I

    if-eqz v2, :cond_c

    check-cast p2, [I

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    goto :goto_1

    :cond_c
    instance-of v2, p2, [J

    if-eqz v2, :cond_d

    check-cast p2, [J

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[J)Landroid/content/Intent;

    goto :goto_1

    :cond_d
    instance-of v2, p2, [Z

    if-eqz v2, :cond_e

    check-cast p2, [Z

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Z)Landroid/content/Intent;

    goto :goto_1

    :cond_e
    instance-of v2, p2, [D

    if-eqz v2, :cond_f

    check-cast p2, [D

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[D)Landroid/content/Intent;

    goto :goto_1

    :cond_f
    instance-of v2, p2, [F

    if-eqz v2, :cond_10

    check-cast p2, [F

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[F)Landroid/content/Intent;

    goto/16 :goto_1

    :cond_10
    instance-of v2, p2, [Ljava/lang/String;

    if-eqz v2, :cond_11

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    goto/16 :goto_1

    :cond_11
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto/16 :goto_1

    :cond_12
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public w(Landroidx/activity/k;LI1/x;)LK/r;
    .locals 4

    iget v0, p0, LI1/v;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, La/a;->w(Landroidx/activity/k;LI1/x;)LK/r;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p2, [Ljava/lang/String;

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    if-nez v0, :cond_0

    new-instance p1, LK/r;

    sget-object p2, LL1/u;->b:LL1/u;

    invoke-direct {p1, p2}, LK/r;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p2, v2

    invoke-static {p1, v3}, Ly/f;->a(Landroid/app/Activity;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    array-length p1, p2

    invoke-static {p1}, LL1/x;->O(I)I

    move-result p1

    const/16 v0, 0x10

    if-ge p1, v0, :cond_3

    move p1, v0

    :cond_3
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length p1, p2

    :goto_1
    if-ge v1, p1, :cond_4

    aget-object v2, p2, v1

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    new-instance p1, LK/r;

    invoke-direct {p1, v0}, LK/r;-><init>(Ljava/lang/Object;)V

    :goto_2
    return-object p1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
