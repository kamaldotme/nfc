.class public final Le2/a0;
.super Le2/f0;
.source "SourceFile"


# instance fields
.field public final e:LO1/d;


# direct methods
.method public constructor <init>(LO1/i;LW1/p;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Le2/a;-><init>(LO1/i;Z)V

    invoke-static {p2, p0, p0}, Lv0/f;->q(LW1/p;Ljava/lang/Object;LO1/d;)LO1/d;

    move-result-object p1

    iput-object p1, p0, Le2/a0;->e:LO1/d;

    return-void
.end method


# virtual methods
.method public final Q()V
    .locals 3

    iget-object v0, p0, Le2/a0;->e:LO1/d;

    :try_start_0
    invoke-static {v0}, Lv0/f;->y(LO1/d;)LO1/d;

    move-result-object v0

    sget-object v1, LK1/h;->a:LK1/h;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lj2/a;->i(LO1/d;Ljava/lang/Object;LW1/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object v1

    invoke-virtual {p0, v1}, Le2/a;->c(Ljava/lang/Object;)V

    throw v0
.end method
