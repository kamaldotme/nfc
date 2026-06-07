.class public final Lk/f;
.super Lj/x;
.source "SourceFile"


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Lk/j;


# direct methods
.method public constructor <init>(Lk/j;Landroid/content/Context;Lj/F;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Lk/f;->m:I

    .line 8
    iput-object p1, p0, Lk/f;->n:Lk/j;

    const/4 v7, 0x0

    const v2, 0x7f030020

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p2

    move-object v5, p4

    move-object v6, p3

    .line 9
    invoke-direct/range {v1 .. v7}, Lj/x;-><init>(IILandroid/content/Context;Landroid/view/View;Lj/m;Z)V

    .line 10
    iget-object p2, p3, Lj/F;->A:Lj/o;

    .line 11
    invoke-virtual {p2}, Lj/o;->f()Z

    move-result p2

    if-nez p2, :cond_1

    .line 12
    iget-object p2, p1, Lk/j;->j:Lk/i;

    if-nez p2, :cond_0

    .line 13
    iget-object p2, p1, Lk/j;->i:Lj/B;

    .line 14
    check-cast p2, Landroid/view/View;

    .line 15
    :cond_0
    iput-object p2, p0, Lj/x;->f:Landroid/view/View;

    .line 16
    :cond_1
    iget-object p1, p1, Lk/j;->x:Lf/G;

    .line 17
    iput-object p1, p0, Lj/x;->i:Lj/y;

    .line 18
    iget-object p2, p0, Lj/x;->j:Lj/u;

    if-eqz p2, :cond_2

    .line 19
    invoke-interface {p2, p1}, Lj/z;->h(Lj/y;)V

    :cond_2
    return-void
.end method

.method public constructor <init>(Lk/j;Landroid/content/Context;Lj/m;Lk/i;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Lk/f;->m:I

    .line 1
    iput-object p1, p0, Lk/f;->n:Lk/j;

    const/4 v3, 0x0

    const v2, 0x7f030020

    const/4 v7, 0x1

    move-object v1, p0

    move-object v4, p2

    move-object v5, p4

    move-object v6, p3

    .line 2
    invoke-direct/range {v1 .. v7}, Lj/x;-><init>(IILandroid/content/Context;Landroid/view/View;Lj/m;Z)V

    const p2, 0x800005

    .line 3
    iput p2, p0, Lj/x;->g:I

    .line 4
    iget-object p1, p1, Lk/j;->x:Lf/G;

    .line 5
    iput-object p1, p0, Lj/x;->i:Lj/y;

    .line 6
    iget-object p2, p0, Lj/x;->j:Lj/u;

    if-eqz p2, :cond_0

    .line 7
    invoke-interface {p2, p1}, Lj/z;->h(Lj/y;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget v0, p0, Lk/f;->m:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk/f;->n:Lk/j;

    iget-object v1, v0, Lk/j;->d:Lj/m;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lj/m;->c(Z)V

    :cond_0
    const/4 v1, 0x0

    iput-object v1, v0, Lk/j;->t:Lk/f;

    invoke-super {p0}, Lj/x;->c()V

    return-void

    :pswitch_0
    const/4 v0, 0x0

    iget-object v1, p0, Lk/f;->n:Lk/j;

    iput-object v0, v1, Lk/j;->u:Lk/f;

    invoke-super {p0}, Lj/x;->c()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
