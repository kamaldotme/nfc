.class public Lu2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Lu2/n;

.field public static final b:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    invoke-static {}, Ld1/e;->k()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    sget-object v0, Lv2/c;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v4}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v4

    sget-object v5, Lv2/c;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v5, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4, v2}, Ljava/util/logging/Logger;->setUseParentHandlers(Z)V

    const/4 v5, 0x3

    invoke-static {v3, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    goto :goto_1

    :cond_1
    const/4 v5, 0x4

    invoke-static {v3, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    goto :goto_1

    :cond_2
    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    :goto_1
    invoke-virtual {v4, v3}, Ljava/util/logging/Logger;->setLevel(Ljava/util/logging/Level;)V

    sget-object v3, Lv2/d;->a:Lv2/d;

    invoke-virtual {v4, v3}, Ljava/util/logging/Logger;->addHandler(Ljava/util/logging/Handler;)V

    goto :goto_0

    :cond_3
    sget-boolean v0, Lu2/a;->d:Z

    if-eqz v0, :cond_4

    new-instance v0, Lu2/a;

    invoke-direct {v0}, Lu2/a;-><init>()V

    goto :goto_2

    :cond_4
    move-object v0, v1

    :goto_2
    if-nez v0, :cond_11

    sget-boolean v0, Lu2/c;->e:Z

    if-eqz v0, :cond_5

    new-instance v1, Lu2/c;

    invoke-direct {v1}, Lu2/c;-><init>()V

    :cond_5
    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    :goto_3
    move-object v0, v1

    goto/16 :goto_9

    :cond_6
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Conscrypt"

    invoke-static {v3, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-boolean v0, Lu2/h;->d:Z

    if-eqz v0, :cond_7

    new-instance v0, Lu2/h;

    invoke-direct {v0}, Lu2/h;-><init>()V

    goto :goto_4

    :cond_7
    move-object v0, v1

    :goto_4
    if-eqz v0, :cond_8

    goto/16 :goto_9

    :cond_8
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "BC"

    invoke-static {v3, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-boolean v0, Lu2/e;->d:Z

    if-eqz v0, :cond_9

    new-instance v0, Lu2/e;

    invoke-direct {v0}, Lu2/e;-><init>()V

    goto :goto_5

    :cond_9
    move-object v0, v1

    :goto_5
    if-eqz v0, :cond_a

    goto/16 :goto_9

    :cond_a
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "OpenJSSE"

    invoke-static {v2, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-boolean v0, Lu2/m;->d:Z

    if-eqz v0, :cond_b

    new-instance v0, Lu2/m;

    invoke-direct {v0}, Lu2/m;-><init>()V

    goto :goto_6

    :cond_b
    move-object v0, v1

    :goto_6
    if-eqz v0, :cond_c

    goto/16 :goto_9

    :cond_c
    sget-boolean v0, Lu2/k;->c:Z

    if-eqz v0, :cond_d

    new-instance v0, Lu2/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_7

    :cond_d
    move-object v0, v1

    :goto_7
    if-eqz v0, :cond_e

    goto/16 :goto_9

    :cond_e
    const-class v0, Ljavax/net/ssl/SSLSocket;

    const-string v2, "java.specification.version"

    const-string v3, "unknown"

    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :try_start_0
    const-string v3, "jvmVersion"

    invoke-static {v2, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v3, 0x9

    if-lt v2, v3, :cond_f

    goto :goto_8

    :catch_0
    :cond_f
    const-string v2, "org.eclipse.jetty.alpn.ALPN"

    const/4 v3, 0x1

    :try_start_1
    invoke-static {v2, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const-string v4, "org.eclipse.jetty.alpn.ALPN$Provider"

    invoke-static {v4, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    const-string v5, "org.eclipse.jetty.alpn.ALPN$ClientProvider"

    invoke-static {v5, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v10

    const-string v5, "org.eclipse.jetty.alpn.ALPN$ServerProvider"

    invoke-static {v5, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v11

    const-string v3, "put"

    filled-new-array {v0, v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const-string v3, "get"

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const-string v3, "remove"

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    new-instance v0, Lu2/j;

    const-string v2, "putMethod"

    invoke-static {v7, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "getMethod"

    invoke-static {v8, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "removeMethod"

    invoke-static {v9, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "clientProviderClass"

    invoke-static {v10, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "serverProviderClass"

    invoke-static {v11, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v0

    invoke-direct/range {v6 .. v11}, Lu2/j;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, v0

    :catch_1
    :goto_8
    if-eqz v1, :cond_10

    goto/16 :goto_3

    :cond_10
    new-instance v0, Lu2/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_11
    :goto_9
    sput-object v0, Lu2/n;->a:Lu2/n;

    const-class v0, Lm2/o;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lu2/n;->b:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static i(Ljava/lang/String;ILjava/lang/Throwable;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    sget-object p1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    :goto_0
    sget-object v0, Lu2/n;->b:Ljava/util/logging/Logger;

    invoke-virtual {v0, p1, p0, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public a(Ljavax/net/ssl/SSLSocket;)V
    .locals 0

    return-void
.end method

.method public b(Ljavax/net/ssl/X509TrustManager;)Lu2/l;
    .locals 1

    new-instance v0, Ly2/a;

    invoke-virtual {p0, p1}, Lu2/n;->c(Ljavax/net/ssl/X509TrustManager;)Ly2/d;

    move-result-object p1

    invoke-direct {v0, p1}, Ly2/a;-><init>(Ly2/d;)V

    return-object v0
.end method

.method public c(Ljavax/net/ssl/X509TrustManager;)Ly2/d;
    .locals 2

    new-instance v0, Ly2/b;

    invoke-interface {p1}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    move-result-object p1

    const-string v1, "trustManager.acceptedIssuers"

    invoke-static {p1, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/security/cert/X509Certificate;

    invoke-direct {v0, p1}, Ly2/b;-><init>([Ljava/security/cert/X509Certificate;)V

    return-object v0
.end method

.method public d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    const-string p1, "protocols"

    invoke-static {p3, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public e(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .locals 1

    const-string v0, "address"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    return-void
.end method

.method public f(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public g()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lu2/n;->b:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "response.body().close()"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public h(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "hostname"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public j(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const-string v0, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    const/4 v0, 0x5

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p2, v0, p1}, Lu2/n;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    return-void
.end method

.method public k()Ljavax/net/ssl/SSLContext;
    .locals 2

    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    const-string v1, "getInstance(\"TLS\")"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public l(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lu2/n;->k()Ljavax/net/ssl/SSLContext;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1, p1}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p1

    const-string v0, "newSSLContext().apply {\n\u2026ll)\n      }.socketFactory"

    invoke-static {p1, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No System TLS: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public m()Ljavax/net/ssl/X509TrustManager;
    .locals 3

    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v0

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    array-length v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    aget-object v1, v0, v1

    instance-of v2, v1, Ljavax/net/ssl/X509TrustManager;

    if-eqz v2, :cond_0

    const-string v0, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"

    invoke-static {v1, v0}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljavax/net/ssl/X509TrustManager;

    return-object v1

    :cond_0
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(this)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Unexpected default trust managers: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
