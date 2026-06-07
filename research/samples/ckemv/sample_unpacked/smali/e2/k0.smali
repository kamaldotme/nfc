.class public final Le2/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/g;
.implements LO1/h;


# static fields
.field public static final b:Le2/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le2/k0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le2/k0;->b:Le2/k0;

    return-void
.end method


# virtual methods
.method public final A(LO1/h;)LO1/g;
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
    .locals 0

    return-object p0
.end method

.method public final i(LO1/h;)LO1/i;
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
