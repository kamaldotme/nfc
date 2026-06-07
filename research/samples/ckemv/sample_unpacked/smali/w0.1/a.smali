.class public final Lw0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lw0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw0/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw0/a;->a:Lw0/a;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroid/app/Application;->getProcessName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getProcessName()"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
