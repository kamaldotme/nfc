.class public final Lj0/k;
.super Lj0/p;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/util/ArrayList;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/util/ArrayList;

.field public final synthetic g:Lj0/l;


# direct methods
.method public constructor <init>(Lj0/l;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj0/k;->g:Lj0/l;

    iput-object p2, p0, Lj0/k;->a:Ljava/lang/Object;

    iput-object p3, p0, Lj0/k;->b:Ljava/util/ArrayList;

    iput-object p4, p0, Lj0/k;->c:Ljava/lang/Object;

    iput-object p5, p0, Lj0/k;->d:Ljava/util/ArrayList;

    iput-object p6, p0, Lj0/k;->e:Ljava/lang/Object;

    iput-object p7, p0, Lj0/k;->f:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lj0/k;->g:Lj0/l;

    iget-object v2, p0, Lj0/k;->a:Ljava/lang/Object;

    if-eqz v2, :cond_0

    iget-object v3, p0, Lj0/k;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v3, v0}, Lj0/l;->o(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_0
    iget-object v2, p0, Lj0/k;->c:Ljava/lang/Object;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lj0/k;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v3, v0}, Lj0/l;->o(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_1
    iget-object v2, p0, Lj0/k;->e:Ljava/lang/Object;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lj0/k;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v3, v0}, Lj0/l;->o(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_2
    return-void
.end method

.method public final d(Lj0/o;)V
    .locals 0

    invoke-virtual {p1, p0}, Lj0/o;->v(Lj0/n;)V

    return-void
.end method
