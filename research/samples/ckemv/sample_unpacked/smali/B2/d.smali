.class public final synthetic LB2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lxyz/happify/ckemv/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lxyz/happify/ckemv/MainActivity;I)V
    .locals 0

    iput p2, p0, LB2/d;->a:I

    iput-object p1, p0, LB2/d;->b:Lxyz/happify/ckemv/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 5

    const/4 p1, 0x1

    const-string v0, "this$0"

    iget-object v1, p0, LB2/d;->b:Lxyz/happify/ckemv/MainActivity;

    iget v2, p0, LB2/d;->a:I

    packed-switch v2, :pswitch_data_0

    sget v2, Lxyz/happify/ckemv/MainActivity;->F:I

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LI1/x;

    invoke-direct {v0}, LI1/x;-><init>()V

    const-string v2, "QR_CODE"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v0, LI1/x;->b:Ljava/util/List;

    iget-object v2, v0, LI1/x;->a:Ljava/util/HashMap;

    const-string v3, "PROMPT_MESSAGE"

    const-string v4, "Scan Collector API Key"

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "SCAN_CAMERA_ID"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v4, "BEEP_ENABLED"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v4, "BARCODE_IMAGE_ENABLED"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "SCAN_ORIENTATION_LOCKED"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v1, Lxyz/happify/ckemv/MainActivity;->E:Landroidx/activity/result/c;

    invoke-virtual {v1, v0}, Landroidx/activity/result/c;->Q(Ljava/lang/Object;)V

    return p1

    :pswitch_0
    sget v2, Lxyz/happify/ckemv/MainActivity;->F:I

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/widget/EditText;

    invoke-direct {v0, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const-string v2, "Paste API Key here..."

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const v2, -0x777778

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    const-string v2, "#1E1E1E"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    const/16 v2, 0x20

    invoke-virtual {v0, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    iget-object v2, v1, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LB2/a;->i()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v2, Landroid/app/AlertDialog$Builder;

    const v4, 0x10302d1

    invoke-direct {v2, v1, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    const-string v4, "Manual Key Update"

    invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    new-instance v4, LB2/e;

    invoke-direct {v4, v0, v1}, LB2/e;-><init>(Landroid/widget/EditText;Lxyz/happify/ckemv/MainActivity;)V

    const-string v0, "UPDATE"

    invoke-virtual {v2, v0, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "CANCEL"

    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return p1

    :cond_1
    const-string p1, "dbHelper"

    invoke-static {p1}, LX1/g;->h(Ljava/lang/String;)V

    throw v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
