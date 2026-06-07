.class public final synthetic LX/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LX/b;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LX/b;ILjava/io/Serializable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX/a;->b:LX/b;

    iput p2, p0, LX/a;->c:I

    iput-object p3, p0, LX/a;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LX/a;->b:LX/b;

    iget-object v0, v0, LX/b;->b:LX/f;

    iget v1, p0, LX/a;->c:I

    iget-object v2, p0, LX/a;->d:Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, LX/f;->m(ILjava/lang/Object;)V

    return-void
.end method
