.class public final Lj/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/z;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public b:Landroid/content/Context;

.field public c:Landroid/view/LayoutInflater;

.field public d:Lj/m;

.field public e:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public f:Lj/y;

.field public g:Lj/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/i;->b:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lj/i;->c:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public final a(Lj/m;Z)V
    .locals 1

    iget-object v0, p0, Lj/i;->f:Lj/y;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lj/y;->a(Lj/m;Z)V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lj/i;->g:Lj/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/h;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final d(Lj/o;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final e(Landroid/content/Context;Lj/m;)V
    .locals 1

    iget-object v0, p0, Lj/i;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lj/i;->b:Landroid/content/Context;

    iget-object v0, p0, Lj/i;->c:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lj/i;->c:Landroid/view/LayoutInflater;

    :cond_0
    iput-object p2, p0, Lj/i;->d:Lj/m;

    iget-object p1, p0, Lj/i;->g:Lj/h;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lj/h;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final h(Lj/y;)V
    .locals 0

    iput-object p1, p0, Lj/i;->f:Lj/y;

    return-void
.end method

.method public final j(Lj/F;)Z
    .locals 6

    invoke-virtual {p1}, Lj/m;->hasVisibleItems()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, Lj/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lj/n;->b:Lj/m;

    new-instance v1, LF0/e;

    iget-object v2, p1, Lj/m;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, LF0/e;-><init>(Landroid/content/Context;)V

    new-instance v3, Lj/i;

    iget-object v4, v1, LF0/e;->c:Ljava/lang/Object;

    check-cast v4, Lf/b;

    iget-object v5, v4, Lf/b;->a:Landroid/content/Context;

    invoke-direct {v3, v5}, Lj/i;-><init>(Landroid/content/Context;)V

    iput-object v3, v0, Lj/n;->d:Lj/i;

    iput-object v0, v3, Lj/i;->f:Lj/y;

    invoke-virtual {p1, v3, v2}, Lj/m;->b(Lj/z;Landroid/content/Context;)V

    iget-object v2, v0, Lj/n;->d:Lj/i;

    iget-object v3, v2, Lj/i;->g:Lj/h;

    if-nez v3, :cond_1

    new-instance v3, Lj/h;

    invoke-direct {v3, v2}, Lj/h;-><init>(Lj/i;)V

    iput-object v3, v2, Lj/i;->g:Lj/h;

    :cond_1
    iget-object v2, v2, Lj/i;->g:Lj/h;

    iput-object v2, v4, Lf/b;->g:Landroid/widget/ListAdapter;

    iput-object v0, v4, Lf/b;->h:Landroid/content/DialogInterface$OnClickListener;

    iget-object v2, p1, Lj/m;->o:Landroid/view/View;

    if-eqz v2, :cond_2

    iput-object v2, v4, Lf/b;->e:Landroid/view/View;

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lj/m;->n:Landroid/graphics/drawable/Drawable;

    iput-object v2, v4, Lf/b;->c:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Lj/m;->m:Ljava/lang/CharSequence;

    iput-object v2, v4, Lf/b;->d:Ljava/lang/CharSequence;

    :goto_0
    iput-object v0, v4, Lf/b;->f:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v1}, LF0/e;->a()Lf/f;

    move-result-object v1

    iput-object v1, v0, Lj/n;->c:Lf/f;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, v0, Lj/n;->c:Lf/f;

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/16 v2, 0x3eb

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v3, 0x20000

    or-int/2addr v2, v3

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object v0, v0, Lj/n;->c:Lf/f;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Lj/i;->f:Lj/y;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Lj/y;->b(Lj/m;)Z

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final k(Lj/o;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    iget-object p1, p0, Lj/i;->d:Lj/m;

    iget-object p2, p0, Lj/i;->g:Lj/h;

    invoke-virtual {p2, p3}, Lj/h;->b(I)Lj/o;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Lj/m;->q(Landroid/view/MenuItem;Lj/z;I)Z

    return-void
.end method
