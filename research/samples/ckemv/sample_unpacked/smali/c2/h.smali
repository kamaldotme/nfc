.class public final Lc2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/c;


# instance fields
.field public final a:Lc2/c;

.field public final b:LW1/l;


# direct methods
.method public constructor <init>(Ld2/c;LL1/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/h;->a:Lc2/c;

    iput-object p2, p0, Lc2/h;->b:LW1/l;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lc2/g;

    invoke-direct {v0, p0}, Lc2/g;-><init>(Lc2/h;)V

    return-object v0
.end method
