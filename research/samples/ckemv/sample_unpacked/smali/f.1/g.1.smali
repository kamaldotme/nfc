.class public abstract Lf/g;
.super Landroidx/activity/k;
.source "SourceFile"

# interfaces
.implements Lf/h;
.implements Lx/c;


# instance fields
.field public final r:LA/h;

.field public final s:Landroidx/lifecycle/t;

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Lf/v;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/activity/k;-><init>()V

    new-instance v0, Landroidx/fragment/app/q;

    move-object v1, p0

    check-cast v1, Lxyz/happify/ckemv/MainActivity;

    invoke-direct {v0, v1}, Landroidx/fragment/app/q;-><init>(Lxyz/happify/ckemv/MainActivity;)V

    new-instance v2, LA/h;

    const/16 v3, 0x18

    invoke-direct {v2, v3, v0}, LA/h;-><init>(ILjava/lang/Object;)V

    iput-object v2, p0, Lf/g;->r:LA/h;

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Lf/g;->s:Landroidx/lifecycle/t;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf/g;->v:Z

    iget-object v0, p0, Landroidx/activity/k;->f:Landroidx/activity/l;

    iget-object v0, v0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ld0/d;

    new-instance v2, Landroidx/fragment/app/o;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Landroidx/fragment/app/o;-><init>(Lxyz/happify/ckemv/MainActivity;I)V

    const-string v3, "android:support:fragments"

    invoke-virtual {v0, v3, v2}, Ld0/d;->e(Ljava/lang/String;Ld0/c;)V

    new-instance v0, Landroidx/fragment/app/p;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/p;-><init>(Lxyz/happify/ckemv/MainActivity;I)V

    invoke-virtual {p0, v0}, Landroidx/activity/k;->g(Lb/b;)V

    iget-object v0, p0, Landroidx/activity/k;->f:Landroidx/activity/l;

    iget-object v0, v0, Landroidx/activity/l;->d:Ljava/lang/Object;

    check-cast v0, Ld0/d;

    new-instance v2, Landroidx/fragment/app/o;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Landroidx/fragment/app/o;-><init>(Lxyz/happify/ckemv/MainActivity;I)V

    const-string v3, "androidx:appcompat"

    invoke-virtual {v0, v3, v2}, Ld0/d;->e(Ljava/lang/String;Ld0/c;)V

    new-instance v0, Landroidx/fragment/app/p;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/p;-><init>(Lxyz/happify/ckemv/MainActivity;I)V

    invoke-virtual {p0, v0}, Landroidx/activity/k;->g(Lb/b;)V

    return-void
.end method

.method public static n(Landroidx/fragment/app/B;)Z
    .locals 5

    iget-object p0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {p0}, Lv0/m;->u()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v1, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/q;->h:Lf/g;

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v1}, Landroidx/fragment/app/n;->g()Landroidx/fragment/app/B;

    move-result-object v2

    invoke-static {v2}, Lf/g;->n(Landroidx/fragment/app/B;)Z

    move-result v2

    or-int/2addr v0, v2

    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    sget-object v3, Landroidx/lifecycle/m;->e:Landroidx/lifecycle/m;

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroidx/fragment/app/P;->f()V

    iget-object v2, v2, Landroidx/fragment/app/P;->c:Landroidx/lifecycle/t;

    iget-object v2, v2, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-ltz v2, :cond_4

    iget-object v0, v1, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    iget-object v0, v0, Landroidx/fragment/app/P;->c:Landroidx/lifecycle/t;

    invoke-virtual {v0}, Landroidx/lifecycle/t;->g()V

    move v0, v4

    :cond_4
    iget-object v2, v1, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    iget-object v2, v2, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-ltz v2, :cond_0

    iget-object v0, v1, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    invoke-virtual {v0}, Landroidx/lifecycle/t;->g()V

    move v0, v4

    goto :goto_0

    :cond_5
    return v0
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    invoke-virtual {p0}, Lf/g;->m()V

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    check-cast v0, Lf/v;

    invoke-virtual {v0}, Lf/v;->v()V

    iget-object v1, v0, Lf/v;->B:Landroid/view/ViewGroup;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, v0, Lf/v;->n:Lf/q;

    iget-object p2, v0, Lf/v;->m:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lf/q;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 10

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    check-cast v0, Lf/v;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lf/v;->P:Z

    iget v2, v0, Lf/v;->T:I

    const/16 v3, -0x64

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    sget v2, Lf/k;->c:I

    :goto_0
    invoke-virtual {v0, p1, v2}, Lf/v;->B(Landroid/content/Context;I)I

    move-result v0

    invoke-static {p1}, Lf/k;->b(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {p1}, Lf/k;->b(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_4

    :cond_1
    invoke-static {}, LF/b;->a()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-boolean v2, Lf/k;->g:Z

    if-nez v2, :cond_7

    sget-object v2, Lf/k;->b:Lf/B;

    new-instance v3, LX/h;

    const/4 v4, 0x2

    invoke-direct {v3, p1, v4}, LX/h;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v3}, Lf/B;->execute(Ljava/lang/Runnable;)V

    goto :goto_4

    :cond_2
    sget-object v2, Lf/k;->j:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lf/k;->d:LF/h;

    if-nez v3, :cond_5

    sget-object v3, Lf/k;->e:LF/h;

    if-nez v3, :cond_3

    invoke-static {p1}, Lu2/l;->E(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LF/h;->a(Ljava/lang/String;)LF/h;

    move-result-object v3

    sput-object v3, Lf/k;->e:LF/h;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_3
    :goto_1
    sget-object v3, Lf/k;->e:LF/h;

    iget-object v3, v3, LF/h;->a:LF/i;

    iget-object v3, v3, LF/i;->a:Landroid/os/LocaleList;

    invoke-virtual {v3}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    monitor-exit v2

    goto :goto_4

    :cond_4
    sget-object v3, Lf/k;->e:LF/h;

    sput-object v3, Lf/k;->d:LF/h;

    goto :goto_2

    :cond_5
    sget-object v4, Lf/k;->e:LF/h;

    invoke-virtual {v3, v4}, LF/h;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    sget-object v3, Lf/k;->d:LF/h;

    sput-object v3, Lf/k;->e:LF/h;

    iget-object v3, v3, LF/h;->a:LF/i;

    iget-object v3, v3, LF/i;->a:Landroid/os/LocaleList;

    invoke-virtual {v3}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lu2/l;->C(Landroid/content/Context;Ljava/lang/String;)V

    :cond_6
    :goto_2
    monitor-exit v2

    goto :goto_4

    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_7
    :goto_4
    invoke-static {p1}, Lf/v;->o(Landroid/content/Context;)LF/h;

    move-result-object v2

    sget-boolean v3, Lf/v;->l0:Z

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_8

    instance-of v3, p1, Landroid/view/ContextThemeWrapper;

    if-eqz v3, :cond_8

    invoke-static {p1, v0, v2, v5, v4}, Lf/v;->s(Landroid/content/Context;ILF/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v3

    :try_start_1
    move-object v6, p1

    check-cast v6, Landroid/view/ContextThemeWrapper;

    invoke-virtual {v6, v3}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_a

    :catch_0
    :cond_8
    instance-of v3, p1, Li/e;

    if-eqz v3, :cond_9

    invoke-static {p1, v0, v2, v5, v4}, Lf/v;->s(Landroid/content/Context;ILF/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v3

    :try_start_2
    move-object v4, p1

    check-cast v4, Li/e;

    invoke-virtual {v4, v3}, Li/e;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_a

    :catch_1
    :cond_9
    sget-boolean v3, Lf/v;->k0:Z

    if-nez v3, :cond_a

    goto/16 :goto_a

    :cond_a
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v4, Landroid/content/res/Configuration;

    invoke-direct {v4}, Landroid/content/res/Configuration;-><init>()V

    const/4 v6, -0x1

    iput v6, v4, Landroid/content/res/Configuration;->uiMode:I

    const/4 v6, 0x0

    iput v6, v4, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {p1, v4}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v7

    iget v8, v7, Landroid/content/res/Configuration;->uiMode:I

    iput v8, v4, Landroid/content/res/Configuration;->uiMode:I

    invoke-virtual {v4, v7}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v8

    if-nez v8, :cond_20

    new-instance v8, Landroid/content/res/Configuration;

    invoke-direct {v8}, Landroid/content/res/Configuration;-><init>()V

    iput v6, v8, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {v4, v7}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    move-result v6

    if-nez v6, :cond_b

    goto/16 :goto_5

    :cond_b
    iget v6, v4, Landroid/content/res/Configuration;->fontScale:F

    iget v9, v7, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v6, v6, v9

    if-eqz v6, :cond_c

    iput v9, v8, Landroid/content/res/Configuration;->fontScale:F

    :cond_c
    iget v6, v4, Landroid/content/res/Configuration;->mcc:I

    iget v9, v7, Landroid/content/res/Configuration;->mcc:I

    if-eq v6, v9, :cond_d

    iput v9, v8, Landroid/content/res/Configuration;->mcc:I

    :cond_d
    iget v6, v4, Landroid/content/res/Configuration;->mnc:I

    iget v9, v7, Landroid/content/res/Configuration;->mnc:I

    if-eq v6, v9, :cond_e

    iput v9, v8, Landroid/content/res/Configuration;->mnc:I

    :cond_e
    invoke-static {v4, v7, v8}, Lf/o;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    iget v6, v4, Landroid/content/res/Configuration;->touchscreen:I

    iget v9, v7, Landroid/content/res/Configuration;->touchscreen:I

    if-eq v6, v9, :cond_f

    iput v9, v8, Landroid/content/res/Configuration;->touchscreen:I

    :cond_f
    iget v6, v4, Landroid/content/res/Configuration;->keyboard:I

    iget v9, v7, Landroid/content/res/Configuration;->keyboard:I

    if-eq v6, v9, :cond_10

    iput v9, v8, Landroid/content/res/Configuration;->keyboard:I

    :cond_10
    iget v6, v4, Landroid/content/res/Configuration;->keyboardHidden:I

    iget v9, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    if-eq v6, v9, :cond_11

    iput v9, v8, Landroid/content/res/Configuration;->keyboardHidden:I

    :cond_11
    iget v6, v4, Landroid/content/res/Configuration;->navigation:I

    iget v9, v7, Landroid/content/res/Configuration;->navigation:I

    if-eq v6, v9, :cond_12

    iput v9, v8, Landroid/content/res/Configuration;->navigation:I

    :cond_12
    iget v6, v4, Landroid/content/res/Configuration;->navigationHidden:I

    iget v9, v7, Landroid/content/res/Configuration;->navigationHidden:I

    if-eq v6, v9, :cond_13

    iput v9, v8, Landroid/content/res/Configuration;->navigationHidden:I

    :cond_13
    iget v6, v4, Landroid/content/res/Configuration;->orientation:I

    iget v9, v7, Landroid/content/res/Configuration;->orientation:I

    if-eq v6, v9, :cond_14

    iput v9, v8, Landroid/content/res/Configuration;->orientation:I

    :cond_14
    iget v6, v4, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v6, v6, 0xf

    iget v9, v7, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v9, v9, 0xf

    if-eq v6, v9, :cond_15

    iget v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v6, v9

    iput v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    :cond_15
    iget v6, v4, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v6, v6, 0xc0

    iget v9, v7, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v9, v9, 0xc0

    if-eq v6, v9, :cond_16

    iget v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v6, v9

    iput v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    :cond_16
    iget v6, v4, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v6, v6, 0x30

    iget v9, v7, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v9, v9, 0x30

    if-eq v6, v9, :cond_17

    iget v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v6, v9

    iput v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    :cond_17
    iget v6, v4, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v6, v6, 0x300

    iget v9, v7, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v9, v9, 0x300

    if-eq v6, v9, :cond_18

    iget v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v6, v9

    iput v6, v8, Landroid/content/res/Configuration;->screenLayout:I

    :cond_18
    iget v6, v4, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v6, v6, 0x3

    iget v9, v7, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v9, v9, 0x3

    if-eq v6, v9, :cond_19

    iget v6, v8, Landroid/content/res/Configuration;->colorMode:I

    or-int/2addr v6, v9

    iput v6, v8, Landroid/content/res/Configuration;->colorMode:I

    :cond_19
    iget v6, v4, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v6, v6, 0xc

    iget v9, v7, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v9, v9, 0xc

    if-eq v6, v9, :cond_1a

    iget v6, v8, Landroid/content/res/Configuration;->colorMode:I

    or-int/2addr v6, v9

    iput v6, v8, Landroid/content/res/Configuration;->colorMode:I

    :cond_1a
    iget v6, v4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v6, v6, 0xf

    iget v9, v7, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v9, v9, 0xf

    if-eq v6, v9, :cond_1b

    iget v6, v8, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v6, v9

    iput v6, v8, Landroid/content/res/Configuration;->uiMode:I

    :cond_1b
    iget v6, v4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v6, v6, 0x30

    iget v9, v7, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v9, v9, 0x30

    if-eq v6, v9, :cond_1c

    iget v6, v8, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v6, v9

    iput v6, v8, Landroid/content/res/Configuration;->uiMode:I

    :cond_1c
    iget v6, v4, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v9, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    if-eq v6, v9, :cond_1d

    iput v9, v8, Landroid/content/res/Configuration;->screenWidthDp:I

    :cond_1d
    iget v6, v4, Landroid/content/res/Configuration;->screenHeightDp:I

    iget v9, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    if-eq v6, v9, :cond_1e

    iput v9, v8, Landroid/content/res/Configuration;->screenHeightDp:I

    :cond_1e
    iget v6, v4, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    iget v9, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    if-eq v6, v9, :cond_1f

    iput v9, v8, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    :cond_1f
    iget v4, v4, Landroid/content/res/Configuration;->densityDpi:I

    iget v6, v7, Landroid/content/res/Configuration;->densityDpi:I

    if-eq v4, v6, :cond_21

    iput v6, v8, Landroid/content/res/Configuration;->densityDpi:I

    goto :goto_5

    :cond_20
    move-object v8, v5

    :cond_21
    :goto_5
    invoke-static {p1, v0, v2, v8, v1}, Lf/v;->s(Landroid/content/Context;ILF/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v0

    new-instance v2, Li/e;

    const v4, 0x7f110218

    invoke-direct {v2, p1, v4}, Li/e;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v0}, Li/e;->a(Landroid/content/res/Configuration;)V

    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_4

    if-eqz p1, :cond_25

    invoke-virtual {v2}, Li/e;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const/16 v0, 0x1d

    if-lt v3, v0, :cond_22

    invoke-static {p1}, Lz/m;->a(Landroid/content/res/Resources$Theme;)V

    goto :goto_9

    :cond_22
    sget-object v0, Lz/b;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_4
    sget-boolean v3, Lz/b;->g:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-nez v3, :cond_23

    :try_start_5
    const-class v3, Landroid/content/res/Resources$Theme;

    const-string v4, "rebase"

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    sput-object v3, Lz/b;->f:Ljava/lang/reflect/Method;

    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_8

    :catch_2
    :goto_6
    :try_start_6
    sput-boolean v1, Lz/b;->g:Z

    :cond_23
    sget-object v1, Lz/b;->f:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v1, :cond_24

    :try_start_7
    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_7

    :catch_3
    :try_start_8
    sput-object v5, Lz/b;->f:Ljava/lang/reflect/Method;

    :cond_24
    :goto_7
    monitor-exit v0

    goto :goto_9

    :goto_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    throw p1

    :catch_4
    :cond_25
    :goto_9
    move-object p1, v2

    :goto_a
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 2

    invoke-virtual {p0}, Lf/g;->l()Lf/I;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    :cond_0
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    invoke-virtual {p0}, Lf/g;->l()Lf/I;

    invoke-super {p0, p1}, Landroidx/activity/k;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lf/g;->t:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lf/g;->u:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lf/g;->v:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lv0/e;

    invoke-interface {p0}, Landroidx/lifecycle/P;->c()Landroidx/lifecycle/O;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lv0/e;-><init>(Landroidx/lifecycle/r;Landroidx/lifecycle/O;)V

    invoke-virtual {v1, v0, p3}, Lv0/e;->c(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_0
    iget-object v0, p0, Lf/g;->r:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/B;->t(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    check-cast v0, Lf/v;

    invoke-virtual {v0}, Lf/v;->v()V

    iget-object v0, v0, Lf/v;->m:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    check-cast v0, Lf/v;

    iget-object v1, v0, Lf/v;->q:Li/j;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lf/v;->z()V

    new-instance v1, Li/j;

    iget-object v2, v0, Lf/v;->p:Lf/I;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lf/I;->I()Landroid/content/Context;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lf/v;->l:Landroid/content/Context;

    :goto_0
    invoke-direct {v1, v2}, Li/j;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lf/v;->q:Li/j;

    :cond_1
    iget-object v0, v0, Lf/v;->q:Li/j;

    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    sget v0, Lk/p1;->a:I

    invoke-super {p0}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    invoke-virtual {v0}, Lf/k;->a()V

    return-void
.end method

.method public final k()Lf/k;
    .locals 2

    iget-object v0, p0, Lf/g;->w:Lf/v;

    if-nez v0, :cond_0

    sget-object v0, Lf/k;->b:Lf/B;

    new-instance v0, Lf/v;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p0, p0}, Lf/v;-><init>(Landroid/content/Context;Landroid/view/Window;Lf/h;Ljava/lang/Object;)V

    iput-object v0, p0, Lf/g;->w:Lf/v;

    :cond_0
    iget-object v0, p0, Lf/g;->w:Lf/v;

    return-object v0
.end method

.method public final l()Lf/I;
    .locals 1

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    check-cast v0, Lf/v;

    invoke-virtual {v0}, Lf/v;->z()V

    iget-object v0, v0, Lf/v;->p:Lf/I;

    return-object v0
.end method

.method public final m()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801b6

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801b9

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801b8

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f0801b7

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public final o(Landroid/content/res/Configuration;)V
    .locals 1

    iget-object v0, p0, Lf/g;->r:LA/h;

    invoke-virtual {v0}, LA/h;->q()V

    invoke-super {p0, p1}, Landroidx/activity/k;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object p1, v0, LA/h;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/q;

    iget-object p1, p1, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {p1}, Landroidx/fragment/app/B;->h()V

    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lf/g;->r:LA/h;

    invoke-virtual {v0}, LA/h;->q()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/k;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    invoke-virtual {p0, p1}, Lf/g;->o(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object p1

    check-cast p1, Lf/v;

    iget-boolean v0, p1, Lf/v;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lf/v;->A:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lf/v;->z()V

    iget-object v0, p1, Lf/v;->p:Lf/I;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lf/I;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v2, 0x7f040000

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lf/I;->L(Z)V

    :cond_0
    invoke-static {}, Lk/t;->a()Lk/t;

    move-result-object v0

    iget-object v1, p1, Lf/v;->l:Landroid/content/Context;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lk/t;->a:Lk/O0;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, v2, Lk/O0;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln/e;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ln/e;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    new-instance v0, Landroid/content/res/Configuration;

    iget-object v1, p1, Lf/v;->l:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v0, p1, Lf/v;->S:Landroid/content/res/Configuration;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Lf/v;->m(ZZ)Z

    return-void

    :goto_1
    :try_start_3
    monitor-exit v2

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final onContentChanged()V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/activity/k;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lf/g;->s:Landroidx/lifecycle/t;

    sget-object v0, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    iget-object p1, p0, Lf/g;->r:LA/h;

    iget-object p1, p1, LA/h;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/q;

    iget-object p1, p1, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/B;->y:Z

    iput-boolean v0, p1, Landroidx/fragment/app/B;->z:Z

    iget-object v1, p1, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v0, v1, Landroidx/fragment/app/D;->h:Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/fragment/app/B;->s(I)V

    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2}, Landroidx/activity/k;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    invoke-virtual {p0}, Lf/g;->getMenuInflater()Landroid/view/MenuInflater;

    iget-object p1, p0, Lf/g;->r:LA/h;

    iget-object p1, p1, LA/h;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/q;

    iget-object p1, p1, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {p1}, Landroidx/fragment/app/B;->j()Z

    move-result p1

    or-int/2addr p1, v0

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/activity/k;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    return v0
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lf/g;->r:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    .line 2
    iget-object v0, v0, Landroidx/fragment/app/B;->f:Landroidx/fragment/app/t;

    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/t;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 5
    iget-object v0, p0, Lf/g;->r:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    .line 6
    iget-object v0, v0, Landroidx/fragment/app/B;->f:Landroidx/fragment/app/t;

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1, p2, p3}, Landroidx/fragment/app/t;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 8
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onDestroy()V
    .locals 1

    invoke-virtual {p0}, Lf/g;->p()V

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    invoke-virtual {v0}, Lf/k;->d()V

    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onLowMemory()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    iget-object v0, p0, Lf/g;->r:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {v0}, Landroidx/fragment/app/B;->l()V

    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 4

    invoke-virtual {p0, p1, p2}, Lf/g;->q(ILandroid/view/MenuItem;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lf/g;->l()Lf/I;

    move-result-object p1

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v1, 0x102002c

    const/4 v2, 0x0

    if-ne p2, v1, :cond_8

    if-eqz p1, :cond_8

    iget-object p1, p1, Lf/I;->e:Lk/n0;

    check-cast p1, Lk/n1;

    iget p1, p1, Lk/n1;->b:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_8

    invoke-static {p0}, La/a;->t(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p0, p1}, Lx/i;->c(Landroid/app/Activity;Landroid/content/Intent;)Z

    move-result p2

    if-eqz p2, :cond_6

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, La/a;->t(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-static {p0}, La/a;->t(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p2

    :cond_1
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v1

    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    :try_start_0
    invoke-static {p0, v1}, La/a;->u(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {p1, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    invoke-static {p0, v1}, La/a;->u(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_3
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :goto_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    :goto_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    new-array p2, v2, [Landroid/content/Intent;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/content/Intent;

    new-instance p2, Landroid/content/Intent;

    aget-object v1, p1, v2

    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const v1, 0x1000c000

    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p2

    aput-object p2, p1, v2

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, Ly/a;->a(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V

    :try_start_1
    invoke-static {p0}, Lx/a;->a(Landroid/app/Activity;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No intents added to TaskStackBuilder; cannot startActivities"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p0, p1}, Lx/i;->b(Landroid/app/Activity;Landroid/content/Intent;)Z

    goto :goto_3

    :cond_7
    move v0, v2

    :goto_3
    return v0

    :cond_8
    return v2
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final onMultiWindowModeChanged(Z)V
    .locals 1

    iget-object v0, p0, Lf/g;->r:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/B;->m(Z)V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lf/g;->r:LA/h;

    invoke-virtual {v0}, LA/h;->q()V

    invoke-super {p0, p1}, Landroidx/activity/k;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lf/g;->r(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf/g;->u:Z

    iget-object v0, p0, Lf/g;->r:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/fragment/app/B;->s(I)V

    iget-object v0, p0, Lf/g;->s:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    return-void
.end method

.method public final onPictureInPictureModeChanged(Z)V
    .locals 1

    iget-object v0, p0, Lf/g;->r:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/B;->q(Z)V

    return-void
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object p1

    check-cast p1, Lf/v;

    invoke-virtual {p1}, Lf/v;->v()V

    return-void
.end method

.method public final onPostResume()V
    .locals 2

    invoke-virtual {p0}, Lf/g;->s()V

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    check-cast v0, Lf/v;

    invoke-virtual {v0}, Lf/v;->z()V

    iget-object v0, v0, Lf/v;->p:Lf/I;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lf/I;->u:Z

    :cond_0
    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/k;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    iget-object p1, p0, Lf/g;->r:LA/h;

    iget-object p1, p1, LA/h;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/q;

    iget-object p1, p1, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {p1}, Landroidx/fragment/app/B;->r()Z

    move-result p1

    or-int/2addr p1, v0

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/k;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    return v0
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, Lf/g;->r:LA/h;

    invoke-virtual {v0}, LA/h;->q()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/k;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, Lf/g;->r:LA/h;

    invoke-virtual {v0}, LA/h;->q()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lf/g;->u:Z

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/B;->w(Z)Z

    return-void
.end method

.method public final onStart()V
    .locals 3

    invoke-virtual {p0}, Lf/g;->t()V

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    check-cast v0, Lf/v;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lf/v;->m(ZZ)Z

    return-void
.end method

.method public final onStateNotSaved()V
    .locals 1

    iget-object v0, p0, Lf/g;->r:LA/h;

    invoke-virtual {v0}, LA/h;->q()V

    return-void
.end method

.method public final onStop()V
    .locals 2

    invoke-virtual {p0}, Lf/g;->u()V

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    check-cast v0, Lf/v;

    invoke-virtual {v0}, Lf/v;->z()V

    iget-object v0, v0, Lf/v;->p:Lf/I;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lf/I;->u:Z

    iget-object v0, v0, Lf/I;->t:Li/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li/l;->a()V

    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object p2

    invoke-virtual {p2, p1}, Lf/k;->l(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final openOptionsMenu()V
    .locals 2

    invoke-virtual {p0}, Lf/g;->l()Lf/I;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    :cond_0
    return-void
.end method

.method public final p()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Lf/g;->r:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {v0}, Landroidx/fragment/app/B;->k()V

    iget-object v0, p0, Lf/g;->s:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    return-void
.end method

.method public final q(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/activity/k;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p2, p0, Lf/g;->r:LA/h;

    if-eqz p1, :cond_2

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object p1, p2, LA/h;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/q;

    iget-object p1, p1, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {p1}, Landroidx/fragment/app/B;->i()Z

    move-result p1

    return p1

    :cond_2
    iget-object p1, p2, LA/h;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/q;

    iget-object p1, p1, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {p1}, Landroidx/fragment/app/B;->n()Z

    move-result p1

    return p1
.end method

.method public final r(ILandroid/view/Menu;)V
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, Lf/g;->r:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {v0}, Landroidx/fragment/app/B;->o()V

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/activity/k;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public final s()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    iget-object v0, p0, Lf/g;->s:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_RESUME:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    iget-object v0, p0, Lf/g;->r:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/B;->y:Z

    iput-boolean v1, v0, Landroidx/fragment/app/B;->z:Z

    iget-object v2, v0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v1, v2, Landroidx/fragment/app/D;->h:Z

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroidx/fragment/app/B;->s(I)V

    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf/g;->m()V

    .line 2
    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf/k;->i(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lf/g;->m()V

    .line 4
    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf/k;->j(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lf/g;->m()V

    .line 6
    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lf/k;->k(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->setTheme(I)V

    invoke-virtual {p0}, Lf/g;->k()Lf/k;

    move-result-object v0

    check-cast v0, Lf/v;

    iput p1, v0, Lf/v;->U:I

    return-void
.end method

.method public final t()V
    .locals 5

    iget-object v0, p0, Lf/g;->r:LA/h;

    invoke-virtual {v0}, LA/h;->q()V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lf/g;->v:Z

    iget-boolean v2, p0, Lf/g;->t:Z

    const/4 v3, 0x1

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    if-nez v2, :cond_0

    iput-boolean v3, p0, Lf/g;->t:Z

    iget-object v2, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    iput-boolean v1, v2, Landroidx/fragment/app/B;->y:Z

    iput-boolean v1, v2, Landroidx/fragment/app/B;->z:Z

    iget-object v4, v2, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v1, v4, Landroidx/fragment/app/D;->h:Z

    const/4 v4, 0x4

    invoke-virtual {v2, v4}, Landroidx/fragment/app/B;->s(I)V

    :cond_0
    iget-object v2, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {v2, v3}, Landroidx/fragment/app/B;->w(Z)Z

    iget-object v2, p0, Lf/g;->s:Landroidx/lifecycle/t;

    sget-object v3, Landroidx/lifecycle/l;->ON_START:Landroidx/lifecycle/l;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    iput-boolean v1, v0, Landroidx/fragment/app/B;->y:Z

    iput-boolean v1, v0, Landroidx/fragment/app/B;->z:Z

    iget-object v2, v0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v1, v2, Landroidx/fragment/app/D;->h:Z

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/fragment/app/B;->s(I)V

    return-void
.end method

.method public final u()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf/g;->v:Z

    :cond_0
    iget-object v1, p0, Lf/g;->r:LA/h;

    iget-object v2, v1, LA/h;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/fragment/app/q;

    iget-object v2, v2, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-static {v2}, Lf/g;->n(Landroidx/fragment/app/B;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v1, v1, LA/h;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/q;

    iget-object v1, v1, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    iput-boolean v0, v1, Landroidx/fragment/app/B;->z:Z

    iget-object v2, v1, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v0, v2, Landroidx/fragment/app/D;->h:Z

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Landroidx/fragment/app/B;->s(I)V

    iget-object v0, p0, Lf/g;->s:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    return-void
.end method
