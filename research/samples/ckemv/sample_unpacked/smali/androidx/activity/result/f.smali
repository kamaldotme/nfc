.class public final Landroidx/activity/result/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/lifecycle/t;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/result/f;->a:Landroidx/lifecycle/t;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/activity/result/f;->b:Ljava/util/ArrayList;

    return-void
.end method
