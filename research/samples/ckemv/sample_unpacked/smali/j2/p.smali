.class public final Lj2/p;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/l;


# instance fields
.field public final synthetic c:LW1/l;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:LO1/i;


# direct methods
.method public constructor <init>(LW1/l;Ljava/lang/Object;LO1/i;)V
    .locals 0

    iput-object p1, p0, Lj2/p;->c:LW1/l;

    iput-object p2, p0, Lj2/p;->d:Ljava/lang/Object;

    iput-object p3, p0, Lj2/p;->e:LO1/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LX1/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Lj2/p;->e:LO1/i;

    iget-object v0, p0, Lj2/p;->c:LW1/l;

    iget-object v1, p0, Lj2/p;->d:Ljava/lang/Object;

    invoke-static {v0, v1, p1}, Lj2/a;->a(LW1/l;Ljava/lang/Object;LO1/i;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
