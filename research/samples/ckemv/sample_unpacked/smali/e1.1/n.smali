.class public final Le1/n;
.super Le1/m;
.source "SourceFile"


# instance fields
.field public final b:Ld1/p;


# direct methods
.method public constructor <init>(Ld1/p;Ljava/util/LinkedHashMap;)V
    .locals 0

    invoke-direct {p0, p2}, Le1/m;-><init>(Ljava/util/LinkedHashMap;)V

    iput-object p1, p0, Le1/n;->b:Ld1/p;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le1/n;->b:Ld1/p;

    invoke-interface {v0}, Ld1/p;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final e(Ljava/lang/Object;Li1/a;Le1/l;)V
    .locals 2

    iget-object v0, p3, Le1/l;->i:Lb1/x;

    invoke-virtual {v0, p2}, Lb1/x;->a(Li1/a;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    iget-boolean v0, p3, Le1/l;->l:Z

    if-nez v0, :cond_2

    :cond_0
    iget-boolean v0, p3, Le1/l;->f:Z

    iget-object v1, p3, Le1/l;->b:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_1

    invoke-static {p1, v1}, Le1/p;->b(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    goto :goto_0

    :cond_1
    iget-boolean p3, p3, Le1/l;->m:Z

    if-nez p3, :cond_3

    :goto_0
    invoke-virtual {v1, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    const/4 p1, 0x0

    invoke-static {v1, p1}, Lg1/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lb1/o;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Cannot set value of \'static final\' "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
