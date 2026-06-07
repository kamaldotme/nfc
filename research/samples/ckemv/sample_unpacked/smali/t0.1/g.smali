.class public final Lt0/g;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lt0/h;


# direct methods
.method public constructor <init>(Lt0/h;)V
    .locals 0

    iput-object p1, p0, Lt0/g;->a:Lt0/h;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "capabilities"

    invoke-static {p2, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    sget v0, Lt0/i;->a:I

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lt0/g;->a:Lt0/h;

    iget-object p2, p1, Lt0/h;->f:Landroid/net/ConnectivityManager;

    invoke-static {p2}, Lt0/i;->a(Landroid/net/ConnectivityManager;)Lr0/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Lt0/e;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    sget v0, Lt0/i;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lt0/g;->a:Lt0/h;

    iget-object v0, p1, Lt0/h;->f:Landroid/net/ConnectivityManager;

    invoke-static {v0}, Lt0/i;->a(Landroid/net/ConnectivityManager;)Lr0/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lt0/e;->b(Ljava/lang/Object;)V

    return-void
.end method
