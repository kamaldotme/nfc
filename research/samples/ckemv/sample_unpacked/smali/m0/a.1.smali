.class public final Lm0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public final b:Ljava/util/concurrent/ExecutorService;

.field public final c:Lm0/r;

.field public final d:Lm0/B;

.field public final e:Lm0/r;

.field public final f:Lf/G;

.field public final g:I

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(Lm0/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    invoke-static {p1}, Lm0/z;->a(Z)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lm0/a;->a:Ljava/util/concurrent/ExecutorService;

    const/4 p1, 0x1

    invoke-static {p1}, Lm0/z;->a(Z)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lm0/a;->b:Ljava/util/concurrent/ExecutorService;

    new-instance p1, Lm0/r;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/a;->c:Lm0/r;

    new-instance p1, Lm0/B;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/a;->d:Lm0/B;

    sget-object p1, Lm0/r;->c:Lm0/r;

    iput-object p1, p0, Lm0/a;->e:Lm0/r;

    new-instance p1, Lf/G;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lf/G;-><init>(I)V

    iput-object p1, p0, Lm0/a;->f:Lf/G;

    const p1, 0x7fffffff

    iput p1, p0, Lm0/a;->g:I

    const/16 p1, 0x14

    iput p1, p0, Lm0/a;->i:I

    const/16 p1, 0x8

    iput p1, p0, Lm0/a;->h:I

    return-void
.end method
