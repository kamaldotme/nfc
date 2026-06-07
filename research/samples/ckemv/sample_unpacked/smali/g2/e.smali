.class public final synthetic Lg2/e;
.super LX1/f;
.source "SourceFile"

# interfaces
.implements LW1/p;


# static fields
.field public static final j:Lg2/e;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lg2/e;

    const-class v3, Lg2/f;

    const-string v4, "createSegment"

    const/4 v1, 0x2

    const-string v5, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v6, 0x1

    sget-object v2, LX1/a;->b:LX1/a;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LX1/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v7, Lg2/e;->j:Lg2/e;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    move-object v3, p2

    check-cast v3, Lg2/l;

    sget-object p1, Lg2/f;->a:Lg2/l;

    new-instance p1, Lg2/l;

    iget-object v4, v3, Lg2/l;->f:Lg2/d;

    invoke-static {v4}, LX1/g;->b(Ljava/lang/Object;)V

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lg2/l;-><init>(JLg2/l;Lg2/d;I)V

    return-object p1
.end method
