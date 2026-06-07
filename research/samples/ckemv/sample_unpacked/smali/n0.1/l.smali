.class public abstract Ln0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Schedulers"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public static a(Lv0/p;Lm0/r;Ljava/util/ArrayList;)V
    .locals 2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lv0/o;

    iget-object p2, p2, Lv0/o;->a:Ljava/lang/String;

    invoke-virtual {p0, p2, v0, v1}, Lv0/p;->k(Ljava/lang/String;J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b(Lm0/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V
    .locals 3

    if-eqz p2, :cond_5

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    invoke-virtual {v0}, Lv0/p;->d()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lm0/a;->c:Lm0/r;

    invoke-static {v0, v2, v1}, Ln0/l;->a(Lv0/p;Lm0/r;Ljava/util/ArrayList;)V

    iget v2, p0, Lm0/a;->i:I

    invoke-virtual {v0, v2}, Lv0/p;->c(I)Ljava/util/ArrayList;

    move-result-object v2

    iget-object p0, p0, Lm0/a;->c:Lm0/r;

    invoke-static {v0, p0, v2}, Ln0/l;->a(Lv0/p;Lm0/r;Ljava/util/ArrayList;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Lv0/p;->b()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Lv0/o;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lv0/o;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/i;

    invoke-interface {v1}, Ln0/i;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1, p1}, Ln0/i;->e([Lv0/o;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_4

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Lv0/o;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lv0/o;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln0/i;

    invoke-interface {p2}, Ln0/i;->b()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2, p0}, Ln0/i;->e([Lv0/o;)V

    goto :goto_1

    :cond_4
    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->k()V

    throw p0

    :cond_5
    :goto_2
    return-void
.end method
