.class public final Landroidx/lifecycle/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;


# static fields
.field public static final j:Landroidx/lifecycle/D;


# instance fields
.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:Landroid/os/Handler;

.field public final g:Landroidx/lifecycle/t;

.field public final h:LB2/u;

.field public final i:LA/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/D;

    invoke-direct {v0}, Landroidx/lifecycle/D;-><init>()V

    sput-object v0, Landroidx/lifecycle/D;->j:Landroidx/lifecycle/D;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/D;->d:Z

    iput-boolean v0, p0, Landroidx/lifecycle/D;->e:Z

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/lifecycle/D;->g:Landroidx/lifecycle/t;

    new-instance v0, LB2/u;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p0}, LB2/u;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/D;->h:LB2/u;

    new-instance v0, LA/h;

    const/16 v1, 0x1a

    invoke-direct {v0, v1, p0}, LA/h;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/D;->i:LA/h;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/D;->c:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/D;->c:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/D;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/D;->g:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_RESUME:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/D;->d:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/D;->f:Landroid/os/Handler;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/D;->h:LB2/u;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final d()Landroidx/lifecycle/t;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/D;->g:Landroidx/lifecycle/t;

    return-object v0
.end method
