.class public abstract Lp2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public c:Lp2/c;

.field public d:J


# direct methods
.method public constructor <init>(ZLjava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lp2/a;->a:Ljava/lang/String;

    iput-boolean p1, p0, Lp2/a;->b:Z

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lp2/a;->d:J

    return-void
.end method


# virtual methods
.method public abstract a()J
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp2/a;->a:Ljava/lang/String;

    return-object v0
.end method
