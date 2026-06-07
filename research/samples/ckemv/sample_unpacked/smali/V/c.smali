.class public final LV/c;
.super LV/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(LV/b;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LV/b;-><init>()V

    iget-object v0, p0, LV/b;->a:Ljava/util/LinkedHashMap;

    iget-object p1, p1, LV/b;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
