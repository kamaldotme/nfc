.class public final Li2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/g;


# instance fields
.field public final a:Lg2/u;


# direct methods
.method public constructor <init>(Lg2/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/r;->a:Lg2/u;

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li2/r;->a:Lg2/u;

    invoke-interface {v0, p1, p2}, Lg2/u;->g(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LP1/a;->b:LP1/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
