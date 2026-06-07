.class public final Lj1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/j;


# static fields
.field public static final c:[Lj1/j;


# instance fields
.field public a:Ljava/util/Map;

.field public b:[Lj1/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lj1/j;

    sput-object v0, Lj1/g;->c:[Lj1/j;

    return-void
.end method


# virtual methods
.method public final a(Lv0/e;Ljava/util/Map;)Lj1/l;
    .locals 0

    invoke-virtual {p0, p2}, Lj1/g;->e(Ljava/util/Map;)V

    invoke-virtual {p0, p1}, Lj1/g;->d(Lv0/e;)Lj1/l;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lv0/e;)Lj1/l;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj1/g;->e(Ljava/util/Map;)V

    invoke-virtual {p0, p1}, Lj1/g;->d(Lv0/e;)Lj1/l;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lj1/g;->b:[Lj1/j;

    if-eqz v0, :cond_0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3}, Lj1/j;->c()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Lv0/e;)Lj1/l;
    .locals 5

    iget-object v0, p0, Lj1/g;->b:[Lj1/j;

    if-eqz v0, :cond_0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    :try_start_0
    iget-object v4, p0, Lj1/g;->a:Ljava/util/Map;

    invoke-interface {v3, p1, v4}, Lj1/j;->a(Lv0/e;Ljava/util/Map;)Lj1/l;

    move-result-object p1
    :try_end_0
    .catch Lj1/k; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sget-object p1, Lj1/h;->d:Lj1/h;

    throw p1
.end method

.method public final e(Ljava/util/Map;)V
    .locals 6

    iput-object p1, p0, Lj1/g;->a:Ljava/util/Map;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    sget-object v2, Lj1/c;->e:Lj1/c;

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-nez p1, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    sget-object v3, Lj1/c;->d:Lj1/c;

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    :goto_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    if-eqz v3, :cond_a

    sget-object v5, Lj1/a;->p:Lj1/a;

    invoke-interface {v3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lj1/a;->q:Lj1/a;

    invoke-interface {v3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lj1/a;->i:Lj1/a;

    invoke-interface {v3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lj1/a;->h:Lj1/a;

    invoke-interface {v3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lj1/a;->c:Lj1/a;

    invoke-interface {v3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lj1/a;->d:Lj1/a;

    invoke-interface {v3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lj1/a;->e:Lj1/a;

    invoke-interface {v3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lj1/a;->f:Lj1/a;

    invoke-interface {v3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lj1/a;->j:Lj1/a;

    invoke-interface {v3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lj1/a;->n:Lj1/a;

    invoke-interface {v3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Lj1/a;->o:Lj1/a;

    invoke-interface {v3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    move v0, v1

    :cond_3
    if-eqz v0, :cond_4

    if-nez v2, :cond_4

    new-instance v1, Lx1/g;

    const/4 v5, 0x0

    invoke-direct {v1, p1, v5}, Lx1/g;-><init>(Ljava/util/Map;I)V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    sget-object v1, Lj1/a;->m:Lj1/a;

    invoke-interface {v3, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, LF1/a;

    invoke-direct {v1}, LF1/a;-><init>()V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    sget-object v1, Lj1/a;->g:Lj1/a;

    invoke-interface {v3, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ls1/a;

    invoke-direct {v1}, Ls1/a;-><init>()V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    sget-object v1, Lj1/a;->b:Lj1/a;

    invoke-interface {v3, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v1, Lk1/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    sget-object v1, Lj1/a;->l:Lj1/a;

    invoke-interface {v3, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v1, LB1/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    sget-object v1, Lj1/a;->k:Lj1/a;

    invoke-interface {v3, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    new-instance v1, Lv1/a;

    invoke-direct {v1}, Lv1/a;-><init>()V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    if-eqz v0, :cond_a

    if-eqz v2, :cond_a

    new-instance v0, Lx1/g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lx1/g;-><init>(Ljava/util/Map;I)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    if-nez v2, :cond_b

    new-instance v0, Lx1/g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lx1/g;-><init>(Ljava/util/Map;I)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    new-instance v0, LF1/a;

    invoke-direct {v0}, LF1/a;-><init>()V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ls1/a;

    invoke-direct {v0}, Ls1/a;-><init>()V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lk1/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LB1/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lv1/a;

    invoke-direct {v0}, Lv1/a;-><init>()V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v2, :cond_c

    new-instance v0, Lx1/g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lx1/g;-><init>(Ljava/util/Map;I)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    sget-object p1, Lj1/g;->c:[Lj1/j;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lj1/j;

    iput-object p1, p0, Lj1/g;->b:[Lj1/j;

    return-void
.end method
