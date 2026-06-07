.class public abstract Le1/m;
.super Lb1/x;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/m;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Li1/a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Li1/a;->W()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Li1/a;->S()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Le1/m;->c()Ljava/lang/Object;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Li1/a;->b()V

    :goto_0
    invoke-virtual {p1}, Li1/a;->J()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Li1/a;->Q()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Le1/m;->a:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le1/l;

    if-eqz v1, :cond_2

    iget-boolean v2, v1, Le1/l;->e:Z

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v0, p1, v1}, Le1/m;->e(Ljava/lang/Object;Li1/a;Le1/l;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_1
    invoke-virtual {p1}, Li1/a;->c0()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Li1/a;->D()V

    invoke-virtual {p0, v0}, Le1/m;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_2
    sget-object v0, Lg1/c;->a:Lm0/z;

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_3
    new-instance v0, Lb1/o;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final b(Li1/b;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Li1/b;->J()Li1/b;

    return-void

    :cond_0
    invoke-virtual {p1}, Li1/b;->i()V

    :try_start_0
    iget-object v0, p0, Le1/m;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le1/l;

    invoke-virtual {v1, p1, p2}, Le1/l;->a(Li1/b;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Li1/b;->D()V

    return-void

    :goto_1
    sget-object p2, Lg1/c;->a:Lm0/z;

    new-instance p2, Ljava/lang/RuntimeException;

    const-string v0, "Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public abstract c()Ljava/lang/Object;
.end method

.method public abstract d(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract e(Ljava/lang/Object;Li1/a;Le1/l;)V
.end method
