.class public final Lw0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/i;


# instance fields
.field public final a:Lv0/i;

.field public final b:Lu0/a;

.field public final c:Lv0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WMFgUpdater"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Lu0/a;Lv0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw0/t;->b:Lu0/a;

    iput-object p3, p0, Lw0/t;->a:Lv0/i;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object p1

    iput-object p1, p0, Lw0/t;->c:Lv0/p;

    return-void
.end method
