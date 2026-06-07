.class public final Lt2/g;
.super Lt2/h;
.source "SourceFile"


# virtual methods
.method public final b(Lt2/y;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lt2/y;->c(ILjava/io/IOException;)V

    return-void
.end method
