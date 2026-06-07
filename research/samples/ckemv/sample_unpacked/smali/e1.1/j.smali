.class public final Le1/j;
.super Lb1/x;
.source "SourceFile"


# static fields
.field public static final b:Le1/i;


# instance fields
.field public final a:Lb1/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le1/j;

    invoke-direct {v0}, Le1/j;-><init>()V

    new-instance v1, Le1/i;

    invoke-direct {v1, v0}, Le1/i;-><init>(Le1/j;)V

    sput-object v1, Le1/j;->b:Le1/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lb1/w;->c:Lb1/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le1/j;->a:Lb1/w;

    return-void
.end method


# virtual methods
.method public final a(Li1/a;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p1}, Li1/a;->W()I

    move-result v0

    invoke-static {v0}, Lq/h;->a(I)I

    move-result v1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Li1/a;->S()V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lb1/o;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expecting number, got: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, LX/d;->x(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Li1/a;->I(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v0, p0, Le1/j;->a:Lb1/w;

    invoke-virtual {v0, p1}, Lb1/w;->a(Li1/a;)Ljava/lang/Number;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final b(Li1/b;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p1, p2}, Li1/b;->P(Ljava/lang/Number;)V

    return-void
.end method
