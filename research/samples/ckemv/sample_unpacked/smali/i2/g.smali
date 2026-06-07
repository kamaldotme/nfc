.class public final Li2/g;
.super LQ1/b;
.source "SourceFile"


# instance fields
.field public e:Li2/h;

.field public f:Ljava/lang/Object;

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Li2/h;

.field public i:I


# direct methods
.method public constructor <init>(Li2/h;LO1/d;)V
    .locals 0

    iput-object p1, p0, Li2/g;->h:Li2/h;

    invoke-direct {p0, p2}, LQ1/b;-><init>(LO1/d;)V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Li2/g;->g:Ljava/lang/Object;

    iget p1, p0, Li2/g;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li2/g;->i:I

    iget-object p1, p0, Li2/g;->h:Li2/h;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Li2/h;->b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
