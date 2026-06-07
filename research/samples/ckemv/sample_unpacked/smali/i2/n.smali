.class public final Li2/n;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:Lg2/h;

.field public g:[B

.field public h:I

.field public i:I

.field public j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:[Lh2/f;

.field public final synthetic m:LW1/a;

.field public final synthetic n:LW1/q;

.field public final synthetic o:Lh2/g;


# direct methods
.method public constructor <init>([Lh2/f;LW1/a;LW1/q;Lh2/g;LO1/d;)V
    .locals 0

    iput-object p1, p0, Li2/n;->l:[Lh2/f;

    iput-object p2, p0, Li2/n;->m:LW1/a;

    iput-object p3, p0, Li2/n;->n:LW1/q;

    iput-object p4, p0, Li2/n;->o:Lh2/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 7

    new-instance v6, Li2/n;

    iget-object v3, p0, Li2/n;->n:LW1/q;

    iget-object v4, p0, Li2/n;->o:Lh2/g;

    iget-object v1, p0, Li2/n;->l:[Lh2/f;

    iget-object v2, p0, Li2/n;->m:LW1/a;

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Li2/n;-><init>([Lh2/f;LW1/a;LW1/q;Lh2/g;LO1/d;)V

    iput-object p2, v6, Li2/n;->k:Ljava/lang/Object;

    return-object v6
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, Li2/n;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, Li2/n;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, Li2/n;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    sget-object v1, LP1/a;->b:LP1/a;

    iget v2, v0, Li2/n;->j:I

    sget-object v3, Li2/q;->b:Ld1/f;

    sget-object v4, LK1/h;->a:LK1/h;

    const/4 v5, 0x1

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v8, :cond_1

    if-ne v2, v6, :cond_0

    iget v2, v0, Li2/n;->i:I

    iget v9, v0, Li2/n;->h:I

    iget-object v10, v0, Li2/n;->g:[B

    iget-object v11, v0, Li2/n;->f:Lg2/h;

    iget-object v12, v0, Li2/n;->k:Ljava/lang/Object;

    check-cast v12, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    move v15, v8

    move v8, v2

    move-object v2, v10

    move-object v10, v12

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Li2/n;->i:I

    iget v9, v0, Li2/n;->h:I

    iget-object v10, v0, Li2/n;->g:[B

    iget-object v11, v0, Li2/n;->f:Lg2/h;

    iget-object v12, v0, Li2/n;->k:Ljava/lang/Object;

    check-cast v12, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    move v15, v8

    move v8, v2

    move-object v2, v10

    move-object v10, v12

    goto :goto_1

    :cond_2
    iget v2, v0, Li2/n;->i:I

    iget v9, v0, Li2/n;->h:I

    iget-object v10, v0, Li2/n;->g:[B

    iget-object v11, v0, Li2/n;->f:Lg2/h;

    iget-object v12, v0, Li2/n;->k:Ljava/lang/Object;

    check-cast v12, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    move-object/from16 v13, p1

    check-cast v13, Lg2/k;

    iget-object v13, v13, Lg2/k;->a:Ljava/lang/Object;

    move v8, v2

    move-object v2, v10

    move-object v10, v12

    goto :goto_2

    :cond_3
    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object v2, v0, Li2/n;->k:Ljava/lang/Object;

    check-cast v2, Le2/t;

    iget-object v9, v0, Li2/n;->l:[Lh2/f;

    array-length v9, v9

    if-nez v9, :cond_4

    return-object v4

    :cond_4
    new-array v10, v9, [Ljava/lang/Object;

    invoke-static {v10, v3, v7, v9}, LL1/j;->T([Ljava/lang/Object;Ld1/f;II)V

    const/4 v11, 0x6

    invoke-static {v9, v7, v11}, Lu2/d;->a(III)Lg2/d;

    move-result-object v11

    new-instance v15, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v15, v9}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    move v14, v7

    :goto_0
    if-ge v14, v9, :cond_5

    new-instance v13, Li2/m;

    iget-object v12, v0, Li2/n;->l:[Lh2/f;

    const/16 v17, 0x0

    move-object/from16 v16, v12

    move-object v12, v13

    move-object v8, v13

    move-object/from16 v13, v16

    move/from16 v18, v14

    move-object/from16 v19, v15

    move-object/from16 v16, v11

    invoke-direct/range {v12 .. v17}, Li2/m;-><init>([Lh2/f;ILjava/util/concurrent/atomic/AtomicInteger;Lg2/h;LO1/d;)V

    invoke-static {v2, v7, v8, v6}, Le2/v;->k(Le2/t;ILW1/p;I)Le2/f0;

    add-int/lit8 v14, v18, 0x1

    const/4 v8, 0x2

    goto :goto_0

    :cond_5
    new-array v2, v9, [B

    move v8, v7

    :cond_6
    :goto_1
    add-int/2addr v8, v5

    int-to-byte v8, v8

    iput-object v10, v0, Li2/n;->k:Ljava/lang/Object;

    iput-object v11, v0, Li2/n;->f:Lg2/h;

    iput-object v2, v0, Li2/n;->g:[B

    iput v9, v0, Li2/n;->h:I

    iput v8, v0, Li2/n;->i:I

    iput v5, v0, Li2/n;->j:I

    invoke-interface {v11, v0}, Lg2/t;->n(LO1/d;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    instance-of v12, v13, Lg2/j;

    const/4 v14, 0x0

    if-nez v12, :cond_8

    goto :goto_3

    :cond_8
    move-object v13, v14

    :goto_3
    check-cast v13, LL1/w;

    if-nez v13, :cond_9

    return-object v4

    :cond_9
    iget v12, v13, LL1/w;->a:I

    aget-object v15, v10, v12

    iget-object v13, v13, LL1/w;->b:Ljava/lang/Object;

    aput-object v13, v10, v12

    if-ne v15, v3, :cond_a

    add-int/lit8 v9, v9, -0x1

    :cond_a
    aget-byte v13, v2, v12

    if-eq v13, v8, :cond_c

    int-to-byte v13, v8

    aput-byte v13, v2, v12

    invoke-interface {v11}, Lg2/t;->h()Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Lg2/j;

    if-nez v13, :cond_b

    goto :goto_4

    :cond_b
    move-object v12, v14

    :goto_4
    move-object v13, v12

    check-cast v13, LL1/w;

    if-nez v13, :cond_9

    :cond_c
    if-nez v9, :cond_6

    iget-object v12, v0, Li2/n;->m:LW1/a;

    invoke-interface {v12}, LW1/a;->d()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Ljava/lang/Object;

    iget-object v13, v0, Li2/n;->o:Lh2/g;

    iget-object v14, v0, Li2/n;->n:LW1/q;

    if-nez v12, :cond_d

    iput-object v10, v0, Li2/n;->k:Ljava/lang/Object;

    iput-object v11, v0, Li2/n;->f:Lg2/h;

    iput-object v2, v0, Li2/n;->g:[B

    iput v9, v0, Li2/n;->h:I

    iput v8, v0, Li2/n;->i:I

    const/4 v15, 0x2

    iput v15, v0, Li2/n;->j:I

    invoke-interface {v14, v13, v10, v0}, LW1/q;->a(Lh2/g;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v1, :cond_6

    return-object v1

    :cond_d
    const/4 v15, 0x2

    array-length v5, v10

    invoke-static {v10, v12, v7, v7, v5}, LL1/j;->S([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iput-object v10, v0, Li2/n;->k:Ljava/lang/Object;

    iput-object v11, v0, Li2/n;->f:Lg2/h;

    iput-object v2, v0, Li2/n;->g:[B

    iput v9, v0, Li2/n;->h:I

    iput v8, v0, Li2/n;->i:I

    iput v6, v0, Li2/n;->j:I

    invoke-interface {v14, v13, v12, v0}, LW1/q;->a(Lh2/g;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_e

    return-object v1

    :cond_e
    :goto_5
    const/4 v5, 0x1

    goto/16 :goto_1
.end method
