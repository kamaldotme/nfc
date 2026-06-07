.class public final synthetic Ln0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lv0/j;

.field public final synthetic d:Lm0/a;

.field public final synthetic e:Landroidx/work/impl/WorkDatabase;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lv0/j;Lm0/a;Landroidx/work/impl/WorkDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/k;->b:Ljava/util/List;

    iput-object p2, p0, Ln0/k;->c:Lv0/j;

    iput-object p3, p0, Ln0/k;->d:Lm0/a;

    iput-object p4, p0, Ln0/k;->e:Landroidx/work/impl/WorkDatabase;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ln0/k;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/i;

    iget-object v3, p0, Ln0/k;->c:Lv0/j;

    iget-object v3, v3, Lv0/j;->a:Ljava/lang/String;

    invoke-interface {v2, v3}, Ln0/i;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ln0/k;->d:Lm0/a;

    iget-object v2, p0, Ln0/k;->e:Landroidx/work/impl/WorkDatabase;

    invoke-static {v1, v2, v0}, Ln0/l;->b(Lm0/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method
