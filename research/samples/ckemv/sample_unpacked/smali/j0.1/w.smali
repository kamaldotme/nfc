.class public abstract Lj0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj0/y;

.field public static final b:Lj0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lj0/z;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lj0/w;->a:Lj0/y;

    goto :goto_0

    :cond_0
    new-instance v0, Lj0/y;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lj0/w;->a:Lj0/y;

    :goto_0
    new-instance v0, Lj0/c;

    const-class v1, Ljava/lang/Float;

    const-string v2, "translationAlpha"

    const/4 v3, 0x5

    invoke-direct {v0, v3, v1, v2}, Lj0/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lj0/w;->b:Lj0/c;

    new-instance v0, Lj0/c;

    const-class v1, Landroid/graphics/Rect;

    const-string v2, "clipBounds"

    const/4 v3, 0x6

    invoke-direct {v0, v3, v1, v2}, Lj0/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 6

    sget-object v0, Lj0/w;->a:Lj0/y;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lj0/y;->p0(Landroid/view/View;IIII)V

    return-void
.end method
