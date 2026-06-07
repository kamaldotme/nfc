.class public final Landroidx/fragment/app/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/z;


# instance fields
.field public final a:I

.field public final b:I

.field public final synthetic c:Landroidx/fragment/app/B;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/B;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/A;->c:Landroidx/fragment/app/B;

    iput p2, p0, Landroidx/fragment/app/A;->a:I

    const/4 p1, 0x1

    iput p1, p0, Landroidx/fragment/app/A;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/A;->c:Landroidx/fragment/app/B;

    iget-object v1, v0, Landroidx/fragment/app/B;->q:Landroidx/fragment/app/n;

    iget v2, p0, Landroidx/fragment/app/A;->a:I

    if-eqz v1, :cond_0

    if-gez v2, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/n;->g()Landroidx/fragment/app/B;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/B;->J()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v1, p0, Landroidx/fragment/app/A;->b:I

    invoke-virtual {v0, p1, p2, v2, v1}, Landroidx/fragment/app/B;->K(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result p1

    return p1
.end method
