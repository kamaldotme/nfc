.class public final Lj/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lj/f;

.field public final synthetic c:Landroid/view/MenuItem;

.field public final synthetic d:Lj/m;

.field public final synthetic e:Lf/G;


# direct methods
.method public constructor <init>(Lf/G;Lj/f;Lj/o;Lj/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/e;->e:Lf/G;

    iput-object p2, p0, Lj/e;->b:Lj/f;

    iput-object p3, p0, Lj/e;->c:Landroid/view/MenuItem;

    iput-object p4, p0, Lj/e;->d:Lj/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lj/e;->b:Lj/f;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lj/e;->e:Lf/G;

    iget-object v2, v1, Lf/G;->b:Ljava/lang/Object;

    check-cast v2, Lj/g;

    const/4 v3, 0x1

    iput-boolean v3, v2, Lj/g;->B:Z

    iget-object v0, v0, Lj/f;->b:Lj/m;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lj/m;->c(Z)V

    iget-object v0, v1, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Lj/g;

    iput-boolean v2, v0, Lj/g;->B:Z

    :cond_0
    iget-object v0, p0, Lj/e;->c:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    iget-object v2, p0, Lj/e;->d:Lj/m;

    const/4 v3, 0x4

    invoke-virtual {v2, v0, v1, v3}, Lj/m;->q(Landroid/view/MenuItem;Lj/z;I)Z

    :cond_1
    return-void
.end method
