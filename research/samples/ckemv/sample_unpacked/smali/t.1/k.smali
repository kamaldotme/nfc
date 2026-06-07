.class public final Lt/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:[I

.field public static final e:Landroid/util/SparseIntArray;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Z

.field public final c:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/16 v2, 0x8

    filled-new-array {v0, v1, v2}, [I

    move-result-object v3

    sput-object v3, Lt/k;->d:[I

    new-instance v3, Landroid/util/SparseIntArray;

    invoke-direct {v3}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v3, Lt/k;->e:Landroid/util/SparseIntArray;

    const/16 v4, 0x4c

    const/16 v5, 0x19

    invoke-virtual {v3, v4, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0x4d

    const/16 v7, 0x1a

    invoke-virtual {v3, v6, v7}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v8, 0x4f

    const/16 v9, 0x1d

    invoke-virtual {v3, v8, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v10, 0x50

    const/16 v11, 0x1e

    invoke-virtual {v3, v10, v11}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v12, 0x56

    const/16 v13, 0x24

    invoke-virtual {v3, v12, v13}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v12, 0x55

    const/16 v13, 0x23

    invoke-virtual {v3, v12, v13}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v12, 0x3a

    invoke-virtual {v3, v12, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v13, 0x39

    const/4 v14, 0x3

    invoke-virtual {v3, v13, v14}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v15, 0x37

    const/4 v10, 0x1

    invoke-virtual {v3, v15, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0x5e

    const/4 v4, 0x6

    invoke-virtual {v3, v6, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0x5f

    const/4 v11, 0x7

    invoke-virtual {v3, v6, v11}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0x41

    const/16 v9, 0x11

    invoke-virtual {v3, v6, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v10, 0x12

    const/16 v8, 0x42

    invoke-virtual {v3, v8, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v10, 0x43

    const/16 v8, 0x13

    invoke-virtual {v3, v10, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v8, 0x1b

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x51

    const/16 v8, 0x20

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x21

    const/16 v8, 0x52

    invoke-virtual {v3, v8, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x40

    const/16 v10, 0xa

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3f

    const/16 v10, 0x9

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x62

    const/16 v10, 0xd

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x65

    const/16 v10, 0x10

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x63

    const/16 v10, 0xe

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x60

    const/16 v10, 0xb

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x64

    const/16 v10, 0xf

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x61

    const/16 v10, 0xc

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x59

    const/16 v10, 0x28

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x4a

    const/16 v10, 0x27

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x49

    const/16 v10, 0x29

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x58

    const/16 v10, 0x2a

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x48

    const/16 v10, 0x14

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x57

    const/16 v10, 0x25

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3e

    const/4 v10, 0x5

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x4b

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x54

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x4e

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x38

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x36

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v0, 0x5

    const/16 v8, 0x18

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1c

    invoke-virtual {v3, v11, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x17

    const/16 v8, 0x1f

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x18

    invoke-virtual {v3, v0, v2}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x22

    invoke-virtual {v3, v4, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v0, 0x2

    invoke-virtual {v3, v2, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x17

    invoke-virtual {v3, v14, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x15

    invoke-virtual {v3, v1, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v0, 0x2

    const/16 v1, 0x16

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0xd

    const/16 v1, 0x2b

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x2c

    invoke-virtual {v3, v7, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x15

    const/16 v1, 0x2d

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x16

    const/16 v1, 0x2e

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x14

    const/16 v1, 0x3c

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x12

    const/16 v1, 0x2f

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x13

    const/16 v1, 0x30

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0xe

    const/16 v1, 0x31

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0xf

    const/16 v1, 0x32

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x10

    const/16 v1, 0x33

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x34

    invoke-virtual {v3, v9, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x35

    invoke-virtual {v3, v5, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x5a

    const/16 v1, 0x36

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x44

    invoke-virtual {v3, v0, v15}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x5b

    const/16 v1, 0x38

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x45

    invoke-virtual {v3, v0, v13}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x5c

    invoke-virtual {v3, v0, v12}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x46

    const/16 v1, 0x3b

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3b

    const/16 v1, 0x3d

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3d

    const/16 v1, 0x3e

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3c

    const/16 v1, 0x3f

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1b

    const/16 v1, 0x40

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x6a

    invoke-virtual {v3, v0, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x21

    const/16 v1, 0x42

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x6b

    const/16 v1, 0x43

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x67

    const/16 v1, 0x4f

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x26

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x66

    const/16 v1, 0x44

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x5d

    const/16 v1, 0x45

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x47

    const/16 v1, 0x46

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1f

    const/16 v1, 0x47

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x48

    const/16 v1, 0x1d

    invoke-virtual {v3, v1, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x49

    const/16 v1, 0x1e

    invoke-virtual {v3, v1, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x20

    const/16 v1, 0x4a

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1c

    const/16 v1, 0x4b

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x68

    const/16 v1, 0x4c

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x53

    const/16 v1, 0x4d

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x6c

    const/16 v1, 0x4e

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x35

    const/16 v1, 0x50

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x34

    const/16 v1, 0x51

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lt/k;->a:Ljava/util/HashMap;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt/k;->b:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lt/k;->c:Ljava/util/HashMap;

    return-void
.end method

.method public static c(Landroidx/constraintlayout/widget/Barrier;Ljava/lang/String;)[I
    .locals 10

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    array-length v1, p1

    new-array v1, v1, [I

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    array-length v5, p1

    if-ge v3, v5, :cond_3

    aget-object v5, p1, v3

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    :try_start_0
    const-class v7, Lt/n;

    invoke-virtual {v7, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move v7, v2

    :goto_1
    if-nez v7, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const-string v8, "id"

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v5, v8, v9}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    :cond_0
    if-nez v7, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    instance-of v8, v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v8, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v9, v5, Ljava/lang/String;

    if-eqz v9, :cond_1

    iget-object v9, v8, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    if-eqz v9, :cond_1

    invoke-virtual {v9, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    iget-object v6, v8, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :cond_1
    if-eqz v6, :cond_2

    instance-of v5, v6, Ljava/lang/Integer;

    if-eqz v5, :cond_2

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :cond_2
    add-int/lit8 v5, v4, 0x1

    aput v7, v1, v4

    add-int/lit8 v3, v3, 0x1

    move v4, v5

    goto :goto_0

    :cond_3
    array-length p0, p1

    if-eq v4, p0, :cond_4

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    :cond_4
    return-object v1
.end method

.method public static d(Landroid/content/Context;Landroid/util/AttributeSet;)Lt/f;
    .locals 12

    new-instance v0, Lt/f;

    invoke-direct {v0}, Lt/f;-><init>()V

    sget-object v1, Lt/o;->a:[I

    invoke-virtual {p0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_2

    invoke-virtual {p0, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    const/4 v4, 0x1

    iget-object v5, v0, Lt/f;->b:Lt/i;

    iget-object v6, v0, Lt/f;->c:Lt/h;

    iget-object v7, v0, Lt/f;->e:Lt/j;

    iget-object v8, v0, Lt/f;->d:Lt/g;

    if-eq v3, v4, :cond_0

    const/16 v9, 0x17

    if-eq v9, v3, :cond_0

    const/16 v9, 0x18

    if-eq v9, v3, :cond_0

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    sget-object v9, Lt/k;->e:Landroid/util/SparseIntArray;

    invoke-virtual {v9, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v10

    const/high16 v11, 0x3f800000    # 1.0f

    packed-switch v10, :pswitch_data_0

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    invoke-virtual {v9, v3}, Landroid/util/SparseIntArray;->get(I)I

    goto/16 :goto_1

    :pswitch_0
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    invoke-virtual {v9, v3}, Landroid/util/SparseIntArray;->get(I)I

    goto/16 :goto_1

    :pswitch_1
    iget-boolean v4, v8, Lt/g;->h0:Z

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v8, Lt/g;->h0:Z

    goto/16 :goto_1

    :pswitch_2
    iget-boolean v4, v8, Lt/g;->g0:Z

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v8, Lt/g;->g0:Z

    goto/16 :goto_1

    :pswitch_3
    iget v4, v6, Lt/h;->c:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v6, Lt/h;->c:F

    goto/16 :goto_1

    :pswitch_4
    iget v4, v5, Lt/i;->b:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v5, Lt/i;->b:I

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {p0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v8, Lt/g;->f0:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_6
    iget v4, v6, Lt/h;->b:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v6, Lt/h;->b:I

    goto/16 :goto_1

    :pswitch_7
    iget-boolean v4, v8, Lt/g;->i0:Z

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v8, Lt/g;->i0:Z

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v8, Lt/g;->e0:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_9
    iget v4, v8, Lt/g;->b0:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->b0:I

    goto/16 :goto_1

    :pswitch_a
    iget v4, v8, Lt/g;->a0:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, Lt/g;->a0:I

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, v3, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, Lt/g;->Z:F

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, v3, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, Lt/g;->Y:F

    goto/16 :goto_1

    :pswitch_d
    iget v4, v5, Lt/i;->d:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v5, Lt/i;->d:F

    goto/16 :goto_1

    :pswitch_e
    iget v4, v6, Lt/h;->d:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v6, Lt/h;->d:F

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, v3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v4

    iget v4, v4, Landroid/util/TypedValue;->type:I

    const/4 v5, 0x3

    if-ne v4, v5, :cond_1

    invoke-virtual {p0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_1

    :cond_1
    sget-object v4, Lp/a;->a:[Ljava/lang/String;

    invoke-virtual {p0, v3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    aget-object v3, v4, v3

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_1

    :pswitch_11
    iget v4, v6, Lt/h;->a:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v6, Lt/h;->a:I

    goto/16 :goto_1

    :pswitch_12
    iget v4, v8, Lt/g;->y:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, Lt/g;->y:F

    goto/16 :goto_1

    :pswitch_13
    iget v4, v8, Lt/g;->x:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->x:I

    goto/16 :goto_1

    :pswitch_14
    iget v4, v8, Lt/g;->w:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->w:I

    goto/16 :goto_1

    :pswitch_15
    iget v4, v7, Lt/j;->a:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v7, Lt/j;->a:F

    goto/16 :goto_1

    :pswitch_16
    iget v4, v8, Lt/g;->X:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->X:I

    goto/16 :goto_1

    :pswitch_17
    iget v4, v8, Lt/g;->W:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->W:I

    goto/16 :goto_1

    :pswitch_18
    iget v4, v8, Lt/g;->V:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->V:I

    goto/16 :goto_1

    :pswitch_19
    iget v4, v8, Lt/g;->U:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->U:I

    goto/16 :goto_1

    :pswitch_1a
    iget v4, v8, Lt/g;->T:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, Lt/g;->T:I

    goto/16 :goto_1

    :pswitch_1b
    iget v4, v8, Lt/g;->S:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, Lt/g;->S:I

    goto/16 :goto_1

    :pswitch_1c
    iget v4, v7, Lt/j;->j:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, Lt/j;->j:F

    goto/16 :goto_1

    :pswitch_1d
    iget v4, v7, Lt/j;->i:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, Lt/j;->i:F

    goto/16 :goto_1

    :pswitch_1e
    iget v4, v7, Lt/j;->h:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, Lt/j;->h:F

    goto/16 :goto_1

    :pswitch_1f
    iget v4, v7, Lt/j;->g:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, Lt/j;->g:F

    goto/16 :goto_1

    :pswitch_20
    iget v4, v7, Lt/j;->f:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, Lt/j;->f:F

    goto/16 :goto_1

    :pswitch_21
    iget v4, v7, Lt/j;->e:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v7, Lt/j;->e:F

    goto/16 :goto_1

    :pswitch_22
    iget v4, v7, Lt/j;->d:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v7, Lt/j;->d:F

    goto/16 :goto_1

    :pswitch_23
    iget v4, v7, Lt/j;->c:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v7, Lt/j;->c:F

    goto/16 :goto_1

    :pswitch_24
    iget v4, v7, Lt/j;->b:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v7, Lt/j;->b:F

    goto/16 :goto_1

    :pswitch_25
    iput-boolean v4, v7, Lt/j;->k:Z

    iget v4, v7, Lt/j;->l:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, Lt/j;->l:F

    goto/16 :goto_1

    :pswitch_26
    iget v4, v5, Lt/i;->c:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v5, Lt/i;->c:F

    goto/16 :goto_1

    :pswitch_27
    iget v4, v8, Lt/g;->R:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, Lt/g;->R:I

    goto/16 :goto_1

    :pswitch_28
    iget v4, v8, Lt/g;->Q:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, Lt/g;->Q:I

    goto/16 :goto_1

    :pswitch_29
    iget v4, v8, Lt/g;->O:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, Lt/g;->O:F

    goto/16 :goto_1

    :pswitch_2a
    iget v4, v8, Lt/g;->P:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, Lt/g;->P:F

    goto/16 :goto_1

    :pswitch_2b
    iget v4, v0, Lt/f;->a:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, v0, Lt/f;->a:I

    goto/16 :goto_1

    :pswitch_2c
    iget v4, v8, Lt/g;->u:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, Lt/g;->u:F

    goto/16 :goto_1

    :pswitch_2d
    iget v4, v8, Lt/g;->k:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->k:I

    goto/16 :goto_1

    :pswitch_2e
    iget v4, v8, Lt/g;->l:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->l:I

    goto/16 :goto_1

    :pswitch_2f
    iget v4, v8, Lt/g;->E:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->E:I

    goto/16 :goto_1

    :pswitch_30
    iget v4, v8, Lt/g;->q:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->q:I

    goto/16 :goto_1

    :pswitch_31
    iget v4, v8, Lt/g;->p:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->p:I

    goto/16 :goto_1

    :pswitch_32
    iget v4, v8, Lt/g;->H:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->H:I

    goto/16 :goto_1

    :pswitch_33
    iget v4, v8, Lt/g;->j:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->j:I

    goto/16 :goto_1

    :pswitch_34
    iget v4, v8, Lt/g;->i:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->i:I

    goto/16 :goto_1

    :pswitch_35
    iget v4, v8, Lt/g;->D:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->D:I

    goto/16 :goto_1

    :pswitch_36
    iget v4, v8, Lt/g;->B:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, Lt/g;->B:I

    goto/16 :goto_1

    :pswitch_37
    iget v4, v8, Lt/g;->h:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->h:I

    goto/16 :goto_1

    :pswitch_38
    iget v4, v8, Lt/g;->g:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->g:I

    goto/16 :goto_1

    :pswitch_39
    iget v4, v8, Lt/g;->C:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->C:I

    goto/16 :goto_1

    :pswitch_3a
    iget v4, v8, Lt/g;->b:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v3

    iput v3, v8, Lt/g;->b:I

    goto/16 :goto_1

    :pswitch_3b
    iget v4, v5, Lt/i;->a:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    sget-object v4, Lt/k;->d:[I

    aget v3, v4, v3

    iput v3, v5, Lt/i;->a:I

    goto/16 :goto_1

    :pswitch_3c
    iget v4, v8, Lt/g;->c:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v3

    iput v3, v8, Lt/g;->c:I

    goto/16 :goto_1

    :pswitch_3d
    iget v4, v8, Lt/g;->t:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, Lt/g;->t:F

    goto/16 :goto_1

    :pswitch_3e
    iget v4, v8, Lt/g;->f:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, Lt/g;->f:F

    goto/16 :goto_1

    :pswitch_3f
    iget v4, v8, Lt/g;->e:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, v8, Lt/g;->e:I

    goto/16 :goto_1

    :pswitch_40
    iget v4, v8, Lt/g;->d:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, v8, Lt/g;->d:I

    goto/16 :goto_1

    :pswitch_41
    iget v4, v8, Lt/g;->J:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->J:I

    goto/16 :goto_1

    :pswitch_42
    iget v4, v8, Lt/g;->N:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->N:I

    goto/16 :goto_1

    :pswitch_43
    iget v4, v8, Lt/g;->K:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->K:I

    goto/16 :goto_1

    :pswitch_44
    iget v4, v8, Lt/g;->I:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->I:I

    goto/16 :goto_1

    :pswitch_45
    iget v4, v8, Lt/g;->M:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->M:I

    goto :goto_1

    :pswitch_46
    iget v4, v8, Lt/g;->L:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->L:I

    goto :goto_1

    :pswitch_47
    iget v4, v8, Lt/g;->r:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->r:I

    goto :goto_1

    :pswitch_48
    iget v4, v8, Lt/g;->s:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->s:I

    goto :goto_1

    :pswitch_49
    iget v4, v8, Lt/g;->G:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->G:I

    goto :goto_1

    :pswitch_4a
    iget v4, v8, Lt/g;->A:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, v8, Lt/g;->A:I

    goto :goto_1

    :pswitch_4b
    iget v4, v8, Lt/g;->z:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, v8, Lt/g;->z:I

    goto :goto_1

    :pswitch_4c
    invoke-virtual {p0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v8, Lt/g;->v:Ljava/lang/String;

    goto :goto_1

    :pswitch_4d
    iget v4, v8, Lt/g;->m:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->m:I

    goto :goto_1

    :pswitch_4e
    iget v4, v8, Lt/g;->n:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->n:I

    goto :goto_1

    :pswitch_4f
    iget v4, v8, Lt/g;->F:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, Lt/g;->F:I

    goto :goto_1

    :pswitch_50
    iget v4, v8, Lt/g;->o:I

    invoke-static {p0, v3, v4}, Lt/k;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, Lt/g;->o:I

    :goto_1
    :pswitch_51
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_51
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

.method public static f(Landroid/content/res/TypedArray;II)I
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    :cond_0
    return p2
.end method


# virtual methods
.method public final a(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 14

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p0, Lt/k;->c:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    const/4 v5, -0x1

    if-ge v3, v0, :cond_d

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    :try_start_0
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    goto/16 :goto_7

    :cond_0
    iget-boolean v8, p0, Lt/k;->b:Z

    if-eqz v8, :cond_2

    if-eq v7, v5, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "All children of ConstraintLayout must have ids to use ConstraintSet"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    if-ne v7, v5, :cond_3

    goto/16 :goto_7

    :cond_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lt/f;

    instance-of v9, v6, Landroidx/constraintlayout/widget/Barrier;

    if-eqz v9, :cond_4

    iget-object v9, v8, Lt/f;->d:Lt/g;

    iput v4, v9, Lt/g;->c0:I

    :cond_4
    iget-object v9, v8, Lt/f;->d:Lt/g;

    iget v9, v9, Lt/g;->c0:I

    if-eq v9, v5, :cond_7

    if-eq v9, v4, :cond_5

    goto :goto_2

    :cond_5
    move-object v4, v6

    check-cast v4, Landroidx/constraintlayout/widget/Barrier;

    invoke-virtual {v4, v7}, Landroid/view/View;->setId(I)V

    iget-object v5, v8, Lt/f;->d:Lt/g;

    iget v7, v5, Lt/g;->a0:I

    invoke-virtual {v4, v7}, Landroidx/constraintlayout/widget/Barrier;->setType(I)V

    iget v7, v5, Lt/g;->b0:I

    invoke-virtual {v4, v7}, Landroidx/constraintlayout/widget/Barrier;->setMargin(I)V

    iget-boolean v7, v5, Lt/g;->i0:Z

    invoke-virtual {v4, v7}, Landroidx/constraintlayout/widget/Barrier;->setAllowsGoneWidget(Z)V

    iget-object v7, v5, Lt/g;->d0:[I

    if-eqz v7, :cond_6

    invoke-virtual {v4, v7}, Lt/b;->setReferencedIds([I)V

    goto :goto_2

    :cond_6
    iget-object v7, v5, Lt/g;->e0:Ljava/lang/String;

    if-eqz v7, :cond_7

    invoke-static {v4, v7}, Lt/k;->c(Landroidx/constraintlayout/widget/Barrier;Ljava/lang/String;)[I

    move-result-object v7

    iput-object v7, v5, Lt/g;->d0:[I

    invoke-virtual {v4, v7}, Lt/b;->setReferencedIds([I)V

    :cond_7
    :goto_2
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Lt/d;

    invoke-virtual {v4}, Lt/d;->a()V

    invoke-virtual {v8, v4}, Lt/f;->a(Lt/d;)V

    iget-object v5, v8, Lt/f;->f:Ljava/util/HashMap;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v5, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lt/a;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "set"

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    :try_start_1
    iget v12, v11, Lt/a;->a:I

    invoke-static {v12}, Lq/h;->a(I)I

    move-result v12

    packed-switch v12, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    sget-object v12, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v7, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    iget v11, v11, Lt/a;->c:F

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :catch_0
    move-exception v10

    goto/16 :goto_4

    :catch_1
    move-exception v10

    goto/16 :goto_5

    :catch_2
    move-exception v10

    goto/16 :goto_6

    :pswitch_1
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v7, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    iget-boolean v11, v11, Lt/a;->e:Z

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :pswitch_2
    const-class v12, Ljava/lang/CharSequence;

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v7, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    iget-object v11, v11, Lt/a;->d:Ljava/lang/String;

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :pswitch_3
    const-class v12, Landroid/graphics/drawable/Drawable;

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v7, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    new-instance v12, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v12}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    iget v11, v11, Lt/a;->f:I

    invoke-virtual {v12, v11}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3

    :pswitch_4
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v7, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    iget v11, v11, Lt/a;->f:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3

    :pswitch_5
    sget-object v12, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v7, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    iget v11, v11, Lt/a;->c:F

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3

    :pswitch_6
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v7, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    iget v11, v11, Lt/a;->b:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_3

    :goto_4
    invoke-virtual {v10}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_3

    :goto_5
    invoke-virtual {v10}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_3

    :goto_6
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    goto/16 :goto_3

    :cond_8
    invoke-virtual {v6, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v4, v8, Lt/f;->b:Lt/i;

    iget v5, v4, Lt/i;->b:I

    if-nez v5, :cond_9

    iget v5, v4, Lt/i;->a:I

    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    iget v4, v4, Lt/i;->c:F

    invoke-virtual {v6, v4}, Landroid/view/View;->setAlpha(F)V

    iget-object v4, v8, Lt/f;->e:Lt/j;

    iget v5, v4, Lt/j;->a:F

    invoke-virtual {v6, v5}, Landroid/view/View;->setRotation(F)V

    iget v5, v4, Lt/j;->b:F

    invoke-virtual {v6, v5}, Landroid/view/View;->setRotationX(F)V

    iget v5, v4, Lt/j;->c:F

    invoke-virtual {v6, v5}, Landroid/view/View;->setRotationY(F)V

    iget v5, v4, Lt/j;->d:F

    invoke-virtual {v6, v5}, Landroid/view/View;->setScaleX(F)V

    iget v5, v4, Lt/j;->e:F

    invoke-virtual {v6, v5}, Landroid/view/View;->setScaleY(F)V

    iget v5, v4, Lt/j;->f:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_a

    iget v5, v4, Lt/j;->f:F

    invoke-virtual {v6, v5}, Landroid/view/View;->setPivotX(F)V

    :cond_a
    iget v5, v4, Lt/j;->g:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_b

    iget v5, v4, Lt/j;->g:F

    invoke-virtual {v6, v5}, Landroid/view/View;->setPivotY(F)V

    :cond_b
    iget v5, v4, Lt/j;->h:F

    invoke-virtual {v6, v5}, Landroid/view/View;->setTranslationX(F)V

    iget v5, v4, Lt/j;->i:F

    invoke-virtual {v6, v5}, Landroid/view/View;->setTranslationY(F)V

    iget v5, v4, Lt/j;->j:F

    invoke-virtual {v6, v5}, Landroid/view/View;->setTranslationZ(F)V

    iget-boolean v5, v4, Lt/j;->k:Z

    if-eqz v5, :cond_c

    iget v4, v4, Lt/j;->l:F

    invoke-virtual {v6, v4}, Landroid/view/View;->setElevation(F)V

    :catch_3
    :cond_c
    :goto_7
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_d
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_e
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt/f;

    iget-object v6, v3, Lt/f;->d:Lt/g;

    iget v7, v6, Lt/g;->c0:I

    if-eq v7, v5, :cond_12

    if-eq v7, v4, :cond_f

    goto :goto_a

    :cond_f
    new-instance v7, Landroidx/constraintlayout/widget/Barrier;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, v8}, Landroidx/constraintlayout/widget/Barrier;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/view/View;->setId(I)V

    iget-object v8, v6, Lt/g;->d0:[I

    if-eqz v8, :cond_10

    invoke-virtual {v7, v8}, Lt/b;->setReferencedIds([I)V

    goto :goto_9

    :cond_10
    iget-object v8, v6, Lt/g;->e0:Ljava/lang/String;

    if-eqz v8, :cond_11

    invoke-static {v7, v8}, Lt/k;->c(Landroidx/constraintlayout/widget/Barrier;Ljava/lang/String;)[I

    move-result-object v8

    iput-object v8, v6, Lt/g;->d0:[I

    invoke-virtual {v7, v8}, Lt/b;->setReferencedIds([I)V

    :cond_11
    :goto_9
    iget v8, v6, Lt/g;->a0:I

    invoke-virtual {v7, v8}, Landroidx/constraintlayout/widget/Barrier;->setType(I)V

    iget v8, v6, Lt/g;->b0:I

    invoke-virtual {v7, v8}, Landroidx/constraintlayout/widget/Barrier;->setMargin(I)V

    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->a()Lt/d;

    move-result-object v8

    invoke-virtual {v7}, Lt/b;->g()V

    invoke-virtual {v3, v8}, Lt/f;->a(Lt/d;)V

    invoke-virtual {p1, v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_12
    :goto_a
    iget-boolean v6, v6, Lt/g;->a:Z

    if-eqz v6, :cond_e

    new-instance v6, Lt/m;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v6, v7}, Lt/m;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v6, v1}, Landroid/view/View;->setId(I)V

    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->a()Lt/d;

    move-result-object v1

    invoke-virtual {v3, v1}, Lt/f;->a(Lt/d;)V

    invoke-virtual {p1, v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_8

    :cond_13
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 16

    move-object/from16 v1, p0

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    iget-object v3, v1, Lt/k;->c:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    move v4, v0

    :goto_0
    if-ge v4, v2, :cond_9

    move-object/from16 v5, p1

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lt/d;

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v8

    iget-boolean v0, v1, Lt/k;->b:Z

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    if-eq v8, v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "All children of ConstraintLayout must have ids to use ConstraintSet"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_1
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v9, Lt/f;

    invoke-direct {v9}, Lt/f;-><init>()V

    invoke-virtual {v3, v0, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lt/f;

    iget-object v10, v1, Lt/k;->a:Ljava/util/HashMap;

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v10}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lt/a;

    :try_start_0
    const-string v15, "BackgroundColor"

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-virtual {v6}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v15

    check-cast v15, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v15}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    new-instance v1, Lt/a;

    invoke-direct {v1, v14, v15}, Lt/a;-><init>(Lt/a;Ljava/lang/Object;)V

    invoke-virtual {v11, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    goto :goto_5

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "getMap"

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-virtual {v12, v1, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v6, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    new-instance v15, Lt/a;

    invoke-direct {v15, v14, v1}, Lt/a;-><init>(Lt/a;Ljava/lang/Object;)V

    invoke-virtual {v11, v0, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_6

    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_6

    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_6
    move-object/from16 v1, p0

    goto :goto_2

    :cond_4
    iput-object v11, v9, Lt/f;->f:Ljava/util/HashMap;

    iput v8, v9, Lt/f;->a:I

    iget v0, v7, Lt/d;->d:I

    iget-object v1, v9, Lt/f;->d:Lt/g;

    iput v0, v1, Lt/g;->g:I

    iget v0, v7, Lt/d;->e:I

    iput v0, v1, Lt/g;->h:I

    iget v0, v7, Lt/d;->f:I

    iput v0, v1, Lt/g;->i:I

    iget v0, v7, Lt/d;->g:I

    iput v0, v1, Lt/g;->j:I

    iget v0, v7, Lt/d;->h:I

    iput v0, v1, Lt/g;->k:I

    iget v0, v7, Lt/d;->i:I

    iput v0, v1, Lt/g;->l:I

    iget v0, v7, Lt/d;->j:I

    iput v0, v1, Lt/g;->m:I

    iget v0, v7, Lt/d;->k:I

    iput v0, v1, Lt/g;->n:I

    iget v0, v7, Lt/d;->l:I

    iput v0, v1, Lt/g;->o:I

    iget v0, v7, Lt/d;->p:I

    iput v0, v1, Lt/g;->p:I

    iget v0, v7, Lt/d;->q:I

    iput v0, v1, Lt/g;->q:I

    iget v0, v7, Lt/d;->r:I

    iput v0, v1, Lt/g;->r:I

    iget v0, v7, Lt/d;->s:I

    iput v0, v1, Lt/g;->s:I

    iget v0, v7, Lt/d;->z:F

    iput v0, v1, Lt/g;->t:F

    iget v0, v7, Lt/d;->A:F

    iput v0, v1, Lt/g;->u:F

    iget-object v0, v7, Lt/d;->B:Ljava/lang/String;

    iput-object v0, v1, Lt/g;->v:Ljava/lang/String;

    iget v0, v7, Lt/d;->m:I

    iput v0, v1, Lt/g;->w:I

    iget v0, v7, Lt/d;->n:I

    iput v0, v1, Lt/g;->x:I

    iget v0, v7, Lt/d;->o:F

    iput v0, v1, Lt/g;->y:F

    iget v0, v7, Lt/d;->P:I

    iput v0, v1, Lt/g;->z:I

    iget v0, v7, Lt/d;->Q:I

    iput v0, v1, Lt/g;->A:I

    iget v0, v7, Lt/d;->R:I

    iput v0, v1, Lt/g;->B:I

    iget v0, v7, Lt/d;->c:F

    iput v0, v1, Lt/g;->f:F

    iget v0, v7, Lt/d;->a:I

    iput v0, v1, Lt/g;->d:I

    iget v0, v7, Lt/d;->b:I

    iput v0, v1, Lt/g;->e:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput v0, v1, Lt/g;->b:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v0, v1, Lt/g;->c:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v0, v1, Lt/g;->C:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v0, v1, Lt/g;->D:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, v1, Lt/g;->E:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v0, v1, Lt/g;->F:I

    iget v0, v7, Lt/d;->E:F

    iput v0, v1, Lt/g;->O:F

    iget v0, v7, Lt/d;->D:F

    iput v0, v1, Lt/g;->P:F

    iget v0, v7, Lt/d;->G:I

    iput v0, v1, Lt/g;->R:I

    iget v0, v7, Lt/d;->F:I

    iput v0, v1, Lt/g;->Q:I

    iget-boolean v0, v7, Lt/d;->S:Z

    iput-boolean v0, v1, Lt/g;->g0:Z

    iget-boolean v0, v7, Lt/d;->T:Z

    iput-boolean v0, v1, Lt/g;->h0:Z

    iget v0, v7, Lt/d;->H:I

    iput v0, v1, Lt/g;->S:I

    iget v0, v7, Lt/d;->I:I

    iput v0, v1, Lt/g;->T:I

    iget v0, v7, Lt/d;->L:I

    iput v0, v1, Lt/g;->U:I

    iget v0, v7, Lt/d;->M:I

    iput v0, v1, Lt/g;->V:I

    iget v0, v7, Lt/d;->J:I

    iput v0, v1, Lt/g;->W:I

    iget v0, v7, Lt/d;->K:I

    iput v0, v1, Lt/g;->X:I

    iget v0, v7, Lt/d;->N:F

    iput v0, v1, Lt/g;->Y:F

    iget v0, v7, Lt/d;->O:F

    iput v0, v1, Lt/g;->Z:F

    iget-object v0, v7, Lt/d;->U:Ljava/lang/String;

    iput-object v0, v1, Lt/g;->f0:Ljava/lang/String;

    iget v0, v7, Lt/d;->u:I

    iput v0, v1, Lt/g;->J:I

    iget v0, v7, Lt/d;->w:I

    iput v0, v1, Lt/g;->L:I

    iget v0, v7, Lt/d;->t:I

    iput v0, v1, Lt/g;->I:I

    iget v0, v7, Lt/d;->v:I

    iput v0, v1, Lt/g;->K:I

    iget v0, v7, Lt/d;->x:I

    iput v0, v1, Lt/g;->N:I

    iget v0, v7, Lt/d;->y:I

    iput v0, v1, Lt/g;->M:I

    invoke-virtual {v7}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v0

    iput v0, v1, Lt/g;->G:I

    invoke-virtual {v7}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v0

    iput v0, v1, Lt/g;->H:I

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v7, v9, Lt/f;->b:Lt/i;

    iput v0, v7, Lt/i;->a:I

    invoke-virtual {v6}, Landroid/view/View;->getAlpha()F

    move-result v0

    iput v0, v7, Lt/i;->c:F

    invoke-virtual {v6}, Landroid/view/View;->getRotation()F

    move-result v0

    iget-object v7, v9, Lt/f;->e:Lt/j;

    iput v0, v7, Lt/j;->a:F

    invoke-virtual {v6}, Landroid/view/View;->getRotationX()F

    move-result v0

    iput v0, v7, Lt/j;->b:F

    invoke-virtual {v6}, Landroid/view/View;->getRotationY()F

    move-result v0

    iput v0, v7, Lt/j;->c:F

    invoke-virtual {v6}, Landroid/view/View;->getScaleX()F

    move-result v0

    iput v0, v7, Lt/j;->d:F

    invoke-virtual {v6}, Landroid/view/View;->getScaleY()F

    move-result v0

    iput v0, v7, Lt/j;->e:F

    invoke-virtual {v6}, Landroid/view/View;->getPivotX()F

    move-result v0

    invoke-virtual {v6}, Landroid/view/View;->getPivotY()F

    move-result v8

    float-to-double v9, v0

    const-wide/16 v11, 0x0

    cmpl-double v9, v9, v11

    if-nez v9, :cond_5

    float-to-double v9, v8

    cmpl-double v9, v9, v11

    if-eqz v9, :cond_6

    :cond_5
    iput v0, v7, Lt/j;->f:F

    iput v8, v7, Lt/j;->g:F

    :cond_6
    invoke-virtual {v6}, Landroid/view/View;->getTranslationX()F

    move-result v0

    iput v0, v7, Lt/j;->h:F

    invoke-virtual {v6}, Landroid/view/View;->getTranslationY()F

    move-result v0

    iput v0, v7, Lt/j;->i:F

    invoke-virtual {v6}, Landroid/view/View;->getTranslationZ()F

    move-result v0

    iput v0, v7, Lt/j;->j:F

    iget-boolean v0, v7, Lt/j;->k:Z

    if-eqz v0, :cond_7

    invoke-virtual {v6}, Landroid/view/View;->getElevation()F

    move-result v0

    iput v0, v7, Lt/j;->l:F

    :cond_7
    instance-of v0, v6, Landroidx/constraintlayout/widget/Barrier;

    if-eqz v0, :cond_8

    check-cast v6, Landroidx/constraintlayout/widget/Barrier;

    iget-object v0, v6, Landroidx/constraintlayout/widget/Barrier;->j:Lr/a;

    iget-boolean v0, v0, Lr/a;->g0:Z

    iput-boolean v0, v1, Lt/g;->i0:Z

    invoke-virtual {v6}, Lt/b;->getReferencedIds()[I

    move-result-object v0

    iput-object v0, v1, Lt/g;->d0:[I

    invoke-virtual {v6}, Landroidx/constraintlayout/widget/Barrier;->getType()I

    move-result v0

    iput v0, v1, Lt/g;->a0:I

    invoke-virtual {v6}, Landroidx/constraintlayout/widget/Barrier;->getMargin()I

    move-result v0

    iput v0, v1, Lt/g;->b0:I

    :cond_8
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, p0

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method public final e(Landroid/content/Context;I)V
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p2

    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v2

    invoke-static {p1, v2}, Lt/k;->d(Landroid/content/Context;Landroid/util/AttributeSet;)Lt/f;

    move-result-object v2

    const-string v3, "Guideline"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v2, Lt/f;->d:Lt/g;

    iput-boolean v1, v0, Lt/g;->a:Z

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_1
    iget-object v0, p0, Lt/k;->c:Ljava/util/HashMap;

    iget v1, v2, Lt/f;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :goto_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_5

    :goto_4
    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_3
    :goto_5
    return-void
.end method
