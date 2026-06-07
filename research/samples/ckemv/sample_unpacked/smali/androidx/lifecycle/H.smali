.class public final Landroidx/lifecycle/H;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/l;


# static fields
.field public static final c:Landroidx/lifecycle/H;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/H;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LX1/h;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/H;->c:Landroidx/lifecycle/H;

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, LV/b;

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/lifecycle/K;

    invoke-direct {p1}, Landroidx/lifecycle/K;-><init>()V

    return-object p1
.end method
