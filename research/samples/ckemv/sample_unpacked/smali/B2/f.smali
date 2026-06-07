.class public final LB2/f;
.super LQ1/b;
.source "SourceFile"


# instance fields
.field public e:Lxyz/happify/ckemv/MainActivity;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lxyz/happify/ckemv/MainActivity;

.field public j:I


# direct methods
.method public constructor <init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V
    .locals 0

    iput-object p1, p0, LB2/f;->i:Lxyz/happify/ckemv/MainActivity;

    invoke-direct {p0, p2}, LQ1/b;-><init>(LO1/d;)V

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LB2/f;->h:Ljava/lang/Object;

    iget p1, p0, LB2/f;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LB2/f;->j:I

    iget-object p1, p0, LB2/f;->i:Lxyz/happify/ckemv/MainActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lxyz/happify/ckemv/MainActivity;->w(Lxyz/happify/ckemv/MainActivity;Ljava/lang/String;Ljava/lang/String;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
