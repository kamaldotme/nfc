.class public final Lg2/p;
.super LQ1/b;
.source "SourceFile"


# instance fields
.field public e:LW1/a;

.field public synthetic f:Ljava/lang/Object;

.field public g:I


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lg2/p;->f:Ljava/lang/Object;

    iget p1, p0, Lg2/p;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg2/p;->g:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lu2/l;->b(Lg2/r;Ls0/b;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
