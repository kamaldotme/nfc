.class public final Landroidx/fragment/app/j;
.super Lv0/f;
.source "SourceFile"


# instance fields
.field public final synthetic d:Lv0/f;

.field public final synthetic e:Landroidx/fragment/app/k;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/k;Landroidx/fragment/app/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/j;->e:Landroidx/fragment/app/k;

    iput-object p2, p0, Landroidx/fragment/app/j;->d:Lv0/f;

    return-void
.end method


# virtual methods
.method public final C(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/j;->d:Lv0/f;

    invoke-virtual {v0}, Lv0/f;->F()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Lv0/f;->C(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/j;->e:Landroidx/fragment/app/k;

    iget-object v0, v0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final F()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/j;->d:Lv0/f;

    invoke-virtual {v0}, Lv0/f;->F()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/j;->e:Landroidx/fragment/app/k;

    iget-boolean v0, v0, Landroidx/fragment/app/k;->g0:Z

    if-eqz v0, :cond_0

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
