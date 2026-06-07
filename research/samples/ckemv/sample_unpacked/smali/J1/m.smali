.class public final LJ1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic b:LI1/y;

.field public final synthetic c:LJ1/n;


# direct methods
.method public constructor <init>(LJ1/n;LI1/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ1/m;->c:LJ1/n;

    iput-object p2, p0, LJ1/m;->b:LI1/y;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, LI1/y;

    check-cast p2, LI1/y;

    iget-object v0, p0, LJ1/m;->c:LJ1/n;

    iget-object v1, p0, LJ1/m;->b:LI1/y;

    invoke-virtual {v0, p1, v1}, LJ1/n;->a(LI1/y;LI1/y;)F

    move-result p1

    invoke-virtual {v0, p2, v1}, LJ1/n;->a(LI1/y;LI1/y;)F

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method
