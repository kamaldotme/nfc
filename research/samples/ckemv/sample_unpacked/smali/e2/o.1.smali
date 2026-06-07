.class public final Le2/o;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/p;


# static fields
.field public static final d:Le2/o;

.field public static final e:Le2/o;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Le2/o;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le2/o;-><init>(II)V

    sput-object v0, Le2/o;->d:Le2/o;

    new-instance v0, Le2/o;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Le2/o;-><init>(II)V

    sput-object v0, Le2/o;->e:Le2/o;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Le2/o;->c:I

    invoke-direct {p0, p1}, LX1/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le2/o;->c:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LO1/i;

    check-cast p2, LO1/g;

    invoke-interface {p1, p2}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    check-cast p2, LO1/g;

    return-object p1

    :pswitch_1
    check-cast p1, LO1/i;

    check-cast p2, LO1/g;

    invoke-interface {p1, p2}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
