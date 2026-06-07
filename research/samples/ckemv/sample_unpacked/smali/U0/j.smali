.class public final LU0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lu2/l;

.field public b:Lu2/l;

.field public c:Lu2/l;

.field public d:Lu2/l;

.field public e:LU0/c;

.field public f:LU0/c;

.field public g:LU0/c;

.field public h:LU0/c;

.field public i:LU0/e;

.field public j:LU0/e;

.field public k:LU0/e;

.field public l:LU0/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LU0/i;

    invoke-direct {v0}, LU0/i;-><init>()V

    iput-object v0, p0, LU0/j;->a:Lu2/l;

    new-instance v0, LU0/i;

    invoke-direct {v0}, LU0/i;-><init>()V

    iput-object v0, p0, LU0/j;->b:Lu2/l;

    new-instance v0, LU0/i;

    invoke-direct {v0}, LU0/i;-><init>()V

    iput-object v0, p0, LU0/j;->c:Lu2/l;

    new-instance v0, LU0/i;

    invoke-direct {v0}, LU0/i;-><init>()V

    iput-object v0, p0, LU0/j;->d:Lu2/l;

    new-instance v0, LU0/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU0/a;-><init>(F)V

    iput-object v0, p0, LU0/j;->e:LU0/c;

    new-instance v0, LU0/a;

    invoke-direct {v0, v1}, LU0/a;-><init>(F)V

    iput-object v0, p0, LU0/j;->f:LU0/c;

    new-instance v0, LU0/a;

    invoke-direct {v0, v1}, LU0/a;-><init>(F)V

    iput-object v0, p0, LU0/j;->g:LU0/c;

    new-instance v0, LU0/a;

    invoke-direct {v0, v1}, LU0/a;-><init>(F)V

    iput-object v0, p0, LU0/j;->h:LU0/c;

    new-instance v0, LU0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU0/e;-><init>(I)V

    iput-object v0, p0, LU0/j;->i:LU0/e;

    new-instance v0, LU0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU0/e;-><init>(I)V

    iput-object v0, p0, LU0/j;->j:LU0/e;

    new-instance v0, LU0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU0/e;-><init>(I)V

    iput-object v0, p0, LU0/j;->k:LU0/e;

    new-instance v0, LU0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU0/e;-><init>(I)V

    iput-object v0, p0, LU0/j;->l:LU0/e;

    return-void
.end method

.method public static b(Lu2/l;)V
    .locals 1

    instance-of v0, p0, LU0/i;

    if-eqz v0, :cond_0

    check-cast p0, LU0/i;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_0
    instance-of v0, p0, LU0/d;

    if-eqz v0, :cond_1

    check-cast p0, LU0/d;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()LU0/k;
    .locals 2

    new-instance v0, LU0/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, LU0/j;->a:Lu2/l;

    iput-object v1, v0, LU0/k;->a:Lu2/l;

    iget-object v1, p0, LU0/j;->b:Lu2/l;

    iput-object v1, v0, LU0/k;->b:Lu2/l;

    iget-object v1, p0, LU0/j;->c:Lu2/l;

    iput-object v1, v0, LU0/k;->c:Lu2/l;

    iget-object v1, p0, LU0/j;->d:Lu2/l;

    iput-object v1, v0, LU0/k;->d:Lu2/l;

    iget-object v1, p0, LU0/j;->e:LU0/c;

    iput-object v1, v0, LU0/k;->e:LU0/c;

    iget-object v1, p0, LU0/j;->f:LU0/c;

    iput-object v1, v0, LU0/k;->f:LU0/c;

    iget-object v1, p0, LU0/j;->g:LU0/c;

    iput-object v1, v0, LU0/k;->g:LU0/c;

    iget-object v1, p0, LU0/j;->h:LU0/c;

    iput-object v1, v0, LU0/k;->h:LU0/c;

    iget-object v1, p0, LU0/j;->i:LU0/e;

    iput-object v1, v0, LU0/k;->i:LU0/e;

    iget-object v1, p0, LU0/j;->j:LU0/e;

    iput-object v1, v0, LU0/k;->j:LU0/e;

    iget-object v1, p0, LU0/j;->k:LU0/e;

    iput-object v1, v0, LU0/k;->k:LU0/e;

    iget-object v1, p0, LU0/j;->l:LU0/e;

    iput-object v1, v0, LU0/k;->l:LU0/e;

    return-object v0
.end method
