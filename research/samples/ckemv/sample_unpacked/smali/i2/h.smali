.class public final Li2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/g;


# instance fields
.field public final synthetic a:LX1/j;

.field public final synthetic b:Le2/t;

.field public final synthetic c:Lh2/b;

.field public final synthetic d:Lh2/g;


# direct methods
.method public constructor <init>(LX1/j;Le2/t;Lh2/b;Lh2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/h;->a:LX1/j;

    iput-object p2, p0, Li2/h;->b:Le2/t;

    iput-object p3, p0, Li2/h;->c:Lh2/b;

    iput-object p4, p0, Li2/h;->d:Lh2/g;

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Li2/g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Li2/g;

    iget v1, v0, Li2/g;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Li2/g;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, Li2/g;

    invoke-direct {v0, p0, p1}, Li2/g;-><init>(Li2/h;LO1/d;)V

    :goto_0
    iget-object p1, v0, Li2/g;->g:Ljava/lang/Object;

    sget-object v1, LP1/a;->b:LP1/a;

    iget v2, v0, Li2/g;->i:I

    sget-object v3, LK1/h;->a:LK1/h;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p2, v0, Li2/g;->f:Ljava/lang/Object;

    iget-object v0, v0, Li2/g;->e:Li2/h;

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object p1, p0, Li2/h;->a:LX1/j;

    iget-object p1, p1, LX1/j;->c:Ljava/lang/Object;

    check-cast p1, Le2/Q;

    if-eqz p1, :cond_8

    new-instance v2, Li2/j;

    const-string v5, "Child of the scoped flow was cancelled"

    invoke-direct {v2, v5}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v2}, Le2/Q;->a(Ljava/util/concurrent/CancellationException;)V

    iput-object p0, v0, Li2/g;->e:Li2/h;

    iput-object p2, v0, Li2/g;->f:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v4, v0, Li2/g;->i:I

    check-cast p1, Le2/Z;

    :cond_3
    invoke-virtual {p1}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Le2/M;

    if-nez v5, :cond_6

    iget-object p1, v0, LQ1/b;->c:LO1/i;

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V

    sget-object v0, Le2/s;->c:Le2/s;

    invoke-interface {p1, v0}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object p1

    check-cast p1, Le2/Q;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Le2/Q;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    check-cast p1, Le2/Z;

    invoke-virtual {p1}, Le2/Z;->B()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    throw p1

    :cond_5
    :goto_1
    move-object p1, v3

    goto :goto_3

    :cond_6
    invoke-virtual {p1, v2}, Le2/Z;->S(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_3

    new-instance v2, Le2/f;

    invoke-static {v0}, Lv0/f;->y(LO1/d;)LO1/d;

    move-result-object v0

    invoke-direct {v2, v4, v0}, Le2/f;-><init>(ILO1/d;)V

    invoke-virtual {v2}, Le2/f;->r()V

    new-instance v0, Le2/P;

    const/4 v5, 0x1

    invoke-direct {v0, v5, v2}, Le2/P;-><init>(ILjava/lang/Object;)V

    const/4 v5, 0x0

    invoke-virtual {p1, v5, v4, v0}, Le2/Z;->J(ZZLW1/l;)Le2/C;

    move-result-object p1

    new-instance v0, Le2/d;

    const/4 v5, 0x1

    invoke-direct {v0, v5, p1}, Le2/d;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v0}, Le2/f;->t(LW1/l;)V

    invoke-virtual {v2}, Le2/f;->q()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_2

    :cond_7
    move-object p1, v3

    :goto_2
    if-ne p1, v1, :cond_5

    :goto_3
    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    move-object v0, p0

    :goto_4
    iget-object p1, v0, Li2/h;->a:LX1/j;

    new-instance v1, Li2/f;

    const/4 v2, 0x0

    iget-object v5, v0, Li2/h;->c:Lh2/b;

    iget-object v6, v0, Li2/h;->d:Lh2/g;

    invoke-direct {v1, v5, v6, p2, v2}, Li2/f;-><init>(Lh2/b;Lh2/g;Ljava/lang/Object;LO1/d;)V

    iget-object p2, v0, Li2/h;->b:Le2/t;

    const/4 v0, 0x4

    invoke-static {p2, v0, v1, v4}, Le2/v;->k(Le2/t;ILW1/p;I)Le2/f0;

    move-result-object p2

    iput-object p2, p1, LX1/j;->c:Ljava/lang/Object;

    return-object v3
.end method
