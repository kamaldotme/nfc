.class public final Le2/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le2/C;
.implements Le2/i;


# static fields
.field public static final b:Le2/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le2/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le2/c0;->b:Le2/c0;

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 0

    return-void
.end method

.method public final i(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
