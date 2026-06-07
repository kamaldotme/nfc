.class public final Le2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/h;


# instance fields
.field public final b:LW1/l;

.field public final c:LO1/h;


# direct methods
.method public constructor <init>(LO1/h;LW1/l;)V
    .locals 1

    const-string v0, "baseKey"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le2/q;->b:LW1/l;

    instance-of p2, p1, Le2/q;

    if-eqz p2, :cond_0

    check-cast p1, Le2/q;

    iget-object p1, p1, Le2/q;->c:LO1/h;

    :cond_0
    iput-object p1, p0, Le2/q;->c:LO1/h;

    return-void
.end method


# virtual methods
.method public final a(LO1/g;)LO1/g;
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le2/q;->b:LW1/l;

    invoke-interface {v0, p1}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO1/g;

    return-object p1
.end method
