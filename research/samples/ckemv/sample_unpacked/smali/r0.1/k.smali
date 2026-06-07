.class public abstract Lr0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "WorkConstraintsTracker"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tagWithPrefix(\"WorkConstraintsTracker\")"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static final a(Lf/G;Lv0/o;Le2/K;Lr0/e;)Le2/U;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Le2/v;->b()Le2/U;

    move-result-object v0

    invoke-static {p2, v0}, Lm0/z;->a0(LO1/i;LO1/i;)LO1/i;

    move-result-object p2

    invoke-static {p2}, Le2/v;->a(LO1/i;)Lj2/e;

    move-result-object p2

    new-instance v1, Lr0/j;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p3, v2}, Lr0/j;-><init>(Lf/G;Lv0/o;Lr0/e;LO1/d;)V

    const/4 p0, 0x3

    const/4 p1, 0x0

    invoke-static {p2, p1, v1, p0}, Le2/v;->k(Le2/t;ILW1/p;I)Le2/f0;

    return-object v0
.end method
