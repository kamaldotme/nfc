.class public abstract Lj0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final v:[I

.field public static final w:Ld1/e;

.field public static final x:Ljava/lang/ThreadLocal;


# instance fields
.field public final b:Ljava/lang/String;

.field public c:J

.field public d:J

.field public e:Landroid/animation/TimeInterpolator;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public h:Lv0/i;

.field public i:Lv0/i;

.field public j:Lj0/t;

.field public final k:[I

.field public l:Ljava/util/ArrayList;

.field public m:Ljava/util/ArrayList;

.field public final n:Ljava/util/ArrayList;

.field public o:I

.field public p:Z

.field public q:Z

.field public r:Ljava/util/ArrayList;

.field public s:Ljava/util/ArrayList;

.field public t:Ld1/e;

.field public u:Ld1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x1

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lj0/o;->v:[I

    new-instance v0, Ld1/e;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ld1/e;-><init>(I)V

    sput-object v0, Lj0/o;->w:Ld1/e;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lj0/o;->x:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj0/o;->b:Ljava/lang/String;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lj0/o;->c:J

    iput-wide v0, p0, Lj0/o;->d:J

    const/4 v0, 0x0

    iput-object v0, p0, Lj0/o;->e:Landroid/animation/TimeInterpolator;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lj0/o;->f:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lj0/o;->g:Ljava/util/ArrayList;

    new-instance v1, Lv0/i;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lv0/i;-><init>(I)V

    iput-object v1, p0, Lj0/o;->h:Lv0/i;

    new-instance v1, Lv0/i;

    invoke-direct {v1, v2}, Lv0/i;-><init>(I)V

    iput-object v1, p0, Lj0/o;->i:Lv0/i;

    iput-object v0, p0, Lj0/o;->j:Lj0/t;

    sget-object v1, Lj0/o;->v:[I

    iput-object v1, p0, Lj0/o;->k:[I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lj0/o;->n:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput v1, p0, Lj0/o;->o:I

    iput-boolean v1, p0, Lj0/o;->p:Z

    iput-boolean v1, p0, Lj0/o;->q:Z

    iput-object v0, p0, Lj0/o;->r:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lj0/o;->s:Ljava/util/ArrayList;

    sget-object v0, Lj0/o;->w:Ld1/e;

    iput-object v0, p0, Lj0/o;->u:Ld1/e;

    return-void
.end method

.method public static c(Lv0/i;Landroid/view/View;Lj0/v;)V
    .locals 4

    iget-object v0, p0, Lv0/i;->b:Ljava/lang/Object;

    check-cast v0, Ln/b;

    invoke-virtual {v0, p1, p2}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 v0, 0x0

    if-ltz p2, :cond_1

    iget-object v1, p0, Lv0/i;->c:Ljava/lang/Object;

    check-cast v1, Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v2

    if-ltz v2, :cond_0

    invoke-virtual {v1, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    sget-object p2, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, LJ/H;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object v1, p0, Lv0/i;->e:Ljava/lang/Object;

    check-cast v1, Ln/b;

    invoke-virtual {v1, p2}, Ln/k;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, p2, v0}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v1, p2, p1}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of p2, p2, Landroid/widget/ListView;

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    invoke-virtual {p2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/Adapter;->hasStableIds()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p2, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/AdapterView;->getItemIdAtPosition(I)J

    move-result-wide v1

    iget-object p0, p0, Lv0/i;->d:Ljava/lang/Object;

    check-cast p0, Ln/e;

    iget-boolean p2, p0, Ln/e;->b:Z

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Ln/e;->c()V

    :cond_4
    iget-object p2, p0, Ln/e;->c:[J

    iget v3, p0, Ln/e;->e:I

    invoke-static {p2, v3, v1, v2}, Ln/d;->b([JIJ)I

    move-result p2

    if-ltz p2, :cond_5

    invoke-virtual {p0, v1, v2, v0}, Ln/e;->d(JLjava/lang/Long;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_6

    const/4 p2, 0x0

    invoke-static {p1, p2}, LJ/B;->r(Landroid/view/View;Z)V

    invoke-virtual {p0, v1, v2, v0}, Ln/e;->e(JLjava/lang/Object;)V

    goto :goto_2

    :cond_5
    const/4 p2, 0x1

    invoke-static {p1, p2}, LJ/B;->r(Landroid/view/View;Z)V

    invoke-virtual {p0, v1, v2, p1}, Ln/e;->e(JLjava/lang/Object;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public static o()Ln/b;
    .locals 2

    sget-object v0, Lj0/o;->x:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln/b;

    if-nez v1, :cond_0

    new-instance v1, Ln/b;

    invoke-direct {v1}, Ln/k;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public static t(Lj0/v;Lj0/v;Ljava/lang/String;)Z
    .locals 0

    iget-object p0, p0, Lj0/v;->a:Ljava/util/HashMap;

    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iget-object p1, p1, Lj0/v;->a:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_1

    :cond_0
    const/4 p2, 0x1

    if-eqz p0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, p2

    goto :goto_1

    :cond_2
    :goto_0
    move p0, p2

    :goto_1
    return p0
.end method


# virtual methods
.method public A(Ld1/e;)V
    .locals 0

    iput-object p1, p0, Lj0/o;->t:Ld1/e;

    return-void
.end method

.method public B(Landroid/animation/TimeInterpolator;)V
    .locals 0

    iput-object p1, p0, Lj0/o;->e:Landroid/animation/TimeInterpolator;

    return-void
.end method

.method public C(Ld1/e;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lj0/o;->w:Ld1/e;

    iput-object p1, p0, Lj0/o;->u:Ld1/e;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lj0/o;->u:Ld1/e;

    :goto_0
    return-void
.end method

.method public D()V
    .locals 0

    return-void
.end method

.method public E(J)V
    .locals 0

    iput-wide p1, p0, Lj0/o;->c:J

    return-void
.end method

.method public final F()V
    .locals 5

    iget v0, p0, Lj0/o;->o:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lj0/o;->r:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lj0/o;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj0/n;

    invoke-interface {v4}, Lj0/n;->c()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lj0/o;->q:Z

    :cond_1
    iget v0, p0, Lj0/o;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lj0/o;->o:I

    return-void
.end method

.method public G(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "@"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-wide v0, p0, Lj0/o;->d:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    const-string v1, ") "

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "dur("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lj0/o;->d:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    iget-wide v4, p0, Lj0/o;->c:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "dly("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lj0/o;->c:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    iget-object v0, p0, Lj0/o;->e:Landroid/animation/TimeInterpolator;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "interp("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lj0/o;->e:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_2
    iget-object v0, p0, Lj0/o;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Lj0/o;->g:Ljava/util/ArrayList;

    if-gtz v1, :cond_3

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_8

    :cond_3
    const-string v1, "tgts("

    invoke-static {p1, v1}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const-string v3, ", "

    const/4 v4, 0x0

    if-lez v1, :cond_5

    move v1, v4

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v1, v5, :cond_5

    if-lez v1, :cond_4

    invoke-static {p1, v3}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_7

    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_7

    if-lez v4, :cond_6

    invoke-static {p1, v3}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_7
    const-string v0, ")"

    invoke-static {p1, v0}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_8
    return-object p1
.end method

.method public a(Lj0/n;)V
    .locals 1

    iget-object v0, p0, Lj0/o;->r:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lj0/o;->r:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lj0/o;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lj0/o;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj0/o;->j()Lj0/o;

    move-result-object v0

    return-object v0
.end method

.method public abstract d(Lj0/v;)V
.end method

.method public final e(Landroid/view/View;Z)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    new-instance v0, Lj0/v;

    invoke-direct {v0, p1}, Lj0/v;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_1

    invoke-virtual {p0, v0}, Lj0/o;->g(Lj0/v;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Lj0/o;->d(Lj0/v;)V

    :goto_0
    iget-object v1, v0, Lj0/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Lj0/o;->f(Lj0/v;)V

    if-eqz p2, :cond_2

    iget-object v1, p0, Lj0/o;->h:Lv0/i;

    invoke-static {v1, p1, v0}, Lj0/o;->c(Lv0/i;Landroid/view/View;Lj0/v;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lj0/o;->i:Lv0/i;

    invoke-static {v1, p1, v0}, Lj0/o;->c(Lv0/i;Landroid/view/View;Lj0/v;)V

    :cond_3
    :goto_1
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_4

    check-cast p1, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lj0/o;->e(Landroid/view/View;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public f(Lj0/v;)V
    .locals 0

    return-void
.end method

.method public abstract g(Lj0/v;)V
.end method

.method public final h(Landroid/view/ViewGroup;Z)V
    .locals 7

    invoke-virtual {p0, p2}, Lj0/o;->i(Z)V

    iget-object v0, p0, Lj0/o;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Lj0/o;->g:Ljava/util/ArrayList;

    if-gtz v1, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lj0/o;->e(Landroid/view/View;Z)V

    goto/16 :goto_7

    :cond_1
    :goto_0
    const/4 v1, 0x0

    move v3, v1

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_4

    new-instance v5, Lj0/v;

    invoke-direct {v5, v4}, Lj0/v;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_2

    invoke-virtual {p0, v5}, Lj0/o;->g(Lj0/v;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0, v5}, Lj0/o;->d(Lj0/v;)V

    :goto_2
    iget-object v6, v5, Lj0/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v5}, Lj0/o;->f(Lj0/v;)V

    if-eqz p2, :cond_3

    iget-object v6, p0, Lj0/o;->h:Lv0/i;

    invoke-static {v6, v4, v5}, Lj0/o;->c(Lv0/i;Landroid/view/View;Lj0/v;)V

    goto :goto_3

    :cond_3
    iget-object v6, p0, Lj0/o;->i:Lv0/i;

    invoke-static {v6, v4, v5}, Lj0/o;->c(Lv0/i;Landroid/view/View;Lj0/v;)V

    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    :goto_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v1, p1, :cond_8

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    new-instance v0, Lj0/v;

    invoke-direct {v0, p1}, Lj0/v;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_6

    invoke-virtual {p0, v0}, Lj0/o;->g(Lj0/v;)V

    goto :goto_5

    :cond_6
    invoke-virtual {p0, v0}, Lj0/o;->d(Lj0/v;)V

    :goto_5
    iget-object v3, v0, Lj0/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Lj0/o;->f(Lj0/v;)V

    if-eqz p2, :cond_7

    iget-object v3, p0, Lj0/o;->h:Lv0/i;

    invoke-static {v3, p1, v0}, Lj0/o;->c(Lv0/i;Landroid/view/View;Lj0/v;)V

    goto :goto_6

    :cond_7
    iget-object v3, p0, Lj0/o;->i:Lv0/i;

    invoke-static {v3, p1, v0}, Lj0/o;->c(Lv0/i;Landroid/view/View;Lj0/v;)V

    :goto_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_8
    :goto_7
    return-void
.end method

.method public final i(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lj0/o;->h:Lv0/i;

    iget-object p1, p1, Lv0/i;->b:Ljava/lang/Object;

    check-cast p1, Ln/b;

    invoke-virtual {p1}, Ln/k;->clear()V

    iget-object p1, p0, Lj0/o;->h:Lv0/i;

    iget-object p1, p1, Lv0/i;->c:Ljava/lang/Object;

    check-cast p1, Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Lj0/o;->h:Lv0/i;

    iget-object p1, p1, Lv0/i;->d:Ljava/lang/Object;

    check-cast p1, Ln/e;

    invoke-virtual {p1}, Ln/e;->a()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lj0/o;->i:Lv0/i;

    iget-object p1, p1, Lv0/i;->b:Ljava/lang/Object;

    check-cast p1, Ln/b;

    invoke-virtual {p1}, Ln/k;->clear()V

    iget-object p1, p0, Lj0/o;->i:Lv0/i;

    iget-object p1, p1, Lv0/i;->c:Ljava/lang/Object;

    check-cast p1, Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Lj0/o;->i:Lv0/i;

    iget-object p1, p1, Lv0/i;->d:Ljava/lang/Object;

    check-cast p1, Ln/e;

    invoke-virtual {p1}, Ln/e;->a()V

    :goto_0
    return-void
.end method

.method public j()Lj0/o;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj0/o;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lj0/o;->s:Ljava/util/ArrayList;

    new-instance v2, Lv0/i;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lv0/i;-><init>(I)V

    iput-object v2, v1, Lj0/o;->h:Lv0/i;

    new-instance v2, Lv0/i;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lv0/i;-><init>(I)V

    iput-object v2, v1, Lj0/o;->i:Lv0/i;

    iput-object v0, v1, Lj0/o;->l:Ljava/util/ArrayList;

    iput-object v0, v1, Lj0/o;->m:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method public k(Landroid/view/ViewGroup;Lj0/v;Lj0/v;)Landroid/animation/Animator;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public l(Landroid/view/ViewGroup;Lv0/i;Lv0/i;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {}, Lj0/o;->o()Ln/b;

    move-result-object v2

    new-instance v3, Landroid/util/SparseIntArray;

    invoke-direct {v3}, Landroid/util/SparseIntArray;-><init>()V

    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_b

    move-object/from16 v7, p4

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lj0/v;

    move-object/from16 v9, p5

    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lj0/v;

    const/4 v11, 0x0

    if-eqz v8, :cond_0

    iget-object v12, v8, Lj0/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_0

    move-object v8, v11

    :cond_0
    if-eqz v10, :cond_1

    iget-object v12, v10, Lj0/v;->c:Ljava/util/ArrayList;

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    move-object v10, v11

    :cond_1
    if-nez v8, :cond_3

    if-nez v10, :cond_3

    :cond_2
    move-object/from16 v15, p3

    move/from16 v16, v4

    goto/16 :goto_6

    :cond_3
    if-eqz v8, :cond_4

    if-eqz v10, :cond_4

    invoke-virtual {v0, v8, v10}, Lj0/o;->r(Lj0/v;Lj0/v;)Z

    move-result v12

    if-eqz v12, :cond_2

    :cond_4
    invoke-virtual {v0, v1, v8, v10}, Lj0/o;->k(Landroid/view/ViewGroup;Lj0/v;Lj0/v;)Landroid/animation/Animator;

    move-result-object v12

    if-eqz v12, :cond_2

    iget-object v13, v0, Lj0/o;->b:Ljava/lang/String;

    if-eqz v10, :cond_9

    invoke-virtual/range {p0 .. p0}, Lj0/o;->p()[Ljava/lang/String;

    move-result-object v8

    iget-object v10, v10, Lj0/v;->b:Landroid/view/View;

    if-eqz v8, :cond_8

    array-length v14, v8

    if-lez v14, :cond_8

    new-instance v14, Lj0/v;

    invoke-direct {v14, v10}, Lj0/v;-><init>(Landroid/view/View;)V

    move-object/from16 v15, p3

    iget-object v5, v15, Lv0/i;->b:Ljava/lang/Object;

    check-cast v5, Ln/b;

    invoke-virtual {v5, v10, v11}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj0/v;

    move/from16 v16, v4

    if-eqz v5, :cond_5

    const/4 v11, 0x0

    :goto_1
    array-length v4, v8

    if-ge v11, v4, :cond_5

    iget-object v4, v14, Lj0/v;->a:Ljava/util/HashMap;

    aget-object v7, v8, v11

    move-object/from16 v17, v8

    iget-object v8, v5, Lj0/v;->a:Ljava/util/HashMap;

    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v7, p4

    move-object/from16 v8, v17

    goto :goto_1

    :cond_5
    iget v4, v2, Ln/k;->d:I

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_7

    invoke-virtual {v2, v5}, Ln/k;->h(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/animation/Animator;

    const/4 v11, 0x0

    invoke-virtual {v2, v7, v11}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lj0/m;

    iget-object v8, v7, Lj0/m;->c:Lj0/v;

    if-eqz v8, :cond_6

    iget-object v8, v7, Lj0/m;->a:Landroid/view/View;

    if-ne v8, v10, :cond_6

    iget-object v8, v7, Lj0/m;->b:Ljava/lang/String;

    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    iget-object v7, v7, Lj0/m;->c:Lj0/v;

    invoke-virtual {v7, v14}, Lj0/v;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_7
    :goto_3
    move-object v11, v12

    goto :goto_4

    :cond_8
    move-object/from16 v15, p3

    move/from16 v16, v4

    move-object v14, v11

    goto :goto_3

    :goto_4
    move-object v12, v11

    move-object v11, v14

    goto :goto_5

    :cond_9
    move-object/from16 v15, p3

    move/from16 v16, v4

    iget-object v10, v8, Lj0/v;->b:Landroid/view/View;

    :goto_5
    if-eqz v12, :cond_a

    new-instance v4, Lj0/m;

    sget-object v5, Lj0/w;->a:Lj0/y;

    new-instance v5, Lj0/D;

    invoke-direct {v5, v1}, Lj0/D;-><init>(Landroid/view/View;)V

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v10, v4, Lj0/m;->a:Landroid/view/View;

    iput-object v13, v4, Lj0/m;->b:Ljava/lang/String;

    iput-object v11, v4, Lj0/m;->c:Lj0/v;

    iput-object v5, v4, Lj0/m;->d:Lj0/D;

    iput-object v0, v4, Lj0/m;->e:Lj0/o;

    invoke-virtual {v2, v12, v4}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v0, Lj0/o;->s:Ljava/util/ArrayList;

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_6
    add-int/lit8 v6, v6, 0x1

    move/from16 v4, v16

    goto/16 :goto_0

    :cond_b
    invoke-virtual {v3}, Landroid/util/SparseIntArray;->size()I

    move-result v1

    if-eqz v1, :cond_c

    const/4 v5, 0x0

    :goto_7
    invoke-virtual {v3}, Landroid/util/SparseIntArray;->size()I

    move-result v1

    if-ge v5, v1, :cond_c

    invoke-virtual {v3, v5}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v1

    iget-object v2, v0, Lj0/o;->s:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/Animator;

    invoke-virtual {v3, v5}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v2

    int-to-long v6, v2

    const-wide v8, 0x7fffffffffffffffL

    sub-long/2addr v6, v8

    invoke-virtual {v1}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v8

    add-long/2addr v8, v6

    invoke-virtual {v1, v8, v9}, Landroid/animation/Animator;->setStartDelay(J)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_c
    return-void
.end method

.method public final m()V
    .locals 6

    iget v0, p0, Lj0/o;->o:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lj0/o;->o:I

    if-nez v0, :cond_5

    iget-object v0, p0, Lj0/o;->r:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lj0/o;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj0/n;

    invoke-interface {v5, p0}, Lj0/n;->d(Lj0/o;)V

    add-int/2addr v4, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_1
    iget-object v3, p0, Lj0/o;->h:Lv0/i;

    iget-object v3, v3, Lv0/i;->d:Ljava/lang/Object;

    check-cast v3, Ln/e;

    invoke-virtual {v3}, Ln/e;->f()I

    move-result v3

    if-ge v0, v3, :cond_2

    iget-object v3, p0, Lj0/o;->h:Lv0/i;

    iget-object v3, v3, Lv0/i;->d:Ljava/lang/Object;

    check-cast v3, Ln/e;

    invoke-virtual {v3, v0}, Ln/e;->g(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_1

    sget-object v4, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v3, v2}, LJ/B;->r(Landroid/view/View;Z)V

    :cond_1
    add-int/2addr v0, v1

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_2
    iget-object v3, p0, Lj0/o;->i:Lv0/i;

    iget-object v3, v3, Lv0/i;->d:Ljava/lang/Object;

    check-cast v3, Ln/e;

    invoke-virtual {v3}, Ln/e;->f()I

    move-result v3

    if-ge v0, v3, :cond_4

    iget-object v3, p0, Lj0/o;->i:Lv0/i;

    iget-object v3, v3, Lv0/i;->d:Ljava/lang/Object;

    check-cast v3, Ln/e;

    invoke-virtual {v3, v0}, Ln/e;->g(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_3

    sget-object v4, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v3, v2}, LJ/B;->r(Landroid/view/View;Z)V

    :cond_3
    add-int/2addr v0, v1

    goto :goto_2

    :cond_4
    iput-boolean v1, p0, Lj0/o;->q:Z

    :cond_5
    return-void
.end method

.method public final n(Landroid/view/View;Z)Lj0/v;
    .locals 5

    iget-object v0, p0, Lj0/o;->j:Lj0/t;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lj0/o;->n(Landroid/view/View;Z)Lj0/v;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lj0/o;->l:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lj0/o;->m:Ljava/util/ArrayList;

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_5

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj0/v;

    if-nez v4, :cond_3

    return-object v1

    :cond_3
    iget-object v4, v4, Lj0/v;->b:Landroid/view/View;

    if-ne v4, p1, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    const/4 v3, -0x1

    :goto_2
    if-ltz v3, :cond_7

    if-eqz p2, :cond_6

    iget-object p1, p0, Lj0/o;->m:Ljava/util/ArrayList;

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lj0/o;->l:Ljava/util/ArrayList;

    :goto_3
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lj0/v;

    :cond_7
    return-object v1
.end method

.method public p()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final q(Landroid/view/View;Z)Lj0/v;
    .locals 1

    iget-object v0, p0, Lj0/o;->j:Lj0/t;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lj0/o;->q(Landroid/view/View;Z)Lj0/v;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lj0/o;->h:Lv0/i;

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lj0/o;->i:Lv0/i;

    :goto_0
    iget-object p2, p2, Lv0/i;->b:Ljava/lang/Object;

    check-cast p2, Ln/b;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj0/v;

    return-object p1
.end method

.method public r(Lj0/v;Lj0/v;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lj0/o;->p()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    array-length v3, v1

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v1, v4

    invoke-static {p1, p2, v5}, Lj0/o;->t(Lj0/v;Lj0/v;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p1, Lj0/v;->a:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {p1, p2, v3}, Lj0/o;->t(Lj0/v;Lj0/v;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    move v0, v2

    :cond_3
    return v0
.end method

.method public final s(Landroid/view/View;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lj0/o;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    iget-object v4, p0, Lj0/o;->g:Ljava/util/ArrayList;

    if-nez v2, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_0

    return v3

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    return v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, v0}, Lj0/o;->G(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Landroid/view/View;)V
    .locals 5

    const/4 v0, 0x1

    iget-boolean v1, p0, Lj0/o;->q:Z

    if-nez v1, :cond_3

    invoke-static {}, Lj0/o;->o()Ln/b;

    move-result-object v1

    iget v2, v1, Ln/k;->d:I

    sget-object v3, Lj0/w;->a:Lj0/y;

    invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object p1

    sub-int/2addr v2, v0

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v1, v2}, Ln/k;->j(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj0/m;

    iget-object v4, v3, Lj0/m;->a:Landroid/view/View;

    if-eqz v4, :cond_0

    iget-object v3, v3, Lj0/m;->d:Lj0/D;

    instance-of v4, v3, Lj0/D;

    if-eqz v4, :cond_0

    iget-object v3, v3, Lj0/D;->a:Landroid/view/WindowId;

    invoke-virtual {v3, p1}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ln/k;->h(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    invoke-virtual {v3}, Landroid/animation/Animator;->pause()V

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lj0/o;->r:Ljava/util/ArrayList;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_2

    iget-object p1, p0, Lj0/o;->r:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj0/n;

    invoke-interface {v3}, Lj0/n;->b()V

    add-int/2addr v2, v0

    goto :goto_1

    :cond_2
    iput-boolean v0, p0, Lj0/o;->p:Z

    :cond_3
    return-void
.end method

.method public v(Lj0/n;)V
    .locals 1

    iget-object v0, p0, Lj0/o;->r:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lj0/o;->r:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lj0/o;->r:Ljava/util/ArrayList;

    :cond_1
    return-void
.end method

.method public w(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lj0/o;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public x(Landroid/view/ViewGroup;)V
    .locals 5

    iget-boolean v0, p0, Lj0/o;->p:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lj0/o;->q:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    invoke-static {}, Lj0/o;->o()Ln/b;

    move-result-object v0

    iget v2, v0, Ln/k;->d:I

    sget-object v3, Lj0/w;->a:Lj0/y;

    invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object p1

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v0, v2}, Ln/k;->j(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj0/m;

    iget-object v4, v3, Lj0/m;->a:Landroid/view/View;

    if-eqz v4, :cond_0

    iget-object v3, v3, Lj0/m;->d:Lj0/D;

    instance-of v4, v3, Lj0/D;

    if-eqz v4, :cond_0

    iget-object v3, v3, Lj0/D;->a:Landroid/view/WindowId;

    invoke-virtual {v3, p1}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Ln/k;->h(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    invoke-virtual {v3}, Landroid/animation/Animator;->resume()V

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lj0/o;->r:Ljava/util/ArrayList;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_2

    iget-object p1, p0, Lj0/o;->r:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj0/n;

    invoke-interface {v3}, Lj0/n;->e()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    iput-boolean v1, p0, Lj0/o;->p:Z

    :cond_3
    return-void
.end method

.method public y()V
    .locals 8

    invoke-virtual {p0}, Lj0/o;->F()V

    invoke-static {}, Lj0/o;->o()Ln/b;

    move-result-object v0

    iget-object v1, p0, Lj0/o;->s:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    invoke-virtual {v0, v2}, Ln/k;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lj0/o;->F()V

    if-eqz v2, :cond_0

    new-instance v3, LJ/Z;

    invoke-direct {v3, p0, v0}, LJ/Z;-><init>(Lj0/o;Ln/b;)V

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-wide v3, p0, Lj0/o;->d:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-ltz v7, :cond_1

    invoke-virtual {v2, v3, v4}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    :cond_1
    iget-wide v3, p0, Lj0/o;->c:J

    cmp-long v5, v3, v5

    if-ltz v5, :cond_2

    invoke-virtual {v2}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v5

    add-long/2addr v5, v3

    invoke-virtual {v2, v5, v6}, Landroid/animation/Animator;->setStartDelay(J)V

    :cond_2
    iget-object v3, p0, Lj0/o;->e:Landroid/animation/TimeInterpolator;

    if-eqz v3, :cond_3

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_3
    new-instance v3, LD0/a;

    const/4 v4, 0x2

    invoke-direct {v3, v4, p0}, LD0/a;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v2}, Landroid/animation/Animator;->start()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lj0/o;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lj0/o;->m()V

    return-void
.end method

.method public z(J)V
    .locals 0

    iput-wide p1, p0, Lj0/o;->d:J

    return-void
.end method
