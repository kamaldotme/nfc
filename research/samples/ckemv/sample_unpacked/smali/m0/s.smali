.class public final Lm0/s;
.super La0/m;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;)V
    .locals 35

    move-object/from16 v0, p0

    move/from16 v1, p1

    iput v1, v0, Lm0/s;->d:I

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    const-string v2, "randomUUID()"

    invoke-static {v1, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, La0/m;->a:Ljava/lang/Object;

    new-instance v1, Lv0/o;

    iget-object v2, v0, La0/m;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v2, "id.toString()"

    invoke-static {v4, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const/16 v18, 0x0

    const/16 v28, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const v34, 0x7ffffa

    move-object v3, v1

    invoke-direct/range {v3 .. v34}, Lv0/o;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lm0/g;Lm0/g;JJJLm0/d;IIJJJJZIIJIII)V

    iput-object v1, v0, La0/m;->b:Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashSet;

    const/4 v3, 0x1

    invoke-static {v3}, LL1/x;->O(I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashSet;-><init>(I)V

    const/4 v3, 0x0

    aget-object v1, v1, v3

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iput-object v2, v0, La0/m;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c()Lm0/A;
    .locals 4

    iget v0, p0, Lm0/s;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La0/m;->b:Ljava/lang/Object;

    check-cast v0, Lv0/o;

    iget-boolean v1, v0, Lv0/o;->q:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    new-instance v1, Lm0/y;

    iget-object v2, p0, La0/m;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/UUID;

    iget-object v3, p0, La0/m;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashSet;

    invoke-direct {v1, v2, v0, v3}, Lm0/A;-><init>(Ljava/util/UUID;Lv0/o;Ljava/util/LinkedHashSet;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "PeriodicWorkRequests cannot be expedited"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Lm0/t;

    iget-object v1, p0, La0/m;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/UUID;

    iget-object v2, p0, La0/m;->b:Ljava/lang/Object;

    check-cast v2, Lv0/o;

    iget-object v3, p0, La0/m;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashSet;

    invoke-direct {v0, v1, v2, v3}, Lm0/A;-><init>(Ljava/util/UUID;Lv0/o;Ljava/util/LinkedHashSet;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
