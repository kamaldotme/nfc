.class public Landroidx/emoji2/text/EmojiCompatInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh0/b;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    const-class v0, Landroidx/lifecycle/ProcessLifecycleInitializer;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic b(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/emoji2/text/EmojiCompatInitializer;->c(Landroid/content/Context;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final c(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Landroidx/emoji2/text/q;

    new-instance v1, LA/h;

    invoke-direct {v1, p1}, LA/h;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, LZ/w;-><init>(Landroidx/emoji2/text/i;)V

    const/4 v1, 0x1

    iput v1, v0, LZ/w;->a:I

    sget-object v1, Landroidx/emoji2/text/j;->j:Landroidx/emoji2/text/j;

    if-nez v1, :cond_1

    sget-object v1, Landroidx/emoji2/text/j;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Landroidx/emoji2/text/j;->j:Landroidx/emoji2/text/j;

    if-nez v2, :cond_0

    new-instance v2, Landroidx/emoji2/text/j;

    invoke-direct {v2, v0}, Landroidx/emoji2/text/j;-><init>(Landroidx/emoji2/text/q;)V

    sput-object v2, Landroidx/emoji2/text/j;->j:Landroidx/emoji2/text/j;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    invoke-static {p1}, Lh0/a;->c(Landroid/content/Context;)Lh0/a;

    move-result-object p1

    const-class v0, Landroidx/lifecycle/ProcessLifecycleInitializer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lh0/a;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v2, p1, Lh0/a;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1, v0, v2}, Lh0/a;->b(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_2
    :goto_3
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    check-cast v2, Landroidx/lifecycle/r;

    invoke-interface {v2}, Landroidx/lifecycle/r;->d()Landroidx/lifecycle/t;

    move-result-object p1

    new-instance v0, Landroidx/emoji2/text/EmojiCompatInitializer$1;

    invoke-direct {v0, p0, p1}, Landroidx/emoji2/text/EmojiCompatInitializer$1;-><init>(Landroidx/emoji2/text/EmojiCompatInitializer;Landroidx/lifecycle/t;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    return-void

    :goto_4
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method
