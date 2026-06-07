.class public abstract Lj2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, LX/d;->k()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LL1/r;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, LL1/r;-><init>(ILjava/lang/Object;)V

    instance-of v0, v1, Lc2/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lc2/a;

    invoke-direct {v0, v1}, Lc2/a;-><init>(LL1/r;)V

    move-object v1, v0

    :goto_0
    invoke-static {v1}, Lc2/d;->Q(Lc2/c;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lj2/f;->a:Ljava/util/List;

    return-void
.end method
