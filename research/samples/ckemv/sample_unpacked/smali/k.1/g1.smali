.class public final Lk/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/m;
.implements Lj/k;


# instance fields
.field public final synthetic b:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .locals 0

    iput-object p1, p0, Lk/g1;->b:Landroidx/appcompat/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lj/m;)V
    .locals 1

    iget-object p1, p0, Lk/g1;->b:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->u:Lk/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk/j;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->H:LA/h;

    iget-object p1, p1, LA/h;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public g(Lj/m;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Lk/g1;->b:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1
.end method
