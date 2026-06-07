.class public final Lj1/d;
.super Lj1/k;
.source "SourceFile"


# static fields
.field public static final d:Lj1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj1/d;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    sput-object v0, Lj1/d;->d:Lj1/d;

    sget-object v1, Lj1/k;->c:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method public static a()Lj1/d;
    .locals 1

    sget-boolean v0, Lj1/k;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Lj1/d;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    return-object v0

    :cond_0
    sget-object v0, Lj1/d;->d:Lj1/d;

    return-object v0
.end method
