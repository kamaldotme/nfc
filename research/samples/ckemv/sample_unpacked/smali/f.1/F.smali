.class public final Lf/F;
.super Lv0/f;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lf/I;


# direct methods
.method public synthetic constructor <init>(Lf/I;I)V
    .locals 0

    iput p2, p0, Lf/F;->d:I

    iput-object p1, p0, Lf/F;->e:Lf/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lf/F;->e:Lf/I;

    iget v2, p0, Lf/F;->d:I

    packed-switch v2, :pswitch_data_0

    iput-object v0, v1, Lf/I;->t:Li/l;

    iget-object v0, v1, Lf/I;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_0
    iget-boolean v2, v1, Lf/I;->o:Z

    if-eqz v2, :cond_0

    iget-object v2, v1, Lf/I;->g:Landroid/view/View;

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationY(F)V

    iget-object v2, v1, Lf/I;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    iget-object v2, v1, Lf/I;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object v2, v1, Lf/I;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iput-object v0, v1, Lf/I;->t:Li/l;

    iget-object v2, v1, Lf/I;->k:Li/a;

    if-eqz v2, :cond_1

    iget-object v3, v1, Lf/I;->j:Lf/H;

    invoke-interface {v2, v3}, Li/a;->d(Li/b;)V

    iput-object v0, v1, Lf/I;->j:Lf/H;

    iput-object v0, v1, Lf/I;->k:Li/a;

    :cond_1
    iget-object v0, v1, Lf/I;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_2

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LJ/F;->c(Landroid/view/View;)V

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
