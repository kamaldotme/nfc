.class public final LC1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp1/b;

.field public final b:Lj1/n;

.field public final c:Lj1/n;

.field public final d:Lj1/n;

.field public final e:Lj1/n;

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(LC1/c;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iget-object v0, p1, LC1/c;->a:Lp1/b;

    iput-object v0, p0, LC1/c;->a:Lp1/b;

    .line 30
    iget-object v0, p1, LC1/c;->b:Lj1/n;

    iput-object v0, p0, LC1/c;->b:Lj1/n;

    .line 31
    iget-object v0, p1, LC1/c;->c:Lj1/n;

    iput-object v0, p0, LC1/c;->c:Lj1/n;

    .line 32
    iget-object v0, p1, LC1/c;->d:Lj1/n;

    iput-object v0, p0, LC1/c;->d:Lj1/n;

    .line 33
    iget-object v0, p1, LC1/c;->e:Lj1/n;

    iput-object v0, p0, LC1/c;->e:Lj1/n;

    .line 34
    iget v0, p1, LC1/c;->f:I

    iput v0, p0, LC1/c;->f:I

    .line 35
    iget v0, p1, LC1/c;->g:I

    iput v0, p0, LC1/c;->g:I

    .line 36
    iget v0, p1, LC1/c;->h:I

    iput v0, p0, LC1/c;->h:I

    .line 37
    iget p1, p1, LC1/c;->i:I

    iput p1, p0, LC1/c;->i:I

    return-void
.end method

.method public constructor <init>(Lp1/b;Lj1/n;Lj1/n;Lj1/n;Lj1/n;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    if-eqz p4, :cond_2

    if-nez p5, :cond_3

    :cond_2
    move v0, v1

    :cond_3
    if-eqz v2, :cond_5

    if-nez v0, :cond_4

    goto :goto_2

    .line 2
    :cond_4
    sget-object p1, Lj1/h;->d:Lj1/h;

    .line 3
    throw p1

    :cond_5
    :goto_2
    if-eqz v2, :cond_6

    .line 4
    new-instance p2, Lj1/n;

    .line 5
    iget p3, p4, Lj1/n;->b:F

    const/4 v0, 0x0

    .line 6
    invoke-direct {p2, v0, p3}, Lj1/n;-><init>(FF)V

    .line 7
    new-instance p3, Lj1/n;

    .line 8
    iget v1, p5, Lj1/n;->b:F

    .line 9
    invoke-direct {p3, v0, v1}, Lj1/n;-><init>(FF)V

    goto :goto_3

    :cond_6
    if-eqz v0, :cond_7

    .line 10
    new-instance p4, Lj1/n;

    .line 11
    iget p5, p1, Lp1/b;->b:I

    add-int/lit8 v0, p5, -0x1

    int-to-float v0, v0

    .line 12
    iget v2, p2, Lj1/n;->b:F

    .line 13
    invoke-direct {p4, v0, v2}, Lj1/n;-><init>(FF)V

    .line 14
    new-instance v0, Lj1/n;

    sub-int/2addr p5, v1

    int-to-float p5, p5

    .line 15
    iget v1, p3, Lj1/n;->b:F

    .line 16
    invoke-direct {v0, p5, v1}, Lj1/n;-><init>(FF)V

    move-object p5, v0

    .line 17
    :cond_7
    :goto_3
    iput-object p1, p0, LC1/c;->a:Lp1/b;

    .line 18
    iput-object p2, p0, LC1/c;->b:Lj1/n;

    .line 19
    iput-object p3, p0, LC1/c;->c:Lj1/n;

    .line 20
    iput-object p4, p0, LC1/c;->d:Lj1/n;

    .line 21
    iput-object p5, p0, LC1/c;->e:Lj1/n;

    .line 22
    iget p1, p2, Lj1/n;->a:F

    iget v0, p3, Lj1/n;->a:F

    .line 23
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, LC1/c;->f:I

    .line 24
    iget p1, p4, Lj1/n;->a:F

    iget v0, p5, Lj1/n;->a:F

    .line 25
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, LC1/c;->g:I

    .line 26
    iget p1, p2, Lj1/n;->b:F

    iget p2, p4, Lj1/n;->b:F

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, LC1/c;->h:I

    .line 27
    iget p1, p3, Lj1/n;->b:F

    iget p2, p5, Lj1/n;->b:F

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, LC1/c;->i:I

    return-void
.end method
