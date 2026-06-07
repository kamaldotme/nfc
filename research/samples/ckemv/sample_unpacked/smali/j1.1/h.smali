.class public final Lj1/h;
.super Lj1/k;
.source "SourceFile"


# static fields
.field public static final d:Lj1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj1/h;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    sput-object v0, Lj1/h;->d:Lj1/h;

    sget-object v1, Lj1/k;->c:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method
