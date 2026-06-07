.class public final synthetic Ld0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final synthetic b:Ld0/d;


# direct methods
.method public synthetic constructor <init>(Ld0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/a;->b:Ld0/d;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V
    .locals 1

    iget-object p1, p0, Ld0/a;->b:Ld0/d;

    const-string v0, "this$0"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/l;->ON_START:Landroidx/lifecycle/l;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, Ld0/d;->c:Z

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    if-ne p2, v0, :cond_1

    const/4 p2, 0x0

    iput-boolean p2, p1, Ld0/d;->c:Z

    :cond_1
    :goto_0
    return-void
.end method
