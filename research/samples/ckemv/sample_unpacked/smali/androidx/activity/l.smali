.class public final Landroidx/activity/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/activity/j;Landroidx/activity/d;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Landroidx/activity/l;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/l;->c:Ljava/lang/Object;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/activity/l;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ld0/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/activity/l;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/l;->c:Ljava/lang/Object;

    .line 2
    new-instance p1, Ld0/d;

    invoke-direct {p1}, Ld0/d;-><init>()V

    iput-object p1, p0, Landroidx/activity/l;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/activity/l;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Landroidx/activity/l;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Landroidx/activity/l;->b:Z

    .line 9
    iput-object p2, p0, Landroidx/activity/l;->d:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Abstract classes can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public b(Lcom/google/gson/reflect/TypeToken;)Ld1/p;
    .locals 11

    const/16 v0, 0x1c

    const/16 v1, 0x1d

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p1

    iget-object v6, p0, Landroidx/activity/l;->c:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, LX/d;->q(Ljava/lang/Object;)V

    invoke-interface {v6, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, LX/d;->q(Ljava/lang/Object;)V

    const-class v6, Ljava/util/EnumSet;

    invoke-virtual {v6, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    new-instance v6, Ld1/g;

    invoke-direct {v6, v5, v4}, Ld1/g;-><init>(Ljava/lang/reflect/Type;I)V

    goto :goto_0

    :cond_0
    const-class v6, Ljava/util/EnumMap;

    if-ne p1, v6, :cond_1

    new-instance v6, Ld1/g;

    invoke-direct {v6, v5, v3}, Ld1/g;-><init>(Ljava/lang/reflect/Type;I)V

    goto :goto_0

    :cond_1
    move-object v6, v7

    :goto_0
    if-eqz v6, :cond_2

    return-object v6

    :cond_2
    iget-object v6, p0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Ld1/d;->e(Ljava/util/List;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result v6

    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v6

    if-eqz v6, :cond_3

    :catch_0
    move-object v6, v7

    goto :goto_2

    :cond_3
    :try_start_0
    invoke-virtual {p1, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v8, Lg1/c;->a:Lm0/z;

    :try_start_1
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v8, v7

    goto :goto_1

    :catch_1
    move-exception v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Failed making constructor \'"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lg1/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "\' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :goto_1
    if-eqz v8, :cond_4

    new-instance v6, Ld1/f;

    invoke-direct {v6, v8, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    goto :goto_2

    :cond_4
    new-instance v8, LA/h;

    invoke-direct {v8, v1, v6}, LA/h;-><init>(ILjava/lang/Object;)V

    move-object v6, v8

    :goto_2
    if-eqz v6, :cond_5

    return-object v6

    :cond_5
    const-class v6, Ljava/util/Collection;

    invoke-virtual {v6, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_9

    const-class v1, Ljava/util/SortedSet;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v7, LU0/e;

    const/16 v1, 0x18

    invoke-direct {v7, v1}, LU0/e;-><init>(I)V

    goto/16 :goto_3

    :cond_6
    const-class v1, Ljava/util/Set;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v7, LU0/e;

    const/16 v1, 0x19

    invoke-direct {v7, v1}, LU0/e;-><init>(I)V

    goto/16 :goto_3

    :cond_7
    const-class v1, Ljava/util/Queue;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v7, LU0/e;

    const/16 v1, 0x1a

    invoke-direct {v7, v1}, LU0/e;-><init>(I)V

    goto :goto_3

    :cond_8
    new-instance v7, LU0/e;

    const/16 v1, 0x1b

    invoke-direct {v7, v1}, LU0/e;-><init>(I)V

    goto :goto_3

    :cond_9
    const-class v6, Ljava/util/Map;

    invoke-virtual {v6, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_e

    const-class v6, Ljava/util/concurrent/ConcurrentNavigableMap;

    invoke-virtual {v6, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_a

    new-instance v7, LU0/e;

    invoke-direct {v7, v0}, LU0/e;-><init>(I)V

    goto :goto_3

    :cond_a
    const-class v6, Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {v6, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_b

    new-instance v7, LU0/e;

    invoke-direct {v7, v1}, LU0/e;-><init>(I)V

    goto :goto_3

    :cond_b
    const-class v1, Ljava/util/SortedMap;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v7, Ld1/e;

    invoke-direct {v7, v4}, Ld1/e;-><init>(I)V

    goto :goto_3

    :cond_c
    instance-of v1, v5, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_d

    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v5}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    aget-object v1, v1, v4

    invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v1

    const-class v5, Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_d

    new-instance v7, Ld1/e;

    invoke-direct {v7, v3}, Ld1/e;-><init>(I)V

    goto :goto_3

    :cond_d
    new-instance v7, Ld1/e;

    invoke-direct {v7, v2}, Ld1/e;-><init>(I)V

    :cond_e
    :goto_3
    if-eqz v7, :cond_f

    return-object v7

    :cond_f
    invoke-static {p1}, Landroidx/activity/l;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_10

    new-instance p1, Ld1/f;

    invoke-direct {p1, v1, v3}, Ld1/f;-><init>(Ljava/lang/String;I)V

    return-object p1

    :cond_10
    iget-boolean v1, p0, Landroidx/activity/l;->b:Z

    if-eqz v1, :cond_11

    new-instance v1, LA/h;

    invoke-direct {v1, v0, p1}, LA/h;-><init>(ILjava/lang/Object;)V

    goto :goto_4

    :cond_11
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to create instance of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ld1/f;

    invoke-direct {v1, p1, v4}, Ld1/f;-><init>(Ljava/lang/String;I)V

    :goto_4
    return-object v1
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Landroidx/activity/l;->c:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    invoke-interface {v0}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    move-result-object v1

    iget-object v2, v1, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    sget-object v3, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    if-ne v2, v3, :cond_1

    new-instance v2, Landroidx/savedstate/Recreator;

    invoke-direct {v2, v0}, Landroidx/savedstate/Recreator;-><init>(Ld0/e;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    iget-object v0, p0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ld0/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v2, v0, Ld0/d;->a:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_0

    new-instance v2, Ld0/a;

    invoke-direct {v2, v0}, Ld0/a;-><init>(Ld0/d;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    iput-boolean v3, v0, Ld0/d;->a:Z

    iput-boolean v3, p0, Landroidx/activity/l;->b:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SavedStateRegistry was already attached."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 3

    iget-boolean v0, p0, Landroidx/activity/l;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/activity/l;->c()V

    :cond_0
    iget-object v0, p0, Landroidx/activity/l;->c:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    invoke-interface {v0}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    move-result-object v0

    iget-object v1, v0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    sget-object v2, Landroidx/lifecycle/m;->e:Landroidx/lifecycle/m;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    const/4 v2, 0x1

    if-ltz v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    xor-int/2addr v1, v2

    if-eqz v1, :cond_5

    iget-object v0, p0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ld0/d;

    iget-boolean v1, v0, Ld0/d;->a:Z

    if-eqz v1, :cond_4

    iget-boolean v1, v0, Ld0/d;->b:Z

    xor-int/2addr v1, v2

    if-eqz v1, :cond_3

    if-eqz p1, :cond_2

    const-string v1, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput-object p1, v0, Ld0/d;->e:Landroid/os/Parcelable;

    iput-boolean v2, v0, Ld0/d;->b:Z

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "SavedStateRegistry was already restored."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "You must call performAttach() before calling performRestore(Bundle)."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "performRestore cannot be called when owner is "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "outBundle"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ld0/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Ld0/d;->e:Landroid/os/Parcelable;

    check-cast v2, Landroid/os/Bundle;

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    iget-object v0, v0, Ld0/d;->d:Ljava/lang/Object;

    check-cast v0, Lm/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lm/d;

    invoke-direct {v2, v0}, Lm/d;-><init>(Lm/f;)V

    iget-object v0, v0, Lm/f;->d:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    invoke-virtual {v2}, Lm/d;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Lm/d;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld0/c;

    invoke-interface {v0}, Ld0/c;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Landroidx/activity/l;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/activity/l;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
