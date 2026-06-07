.class public final synthetic Landroidx/activity/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW1/a;


# instance fields
.field public final synthetic b:Landroidx/activity/k;


# direct methods
.method public synthetic constructor <init>(Lf/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/d;->b:Landroidx/activity/k;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/activity/d;->b:Landroidx/activity/k;

    invoke-virtual {v0}, Landroidx/activity/k;->reportFullyDrawn()V

    const/4 v0, 0x0

    return-object v0
.end method
