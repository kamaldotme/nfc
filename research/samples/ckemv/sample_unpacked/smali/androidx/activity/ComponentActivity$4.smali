.class Landroidx/activity/ComponentActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final synthetic b:Landroidx/activity/k;


# direct methods
.method public constructor <init>(Lf/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/ComponentActivity$4;->b:Landroidx/activity/k;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V
    .locals 0

    iget-object p1, p0, Landroidx/activity/ComponentActivity$4;->b:Landroidx/activity/k;

    iget-object p2, p1, Landroidx/activity/k;->g:Landroidx/lifecycle/O;

    if-nez p2, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/activity/i;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/activity/i;->a:Landroidx/lifecycle/O;

    iput-object p2, p1, Landroidx/activity/k;->g:Landroidx/lifecycle/O;

    :cond_0
    iget-object p2, p1, Landroidx/activity/k;->g:Landroidx/lifecycle/O;

    if-nez p2, :cond_1

    new-instance p2, Landroidx/lifecycle/O;

    invoke-direct {p2}, Landroidx/lifecycle/O;-><init>()V

    iput-object p2, p1, Landroidx/activity/k;->g:Landroidx/lifecycle/O;

    :cond_1
    iget-object p1, p1, Landroidx/activity/k;->e:Landroidx/lifecycle/t;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/t;->f(Landroidx/lifecycle/q;)V

    return-void
.end method
