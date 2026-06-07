.class public abstract Lh1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Z

.field public static final b:Le1/a;

.field public static final c:Le1/a;

.field public static final d:Le1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    :try_start_0
    const-string v0, "java.sql.Date"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lh1/b;->a:Z

    if-eqz v0, :cond_0

    sget-object v0, Lh1/a;->c:Le1/a;

    sput-object v0, Lh1/b;->b:Le1/a;

    sget-object v0, Lh1/a;->d:Le1/a;

    sput-object v0, Lh1/b;->c:Le1/a;

    sget-object v0, Lh1/a;->e:Le1/a;

    sput-object v0, Lh1/b;->d:Le1/a;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lh1/b;->b:Le1/a;

    sput-object v0, Lh1/b;->c:Le1/a;

    sput-object v0, Lh1/b;->d:Le1/a;

    :goto_1
    return-void
.end method
