.class public final Lj/b;
.super Lk/x0;
.source "SourceFile"


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lj/b;->k:I

    .line 1
    iput-object p1, p0, Lj/b;->l:Landroid/view/View;

    .line 2
    invoke-direct {p0, p1}, Lk/x0;-><init>(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lk/i;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj/b;->k:I

    .line 3
    iput-object p1, p0, Lj/b;->l:Landroid/view/View;

    invoke-direct {p0, p2}, Lk/x0;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()Lj/D;
    .locals 2

    iget v0, p0, Lj/b;->k:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj/b;->l:Landroid/view/View;

    check-cast v0, Lk/i;

    iget-object v0, v0, Lk/i;->e:Lk/j;

    iget-object v0, v0, Lk/j;->t:Lk/f;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lj/x;->a()Lj/u;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lj/b;->l:Landroid/view/View;

    check-cast v0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->n:Lj/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast v0, Lk/g;

    iget-object v0, v0, Lk/g;->a:Lk/j;

    iget-object v0, v0, Lk/j;->u:Lk/f;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lj/x;->a()Lj/u;

    move-result-object v1

    :cond_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Z
    .locals 3

    iget v0, p0, Lj/b;->k:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj/b;->l:Landroid/view/View;

    check-cast v0, Lk/i;

    iget-object v0, v0, Lk/i;->e:Lk/j;

    invoke-virtual {v0}, Lk/j;->l()Z

    const/4 v0, 0x1

    return v0

    :pswitch_0
    iget-object v0, p0, Lj/b;->l:Landroid/view/View;

    check-cast v0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v1, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->l:Lj/l;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->i:Lj/o;

    invoke-interface {v1, v0}, Lj/l;->d(Lj/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj/b;->b()Lj/D;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lj/D;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()Z
    .locals 2

    iget v0, p0, Lj/b;->k:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lk/x0;->d()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lj/b;->l:Landroid/view/View;

    check-cast v0, Lk/i;

    iget-object v0, v0, Lk/i;->e:Lk/j;

    iget-object v1, v0, Lk/j;->v:Lk/h;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lk/j;->f()Z

    const/4 v0, 0x1

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
