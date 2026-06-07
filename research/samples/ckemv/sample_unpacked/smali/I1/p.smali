.class public final LI1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LJ1/g;

.field public b:Landroid/os/HandlerThread;

.field public c:Landroid/os/Handler;

.field public d:LI1/m;

.field public final e:Landroid/os/Handler;

.field public f:Landroid/graphics/Rect;

.field public g:Z

.field public final h:Ljava/lang/Object;

.field public final i:LI1/c;

.field public final j:LA/h;


# direct methods
.method public constructor <init>(LJ1/g;LI1/m;Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LI1/p;->g:Z

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LI1/p;->h:Ljava/lang/Object;

    new-instance v0, LI1/c;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, LI1/c;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LI1/p;->i:LI1/c;

    new-instance v0, LA/h;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0}, LA/h;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LI1/p;->j:LA/h;

    invoke-static {}, Lu2/d;->G()V

    iput-object p1, p0, LI1/p;->a:LJ1/g;

    iput-object p2, p0, LI1/p;->d:LI1/m;

    iput-object p3, p0, LI1/p;->e:Landroid/os/Handler;

    return-void
.end method
