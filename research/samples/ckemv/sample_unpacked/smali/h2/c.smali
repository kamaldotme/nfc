.class public final Lh2/c;
.super LQ1/b;
.source "SourceFile"


# instance fields
.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lh2/d;

.field public g:I


# direct methods
.method public constructor <init>(Lh2/d;LO1/d;)V
    .locals 0

    iput-object p1, p0, Lh2/c;->f:Lh2/d;

    invoke-direct {p0, p2}, LQ1/b;-><init>(LO1/d;)V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh2/c;->e:Ljava/lang/Object;

    iget p1, p0, Lh2/c;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh2/c;->g:I

    iget-object p1, p0, Lh2/c;->f:Lh2/d;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Lh2/d;->b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
