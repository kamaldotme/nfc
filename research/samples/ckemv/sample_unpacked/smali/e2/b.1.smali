.class public final Le2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le2/d0;


# static fields
.field public static final b:Le2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le2/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le2/b;->b:Le2/b;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Active"

    return-object v0
.end method
