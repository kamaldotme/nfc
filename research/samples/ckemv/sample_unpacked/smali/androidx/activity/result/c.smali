.class public final Landroidx/activity/result/c;
.super Lv0/f;
.source "SourceFile"


# instance fields
.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:La/a;

.field public final synthetic f:Landroidx/activity/result/g;


# direct methods
.method public constructor <init>(Landroidx/activity/result/g;Ljava/lang/String;LI1/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/result/c;->f:Landroidx/activity/result/g;

    iput-object p2, p0, Landroidx/activity/result/c;->d:Ljava/lang/String;

    iput-object p3, p0, Landroidx/activity/result/c;->e:La/a;

    return-void
.end method


# virtual methods
.method public final Q(Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Landroidx/activity/result/c;->f:Landroidx/activity/result/g;

    iget-object v1, v0, Landroidx/activity/result/g;->b:Ljava/util/HashMap;

    iget-object v2, p0, Landroidx/activity/result/c;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iget-object v3, p0, Landroidx/activity/result/c;->e:La/a;

    if-eqz v1, :cond_0

    iget-object v4, v0, Landroidx/activity/result/g;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    check-cast p1, LI1/x;

    invoke-virtual {v0, v1, v3, p1}, Landroidx/activity/result/g;->b(ILa/a;LI1/x;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, v0, Landroidx/activity/result/g;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to launch an unregistered ActivityResultLauncher with contract "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " and input "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". You must ensure the ActivityResultLauncher is registered before calling launch()."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
