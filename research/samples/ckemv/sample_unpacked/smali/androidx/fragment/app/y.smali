.class public final Landroidx/fragment/app/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/y;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:Ljava/lang/String;

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI0/b;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, LI0/b;-><init>(I)V

    sput-object v0, Landroidx/fragment/app/y;->CREATOR:Landroid/os/Parcelable$Creator;

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

    iget-object p2, p0, Landroidx/fragment/app/y;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Landroidx/fragment/app/y;->c:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
