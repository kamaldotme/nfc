.class public final LX0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LX0/p;Lv0/m;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, LX0/o;->c:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, LX0/o;->d:Ljava/lang/Object;

    .line 6
    iget-object p1, p2, Lv0/m;->d:Ljava/lang/Object;

    check-cast p1, Landroid/content/res/TypedArray;

    const/16 p2, 0x1c

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 7
    iput p2, p0, LX0/o;->a:I

    const/16 p2, 0x34

    .line 8
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 9
    iput p1, p0, LX0/o;->b:I

    return-void
.end method

.method public constructor <init>(Lm2/n;I[BI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LX0/o;->c:Ljava/lang/Object;

    iput p2, p0, LX0/o;->a:I

    iput-object p3, p0, LX0/o;->d:Ljava/lang/Object;

    iput p4, p0, LX0/o;->b:I

    return-void
.end method
