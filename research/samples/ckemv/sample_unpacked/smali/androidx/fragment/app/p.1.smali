.class public final Landroidx/fragment/app/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf/g;


# direct methods
.method public synthetic constructor <init>(Lxyz/happify/ckemv/MainActivity;I)V
    .locals 0

    iput p2, p0, Landroidx/fragment/app/p;->a:I

    iput-object p1, p0, Landroidx/fragment/app/p;->b:Lf/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget v0, p0, Landroidx/fragment/app/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/fragment/app/p;->b:Lf/g;

    invoke-virtual {v0}, Lf/g;->k()Lf/k;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lf/v;

    iget-object v3, v2, Lf/v;->l:Landroid/content/Context;

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-virtual {v3, v2}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v2

    instance-of v2, v2, Lf/v;

    :goto_0
    iget-object v0, v0, Landroidx/activity/k;->f:Landroidx/activity/l;

    iget-object v0, v0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ld0/d;

    const-string v2, "androidx:appcompat"

    invoke-virtual {v0, v2}, Ld0/d;->c(Ljava/lang/String;)Landroid/os/Bundle;

    invoke-virtual {v1}, Lf/k;->c()V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/p;->b:Lf/g;

    iget-object v1, v0, Lf/g;->r:LA/h;

    iget-object v1, v1, LA/h;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/q;

    iget-object v2, v1, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v1, v3}, Landroidx/fragment/app/B;->b(Landroidx/fragment/app/q;Lv0/f;Landroidx/fragment/app/n;)V

    iget-object v1, v0, Landroidx/activity/k;->f:Landroidx/activity/l;

    iget-object v1, v1, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v1, Ld0/d;

    const-string v2, "android:support:fragments"

    invoke-virtual {v1, v2}, Ld0/d;->c(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    iget-object v0, v0, Lf/g;->r:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    instance-of v2, v0, Landroidx/lifecycle/P;

    if-eqz v2, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/B;->N(Landroid/os/Parcelable;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you\'re still using retainNestedNonConfig()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
