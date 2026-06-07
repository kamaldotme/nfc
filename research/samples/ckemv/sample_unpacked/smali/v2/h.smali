.class public final Lv2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv2/j;


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)Z
    .locals 1

    sget-boolean v0, Lu2/h;->d:Z

    invoke-static {}, Lu2/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lorg/conscrypt/Conscrypt;->isConscrypt(Ljavax/net/ssl/SSLSocket;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Ljavax/net/ssl/SSLSocket;)Lv2/l;
    .locals 0

    new-instance p1, Lv2/i;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method
