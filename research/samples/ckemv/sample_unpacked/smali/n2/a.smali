.class public final synthetic Ln2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ln2/a;->a:Ljava/lang/String;

    iput-boolean p1, p0, Ln2/a;->b:Z

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    const-string v0, "$name"

    iget-object v1, p0, Ln2/a;->a:Ljava/lang/String;

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-boolean p1, p0, Ln2/a;->b:Z

    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0
.end method
