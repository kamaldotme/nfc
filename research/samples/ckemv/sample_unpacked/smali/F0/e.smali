.class public final LF0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK/B;


# instance fields
.field public b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILA1/i;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LF0/e;->b:I

    .line 4
    filled-new-array {p2}, [LA1/i;

    move-result-object p1

    iput-object p1, p0, LF0/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LF0/e;->b:I

    iput-object p2, p0, LF0/e;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LA1/i;LA1/i;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3e

    .line 6
    iput v0, p0, LF0/e;->b:I

    .line 7
    filled-new-array {p1, p2}, [LA1/i;

    move-result-object p1

    iput-object p1, p0, LF0/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x0

    .line 9
    invoke-static {p1, v0}, Lf/f;->i(Landroid/content/Context;I)I

    move-result v0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v1, Lf/b;

    new-instance v2, Landroid/view/ContextThemeWrapper;

    .line 12
    invoke-static {p1, v0}, Lf/f;->i(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v2, p1, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v1, v2}, Lf/b;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v1, p0, LF0/e;->c:Ljava/lang/Object;

    .line 13
    iput v0, p0, LF0/e;->b:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/e;->c:Ljava/lang/Object;

    iput p2, p0, LF0/e;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/e;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lf/f;
    .locals 10

    new-instance v0, Lf/f;

    iget-object v1, p0, LF0/e;->c:Ljava/lang/Object;

    check-cast v1, Lf/b;

    iget-object v2, v1, Lf/b;->a:Landroid/content/Context;

    iget v3, p0, LF0/e;->b:I

    invoke-direct {v0, v2, v3}, Lf/f;-><init>(Landroid/content/Context;I)V

    iget-object v2, v1, Lf/b;->e:Landroid/view/View;

    iget-object v3, v0, Lf/f;->g:Lf/e;

    if-eqz v2, :cond_0

    iput-object v2, v3, Lf/e;->o:Landroid/view/View;

    goto :goto_0

    :cond_0
    iget-object v2, v1, Lf/b;->d:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1

    iput-object v2, v3, Lf/e;->d:Ljava/lang/CharSequence;

    iget-object v4, v3, Lf/e;->m:Landroid/widget/TextView;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object v2, v1, Lf/b;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_2

    iput-object v2, v3, Lf/e;->k:Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    iput v4, v3, Lf/e;->j:I

    iget-object v5, v3, Lf/e;->l:Landroid/widget/ImageView;

    if-eqz v5, :cond_2

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v4, v3, Lf/e;->l:Landroid/widget/ImageView;

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    :goto_0
    iget-object v2, v1, Lf/b;->g:Landroid/widget/ListAdapter;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_7

    iget v2, v3, Lf/e;->s:I

    iget-object v6, v1, Lf/b;->b:Landroid/view/LayoutInflater;

    invoke-virtual {v6, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/AlertController$RecycleListView;

    iget-boolean v6, v1, Lf/b;->i:Z

    if-eqz v6, :cond_3

    iget v6, v3, Lf/e;->t:I

    goto :goto_1

    :cond_3
    iget v6, v3, Lf/e;->u:I

    :goto_1
    iget-object v7, v1, Lf/b;->g:Landroid/widget/ListAdapter;

    if-eqz v7, :cond_4

    goto :goto_2

    :cond_4
    new-instance v7, Lf/d;

    iget-object v8, v1, Lf/b;->a:Landroid/content/Context;

    const v9, 0x1020014

    invoke-direct {v7, v8, v6, v9, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    :goto_2
    iput-object v7, v3, Lf/e;->p:Landroid/widget/ListAdapter;

    iget v6, v1, Lf/b;->j:I

    iput v6, v3, Lf/e;->q:I

    iget-object v6, v1, Lf/b;->h:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v6, :cond_5

    new-instance v6, Lf/a;

    invoke-direct {v6, v1, v3}, Lf/a;-><init>(Lf/b;Lf/e;)V

    invoke-virtual {v2, v6}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :cond_5
    iget-boolean v6, v1, Lf/b;->i:Z

    if-eqz v6, :cond_6

    invoke-virtual {v2, v4}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    :cond_6
    iput-object v2, v3, Lf/e;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    :cond_7
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, v1, Lf/b;->f:Landroid/content/DialogInterface$OnKeyListener;

    if-eqz v1, :cond_8

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    :cond_8
    return-object v0
.end method

.method public b()Z
    .locals 2

    iget v0, p0, LF0/e;->b:I

    iget-object v1, p0, LF0/e;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Landroid/view/View;)Z
    .locals 1

    iget-object p1, p0, LF0/e;->c:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v0, p0, LF0/e;->b:I

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B(I)V

    const/4 p1, 0x1

    return p1
.end method
