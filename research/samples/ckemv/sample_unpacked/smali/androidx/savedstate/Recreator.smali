.class public final Landroidx/savedstate/Recreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final b:Ld0/e;


# direct methods
.method public constructor <init>(Ld0/e;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/savedstate/Recreator;->b:Ld0/e;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V
    .locals 9

    sget-object v0, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    if-ne p2, v0, :cond_9

    invoke-interface {p1}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/t;->f(Landroidx/lifecycle/q;)V

    iget-object p1, p0, Landroidx/savedstate/Recreator;->b:Ld0/e;

    invoke-interface {p1}, Ld0/e;->b()Ld0/d;

    move-result-object p1

    const-string p2, "androidx.savedstate.Restarter"

    invoke-virtual {p1, p2}, Ld0/d;->c(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string p2, "classes_to_restore"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    :try_start_0
    const-class v0, Landroidx/savedstate/Recreator;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p2, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ld0/b;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "{\n                Class.\u2026class.java)\n            }"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :try_start_2
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "{\n                constr\u2026wInstance()\n            }"

    invoke-static {v0, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ld0/b;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    iget-object p2, p0, Landroidx/savedstate/Recreator;->b:Ld0/e;

    const-string v0, "owner"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Landroidx/lifecycle/P;

    if-eqz v0, :cond_6

    move-object v0, p2

    check-cast v0, Landroidx/lifecycle/P;

    invoke-interface {v0}, Landroidx/lifecycle/P;->c()Landroidx/lifecycle/O;

    move-result-object v0

    invoke-interface {p2}, Ld0/e;->b()Ld0/d;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ljava/util/HashSet;

    iget-object v5, v0, Landroidx/lifecycle/O;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "key"

    invoke-static {v5, v6}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Landroidx/lifecycle/O;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/lifecycle/M;

    invoke-static {v5}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-interface {p2}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    move-result-object v6

    const-string v7, "registry"

    invoke-static {v3, v7}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "lifecycle"

    invoke-static {v6, v7}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "androidx.lifecycle.savedstate.vm.tag"

    iget-object v8, v5, Landroidx/lifecycle/M;->a:Ljava/util/HashMap;

    if-nez v8, :cond_3

    move-object v5, v1

    goto :goto_1

    :cond_3
    monitor-enter v8

    :try_start_3
    iget-object v5, v5, Landroidx/lifecycle/M;->a:Ljava/util/HashMap;

    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    check-cast v5, Landroidx/lifecycle/SavedStateHandleController;

    if-eqz v5, :cond_2

    iget-boolean v7, v5, Landroidx/lifecycle/SavedStateHandleController;->b:Z

    if-nez v7, :cond_2

    xor-int/lit8 p1, v7, 0x1

    if-nez p1, :cond_4

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached to lifecycleOwner"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iput-boolean v2, v5, Landroidx/lifecycle/SavedStateHandleController;->b:Z

    invoke-virtual {v6, v5}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    throw v1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :cond_5
    new-instance p2, Ljava/util/HashSet;

    iget-object v0, v0, Landroidx/lifecycle/O;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p2}, Ljava/util/HashSet;->isEmpty()Z

    move-result p2

    xor-int/2addr p2, v2

    if-eqz p2, :cond_1

    invoke-virtual {v3}, Ld0/d;->f()V

    goto/16 :goto_0

    :cond_6
    const-string p1, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to instantiate "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Class "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " must have default constructor in order to be automatically recreated"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Class "

    const-string v2, " wasn\'t found"

    invoke-static {v1, p2, v2}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_7
    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Next event must be ON_CREATE"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
