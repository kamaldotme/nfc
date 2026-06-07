.class public final Ll2/l;
.super Le2/r;
.source "SourceFile"


# static fields
.field public static final d:Ll2/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll2/l;

    invoke-direct {v0}, Le2/r;-><init>()V

    sput-object v0, Ll2/l;->d:Ll2/l;

    return-void
.end method


# virtual methods
.method public final I(LO1/i;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, Ll2/d;->e:Ll2/d;

    sget-object v0, Ll2/k;->h:Ll2/i;

    iget-object p1, p1, Ll2/g;->d:Ll2/b;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Ll2/b;->b(Ljava/lang/Runnable;Ll2/i;Z)V

    return-void
.end method

.method public final J(LO1/i;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, Ll2/d;->e:Ll2/d;

    sget-object v0, Ll2/k;->h:Ll2/i;

    iget-object p1, p1, Ll2/g;->d:Ll2/b;

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v0, v1}, Ll2/b;->b(Ljava/lang/Runnable;Ll2/i;Z)V

    return-void
.end method
