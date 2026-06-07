.class public final Lt0/h;
.super Lt0/e;
.source "SourceFile"


# instance fields
.field public final f:Landroid/net/ConnectivityManager;

.field public final g:Lt0/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lv0/i;)V
    .locals 1

    const-string v0, "taskExecutor"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lt0/e;-><init>(Landroid/content/Context;Lv0/i;)V

    iget-object p1, p0, Lt0/e;->b:Landroid/content/Context;

    const-string p2, "connectivity"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p1, p2}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Lt0/h;->f:Landroid/net/ConnectivityManager;

    new-instance p1, Lt0/g;

    invoke-direct {p1, p0}, Lt0/g;-><init>(Lt0/h;)V

    iput-object p1, p0, Lt0/h;->g:Lt0/g;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt0/h;->f:Landroid/net/ConnectivityManager;

    invoke-static {v0}, Lt0/i;->a(Landroid/net/ConnectivityManager;)Lr0/d;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 2

    :try_start_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/i;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lt0/h;->f:Landroid/net/ConnectivityManager;

    iget-object v1, p0, Lt0/h;->g:Lt0/g;

    invoke-static {v0, v1}, Lw0/l;->a(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/i;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :catch_1
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/i;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void
.end method

.method public final d()V
    .locals 2

    :try_start_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/i;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lt0/h;->f:Landroid/net/ConnectivityManager;

    iget-object v1, p0, Lt0/h;->g:Lt0/g;

    invoke-static {v0, v1}, Lw0/j;->c(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/i;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :catch_1
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/i;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void
.end method
