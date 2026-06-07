.class public final synthetic Landroidx/activity/t;
.super LX1/f;
.source "SourceFile"

# interfaces
.implements LW1/a;


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    iput p7, p0, Landroidx/activity/t;->j:I

    invoke-direct/range {p0 .. p6}, LX1/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Landroidx/activity/t;->j:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LX1/b;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/u;

    invoke-virtual {v0}, Landroidx/activity/u;->d()V

    sget-object v0, LK1/h;->a:LK1/h;

    return-object v0

    :pswitch_0
    iget-object v0, p0, LX1/b;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/u;

    invoke-virtual {v0}, Landroidx/activity/u;->d()V

    sget-object v0, LK1/h;->a:LK1/h;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
