.class public final LI0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LI0/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, LI0/b;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    invoke-direct {v0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lk/P;

    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Lk/P;->b:Z

    return-object v0

    :pswitch_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-static {v0, p1}, Lcom/google/android/material/datepicker/o;->a(II)Lcom/google/android/material/datepicker/o;

    move-result-object p1

    return-object p1

    :pswitch_2
    new-instance v0, Lcom/google/android/material/datepicker/d;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/google/android/material/datepicker/d;-><init>(J)V

    return-object v0

    :pswitch_3
    const-class v0, Lcom/google/android/material/datepicker/o;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/google/android/material/datepicker/o;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/google/android/material/datepicker/o;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/material/datepicker/o;

    const-class v0, Lcom/google/android/material/datepicker/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/material/datepicker/d;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    new-instance p1, Lcom/google/android/material/datepicker/b;

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lcom/google/android/material/datepicker/b;-><init>(Lcom/google/android/material/datepicker/o;Lcom/google/android/material/datepicker/o;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/o;I)V

    return-object p1

    :pswitch_4
    new-instance v0, Landroidx/fragment/app/F;

    invoke-direct {v0, p1}, Landroidx/fragment/app/F;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_5
    new-instance v0, Landroidx/fragment/app/C;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/fragment/app/C;->f:Ljava/lang/String;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Landroidx/fragment/app/C;->g:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Landroidx/fragment/app/C;->h:Ljava/util/ArrayList;

    sget-object v1, Landroidx/fragment/app/F;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/C;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/C;->c:Ljava/util/ArrayList;

    sget-object v1, Landroidx/fragment/app/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroidx/fragment/app/b;

    iput-object v1, v0, Landroidx/fragment/app/C;->d:[Landroidx/fragment/app/b;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Landroidx/fragment/app/C;->e:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/C;->f:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/C;->g:Ljava/util/ArrayList;

    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/C;->h:Ljava/util/ArrayList;

    sget-object v1, Landroidx/fragment/app/y;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, v0, Landroidx/fragment/app/C;->i:Ljava/util/ArrayList;

    return-object v0

    :pswitch_6
    new-instance v0, Landroidx/fragment/app/y;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/y;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, v0, Landroidx/fragment/app/y;->c:I

    return-object v0

    :pswitch_7
    new-instance v0, Landroidx/fragment/app/b;

    invoke-direct {v0, p1}, Landroidx/fragment/app/b;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_8
    const-string v0, "inParcel"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/activity/result/i;

    const-class v1, Landroid/content/IntentSender;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    check-cast v1, Landroid/content/IntentSender;

    const-class v2, Landroid/content/Intent;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Landroidx/activity/result/i;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-object v0

    :pswitch_9
    new-instance v0, Landroidx/activity/result/a;

    invoke-direct {v0, p1}, Landroidx/activity/result/a;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_a
    new-instance v0, LZ/d0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, LZ/d0;->b:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, LZ/d0;->c:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, LZ/d0;->d:I

    if-lez v1, :cond_1

    new-array v1, v1, [I

    iput-object v1, v0, LZ/d0;->e:[I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, LZ/d0;->f:I

    if-lez v1, :cond_2

    new-array v1, v1, [I

    iput-object v1, v0, LZ/d0;->g:[I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_3

    move v1, v3

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    iput-boolean v1, v0, LZ/d0;->i:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v3, :cond_4

    move v1, v3

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_2
    iput-boolean v1, v0, LZ/d0;->j:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v3, :cond_5

    move v2, v3

    :cond_5
    iput-boolean v2, v0, LZ/d0;->k:Z

    const-class v1, LZ/c0;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, v0, LZ/d0;->h:Ljava/util/List;

    return-object v0

    :pswitch_b
    new-instance v0, LZ/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, LZ/c0;->b:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, LZ/c0;->c:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_6

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    :goto_3
    iput-boolean v2, v0, LZ/c0;->e:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-lez v1, :cond_7

    new-array v1, v1, [I

    iput-object v1, v0, LZ/c0;->d:[I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_7
    return-object v0

    :pswitch_c
    new-instance v0, LZ/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, LZ/t;->b:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, LZ/t;->c:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_8
    const/4 v1, 0x0

    :goto_4
    iput-boolean v1, v0, LZ/t;->d:Z

    return-object v0

    :pswitch_d
    new-instance v0, LN/l;

    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, v0, LN/l;->b:I

    return-object v0

    :pswitch_e
    new-instance v0, LI0/c;

    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    const-class v1, LI0/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, LI0/c;->b:I

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, LI0/b;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lk/P;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lcom/google/android/material/datepicker/o;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lcom/google/android/material/datepicker/d;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lcom/google/android/material/datepicker/b;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Landroidx/fragment/app/F;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Landroidx/fragment/app/C;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Landroidx/fragment/app/y;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Landroidx/fragment/app/b;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Landroidx/activity/result/i;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Landroidx/activity/result/a;

    return-object p1

    :pswitch_a
    new-array p1, p1, [LZ/d0;

    return-object p1

    :pswitch_b
    new-array p1, p1, [LZ/c0;

    return-object p1

    :pswitch_c
    new-array p1, p1, [LZ/t;

    return-object p1

    :pswitch_d
    new-array p1, p1, [LN/l;

    return-object p1

    :pswitch_e
    new-array p1, p1, [LI0/c;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
