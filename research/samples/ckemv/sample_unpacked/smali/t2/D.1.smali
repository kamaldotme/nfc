.class public final Lt2/D;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const-string v0, "errorCode"

    invoke-static {v0, p1}, LX/d;->o(Ljava/lang/String;I)V

    invoke-static {p1}, LX/d;->B(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "stream was reset: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput p1, p0, Lt2/D;->b:I

    return-void
.end method
