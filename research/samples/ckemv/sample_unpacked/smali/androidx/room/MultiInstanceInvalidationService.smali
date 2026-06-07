.class public final Landroidx/room/MultiInstanceInvalidationService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field public b:I

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:La0/h;

.field public final e:La0/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->c:Ljava/util/LinkedHashMap;

    new-instance v0, La0/h;

    invoke-direct {v0, p0}, La0/h;-><init>(Landroidx/room/MultiInstanceInvalidationService;)V

    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->d:La0/h;

    new-instance v0, La0/g;

    invoke-direct {v0, p0}, La0/g;-><init>(Landroidx/room/MultiInstanceInvalidationService;)V

    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->e:La0/g;

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/room/MultiInstanceInvalidationService;->e:La0/g;

    return-object p1
.end method
