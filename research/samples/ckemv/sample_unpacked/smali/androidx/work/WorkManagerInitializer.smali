.class public final Landroidx/work/WorkManagerInitializer;
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
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WrkMgrInitializer"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lm0/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lm0/a;

    invoke-direct {v1, v0}, Lm0/a;-><init>(Lm0/r;)V

    sget-object v0, Ln0/s;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v2, Ln0/s;->n:Ln0/s;

    if-eqz v2, :cond_1

    sget-object v3, Ln0/s;->o:Ln0/s;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    if-nez v2, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Ln0/s;->o:Ln0/s;

    if-nez v3, :cond_2

    invoke-static {v2, v1}, Lu2/l;->f(Landroid/content/Context;Lm0/a;)Ln0/s;

    move-result-object v1

    sput-object v1, Ln0/s;->o:Ln0/s;

    :cond_2
    sget-object v1, Ln0/s;->o:Ln0/s;

    sput-object v1, Ln0/s;->n:Ln0/s;

    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1}, Ln0/s;->p0(Landroid/content/Context;)Ln0/s;

    move-result-object p1

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
