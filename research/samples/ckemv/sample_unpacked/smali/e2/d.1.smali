.class public final Le2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le2/d0;
.implements LW1/l;


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Le2/d;->b:I

    iput-object p2, p0, Le2/d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    iget v0, p0, Le2/d;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le2/d;->c:Ljava/lang/Object;

    check-cast v0, LW1/l;

    invoke-interface {v0, p1}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object p1, p0, Le2/d;->c:Ljava/lang/Object;

    check-cast p1, Le2/C;

    invoke-interface {p1}, Le2/C;->f()V

    return-void

    :pswitch_1
    if-eqz p1, :cond_0

    iget-object p1, p0, Le2/d;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/Future;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le2/d;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Le2/d;->b(Ljava/lang/Throwable;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Le2/d;->b(Ljava/lang/Throwable;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Le2/d;->b(Ljava/lang/Throwable;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Le2/d;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "InvokeOnCancel["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le2/d;->c:Ljava/lang/Object;

    check-cast v1, LW1/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Le2/v;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DisposeOnCancel["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le2/d;->c:Ljava/lang/Object;

    check-cast v1, Le2/C;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CancelFutureOnCancel["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le2/d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Future;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
