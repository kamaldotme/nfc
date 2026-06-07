.class public final Lxyz/happify/ckemv/MainActivity;
.super Lf/g;
.source "SourceFile"


# static fields
.field public static final synthetic F:I


# instance fields
.field public A:LB2/a;

.field public B:Landroid/widget/LinearLayout;

.field public C:Landroid/widget/ProgressBar;

.field public final D:Lh2/o;

.field public final E:Landroidx/activity/result/c;

.field public x:Landroid/nfc/NfcAdapter;

.field public y:Landroid/app/PendingIntent;

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lf/g;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lh2/o;

    invoke-direct {v1, v0}, Lh2/o;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lxyz/happify/ckemv/MainActivity;->D:Lh2/o;

    new-instance v0, LI1/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI1/v;-><init>(I)V

    new-instance v1, LB2/b;

    invoke-direct {v1, p0}, LB2/b;-><init>(Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "activity_rq#"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Landroidx/activity/k;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Landroidx/activity/k;->l:Landroidx/activity/g;

    invoke-virtual {v3, v2, p0, v0, v1}, Landroidx/activity/result/g;->c(Ljava/lang/String;Landroidx/lifecycle/r;LI1/v;LB2/b;)Landroidx/activity/result/c;

    move-result-object v0

    iput-object v0, p0, Lxyz/happify/ckemv/MainActivity;->E:Landroidx/activity/result/c;

    return-void
.end method

.method public static final v(Lxyz/happify/ckemv/MainActivity;[B)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-byte v2, p1, v1

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v3, "%02X"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final w(Lxyz/happify/ckemv/MainActivity;Ljava/lang/String;Ljava/lang/String;LO1/d;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "update_v"

    const-string v3, "{\"api_key\": \""

    instance-of v4, v1, LB2/f;

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, LB2/f;

    iget v5, v4, LB2/f;->j:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, LB2/f;->j:I

    goto :goto_0

    :cond_0
    new-instance v4, LB2/f;

    invoke-direct {v4, v0, v1}, LB2/f;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    :goto_0
    iget-object v1, v4, LB2/f;->h:Ljava/lang/Object;

    sget-object v5, LP1/a;->b:LP1/a;

    iget v6, v4, LB2/f;->j:I

    sget-object v7, LK1/h;->a:LK1/h;

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x0

    if-eqz v6, :cond_5

    if-eq v6, v10, :cond_4

    if-eq v6, v12, :cond_3

    if-eq v6, v9, :cond_2

    if-ne v6, v8, :cond_1

    iget-object v2, v4, LB2/f;->e:Lxyz/happify/ckemv/MainActivity;

    :try_start_0
    invoke-static {v1}, Lm0/z;->m0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v4, LB2/f;->e:Lxyz/happify/ckemv/MainActivity;

    :goto_1
    :try_start_1
    invoke-static {v1}, Lm0/z;->m0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_7

    :cond_3
    iget-object v2, v4, LB2/f;->e:Lxyz/happify/ckemv/MainActivity;

    goto :goto_1

    :cond_4
    iget-object v0, v4, LB2/f;->g:Ljava/lang/String;

    iget-object v6, v4, LB2/f;->f:Ljava/lang/String;

    iget-object v10, v4, LB2/f;->e:Lxyz/happify/ckemv/MainActivity;

    invoke-static {v1}, Lm0/z;->m0(Ljava/lang/Object;)V

    move-object v15, v0

    move-object v14, v6

    goto :goto_3

    :cond_5
    invoke-static {v1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-boolean v1, v0, Lxyz/happify/ckemv/MainActivity;->z:Z

    if-eqz v1, :cond_6

    :goto_2
    move-object v5, v7

    goto/16 :goto_8

    :cond_6
    iput-boolean v10, v0, Lxyz/happify/ckemv/MainActivity;->z:Z

    sget-object v1, Le2/B;->a:Ll2/d;

    sget-object v1, Lj2/o;->a:Lf2/d;

    new-instance v6, LB2/g;

    invoke-direct {v6, v12, v13}, LQ1/g;-><init>(ILO1/d;)V

    iput-object v0, v4, LB2/f;->e:Lxyz/happify/ckemv/MainActivity;

    move-object/from16 v14, p1

    iput-object v14, v4, LB2/f;->f:Ljava/lang/String;

    move-object/from16 v15, p2

    iput-object v15, v4, LB2/f;->g:Ljava/lang/String;

    iput v10, v4, LB2/f;->j:I

    invoke-static {v1, v6, v4}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_7

    goto/16 :goto_8

    :cond_7
    move-object v10, v0

    :goto_3
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lm2/n;->c:Ljava/util/regex/Pattern;

    const-string v1, "application/json"

    invoke-static {v1}, Lu2/l;->j(Ljava/lang/String;)Lm2/n;

    move-result-object v1

    invoke-static {v0, v1}, La/a;->l(Ljava/lang/String;Lm2/n;)LX0/o;

    move-result-object v0

    new-instance v1, LG/e;

    invoke-direct {v1}, LG/e;-><init>()V

    invoke-virtual {v1}, LG/e;->p()V

    const-string v3, "POST"

    invoke-virtual {v1, v3, v0}, LG/e;->j(Ljava/lang/String;LX0/o;)V

    invoke-virtual {v1}, LG/e;->a()Lk/s;

    move-result-object v0

    new-instance v1, Lm2/o;

    invoke-direct {v1}, Lm2/o;-><init>()V

    new-instance v3, Lq2/i;

    invoke-direct {v3, v1, v0, v11}, Lq2/i;-><init>(Lm2/o;Lk/s;Z)V

    invoke-virtual {v3}, Lq2/i;->c()Lm2/r;

    move-result-object v0

    iget v1, v0, Lm2/r;->e:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/16 v3, 0xc8

    if-gt v3, v1, :cond_b

    const/16 v3, 0x12c

    if-ge v1, v3, :cond_b

    iget-object v0, v0, Lm2/r;->h:Lm2/s;

    if-eqz v0, :cond_b

    :try_start_3
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v10, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v2, v10

    goto/16 :goto_9

    :catch_1
    move-exception v0

    move-object v2, v10

    goto/16 :goto_7

    :cond_8
    :goto_4
    new-instance v3, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".apk"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v3}, Lm0/z;->k0(Ljava/io/File;)Lz2/c;

    move-result-object v1

    new-instance v2, Lz2/o;

    invoke-direct {v2, v1}, Lz2/o;-><init>(Lz2/t;)V

    invoke-virtual {v0}, Lm2/s;->b()Lz2/h;

    move-result-object v0

    const-string v1, "source"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_5
    iget-object v1, v2, Lz2/o;->c:Lz2/f;

    const-wide/16 v14, 0x2000

    invoke-interface {v0, v1, v14, v15}, Lz2/v;->z(Lz2/f;J)J

    move-result-wide v14

    const-wide/16 v16, -0x1

    cmp-long v1, v14, v16

    if-eqz v1, :cond_9

    invoke-virtual {v2}, Lz2/o;->a()Lz2/g;

    goto :goto_5

    :cond_9
    invoke-virtual {v2}, Lz2/o;->close()V

    sget-object v0, Le2/B;->a:Ll2/d;

    sget-object v0, Lj2/o;->a:Lf2/d;

    new-instance v1, LB2/h;

    invoke-direct {v1, v10, v3, v13}, LB2/h;-><init>(Lxyz/happify/ckemv/MainActivity;Ljava/io/File;LO1/d;)V

    iput-object v10, v4, LB2/f;->e:Lxyz/happify/ckemv/MainActivity;

    iput-object v13, v4, LB2/f;->f:Ljava/lang/String;

    iput-object v13, v4, LB2/f;->g:Ljava/lang/String;

    iput v12, v4, LB2/f;->j:I

    invoke-static {v0, v1, v4}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_a

    goto :goto_8

    :cond_a
    move-object v2, v10

    goto :goto_6

    :cond_b
    sget-object v0, Le2/B;->a:Ll2/d;

    sget-object v0, Lj2/o;->a:Lf2/d;

    new-instance v1, LB2/i;

    invoke-direct {v1, v12, v13}, LQ1/g;-><init>(ILO1/d;)V

    iput-object v10, v4, LB2/f;->e:Lxyz/happify/ckemv/MainActivity;

    iput-object v13, v4, LB2/f;->f:Ljava/lang/String;

    iput-object v13, v4, LB2/f;->g:Ljava/lang/String;

    iput v9, v4, LB2/f;->j:I

    invoke-static {v0, v1, v4}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v0, v5, :cond_a

    goto :goto_8

    :cond_c
    :goto_6
    iput-boolean v11, v2, Lxyz/happify/ckemv/MainActivity;->z:Z

    goto/16 :goto_2

    :goto_7
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Le2/B;->a:Ll2/d;

    sget-object v0, Lj2/o;->a:Lf2/d;

    new-instance v1, LB2/j;

    invoke-direct {v1, v12, v13}, LQ1/g;-><init>(ILO1/d;)V

    iput-object v2, v4, LB2/f;->e:Lxyz/happify/ckemv/MainActivity;

    iput-object v13, v4, LB2/f;->f:Ljava/lang/String;

    iput-object v13, v4, LB2/f;->g:Ljava/lang/String;

    iput v8, v4, LB2/f;->j:I

    invoke-static {v0, v1, v4}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne v0, v5, :cond_c

    :goto_8
    return-object v5

    :goto_9
    iput-boolean v11, v2, Lxyz/happify/ckemv/MainActivity;->z:Z

    throw v0
.end method

.method public static final x(Lxyz/happify/ckemv/MainActivity;Ljava/lang/String;)[B
    .locals 6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    div-int/lit8 v0, p0, 0x2

    new-array v0, v0, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    div-int/lit8 v2, v1, 0x2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    shl-int/lit8 v3, v3, 0x4

    add-int/lit8 v5, v1, 0x1

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5, v4}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    add-int/2addr v4, v3

    int-to-byte v3, v4

    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 17

    move-object/from16 v0, p0

    invoke-super/range {p0 .. p1}, Lf/g;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v1, v2}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual/range {p0 .. p0}, Lf/g;->l()Lf/I;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-boolean v4, v1, Lf/I;->p:Z

    if-nez v4, :cond_0

    iput-boolean v2, v1, Lf/I;->p:Z

    invoke-virtual {v1, v3}, Lf/I;->M(Z)V

    :cond_0
    new-instance v1, LB2/a;

    invoke-direct {v1, v0}, LB2/a;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "power"

    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type android.os.PowerManager"

    invoke-static {v5, v6}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/os/PowerManager;

    invoke-virtual {v5, v4}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"

    invoke-virtual {v1, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "package:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_1
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0x11

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    const-string v5, "#121212"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v1, v5}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v5}, LL1/k;->Z(Ljava/util/AbstractCollection;)Ljava/util/Set;

    move-result-object v16

    new-instance v5, Lm0/d;

    const-wide/16 v12, -0x1

    const-wide/16 v14, -0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v6, v5

    invoke-direct/range {v6 .. v16}, Lm0/d;-><init>(IZZZZJJLjava/util/Set;)V

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Lm0/s;

    const-string v8, "repeatIntervalTimeUnit"

    invoke-static {v6, v8}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lxyz/happify/ckemv/SyncWorker;

    invoke-direct {v7, v2, v8}, Lm0/s;-><init>(ILjava/lang/Class;)V

    iget-object v8, v7, La0/m;->b:Ljava/lang/Object;

    check-cast v8, Lv0/o;

    const-wide/16 v9, 0xf

    invoke-virtual {v6, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/32 v11, 0xdbba0

    cmp-long v6, v9, v11

    if-gez v6, :cond_2

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    if-gez v6, :cond_3

    move-wide v13, v11

    goto :goto_0

    :cond_3
    move-wide v13, v9

    :goto_0
    if-gez v6, :cond_4

    move-wide v9, v11

    :cond_4
    cmp-long v6, v13, v11

    if-gez v6, :cond_5

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_5
    if-gez v6, :cond_6

    goto :goto_1

    :cond_6
    move-wide v11, v13

    :goto_1
    iput-wide v11, v8, Lv0/o;->h:J

    const-wide/32 v11, 0x493e0

    cmp-long v6, v9, v11

    if-gez v6, :cond_7

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_7
    iget-wide v13, v8, Lv0/o;->h:J

    cmp-long v13, v9, v13

    if-lez v13, :cond_8

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_8
    iget-wide v13, v8, Lv0/o;->h:J

    cmp-long v15, v11, v13

    if-gtz v15, :cond_e

    if-gez v6, :cond_9

    move-wide v9, v11

    goto :goto_2

    :cond_9
    cmp-long v6, v9, v13

    if-lez v6, :cond_a

    move-wide v9, v13

    :cond_a
    :goto_2
    iput-wide v9, v8, Lv0/o;->i:J

    iget-object v6, v7, La0/m;->b:Ljava/lang/Object;

    check-cast v6, Lv0/o;

    iput-object v5, v6, Lv0/o;->j:Lm0/d;

    invoke-virtual {v7}, La0/m;->b()Lm0/A;

    move-result-object v5

    check-cast v5, Lm0/y;

    invoke-static/range {p0 .. p0}, Ln0/s;->p0(Landroid/content/Context;)Ln0/s;

    move-result-object v6

    new-instance v7, Ln0/n;

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-string v8, "CkemvSyncWork"

    const/4 v9, 0x2

    invoke-direct {v7, v6, v8, v9, v5}, Ln0/n;-><init>(Ln0/s;Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual {v7}, Ln0/n;->Q()Lm0/x;

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x1

    const/4 v7, -0x2

    invoke-direct {v4, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v4, 0x20

    invoke-virtual {v5, v4, v4, v4, v3}, Landroid/view/View;->setPadding(IIII)V

    new-instance v8, Landroid/widget/TextView;

    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v9, ""

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v9, 0x41600000    # 14.0f

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v9, "#00E676"

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-direct {v10, v3, v7, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v8, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v7, LB2/d;

    invoke-direct {v7, v0, v3}, LB2/d;-><init>(Lxyz/happify/ckemv/MainActivity;I)V

    invoke-virtual {v8, v7}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v7, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v8, 0x10

    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-virtual {v7, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance v4, LB2/d;

    invoke-direct {v4, v0, v2}, LB2/d;-><init>(Lxyz/happify/ckemv/MainActivity;I)V

    invoke-virtual {v7, v4}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iput-object v7, v0, Lxyz/happify/ckemv/MainActivity;->B:Landroid/widget/LinearLayout;

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v7, "Active"

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v7, 0x41200000    # 10.0f

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v8, "#444444"

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v10, v0, Lxyz/happify/ckemv/MainActivity;->B:Landroid/widget/LinearLayout;

    const/4 v12, 0x0

    const-string v13, "rightActionArea"

    if-eqz v10, :cond_d

    invoke-virtual {v10, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v10, " \u2022"

    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v4, v12, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v2, v0, Lxyz/happify/ckemv/MainActivity;->B:Landroid/widget/LinearLayout;

    if-eqz v2, :cond_c

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v2, v0, Lxyz/happify/ckemv/MainActivity;->B:Landroid/widget/LinearLayout;

    if-eqz v2, :cond_b

    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/ProgressBar;

    const v4, 0x1010078

    invoke-direct {v2, v0, v12, v4}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v5, 0x8

    invoke-direct {v4, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v3, v3, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v4, 0x64

    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    const/4 v4, 0x4

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iput-object v2, v0, Lxyz/happify/ckemv/MainActivity;->C:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, LB2/w;

    invoke-direct {v2, v0}, LB2/w;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v6, v3, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lf/g;->setContentView(Landroid/view/View;)V

    sget-object v1, Le2/B;->a:Ll2/d;

    sget-object v1, Lj2/o;->a:Lf2/d;

    invoke-static {v1}, Le2/v;->a(LO1/i;)Lj2/e;

    move-result-object v1

    new-instance v2, LB2/l;

    invoke-direct {v2, v0, v12}, LB2/l;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    const/4 v4, 0x3

    invoke-static {v1, v3, v2, v4}, Le2/v;->k(Le2/t;ILW1/p;I)Le2/f0;

    invoke-static/range {p0 .. p0}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    move-result-object v1

    iput-object v1, v0, Lxyz/happify/ckemv/MainActivity;->x:Landroid/nfc/NfcAdapter;

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lxyz/happify/ckemv/MainActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x20000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v2, 0xa000000

    invoke-static {v0, v3, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    iput-object v1, v0, Lxyz/happify/ckemv/MainActivity;->y:Landroid/app/PendingIntent;

    sget-object v1, Le2/B;->b:Ll2/c;

    invoke-static {v1}, Le2/v;->a(LO1/i;)Lj2/e;

    move-result-object v2

    new-instance v5, LB2/s;

    invoke-direct {v5, v0, v12}, LB2/s;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    invoke-static {v2, v3, v5, v4}, Le2/v;->k(Le2/t;ILW1/p;I)Le2/f0;

    invoke-static {v1}, Le2/v;->a(LO1/i;)Lj2/e;

    move-result-object v1

    new-instance v2, LB2/t;

    invoke-direct {v2, v0, v12}, LB2/t;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    invoke-static {v1, v3, v2, v4}, Le2/v;->k(Le2/t;ILW1/p;I)Le2/f0;

    return-void

    :cond_b
    invoke-static {v13}, LX1/g;->h(Ljava/lang/String;)V

    throw v12

    :cond_c
    invoke-static {v13}, LX1/g;->h(Ljava/lang/String;)V

    throw v12

    :cond_d
    invoke-static {v13}, LX1/g;->h(Ljava/lang/String;)V

    throw v12

    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot coerce value to an empty range: maximum "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " is less than minimum 300000."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 3

    invoke-super {p0, p1}, Lf/g;->onNewIntent(Landroid/content/Intent;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    const-string v2, "android.nfc.action.TECH_DISCOVERED"

    invoke-static {v2, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    const-string v2, "android.nfc.action.TAG_DISCOVERED"

    invoke-static {v2, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v0

    :goto_2
    const-string v2, "android.nfc.action.NDEF_DISCOVERED"

    invoke-static {v2, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_3
    if-eqz p1, :cond_4

    const-string v1, "android.nfc.extra.TAG"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/nfc/Tag;

    goto :goto_3

    :cond_4
    move-object p1, v0

    :goto_3
    if-eqz p1, :cond_6

    invoke-static {p1}, Landroid/nfc/tech/IsoDep;->get(Landroid/nfc/Tag;)Landroid/nfc/tech/IsoDep;

    move-result-object p1

    if-eqz p1, :cond_5

    sget-object v1, Le2/B;->b:Ll2/c;

    invoke-static {v1}, Le2/v;->a(LO1/i;)Lj2/e;

    move-result-object v1

    new-instance v2, LB2/q;

    invoke-direct {v2, p0, p1, v0}, LB2/q;-><init>(Lxyz/happify/ckemv/MainActivity;Landroid/nfc/tech/IsoDep;LO1/d;)V

    const/4 p1, 0x3

    const/4 v0, 0x0

    invoke-static {v1, v0, v2, p1}, Le2/v;->k(Le2/t;ILW1/p;I)Le2/f0;

    goto :goto_4

    :cond_5
    new-instance p1, LB2/c;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_4

    :cond_6
    new-instance p1, LB2/c;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_7
    :goto_4
    return-void
.end method

.method public final onPause()V
    .locals 1

    invoke-super {p0}, Lf/g;->onPause()V

    iget-object v0, p0, Lxyz/happify/ckemv/MainActivity;->x:Landroid/nfc/NfcAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroid/nfc/NfcAdapter;->disableForegroundDispatch(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public final onResume()V
    .locals 5

    invoke-super {p0}, Lf/g;->onResume()V

    const-class v0, Landroid/nfc/tech/IsoDep;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [[Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.nfc.action.TECH_DISCOVERED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.nfc.action.NDEF_DISCOVERED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    :try_start_0
    const-string v3, "*/*"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addDataType(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/IntentFilter$MalformedMimeTypeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    new-instance v3, Landroid/content/IntentFilter;

    const-string v4, "android.nfc.action.TAG_DISCOVERED"

    invoke-direct {v3, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    filled-new-array {v1, v2, v3}, [Landroid/content/IntentFilter;

    move-result-object v1

    iget-object v2, p0, Lxyz/happify/ckemv/MainActivity;->x:Landroid/nfc/NfcAdapter;

    if-eqz v2, :cond_0

    iget-object v3, p0, Lxyz/happify/ckemv/MainActivity;->y:Landroid/app/PendingIntent;

    invoke-virtual {v2, p0, v3, v1, v0}, Landroid/nfc/NfcAdapter;->enableForegroundDispatch(Landroid/app/Activity;Landroid/app/PendingIntent;[Landroid/content/IntentFilter;[[Ljava/lang/String;)V

    :cond_0
    return-void
.end method
