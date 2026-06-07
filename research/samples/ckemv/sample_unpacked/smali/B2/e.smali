.class public final synthetic LB2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Lxyz/happify/ckemv/MainActivity;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Lxyz/happify/ckemv/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB2/e;->b:Landroid/widget/EditText;

    iput-object p2, p0, LB2/e;->c:Lxyz/happify/ckemv/MainActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    sget p1, Lxyz/happify/ckemv/MainActivity;->F:I

    iget-object p1, p0, LB2/e;->b:Landroid/widget/EditText;

    const-string p2, "$input"

    invoke-static {p1, p2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LB2/e;->c:Lxyz/happify/ckemv/MainActivity;

    const-string v0, "this$0"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ld2/d;->n0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-object p2, p2, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "api_key"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "id = 1"

    const-string v2, "stats"

    invoke-virtual {p2, v2, v1, p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string p1, "dbHelper"

    invoke-static {p1}, LX1/g;->h(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method
