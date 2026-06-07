.class public final Lh2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/g;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh2/e;LX1/j;Lh2/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh2/d;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/d;->b:Ljava/lang/Object;

    iput-object p2, p0, Lh2/d;->c:Ljava/lang/Object;

    iput-object p3, p0, Lh2/d;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh2/g;LO1/i;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh2/d;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lh2/d;->b:Ljava/lang/Object;

    .line 4
    invoke-static {p2}, Lj2/a;->m(LO1/i;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Lh2/d;->c:Ljava/lang/Object;

    .line 5
    new-instance p2, Li2/t;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Li2/t;-><init>(Lh2/g;LO1/d;)V

    iput-object p2, p0, Lh2/d;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lh2/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh2/d;->b:Ljava/lang/Object;

    check-cast v0, LO1/i;

    iget-object v1, p0, Lh2/d;->c:Ljava/lang/Object;

    iget-object v2, p0, Lh2/d;->d:Ljava/lang/Object;

    check-cast v2, Li2/t;

    invoke-static {v0, p2, v1, v2, p1}, Li2/q;->a(LO1/i;Ljava/lang/Object;Ljava/lang/Object;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LP1/a;->b:LP1/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, LK1/h;->a:LK1/h;

    :goto_0
    return-object p1

    :pswitch_0
    instance-of v0, p1, Lh2/c;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lh2/c;

    iget v1, v0, Lh2/c;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_1

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/c;->g:I

    goto :goto_1

    :cond_1
    new-instance v0, Lh2/c;

    invoke-direct {v0, p0, p1}, Lh2/c;-><init>(Lh2/d;LO1/d;)V

    :goto_1
    iget-object p1, v0, Lh2/c;->e:Ljava/lang/Object;

    sget-object v1, LP1/a;->b:LP1/a;

    iget v2, v0, Lh2/c;->g:I

    sget-object v3, LK1/h;->a:LK1/h;

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-ne v2, v4, :cond_2

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/d;->b:Ljava/lang/Object;

    check-cast p1, Lh2/e;

    iget-object v2, p1, Lh2/e;->b:LW1/l;

    invoke-interface {v2, p2}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iget-object v5, p0, Lh2/d;->c:Ljava/lang/Object;

    check-cast v5, LX1/j;

    iget-object v6, v5, LX1/j;->c:Ljava/lang/Object;

    sget-object v7, Li2/q;->a:Ld1/f;

    if-eq v6, v7, :cond_5

    iget-object p1, p1, Lh2/e;->c:LW1/p;

    invoke-interface {p1, v6, v2}, LW1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    move-object v1, v3

    goto :goto_4

    :cond_5
    :goto_3
    iput-object v2, v5, LX1/j;->c:Ljava/lang/Object;

    iput v4, v0, Lh2/c;->g:I

    iget-object p1, p0, Lh2/d;->d:Ljava/lang/Object;

    check-cast p1, Lh2/g;

    invoke-interface {p1, v0, p2}, Lh2/g;->b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_4
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
