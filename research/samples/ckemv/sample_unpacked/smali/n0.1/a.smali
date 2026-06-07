.class public final Ln0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln0/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ln0/a;->a:Ln0/a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/io/File;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object p1

    const-string v0, "context.noBackupFilesDir"

    invoke-static {p1, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
