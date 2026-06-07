.class public final Lw0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic h:I


# instance fields
.field public final b:Lx0/k;

.field public final c:Landroid/content/Context;

.field public final d:Lv0/o;

.field public final e:Lm0/q;

.field public final f:Lm0/i;

.field public final g:Lv0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkForegroundRunnable"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lv0/o;Lm0/q;Lw0/t;Lv0/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lx0/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lw0/r;->b:Lx0/k;

    iput-object p1, p0, Lw0/r;->c:Landroid/content/Context;

    iput-object p2, p0, Lw0/r;->d:Lv0/o;

    iput-object p3, p0, Lw0/r;->e:Lm0/q;

    iput-object p4, p0, Lw0/r;->f:Lm0/i;

    iput-object p5, p0, Lw0/r;->g:Lv0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lw0/r;->d:Lv0/o;

    iget-boolean v0, v0, Lv0/o;->q:Z

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lx0/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lw0/r;->g:Lv0/i;

    iget-object v2, v1, Lv0/i;->e:Ljava/lang/Object;

    check-cast v2, Ly0/a;

    new-instance v3, LI1/k;

    const/4 v4, 0x6

    invoke-direct {v3, p0, v4, v0}, LI1/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    new-instance v2, LD0/c;

    const/16 v3, 0xb

    const/4 v4, 0x0

    invoke-direct {v2, p0, v0, v3, v4}, LD0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    iget-object v1, v1, Lv0/i;->e:Ljava/lang/Object;

    check-cast v1, Ly0/a;

    invoke-virtual {v0, v2, v1}, Lx0/i;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lw0/r;->b:Lx0/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lx0/k;->j(Ljava/lang/Object;)Z

    return-void
.end method
