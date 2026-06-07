.class public final LO/b;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LO/b;->a:I

    iput-object p2, p0, LO/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    iget v0, p0, LO/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LO/b;->b:Ljava/lang/Object;

    check-cast v0, Lk/G0;

    iget-object v1, v0, Lk/G0;->A:Lk/A;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lk/G0;->i()V

    :cond_0
    return-void

    :pswitch_0
    const/4 v0, 0x1

    iget-object v1, p0, LO/b;->b:Ljava/lang/Object;

    check-cast v1, LO/c;

    iput-boolean v0, v1, LO/c;->b:Z

    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onInvalidated()V
    .locals 2

    iget v0, p0, LO/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LO/b;->b:Ljava/lang/Object;

    check-cast v0, Lk/G0;

    invoke-virtual {v0}, Lk/G0;->dismiss()V

    return-void

    :pswitch_0
    const/4 v0, 0x0

    iget-object v1, p0, LO/b;->b:Ljava/lang/Object;

    check-cast v1, LO/c;

    iput-boolean v0, v1, LO/c;->b:Z

    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
