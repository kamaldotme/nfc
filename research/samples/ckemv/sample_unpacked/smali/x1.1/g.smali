.class public final Lx1/g;
.super Lx1/h;
.source "SourceFile"


# static fields
.field public static final c:[Lx1/h;

.field public static final d:[Lx1/k;


# instance fields
.field public final synthetic a:I

.field public final b:[Lx1/h;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lx1/h;

    sput-object v0, Lx1/g;->c:[Lx1/h;

    const/4 v0, 0x0

    new-array v0, v0, [Lx1/k;

    sput-object v0, Lx1/g;->d:[Lx1/k;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;I)V
    .locals 5

    iput p2, p0, Lx1/g;->a:I

    packed-switch p2, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    sget-object p2, Lj1/c;->d:Lj1/c;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    sget-object v1, Lj1/c;->h:Lj1/c;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_a

    sget-object v3, Lj1/a;->i:Lj1/a;

    invoke-interface {p2, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Lj1/a;->p:Lj1/a;

    invoke-interface {p2, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Lj1/a;->h:Lj1/a;

    invoke-interface {p2, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Lj1/a;->q:Lj1/a;

    invoke-interface {p2, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    new-instance v3, Lx1/g;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4}, Lx1/g;-><init>(Ljava/util/Map;I)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    sget-object v3, Lj1/a;->d:Lj1/a;

    invoke-interface {p2, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v3, Lx1/c;

    invoke-direct {v3, v1}, Lx1/c;-><init>(Z)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    sget-object v1, Lj1/a;->e:Lj1/a;

    invoke-interface {p2, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Lx1/d;

    invoke-direct {v1}, Lx1/d;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    sget-object v1, Lj1/a;->f:Lj1/a;

    invoke-interface {p2, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Lx1/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    sget-object v1, Lj1/a;->j:Lj1/a;

    invoke-interface {p2, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v1, Lx1/f;

    invoke-direct {v1}, Lx1/f;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    sget-object v1, Lj1/a;->c:Lj1/a;

    invoke-interface {p2, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v1, Lx1/a;

    invoke-direct {v1}, Lx1/a;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    sget-object v1, Lj1/a;->n:Lj1/a;

    invoke-interface {p2, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    new-instance v1, Ly1/e;

    invoke-direct {v1}, Ly1/e;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    sget-object v1, Lj1/a;->o:Lj1/a;

    invoke-interface {p2, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    new-instance p2, Lz1/c;

    invoke-direct {p2}, Lz1/c;-><init>()V

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_b

    new-instance p2, Lx1/g;

    const/4 v1, 0x1

    invoke-direct {p2, p1, v1}, Lx1/g;-><init>(Ljava/util/Map;I)V

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lx1/c;

    invoke-direct {p1, v0}, Lx1/c;-><init>(Z)V

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lx1/a;

    invoke-direct {p1}, Lx1/a;-><init>()V

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lx1/d;

    invoke-direct {p1}, Lx1/d;-><init>()V

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lx1/b;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lx1/f;

    invoke-direct {p1}, Lx1/f;-><init>()V

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Ly1/e;

    invoke-direct {p1}, Ly1/e;-><init>()V

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lz1/c;

    invoke-direct {p1}, Lz1/c;-><init>()V

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    sget-object p1, Lx1/g;->c:[Lx1/h;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lx1/h;

    iput-object p1, p0, Lx1/g;->b:[Lx1/h;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_c

    const/4 p1, 0x0

    goto :goto_2

    :cond_c
    sget-object p2, Lj1/c;->d:Lj1/c;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    :goto_2
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_10

    sget-object v0, Lj1/a;->i:Lj1/a;

    invoke-interface {p1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    new-instance v0, Lx1/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx1/e;-><init>(I)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_d
    sget-object v0, Lj1/a;->p:Lj1/a;

    invoke-interface {p1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    new-instance v0, Lx1/e;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lx1/e;-><init>(I)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_3
    sget-object v0, Lj1/a;->h:Lj1/a;

    invoke-interface {p1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    new-instance v0, Lx1/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lx1/e;-><init>(I)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    sget-object v0, Lj1/a;->q:Lj1/a;

    invoke-interface {p1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    new-instance p1, Lx1/e;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lx1/e;-><init>(I)V

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_11

    new-instance p1, Lx1/e;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lx1/e;-><init>(I)V

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lx1/e;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Lx1/e;-><init>(I)V

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lx1/e;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lx1/e;-><init>(I)V

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    sget-object p1, Lx1/g;->d:[Lx1/k;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lx1/k;

    iput-object p1, p0, Lx1/g;->b:[Lx1/h;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final c()V
    .locals 4

    iget v0, p0, Lx1/g;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lx1/g;->b:[Lx1/h;

    check-cast v0, [Lx1/k;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lx1/g;->b:[Lx1/h;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-interface {v3}, Lj1/j;->c()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(ILp1/a;Ljava/util/Map;)Lj1/l;
    .locals 11

    iget v0, p0, Lx1/g;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p2}, Lx1/k;->o(Lp1/a;)[I

    move-result-object v0

    iget-object v1, p0, Lx1/g;->b:[Lx1/h;

    check-cast v1, [Lx1/k;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_5

    aget-object v5, v1, v4

    :try_start_0
    invoke-virtual {v5, p1, p2, v0, p3}, Lx1/k;->m(ILp1/a;[ILjava/util/Map;)Lj1/l;

    move-result-object v5

    iget-object v6, v5, Lj1/l;->d:Lj1/a;

    sget-object v7, Lj1/a;->i:Lj1/a;
    :try_end_0
    .catch Lj1/k; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v8, 0x1

    iget-object v9, v5, Lj1/l;->a:Ljava/lang/String;

    if-ne v6, v7, :cond_0

    :try_start_1
    invoke-virtual {v9, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x30

    if-ne v6, v7, :cond_0

    move v6, v8

    goto :goto_1

    :cond_0
    move v6, v3

    :goto_1
    if-nez p3, :cond_1

    const/4 v7, 0x0

    goto :goto_2

    :cond_1
    sget-object v7, Lj1/c;->d:Lj1/c;

    invoke-interface {p3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;
    :try_end_1
    .catch Lj1/k; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    sget-object v10, Lj1/a;->p:Lj1/a;

    if-eqz v7, :cond_3

    :try_start_2
    invoke-interface {v7, v10}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_3

    :cond_2
    move v7, v3

    goto :goto_4

    :cond_3
    :goto_3
    move v7, v8

    :goto_4
    if-eqz v6, :cond_4

    if-eqz v7, :cond_4

    new-instance v6, Lj1/l;

    invoke-virtual {v9, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    iget-object v8, v5, Lj1/l;->b:[B

    iget-object v9, v5, Lj1/l;->c:[Lj1/n;

    invoke-direct {v6, v7, v8, v9, v10}, Lj1/l;-><init>(Ljava/lang/String;[B[Lj1/n;Lj1/a;)V

    iget-object v5, v5, Lj1/l;->e:Ljava/util/Map;

    invoke-virtual {v6, v5}, Lj1/l;->a(Ljava/util/Map;)V
    :try_end_2
    .catch Lj1/k; {:try_start_2 .. :try_end_2} :catch_0

    move-object v5, v6

    :cond_4
    return-object v5

    :catch_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    sget-object p1, Lj1/h;->d:Lj1/h;

    throw p1

    :pswitch_0
    iget-object v0, p0, Lx1/g;->b:[Lx1/h;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_5
    if-ge v2, v1, :cond_6

    aget-object v3, v0, v2

    :try_start_3
    invoke-virtual {v3, p1, p2, p3}, Lx1/h;->d(ILp1/a;Ljava/util/Map;)Lj1/l;

    move-result-object p1
    :try_end_3
    .catch Lj1/k; {:try_start_3 .. :try_end_3} :catch_1

    return-object p1

    :catch_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_6
    sget-object p1, Lj1/h;->d:Lj1/h;

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
