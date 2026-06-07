.class public final LM1/h;
.super LL1/g;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final c:LM1/h;


# instance fields
.field public final b:LM1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM1/h;

    sget-object v1, LM1/e;->o:LM1/e;

    sget-object v1, LM1/e;->o:LM1/e;

    invoke-direct {v0, v1}, LM1/h;-><init>(LM1/e;)V

    sput-object v0, LM1/h;->c:LM1/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3
    new-instance v0, LM1/e;

    invoke-direct {v0}, LM1/e;-><init>()V

    invoke-direct {p0, v0}, LM1/h;-><init>(LM1/e;)V

    return-void
.end method

.method public constructor <init>(LM1/e;)V
    .locals 1

    const-string v0, "backing"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, LL1/g;-><init>()V

    .line 2
    iput-object p1, p0, LM1/h;->b:LM1/e;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, LM1/h;->b:LM1/e;

    iget v0, v0, LM1/e;->j:I

    return v0
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LM1/h;->b:LM1/e;

    invoke-virtual {v0, p1}, LM1/e;->a(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/h;->b:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, LM1/h;->b:LM1/e;

    invoke-virtual {v0}, LM1/e;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LM1/h;->b:LM1/e;

    invoke-virtual {v0, p1}, LM1/e;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, LM1/h;->b:LM1/e;

    invoke-virtual {v0}, LM1/e;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget-object v0, p0, LM1/h;->b:LM1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LM1/c;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, LM1/c;-><init>(LM1/e;I)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LM1/h;->b:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-virtual {v0, p1}, LM1/e;->g(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LM1/e;->k(I)V

    if-ltz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/h;->b:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/h;->b:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method
