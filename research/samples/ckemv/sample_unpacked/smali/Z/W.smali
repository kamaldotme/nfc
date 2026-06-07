.class public abstract LZ/W;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final s:Ljava/util/List;


# instance fields
.field public final a:Landroid/view/View;

.field public b:Ljava/lang/ref/WeakReference;

.field public c:I

.field public d:I

.field public e:J

.field public f:I

.field public g:I

.field public h:LZ/W;

.field public i:LZ/W;

.field public j:I

.field public k:Ljava/util/ArrayList;

.field public l:Ljava/util/List;

.field public m:I

.field public n:LZ/N;

.field public o:Z

.field public p:I

.field public q:I

.field public r:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    sput-object v0, LZ/W;->s:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LZ/W;->c:I

    iput v0, p0, LZ/W;->d:I

    const-wide/16 v1, -0x1

    iput-wide v1, p0, LZ/W;->e:J

    iput v0, p0, LZ/W;->f:I

    iput v0, p0, LZ/W;->g:I

    const/4 v1, 0x0

    iput-object v1, p0, LZ/W;->h:LZ/W;

    iput-object v1, p0, LZ/W;->i:LZ/W;

    iput-object v1, p0, LZ/W;->k:Ljava/util/ArrayList;

    iput-object v1, p0, LZ/W;->l:Ljava/util/List;

    const/4 v2, 0x0

    iput v2, p0, LZ/W;->m:I

    iput-object v1, p0, LZ/W;->n:LZ/N;

    iput-boolean v2, p0, LZ/W;->o:Z

    iput v2, p0, LZ/W;->p:I

    iput v0, p0, LZ/W;->q:I

    if-eqz p1, :cond_0

    iput-object p1, p0, LZ/W;->a:Landroid/view/View;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "itemView may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    const/16 v0, 0x400

    if-nez p1, :cond_0

    invoke-virtual {p0, v0}, LZ/W;->b(I)V

    goto :goto_0

    :cond_0
    iget v1, p0, LZ/W;->j:I

    and-int/2addr v0, v1

    if-nez v0, :cond_2

    iget-object v0, p0, LZ/W;->k:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LZ/W;->k:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LZ/W;->l:Ljava/util/List;

    :cond_1
    iget-object v0, p0, LZ/W;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final b(I)V
    .locals 1

    iget v0, p0, LZ/W;->j:I

    or-int/2addr p1, v0

    iput p1, p0, LZ/W;->j:I

    return-void
.end method

.method public final c()I
    .locals 2

    iget v0, p0, LZ/W;->g:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, LZ/W;->c:I

    :cond_0
    return v0
.end method

.method public final d()Ljava/util/List;
    .locals 2

    iget v0, p0, LZ/W;->j:I

    and-int/lit16 v0, v0, 0x400

    sget-object v1, LZ/W;->s:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v0, p0, LZ/W;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LZ/W;->l:Ljava/util/List;

    return-object v0

    :cond_1
    :goto_0
    return-object v1
.end method

.method public final e(I)Z
    .locals 1

    iget v0, p0, LZ/W;->j:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, LZ/W;->r:Landroidx/recyclerview/widget/RecyclerView;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g()Z
    .locals 2

    iget v0, p0, LZ/W;->j:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final h()Z
    .locals 1

    iget v0, p0, LZ/W;->j:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final i()Z
    .locals 1

    iget v0, p0, LZ/W;->j:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_0

    sget-object v0, LJ/T;->a:Ljava/util/WeakHashMap;

    iget-object v0, p0, LZ/W;->a:Landroid/view/View;

    invoke-static {v0}, LJ/B;->i(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final j()Z
    .locals 1

    iget v0, p0, LZ/W;->j:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, LZ/W;->n:LZ/N;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l()Z
    .locals 1

    iget v0, p0, LZ/W;->j:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final m()Z
    .locals 1

    iget v0, p0, LZ/W;->j:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final n(IZ)V
    .locals 2

    iget v0, p0, LZ/W;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, LZ/W;->c:I

    iput v0, p0, LZ/W;->d:I

    :cond_0
    iget v0, p0, LZ/W;->g:I

    if-ne v0, v1, :cond_1

    iget v0, p0, LZ/W;->c:I

    iput v0, p0, LZ/W;->g:I

    :cond_1
    if-eqz p2, :cond_2

    iget p2, p0, LZ/W;->g:I

    add-int/2addr p2, p1

    iput p2, p0, LZ/W;->g:I

    :cond_2
    iget p2, p0, LZ/W;->c:I

    add-int/2addr p2, p1

    iput p2, p0, LZ/W;->c:I

    iget-object p1, p0, LZ/W;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, LZ/I;

    const/4 p2, 0x1

    iput-boolean p2, p1, LZ/I;->c:Z

    :cond_3
    return-void
.end method

.method public final o()V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, LZ/W;->j:I

    const/4 v1, -0x1

    iput v1, p0, LZ/W;->c:I

    iput v1, p0, LZ/W;->d:I

    const-wide/16 v2, -0x1

    iput-wide v2, p0, LZ/W;->e:J

    iput v1, p0, LZ/W;->g:I

    iput v0, p0, LZ/W;->m:I

    const/4 v2, 0x0

    iput-object v2, p0, LZ/W;->h:LZ/W;

    iput-object v2, p0, LZ/W;->i:LZ/W;

    iget-object v2, p0, LZ/W;->k:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    :cond_0
    iget v2, p0, LZ/W;->j:I

    and-int/lit16 v2, v2, -0x401

    iput v2, p0, LZ/W;->j:I

    iput v0, p0, LZ/W;->p:I

    iput v1, p0, LZ/W;->q:I

    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView;->j(LZ/W;)V

    return-void
.end method

.method public final p(Z)V
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, LZ/W;->m:I

    if-eqz p1, :cond_0

    sub-int/2addr v1, v0

    goto :goto_0

    :cond_0
    add-int/2addr v1, v0

    :goto_0
    iput v1, p0, LZ/W;->m:I

    if-gez v1, :cond_1

    const/4 p1, 0x0

    iput p1, p0, LZ/W;->m:I

    invoke-virtual {p0}, LZ/W;->toString()Ljava/lang/String;

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    if-ne v1, v0, :cond_2

    iget p1, p0, LZ/W;->j:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, LZ/W;->j:I

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    if-nez v1, :cond_3

    iget p1, p0, LZ/W;->j:I

    and-int/lit8 p1, p1, -0x11

    iput p1, p0, LZ/W;->j:I

    :cond_3
    :goto_1
    return-void
.end method

.method public final q()Z
    .locals 1

    iget v0, p0, LZ/W;->j:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final r()Z
    .locals 1

    iget v0, p0, LZ/W;->j:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ViewHolder"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "{"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " position="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LZ/W;->c:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " id="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, LZ/W;->e:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", oldPos="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LZ/W;->d:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", pLpos:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LZ/W;->g:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, LZ/W;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, " scrap "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, LZ/W;->o:Z

    if-eqz v0, :cond_1

    const-string v0, "[changeScrap]"

    goto :goto_1

    :cond_1
    const-string v0, "[attachedScrap]"

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {p0}, LZ/W;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, " invalid"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {p0}, LZ/W;->g()Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, " unbound"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget v0, p0, LZ/W;->j:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_5

    const-string v0, " update"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {p0}, LZ/W;->j()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, " removed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    invoke-virtual {p0}, LZ/W;->q()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, " ignored"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    invoke-virtual {p0}, LZ/W;->l()Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, " tmpDetached"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    invoke-virtual {p0}, LZ/W;->i()Z

    move-result v0

    if-nez v0, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, " not recyclable("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, LZ/W;->m:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    iget v0, p0, LZ/W;->j:I

    and-int/lit16 v0, v0, 0x200

    if-nez v0, :cond_a

    invoke-virtual {p0}, LZ/W;->h()Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_a
    const-string v0, " undefined adapter position"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    iget-object v0, p0, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_c

    const-string v0, " no parent"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_c
    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
