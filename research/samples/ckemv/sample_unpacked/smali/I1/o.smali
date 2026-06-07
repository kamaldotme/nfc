.class public final LI1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/o;


# instance fields
.field public a:LI1/m;


# virtual methods
.method public final a(Lj1/n;)V
    .locals 1

    iget-object v0, p0, LI1/o;->a:LI1/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LI1/m;->a(Lj1/n;)V

    :cond_0
    return-void
.end method
