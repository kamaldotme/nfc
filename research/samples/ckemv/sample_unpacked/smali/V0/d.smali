.class public final LV0/d;
.super LP/b;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LV0/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF0/f;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, LF0/f;-><init>(I)V

    sput-object v0, LV0/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LP/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, LV0/d;->d:I

    return-void
.end method

.method public constructor <init>(Landroid/view/AbsSavedState;Lcom/google/android/material/sidesheet/SideSheetBehavior;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LP/b;-><init>(Landroid/os/Parcelable;)V

    .line 4
    iget p1, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 5
    iput p1, p0, LV0/d;->d:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, LP/b;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, LV0/d;->d:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
