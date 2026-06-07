.class public final Lr0/j;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:I

.field public final synthetic g:Lf/G;

.field public final synthetic h:Lv0/o;

.field public final synthetic i:Lr0/e;


# direct methods
.method public constructor <init>(Lf/G;Lv0/o;Lr0/e;LO1/d;)V
    .locals 0

    iput-object p1, p0, Lr0/j;->g:Lf/G;

    iput-object p2, p0, Lr0/j;->h:Lv0/o;

    iput-object p3, p0, Lr0/j;->i:Lr0/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 3

    new-instance p2, Lr0/j;

    iget-object v0, p0, Lr0/j;->h:Lv0/o;

    iget-object v1, p0, Lr0/j;->i:Lr0/e;

    iget-object v2, p0, Lr0/j;->g:Lf/G;

    invoke-direct {p2, v2, v0, v1, p1}, Lr0/j;-><init>(Lf/G;Lv0/o;Lr0/e;LO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, Lr0/j;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, Lr0/j;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, Lr0/j;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, Lr0/j;->f:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object p1, p0, Lr0/j;->g:Lf/G;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lr0/j;->h:Lv0/o;

    const-string v3, "spec"

    invoke-static {v1, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p1, Lf/G;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ls0/e;

    invoke-virtual {v5, v1}, Ls0/e;->b(Lv0/o;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v3}, LL1/m;->S(Ljava/lang/Iterable;)I

    move-result v4

    invoke-direct {p1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls0/e;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Ls0/d;

    const/4 v6, 0x0

    invoke-direct {v5, v4, v6}, Ls0/d;-><init>(Ls0/e;LO1/d;)V

    new-instance v4, Lh2/b;

    sget-object v6, LO1/j;->b:LO1/j;

    const/4 v7, -0x2

    invoke-direct {v4, v5, v6, v7, v2}, Lh2/b;-><init>(LW1/p;LO1/i;II)V

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {p1}, LL1/k;->Y(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    const/4 v3, 0x0

    new-array v3, v3, [Lh2/f;

    invoke-interface {p1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lh2/f;

    new-instance v3, Lr0/h;

    invoke-direct {v3, p1}, Lr0/h;-><init>([Lh2/f;)V

    instance-of p1, v3, Lh2/m;

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    sget-object p1, Lh2/j;->c:Lh2/j;

    sget-object v4, Lh2/i;->c:Lh2/i;

    instance-of v5, v3, Lh2/e;

    if-eqz v5, :cond_6

    move-object v5, v3

    check-cast v5, Lh2/e;

    iget-object v6, v5, Lh2/e;->b:LW1/l;

    if-ne v6, p1, :cond_6

    iget-object p1, v5, Lh2/e;->c:LW1/p;

    if-ne p1, v4, :cond_6

    goto :goto_2

    :cond_6
    new-instance p1, Lh2/e;

    invoke-direct {p1, v3}, Lh2/e;-><init>(Lr0/h;)V

    move-object v3, p1

    :goto_2
    new-instance p1, Lr0/i;

    iget-object v4, p0, Lr0/j;->i:Lr0/e;

    invoke-direct {p1, v4, v1}, Lr0/i;-><init>(Lr0/e;Lv0/o;)V

    iput v2, p0, Lr0/j;->f:I

    invoke-interface {v3, p1, p0}, Lh2/f;->a(Lh2/g;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_3
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
