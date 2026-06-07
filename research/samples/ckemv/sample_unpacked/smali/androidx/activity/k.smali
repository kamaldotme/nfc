.class public abstract Landroidx/activity/k;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/P;
.implements Landroidx/lifecycle/h;
.implements Ld0/e;
.implements Landroidx/activity/v;
.implements Landroidx/activity/result/h;
.implements Landroidx/lifecycle/r;
.implements LJ/k;


# instance fields
.field public b:Landroidx/lifecycle/t;

.field public final c:Lb/a;

.field public final d:LA/h;

.field public final e:Landroidx/lifecycle/t;

.field public final f:Landroidx/activity/l;

.field public g:Landroidx/lifecycle/O;

.field public h:Landroidx/activity/u;

.field public final i:Landroidx/activity/j;

.field public final j:Landroidx/activity/l;

.field public final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final l:Landroidx/activity/g;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final n:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final o:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final p:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final q:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/activity/k;->b:Landroidx/lifecycle/t;

    new-instance v0, Lb/a;

    invoke-direct {v0}, Lb/a;-><init>()V

    iput-object v0, p0, Landroidx/activity/k;->c:Lb/a;

    new-instance v0, LA/h;

    move-object v1, p0

    check-cast v1, Lf/g;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, LA/h;-><init>(I)V

    iput-object v0, p0, Landroidx/activity/k;->d:LA/h;

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/activity/k;->e:Landroidx/lifecycle/t;

    new-instance v2, Landroidx/activity/l;

    invoke-direct {v2, p0}, Landroidx/activity/l;-><init>(Ld0/e;)V

    iput-object v2, p0, Landroidx/activity/k;->f:Landroidx/activity/l;

    const/4 v3, 0x0

    iput-object v3, p0, Landroidx/activity/k;->h:Landroidx/activity/u;

    new-instance v4, Landroidx/activity/j;

    invoke-direct {v4, v1}, Landroidx/activity/j;-><init>(Lf/g;)V

    iput-object v4, p0, Landroidx/activity/k;->i:Landroidx/activity/j;

    new-instance v5, Landroidx/activity/l;

    new-instance v6, Landroidx/activity/d;

    invoke-direct {v6, v1}, Landroidx/activity/d;-><init>(Lf/g;)V

    invoke-direct {v5, v4, v6}, Landroidx/activity/l;-><init>(Landroidx/activity/j;Landroidx/activity/d;)V

    iput-object v5, p0, Landroidx/activity/k;->j:Landroidx/activity/l;

    new-instance v4, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v4, p0, Landroidx/activity/k;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v4, Landroidx/activity/g;

    invoke-direct {v4, v1}, Landroidx/activity/g;-><init>(Lf/g;)V

    iput-object v4, p0, Landroidx/activity/k;->l:Landroidx/activity/g;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Landroidx/activity/k;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Landroidx/activity/k;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Landroidx/activity/k;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Landroidx/activity/k;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Landroidx/activity/k;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v4, Landroidx/activity/ComponentActivity$2;

    invoke-direct {v4, v1}, Landroidx/activity/ComponentActivity$2;-><init>(Lf/g;)V

    invoke-virtual {v0, v4}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    new-instance v4, Landroidx/activity/ComponentActivity$3;

    invoke-direct {v4, v1}, Landroidx/activity/ComponentActivity$3;-><init>(Lf/g;)V

    invoke-virtual {v0, v4}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    new-instance v4, Landroidx/activity/ComponentActivity$4;

    invoke-direct {v4, v1}, Landroidx/activity/ComponentActivity$4;-><init>(Lf/g;)V

    invoke-virtual {v0, v4}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    invoke-virtual {v2}, Landroidx/activity/l;->c()V

    iget-object v0, v0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    sget-object v4, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    if-eq v0, v4, :cond_1

    sget-object v4, Landroidx/lifecycle/m;->d:Landroidx/lifecycle/m;

    if-ne v0, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, v2, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ld0/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Ld0/d;->d:Ljava/lang/Object;

    check-cast v0, Lm/f;

    invoke-virtual {v0}, Lm/f;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    move-object v2, v0

    check-cast v2, Lm/b;

    invoke-virtual {v2}, Lm/b;->hasNext()Z

    move-result v4

    const-string v5, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    if-eqz v4, :cond_3

    invoke-virtual {v2}, Lm/b;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    const-string v4, "components"

    invoke-static {v2, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld0/c;

    invoke-static {v4, v5}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v3, v2

    :cond_3
    if-nez v3, :cond_4

    new-instance v0, Landroidx/lifecycle/J;

    iget-object v2, p0, Landroidx/activity/k;->f:Landroidx/activity/l;

    iget-object v2, v2, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v2, Ld0/d;

    invoke-direct {v0, v2, v1}, Landroidx/lifecycle/J;-><init>(Ld0/d;Lf/g;)V

    iget-object v2, p0, Landroidx/activity/k;->f:Landroidx/activity/l;

    iget-object v2, v2, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v2, Ld0/d;

    invoke-virtual {v2, v5, v0}, Ld0/d;->e(Ljava/lang/String;Ld0/c;)V

    iget-object v2, p0, Landroidx/activity/k;->e:Landroidx/lifecycle/t;

    new-instance v3, Landroidx/lifecycle/SavedStateHandleAttacher;

    invoke-direct {v3, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(Landroidx/lifecycle/J;)V

    invoke-virtual {v2, v3}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    :cond_4
    iget-object v0, p0, Landroidx/activity/k;->f:Landroidx/activity/l;

    iget-object v0, v0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ld0/d;

    new-instance v2, Landroidx/activity/e;

    invoke-direct {v2, v1}, Landroidx/activity/e;-><init>(Lf/g;)V

    const-string v3, "android:support:activity-result"

    invoke-virtual {v0, v3, v2}, Ld0/d;->e(Ljava/lang/String;Ld0/c;)V

    new-instance v0, Landroidx/activity/f;

    invoke-direct {v0, v1}, Landroidx/activity/f;-><init>(Lf/g;)V

    invoke-virtual {p0, v0}, Landroidx/activity/k;->g(Lb/b;)V

    return-void
.end method

.method public static synthetic f(Landroidx/activity/k;)V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public final a()LV/b;
    .locals 4

    new-instance v0, LV/c;

    sget-object v1, LV/a;->b:LV/a;

    invoke-direct {v0, v1}, LV/c;-><init>(LV/b;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    iget-object v2, v0, LV/b;->a:Ljava/util/LinkedHashMap;

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/lifecycle/N;->a:Landroidx/lifecycle/N;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v1, Landroidx/lifecycle/I;->a:Landroidx/lifecycle/N;

    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/lifecycle/I;->b:Landroidx/lifecycle/N;

    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v1, Landroidx/lifecycle/I;->c:Landroidx/lifecycle/N;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final b()Ld0/d;
    .locals 1

    iget-object v0, p0, Landroidx/activity/k;->f:Landroidx/activity/l;

    iget-object v0, v0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ld0/d;

    return-object v0
.end method

.method public final c()Landroidx/lifecycle/O;
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/activity/k;->g:Landroidx/lifecycle/O;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/activity/i;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/activity/i;->a:Landroidx/lifecycle/O;

    iput-object v0, p0, Landroidx/activity/k;->g:Landroidx/lifecycle/O;

    :cond_0
    iget-object v0, p0, Landroidx/activity/k;->g:Landroidx/lifecycle/O;

    if-nez v0, :cond_1

    new-instance v0, Landroidx/lifecycle/O;

    invoke-direct {v0}, Landroidx/lifecycle/O;-><init>()V

    iput-object v0, p0, Landroidx/activity/k;->g:Landroidx/lifecycle/O;

    :cond_1
    iget-object v0, p0, Landroidx/activity/k;->g:Landroidx/lifecycle/O;

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Landroidx/lifecycle/t;
    .locals 1

    iget-object v0, p0, Landroidx/activity/k;->e:Landroidx/lifecycle/t;

    return-object v0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lu2/l;->g(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-static {p0, v0, p0, p1}, Lu2/l;->h(LJ/k;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lu2/l;->g(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final e(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final g(Lb/b;)V
    .locals 2

    iget-object v0, p0, Landroidx/activity/k;->c:Lb/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lb/a;->b:Landroid/content/Context;

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lb/b;->a()V

    :cond_0
    iget-object v0, v0, Lb/a;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final h()Landroidx/activity/u;
    .locals 3

    iget-object v0, p0, Landroidx/activity/k;->h:Landroidx/activity/u;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/activity/u;

    new-instance v1, LF0/h;

    const/4 v2, 0x7

    invoke-direct {v1, v2, p0}, LF0/h;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v1}, Landroidx/activity/u;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Landroidx/activity/k;->h:Landroidx/activity/u;

    new-instance v0, Landroidx/activity/ComponentActivity$6;

    invoke-direct {v0, p0}, Landroidx/activity/ComponentActivity$6;-><init>(Landroidx/activity/k;)V

    iget-object v1, p0, Landroidx/activity/k;->e:Landroidx/lifecycle/t;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    :cond_0
    iget-object v0, p0, Landroidx/activity/k;->h:Landroidx/activity/u;

    return-object v0
.end method

.method public final i(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    sget p1, Landroidx/lifecycle/G;->c:I

    invoke-static {p0}, Landroidx/lifecycle/I;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public final j(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/activity/k;->b:Landroidx/lifecycle/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "markState"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/lifecycle/t;->g()V

    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Landroidx/activity/k;->l:Landroidx/activity/g;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/activity/result/g;->a(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public final onBackPressed()V
    .locals 1

    invoke-virtual {p0}, Landroidx/activity/k;->h()Landroidx/activity/u;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/activity/u;->b()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Landroidx/activity/k;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG/g;

    invoke-virtual {v1, p1}, LG/g;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/activity/k;->f:Landroidx/activity/l;

    invoke-virtual {v0, p1}, Landroidx/activity/l;->d(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/activity/k;->c:Lb/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p0, v0, Lb/a;->b:Landroid/content/Context;

    iget-object v0, v0, Lb/a;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/b;

    invoke-interface {v1}, Lb/b;->a()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/activity/k;->i(Landroid/os/Bundle;)V

    sget p1, Landroidx/lifecycle/G;->c:I

    invoke-static {p0}, Landroidx/lifecycle/I;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 0

    if-nez p1, :cond_1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    iget-object p1, p0, Landroidx/activity/k;->d:LA/h;

    iget-object p1, p1, LA/h;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p2, 0x0

    if-nez p1, :cond_2

    iget-object p1, p0, Landroidx/activity/k;->d:LA/h;

    iget-object p1, p1, LA/h;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    return p2

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    return p2
.end method

.method public final onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V

    iget-object p1, p0, Landroidx/activity/k;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LG/g;

    new-instance v0, Ld1/e;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ld1/e;-><init>(I)V

    invoke-virtual {p2, v0}, LG/g;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    iget-object v0, p0, Landroidx/activity/k;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG/g;

    invoke-virtual {v1, p1}, LG/g;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    iget-object v0, p0, Landroidx/activity/k;->d:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V

    iget-object p1, p0, Landroidx/activity/k;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LG/g;

    new-instance v0, Ld1/e;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ld1/e;-><init>(I)V

    invoke-virtual {p2, v0}, LG/g;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    if-nez p1, :cond_1

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    iget-object p1, p0, Landroidx/activity/k;->d:LA/h;

    iget-object p1, p1, LA/h;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "androidx.activity.result.contract.extra.PERMISSIONS"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    iget-object v2, p0, Landroidx/activity/k;->l:Landroidx/activity/g;

    invoke-virtual {v2, p1, v1, v0}, Landroidx/activity/result/g;->a(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    :cond_0
    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/activity/k;->g:Landroidx/lifecycle/O;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/activity/i;

    if-eqz v1, :cond_0

    iget-object v0, v1, Landroidx/activity/i;->a:Landroidx/lifecycle/O;

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v1, Landroidx/activity/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Landroidx/activity/i;->a:Landroidx/lifecycle/O;

    return-object v1
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/activity/k;->e:Landroidx/lifecycle/t;

    instance-of v1, v0, Landroidx/lifecycle/t;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/t;->g()V

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/activity/k;->j(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/activity/k;->f:Landroidx/activity/l;

    invoke-virtual {v0, p1}, Landroidx/activity/l;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    iget-object v0, p0, Landroidx/activity/k;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG/g;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, LG/g;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final reportFullyDrawn()V
    .locals 4

    :try_start_0
    invoke-static {}, Lv0/f;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "reportFullyDrawn() for ComponentActivity"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    :goto_0
    invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V

    iget-object v0, p0, Landroidx/activity/k;->j:Landroidx/activity/l;

    iget-object v1, v0, Landroidx/activity/l;->c:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    :try_start_1
    iput-boolean v2, v0, Landroidx/activity/l;->b:Z

    iget-object v2, v0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LW1/a;

    invoke-interface {v3}, LW1/a;->d()Ljava/lang/Object;

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v0, v0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_2
    :try_start_3
    monitor-exit v1

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801b6

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801b9

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801b8

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801b7

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f080143

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/activity/k;->i:Landroidx/activity/j;

    iget-boolean v2, v1, Landroidx/activity/j;->d:Z

    if-nez v2, :cond_0

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroidx/activity/j;->d:Z

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public final startActivityForResult(Landroid/content/Intent;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public final startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    return-void
.end method

.method public final startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 0

    .line 2
    invoke-super/range {p0 .. p7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method
