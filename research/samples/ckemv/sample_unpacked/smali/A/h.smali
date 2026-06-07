.class public LA/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK/B;
.implements LG0/a;
.implements LI1/a;
.implements LJ/d;
.implements LJ/f;
.implements LX/f;
.implements Landroidx/emoji2/text/i;
.implements LF/c;
.implements Ld1/p;


# instance fields
.field public final synthetic b:I

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, LA/h;->b:I

    sparse-switch p1, :sswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 29
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LA/h;->c:Ljava/lang/Object;

    return-void

    .line 31
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, LA/h;->c:Ljava/lang/Object;

    .line 33
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-void

    .line 34
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    sget-object p1, LD1/a;->e:LD1/a;

    iput-object p1, p0, LA/h;->c:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0x9 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA/h;->b:I

    iput-object p2, p0, LA/h;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, LA/h;->b:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {p1, p2}, LF0/a;->e(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, LA/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, LA/h;->b:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LA/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, LA/h;->b:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    invoke-static {p1}, LF0/a;->g(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, LA/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const/16 v0, 0xb

    iput v0, p0, LA/h;->b:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 4
    new-instance v0, LJ/v;

    const/16 v1, 0xa

    .line 5
    invoke-direct {v0, v1, p1}, LA/h;-><init>(ILjava/lang/Object;)V

    .line 6
    iput-object p1, v0, LJ/v;->d:Landroid/view/View;

    .line 7
    iput-object v0, p0, LA/h;->c:Ljava/lang/Object;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, LA/h;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p1}, LA/h;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LA/h;->c:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 3

    const/16 v0, 0xb

    iput v0, p0, LA/h;->b:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, LJ/v;

    const/4 v1, 0x0

    const/16 v2, 0xa

    .line 11
    invoke-direct {v0, v2, v1}, LA/h;-><init>(ILjava/lang/Object;)V

    .line 12
    iput-object p1, v0, LJ/v;->e:Landroid/view/WindowInsetsController;

    .line 13
    iput-object v0, p0, LA/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, LA/h;->b:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const-string v0, "editText cannot be null"

    invoke-static {p1, v0}, Lm0/z;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v0, Lv0/c;

    invoke-direct {v0, p1}, Lv0/c;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, LA/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, LA/h;->b:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, "textView cannot be null"

    invoke-static {p1, v0}, Lm0/z;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v0, LS/g;

    invoke-direct {v0, p1}, LS/g;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LA/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, LA/h;->b:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    check-cast p1, Landroid/view/inputmethod/InputContentInfo;

    iput-object p1, p0, LA/h;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LF0/a;->l(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    return-void
.end method

.method public b(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LF0/a;->k(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    return-void
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, LF0/a;->m(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public d()Landroid/content/ClipData;
    .locals 1

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, LF0/a;->d(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/view/View;)Z
    .locals 4

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-virtual {v0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->r(Landroid/view/View;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, LJ/C;->d(Landroid/view/View;)I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    move v2, v3

    :cond_0
    iget v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->d:I

    if-nez v0, :cond_1

    if-nez v2, :cond_2

    :cond_1
    if-ne v0, v3, :cond_3

    if-nez v2, :cond_3

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    neg-int v0, v0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return v3

    :cond_4
    return v2
.end method

.method public f()LJ/g;
    .locals 3

    new-instance v0, LJ/g;

    new-instance v1, LA/h;

    iget-object v2, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v2, Landroid/view/ContentInfo$Builder;

    invoke-static {v2}, LF0/a;->f(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    move-result-object v2

    invoke-direct {v1, v2}, LA/h;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, LJ/g;-><init>(LJ/f;)V

    return-object v0
.end method

.method public g()Ljava/lang/Object;
    .locals 6

    iget v0, p0, LA/h;->b:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "\' with no args"

    const-string v1, "Failed to invoke constructor \'"

    iget-object v2, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/reflect/Constructor;

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lg1/c;->a:Lm0/z;

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v3

    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lg1/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :catch_2
    move-exception v3

    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lg1/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :pswitch_0
    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    :try_start_1
    sget-object v1, Ld1/x;->a:Ld1/x;

    invoke-virtual {v1, v0}, Ld1/x;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    return-object v0

    :catch_3
    move-exception v1

    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unable to create instance of "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    nop

    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public h()V
    .locals 1

    iget v0, p0, LA/h;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/T;

    invoke-virtual {v0}, Landroidx/fragment/app/T;->a()V

    return-void

    :pswitch_0
    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_0
    .end packed-switch
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, LF0/a;->b(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public j(Lm0/z;)V
    .locals 9

    new-instance v7, Landroidx/emoji2/text/a;

    const-string v0, "EmojiCompatInitializer"

    invoke-direct {v7, v0}, Landroidx/emoji2/text/a;-><init>(Ljava/lang/String;)V

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    const-wide/16 v3, 0xf

    const/4 v1, 0x0

    const/4 v2, 0x1

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    new-instance v0, Landroidx/emoji2/text/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v8, v1}, Landroidx/emoji2/text/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public k(Ljava/util/List;)V
    .locals 0

    return-void
.end method

.method public l()Landroid/view/ContentInfo;
    .locals 1

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    return-object v0
.end method

.method public m(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    :goto_0
    iget-object p2, p0, LA/h;->c:Ljava/lang/Object;

    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void
.end method

.method public n(LI1/b;)V
    .locals 3

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, LI1/l;

    iget-object v0, v0, LI1/l;->b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    iget-object v0, v0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->b:Lcom/journeyapps/barcodescanner/BarcodeView;

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/BarcodeView;->c()V

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, LI1/l;

    iget-object v0, v0, LI1/l;->i:LA1/h;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, LA1/h;->a:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LA1/h;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, LI1/l;

    iget-object v0, v0, LI1/l;->j:Landroid/os/Handler;

    new-instance v1, LI1/k;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, p1}, LI1/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public o(I)V
    .locals 1

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LF0/a;->j(Landroid/view/ContentInfo$Builder;I)V

    return-void
.end method

.method public varargs p([Lb0/a;)V
    .locals 6

    const-string v0, "migrations"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    iget v3, v2, Lb0/a;->a:I

    iget-object v4, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/LinkedHashMap;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_0

    new-instance v5, Ljava/util/TreeMap;

    invoke-direct {v5}, Ljava/util/TreeMap;-><init>()V

    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v5, Ljava/util/TreeMap;

    iget v3, v2, Lb0/a;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->g:Landroidx/fragment/app/B;

    invoke-virtual {v0}, Landroidx/fragment/app/B;->I()V

    return-void
.end method

.method public r()V
    .locals 3

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, LI1/p;

    iget-object v0, v0, LI1/p;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v1, LI1/p;

    iget-boolean v2, v1, LI1/p;->g:Z

    if-eqz v2, :cond_0

    iget-object v1, v1, LI1/p;->c:Landroid/os/Handler;

    const v2, 0x7f0801ca

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public s()V
    .locals 1

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->requestPermission()V

    return-void
.end method

.method public t()V
    .locals 3

    iget-object v0, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->onCheckIsTextEditor()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-object v1, v0

    :goto_1
    if-nez v1, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/view/View;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, LB2/u;

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, LB2/u;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_4
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, LA/h;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContentInfoCompat{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LA/h;->c:Ljava/lang/Object;

    check-cast v1, Landroid/view/ContentInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method
