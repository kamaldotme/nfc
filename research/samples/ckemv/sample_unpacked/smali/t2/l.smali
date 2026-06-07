.class public final Lt2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW1/a;


# instance fields
.field public final b:Lt2/u;

.field public final synthetic c:Lt2/q;


# direct methods
.method public constructor <init>(Lt2/q;Lt2/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/l;->c:Lt2/q;

    iput-object p2, p0, Lt2/l;->b:Lt2/u;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lt2/l;->c:Lt2/q;

    iget-object v1, p0, Lt2/l;->b:Lt2/u;

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1, p0}, Lt2/u;->b(Lt2/l;)V

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v1, v3, p0}, Lt2/u;->a(ZLt2/l;)Z

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    const/4 v3, 0x1

    const/16 v4, 0x9

    invoke-virtual {v0, v3, v4, v2}, Lt2/q;->a(IILjava/io/IOException;)V

    :goto_0
    invoke-static {v1}, Ln2/b;->c(Ljava/io/Closeable;)V

    goto :goto_3

    :catchall_0
    move-exception v3

    goto :goto_1

    :catch_0
    move-exception v2

    goto :goto_2

    :goto_1
    const/4 v4, 0x3

    invoke-virtual {v0, v4, v4, v2}, Lt2/q;->a(IILjava/io/IOException;)V

    invoke-static {v1}, Ln2/b;->c(Ljava/io/Closeable;)V

    throw v3

    :goto_2
    const/4 v3, 0x2

    invoke-virtual {v0, v3, v3, v2}, Lt2/q;->a(IILjava/io/IOException;)V

    goto :goto_0

    :goto_3
    sget-object v0, LK1/h;->a:LK1/h;

    return-object v0
.end method
