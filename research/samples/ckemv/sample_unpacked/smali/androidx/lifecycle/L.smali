.class public final Landroidx/lifecycle/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Landroidx/lifecycle/t;

.field public final c:Landroidx/lifecycle/l;

.field public d:Z


# direct methods
.method public constructor <init>(Landroidx/lifecycle/t;Landroidx/lifecycle/l;)V
    .locals 1

    const-string v0, "registry"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/L;->b:Landroidx/lifecycle/t;

    iput-object p2, p0, Landroidx/lifecycle/L;->c:Landroidx/lifecycle/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-boolean v0, p0, Landroidx/lifecycle/L;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/L;->b:Landroidx/lifecycle/t;

    iget-object v1, p0, Landroidx/lifecycle/L;->c:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/L;->d:Z

    :cond_0
    return-void
.end method
