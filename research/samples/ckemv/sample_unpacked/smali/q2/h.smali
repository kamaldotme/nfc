.class public final Lq2/h;
.super Lz2/e;
.source "SourceFile"


# instance fields
.field public final synthetic m:Lq2/i;


# direct methods
.method public constructor <init>(Lq2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/h;->m:Lq2/i;

    return-void
.end method


# virtual methods
.method public final k()V
    .locals 2

    iget-object v0, p0, Lq2/h;->m:Lq2/i;

    iget-boolean v1, v0, Lq2/i;->q:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, v0, Lq2/i;->q:Z

    iget-object v1, v0, Lq2/i;->r:Lq2/e;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lq2/e;->d:Lr2/d;

    invoke-interface {v1}, Lr2/d;->cancel()V

    :cond_1
    iget-object v1, v0, Lq2/i;->s:Lq2/l;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lq2/l;->c:Ljava/net/Socket;

    if-eqz v1, :cond_2

    invoke-static {v1}, Ln2/b;->d(Ljava/net/Socket;)V

    :cond_2
    iget-object v0, v0, Lq2/i;->f:Lm2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void
.end method
