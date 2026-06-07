.class public final Landroidx/activity/n;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/a;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Landroidx/activity/u;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/u;I)V
    .locals 0

    iput p2, p0, Landroidx/activity/n;->c:I

    iput-object p1, p0, Landroidx/activity/n;->d:Landroidx/activity/u;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LX1/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Landroidx/activity/n;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/activity/n;->d:Landroidx/activity/u;

    invoke-virtual {v0}, Landroidx/activity/u;->b()V

    sget-object v0, LK1/h;->a:LK1/h;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/activity/n;->d:Landroidx/activity/u;

    iget-object v1, v0, Landroidx/activity/u;->b:LL1/i;

    invoke-virtual {v1}, LL1/f;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroidx/fragment/app/v;

    iget-boolean v4, v4, Landroidx/fragment/app/v;->a:Z

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    check-cast v2, Landroidx/fragment/app/v;

    iput-object v3, v0, Landroidx/activity/u;->c:Landroidx/fragment/app/v;

    sget-object v0, LK1/h;->a:LK1/h;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Landroidx/activity/n;->d:Landroidx/activity/u;

    invoke-virtual {v0}, Landroidx/activity/u;->b()V

    sget-object v0, LK1/h;->a:LK1/h;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
