.class public final Lj0/q;
.super Lj0/p;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ln/b;

.field public final synthetic b:Lj0/r;


# direct methods
.method public constructor <init>(Lj0/r;Ln/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj0/q;->b:Lj0/r;

    iput-object p2, p0, Lj0/q;->a:Ln/b;

    return-void
.end method


# virtual methods
.method public final d(Lj0/o;)V
    .locals 3

    iget-object v0, p0, Lj0/q;->b:Lj0/r;

    iget-object v0, v0, Lj0/r;->c:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    iget-object v2, p0, Lj0/q;->a:Ln/b;

    invoke-virtual {v2, v0, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lj0/o;->v(Lj0/n;)V

    return-void
.end method
