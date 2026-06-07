.class public final Lx0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Lx0/i;

.field public final c:La1/a;


# direct methods
.method public constructor <init>(Lx0/i;La1/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/f;->b:Lx0/i;

    iput-object p2, p0, Lx0/f;->c:La1/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lx0/f;->b:Lx0/i;

    iget-object v0, v0, Lx0/i;->a:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lx0/f;->c:La1/a;

    invoke-static {v0}, Lx0/i;->f(La1/a;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lx0/i;->f:Lm0/z;

    iget-object v2, p0, Lx0/f;->b:Lx0/i;

    invoke-virtual {v1, v2, p0, v0}, Lm0/z;->g(Lx0/i;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx0/f;->b:Lx0/i;

    invoke-static {v0}, Lx0/i;->c(Lx0/i;)V

    :cond_1
    return-void
.end method
