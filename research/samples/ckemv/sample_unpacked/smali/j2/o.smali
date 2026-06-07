.class public abstract Lj2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const-string v0, "kotlinx.coroutines.fast.service.loader"

    sget v1, Lj2/w;->a:I

    const/4 v1, 0x0

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    :cond_0
    invoke-static {}, LX/d;->p()Ljava/util/Iterator;

    move-result-object v0

    const-string v2, "<this>"

    invoke-static {v0, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LL1/r;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0}, LL1/r;-><init>(ILjava/lang/Object;)V

    instance-of v0, v2, Lc2/a;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Lc2/a;

    invoke-direct {v0, v2}, Lc2/a;-><init>(LL1/r;)V

    move-object v2, v0

    :goto_1
    invoke-static {v2}, Lc2/d;->Q(Lc2/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    move-object v3, v1

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    move-object v4, v3

    check-cast v4, Lf2/a;

    invoke-virtual {v4}, Lf2/a;->b()I

    move-result v4

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lf2/a;

    invoke-virtual {v6}, Lf2/a;->b()I

    move-result v6

    if-ge v4, v6, :cond_5

    move-object v3, v5

    move v4, v6

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_4

    :goto_2
    check-cast v3, Lf2/a;

    if-eqz v3, :cond_6

    :try_start_1
    invoke-virtual {v3, v0}, Lf2/a;->a(Ljava/util/List;)Lf2/d;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    invoke-virtual {v3}, Lf2/a;->c()Ljava/lang/String;

    :goto_3
    if-eqz v1, :cond_6

    sput-object v1, Lj2/o;->a:Lf2/d;

    return-void

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
