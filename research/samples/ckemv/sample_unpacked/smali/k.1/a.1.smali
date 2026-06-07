.class public final Lk/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ/c0;


# instance fields
.field public b:Z

.field public c:I

.field public final synthetic d:Landroidx/appcompat/widget/ActionBarContextView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionBarContextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/a;->d:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lk/a;->b:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Lk/a;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lk/a;->d:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/ActionBarContextView;->g:LJ/b0;

    iget v1, p0, Lk/a;->c:I

    invoke-static {v0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->b(Landroidx/appcompat/widget/ActionBarContextView;I)V

    return-void
.end method

.method public final e(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lk/a;->b:Z

    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lk/a;->d:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Landroidx/appcompat/widget/ActionBarContextView;->a(Landroidx/appcompat/widget/ActionBarContextView;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk/a;->b:Z

    return-void
.end method
