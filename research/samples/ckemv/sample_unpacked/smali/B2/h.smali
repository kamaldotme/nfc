.class public final LB2/h;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public final synthetic f:Lxyz/happify/ckemv/MainActivity;

.field public final synthetic g:Ljava/io/File;


# direct methods
.method public constructor <init>(Lxyz/happify/ckemv/MainActivity;Ljava/io/File;LO1/d;)V
    .locals 0

    iput-object p1, p0, LB2/h;->f:Lxyz/happify/ckemv/MainActivity;

    iput-object p2, p0, LB2/h;->g:Ljava/io/File;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 2

    new-instance p2, LB2/h;

    iget-object v0, p0, LB2/h;->f:Lxyz/happify/ckemv/MainActivity;

    iget-object v1, p0, LB2/h;->g:Ljava/io/File;

    invoke-direct {p2, v0, v1, p1}, LB2/h;-><init>(Lxyz/happify/ckemv/MainActivity;Ljava/io/File;LO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, LB2/h;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, LB2/h;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, LB2/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object p1, p0, LB2/h;->g:Ljava/io/File;

    sget v0, Lxyz/happify/ckemv/MainActivity;->F:I

    iget-object v0, p0, LB2/h;->f:Lxyz/happify/ckemv/MainActivity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".fileprovider"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Landroidx/core/content/FileProvider;->c(Lxyz/happify/ckemv/MainActivity;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "application/vnd.android.package-archive"

    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const p1, 0x10000001

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
