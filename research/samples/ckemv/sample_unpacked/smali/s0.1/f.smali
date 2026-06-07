.class public final Ls0/f;
.super Ls0/e;
.source "SourceFile"


# instance fields
.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "NetworkMeteredCtrlr"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tagWithPrefix(\"NetworkMeteredCtrlr\")"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lt0/e;)V
    .locals 1

    const-string v0, "tracker"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ls0/e;-><init>(Lt0/e;)V

    const/4 p1, 0x7

    iput p1, p0, Ls0/f;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Ls0/f;->b:I

    return v0
.end method

.method public final b(Lv0/o;)Z
    .locals 1

    iget-object p1, p1, Lv0/o;->j:Lm0/d;

    iget p1, p1, Lm0/d;->a:I

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Lr0/d;

    const-string v0, "value"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Lr0/d;->a:Z

    if-eqz v0, :cond_1

    iget-boolean p1, p1, Lr0/d;->c:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
