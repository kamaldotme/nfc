.class public abstract Landroidx/lifecycle/u;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;


# instance fields
.field public final b:Lv0/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lv0/m;

    invoke-direct {v0, p0}, Lv0/m;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/lifecycle/u;->b:Lv0/m;

    return-void
.end method


# virtual methods
.method public final d()Landroidx/lifecycle/t;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/u;->b:Lv0/m;

    iget-object v0, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/t;

    return-object v0
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/l;->ON_START:Landroidx/lifecycle/l;

    iget-object v0, p0, Landroidx/lifecycle/u;->b:Lv0/m;

    invoke-virtual {v0, p1}, Lv0/m;->G(Landroidx/lifecycle/l;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 2

    sget-object v0, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    iget-object v1, p0, Landroidx/lifecycle/u;->b:Lv0/m;

    invoke-virtual {v1, v0}, Lv0/m;->G(Landroidx/lifecycle/l;)V

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    iget-object v1, p0, Landroidx/lifecycle/u;->b:Lv0/m;

    invoke-virtual {v1, v0}, Lv0/m;->G(Landroidx/lifecycle/l;)V

    sget-object v0, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    invoke-virtual {v1, v0}, Lv0/m;->G(Landroidx/lifecycle/l;)V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final onStart(Landroid/content/Intent;I)V
    .locals 2

    sget-object v0, Landroidx/lifecycle/l;->ON_START:Landroidx/lifecycle/l;

    iget-object v1, p0, Landroidx/lifecycle/u;->b:Lv0/m;

    invoke-virtual {v1, v0}, Lv0/m;->G(Landroidx/lifecycle/l;)V

    invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result p1

    return p1
.end method
