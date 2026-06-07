.class public final Ld1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:Ld1/n;

.field public b:Ld1/n;

.field public c:I

.field public final synthetic d:Ld1/o;

.field public final synthetic e:I


# direct methods
.method public constructor <init>(Ld1/o;I)V
    .locals 0

    iput p2, p0, Ld1/l;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/l;->d:Ld1/o;

    iget-object p2, p1, Ld1/o;->g:Ld1/n;

    iget-object p2, p2, Ld1/n;->d:Ld1/n;

    iput-object p2, p0, Ld1/l;->a:Ld1/n;

    const/4 p2, 0x0

    iput-object p2, p0, Ld1/l;->b:Ld1/n;

    iget p1, p1, Ld1/o;->f:I

    iput p1, p0, Ld1/l;->c:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld1/l;->b()Ld1/n;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ld1/n;
    .locals 3

    iget-object v0, p0, Ld1/l;->a:Ld1/n;

    iget-object v1, p0, Ld1/l;->d:Ld1/o;

    iget-object v2, v1, Ld1/o;->g:Ld1/n;

    if-eq v0, v2, :cond_1

    iget v1, v1, Ld1/o;->f:I

    iget v2, p0, Ld1/l;->c:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Ld1/n;->d:Ld1/n;

    iput-object v1, p0, Ld1/l;->a:Ld1/n;

    iput-object v0, p0, Ld1/l;->b:Ld1/n;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Ld1/l;->a:Ld1/n;

    iget-object v1, p0, Ld1/l;->d:Ld1/o;

    iget-object v1, v1, Ld1/o;->g:Ld1/n;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld1/l;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Ld1/l;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Ld1/l;->b()Ld1/n;

    move-result-object v0

    iget-object v0, v0, Ld1/n;->f:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Ld1/l;->b:Ld1/n;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iget-object v2, p0, Ld1/l;->d:Ld1/o;

    invoke-virtual {v2, v0, v1}, Ld1/o;->c(Ld1/n;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Ld1/l;->b:Ld1/n;

    iget v0, v2, Ld1/o;->f:I

    iput v0, p0, Ld1/l;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
