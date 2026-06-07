.class public final Le2/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le2/M;


# instance fields
.field public final b:Le2/b0;


# direct methods
.method public constructor <init>(Le2/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le2/L;->b:Le2/b0;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c()Le2/b0;
    .locals 1

    iget-object v0, p0, Le2/L;->b:Le2/b0;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
