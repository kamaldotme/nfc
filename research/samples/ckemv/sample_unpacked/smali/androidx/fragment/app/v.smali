.class public final Landroidx/fragment/app/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public c:LW1/a;

.field public final synthetic d:Landroidx/fragment/app/B;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/B;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/v;->d:Landroidx/fragment/app/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/v;->a:Z

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/v;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method
