.class public abstract Ll2/g;
.super Le2/J;
.source "SourceFile"


# instance fields
.field public final d:Ll2/b;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 7

    invoke-direct {p0}, Le2/r;-><init>()V

    new-instance v6, Ll2/b;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Ll2/b;-><init>(IIJLjava/lang/String;)V

    iput-object v6, p0, Ll2/g;->d:Ll2/b;

    return-void
.end method


# virtual methods
.method public final I(LO1/i;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Ll2/g;->d:Ll2/b;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p1, p2, v0, v1}, Ll2/b;->i(Ll2/b;Ljava/lang/Runnable;ZI)V

    return-void
.end method

.method public final J(LO1/i;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Ll2/g;->d:Ll2/b;

    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {p1, p2, v0, v1}, Ll2/b;->i(Ll2/b;Ljava/lang/Runnable;ZI)V

    return-void
.end method
