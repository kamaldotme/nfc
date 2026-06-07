.class public final Ld2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/c;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:I

.field public final d:LW1/p;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILW1/p;)V
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld2/c;->a:Ljava/lang/CharSequence;

    iput p2, p0, Ld2/c;->b:I

    iput p3, p0, Ld2/c;->c:I

    iput-object p4, p0, Ld2/c;->d:LW1/p;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Ld2/b;

    invoke-direct {v0, p0}, Ld2/b;-><init>(Ld2/c;)V

    return-object v0
.end method
