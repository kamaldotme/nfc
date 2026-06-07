.class public final Landroidx/emoji2/text/e;
.super Lm0/z;
.source "SourceFile"


# instance fields
.field public final synthetic d:Landroidx/emoji2/text/f;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/e;->d:Landroidx/emoji2/text/f;

    return-void
.end method


# virtual methods
.method public final T(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/e;->d:Landroidx/emoji2/text/f;

    iget-object v0, v0, Landroidx/emoji2/text/f;->a:Landroidx/emoji2/text/j;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/j;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final U(Lv0/i;)V
    .locals 4

    iget-object v0, p0, Landroidx/emoji2/text/e;->d:Landroidx/emoji2/text/f;

    iput-object p1, v0, Landroidx/emoji2/text/f;->c:Lv0/i;

    new-instance p1, Lv0/m;

    iget-object v1, v0, Landroidx/emoji2/text/f;->c:Lv0/i;

    new-instance v2, LU0/e;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, LU0/e;-><init>(I)V

    iget-object v3, v0, Landroidx/emoji2/text/f;->a:Landroidx/emoji2/text/j;

    iget-object v3, v3, Landroidx/emoji2/text/j;->h:Landroidx/emoji2/text/d;

    invoke-direct {p1, v1, v2, v3}, Lv0/m;-><init>(Lv0/i;LU0/e;Landroidx/emoji2/text/d;)V

    iput-object p1, v0, Landroidx/emoji2/text/f;->b:Lv0/m;

    iget-object p1, v0, Landroidx/emoji2/text/f;->a:Landroidx/emoji2/text/j;

    invoke-virtual {p1}, Landroidx/emoji2/text/j;->e()V

    return-void
.end method
