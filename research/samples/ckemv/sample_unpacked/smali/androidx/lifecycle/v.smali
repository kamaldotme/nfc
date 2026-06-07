.class public abstract Landroidx/lifecycle/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/HashMap;

.field public static final b:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroidx/lifecycle/v;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroidx/lifecycle/v;->b:Ljava/util/HashMap;

    return-void
.end method

.method public static a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V
    .locals 0

    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "{\n            constructo\u2026tance(`object`)\n        }"

    invoke-static {p0, p1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LX/d;->n(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    goto :goto_2

    :goto_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :goto_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :goto_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static b(Ljava/lang/Class;)I
    .locals 13

    sget-object v0, Landroidx/lifecycle/v;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    goto/16 :goto_8

    :cond_1
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v3

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_3

    :cond_2
    const-string v3, ""

    :goto_0
    const-string v5, "fullPackage"

    invoke-static {v3, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    const-string v5, "name"

    invoke-static {v4, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v2

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "this as java.lang.String).substring(startIndex)"

    invoke-static {v4, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    const-string v5, "if (fullPackage.isEmpty(\u2026g(fullPackage.length + 1)"

    invoke-static {v4, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "."

    const-string v6, "_"

    invoke-static {v4, v5, v6}, Ld2/l;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "_LifecycleAdapter"

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    filled-new-array {p0}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_3
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-object v3, v1

    :cond_5
    :goto_4
    sget-object v4, Landroidx/lifecycle/v;->b:Ljava/util/HashMap;

    const/4 v5, 0x2

    if-eqz v3, :cond_6

    invoke-static {v3}, Lv0/f;->B(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v4, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    move v2, v5

    goto/16 :goto_8

    :cond_6
    sget-object v3, Landroidx/lifecycle/c;->c:Landroidx/lifecycle/c;

    iget-object v6, v3, Landroidx/lifecycle/c;->b:Ljava/util/HashMap;

    invoke-virtual {v6, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    const/4 v8, 0x0

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_8

    :cond_7
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v7
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_2

    array-length v9, v7

    move v10, v8

    :goto_6
    if-ge v10, v9, :cond_9

    aget-object v11, v7, v10

    const-class v12, Landroidx/lifecycle/z;

    invoke-virtual {v11, v12}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v11

    check-cast v11, Landroidx/lifecycle/z;

    if-eqz v11, :cond_8

    invoke-virtual {v3, p0, v7}, Landroidx/lifecycle/c;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Landroidx/lifecycle/a;

    goto/16 :goto_8

    :cond_8
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_9
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v6, p0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v3

    const-class v6, Landroidx/lifecycle/q;

    if-eqz v3, :cond_c

    invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_c

    const-string v1, "superclass"

    invoke-static {v3, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Landroidx/lifecycle/v;->b(Ljava/lang/Class;)I

    move-result v1

    if-ne v1, v2, :cond_b

    goto :goto_8

    :cond_b
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, LX1/g;->b(Ljava/lang/Object;)V

    check-cast v3, Ljava/util/Collection;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :cond_c
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v3

    const-string v7, "klass.interfaces"

    invoke-static {v3, v7}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v3

    :goto_7
    if-ge v8, v7, :cond_10

    aget-object v9, v3, v8

    if-eqz v9, :cond_f

    invoke-virtual {v6, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_f

    const-string v10, "intrface"

    invoke-static {v9, v10}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Landroidx/lifecycle/v;->b(Ljava/lang/Class;)I

    move-result v10

    if-ne v10, v2, :cond_d

    goto :goto_8

    :cond_d
    if-nez v1, :cond_e

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_e
    invoke-virtual {v4, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, LX1/g;->b(Ljava/lang/Object;)V

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v1, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_f
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_10
    if-eqz v1, :cond_11

    invoke-virtual {v4, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    :cond_11
    :goto_8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2

    :catch_2
    move-exception p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
