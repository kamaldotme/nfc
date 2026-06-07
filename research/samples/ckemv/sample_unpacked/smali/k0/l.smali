.class public abstract Lk0/l;
.super Lk0/k;
.source "SourceFile"


# instance fields
.field public a:[LA/g;

.field public b:Ljava/lang/String;

.field public c:I

.field public final d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lk0/l;->a:[LA/g;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lk0/l;->c:I

    return-void
.end method

.method public constructor <init>(Lk0/l;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lk0/l;->a:[LA/g;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lk0/l;->c:I

    .line 7
    iget-object v0, p1, Lk0/l;->b:Ljava/lang/String;

    iput-object v0, p0, Lk0/l;->b:Ljava/lang/String;

    .line 8
    iget v0, p1, Lk0/l;->d:I

    iput v0, p0, Lk0/l;->d:I

    .line 9
    iget-object p1, p1, Lk0/l;->a:[LA/g;

    invoke-static {p1}, La/a;->r([LA/g;)[LA/g;

    move-result-object p1

    iput-object p1, p0, Lk0/l;->a:[LA/g;

    return-void
.end method


# virtual methods
.method public getPathData()[LA/g;
    .locals 1

    iget-object v0, p0, Lk0/l;->a:[LA/g;

    return-object v0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk0/l;->b:Ljava/lang/String;

    return-object v0
.end method

.method public setPathData([LA/g;)V
    .locals 6

    iget-object v0, p0, Lk0/l;->a:[LA/g;

    invoke-static {v0, p1}, La/a;->e([LA/g;[LA/g;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, La/a;->r([LA/g;)[LA/g;

    move-result-object p1

    iput-object p1, p0, Lk0/l;->a:[LA/g;

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lk0/l;->a:[LA/g;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_2

    aget-object v3, v0, v2

    aget-object v4, p1, v2

    iget-char v4, v4, LA/g;->a:C

    iput-char v4, v3, LA/g;->a:C

    move v3, v1

    :goto_1
    aget-object v4, p1, v2

    iget-object v4, v4, LA/g;->b:[F

    array-length v5, v4

    if-ge v3, v5, :cond_1

    aget-object v5, v0, v2

    iget-object v5, v5, LA/g;->b:[F

    aget v4, v4, v3

    aput v4, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method
