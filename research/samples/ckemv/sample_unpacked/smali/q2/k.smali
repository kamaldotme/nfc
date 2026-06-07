.class public final Lq2/k;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/a;


# instance fields
.field public final synthetic c:Lm2/d;

.field public final synthetic d:Lm2/i;

.field public final synthetic e:Lm2/a;


# direct methods
.method public constructor <init>(Lm2/d;Lm2/i;Lm2/a;)V
    .locals 0

    iput-object p1, p0, Lq2/k;->c:Lm2/d;

    iput-object p2, p0, Lq2/k;->d:Lm2/i;

    iput-object p3, p0, Lq2/k;->e:Lm2/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LX1/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lq2/k;->c:Lm2/d;

    iget-object v0, v0, Lm2/d;->b:Lu2/l;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lq2/k;->d:Lm2/i;

    invoke-virtual {v1}, Lm2/i;->a()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lq2/k;->e:Lm2/a;

    iget-object v2, v2, Lm2/a;->h:Lm2/l;

    iget-object v2, v2, Lm2/l;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lu2/l;->d(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
