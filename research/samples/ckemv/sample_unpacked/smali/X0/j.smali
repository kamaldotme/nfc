.class public final synthetic LX0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AutoCompleteTextView$OnDismissListener;


# instance fields
.field public final synthetic a:LX0/k;


# direct methods
.method public synthetic constructor <init>(LX0/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX0/j;->a:LX0/k;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 4

    const/4 v0, 0x1

    iget-object v1, p0, LX0/j;->a:LX0/k;

    iput-boolean v0, v1, LX0/k;->m:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, LX0/k;->o:J

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, LX0/k;->t(Z)V

    return-void
.end method
