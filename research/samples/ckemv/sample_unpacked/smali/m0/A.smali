.class public abstract Lm0/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/UUID;

.field public final b:Lv0/o;

.field public final c:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lv0/o;Ljava/util/LinkedHashSet;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workSpec"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/A;->a:Ljava/util/UUID;

    iput-object p2, p0, Lm0/A;->b:Lv0/o;

    iput-object p3, p0, Lm0/A;->c:Ljava/util/Set;

    return-void
.end method
