.class public final Ln0/n;
.super Lu2/l;
.source "SourceFile"


# instance fields
.field public final e:Ln0/s;

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public k:Z

.field public l:Lv0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkContinuationImpl"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ln0/s;Ljava/lang/String;ILjava/util/List;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/n;->e:Ln0/s;

    iput-object p2, p0, Ln0/n;->f:Ljava/lang/String;

    iput p3, p0, Ln0/n;->g:I

    iput-object p4, p0, Ln0/n;->h:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ln0/n;->i:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ln0/n;->j:Ljava/util/ArrayList;

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_2

    const/4 p2, 0x1

    if-ne p3, p2, :cond_1

    invoke-interface {p4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lm0/A;

    iget-object p2, p2, Lm0/A;->b:Lv0/o;

    iget-wide v0, p2, Lv0/o;->u:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    invoke-interface {p4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lm0/A;

    iget-object p2, p2, Lm0/A;->a:Ljava/util/UUID;

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "id.toString()"

    invoke-static {p2, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln0/n;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ln0/n;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static R(Ln0/n;Ljava/util/HashSet;)Z
    .locals 3

    iget-object v0, p0, Ln0/n;->i:Ljava/util/ArrayList;

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-static {p0}, Ln0/n;->S(Ln0/n;)Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    iget-object p0, p0, Ln0/n;->i:Ljava/util/ArrayList;

    invoke-interface {p1, p0}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    const/4 p0, 0x0

    return p0
.end method

.method public static S(Ln0/n;)Ljava/util/HashSet;
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public final Q()Lm0/x;
    .locals 3

    iget-boolean v0, p0, Ln0/n;->k:Z

    if-nez v0, :cond_0

    new-instance v0, Lw0/e;

    new-instance v1, Lv0/l;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lv0/l;-><init>(I)V

    invoke-direct {v0, p0, v1}, Lw0/e;-><init>(Ln0/n;Lv0/l;)V

    iget-object v2, p0, Ln0/n;->e:Ln0/s;

    iget-object v2, v2, Ln0/s;->g:Lv0/i;

    invoke-virtual {v2, v0}, Lv0/i;->f(Ljava/lang/Runnable;)V

    iput-object v1, p0, Ln0/n;->l:Lv0/l;

    goto :goto_0

    :cond_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    iget-object v1, p0, Ln0/n;->i:Ljava/util/ArrayList;

    const-string v2, ", "

    invoke-static {v2, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    iget-object v0, p0, Ln0/n;->l:Lv0/l;

    return-object v0
.end method
