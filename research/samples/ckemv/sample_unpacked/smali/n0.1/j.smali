.class public final synthetic Ln0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/c;


# instance fields
.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lm0/a;

.field public final synthetic e:Landroidx/work/impl/WorkDatabase;


# direct methods
.method public synthetic constructor <init>(Lf/B;Ljava/util/List;Lm0/a;Landroidx/work/impl/WorkDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/j;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ln0/j;->c:Ljava/util/List;

    iput-object p3, p0, Ln0/j;->d:Lm0/a;

    iput-object p4, p0, Ln0/j;->e:Landroidx/work/impl/WorkDatabase;

    return-void
.end method


# virtual methods
.method public final d(Lv0/j;Z)V
    .locals 3

    new-instance p2, Ln0/k;

    iget-object v0, p0, Ln0/j;->d:Lm0/a;

    iget-object v1, p0, Ln0/j;->e:Landroidx/work/impl/WorkDatabase;

    iget-object v2, p0, Ln0/j;->c:Ljava/util/List;

    invoke-direct {p2, v2, p1, v0, v1}, Ln0/k;-><init>(Ljava/util/List;Lv0/j;Lm0/a;Landroidx/work/impl/WorkDatabase;)V

    iget-object p1, p0, Ln0/j;->b:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
