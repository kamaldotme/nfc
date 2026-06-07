.class public abstract synthetic LG1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x3

    filled-new-array {v0, v1, v2, v3}, [I

    move-result-object v0

    sput-object v0, LG1/e;->a:[I

    return-void
.end method

.method public static synthetic a(III)Z
    .locals 0

    packed-switch p0, :pswitch_data_0

    invoke-static {p0, p1, p2}, LG1/e;->i(III)Z

    move-result p0

    return p0

    :pswitch_0
    invoke-static {p0, p1, p2}, LG1/e;->h(III)Z

    move-result p0

    return p0

    :pswitch_1
    invoke-static {p0, p1, p2}, LG1/e;->g(III)Z

    move-result p0

    return p0

    :pswitch_2
    invoke-static {p0, p1, p2}, LG1/e;->f(III)Z

    move-result p0

    return p0

    :pswitch_3
    invoke-static {p0, p1, p2}, LG1/e;->e(III)Z

    move-result p0

    return p0

    :pswitch_4
    invoke-static {p0, p1, p2}, LG1/e;->d(III)Z

    move-result p0

    return p0

    :pswitch_5
    invoke-static {p0, p1, p2}, LG1/e;->c(III)Z

    move-result p0

    return p0

    :pswitch_6
    invoke-static {p0, p1, p2}, LG1/e;->b(III)Z

    move-result p0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(III)Z
    .locals 0

    add-int/2addr p1, p2

    const/4 p0, 0x1

    and-int/2addr p1, p0

    if-nez p1, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final c(III)Z
    .locals 0

    const/4 p0, 0x1

    and-int/2addr p1, p0

    if-nez p1, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final d(III)Z
    .locals 0

    rem-int/lit8 p2, p2, 0x3

    if-nez p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final e(III)Z
    .locals 0

    add-int/2addr p1, p2

    rem-int/lit8 p1, p1, 0x3

    if-nez p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final f(III)Z
    .locals 0

    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p2, p2, 0x3

    add-int/2addr p2, p1

    const/4 p0, 0x1

    and-int/lit8 p1, p2, 0x1

    if-nez p1, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final g(III)Z
    .locals 0

    mul-int/2addr p1, p2

    rem-int/lit8 p1, p1, 0x6

    if-nez p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final h(III)Z
    .locals 0

    mul-int/2addr p1, p2

    rem-int/lit8 p1, p1, 0x6

    const/4 p0, 0x3

    if-ge p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final i(III)Z
    .locals 0

    add-int p0, p1, p2

    mul-int/2addr p1, p2

    rem-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p0

    const/4 p0, 0x1

    and-int/2addr p1, p0

    if-nez p1, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic j(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    const-string p0, "H"

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :cond_1
    const-string p0, "Q"

    return-object p0

    :cond_2
    const-string p0, "M"

    return-object p0

    :cond_3
    const-string p0, "L"

    return-object p0
.end method
