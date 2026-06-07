.class public final Lr0/f;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/l;


# static fields
.field public static final c:Lr0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr0/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LX1/h;-><init>(I)V

    sput-object v0, Lr0/f;->c:Lr0/f;

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ls0/e;

    const-string v0, "it"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
