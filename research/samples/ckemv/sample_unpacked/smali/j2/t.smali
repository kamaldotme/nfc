.class public Lj2/t;
.super Le2/a;
.source "SourceFile"

# interfaces
.implements LQ1/c;


# instance fields
.field public final e:LO1/d;


# direct methods
.method public constructor <init>(LO1/d;LO1/i;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Le2/a;-><init>(LO1/i;Z)V

    iput-object p1, p0, Lj2/t;->e:LO1/d;

    return-void
.end method


# virtual methods
.method public final K()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final f()LQ1/c;
    .locals 2

    iget-object v0, p0, Lj2/t;->e:LO1/d;

    instance-of v1, v0, LQ1/c;

    if-eqz v1, :cond_0

    check-cast v0, LQ1/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public q(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj2/t;->e:LO1/d;

    invoke-static {v0}, Lv0/f;->y(LO1/d;)LO1/d;

    move-result-object v0

    invoke-static {p1}, Le2/v;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lj2/a;->j(LO1/d;Ljava/lang/Object;)V

    return-void
.end method

.method public r(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj2/t;->e:LO1/d;

    invoke-static {p1}, Le2/v;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LO1/d;->c(Ljava/lang/Object;)V

    return-void
.end method
