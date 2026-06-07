.class public final Le0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:LJ1/l;

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;LJ1/l;ZZ)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/a;->a:Landroid/content/Context;

    iput-object p2, p0, Le0/a;->b:Ljava/lang/String;

    iput-object p3, p0, Le0/a;->c:LJ1/l;

    iput-boolean p4, p0, Le0/a;->d:Z

    iput-boolean p5, p0, Le0/a;->e:Z

    return-void
.end method
