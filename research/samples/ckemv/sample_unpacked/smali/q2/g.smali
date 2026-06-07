.class public final Lq2/g;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq2/i;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "referent"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lq2/g;->a:Ljava/lang/Object;

    return-void
.end method
