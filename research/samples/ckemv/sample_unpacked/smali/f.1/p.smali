.class public abstract Lf/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;
    .locals 0

    invoke-static {p0}, LK/h;->c(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Object;Lf/v;)Landroid/window/OnBackInvokedCallback;
    .locals 2

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroidx/activity/o;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Landroidx/activity/o;-><init>(ILjava/lang/Object;)V

    invoke-static {p0}, LK/h;->e(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p0

    invoke-static {p0, v0}, LK/h;->g(Landroid/window/OnBackInvokedDispatcher;Landroidx/activity/o;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, LK/h;->b(Ljava/lang/Object;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    invoke-static {p0}, LK/h;->e(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p0

    invoke-static {p0, p1}, LK/h;->f(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    return-void
.end method
