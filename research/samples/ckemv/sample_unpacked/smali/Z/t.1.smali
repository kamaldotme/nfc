.class public final LZ/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LZ/t;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:I

.field public c:I

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI0/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, LI0/b;-><init>(I)V

    sput-object v0, LZ/t;->CREATOR:Landroid/os/Parcelable$Creator;

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

    iget p2, p0, LZ/t;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, LZ/t;->c:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, LZ/t;->d:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
