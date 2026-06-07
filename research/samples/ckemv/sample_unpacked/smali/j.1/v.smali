.class public final Lj/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic b:Lj/x;


# direct methods
.method public constructor <init>(Lj/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/v;->b:Lj/x;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    iget-object v0, p0, Lj/v;->b:Lj/x;

    invoke-virtual {v0}, Lj/x;->c()V

    return-void
.end method
