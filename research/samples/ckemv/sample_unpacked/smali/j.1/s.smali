.class public final Lj/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final a:Landroid/view/MenuItem$OnMenuItemClickListener;

.field public final synthetic b:Lj/t;


# direct methods
.method public constructor <init>(Lj/t;Landroid/view/MenuItem$OnMenuItemClickListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/s;->b:Lj/t;

    iput-object p2, p0, Lj/s;->a:Landroid/view/MenuItem$OnMenuItemClickListener;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lj/s;->b:Lj/t;

    invoke-virtual {v0, p1}, LA1/f;->g(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    iget-object v0, p0, Lj/s;->a:Landroid/view/MenuItem$OnMenuItemClickListener;

    invoke-interface {v0, p1}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
