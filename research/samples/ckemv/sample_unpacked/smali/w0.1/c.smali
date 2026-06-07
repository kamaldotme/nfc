.class public final Lw0/c;
.super Lw0/d;
.source "SourceFile"


# instance fields
.field public final synthetic c:Ln0/s;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(Ln0/s;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lw0/c;->c:Ln0/s;

    iput-object p2, p0, Lw0/c;->d:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lw0/c;->e:Z

    invoke-direct {p0}, Lw0/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    iget-object v0, p0, Lw0/c;->c:Ln0/s;

    iget-object v1, v0, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v2

    iget-object v3, p0, Lw0/c;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lv0/p;->h(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v0, v3}, Lw0/d;->a(Ln0/s;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    iget-boolean v1, p0, Lw0/c;->e:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Ln0/s;->e:Lm0/a;

    iget-object v2, v0, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    iget-object v0, v0, Ln0/s;->h:Ljava/util/List;

    invoke-static {v1, v2, v0}, Ln0/l;->b(Lm0/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_1
    return-void

    :goto_1
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    throw v0
.end method
