.class public final Li2/k;
.super LQ1/b;
.source "SourceFile"


# instance fields
.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Li2/l;

.field public g:I


# direct methods
.method public constructor <init>(Li2/l;LO1/d;)V
    .locals 0

    iput-object p1, p0, Li2/k;->f:Li2/l;

    invoke-direct {p0, p2}, LQ1/b;-><init>(LO1/d;)V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Li2/k;->e:Ljava/lang/Object;

    iget p1, p0, Li2/k;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li2/k;->g:I

    iget-object p1, p0, Li2/k;->f:Li2/l;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Li2/l;->b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
