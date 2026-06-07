.class public final Lt2/p;
.super Lp2/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lt2/q;

.field public final synthetic f:I

.field public final synthetic g:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lt2/q;IJ)V
    .locals 0

    iput-object p2, p0, Lt2/p;->e:Lt2/q;

    iput p3, p0, Lt2/p;->f:I

    iput-wide p4, p0, Lt2/p;->g:J

    const/4 p2, 0x1

    invoke-direct {p0, p2, p1}, Lp2/a;-><init>(ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 5

    iget-object v0, p0, Lt2/p;->e:Lt2/q;

    :try_start_0
    iget-object v1, v0, Lt2/q;->z:Lt2/z;

    iget v2, p0, Lt2/p;->f:I

    iget-wide v3, p0, Lt2/p;->g:J

    invoke-virtual {v1, v2, v3, v4}, Lt2/z;->G(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v0, v1}, Lt2/q;->b(Ljava/io/IOException;)V

    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
