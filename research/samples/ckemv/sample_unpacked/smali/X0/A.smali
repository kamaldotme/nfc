.class public final LX0/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 0

    iput p2, p0, LX0/A;->b:I

    iput-object p1, p0, LX0/A;->c:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method private final b(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method private final c(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method private final d(IIILjava/lang/CharSequence;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    iget v0, p0, LX0/A;->b:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, LX0/A;->c:Landroid/view/ViewGroup;

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-boolean v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Z

    xor-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->u(ZZ)V

    iget-boolean v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->l:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->n(Landroid/text/Editable;)V

    :cond_0
    iget-boolean v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->t:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->v(Landroid/text/Editable;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget p1, p0, LX0/A;->b:I

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    iget p2, p0, LX0/A;->b:I

    packed-switch p2, :pswitch_data_0

    iget-object p2, p0, LX0/A;->c:Landroid/view/ViewGroup;

    check-cast p2, Landroidx/appcompat/widget/SearchView;

    iget-object p3, p2, Landroidx/appcompat/widget/SearchView;->q:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p3

    iput-object p3, p2, Landroidx/appcompat/widget/SearchView;->W:Ljava/lang/CharSequence;

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    xor-int/lit8 p4, p3, 0x1

    invoke-virtual {p2, p4}, Landroidx/appcompat/widget/SearchView;->x(Z)V

    iget-boolean p4, p2, Landroidx/appcompat/widget/SearchView;->V:Z

    const/16 v0, 0x8

    if-eqz p4, :cond_0

    iget-boolean p4, p2, Landroidx/appcompat/widget/SearchView;->O:Z

    if-nez p4, :cond_0

    if-eqz p3, :cond_0

    iget-object p3, p2, Landroidx/appcompat/widget/SearchView;->v:Landroid/widget/ImageView;

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v0, 0x0

    :cond_0
    iget-object p3, p2, Landroidx/appcompat/widget/SearchView;->x:Landroid/widget/ImageView;

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p2}, Landroidx/appcompat/widget/SearchView;->t()V

    invoke-virtual {p2}, Landroidx/appcompat/widget/SearchView;->w()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :pswitch_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
