.class public final LR0/a;
.super Lv0/f;
.source "SourceFile"


# instance fields
.field public final d:Landroid/graphics/Typeface;

.field public final e:LA/h;

.field public f:Z


# direct methods
.method public constructor <init>(LA/h;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LR0/a;->d:Landroid/graphics/Typeface;

    iput-object p1, p0, LR0/a;->e:LA/h;

    return-void
.end method


# virtual methods
.method public final D(I)V
    .locals 1

    iget-boolean p1, p0, LR0/a;->f:Z

    if-nez p1, :cond_0

    iget-object p1, p0, LR0/a;->e:LA/h;

    iget-object p1, p1, LA/h;->c:Ljava/lang/Object;

    check-cast p1, LO0/b;

    iget-object v0, p0, LR0/a;->d:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, LO0/b;->j(Landroid/graphics/Typeface;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LO0/b;->h(Z)V

    :cond_0
    return-void
.end method

.method public final E(Landroid/graphics/Typeface;Z)V
    .locals 0

    iget-boolean p2, p0, LR0/a;->f:Z

    if-nez p2, :cond_0

    iget-object p2, p0, LR0/a;->e:LA/h;

    iget-object p2, p2, LA/h;->c:Ljava/lang/Object;

    check-cast p2, LO0/b;

    invoke-virtual {p2, p1}, LO0/b;->j(Landroid/graphics/Typeface;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, LO0/b;->h(Z)V

    :cond_0
    return-void
.end method
