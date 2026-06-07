.class public final Lc2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic b:Lc2/c;


# direct methods
.method public constructor <init>(Ld2/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/f;->b:Lc2/c;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lc2/f;->b:Lc2/c;

    invoke-interface {v0}, Lc2/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
