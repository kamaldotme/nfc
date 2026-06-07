.class public abstract Le2/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le2/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    sget v1, Lj2/w;->a:I

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Le2/B;->a:Ll2/d;

    sget-object v0, Lj2/o;->a:Lf2/d;

    iget-object v1, v0, Lf2/d;->g:Lf2/d;

    instance-of v1, v0, Le2/y;

    if-nez v1, :cond_1

    sget-object v0, Le2/w;->j:Le2/w;

    goto :goto_2

    :cond_1
    check-cast v0, Le2/y;

    goto :goto_2

    :cond_2
    :goto_1
    sget-object v0, Le2/w;->j:Le2/w;

    :goto_2
    sput-object v0, Le2/x;->a:Le2/y;

    return-void
.end method
