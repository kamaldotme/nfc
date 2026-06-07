.class public final Li2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/d;
.implements LQ1/c;


# instance fields
.field public final b:LO1/d;

.field public final c:LO1/i;


# direct methods
.method public constructor <init>(LO1/d;LO1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/s;->b:LO1/d;

    iput-object p2, p0, Li2/s;->c:LO1/i;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Li2/s;->b:LO1/d;

    invoke-interface {v0, p1}, LO1/d;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public final f()LQ1/c;
    .locals 2

    iget-object v0, p0, Li2/s;->b:LO1/d;

    instance-of v1, v0, LQ1/c;

    if-eqz v1, :cond_0

    check-cast v0, LQ1/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final j()LO1/i;
    .locals 1

    iget-object v0, p0, Li2/s;->c:LO1/i;

    return-object v0
.end method
