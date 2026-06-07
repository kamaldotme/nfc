.class public final Lx1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:[I


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x2

    filled-new-array {v0, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lx1/j;->c:[I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lx1/i;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lx1/i;-><init>(I)V

    iput-object p1, p0, Lx1/j;->a:Ljava/lang/Object;

    new-instance p1, Lx1/i;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lx1/i;-><init>(I)V

    iput-object p1, p0, Lx1/j;->b:Ljava/lang/Object;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lx1/j;->a:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lx1/j;->b:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a([ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lx1/j;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lx1/j;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(IILp1/a;)Lj1/l;
    .locals 12

    sget-object v0, Lx1/j;->c:[I

    const/4 v1, 0x3

    new-array v2, v1, [I

    const/4 v3, 0x0

    invoke-static {p3, p2, v3, v0, v2}, Lx1/k;->n(Lp1/a;IZ[I[I)[I

    move-result-object p2

    :try_start_0
    iget-object v0, p0, Lx1/j;->b:Ljava/lang/Object;

    check-cast v0, Lx1/i;

    invoke-virtual {v0, p1, p3, p2}, Lx1/i;->a(ILp1/a;[I)Lj1/l;

    move-result-object p1
    :try_end_0
    .catch Lj1/k; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    iget-object v0, p0, Lx1/j;->a:Ljava/lang/Object;

    check-cast v0, Lx1/i;

    iget-object v2, v0, Lx1/i;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    iget-object v0, v0, Lx1/i;->a:[I

    aput v3, v0, v3

    const/4 v4, 0x1

    aput v3, v0, v4

    const/4 v5, 0x2

    aput v3, v0, v5

    aput v3, v0, v1

    aget v1, p2, v4

    move v6, v3

    move v7, v6

    :goto_0
    if-ge v6, v5, :cond_3

    iget v8, p3, Lp1/a;->c:I

    if-ge v1, v8, :cond_3

    sget-object v8, Lx1/k;->g:[[I

    invoke-static {p3, v0, v1, v8}, Lx1/k;->j(Lp1/a;[II[[I)I

    move-result v8

    rem-int/lit8 v9, v8, 0xa

    add-int/lit8 v9, v9, 0x30

    int-to-char v9, v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    array-length v9, v0

    move v10, v3

    :goto_1
    if-ge v10, v9, :cond_0

    aget v11, v0, v10

    add-int/2addr v1, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_0
    const/16 v9, 0xa

    if-lt v8, v9, :cond_1

    rsub-int/lit8 v8, v6, 0x1

    shl-int v8, v4, v8

    or-int/2addr v7, v8

    :cond_1
    if-eq v6, v4, :cond_2

    invoke-virtual {p3, v1}, Lp1/a;->b(I)I

    move-result v1

    invoke-virtual {p3, v1}, Lp1/a;->c(I)I

    move-result v1

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result p3

    if-ne p3, v5, :cond_7

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3

    rem-int/lit8 p3, p3, 0x4

    if-ne p3, v7, :cond_6

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x0

    if-eq v0, v5, :cond_4

    move-object v0, v2

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/util/EnumMap;

    const-class v5, Lj1/m;

    invoke-direct {v0, v5}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v5, Lj1/m;->e:Lj1/m;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    new-instance v5, Lj1/l;

    new-instance v6, Lj1/n;

    aget v3, p2, v3

    aget p2, p2, v4

    add-int/2addr v3, p2

    int-to-float p2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr p2, v3

    int-to-float p1, p1

    invoke-direct {v6, p2, p1}, Lj1/n;-><init>(FF)V

    new-instance p2, Lj1/n;

    int-to-float v1, v1

    invoke-direct {p2, v1, p1}, Lj1/n;-><init>(FF)V

    filled-new-array {v6, p2}, [Lj1/n;

    move-result-object p1

    sget-object p2, Lj1/a;->r:Lj1/a;

    invoke-direct {v5, p3, v2, p1, p2}, Lj1/l;-><init>(Ljava/lang/String;[B[Lj1/n;Lj1/a;)V

    if-eqz v0, :cond_5

    invoke-virtual {v5, v0}, Lj1/l;->a(Ljava/util/Map;)V

    :cond_5
    return-object v5

    :cond_6
    sget-object p1, Lj1/h;->d:Lj1/h;

    throw p1

    :cond_7
    sget-object p1, Lj1/h;->d:Lj1/h;

    throw p1
.end method
