.class public final Lq0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/ComponentName;

.field public final b:Lm0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemJobInfoConverter"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm0/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq0/a;->b:Lm0/r;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance p2, Landroid/content/ComponentName;

    const-class v0, Landroidx/work/impl/background/systemjob/SystemJobService;

    invoke-direct {p2, p1, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object p2, p0, Lq0/a;->a:Landroid/content/ComponentName;

    return-void
.end method
