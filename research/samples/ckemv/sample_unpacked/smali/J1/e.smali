.class public final synthetic LJ1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LJ1/e;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ1/e;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, LJ1/e;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 2
    iput p3, p0, LJ1/e;->b:I

    iput-object p1, p0, LJ1/e;->d:Ljava/lang/Object;

    iput-boolean p2, p0, LJ1/e;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/4 v0, 0x0

    iget-boolean v1, p0, LJ1/e;->c:Z

    iget-object v2, p0, LJ1/e;->d:Ljava/lang/Object;

    iget v3, p0, LJ1/e;->b:I

    packed-switch v3, :pswitch_data_0

    check-cast v2, Lf/s;

    iget-object v2, v2, Lf/s;->b:Ljava/lang/Object;

    check-cast v2, Ln1/f;

    iput-boolean v1, v2, Ln1/f;->f:Z

    iget-boolean v1, v2, Ln1/f;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, v2, Ln1/f;->d:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-boolean v0, v2, Ln1/f;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, v2, Ln1/f;->d:Landroid/os/Handler;

    iget-object v1, v2, Ln1/f;->e:Ljava/lang/Runnable;

    const-wide/32 v2, 0x493e0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void

    :pswitch_0
    check-cast v2, Ln1/a;

    iget-object v0, v2, Ln1/a;->a:LJ1/i;

    invoke-virtual {v0, v1}, LJ1/i;->d(Z)V

    return-void

    :pswitch_1
    check-cast v2, Landroid/view/View;

    if-eqz v1, :cond_4

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v1, v3, :cond_1

    invoke-static {v2}, LJ/N;->c(Landroid/view/View;)LJ/B0;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    :goto_0
    instance-of v3, v1, Landroid/content/ContextWrapper;

    if-eqz v3, :cond_3

    instance-of v3, v1, Landroid/app/Activity;

    if-eqz v3, :cond_2

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v0, LJ/B0;

    invoke-direct {v0, v1, v2}, LJ/B0;-><init>(Landroid/view/Window;Landroid/view/View;)V

    goto :goto_1

    :cond_2
    check-cast v1, Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    iget-object v0, v0, LJ/B0;->a:Lm0/z;

    invoke-virtual {v0}, Lm0/z;->i0()V

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-static {v0, v1}, Ly/d;->b(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :goto_2
    return-void

    :pswitch_2
    check-cast v2, LJ1/g;

    iget-object v0, v2, LJ1/g;->c:LJ1/i;

    invoke-virtual {v0, v1}, LJ1/i;->d(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
