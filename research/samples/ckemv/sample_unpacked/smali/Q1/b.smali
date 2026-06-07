.class public abstract LQ1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/d;
.implements LQ1/c;
.implements Ljava/io/Serializable;


# instance fields
.field public final b:LO1/d;

.field public final c:LO1/i;

.field public transient d:LO1/d;


# direct methods
.method public constructor <init>(LO1/d;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LO1/d;->j()LO1/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ1/b;->b:LO1/d;

    iput-object v0, p0, LQ1/b;->c:LO1/i;

    return-void
.end method


# virtual methods
.method public b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 0

    const-string p2, "completion"

    invoke-static {p1, p2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "create(Any?;Continuation) has not been overridden"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 3

    move-object v0, p0

    :goto_0
    check-cast v0, LQ1/b;

    iget-object v1, v0, LQ1/b;->b:LO1/d;

    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {v0, p1}, LQ1/b;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v2, LP1/a;->b:LP1/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v2, :cond_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object p1

    :cond_0
    invoke-virtual {v0}, LQ1/b;->l()V

    instance-of v0, v1, LQ1/b;

    if-eqz v0, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-interface {v1, p1}, LO1/d;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public final f()LQ1/c;
    .locals 2

    iget-object v0, p0, LQ1/b;->b:LO1/d;

    instance-of v1, v0, LQ1/c;

    if-eqz v1, :cond_0

    check-cast v0, LQ1/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final i()Ljava/lang/StackTraceElement;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, LQ1/d;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, LQ1/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_a

    :cond_0
    invoke-interface {v0}, LQ1/d;->v()I

    move-result v2

    const/4 v3, 0x1

    if-gt v2, v3, :cond_d

    const/4 v2, -0x1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v5, "label"

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/Integer;

    if-eqz v5, :cond_1

    check-cast v4, Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    sub-int/2addr v4, v3

    goto :goto_2

    :catch_0
    move v4, v2

    :goto_2
    if-gez v4, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {v0}, LQ1/d;->l()[I

    move-result-object v2

    aget v2, v2, v4

    :goto_3
    sget-object v3, LQ1/f;->b:LQ1/e;

    sget-object v4, LQ1/f;->a:LQ1/e;

    if-nez v3, :cond_4

    :try_start_1
    const-class v3, Ljava/lang/Class;

    const-string v5, "getModule"

    invoke-virtual {v3, v5, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    const-string v6, "java.lang.Module"

    invoke-virtual {v5, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const-string v6, "getDescriptor"

    invoke-virtual {v5, v6, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    const-string v7, "java.lang.module.ModuleDescriptor"

    invoke-virtual {v6, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const-string v7, "name"

    invoke-virtual {v6, v7, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    new-instance v7, LQ1/e;

    invoke-direct {v7, v3, v5, v6}, LQ1/e;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v7, LQ1/f;->b:LQ1/e;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v3, v7

    goto :goto_4

    :catch_1
    sput-object v4, LQ1/f;->b:LQ1/e;

    move-object v3, v4

    :cond_4
    :goto_4
    if-ne v3, v4, :cond_5

    goto :goto_8

    :cond_5
    iget-object v4, v3, LQ1/e;->a:Ljava/lang/reflect/Method;

    if-eqz v4, :cond_6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_5

    :cond_6
    move-object v4, v1

    :goto_5
    if-nez v4, :cond_7

    goto :goto_8

    :cond_7
    iget-object v5, v3, LQ1/e;->b:Ljava/lang/reflect/Method;

    if-eqz v5, :cond_8

    invoke-virtual {v5, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_6

    :cond_8
    move-object v4, v1

    :goto_6
    if-nez v4, :cond_9

    goto :goto_8

    :cond_9
    iget-object v3, v3, LQ1/e;->c:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_a

    invoke-virtual {v3, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_7

    :cond_a
    move-object v3, v1

    :goto_7
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_b

    move-object v1, v3

    check-cast v1, Ljava/lang/String;

    :cond_b
    :goto_8
    if-nez v1, :cond_c

    invoke-interface {v0}, LQ1/d;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :cond_c
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v0}, LQ1/d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_9
    new-instance v3, Ljava/lang/StackTraceElement;

    invoke-interface {v0}, LQ1/d;->m()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0}, LQ1/d;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v4, v0, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v1, v3

    :goto_a
    return-object v1

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Debug metadata version mismatch. Expected: 1, got "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". Please update the Kotlin standard library."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()LO1/i;
    .locals 1

    iget-object v0, p0, LQ1/b;->c:LO1/i;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public abstract k(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final l()V
    .locals 4

    iget-object v0, p0, LQ1/b;->d:LO1/d;

    if-eqz v0, :cond_2

    if-eq v0, p0, :cond_2

    iget-object v1, p0, LQ1/b;->c:LO1/i;

    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    sget-object v2, LO1/e;->b:LO1/e;

    invoke-interface {v1, v2}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v1

    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    check-cast v1, LO1/f;

    check-cast v0, Lj2/h;

    :cond_0
    sget-object v1, Lj2/h;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lj2/a;->d:Ld1/f;

    if-eq v2, v3, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Le2/f;

    if-eqz v1, :cond_1

    check-cast v0, Le2/f;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Le2/f;->o()V

    :cond_2
    sget-object v0, LQ1/a;->b:LQ1/a;

    iput-object v0, p0, LQ1/b;->d:LO1/d;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Continuation at "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, LQ1/b;->i()Ljava/lang/StackTraceElement;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
