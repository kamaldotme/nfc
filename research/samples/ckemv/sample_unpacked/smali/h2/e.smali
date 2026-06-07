.class public final Lh2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/f;


# instance fields
.field public final a:Lh2/f;

.field public final b:LW1/l;

.field public final c:LW1/p;


# direct methods
.method public constructor <init>(Lr0/h;)V
    .locals 2

    sget-object v0, Lh2/j;->c:Lh2/j;

    sget-object v1, Lh2/i;->c:Lh2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/e;->a:Lh2/f;

    iput-object v0, p0, Lh2/e;->b:LW1/l;

    iput-object v1, p0, Lh2/e;->c:LW1/p;

    return-void
.end method


# virtual methods
.method public final a(Lh2/g;LO1/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LX1/j;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX1/j;-><init>(I)V

    sget-object v1, Li2/q;->a:Ld1/f;

    iput-object v1, v0, LX1/j;->c:Ljava/lang/Object;

    new-instance v1, Lh2/d;

    invoke-direct {v1, p0, v0, p1}, Lh2/d;-><init>(Lh2/e;LX1/j;Lh2/g;)V

    iget-object p1, p0, Lh2/e;->a:Lh2/f;

    invoke-interface {p1, v1, p2}, Lh2/f;->a(Lh2/g;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LP1/a;->b:LP1/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
