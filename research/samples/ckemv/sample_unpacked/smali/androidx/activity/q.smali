.class public final Landroidx/activity/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:LW1/l;

.field public final synthetic b:LW1/l;

.field public final synthetic c:LW1/a;

.field public final synthetic d:LW1/a;


# direct methods
.method public constructor <init>(LW1/l;LW1/l;LW1/a;LW1/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/q;->a:LW1/l;

    iput-object p2, p0, Landroidx/activity/q;->b:LW1/l;

    iput-object p3, p0, Landroidx/activity/q;->c:LW1/a;

    iput-object p4, p0, Landroidx/activity/q;->d:LW1/a;

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/q;->d:LW1/a;

    invoke-interface {v0}, LW1/a;->d()Ljava/lang/Object;

    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/q;->c:LW1/a;

    invoke-interface {v0}, LW1/a;->d()Ljava/lang/Object;

    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/q;->b:LW1/l;

    new-instance v1, Landroidx/activity/b;

    invoke-direct {v1, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/q;->a:LW1/l;

    new-instance v1, Landroidx/activity/b;

    invoke-direct {v1, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
