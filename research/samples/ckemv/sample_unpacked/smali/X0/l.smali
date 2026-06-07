.class public final LX0/l;
.super LO0/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:LX0/p;


# direct methods
.method public constructor <init>(LX0/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX0/l;->b:LX0/p;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    iget-object p1, p0, LX0/l;->b:LX0/p;

    invoke-virtual {p1}, LX0/p;->b()LX0/q;

    move-result-object p1

    invoke-virtual {p1}, LX0/q;->a()V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget-object p1, p0, LX0/l;->b:LX0/p;

    invoke-virtual {p1}, LX0/p;->b()LX0/q;

    move-result-object p1

    invoke-virtual {p1}, LX0/q;->b()V

    return-void
.end method
