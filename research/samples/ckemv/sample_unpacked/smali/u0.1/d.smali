.class public final Lu0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroid/app/Notification;

.field public final synthetic d:I

.field public final synthetic e:Landroidx/work/impl/foreground/SystemForegroundService;


# direct methods
.method public constructor <init>(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/d;->e:Landroidx/work/impl/foreground/SystemForegroundService;

    iput p2, p0, Lu0/d;->b:I

    iput-object p3, p0, Lu0/d;->c:Landroid/app/Notification;

    iput p4, p0, Lu0/d;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    iget v2, p0, Lu0/d;->d:I

    iget-object v3, p0, Lu0/d;->c:Landroid/app/Notification;

    iget v4, p0, Lu0/d;->b:I

    iget-object v5, p0, Lu0/d;->e:Landroidx/work/impl/foreground/SystemForegroundService;

    if-lt v0, v1, :cond_0

    invoke-static {v5, v4, v3, v2}, Lu0/f;->a(Landroid/app/Service;ILandroid/app/Notification;I)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    invoke-static {v5, v4, v3, v2}, Lu0/e;->a(Landroid/app/Service;ILandroid/app/Notification;I)V

    goto :goto_0

    :cond_1
    invoke-virtual {v5, v4, v3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :goto_0
    return-void
.end method
