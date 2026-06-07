.class public final Lb1/k;
.super Lb1/x;
.source "SourceFile"


# instance fields
.field public a:Lb1/x;


# virtual methods
.method public final a(Li1/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb1/k;->a:Lb1/x;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lb1/x;->a(Li1/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Li1/b;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lb1/k;->a:Lb1/x;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lb1/x;->b(Li1/b;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
