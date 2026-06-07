.class public final LZ/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LZ/d0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:I

.field public c:I

.field public d:I

.field public e:[I

.field public f:I

.field public g:[I

.field public h:Ljava/util/List;

.field public i:Z

.field public j:Z

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI0/b;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, LI0/b;-><init>(I)V

    sput-object v0, LZ/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, LZ/d0;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LZ/d0;->c:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LZ/d0;->d:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LZ/d0;->d:I

    if-lez p2, :cond_0

    iget-object p2, p0, LZ/d0;->e:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    :cond_0
    iget p2, p0, LZ/d0;->f:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LZ/d0;->f:I

    if-lez p2, :cond_1

    iget-object p2, p0, LZ/d0;->g:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    :cond_1
    iget-boolean p2, p0, LZ/d0;->i:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, LZ/d0;->j:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, LZ/d0;->k:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, LZ/d0;->h:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    return-void
.end method
