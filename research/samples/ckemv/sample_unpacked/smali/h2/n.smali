.class public final Lh2/n;
.super LQ1/b;
.source "SourceFile"


# instance fields
.field public e:Lh2/o;

.field public f:Lh2/g;

.field public g:Lh2/q;

.field public h:Le2/Q;

.field public i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lh2/o;

.field public l:I


# direct methods
.method public constructor <init>(Lh2/o;LO1/d;)V
    .locals 0

    iput-object p1, p0, Lh2/n;->k:Lh2/o;

    invoke-direct {p0, p2}, LQ1/b;-><init>(LO1/d;)V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh2/n;->j:Ljava/lang/Object;

    iget p1, p0, Lh2/n;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh2/n;->l:I

    iget-object p1, p0, Lh2/n;->k:Lh2/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lh2/o;->a(Lh2/g;LO1/d;)Ljava/lang/Object;

    sget-object p1, LP1/a;->b:LP1/a;

    return-object p1
.end method
