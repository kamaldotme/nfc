.class public final Lj0/e;
.super Lj0/p;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final synthetic b:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj0/e;->b:Landroid/view/ViewGroup;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lj0/e;->a:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lj0/e;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/a;->M(Landroid/view/ViewGroup;Z)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj0/e;->a:Z

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lj0/e;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/a;->M(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public final d(Lj0/o;)V
    .locals 2

    iget-boolean v0, p0, Lj0/e;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lj0/e;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/a;->M(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, Lj0/o;->v(Lj0/n;)V

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lj0/e;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-static {v0, v1}, La/a;->M(Landroid/view/ViewGroup;Z)V

    return-void
.end method
