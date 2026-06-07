.class public final Landroidx/fragment/app/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ln/k;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln/k;

    invoke-direct {v0}, Ln/k;-><init>()V

    sput-object v0, Landroidx/fragment/app/w;->b:Ln/k;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/B;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/w;->a:Landroidx/fragment/app/B;

    return-void
.end method

.method public static b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 3

    sget-object v0, Landroidx/fragment/app/w;->b:Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln/k;

    if-nez v2, :cond_0

    new-instance v2, Ln/k;

    invoke-direct {v2}, Ln/k;-><init>()V

    invoke-virtual {v0, p0, v2}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v2, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public static c(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 3

    const-string v0, "Unable to instantiate fragment "

    :try_start_0
    invoke-static {p0, p1}, Landroidx/fragment/app/w;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v1, LK1/b;

    const-string v2, ": make sure class is a valid subclass of Fragment"

    invoke-static {v0, p1, v2}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception p0

    new-instance v1, LK1/b;

    const-string v2, ": make sure class name exists"

    invoke-static {v0, p1, v2}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroidx/fragment/app/n;
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/w;->a:Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->e:Landroid/content/Context;

    const-string v1, ": make sure class name exists, is public, and has an empty constructor that is public"

    const-string v2, "Unable to instantiate fragment "

    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/fragment/app/w;->c(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/n;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_3

    :goto_0
    new-instance v1, LK1/b;

    const-string v3, ": calling Fragment constructor caused an exception"

    invoke-static {v2, p1, v3}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_1
    new-instance v1, LK1/b;

    const-string v3, ": could not find Fragment constructor"

    invoke-static {v2, p1, v3}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_2
    new-instance v3, LK1/b;

    invoke-static {v2, p1, v1}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :goto_3
    new-instance v3, LK1/b;

    invoke-static {v2, p1, v1}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
.end method
