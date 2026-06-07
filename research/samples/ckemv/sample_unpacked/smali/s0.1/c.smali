.class public final Ls0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ls0/e;

.field public final synthetic b:Lg2/r;


# direct methods
.method public constructor <init>(Ls0/e;Lg2/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/c;->a:Ls0/e;

    iput-object p2, p0, Ls0/c;->b:Lg2/r;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ls0/c;->a:Ls0/e;

    invoke-virtual {v0, p1}, Ls0/e;->c(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lr0/b;

    invoke-virtual {v0}, Ls0/e;->a()I

    move-result v0

    invoke-direct {p1, v0}, Lr0/b;-><init>(I)V

    goto :goto_0

    :cond_0
    sget-object p1, Lr0/a;->a:Lr0/a;

    :goto_0
    iget-object v0, p0, Ls0/c;->b:Lg2/r;

    check-cast v0, Lg2/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p1}, Lg2/q;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
