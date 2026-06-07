.class public abstract Ld1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld1/s;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Ld1/j;->a:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    :try_start_0
    const-class v0, Ljava/lang/reflect/AccessibleObject;

    const-string v1, "canAccess"

    const-class v2, Ljava/lang/Object;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-instance v1, Ld1/q;

    invoke-direct {v1, v0}, Ld1/q;-><init>(Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    new-instance v1, Ld1/r;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    :cond_1
    sput-object v1, Ld1/s;->a:Ld1/s;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z
.end method
