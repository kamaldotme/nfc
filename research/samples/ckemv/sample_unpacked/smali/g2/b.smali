.class public final Lg2/b;
.super LQ1/b;
.source "SourceFile"


# instance fields
.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lg2/d;

.field public g:I


# direct methods
.method public constructor <init>(Lg2/d;LO1/d;)V
    .locals 0

    iput-object p1, p0, Lg2/b;->f:Lg2/d;

    invoke-direct {p0, p2}, LQ1/b;-><init>(LO1/d;)V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lg2/b;->e:Ljava/lang/Object;

    iget p1, p0, Lg2/b;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg2/b;->g:I

    iget-object p1, p0, Lg2/b;->f:Lg2/d;

    invoke-static {p1, p0}, Lg2/d;->A(Lg2/d;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LP1/a;->b:LP1/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lg2/k;

    invoke-direct {v0, p1}, Lg2/k;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
