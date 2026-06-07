.class public final Lh2/i;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/p;


# static fields
.field public static final c:Lh2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh2/i;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, LX1/h;-><init>(I)V

    sput-object v0, Lh2/i;->c:Lh2/i;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
