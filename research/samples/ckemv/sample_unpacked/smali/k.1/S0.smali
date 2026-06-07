.class public final Lk/S0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroidx/appcompat/widget/SearchView;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/SearchView;I)V
    .locals 0

    iput p2, p0, Lk/S0;->b:I

    iput-object p1, p0, Lk/S0;->c:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lk/S0;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk/S0;->c:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->P:LO/c;

    instance-of v1, v0, Lk/b1;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LO/c;->b(Landroid/database/Cursor;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lk/S0;->c:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView;->u()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
