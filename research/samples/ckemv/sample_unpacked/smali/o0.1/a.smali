.class public final Lo0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic e:I


# instance fields
.field public final a:Ln0/i;

.field public final b:Lf/G;

.field public final c:Lm0/r;

.field public final d:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "DelayedWorkTracker"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ln0/i;Lf/G;Lm0/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/a;->a:Ln0/i;

    iput-object p2, p0, Lo0/a;->b:Lf/G;

    iput-object p3, p0, Lo0/a;->c:Lm0/r;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lo0/a;->d:Ljava/util/HashMap;

    return-void
.end method
