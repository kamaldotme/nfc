.class public final Lc0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc0/c;->b:I

    iput p2, p0, Lc0/c;->c:I

    iput-object p3, p0, Lc0/c;->d:Ljava/lang/String;

    iput-object p4, p0, Lc0/c;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lc0/c;

    const-string v0, "other"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lc0/c;->b:I

    iget v1, p1, Lc0/c;->b:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lc0/c;->c:I

    iget p1, p1, Lc0/c;->c:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method
