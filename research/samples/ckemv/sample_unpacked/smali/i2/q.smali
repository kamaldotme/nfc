.class public abstract Li2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld1/f;

.field public static final b:Ld1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld1/f;

    const-string v1, "NULL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li2/q;->a:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "UNINITIALIZED"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li2/q;->b:Ld1/f;

    return-void
.end method

.method public static final a(LO1/i;Ljava/lang/Object;Ljava/lang/Object;LW1/p;LO1/d;)Ljava/lang/Object;
    .locals 2

    invoke-static {p0, p2}, Lj2/a;->n(LO1/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :try_start_0
    new-instance v0, Li2/s;

    invoke-direct {v0, p4, p0}, Li2/s;-><init>(LO1/d;LO1/i;)V

    const/4 v1, 0x2

    invoke-static {v1, p3}, LX1/m;->a(ILjava/lang/Object;)V

    invoke-interface {p3, p1, v0}, LW1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, p2}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    sget-object p0, LP1/a;->b:LP1/a;

    if-ne p1, p0, :cond_0

    const-string p0, "frame"

    invoke-static {p4, p0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {p0, p2}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    throw p1
.end method
