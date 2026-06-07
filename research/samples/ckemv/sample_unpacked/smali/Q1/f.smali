.class public abstract LQ1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ1/e;

.field public static b:LQ1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQ1/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, LQ1/e;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v0, LQ1/f;->a:LQ1/e;

    return-void
.end method
