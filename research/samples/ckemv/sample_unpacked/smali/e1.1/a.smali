.class public final Le1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/y;


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Le1/a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb1/l;Lcom/google/gson/reflect/TypeToken;)Lb1/x;
    .locals 2

    iget v0, p0, Le1/a;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/sql/Timestamp;

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class p2, Ljava/util/Date;

    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    invoke-virtual {p1, p2}, Lb1/l;->d(Lcom/google/gson/reflect/TypeToken;)Lb1/x;

    move-result-object p1

    new-instance p2, Lh1/a;

    invoke-direct {p2, p1}, Lh1/a;-><init>(Lb1/x;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return-object p2

    :pswitch_0
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/sql/Time;

    if-ne p1, p2, :cond_1

    new-instance p1, Lh1/a;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lh1/a;-><init>(I)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_1
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/sql/Date;

    if-ne p1, p2, :cond_2

    new-instance p1, Lh1/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lh1/a;-><init>(I)V

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :pswitch_2
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/lang/Enum;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-ne p1, p2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    :cond_4
    new-instance p2, Le1/q;

    invoke-direct {p2, p1}, Le1/q;-><init>(Ljava/lang/Class;)V

    goto :goto_4

    :cond_5
    :goto_3
    const/4 p2, 0x0

    :goto_4
    return-object p2

    :pswitch_3
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/util/Date;

    if-ne p1, p2, :cond_6

    new-instance p1, Le1/d;

    invoke-direct {p1}, Le1/d;-><init>()V

    goto :goto_5

    :cond_6
    const/4 p1, 0x0

    :goto_5
    return-object p1

    :pswitch_4
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    if-nez v0, :cond_8

    instance-of v1, p2, Ljava/lang/Class;

    if-eqz v1, :cond_7

    move-object v1, p2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    const/4 p1, 0x0

    goto :goto_7

    :cond_8
    if-eqz v0, :cond_9

    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p2

    goto :goto_6

    :cond_9
    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    :goto_6
    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb1/l;->d(Lcom/google/gson/reflect/TypeToken;)Lb1/x;

    move-result-object v0

    new-instance v1, Le1/b;

    invoke-static {p2}, Ld1/d;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-direct {v1, p1, v0, p2}, Le1/b;-><init>(Lb1/l;Lb1/x;Ljava/lang/Class;)V

    move-object p1, v1

    :goto_7
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
