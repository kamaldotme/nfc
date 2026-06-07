.class public final Lh2/a;
.super LQ1/b;
.source "SourceFile"


# instance fields
.field public e:Lg2/r;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lh2/b;

.field public h:I


# direct methods
.method public constructor <init>(Lh2/b;LO1/d;)V
    .locals 0

    iput-object p1, p0, Lh2/a;->g:Lh2/b;

    invoke-direct {p0, p2}, LQ1/b;-><init>(LO1/d;)V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh2/a;->f:Ljava/lang/Object;

    iget p1, p0, Lh2/a;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh2/a;->h:I

    iget-object p1, p0, Lh2/a;->g:Lh2/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lh2/b;->c(Lg2/r;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
