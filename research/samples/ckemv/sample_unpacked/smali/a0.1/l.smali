.class public final La0/l;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/a;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, La0/l;->c:I

    iput-object p2, p0, La0/l;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LX1/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, La0/l;->c:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, La0/l;->d:Ljava/lang/Object;

    check-cast v1, [Lh2/f;

    array-length v1, v1

    new-array v1, v1, [Lr0/c;

    return-object v1

    :pswitch_0
    :try_start_0
    iget-object v1, v0, La0/l;->d:Ljava/lang/Object;

    check-cast v1, LW1/a;

    invoke-interface {v1}, LW1/a;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v1, LL1/t;->b:LL1/t;

    :goto_0
    return-object v1

    :pswitch_1
    iget-object v1, v0, La0/l;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    return-object v1

    :pswitch_2
    iget-object v1, v0, La0/l;->d:Ljava/lang/Object;

    check-cast v1, Lf0/g;

    iget-object v2, v1, Lf0/g;->c:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-boolean v2, v1, Lf0/g;->e:Z

    if-eqz v2, :cond_0

    new-instance v2, Ljava/io/File;

    iget-object v3, v1, Lf0/g;->b:Landroid/content/Context;

    const-string v4, "context"

    invoke-static {v3, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v3

    const-string v4, "context.noBackupFilesDir"

    invoke-static {v3, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Lf0/g;->c:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v3, Lf0/f;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lf/G;

    const/4 v2, 0x1

    invoke-direct {v8, v2}, Lf/G;-><init>(I)V

    iget-object v9, v1, Lf0/g;->d:LJ1/l;

    iget-boolean v10, v1, Lf0/g;->f:Z

    iget-object v6, v1, Lf0/g;->b:Landroid/content/Context;

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, Lf0/f;-><init>(Landroid/content/Context;Ljava/lang/String;Lf/G;LJ1/l;Z)V

    goto :goto_1

    :cond_0
    new-instance v3, Lf0/f;

    new-instance v14, Lf/G;

    const/4 v2, 0x1

    invoke-direct {v14, v2}, Lf/G;-><init>(I)V

    iget-object v15, v1, Lf0/g;->d:LJ1/l;

    iget-boolean v2, v1, Lf0/g;->f:Z

    iget-object v12, v1, Lf0/g;->b:Landroid/content/Context;

    iget-object v13, v1, Lf0/g;->c:Ljava/lang/String;

    move-object v11, v3

    move/from16 v16, v2

    invoke-direct/range {v11 .. v16}, Lf0/f;-><init>(Landroid/content/Context;Ljava/lang/String;Lf/G;LJ1/l;Z)V

    :goto_1
    iget-boolean v1, v1, Lf0/g;->h:Z

    invoke-virtual {v3, v1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    return-object v3

    :pswitch_3
    const-string v1, "<this>"

    iget-object v2, v0, La0/l;->d:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/P;

    invoke-static {v2, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v3, LX1/k;->a:LX1/l;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, LX1/d;

    const-class v4, Landroidx/lifecycle/K;

    invoke-direct {v3, v4}, LX1/d;-><init>(Ljava/lang/Class;)V

    new-instance v5, LV/d;

    invoke-interface {v3}, LX1/c;->a()Ljava/lang/Class;

    move-result-object v3

    const-string v6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    invoke-static {v3, v6}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v3}, LV/d;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    new-array v5, v3, [LV/d;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LV/d;

    array-length v5, v1

    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LV/d;

    const-string v5, "initializers"

    invoke-static {v1, v5}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Landroidx/lifecycle/P;->c()Landroidx/lifecycle/O;

    move-result-object v5

    instance-of v6, v2, Landroidx/lifecycle/h;

    if-eqz v6, :cond_1

    check-cast v2, Landroidx/lifecycle/h;

    invoke-interface {v2}, Landroidx/lifecycle/h;->a()LV/b;

    move-result-object v2

    goto :goto_2

    :cond_1
    sget-object v2, LV/a;->b:LV/a;

    :goto_2
    const-string v6, "store"

    invoke-static {v5, v6}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "defaultCreationExtras"

    invoke-static {v2, v6}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v5, Landroidx/lifecycle/O;->a:Ljava/util/LinkedHashMap;

    const-string v6, "androidx.lifecycle.internal.SavedStateHandlesVM"

    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/lifecycle/M;

    invoke-virtual {v4, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const-string v1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    invoke-static {v7, v1}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    :cond_2
    new-instance v7, LV/c;

    invoke-direct {v7, v2}, LV/c;-><init>(LV/b;)V

    sget-object v2, Landroidx/lifecycle/N;->b:Landroidx/lifecycle/N;

    iget-object v8, v7, LV/b;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v8, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    array-length v2, v1

    const/4 v8, 0x0

    move-object v9, v8

    :goto_3
    if-ge v3, v2, :cond_5

    aget-object v10, v1, v3

    iget-object v11, v10, LV/d;->a:Ljava/lang/Class;

    invoke-static {v11, v4}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    iget-object v9, v10, LV/d;->b:LW1/l;

    invoke-interface {v9, v7}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Landroidx/lifecycle/M;

    if-eqz v10, :cond_3

    check-cast v9, Landroidx/lifecycle/M;
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :cond_3
    move-object v9, v8

    :cond_4
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    if-eqz v9, :cond_7

    invoke-interface {v5, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/M;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroidx/lifecycle/M;->a()V

    :cond_6
    move-object v7, v9

    :goto_5
    check-cast v7, Landroidx/lifecycle/K;

    return-object v7

    :cond_7
    :try_start_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "No initializer set for given class "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catch Ljava/lang/AbstractMethodError; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_4
    iget-object v1, v0, La0/l;->d:Ljava/lang/Object;

    check-cast v1, La0/m;

    invoke-virtual {v1}, La0/m;->m()Lf0/i;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
