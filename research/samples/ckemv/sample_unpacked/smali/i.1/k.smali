.class public final Li/k;
.super Lv0/f;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public e:Z

.field public f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li/k;->d:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li/k;->g:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Li/k;->e:Z

    .line 4
    iput p1, p0, Li/k;->f:I

    return-void
.end method

.method public constructor <init>(Lk/n1;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li/k;->d:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Li/k;->g:Ljava/lang/Object;

    iput p2, p0, Li/k;->f:I

    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Li/k;->e:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, Li/k;->d:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Li/k;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Li/k;->g:Ljava/lang/Object;

    check-cast v0, Lk/n1;

    iget-object v0, v0, Lk/n1;->a:Landroidx/appcompat/widget/Toolbar;

    iget v1, p0, Li/k;->f:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void

    :pswitch_0
    iget v0, p0, Li/k;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Li/k;->f:I

    iget-object v1, p0, Li/k;->g:Ljava/lang/Object;

    check-cast v1, Li/l;

    iget-object v2, v1, Li/l;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v0, v2, :cond_2

    iget-object v0, v1, Li/l;->d:LJ/c0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LJ/c0;->a()V

    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Li/k;->f:I

    iput-boolean v0, p0, Li/k;->e:Z

    iput-boolean v0, v1, Li/l;->e:Z

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Landroid/view/View;)V
    .locals 0

    iget p1, p0, Li/k;->d:I

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Li/k;->e:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final g()V
    .locals 2

    iget v0, p0, Li/k;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li/k;->g:Ljava/lang/Object;

    check-cast v0, Lk/n1;

    iget-object v0, v0, Lk/n1;->a:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_0
    iget-boolean v0, p0, Li/k;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Li/k;->e:Z

    iget-object v0, p0, Li/k;->g:Ljava/lang/Object;

    check-cast v0, Li/l;

    iget-object v0, v0, Li/l;->d:LJ/c0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LJ/c0;->g()V

    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
