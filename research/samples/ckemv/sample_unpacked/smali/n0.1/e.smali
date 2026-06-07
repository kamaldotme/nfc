.class public final synthetic Ln0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ln0/g;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ln0/g;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/e;->a:Ln0/g;

    iput-object p2, p0, Ln0/e;->b:Ljava/util/ArrayList;

    iput-object p3, p0, Ln0/e;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ln0/e;->a:Ln0/g;

    iget-object v0, v0, Ln0/g;->e:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->v()Lv0/r;

    move-result-object v1

    iget-object v2, p0, Ln0/e;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lv0/r;->t(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v3, p0, Ln0/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v0

    invoke-virtual {v0, v2}, Lv0/p;->i(Ljava/lang/String;)Lv0/o;

    move-result-object v0

    return-object v0
.end method
