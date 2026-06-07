.class public final Landroidx/lifecycle/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:Lm/a;

.field public c:Landroidx/lifecycle/m;

.field public final d:Ljava/lang/ref/WeakReference;

.field public e:I

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/r;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/t;->a:Z

    new-instance v0, Lm/a;

    invoke-direct {v0}, Lm/a;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/t;->b:Lm/a;

    sget-object v0, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    iput-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/q;)V
    .locals 9

    iget-object v0, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    const-string v1, "observer"

    invoke-static {p1, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "addObserver"

    invoke-virtual {p0, v1}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    sget-object v2, Landroidx/lifecycle/m;->b:Landroidx/lifecycle/m;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    :goto_0
    new-instance v1, Landroidx/lifecycle/s;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sget-object v3, Landroidx/lifecycle/v;->a:Ljava/util/HashMap;

    instance-of v3, p1, Landroidx/lifecycle/p;

    instance-of v4, p1, Landroidx/lifecycle/d;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    if-eqz v4, :cond_1

    new-instance v3, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    move-object v4, p1

    check-cast v4, Landroidx/lifecycle/d;

    move-object v7, p1

    check-cast v7, Landroidx/lifecycle/p;

    invoke-direct {v3, v4, v7}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(Landroidx/lifecycle/d;Landroidx/lifecycle/p;)V

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    if-eqz v4, :cond_2

    new-instance v3, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    move-object v4, p1

    check-cast v4, Landroidx/lifecycle/d;

    invoke-direct {v3, v4, v7}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(Landroidx/lifecycle/d;Landroidx/lifecycle/p;)V

    goto :goto_1

    :cond_2
    if-eqz v3, :cond_3

    move-object v3, p1

    check-cast v3, Landroidx/lifecycle/p;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Landroidx/lifecycle/v;->b(Ljava/lang/Class;)I

    move-result v4

    const/4 v8, 0x2

    if-ne v4, v8, :cond_6

    sget-object v4, Landroidx/lifecycle/v;->b:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, LX1/g;->b(Ljava/lang/Object;)V

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-eq v4, v5, :cond_5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    new-array v8, v4, [Landroidx/lifecycle/g;

    if-gtz v4, :cond_4

    new-instance v3, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;

    invoke-direct {v3, v8}, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;-><init>([Landroidx/lifecycle/g;)V

    goto :goto_1

    :cond_4
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Landroidx/lifecycle/v;->a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    throw v7

    :cond_5
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Landroidx/lifecycle/v;->a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    throw v7

    :cond_6
    new-instance v3, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;

    invoke-direct {v3, p1}, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;-><init>(Ljava/lang/Object;)V

    :goto_1
    iput-object v3, v1, Landroidx/lifecycle/s;->b:Landroidx/lifecycle/p;

    iput-object v2, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v2, p0, Landroidx/lifecycle/t;->b:Lm/a;

    invoke-virtual {v2, p1, v1}, Lm/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/s;

    if-eqz v2, :cond_7

    return-void

    :cond_7
    iget-object v2, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/r;

    if-nez v2, :cond_8

    return-void

    :cond_8
    iget v3, p0, Landroidx/lifecycle/t;->e:I

    if-nez v3, :cond_9

    iget-boolean v3, p0, Landroidx/lifecycle/t;->f:Z

    if-eqz v3, :cond_a

    :cond_9
    move v6, v5

    :cond_a
    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->b(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;

    move-result-object v3

    iget v4, p0, Landroidx/lifecycle/t;->e:I

    add-int/2addr v4, v5

    iput v4, p0, Landroidx/lifecycle/t;->e:I

    :goto_2
    iget-object v4, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v4, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gez v3, :cond_c

    iget-object v3, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v3, v3, Lm/a;->f:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    iget-object v3, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    iget-object v4, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/m;)Landroidx/lifecycle/l;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v1, v2, v3}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v5

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->b(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;

    move-result-object v3

    goto :goto_2

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "no event up from "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    if-nez v6, :cond_d

    invoke-virtual {p0}, Landroidx/lifecycle/t;->h()V

    :cond_d
    iget p1, p0, Landroidx/lifecycle/t;->e:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Landroidx/lifecycle/t;->e:I

    return-void
.end method

.method public final b(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v0, v0, Lm/a;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm/c;

    iget-object p1, p1, Lm/c;->d:Lm/c;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Lm/c;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/s;

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/m;

    :cond_2
    iget-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    const-string v1, "state1"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v0

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, p1

    :goto_3
    return-object v2
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Landroidx/lifecycle/t;->a:Z

    if-eqz v0, :cond_1

    invoke-static {}, Ll/a;->O()Ll/a;

    move-result-object v0

    iget-object v0, v0, Ll/a;->b:Ll/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Method "

    const-string v1, " must be called on the main thread"

    invoke-static {v0, p1, v1}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final d(Landroidx/lifecycle/l;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleLifecycleEvent"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/lifecycle/l;->a()Landroidx/lifecycle/m;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/m;)V

    return-void
.end method

.method public final e(Landroidx/lifecycle/m;)V
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    sget-object v1, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    sget-object v2, Landroidx/lifecycle/m;->b:Landroidx/lifecycle/m;

    if-ne v0, v1, :cond_2

    if-eq p1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "no event down from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " in component "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    iget-boolean p1, p0, Landroidx/lifecycle/t;->f:Z

    const/4 v0, 0x1

    if-nez p1, :cond_5

    iget p1, p0, Landroidx/lifecycle/t;->e:I

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iput-boolean v0, p0, Landroidx/lifecycle/t;->f:Z

    invoke-virtual {p0}, Landroidx/lifecycle/t;->h()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/lifecycle/t;->f:Z

    iget-object p1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    if-ne p1, v2, :cond_4

    new-instance p1, Lm/a;

    invoke-direct {p1}, Lm/a;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/t;->b:Lm/a;

    :cond_4
    return-void

    :cond_5
    :goto_1
    iput-boolean v0, p0, Landroidx/lifecycle/t;->g:Z

    return-void
.end method

.method public final f(Landroidx/lifecycle/q;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeObserver"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/t;->b:Lm/a;

    invoke-virtual {v0, p1}, Lm/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final g()V
    .locals 2

    sget-object v0, Landroidx/lifecycle/m;->d:Landroidx/lifecycle/m;

    const-string v1, "setCurrentState"

    invoke-virtual {p0, v1}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/m;)V

    return-void
.end method

.method public final h()V
    .locals 7

    iget-object v0, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/r;

    if-eqz v0, :cond_b

    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget v2, v1, Lm/f;->e:I

    const/4 v3, 0x0

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lm/f;->b:Lm/c;

    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v1, v1, Lm/c;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/s;

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v2, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v2, v2, Lm/f;->c:Lm/c;

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v2, v2, Lm/c;->b:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/s;

    iget-object v2, v2, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    if-ne v1, v2, :cond_2

    :goto_0
    iput-boolean v3, p0, Landroidx/lifecycle/t;->g:Z

    return-void

    :cond_2
    iput-boolean v3, p0, Landroidx/lifecycle/t;->g:Z

    iget-object v1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    iget-object v2, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v2, v2, Lm/f;->b:Lm/c;

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v2, v2, Lm/c;->b:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/s;

    iget-object v2, v2, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_8

    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lm/a;

    new-instance v2, Lm/b;

    iget-object v3, v1, Lm/f;->c:Lm/c;

    iget-object v4, v1, Lm/f;->b:Lm/c;

    const/4 v5, 0x1

    invoke-direct {v2, v3, v4, v5}, Lm/b;-><init>(Lm/c;Lm/c;I)V

    iget-object v1, v1, Lm/f;->d:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v2}, Lm/b;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-boolean v1, p0, Landroidx/lifecycle/t;->g:Z

    if-nez v1, :cond_8

    invoke-virtual {v2}, Lm/b;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const-string v3, "next()"

    invoke-static {v1, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/q;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/s;

    :goto_1
    iget-object v4, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v5, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-lez v4, :cond_3

    iget-boolean v4, p0, Landroidx/lifecycle/t;->g:Z

    if-nez v4, :cond_3

    iget-object v4, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v4, v4, Lm/a;->f:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v4, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    iget-object v5, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "state"

    invoke-static {v5, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_6

    const/4 v5, 0x3

    if-eq v4, v5, :cond_5

    const/4 v5, 0x4

    if-eq v4, v5, :cond_4

    const/4 v4, 0x0

    goto :goto_2

    :cond_4
    sget-object v4, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    goto :goto_2

    :cond_5
    sget-object v4, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    goto :goto_2

    :cond_6
    sget-object v4, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    :goto_2
    if-eqz v4, :cond_7

    invoke-virtual {v4}, Landroidx/lifecycle/l;->a()Landroidx/lifecycle/m;

    move-result-object v5

    iget-object v6, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v0, v4}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    iget-object v4, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event down from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v1, v1, Lm/f;->c:Lm/c;

    iget-boolean v2, p0, Landroidx/lifecycle/t;->g:Z

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    iget-object v1, v1, Lm/c;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/s;

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lm/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lm/d;

    invoke-direct {v2, v1}, Lm/d;-><init>(Lm/f;)V

    iget-object v1, v1, Lm/f;->d:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-virtual {v2}, Lm/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroidx/lifecycle/t;->g:Z

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lm/d;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/q;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/s;

    :goto_3
    iget-object v4, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v5, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_9

    iget-boolean v4, p0, Landroidx/lifecycle/t;->g:Z

    if-nez v4, :cond_9

    iget-object v4, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v4, v4, Lm/a;->f:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v4, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v5, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v4, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    iget-object v5, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/m;)Landroidx/lifecycle/l;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v1, v0, v4}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    iget-object v4, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event up from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
