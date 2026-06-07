.class public final Le2/p;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/l;


# static fields
.field public static final c:Le2/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le2/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LX1/h;-><init>(I)V

    sput-object v0, Le2/p;->c:Le2/p;

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, LO1/g;

    instance-of v0, p1, Le2/r;

    if-eqz v0, :cond_0

    check-cast p1, Le2/r;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
