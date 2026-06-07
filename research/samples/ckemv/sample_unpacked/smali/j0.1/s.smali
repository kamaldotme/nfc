.class public abstract Lj0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj0/a;

.field public static final b:Ljava/lang/ThreadLocal;

.field public static final c:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj0/a;

    invoke-direct {v0}, Lj0/t;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lj0/t;->z:Z

    new-instance v1, Lj0/i;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lj0/i;-><init>(I)V

    invoke-virtual {v0, v1}, Lj0/t;->H(Lj0/o;)V

    new-instance v1, Lj0/g;

    invoke-direct {v1}, Lj0/o;-><init>()V

    invoke-virtual {v0, v1}, Lj0/t;->H(Lj0/o;)V

    new-instance v1, Lj0/i;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lj0/i;-><init>(I)V

    invoke-virtual {v0, v1}, Lj0/t;->H(Lj0/o;)V

    sput-object v0, Lj0/s;->a:Lj0/a;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lj0/s;->b:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lj0/s;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public static a(Landroid/view/ViewGroup;Lj0/o;)V
    .locals 3

    sget-object v0, Lj0/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/E;->c(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez p1, :cond_0

    sget-object p1, Lj0/s;->a:Lj0/a;

    :cond_0
    invoke-virtual {p1}, Lj0/o;->j()Lj0/o;

    move-result-object p1

    invoke-static {}, Lj0/s;->b()Ln/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj0/o;

    invoke-virtual {v2, p0}, Lj0/o;->u(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Lj0/o;->h(Landroid/view/ViewGroup;Z)V

    :cond_2
    const v0, 0x7f0801aa

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LX/d;->q(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz p1, :cond_3

    new-instance v0, Lj0/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lj0/r;->b:Lj0/o;

    iput-object p0, v0, Lj0/r;->c:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_3
    return-void
.end method

.method public static b()Ln/b;
    .locals 3

    sget-object v0, Lj0/s;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln/b;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    new-instance v1, Ln/b;

    invoke-direct {v1}, Ln/k;-><init>()V

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v1
.end method
