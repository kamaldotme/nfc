.class public final Lg2/c;
.super LQ1/b;
.source "SourceFile"


# instance fields
.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lg2/d;

.field public g:I


# direct methods
.method public constructor <init>(Lg2/d;LO1/d;)V
    .locals 0

    iput-object p1, p0, Lg2/c;->f:Lg2/d;

    invoke-direct {p0, p2}, LQ1/b;-><init>(LO1/d;)V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lg2/c;->e:Ljava/lang/Object;

    iget p1, p0, Lg2/c;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg2/c;->g:I

    iget-object v0, p0, Lg2/c;->f:Lg2/d;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lg2/d;->B(Lg2/l;IJLO1/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LP1/a;->b:LP1/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lg2/k;

    invoke-direct {v0, p1}, Lg2/k;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
