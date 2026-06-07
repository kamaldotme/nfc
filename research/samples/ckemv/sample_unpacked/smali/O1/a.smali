.class public abstract LO1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/g;


# instance fields
.field public final b:LO1/h;


# direct methods
.method public constructor <init>(LO1/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO1/a;->b:LO1/h;

    return-void
.end method


# virtual methods
.method public A(LO1/h;)LO1/g;
    .locals 0

    invoke-static {p0, p1}, Lu2/d;->l(LO1/g;LO1/h;)LO1/g;

    move-result-object p1

    return-object p1
.end method

.method public final D(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, LW1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()LO1/h;
    .locals 1

    iget-object v0, p0, LO1/a;->b:LO1/h;

    return-object v0
.end method

.method public i(LO1/h;)LO1/i;
    .locals 0

    invoke-static {p0, p1}, Lu2/d;->t(LO1/g;LO1/h;)LO1/i;

    move-result-object p1

    return-object p1
.end method

.method public final o(LO1/i;)LO1/i;
    .locals 0

    invoke-static {p0, p1}, Lu2/d;->x(LO1/g;LO1/i;)LO1/i;

    move-result-object p1

    return-object p1
.end method
