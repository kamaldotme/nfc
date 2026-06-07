.class public final Landroidx/fragment/app/e;
.super LA1/f;
.source "SourceFile"


# instance fields
.field public c:Z

.field public d:Z

.field public e:Lv0/l;


# virtual methods
.method public final l(Landroid/content/Context;)Lv0/l;
    .locals 4

    iget-boolean v0, p0, Landroidx/fragment/app/e;->d:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/e;->e:Lv0/l;

    return-object p1

    :cond_0
    iget-object v0, p0, LA1/f;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/T;

    iget-object v1, v0, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    iget v0, v0, Landroidx/fragment/app/T;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v0, v2, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-boolean v2, p0, Landroidx/fragment/app/e;->c:Z

    invoke-static {p1, v1, v0, v2}, Lu2/l;->A(Landroid/content/Context;Landroidx/fragment/app/n;ZZ)Lv0/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/e;->e:Lv0/l;

    iput-boolean v3, p0, Landroidx/fragment/app/e;->d:Z

    return-object p1
.end method
