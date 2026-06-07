.class public final Landroidx/fragment/app/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/c;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld0/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/fragment/app/o;->a:I

    const-string v0, "registry"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/o;->b:Ljava/lang/Object;

    .line 4
    const-string v0, "androidx.savedstate.Restarter"

    invoke-virtual {p1, v0, p0}, Ld0/d;->e(Ljava/lang/String;Ld0/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Lxyz/happify/ckemv/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/fragment/app/o;->a:I

    iput-object p1, p0, Landroidx/fragment/app/o;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 4

    iget v0, p0, Landroidx/fragment/app/o;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/o;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashSet;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v2, "classes_to_restore"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0

    :pswitch_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/o;->b:Ljava/lang/Object;

    check-cast v1, Lf/g;

    invoke-virtual {v1}, Lf/g;->k()Lf/k;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :pswitch_1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/o;->b:Ljava/lang/Object;

    check-cast v1, Lf/g;

    iget-object v2, v1, Lf/g;->r:LA/h;

    iget-object v2, v2, LA/h;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/fragment/app/q;

    iget-object v2, v2, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-static {v2}, Lf/g;->n(Landroidx/fragment/app/B;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Lf/g;->s:Landroidx/lifecycle/t;

    sget-object v3, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    iget-object v1, v1, Lf/g;->r:LA/h;

    iget-object v1, v1, LA/h;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/q;

    iget-object v1, v1, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {v1}, Landroidx/fragment/app/B;->O()Landroidx/fragment/app/C;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "android:support:fragments"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
