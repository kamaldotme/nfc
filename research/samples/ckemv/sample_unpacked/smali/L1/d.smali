.class public final LL1/d;
.super LL1/e;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final b:LL1/e;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(LL1/e;II)V
    .locals 1

    const-string v0, "list"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LL1/e;-><init>()V

    iput-object p1, p0, LL1/d;->b:LL1/e;

    iput p2, p0, LL1/d;->c:I

    invoke-virtual {p1}, LL1/e;->a()I

    move-result p1

    invoke-static {p2, p3, p1}, Lu2/d;->d(III)V

    sub-int/2addr p3, p2

    iput p3, p0, LL1/d;->d:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LL1/d;->d:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 4

    iget v0, p0, LL1/d;->d:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    iget v0, p0, LL1/d;->c:I

    add-int/2addr v0, p1

    iget-object p1, p0, LL1/d;->b:LL1/e;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "index: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
