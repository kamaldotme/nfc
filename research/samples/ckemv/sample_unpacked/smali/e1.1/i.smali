.class public final Le1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/y;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le1/i;->b:I

    sget-object v0, Lb1/w;->b:Lb1/s;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le1/i;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le1/j;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le1/i;->b:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/i;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lb1/l;Lcom/google/gson/reflect/TypeToken;)Lb1/x;
    .locals 1

    iget v0, p0, Le1/i;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/lang/Object;

    if-ne p2, v0, :cond_0

    new-instance p2, Le1/k;

    iget-object v0, p0, Le1/i;->c:Ljava/lang/Object;

    check-cast v0, Lb1/w;

    invoke-direct {p2, p1, v0}, Le1/k;-><init>(Lb1/l;Lb1/w;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return-object p2

    :pswitch_0
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/lang/Number;

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Le1/i;->c:Ljava/lang/Object;

    check-cast p1, Le1/j;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
