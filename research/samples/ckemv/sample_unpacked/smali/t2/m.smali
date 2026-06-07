.class public final Lt2/m;
.super Lp2/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lt2/q;

.field public final synthetic f:I

.field public final synthetic g:Lz2/f;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lt2/q;ILz2/f;IZ)V
    .locals 0

    iput-object p2, p0, Lt2/m;->e:Lt2/q;

    iput p3, p0, Lt2/m;->f:I

    iput-object p4, p0, Lt2/m;->g:Lz2/f;

    iput p5, p0, Lt2/m;->h:I

    const/4 p2, 0x1

    invoke-direct {p0, p2, p1}, Lp2/a;-><init>(ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    :try_start_0
    iget-object v0, p0, Lt2/m;->e:Lt2/q;

    iget-object v0, v0, Lt2/q;->m:Lt2/B;

    iget-object v1, p0, Lt2/m;->g:Lz2/f;

    iget v2, p0, Lt2/m;->h:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "source"

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Lz2/f;->u(J)V

    iget-object v0, p0, Lt2/m;->e:Lt2/q;

    iget-object v0, v0, Lt2/q;->z:Lt2/z;

    iget v1, p0, Lt2/m;->f:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Lt2/z;->D(II)V

    iget-object v0, p0, Lt2/m;->e:Lt2/q;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lt2/m;->e:Lt2/q;

    iget-object v1, v1, Lt2/q;->B:Ljava/util/LinkedHashSet;

    iget v2, p0, Lt2/m;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
