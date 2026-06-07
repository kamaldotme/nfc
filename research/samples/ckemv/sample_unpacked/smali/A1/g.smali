.class public final LA1/g;
.super LA1/f;
.source "SourceFile"


# virtual methods
.method public final j()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x5

    iget-object v2, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v2, Lv0/m;

    invoke-virtual {v2, v0, v1}, Lv0/m;->d(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
