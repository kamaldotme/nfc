.class public final Le2/W;
.super Le2/V;
.source "SourceFile"


# instance fields
.field public final f:Le2/Z;

.field public final g:Le2/X;

.field public final h:Le2/j;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le2/Z;Le2/X;Le2/j;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lj2/k;-><init>()V

    iput-object p1, p0, Le2/W;->f:Le2/Z;

    iput-object p2, p0, Le2/W;->g:Le2/X;

    iput-object p3, p0, Le2/W;->h:Le2/j;

    iput-object p4, p0, Le2/W;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Le2/W;->p(Ljava/lang/Throwable;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method

.method public final p(Ljava/lang/Throwable;)V
    .locals 7

    iget-object p1, p0, Le2/W;->f:Le2/Z;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Le2/W;->h:Le2/j;

    invoke-static {v0}, Le2/Z;->N(Lj2/k;)Le2/j;

    move-result-object v0

    iget-object v1, p0, Le2/W;->g:Le2/X;

    iget-object v2, p0, Le2/W;->i:Ljava/lang/Object;

    if-eqz v0, :cond_2

    :cond_0
    new-instance v3, Le2/W;

    invoke-direct {v3, p1, v1, v0, v2}, Le2/W;-><init>(Le2/Z;Le2/X;Le2/j;Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    iget-object v6, v0, Le2/j;->f:Le2/k;

    invoke-static {v6, v4, v3, v5}, Le2/v;->i(Le2/Q;ZLe2/V;I)Le2/C;

    move-result-object v3

    sget-object v4, Le2/c0;->b:Le2/c0;

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Le2/Z;->N(Lj2/k;)Le2/j;

    move-result-object v0

    if-nez v0, :cond_0

    :cond_2
    invoke-virtual {p1, v1, v2}, Le2/Z;->z(Le2/X;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Le2/Z;->q(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
