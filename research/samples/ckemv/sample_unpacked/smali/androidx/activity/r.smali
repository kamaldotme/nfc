.class public final Landroidx/activity/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/activity/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/activity/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/activity/r;->a:Landroidx/activity/r;

    return-void
.end method


# virtual methods
.method public final a(LW1/l;LW1/l;LW1/a;LW1/a;)Landroid/window/OnBackInvokedCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LW1/l;",
            "LW1/l;",
            "LW1/a;",
            "LW1/a;",
            ")",
            "Landroid/window/OnBackInvokedCallback;"
        }
    .end annotation

    const-string v0, "onBackStarted"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackProgressed"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackInvoked"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackCancelled"

    invoke-static {p4, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/activity/q;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/activity/q;-><init>(LW1/l;LW1/l;LW1/a;LW1/a;)V

    return-object v0
.end method
