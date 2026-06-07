.class public abstract LX1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb2/a;
.implements Ljava/io/Serializable;


# instance fields
.field public transient b:Lb2/a;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Class;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX1/b;->c:Ljava/lang/Object;

    iput-object p2, p0, LX1/b;->d:Ljava/lang/Class;

    iput-object p3, p0, LX1/b;->e:Ljava/lang/String;

    iput-object p4, p0, LX1/b;->f:Ljava/lang/String;

    iput-boolean p5, p0, LX1/b;->g:Z

    return-void
.end method


# virtual methods
.method public final b()LX1/c;
    .locals 2

    iget-object v0, p0, LX1/b;->d:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    iget-boolean v1, p0, LX1/b;->g:Z

    if-eqz v1, :cond_1

    sget-object v1, LX1/k;->a:LX1/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LX1/i;

    invoke-direct {v1, v0}, LX1/i;-><init>(Ljava/lang/Class;)V

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_1
    sget-object v1, LX1/k;->a:LX1/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LX1/d;

    invoke-direct {v1, v0}, LX1/d;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :goto_1
    return-object v0
.end method
