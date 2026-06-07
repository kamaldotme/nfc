.class public abstract Lf/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lf/B;

.field public static final c:I

.field public static d:LF/h;

.field public static e:LF/h;

.field public static f:Ljava/lang/Boolean;

.field public static g:Z

.field public static final h:Ln/c;

.field public static final i:Ljava/lang/Object;

.field public static final j:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf/B;

    new-instance v1, Lf/C;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lf/C;-><init>(I)V

    invoke-direct {v0, v1}, Lf/B;-><init>(Lf/C;)V

    sput-object v0, Lf/k;->b:Lf/B;

    const/16 v0, -0x64

    sput v0, Lf/k;->c:I

    const/4 v0, 0x0

    sput-object v0, Lf/k;->d:LF/h;

    sput-object v0, Lf/k;->e:LF/h;

    sput-object v0, Lf/k;->f:Ljava/lang/Boolean;

    const/4 v0, 0x0

    sput-boolean v0, Lf/k;->g:Z

    new-instance v0, Ln/c;

    invoke-direct {v0}, Ln/c;-><init>()V

    sput-object v0, Lf/k;->h:Ln/c;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf/k;->i:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf/k;->j:Ljava/lang/Object;

    return-void
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 4

    sget-object v0, Lf/k;->f:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    :try_start_0
    sget v0, Lf/A;->b:I

    invoke-static {}, Lf/z;->a()I

    move-result v0

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v2, Landroid/content/ComponentName;

    const-class v3, Lf/A;

    invoke-direct {v2, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_0

    const-string v0, "autoStoreLocales"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Lf/k;->f:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p0, Lf/k;->f:Ljava/lang/Boolean;

    :cond_0
    :goto_0
    sget-object p0, Lf/k;->f:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static f(Lf/k;)V
    .locals 3

    sget-object v0, Lf/k;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lf/k;->h:Ln/c;

    invoke-virtual {v1}, Ln/c;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf/k;

    if-eq v2, p0, :cond_1

    if-nez v2, :cond_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract c()V
.end method

.method public abstract d()V
.end method

.method public abstract h(I)Z
.end method

.method public abstract i(I)V
.end method

.method public abstract j(Landroid/view/View;)V
.end method

.method public abstract k(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract l(Ljava/lang/CharSequence;)V
.end method
