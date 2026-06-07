.class public final LJ1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# instance fields
.field public final synthetic a:LJ1/b;


# direct methods
.method public constructor <init>(LJ1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ1/a;->a:LJ1/b;

    return-void
.end method


# virtual methods
.method public final onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 1

    iget-object p1, p0, LJ1/a;->a:LJ1/b;

    iget-object p1, p1, LJ1/b;->e:Landroid/os/Handler;

    new-instance p2, LB2/u;

    const/4 v0, 0x3

    invoke-direct {p2, v0, p0}, LB2/u;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
