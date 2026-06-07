.class public final Lj0/h;
.super Lj0/p;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lj0/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Lj0/h;->a:I

    iput-object p2, p0, Lj0/h;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget v0, p0, Lj0/h;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Lj0/h;->b:Ljava/lang/Object;

    check-cast v0, Lj0/t;

    iget-boolean v1, v0, Lj0/t;->B:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lj0/o;->F()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lj0/t;->B:Z

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lj0/o;)V
    .locals 3

    iget v0, p0, Lj0/h;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj0/h;->b:Ljava/lang/Object;

    check-cast v0, Lj0/t;

    iget v1, v0, Lj0/t;->A:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lj0/t;->A:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lj0/t;->B:Z

    invoke-virtual {v0}, Lj0/o;->m()V

    :cond_0
    invoke-virtual {p1, p0}, Lj0/o;->v(Lj0/n;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lj0/h;->b:Ljava/lang/Object;

    check-cast v0, Lj0/o;

    invoke-virtual {v0}, Lj0/o;->y()V

    invoke-virtual {p1, p0}, Lj0/o;->v(Lj0/n;)V

    return-void

    :pswitch_1
    sget-object v0, Lj0/w;->a:Lj0/y;

    iget-object v1, p0, Lj0/h;->b:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lm0/z;->f0(Landroid/view/View;F)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, p0}, Lj0/o;->v(Lj0/n;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
