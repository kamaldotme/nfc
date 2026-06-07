.class public final Lr0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/f;


# instance fields
.field public final synthetic a:[Lh2/f;


# direct methods
.method public constructor <init>([Lh2/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/h;->a:[Lh2/f;

    return-void
.end method


# virtual methods
.method public final a(Lh2/g;LO1/d;)Ljava/lang/Object;
    .locals 7

    new-instance v2, La0/l;

    iget-object v1, p0, Lr0/h;->a:[Lh2/f;

    const/4 v0, 0x5

    invoke-direct {v2, v0, v1}, La0/l;-><init>(ILjava/lang/Object;)V

    new-instance v3, Lr0/g;

    const/4 v0, 0x3

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, LQ1/g;-><init>(ILO1/d;)V

    new-instance v6, Li2/n;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Li2/n;-><init>([Lh2/f;LW1/a;LW1/q;Lh2/g;LO1/d;)V

    new-instance p1, Li2/o;

    invoke-interface {p2}, LO1/d;->j()LO1/i;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lj2/t;-><init>(LO1/d;LO1/i;)V

    invoke-static {p1, p1, v6}, Lv0/f;->N(Lj2/t;Lj2/t;LW1/p;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LP1/a;->b:LP1/a;

    sget-object v0, LK1/h;->a:LK1/h;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v0
.end method
