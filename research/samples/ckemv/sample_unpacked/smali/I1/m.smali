.class public LI1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/o;


# instance fields
.field public final a:Lj1/j;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lj1/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LI1/m;->b:Ljava/util/ArrayList;

    iput-object p1, p0, LI1/m;->a:Lj1/j;

    return-void
.end method


# virtual methods
.method public final a(Lj1/n;)V
    .locals 1

    iget-object v0, p0, LI1/m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Lj1/i;)Lv0/e;
    .locals 2

    new-instance v0, Lv0/e;

    new-instance v1, Lp1/e;

    invoke-direct {v1, p1}, Lp1/e;-><init>(Lj1/f;)V

    invoke-direct {v0, v1}, Lv0/e;-><init>(Lp1/e;)V

    return-object v0
.end method
