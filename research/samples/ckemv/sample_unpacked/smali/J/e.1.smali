.class public final LJ/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ/d;
.implements LJ/f;


# instance fields
.field public final synthetic b:I

.field public c:Ljava/lang/Object;

.field public d:I

.field public e:I

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Cloneable;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LJ/e;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LJ/e;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, LJ/e;->b:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iget-object v0, p1, LJ/e;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/ClipData;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    iput-object v0, p0, LJ/e;->c:Ljava/lang/Object;

    .line 9
    iget v0, p1, LJ/e;->d:I

    if-ltz v0, :cond_2

    const/4 v1, 0x5

    if-gt v0, v1, :cond_1

    .line 10
    iput v0, p0, LJ/e;->d:I

    .line 11
    iget v0, p1, LJ/e;->e:I

    and-int/lit8 v1, v0, 0x1

    if-ne v1, v0, :cond_0

    iput v0, p0, LJ/e;->e:I

    .line 12
    iget-object v0, p1, LJ/e;->f:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, LJ/e;->f:Ljava/lang/Object;

    .line 13
    iget-object p1, p1, LJ/e;->g:Ljava/lang/Cloneable;

    check-cast p1, Landroid/os/Bundle;

    iput-object p1, p0, LJ/e;->g:Ljava/lang/Cloneable;

    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Requested flags 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", but only 0x"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    .line 16
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " are allowed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 18
    const-string v0, "source is out of range of [0, 5] (too high)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 20
    const-string v0, "source is out of range of [0, 5] (too low)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LJ/e;->b:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 3
    new-array v0, v0, [I

    iput-object v0, p0, LJ/e;->g:Ljava/lang/Cloneable;

    .line 4
    iput-object p1, p0, LJ/e;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, LJ/e;->g:Ljava/lang/Cloneable;

    return-void
.end method

.method public b(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, LJ/e;->f:Ljava/lang/Object;

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, LJ/e;->d:I

    return v0
.end method

.method public d()Landroid/content/ClipData;
    .locals 1

    iget-object v0, p0, LJ/e;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/ClipData;

    return-object v0
.end method

.method public e(LJ/y0;Ljava/util/List;)V
    .locals 1

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LJ/l0;

    iget-object v0, p2, LJ/l0;->a:LJ/k0;

    invoke-virtual {v0}, LJ/k0;->c()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    iget p1, p0, LJ/e;->e:I

    iget-object p2, p2, LJ/l0;->a:LJ/k0;

    invoke-virtual {p2}, LJ/k0;->b()F

    move-result p2

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, LB0/a;->c(IIF)I

    move-result p1

    int-to-float p1, p1

    iget-object p2, p0, LJ/e;->f:Ljava/lang/Object;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setTranslationY(F)V

    :cond_1
    return-void
.end method

.method public f()LJ/g;
    .locals 2

    new-instance v0, LJ/g;

    new-instance v1, LJ/e;

    invoke-direct {v1, p0}, LJ/e;-><init>(LJ/e;)V

    invoke-direct {v0, v1}, LJ/g;-><init>(LJ/f;)V

    return-object v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, LJ/e;->e:I

    return v0
.end method

.method public l()Landroid/view/ContentInfo;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public o(I)V
    .locals 0

    iput p1, p0, LJ/e;->e:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, LJ/e;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContentInfoCompat{clip="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LJ/e;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/ClipData;

    invoke-virtual {v1}, Landroid/content/ClipData;->getDescription()Landroid/content/ClipDescription;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LJ/e;->d:I

    if-eqz v1, :cond_5

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "SOURCE_PROCESS_TEXT"

    goto :goto_0

    :cond_1
    const-string v1, "SOURCE_AUTOFILL"

    goto :goto_0

    :cond_2
    const-string v1, "SOURCE_DRAG_AND_DROP"

    goto :goto_0

    :cond_3
    const-string v1, "SOURCE_INPUT_METHOD"

    goto :goto_0

    :cond_4
    const-string v1, "SOURCE_CLIPBOARD"

    goto :goto_0

    :cond_5
    const-string v1, "SOURCE_APP"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", flags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LJ/e;->e:I

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_6

    const-string v1, "FLAG_CONVERT_TO_PLAIN_TEXT"

    goto :goto_1

    :cond_6
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ""

    iget-object v2, p0, LJ/e;->f:Ljava/lang/Object;

    check-cast v2, Landroid/net/Uri;

    if-nez v2, :cond_7

    move-object v2, v1

    goto :goto_2

    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, ", hasLinkUri("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LJ/e;->g:Ljava/lang/Cloneable;

    check-cast v2, Landroid/os/Bundle;

    if-nez v2, :cond_8

    goto :goto_3

    :cond_8
    const-string v1, ", hasExtras"

    :goto_3
    const-string v2, "}"

    invoke-static {v0, v1, v2}, LX/d;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
