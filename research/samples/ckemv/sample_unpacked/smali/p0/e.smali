.class public final Lp0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lm0/r;

.field public final c:I

.field public final d:Lf/G;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "ConstraintsCmdHandler"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm0/r;ILp0/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/e;->a:Landroid/content/Context;

    iput-object p2, p0, Lp0/e;->b:Lm0/r;

    iput p3, p0, Lp0/e;->c:I

    iget-object p1, p4, Lp0/j;->f:Ln0/s;

    iget-object p1, p1, Ln0/s;->m:Lv0/i;

    new-instance p2, Lf/G;

    invoke-direct {p2, p1}, Lf/G;-><init>(Lv0/i;)V

    iput-object p2, p0, Lp0/e;->d:Lf/G;

    return-void
.end method
