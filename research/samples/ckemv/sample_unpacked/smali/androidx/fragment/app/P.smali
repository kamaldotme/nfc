.class public final Landroidx/fragment/app/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/h;
.implements Ld0/e;
.implements Landroidx/lifecycle/P;


# instance fields
.field public final b:Landroidx/lifecycle/O;

.field public c:Landroidx/lifecycle/t;

.field public d:Landroidx/activity/l;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/O;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/P;->c:Landroidx/lifecycle/t;

    iput-object v0, p0, Landroidx/fragment/app/P;->d:Landroidx/activity/l;

    iput-object p1, p0, Landroidx/fragment/app/P;->b:Landroidx/lifecycle/O;

    return-void
.end method


# virtual methods
.method public final b()Ld0/d;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/P;->f()V

    iget-object v0, p0, Landroidx/fragment/app/P;->d:Landroidx/activity/l;

    iget-object v0, v0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ld0/d;

    return-object v0
.end method

.method public final c()Landroidx/lifecycle/O;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/P;->f()V

    iget-object v0, p0, Landroidx/fragment/app/P;->b:Landroidx/lifecycle/O;

    return-object v0
.end method

.method public final d()Landroidx/lifecycle/t;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/P;->f()V

    iget-object v0, p0, Landroidx/fragment/app/P;->c:Landroidx/lifecycle/t;

    return-object v0
.end method

.method public final e(Landroidx/lifecycle/l;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/P;->c:Landroidx/lifecycle/t;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/P;->c:Landroidx/lifecycle/t;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/fragment/app/P;->c:Landroidx/lifecycle/t;

    new-instance v0, Landroidx/activity/l;

    invoke-direct {v0, p0}, Landroidx/activity/l;-><init>(Ld0/e;)V

    iput-object v0, p0, Landroidx/fragment/app/P;->d:Landroidx/activity/l;

    :cond_0
    return-void
.end method
