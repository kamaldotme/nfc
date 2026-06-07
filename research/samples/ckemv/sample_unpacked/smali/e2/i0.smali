.class public final Le2/i0;
.super Le2/r;
.source "SourceFile"


# static fields
.field public static final synthetic d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le2/i0;

    invoke-direct {v0}, Le2/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final I(LO1/i;Ljava/lang/Runnable;)V
    .locals 0

    sget-object p2, Le2/m0;->d:Le2/s;

    invoke-interface {p1, p2}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object p1

    check-cast p1, Le2/m0;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, Le2/m0;->c:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method
