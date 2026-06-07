.class public final Le2/P;
.super Le2/V;
.source "SourceFile"


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Le2/P;->f:I

    invoke-direct {p0}, Lj2/k;-><init>()V

    iput-object p2, p0, Le2/P;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le2/P;->f:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Le2/P;->p(Ljava/lang/Throwable;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Le2/P;->p(Ljava/lang/Throwable;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Ljava/lang/Throwable;)V
    .locals 1

    iget v0, p0, Le2/P;->f:I

    packed-switch v0, :pswitch_data_0

    sget-object p1, LK1/h;->a:LK1/h;

    iget-object v0, p0, Le2/P;->g:Ljava/lang/Object;

    check-cast v0, LO1/d;

    invoke-interface {v0, p1}, LO1/d;->c(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Le2/P;->g:Ljava/lang/Object;

    check-cast v0, LW1/l;

    invoke-interface {v0, p1}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
