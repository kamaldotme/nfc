.class public final Lf0/e;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(ILjava/lang/Throwable;)V
    .locals 1

    const-string v0, "callbackName"

    invoke-static {v0, p1}, LX/d;->o(Ljava/lang/String;I)V

    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    iput p1, p0, Lf0/e;->b:I

    iput-object p2, p0, Lf0/e;->c:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final getCause()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lf0/e;->c:Ljava/lang/Throwable;

    return-object v0
.end method
