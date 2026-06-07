.class public final synthetic LX0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic b:LX0/k;


# direct methods
.method public synthetic constructor <init>(LX0/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX0/i;->b:LX0/k;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    iget-object p1, p0, LX0/i;->b:LX0/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p2, v1, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p1, LX0/k;->o:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p2, v2, v4

    if-ltz p2, :cond_1

    const-wide/16 v4, 0x12c

    cmp-long p2, v2, v4

    if-lez p2, :cond_0

    goto :goto_0

    :cond_0
    move p2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move p2, v1

    :goto_1
    if-eqz p2, :cond_2

    iput-boolean v0, p1, LX0/k;->m:Z

    :cond_2
    invoke-virtual {p1}, LX0/k;->u()V

    iput-boolean v1, p1, LX0/k;->m:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p1, LX0/k;->o:J

    :cond_3
    return v0
.end method
