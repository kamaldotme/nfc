.class public final LA1/l;
.super LA1/m;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0, p1}, LA1/m;-><init>(I)V

    if-ltz p2, :cond_0

    const/16 p1, 0xa

    if-gt p2, p1, :cond_0

    if-ltz p3, :cond_0

    if-gt p3, p1, :cond_0

    iput p2, p0, LA1/l;->b:I

    iput p3, p0, LA1/l;->c:I

    return-void

    :cond_0
    invoke-static {}, Lj1/d;->a()Lj1/d;

    move-result-object p1

    throw p1
.end method
