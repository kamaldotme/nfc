.class public final LF0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LF0/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LF0/f;->a:I

    packed-switch v0, :pswitch_data_0

    .line 13
    new-instance v0, Lv/f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lv/f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Lk/l1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lk/l1;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 15
    :pswitch_1
    new-instance v0, Lk/Y0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lk/Y0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 16
    :pswitch_2
    new-instance v0, LZ/P;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LZ/P;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 17
    :pswitch_3
    new-instance v0, LX0/E;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LX0/E;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 18
    :pswitch_4
    new-instance v0, LV0/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LV0/d;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_5
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 20
    sget-object p1, LP/b;->c:LP/a;

    return-object p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "superState must be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :pswitch_6
    new-instance v0, LO0/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LO0/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 23
    :pswitch_7
    new-instance v0, LG0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LG0/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 24
    :pswitch_8
    new-instance v0, LF0/g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LF0/g;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LF0/f;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    new-instance v0, Lv/f;

    invoke-direct {v0, p1, p2}, Lv/f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 2
    :pswitch_0
    new-instance v0, Lk/l1;

    invoke-direct {v0, p1, p2}, Lk/l1;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 3
    :pswitch_1
    new-instance v0, Lk/Y0;

    invoke-direct {v0, p1, p2}, Lk/Y0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 4
    :pswitch_2
    new-instance v0, LZ/P;

    invoke-direct {v0, p1, p2}, LZ/P;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 5
    :pswitch_3
    new-instance v0, LX0/E;

    invoke-direct {v0, p1, p2}, LX0/E;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 6
    :pswitch_4
    new-instance v0, LV0/d;

    invoke-direct {v0, p1, p2}, LV0/d;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 7
    :pswitch_5
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 8
    sget-object p1, LP/b;->c:LP/a;

    return-object p1

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "superState must be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :pswitch_6
    new-instance v0, LO0/a;

    invoke-direct {v0, p1, p2}, LO0/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 11
    :pswitch_7
    new-instance v0, LG0/b;

    invoke-direct {v0, p1, p2}, LG0/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 12
    :pswitch_8
    new-instance v0, LF0/g;

    invoke-direct {v0, p1, p2}, LF0/g;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, LF0/f;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lv/f;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lk/l1;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lk/Y0;

    return-object p1

    :pswitch_2
    new-array p1, p1, [LZ/P;

    return-object p1

    :pswitch_3
    new-array p1, p1, [LX0/E;

    return-object p1

    :pswitch_4
    new-array p1, p1, [LV0/d;

    return-object p1

    :pswitch_5
    new-array p1, p1, [LP/b;

    return-object p1

    :pswitch_6
    new-array p1, p1, [LO0/a;

    return-object p1

    :pswitch_7
    new-array p1, p1, [LG0/b;

    return-object p1

    :pswitch_8
    new-array p1, p1, [LF0/g;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
