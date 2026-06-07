.class public final Le1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/reflect/Field;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z

.field public final synthetic f:Z

.field public final synthetic g:Ljava/lang/reflect/Method;

.field public final synthetic h:Z

.field public final synthetic i:Lb1/x;

.field public final synthetic j:Lb1/l;

.field public final synthetic k:Lcom/google/gson/reflect/TypeToken;

.field public final synthetic l:Z

.field public final synthetic m:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;ZZZLjava/lang/reflect/Method;ZLb1/x;Lb1/l;Lcom/google/gson/reflect/TypeToken;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p5, p0, Le1/l;->f:Z

    iput-object p6, p0, Le1/l;->g:Ljava/lang/reflect/Method;

    iput-boolean p7, p0, Le1/l;->h:Z

    iput-object p8, p0, Le1/l;->i:Lb1/x;

    iput-object p9, p0, Le1/l;->j:Lb1/l;

    iput-object p10, p0, Le1/l;->k:Lcom/google/gson/reflect/TypeToken;

    iput-boolean p11, p0, Le1/l;->l:Z

    iput-boolean p12, p0, Le1/l;->m:Z

    iput-object p1, p0, Le1/l;->a:Ljava/lang/String;

    iput-object p2, p0, Le1/l;->b:Ljava/lang/reflect/Field;

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le1/l;->c:Ljava/lang/String;

    iput-boolean p3, p0, Le1/l;->d:Z

    iput-boolean p4, p0, Le1/l;->e:Z

    return-void
.end method


# virtual methods
.method public final a(Li1/b;Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Le1/l;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Le1/l;->f:Z

    iget-object v1, p0, Le1/l;->b:Ljava/lang/reflect/Field;

    iget-object v2, p0, Le1/l;->g:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2

    if-nez v2, :cond_1

    invoke-static {p2, v1}, Le1/p;->b(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    goto :goto_0

    :cond_1
    invoke-static {p2, v2}, Le1/p;->b(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v2, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    invoke-static {v2, p2}, Lg1/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lb1/o;

    const-string v1, "Accessor "

    const-string v2, " threw exception"

    invoke-static {v1, p2, v2}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    invoke-virtual {v1, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    if-ne v0, p2, :cond_4

    return-void

    :cond_4
    iget-object p2, p0, Le1/l;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Li1/b;->G(Ljava/lang/String;)V

    iget-boolean p2, p0, Le1/l;->h:Z

    iget-object v1, p0, Le1/l;->i:Lb1/x;

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    new-instance p2, Le1/q;

    iget-object v2, p0, Le1/l;->k:Lcom/google/gson/reflect/TypeToken;

    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    iget-object v3, p0, Le1/l;->j:Lb1/l;

    invoke-direct {p2, v3, v1, v2}, Le1/q;-><init>(Lb1/l;Lb1/x;Ljava/lang/reflect/Type;)V

    move-object v1, p2

    :goto_2
    invoke-virtual {v1, p1, v0}, Lb1/x;->b(Li1/b;Ljava/lang/Object;)V

    return-void
.end method
