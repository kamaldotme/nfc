.class public final Le1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/y;


# instance fields
.field public final b:Landroidx/activity/l;

.field public final c:Lb1/h;

.field public final d:Ld1/i;

.field public final e:Le1/c;

.field public final f:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroidx/activity/l;Ld1/i;Le1/c;Ljava/util/List;)V
    .locals 1

    sget-object v0, Lb1/h;->b:Lb1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/p;->b:Landroidx/activity/l;

    iput-object v0, p0, Le1/p;->c:Lb1/h;

    iput-object p2, p0, Le1/p;->d:Ld1/i;

    iput-object p3, p0, Le1/p;->e:Le1/c;

    iput-object p4, p0, Le1/p;->f:Ljava/util/List;

    return-void
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    sget-object v0, Ld1/s;->a:Ld1/s;

    invoke-virtual {v0, p0, p1}, Ld1/s;->a(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-void

    :cond_1
    const/4 p0, 0x1

    invoke-static {p1, p0}, Lg1/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lb1/o;

    const-string v0, " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."

    invoke-static {p0, v0}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lb1/l;Lcom/google/gson/reflect/TypeToken;)Lb1/x;
    .locals 4

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Le1/p;->f:Ljava/util/List;

    invoke-static {v1}, Ld1/d;->e(Ljava/util/List;)V

    sget-object v1, Lg1/c;->a:Lm0/z;

    invoke-virtual {v1, v0}, Lm0/z;->Q(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Le1/o;

    const/4 v2, 0x1

    invoke-virtual {p0, p1, p2, v0, v2}, Le1/p;->c(Lb1/l;Lcom/google/gson/reflect/TypeToken;Ljava/lang/Class;Z)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Le1/o;-><init>(Ljava/lang/Class;Ljava/util/LinkedHashMap;)V

    return-object v1

    :cond_1
    iget-object v1, p0, Le1/p;->b:Landroidx/activity/l;

    invoke-virtual {v1, p2}, Landroidx/activity/l;->b(Lcom/google/gson/reflect/TypeToken;)Ld1/p;

    move-result-object v1

    new-instance v2, Le1/n;

    const/4 v3, 0x0

    invoke-virtual {p0, p1, p2, v0, v3}, Le1/p;->c(Lb1/l;Lcom/google/gson/reflect/TypeToken;Ljava/lang/Class;Z)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-direct {v2, v1, p1}, Le1/n;-><init>(Ld1/p;Ljava/util/LinkedHashMap;)V

    return-object v2
.end method

.method public final c(Lb1/l;Lcom/google/gson/reflect/TypeToken;Ljava/lang/Class;Z)Ljava/util/LinkedHashMap;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v15

    :cond_0
    move-object/from16 v16, p2

    move-object/from16 v13, p3

    :goto_0
    const-class v1, Ljava/lang/Object;

    if-eq v13, v1, :cond_14

    invoke-virtual {v13}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v12

    move-object/from16 v11, p3

    if-eq v13, v11, :cond_1

    array-length v1, v12

    if-lez v1, :cond_1

    iget-object v1, v0, Le1/p;->f:Ljava/util/List;

    invoke-static {v1}, Ld1/d;->e(Ljava/util/List;)V

    :cond_1
    array-length v10, v12

    const/4 v9, 0x0

    move v8, v9

    :goto_1
    if-ge v8, v10, :cond_13

    aget-object v7, v12, v8

    const/4 v6, 0x1

    invoke-virtual {v0, v7, v6}, Le1/p;->d(Ljava/lang/reflect/Field;Z)Z

    move-result v1

    invoke-virtual {v0, v7, v9}, Le1/p;->d(Ljava/lang/reflect/Field;Z)Z

    move-result v2

    if-nez v1, :cond_2

    if-nez v2, :cond_2

    move/from16 v32, v8

    move/from16 v22, v9

    move/from16 v26, v10

    move-object/from16 v28, v12

    move-object/from16 v24, v13

    goto/16 :goto_e

    :cond_2
    const-class v3, Lc1/b;

    const/16 v17, 0x0

    if-eqz p4, :cond_6

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v4

    if-eqz v4, :cond_3

    move/from16 v18, v9

    :goto_2
    move-object/from16 v19, v17

    goto :goto_4

    :cond_3
    sget-object v4, Lg1/c;->a:Lm0/z;

    invoke-virtual {v4, v13, v7}, Lm0/z;->y(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-static {v4}, Lg1/c;->e(Ljava/lang/reflect/AccessibleObject;)V

    invoke-virtual {v4, v3}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v7, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v4, v9}, Lg1/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lb1/o;

    const-string v3, "@SerializedName on "

    const-string v4, " is not supported"

    invoke-static {v3, v1, v4}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    :goto_3
    move/from16 v18, v2

    move-object/from16 v19, v4

    goto :goto_4

    :cond_6
    move/from16 v18, v2

    goto :goto_2

    :goto_4
    if-nez v19, :cond_7

    invoke-static {v7}, Lg1/c;->e(Ljava/lang/reflect/AccessibleObject;)V

    :cond_7
    invoke-virtual/range {v16 .. v16}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v4

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    invoke-static {v2, v13, v4, v5}, Ld1/d;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    move-result-object v20

    invoke-virtual {v7, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lc1/b;

    if-nez v2, :cond_8

    iget-object v2, v0, Le1/p;->c:Lb1/h;

    invoke-virtual {v2, v7}, Lb1/h;->b(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :goto_5
    move-object v5, v2

    goto :goto_6

    :cond_8
    invoke-interface {v2}, Lc1/b;->value()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Lc1/b;->alternate()[Ljava/lang/String;

    move-result-object v2

    array-length v4, v2

    if-nez v4, :cond_9

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_5

    :cond_9
    new-instance v4, Ljava/util/ArrayList;

    array-length v5, v2

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v4, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    move-object v5, v4

    :goto_6
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v4

    move v3, v9

    move-object/from16 v2, v17

    :goto_7
    if-ge v3, v4, :cond_11

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v6, v21

    check-cast v6, Ljava/lang/String;

    if-eqz v3, :cond_a

    move/from16 v21, v9

    goto :goto_8

    :cond_a
    move/from16 v21, v1

    :goto_8
    invoke-static/range {v20 .. v20}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v9

    move-object/from16 v23, v2

    instance-of v2, v9, Ljava/lang/Class;

    if-eqz v2, :cond_b

    invoke-virtual {v9}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-eqz v2, :cond_b

    const/16 v24, 0x1

    goto :goto_9

    :cond_b
    const/16 v24, 0x0

    :goto_9
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v2

    if-eqz v2, :cond_c

    const/16 v25, 0x1

    goto :goto_a

    :cond_c
    const/16 v25, 0x0

    :goto_a
    const-class v2, Lc1/a;

    invoke-virtual {v7, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lc1/a;

    if-eqz v2, :cond_d

    iget-object v9, v0, Le1/p;->e:Le1/c;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v9, v0, Le1/p;->b:Landroidx/activity/l;

    invoke-static {v9, v14, v1, v2}, Le1/c;->b(Landroidx/activity/l;Lb1/l;Lcom/google/gson/reflect/TypeToken;Lc1/a;)Lb1/x;

    move-result-object v2

    goto :goto_b

    :cond_d
    move-object/from16 v2, v17

    :goto_b
    if-eqz v2, :cond_e

    const/4 v9, 0x1

    goto :goto_c

    :cond_e
    const/4 v9, 0x0

    :goto_c
    if-nez v2, :cond_f

    invoke-virtual {v14, v1}, Lb1/l;->d(Lcom/google/gson/reflect/TypeToken;)Lb1/x;

    move-result-object v2

    :cond_f
    move-object/from16 v26, v2

    new-instance v2, Le1/l;

    const/16 v27, 0x0

    move-object/from16 v28, v1

    move-object v1, v2

    move-object v14, v2

    move-object/from16 v0, v23

    move-object v2, v6

    move/from16 v23, v3

    move-object v3, v7

    move/from16 v29, v4

    move/from16 v4, v21

    move-object/from16 v30, v5

    move/from16 v5, v18

    move-object/from16 p2, v0

    move-object v0, v6

    const/16 v31, 0x1

    move/from16 v6, v27

    move-object/from16 v27, v7

    move-object/from16 v7, v19

    move/from16 v32, v8

    move v8, v9

    const/16 v22, 0x0

    move-object/from16 v9, v26

    move/from16 v26, v10

    move-object/from16 v10, p1

    move-object/from16 v11, v28

    move-object/from16 v28, v12

    move/from16 v12, v24

    move-object/from16 v24, v13

    move/from16 v13, v25

    invoke-direct/range {v1 .. v13}, Le1/l;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;ZZZLjava/lang/reflect/Method;ZLb1/x;Lb1/l;Lcom/google/gson/reflect/TypeToken;ZZ)V

    invoke-interface {v15, v0, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Le1/l;

    if-nez p2, :cond_10

    goto :goto_d

    :cond_10
    move-object/from16 v2, p2

    :goto_d
    add-int/lit8 v3, v23, 0x1

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move-object/from16 v11, p3

    move/from16 v1, v21

    move/from16 v9, v22

    move-object/from16 v13, v24

    move/from16 v10, v26

    move-object/from16 v7, v27

    move-object/from16 v12, v28

    move/from16 v4, v29

    move-object/from16 v5, v30

    move/from16 v6, v31

    move/from16 v8, v32

    goto/16 :goto_7

    :cond_11
    move-object/from16 p2, v2

    move-object/from16 v27, v7

    move/from16 v32, v8

    move/from16 v22, v9

    move/from16 v26, v10

    move-object/from16 v28, v12

    move-object/from16 v24, v13

    if-nez p2, :cond_12

    :goto_e
    add-int/lit8 v8, v32, 0x1

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move-object/from16 v11, p3

    move/from16 v9, v22

    move-object/from16 v13, v24

    move/from16 v10, v26

    move-object/from16 v12, v28

    goto/16 :goto_1

    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Class "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " declares multiple JSON fields named \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p2

    iget-object v3, v2, Le1/l;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'; conflict is caused by fields "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Le1/l;->b:Ljava/lang/reflect/Field;

    invoke-static {v2}, Lg1/c;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " and "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v27 .. v27}, Lg1/c;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    move-object/from16 v24, v13

    invoke-virtual/range {v16 .. v16}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    move-object/from16 v3, v24

    invoke-static {v0, v3, v1, v2}, Ld1/d;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v13

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    goto/16 :goto_0

    :cond_14
    return-object v15
.end method

.method public final d(Ljava/lang/reflect/Field;Z)Z
    .locals 3

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Le1/p;->d:Ld1/i;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ld1/i;->c(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v1, p2}, Ld1/i;->b(Z)V

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    const/16 v2, 0x88

    and-int/2addr v0, v2

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ld1/i;->c(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    if-eqz p2, :cond_3

    iget-object p1, v1, Ld1/i;->b:Ljava/util/List;

    goto :goto_0

    :cond_3
    iget-object p1, v1, Ld1/i;->c:Ljava/util/List;

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    goto :goto_3

    :cond_6
    :goto_2
    const/4 p1, 0x0

    :goto_3
    return p1
.end method
