.class public abstract LB0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/view/animation/LinearInterpolator;

.field public static final b:LU/a;

.field public static final c:LU/a;

.field public static final d:LU/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, LB0/a;->a:Landroid/view/animation/LinearInterpolator;

    new-instance v0, LU/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LU/a;-><init>(I)V

    sput-object v0, LB0/a;->b:LU/a;

    new-instance v0, LU/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU/a;-><init>(I)V

    sput-object v0, LB0/a;->c:LU/a;

    new-instance v0, LU/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, LU/a;-><init>(I)V

    sput-object v0, LB0/a;->d:LU/a;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    return-void
.end method

.method public static a(FFF)F
    .locals 0

    sub-float/2addr p1, p0

    mul-float/2addr p1, p2

    add-float/2addr p1, p0

    return p1
.end method

.method public static b(FFFFF)F
    .locals 1

    cmpg-float v0, p4, p2

    if-gtz v0, :cond_0

    return p0

    :cond_0
    cmpl-float v0, p4, p3

    if-ltz v0, :cond_1

    return p1

    :cond_1
    sub-float/2addr p4, p2

    sub-float/2addr p3, p2

    div-float/2addr p4, p3

    invoke-static {p0, p1, p4}, LB0/a;->a(FFF)F

    move-result p0

    return p0
.end method

.method public static c(IIF)I
    .locals 0

    sub-int/2addr p1, p0

    int-to-float p1, p1

    mul-float/2addr p2, p1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method
