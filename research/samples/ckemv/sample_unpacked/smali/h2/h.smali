.class public final Lh2/h;
.super LQ1/b;
.source "SourceFile"


# instance fields
.field public e:Lh2/g;

.field public f:Lg2/t;

.field public g:Lg2/a;

.field public h:Z

.field public synthetic i:Ljava/lang/Object;

.field public j:I


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh2/h;->i:Ljava/lang/Object;

    iget p1, p0, Lh2/h;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh2/h;->j:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, p1, v0, p0}, Lh2/p;->a(Lh2/g;Lg2/q;ZLO1/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
