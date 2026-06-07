.class public abstract Landroidx/fragment/app/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Landroidx/lifecycle/r;
.implements Landroidx/lifecycle/P;
.implements Landroidx/lifecycle/h;
.implements Ld0/e;


# static fields
.field public static final R:Ljava/lang/Object;


# instance fields
.field public A:Z

.field public B:Z

.field public final C:Z

.field public D:Z

.field public E:Landroid/view/ViewGroup;

.field public F:Landroid/view/View;

.field public G:Z

.field public H:Z

.field public I:Landroidx/fragment/app/m;

.field public J:Z

.field public K:Z

.field public L:Landroidx/lifecycle/m;

.field public M:Landroidx/lifecycle/t;

.field public N:Landroidx/fragment/app/P;

.field public final O:Landroidx/lifecycle/y;

.field public P:Landroidx/activity/l;

.field public final Q:Ljava/util/ArrayList;

.field public b:I

.field public c:Landroid/os/Bundle;

.field public d:Landroid/util/SparseArray;

.field public e:Landroid/os/Bundle;

.field public f:Ljava/lang/String;

.field public g:Landroid/os/Bundle;

.field public h:Landroidx/fragment/app/n;

.field public i:Ljava/lang/String;

.field public j:I

.field public k:Ljava/lang/Boolean;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:I

.field public s:Landroidx/fragment/app/B;

.field public t:Landroidx/fragment/app/q;

.field public u:Landroidx/fragment/app/B;

.field public v:Landroidx/fragment/app/n;

.field public w:I

.field public x:I

.field public y:Ljava/lang/String;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/fragment/app/n;->R:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/n;->b:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/n;->k:Ljava/lang/Boolean;

    new-instance v0, Landroidx/fragment/app/B;

    invoke-direct {v0}, Landroidx/fragment/app/B;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->C:Z

    iput-boolean v0, p0, Landroidx/fragment/app/n;->H:Z

    sget-object v0, Landroidx/lifecycle/m;->f:Landroidx/lifecycle/m;

    iput-object v0, p0, Landroidx/fragment/app/n;->L:Landroidx/lifecycle/m;

    new-instance v0, Landroidx/lifecycle/y;

    invoke-direct {v0}, Landroidx/lifecycle/y;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/n;->O:Landroidx/lifecycle/y;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/n;->Q:Ljava/util/ArrayList;

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    new-instance v0, Landroidx/activity/l;

    invoke-direct {v0, p0}, Landroidx/activity/l;-><init>(Ld0/e;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->P:Landroidx/activity/l;

    return-void
.end method


# virtual methods
.method public final b()Ld0/d;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->P:Landroidx/activity/l;

    iget-object v0, v0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ld0/d;

    return-object v0
.end method

.method public final c()Landroidx/lifecycle/O;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/n;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iget-object v0, v0, Landroidx/fragment/app/D;->e:Ljava/util/HashMap;

    iget-object v1, p0, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/O;

    if-nez v1, :cond_0

    new-instance v1, Landroidx/lifecycle/O;

    invoke-direct {v1}, Landroidx/lifecycle/O;-><init>()V

    iget-object v2, p0, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Landroidx/lifecycle/t;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    return-object v0
.end method

.method public e()Lv0/f;
    .locals 1

    new-instance v0, Landroidx/fragment/app/l;

    invoke-direct {v0, p0}, Landroidx/fragment/app/l;-><init>(Landroidx/fragment/app/n;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()Landroidx/fragment/app/m;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/fragment/app/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Landroidx/fragment/app/n;->R:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/fragment/app/m;->g:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/fragment/app/m;->h:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/fragment/app/m;->i:Ljava/lang/Object;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Landroidx/fragment/app/m;->j:F

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/fragment/app/m;->k:Landroid/view/View;

    iput-object v0, p0, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    return-object v0
.end method

.method public final g()Landroidx/fragment/app/B;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has not been attached yet."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/q;->e:Landroid/content/Context;

    :goto_0
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/n;->L:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/n;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/n;

    invoke-virtual {v1}, Landroidx/fragment/app/n;->i()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public final j()Landroidx/fragment/app/B;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not associated with a fragment manager."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k(Landroid/content/Context;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/n;->D:Z

    iget-object v0, p0, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/q;->d:Landroid/app/Activity;

    :goto_0
    if-eqz v0, :cond_1

    iput-boolean p1, p0, Landroidx/fragment/app/n;->D:Z

    :cond_1
    return-void
.end method

.method public l(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string v2, "android:support:fragments"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v2, p1}, Landroidx/fragment/app/B;->N(Landroid/os/Parcelable;)V

    iget-object p1, p0, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iput-boolean v1, p1, Landroidx/fragment/app/B;->y:Z

    iput-boolean v1, p1, Landroidx/fragment/app/B;->z:Z

    iget-object v2, p1, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v1, v2, Landroidx/fragment/app/D;->h:Z

    invoke-virtual {p1, v0}, Landroidx/fragment/app/B;->s(I)V

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iget v2, p1, Landroidx/fragment/app/B;->m:I

    if-lt v2, v0, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v1, p1, Landroidx/fragment/app/B;->y:Z

    iput-boolean v1, p1, Landroidx/fragment/app/B;->z:Z

    iget-object v2, p1, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v1, v2, Landroidx/fragment/app/D;->h:Z

    invoke-virtual {p1, v0}, Landroidx/fragment/app/B;->s(I)V

    :goto_0
    return-void
.end method

.method public m(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public n()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    return-void
.end method

.method public o()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/n;->D:Z

    return-void
.end method

.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/q;->d:Landroid/app/Activity;

    check-cast v0, Lf/g;

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Fragment "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " not attached to an activity."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    return-void
.end method

.method public p(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroidx/fragment/app/q;->h:Lf/g;

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->f:Landroidx/fragment/app/t;

    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract q(Landroid/os/Bundle;)V
.end method

.method public r()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    return-void
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    return-void
.end method

.method public t(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/n;->D:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/n;->w:I

    if-eqz v1, :cond_0

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/n;->w:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/n;->y:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/n;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 1

    iget-object p3, p0, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {p3}, Landroidx/fragment/app/B;->I()V

    const/4 p3, 0x1

    iput-boolean p3, p0, Landroidx/fragment/app/n;->q:Z

    new-instance p3, Landroidx/fragment/app/P;

    invoke-virtual {p0}, Landroidx/fragment/app/n;->c()Landroidx/lifecycle/O;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/fragment/app/P;-><init>(Landroidx/lifecycle/O;)V

    iput-object p3, p0, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/n;->m(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    invoke-virtual {p1}, Landroidx/fragment/app/P;->f()V

    iget-object p1, p0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    const-string p3, "<this>"

    invoke-static {p1, p3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0801b6

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    invoke-static {p1, p3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0801b9

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    invoke-static {p1, p3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0801b8

    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Landroidx/fragment/app/n;->O:Landroidx/lifecycle/y;

    iget-object p2, p0, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/y;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    iget-object p1, p1, Landroidx/fragment/app/P;->c:Landroidx/lifecycle/t;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/B;->s(I)V

    iget-object v0, p0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    invoke-virtual {v0}, Landroidx/fragment/app/P;->f()V

    iget-object v0, v0, Landroidx/fragment/app/P;->c:Landroidx/lifecycle/t;

    iget-object v0, v0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    sget-object v2, Landroidx/lifecycle/m;->d:Landroidx/lifecycle/m;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    sget-object v2, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/P;->e(Landroidx/lifecycle/l;)V

    :cond_0
    iput v1, p0, Landroidx/fragment/app/n;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    invoke-virtual {p0}, Landroidx/fragment/app/n;->n()V

    iget-boolean v1, p0, Landroidx/fragment/app/n;->D:Z

    if-eqz v1, :cond_2

    new-instance v1, Lv0/e;

    invoke-interface {p0}, Landroidx/lifecycle/P;->c()Landroidx/lifecycle/O;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lv0/e;-><init>(Landroidx/lifecycle/r;Landroidx/lifecycle/O;)V

    iget-object v1, v1, Lv0/e;->c:Ljava/lang/Object;

    check-cast v1, LW/a;

    iget-object v1, v1, LW/a;->c:Ln/l;

    iget v2, v1, Ln/l;->d:I

    if-gtz v2, :cond_1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->q:Z

    return-void

    :cond_1
    iget-object v1, v1, Ln/l;->c:[Ljava/lang/Object;

    aget-object v0, v1, v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :cond_2
    new-instance v0, Landroidx/fragment/app/U;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final w()Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/n;->h()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to a context."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final x()Landroid/view/View;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final y(IIII)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/n;->f()Landroidx/fragment/app/m;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/m;->b:I

    invoke-virtual {p0}, Landroidx/fragment/app/n;->f()Landroidx/fragment/app/m;

    move-result-object p1

    iput p2, p1, Landroidx/fragment/app/m;->c:I

    invoke-virtual {p0}, Landroidx/fragment/app/n;->f()Landroidx/fragment/app/m;

    move-result-object p1

    iput p3, p1, Landroidx/fragment/app/m;->d:I

    invoke-virtual {p0}, Landroidx/fragment/app/n;->f()Landroidx/fragment/app/m;

    move-result-object p1

    iput p4, p1, Landroidx/fragment/app/m;->e:I

    return-void
.end method

.method public final z(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Landroidx/fragment/app/B;->y:Z

    if-nez v1, :cond_0

    iget-boolean v0, v0, Landroidx/fragment/app/B;->z:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/n;->g:Landroid/os/Bundle;

    return-void
.end method
