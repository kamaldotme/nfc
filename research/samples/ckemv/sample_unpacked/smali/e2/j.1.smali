.class public final Le2/j;
.super Le2/T;
.source "SourceFile"

# interfaces
.implements Le2/i;


# instance fields
.field public final f:Le2/k;


# direct methods
.method public constructor <init>(Le2/Z;)V
    .locals 0

    invoke-direct {p0}, Lj2/k;-><init>()V

    iput-object p1, p0, Le2/j;->f:Le2/k;

    return-void
.end method


# virtual methods
.method public final bridge synthetic h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Le2/j;->p(Ljava/lang/Throwable;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method

.method public final i(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Le2/V;->o()Le2/Z;

    move-result-object v0

    invoke-virtual {v0, p1}, Le2/Z;->w(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final p(Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Le2/V;->o()Le2/Z;

    move-result-object p1

    iget-object v0, p0, Le2/j;->f:Le2/k;

    check-cast v0, Le2/Z;

    invoke-virtual {v0, p1}, Le2/Z;->s(Ljava/lang/Object;)Z

    return-void
.end method
