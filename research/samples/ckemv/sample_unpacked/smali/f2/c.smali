.class public final Lf2/c;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/l;


# instance fields
.field public final synthetic c:Lf2/d;

.field public final synthetic d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lf2/d;LD0/c;)V
    .locals 0

    iput-object p1, p0, Lf2/c;->c:Lf2/d;

    iput-object p2, p0, Lf2/c;->d:Ljava/lang/Runnable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LX1/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Lf2/c;->c:Lf2/d;

    iget-object p1, p1, Lf2/d;->d:Landroid/os/Handler;

    iget-object v0, p0, Lf2/c;->d:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
