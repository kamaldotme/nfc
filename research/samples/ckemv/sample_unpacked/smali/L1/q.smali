.class public abstract LL1/q;
.super LL1/p;
.source "SourceFile"


# direct methods
.method public static T(Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
