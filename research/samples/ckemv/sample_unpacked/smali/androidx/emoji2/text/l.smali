.class public final Landroidx/emoji2/text/l;
.super Lm0/z;
.source "SourceFile"


# instance fields
.field public final synthetic d:Lm0/z;

.field public final synthetic e:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>(Lm0/z;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/l;->d:Lm0/z;

    iput-object p2, p0, Landroidx/emoji2/text/l;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method


# virtual methods
.method public final T(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Landroidx/emoji2/text/l;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    :try_start_0
    iget-object v1, p0, Landroidx/emoji2/text/l;->d:Lm0/z;

    invoke-virtual {v1, p1}, Lm0/z;->T(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    throw p1
.end method

.method public final U(Lv0/i;)V
    .locals 2

    iget-object v0, p0, Landroidx/emoji2/text/l;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    :try_start_0
    iget-object v1, p0, Landroidx/emoji2/text/l;->d:Lm0/z;

    invoke-virtual {v1, p1}, Lm0/z;->U(Lv0/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    throw p1
.end method
