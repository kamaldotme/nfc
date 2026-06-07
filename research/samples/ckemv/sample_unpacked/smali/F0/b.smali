.class public final LF0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final c:I

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LF0/b;->b:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/b;->e:Ljava/lang/Object;

    iput-object p2, p0, LF0/b;->d:Ljava/lang/Object;

    iput p3, p0, LF0/b;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LF0/b;->b:I

    iput-object p1, p0, LF0/b;->e:Ljava/lang/Object;

    iput p2, p0, LF0/b;->c:I

    iput-object p3, p0, LF0/b;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, LF0/b;->b:I

    iput-object p1, p0, LF0/b;->d:Ljava/lang/Object;

    iput-object p2, p0, LF0/b;->e:Ljava/lang/Object;

    iput p3, p0, LF0/b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, LF0/b;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LF0/b;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    iget-object v0, v0, Landroidx/work/impl/foreground/SystemForegroundService;->f:Landroid/app/NotificationManager;

    iget v1, p0, LF0/b;->c:I

    iget-object v2, p0, LF0/b;->d:Ljava/lang/Object;

    check-cast v2, Landroid/app/Notification;

    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void

    :pswitch_0
    iget v0, p0, LF0/b;->c:I

    iget-object v1, p0, LF0/b;->d:Ljava/lang/Object;

    check-cast v1, Lp0/j;

    iget-object v2, p0, LF0/b;->e:Ljava/lang/Object;

    check-cast v2, Landroid/content/Intent;

    invoke-virtual {v1, v2, v0}, Lp0/j;->a(Landroid/content/Intent;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, LF0/b;->e:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Typeface;

    iget v1, p0, LF0/b;->c:I

    iget-object v2, p0, LF0/b;->d:Ljava/lang/Object;

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    return-void

    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    iget-object v2, p0, LF0/b;->d:Ljava/lang/Object;

    check-cast v2, Landroid/content/IntentSender$SendIntentException;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, LF0/b;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/activity/g;

    iget v2, p0, LF0/b;->c:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Landroidx/activity/result/g;->a(IILandroid/content/Intent;)Z

    return-void

    :pswitch_3
    iget-object v0, p0, LF0/b;->d:Ljava/lang/Object;

    check-cast v0, LK/r;

    iget-object v0, v0, LK/r;->a:Ljava/lang/Object;

    iget-object v1, p0, LF0/b;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/activity/g;

    iget-object v2, v1, Landroidx/activity/result/g;->a:Ljava/util/HashMap;

    iget v3, p0, LF0/b;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, v1, Landroidx/activity/result/g;->e:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/activity/result/e;

    if-eqz v3, :cond_2

    iget-object v3, v3, Landroidx/activity/result/e;->a:Landroidx/activity/result/b;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v1, Landroidx/activity/result/g;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v3, v0}, Landroidx/activity/result/b;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v3, v1, Landroidx/activity/result/g;->g:Landroid/os/Bundle;

    invoke-virtual {v3, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/activity/result/g;->f:Ljava/util/HashMap;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    return-void

    :pswitch_4
    iget-object v0, p0, LF0/b;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v1, p0, LF0/b;->d:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    iget v2, p0, LF0/b;->c:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E(Landroid/view/View;IZ)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
