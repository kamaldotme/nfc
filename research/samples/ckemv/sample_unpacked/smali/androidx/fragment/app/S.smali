.class public final Landroidx/fragment/app/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroidx/fragment/app/T;

.field public final synthetic d:Landroidx/fragment/app/g;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/g;Landroidx/fragment/app/T;I)V
    .locals 0

    iput p3, p0, Landroidx/fragment/app/S;->b:I

    iput-object p1, p0, Landroidx/fragment/app/S;->d:Landroidx/fragment/app/g;

    iput-object p2, p0, Landroidx/fragment/app/S;->c:Landroidx/fragment/app/T;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Landroidx/fragment/app/S;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/fragment/app/S;->d:Landroidx/fragment/app/g;

    iget-object v1, v0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/S;->c:Landroidx/fragment/app/T;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v0, Landroidx/fragment/app/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/S;->d:Landroidx/fragment/app/g;

    iget-object v0, v0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/S;->c:Landroidx/fragment/app/T;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, v1, Landroidx/fragment/app/T;->a:I

    iget-object v1, v1, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    iget-object v1, v1, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-static {v1, v0}, LX/d;->a(Landroid/view/View;I)V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
