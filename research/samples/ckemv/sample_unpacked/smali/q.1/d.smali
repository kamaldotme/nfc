.class public final Lq/d;
.super Lq/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lv0/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lq/c;->a:Lq/i;

    const/4 v0, 0x0

    iput v0, p0, Lq/c;->b:F

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq/c;->c:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq/c;->e:Z

    new-instance v0, Lq/j;

    invoke-direct {v0, p0, p1}, Lq/j;-><init>(Lq/c;Lv0/i;)V

    iput-object v0, p0, Lq/c;->d:Lq/b;

    return-void
.end method
