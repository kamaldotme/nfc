.class public final Lt2/i;
.super Lp2/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lt2/q;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lt2/q;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lt2/i;->e:I

    iput-object p2, p0, Lt2/i;->f:Lt2/q;

    iput-object p3, p0, Lt2/i;->g:Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-direct {p0, p2, p1}, Lp2/a;-><init>(ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 6

    const-wide/16 v0, -0x1

    iget v2, p0, Lt2/i;->e:I

    packed-switch v2, :pswitch_data_0

    :try_start_0
    iget-object v2, p0, Lt2/i;->f:Lt2/q;

    iget-object v2, v2, Lt2/q;->c:Lt2/h;

    iget-object v3, p0, Lt2/i;->g:Ljava/lang/Object;

    check-cast v3, Lt2/y;

    invoke-virtual {v2, v3}, Lt2/h;->b(Lt2/y;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v3, Lu2/n;->a:Lu2/n;

    sget-object v3, Lu2/n;->a:Lu2/n;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Http2Connection.Listener failure for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lt2/i;->f:Lt2/q;

    iget-object v5, v5, Lt2/q;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x4

    invoke-static {v4, v3, v2}, Lu2/n;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    :try_start_1
    iget-object v3, p0, Lt2/i;->g:Ljava/lang/Object;

    check-cast v3, Lt2/y;

    const/4 v4, 0x2

    invoke-virtual {v3, v4, v2}, Lt2/y;->c(ILjava/io/IOException;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    return-wide v0

    :pswitch_0
    iget-object v2, p0, Lt2/i;->f:Lt2/q;

    iget-object v3, v2, Lt2/q;->c:Lt2/h;

    iget-object v4, p0, Lt2/i;->g:Ljava/lang/Object;

    check-cast v4, LX1/j;

    iget-object v4, v4, LX1/j;->c:Ljava/lang/Object;

    check-cast v4, Lt2/C;

    invoke-virtual {v3, v2, v4}, Lt2/h;->a(Lt2/q;Lt2/C;)V

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
