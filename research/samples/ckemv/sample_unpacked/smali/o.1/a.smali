.class public final Lo/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lo/a;

.field public static final c:Lo/a;


# instance fields
.field public final a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-boolean v0, Lo/g;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Lo/a;->c:Lo/a;

    sput-object v1, Lo/a;->b:Lo/a;

    goto :goto_0

    :cond_0
    new-instance v0, Lo/a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/a;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, Lo/a;->c:Lo/a;

    new-instance v0, Lo/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/a;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, Lo/a;->b:Lo/a;

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/a;->a:Ljava/lang/Throwable;

    return-void
.end method
