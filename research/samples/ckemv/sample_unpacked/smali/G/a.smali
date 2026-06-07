.class public final LG/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final c:I

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LG/a;->b:I

    iput-object p3, p0, LG/a;->d:Ljava/lang/Object;

    iput p1, p0, LG/a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, LG/a;->b:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string p3, "initCallbacks cannot be null"

    invoke-static {p1, p3}, Lm0/z;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p3, p0, LG/a;->d:Ljava/lang/Object;

    .line 5
    iput p2, p0, LG/a;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, LG/a;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LG/a;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    iget-object v0, v0, Landroidx/work/impl/foreground/SystemForegroundService;->f:Landroid/app/NotificationManager;

    iget v1, p0, LG/a;->c:I

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, LG/a;->d:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/datepicker/k;

    iget-object v0, v0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->v:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget v2, p0, LG/a;->c:I

    invoke-virtual {v1, v0, v2}, LZ/H;->u0(Landroidx/recyclerview/widget/RecyclerView;I)V

    :goto_0
    return-void

    :pswitch_1
    iget-object v0, p0, LG/a;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v2, p0, LG/a;->c:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v2, v3, :cond_2

    :goto_1
    if-ge v4, v1, :cond_3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/emoji2/text/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-ge v4, v1, :cond_3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/emoji2/text/h;

    invoke-virtual {v2}, Landroidx/emoji2/text/h;->a()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    return-void

    :pswitch_2
    iget-object v0, p0, LG/a;->d:Ljava/lang/Object;

    check-cast v0, LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Lz/b;

    if-eqz v0, :cond_4

    iget v1, p0, LG/a;->c:I

    invoke-virtual {v0, v1}, Lz/b;->g(I)V

    :cond_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
