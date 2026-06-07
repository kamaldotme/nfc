.class public final Lm2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final A:Ljava/util/List;

.field public static final B:Ljava/util/List;


# instance fields
.field public final b:Lv0/i;

.field public final c:Lf/G;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:LB2/b;

.field public final g:Z

.field public final h:Lm2/b;

.field public final i:Z

.field public final j:Z

.field public final k:Lm2/b;

.field public final l:Lm2/b;

.field public final m:Ljava/net/ProxySelector;

.field public final n:Lm2/b;

.field public final o:Ljavax/net/SocketFactory;

.field public final p:Ljavax/net/ssl/SSLSocketFactory;

.field public final q:Ljavax/net/ssl/X509TrustManager;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ly2/c;

.field public final u:Lm2/d;

.field public final v:Lu2/l;

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:Lf/G;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lm2/p;->f:Lm2/p;

    sget-object v1, Lm2/p;->d:Lm2/p;

    filled-new-array {v0, v1}, [Lm2/p;

    move-result-object v0

    invoke-static {v0}, Ln2/b;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lm2/o;->A:Ljava/util/List;

    sget-object v0, Lm2/g;->e:Lm2/g;

    sget-object v1, Lm2/g;->f:Lm2/g;

    filled-new-array {v0, v1}, [Lm2/g;

    move-result-object v0

    invoke-static {v0}, Ln2/b;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lm2/o;->B:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    new-instance v0, Lv0/i;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lv0/i;-><init>(I)V

    new-instance v1, Lf/G;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lf/G;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, LB2/b;

    invoke-direct {v4}, LB2/b;-><init>()V

    sget-object v5, Lm2/b;->a:Lm2/b;

    sget-object v6, Lm2/b;->b:Lm2/b;

    sget-object v7, Lm2/b;->c:Lm2/b;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v8

    const-string v9, "getDefault()"

    invoke-static {v8, v9}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lm2/o;->B:Ljava/util/List;

    sget-object v10, Lm2/o;->A:Ljava/util/List;

    sget-object v11, Ly2/c;->a:Ly2/c;

    sget-object v12, Lm2/d;->c:Lm2/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lm2/o;->b:Lv0/i;

    iput-object v1, p0, Lm2/o;->c:Lf/G;

    invoke-static {v2}, Ln2/b;->v(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm2/o;->d:Ljava/util/List;

    invoke-static {v3}, Ln2/b;->v(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm2/o;->e:Ljava/util/List;

    iput-object v4, p0, Lm2/o;->f:LB2/b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm2/o;->g:Z

    iput-object v5, p0, Lm2/o;->h:Lm2/b;

    iput-boolean v0, p0, Lm2/o;->i:Z

    iput-boolean v0, p0, Lm2/o;->j:Z

    iput-object v6, p0, Lm2/o;->k:Lm2/b;

    iput-object v7, p0, Lm2/o;->l:Lm2/b;

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lw2/a;->a:Lw2/a;

    :cond_0
    iput-object v1, p0, Lm2/o;->m:Ljava/net/ProxySelector;

    iput-object v5, p0, Lm2/o;->n:Lm2/b;

    iput-object v8, p0, Lm2/o;->o:Ljavax/net/SocketFactory;

    iput-object v9, p0, Lm2/o;->r:Ljava/util/List;

    iput-object v10, p0, Lm2/o;->s:Ljava/util/List;

    iput-object v11, p0, Lm2/o;->t:Ly2/c;

    const/16 v1, 0x2710

    iput v1, p0, Lm2/o;->w:I

    iput v1, p0, Lm2/o;->x:I

    iput v1, p0, Lm2/o;->y:I

    new-instance v1, Lf/G;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lf/G;-><init>(I)V

    iput-object v1, p0, Lm2/o;->z:Lf/G;

    instance-of v1, v9, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm2/g;

    iget-boolean v3, v3, Lm2/g;->a:Z

    if-eqz v3, :cond_2

    sget-object v1, Lu2/n;->a:Lu2/n;

    sget-object v1, Lu2/n;->a:Lu2/n;

    invoke-virtual {v1}, Lu2/n;->m()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, Lm2/o;->q:Ljavax/net/ssl/X509TrustManager;

    sget-object v3, Lu2/n;->a:Lu2/n;

    invoke-virtual {v3, v1}, Lu2/n;->l(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    iput-object v3, p0, Lm2/o;->p:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v3, Lu2/n;->a:Lu2/n;

    invoke-virtual {v3, v1}, Lu2/n;->b(Ljavax/net/ssl/X509TrustManager;)Lu2/l;

    move-result-object v1

    iput-object v1, p0, Lm2/o;->v:Lu2/l;

    iget-object v3, v12, Lm2/d;->b:Lu2/l;

    invoke-static {v3, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    new-instance v3, Lm2/d;

    iget-object v4, v12, Lm2/d;->a:Ljava/util/Set;

    invoke-direct {v3, v4, v1}, Lm2/d;-><init>(Ljava/util/Set;Lu2/l;)V

    move-object v12, v3

    :goto_0
    iput-object v12, p0, Lm2/o;->u:Lm2/d;

    goto :goto_2

    :cond_4
    :goto_1
    iput-object v2, p0, Lm2/o;->p:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v2, p0, Lm2/o;->v:Lu2/l;

    iput-object v2, p0, Lm2/o;->q:Ljavax/net/ssl/X509TrustManager;

    sget-object v1, Lm2/d;->c:Lm2/d;

    iput-object v1, p0, Lm2/o;->u:Lm2/d;

    :goto_2
    iget-object v1, p0, Lm2/o;->d:Ljava/util/List;

    const-string v3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    invoke-static {v1, v3}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v0

    if-eqz v4, :cond_10

    iget-object v1, p0, Lm2/o;->e:Ljava/util/List;

    invoke-static {v1, v3}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v0, v2

    if-eqz v0, :cond_f

    iget-object v0, p0, Lm2/o;->r:Ljava/util/List;

    instance-of v1, v0, Ljava/util/Collection;

    iget-object v2, p0, Lm2/o;->q:Ljavax/net/ssl/X509TrustManager;

    iget-object v3, p0, Lm2/o;->v:Lu2/l;

    iget-object v4, p0, Lm2/o;->p:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/g;

    iget-boolean v1, v1, Lm2/g;->a:Z

    if-eqz v1, :cond_6

    if-eqz v4, :cond_9

    if-eqz v3, :cond_8

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "x509TrustManager == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "certificateChainCleaner == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "sslSocketFactory == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_3
    const-string v0, "Check failed."

    if-nez v4, :cond_e

    if-nez v3, :cond_d

    if-nez v2, :cond_c

    iget-object v1, p0, Lm2/o;->u:Lm2/d;

    sget-object v2, Lm2/d;->c:Lm2/d;

    invoke-static {v1, v2}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    :goto_4
    return-void

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Null network interceptor: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Null interceptor: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
