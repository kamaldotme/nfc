.class public final Ln0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lu0/a;

.field public final c:Lv0/i;

.field public final d:Lm0/a;

.field public final e:Landroidx/work/impl/WorkDatabase;

.field public final f:Lv0/o;

.field public final g:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lm0/a;Lv0/i;Lu0/a;Landroidx/work/impl/WorkDatabase;Lv0/o;Ljava/util/ArrayList;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm0/r;

    invoke-direct {v0}, Lm0/r;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ln0/t;->a:Landroid/content/Context;

    iput-object p3, p0, Ln0/t;->c:Lv0/i;

    iput-object p4, p0, Ln0/t;->b:Lu0/a;

    iput-object p2, p0, Ln0/t;->d:Lm0/a;

    iput-object p5, p0, Ln0/t;->e:Landroidx/work/impl/WorkDatabase;

    iput-object p6, p0, Ln0/t;->f:Lv0/o;

    iput-object p7, p0, Ln0/t;->g:Ljava/util/List;

    return-void
.end method
