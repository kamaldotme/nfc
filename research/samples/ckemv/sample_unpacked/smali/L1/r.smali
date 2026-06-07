.class public final LL1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LL1/r;->a:I

    iput-object p2, p0, LL1/r;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget v0, p0, LL1/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LL1/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    return-object v0

    :pswitch_0
    iget-object v0, p0, LL1/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
