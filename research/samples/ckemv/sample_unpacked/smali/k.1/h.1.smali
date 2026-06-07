.class public final Lk/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Lk/f;

.field public final synthetic c:Lk/j;


# direct methods
.method public constructor <init>(Lk/j;Lk/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/h;->c:Lk/j;

    iput-object p2, p0, Lk/h;->b:Lk/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lk/h;->c:Lk/j;

    iget-object v1, v0, Lk/j;->d:Lj/m;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lj/m;->e:Lj/k;

    if-eqz v2, :cond_0

    invoke-interface {v2, v1}, Lj/k;->e(Lj/m;)V

    :cond_0
    iget-object v1, v0, Lk/j;->i:Lj/B;

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lk/h;->b:Lk/f;

    invoke-virtual {v1}, Lj/x;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v1, Lj/x;->f:Landroid/view/View;

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v2, v2}, Lj/x;->d(IIZZ)V

    :goto_0
    iput-object v1, v0, Lk/j;->t:Lk/f;

    :cond_3
    :goto_1
    const/4 v1, 0x0

    iput-object v1, v0, Lk/j;->v:Lk/h;

    return-void
.end method
