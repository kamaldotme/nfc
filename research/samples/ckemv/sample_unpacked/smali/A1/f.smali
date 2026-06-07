.class public abstract LA1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LA1/f;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/T;LF/d;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LA1/f;->a:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, LA1/f;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf/v;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA1/f;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp1/a;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LA1/f;->a:Ljava/lang/Object;

    .line 5
    new-instance v0, Lv0/m;

    invoke-direct {v0, p1}, Lv0/m;-><init>(Lp1/a;)V

    iput-object v0, p0, LA1/f;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, LA1/f;->a:Ljava/lang/Object;

    check-cast v0, Lf/s;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v1, Lf/v;

    iget-object v1, v1, Lf/v;->l:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, LA1/f;->a:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, LA1/f;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/T;

    iget-object v1, v0, Landroidx/fragment/app/T;->e:Ljava/util/HashSet;

    iget-object v2, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v2, LF/d;

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/T;->b()V

    :cond_0
    return-void
.end method

.method public abstract e()Landroid/content/IntentFilter;
.end method

.method public abstract f()I
.end method

.method public g(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    instance-of v0, p1, LC/a;

    if-eqz v0, :cond_2

    check-cast p1, LC/a;

    iget-object v0, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v0, Ln/k;

    if-nez v0, :cond_0

    new-instance v0, Ln/k;

    invoke-direct {v0}, Ln/k;-><init>()V

    iput-object v0, p0, LA1/f;->b:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    if-nez v0, :cond_1

    new-instance v0, Lj/t;

    iget-object v1, p0, LA1/f;->a:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lj/t;-><init>(Landroid/content/Context;LC/a;)V

    iget-object v1, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v1, Ln/k;

    invoke-virtual {v1, p1, v0}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public h()Z
    .locals 3

    iget-object v0, p0, LA1/f;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/T;

    iget-object v1, v0, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    iget-object v1, v1, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-static {v1}, LX/d;->c(Landroid/view/View;)I

    move-result v1

    iget v0, v0, Landroidx/fragment/app/T;->a:I

    if-eq v1, v0, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public abstract i()V
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public k()V
    .locals 3

    invoke-virtual {p0}, LA1/f;->c()V

    invoke-virtual {p0}, LA1/f;->e()Landroid/content/IntentFilter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LA1/f;->a:Ljava/lang/Object;

    check-cast v1, Lf/s;

    if-nez v1, :cond_1

    new-instance v1, Lf/s;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Lf/s;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, LA1/f;->a:Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v1, Lf/v;

    iget-object v1, v1, Lf/v;->l:Landroid/content/Context;

    iget-object v2, p0, LA1/f;->a:Ljava/lang/Object;

    check-cast v2, Lf/s;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method
