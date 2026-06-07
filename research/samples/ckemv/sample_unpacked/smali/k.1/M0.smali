.class public final Lk/M0;
.super Lk/G0;
.source "SourceFile"

# interfaces
.implements Lk/H0;


# static fields
.field public static final E:Ljava/lang/reflect/Method;


# instance fields
.field public D:Lk/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_0

    const-class v0, Landroid/widget/PopupWindow;

    const-string v1, "setTouchModal"

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lk/M0;->E:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Lj/m;Lj/o;)V
    .locals 1

    iget-object v0, p0, Lk/M0;->D:Lk/H0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lk/H0;->d(Lj/m;Lj/o;)V

    :cond_0
    return-void
.end method

.method public final j(Lj/m;Landroid/view/MenuItem;)V
    .locals 1

    iget-object v0, p0, Lk/M0;->D:Lk/H0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lk/H0;->j(Lj/m;Landroid/view/MenuItem;)V

    :cond_0
    return-void
.end method

.method public final q(Landroid/content/Context;Z)Lk/u0;
    .locals 1

    new-instance v0, Lk/L0;

    invoke-direct {v0, p1, p2}, Lk/L0;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v0, p0}, Lk/L0;->setHoverListener(Lk/H0;)V

    return-object v0
.end method
