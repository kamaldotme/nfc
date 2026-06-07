.class public final Lt/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Lt/i;

.field public final c:Lt/h;

.field public final d:Lt/g;

.field public final e:Lt/j;

.field public f:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Lt/i;->a:I

    iput v1, v0, Lt/i;->b:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Lt/i;->c:F

    const/high16 v3, 0x7fc00000    # Float.NaN

    iput v3, v0, Lt/i;->d:F

    iput-object v0, p0, Lt/f;->b:Lt/i;

    new-instance v0, Lt/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v4, -0x1

    iput v4, v0, Lt/h;->a:I

    iput v4, v0, Lt/h;->b:I

    iput v3, v0, Lt/h;->c:F

    iput v3, v0, Lt/h;->d:F

    iput-object v0, p0, Lt/f;->c:Lt/h;

    new-instance v0, Lt/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, v0, Lt/g;->a:Z

    iput v4, v0, Lt/g;->d:I

    iput v4, v0, Lt/g;->e:I

    const/high16 v5, -0x40800000    # -1.0f

    iput v5, v0, Lt/g;->f:F

    iput v4, v0, Lt/g;->g:I

    iput v4, v0, Lt/g;->h:I

    iput v4, v0, Lt/g;->i:I

    iput v4, v0, Lt/g;->j:I

    iput v4, v0, Lt/g;->k:I

    iput v4, v0, Lt/g;->l:I

    iput v4, v0, Lt/g;->m:I

    iput v4, v0, Lt/g;->n:I

    iput v4, v0, Lt/g;->o:I

    iput v4, v0, Lt/g;->p:I

    iput v4, v0, Lt/g;->q:I

    iput v4, v0, Lt/g;->r:I

    iput v4, v0, Lt/g;->s:I

    const/high16 v6, 0x3f000000    # 0.5f

    iput v6, v0, Lt/g;->t:F

    iput v6, v0, Lt/g;->u:F

    const/4 v6, 0x0

    iput-object v6, v0, Lt/g;->v:Ljava/lang/String;

    iput v4, v0, Lt/g;->w:I

    iput v1, v0, Lt/g;->x:I

    const/4 v6, 0x0

    iput v6, v0, Lt/g;->y:F

    iput v4, v0, Lt/g;->z:I

    iput v4, v0, Lt/g;->A:I

    iput v4, v0, Lt/g;->B:I

    iput v4, v0, Lt/g;->C:I

    iput v4, v0, Lt/g;->D:I

    iput v4, v0, Lt/g;->E:I

    iput v4, v0, Lt/g;->F:I

    iput v4, v0, Lt/g;->G:I

    iput v4, v0, Lt/g;->H:I

    iput v4, v0, Lt/g;->I:I

    iput v4, v0, Lt/g;->J:I

    iput v4, v0, Lt/g;->K:I

    iput v4, v0, Lt/g;->L:I

    iput v4, v0, Lt/g;->M:I

    iput v4, v0, Lt/g;->N:I

    iput v5, v0, Lt/g;->O:F

    iput v5, v0, Lt/g;->P:F

    iput v1, v0, Lt/g;->Q:I

    iput v1, v0, Lt/g;->R:I

    iput v1, v0, Lt/g;->S:I

    iput v1, v0, Lt/g;->T:I

    iput v4, v0, Lt/g;->U:I

    iput v4, v0, Lt/g;->V:I

    iput v4, v0, Lt/g;->W:I

    iput v4, v0, Lt/g;->X:I

    iput v2, v0, Lt/g;->Y:F

    iput v2, v0, Lt/g;->Z:F

    iput v4, v0, Lt/g;->a0:I

    iput v1, v0, Lt/g;->b0:I

    iput v4, v0, Lt/g;->c0:I

    iput-boolean v1, v0, Lt/g;->g0:Z

    iput-boolean v1, v0, Lt/g;->h0:Z

    const/4 v4, 0x1

    iput-boolean v4, v0, Lt/g;->i0:Z

    iput-object v0, p0, Lt/f;->d:Lt/g;

    new-instance v0, Lt/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v6, v0, Lt/j;->a:F

    iput v6, v0, Lt/j;->b:F

    iput v6, v0, Lt/j;->c:F

    iput v2, v0, Lt/j;->d:F

    iput v2, v0, Lt/j;->e:F

    iput v3, v0, Lt/j;->f:F

    iput v3, v0, Lt/j;->g:F

    iput v6, v0, Lt/j;->h:F

    iput v6, v0, Lt/j;->i:F

    iput v6, v0, Lt/j;->j:F

    iput-boolean v1, v0, Lt/j;->k:Z

    iput v6, v0, Lt/j;->l:F

    iput-object v0, p0, Lt/f;->e:Lt/j;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lt/f;->f:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Lt/d;)V
    .locals 2

    iget-object v0, p0, Lt/f;->d:Lt/g;

    iget v1, v0, Lt/g;->g:I

    iput v1, p1, Lt/d;->d:I

    iget v1, v0, Lt/g;->h:I

    iput v1, p1, Lt/d;->e:I

    iget v1, v0, Lt/g;->i:I

    iput v1, p1, Lt/d;->f:I

    iget v1, v0, Lt/g;->j:I

    iput v1, p1, Lt/d;->g:I

    iget v1, v0, Lt/g;->k:I

    iput v1, p1, Lt/d;->h:I

    iget v1, v0, Lt/g;->l:I

    iput v1, p1, Lt/d;->i:I

    iget v1, v0, Lt/g;->m:I

    iput v1, p1, Lt/d;->j:I

    iget v1, v0, Lt/g;->n:I

    iput v1, p1, Lt/d;->k:I

    iget v1, v0, Lt/g;->o:I

    iput v1, p1, Lt/d;->l:I

    iget v1, v0, Lt/g;->p:I

    iput v1, p1, Lt/d;->p:I

    iget v1, v0, Lt/g;->q:I

    iput v1, p1, Lt/d;->q:I

    iget v1, v0, Lt/g;->r:I

    iput v1, p1, Lt/d;->r:I

    iget v1, v0, Lt/g;->s:I

    iput v1, p1, Lt/d;->s:I

    iget v1, v0, Lt/g;->C:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v0, Lt/g;->D:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v1, v0, Lt/g;->E:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v0, Lt/g;->F:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v0, Lt/g;->N:I

    iput v1, p1, Lt/d;->x:I

    iget v1, v0, Lt/g;->M:I

    iput v1, p1, Lt/d;->y:I

    iget v1, v0, Lt/g;->J:I

    iput v1, p1, Lt/d;->u:I

    iget v1, v0, Lt/g;->L:I

    iput v1, p1, Lt/d;->w:I

    iget v1, v0, Lt/g;->t:F

    iput v1, p1, Lt/d;->z:F

    iget v1, v0, Lt/g;->u:F

    iput v1, p1, Lt/d;->A:F

    iget v1, v0, Lt/g;->w:I

    iput v1, p1, Lt/d;->m:I

    iget v1, v0, Lt/g;->x:I

    iput v1, p1, Lt/d;->n:I

    iget v1, v0, Lt/g;->y:F

    iput v1, p1, Lt/d;->o:F

    iget-object v1, v0, Lt/g;->v:Ljava/lang/String;

    iput-object v1, p1, Lt/d;->B:Ljava/lang/String;

    iget v1, v0, Lt/g;->z:I

    iput v1, p1, Lt/d;->P:I

    iget v1, v0, Lt/g;->A:I

    iput v1, p1, Lt/d;->Q:I

    iget v1, v0, Lt/g;->O:F

    iput v1, p1, Lt/d;->E:F

    iget v1, v0, Lt/g;->P:F

    iput v1, p1, Lt/d;->D:F

    iget v1, v0, Lt/g;->R:I

    iput v1, p1, Lt/d;->G:I

    iget v1, v0, Lt/g;->Q:I

    iput v1, p1, Lt/d;->F:I

    iget-boolean v1, v0, Lt/g;->g0:Z

    iput-boolean v1, p1, Lt/d;->S:Z

    iget-boolean v1, v0, Lt/g;->h0:Z

    iput-boolean v1, p1, Lt/d;->T:Z

    iget v1, v0, Lt/g;->S:I

    iput v1, p1, Lt/d;->H:I

    iget v1, v0, Lt/g;->T:I

    iput v1, p1, Lt/d;->I:I

    iget v1, v0, Lt/g;->U:I

    iput v1, p1, Lt/d;->L:I

    iget v1, v0, Lt/g;->V:I

    iput v1, p1, Lt/d;->M:I

    iget v1, v0, Lt/g;->W:I

    iput v1, p1, Lt/d;->J:I

    iget v1, v0, Lt/g;->X:I

    iput v1, p1, Lt/d;->K:I

    iget v1, v0, Lt/g;->Y:F

    iput v1, p1, Lt/d;->N:F

    iget v1, v0, Lt/g;->Z:F

    iput v1, p1, Lt/d;->O:F

    iget v1, v0, Lt/g;->B:I

    iput v1, p1, Lt/d;->R:I

    iget v1, v0, Lt/g;->f:F

    iput v1, p1, Lt/d;->c:F

    iget v1, v0, Lt/g;->d:I

    iput v1, p1, Lt/d;->a:I

    iget v1, v0, Lt/g;->e:I

    iput v1, p1, Lt/d;->b:I

    iget v1, v0, Lt/g;->b:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v1, v0, Lt/g;->c:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v1, v0, Lt/g;->f0:Ljava/lang/String;

    if-eqz v1, :cond_0

    iput-object v1, p1, Lt/d;->U:Ljava/lang/String;

    :cond_0
    iget v1, v0, Lt/g;->H:I

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget v0, v0, Lt/g;->G:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p1}, Lt/d;->a()V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 5

    new-instance v0, Lt/f;

    invoke-direct {v0}, Lt/f;-><init>()V

    iget-object v1, v0, Lt/f;->d:Lt/g;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lt/f;->d:Lt/g;

    iget-boolean v3, v2, Lt/g;->a:Z

    iput-boolean v3, v1, Lt/g;->a:Z

    iget v3, v2, Lt/g;->b:I

    iput v3, v1, Lt/g;->b:I

    iget v3, v2, Lt/g;->c:I

    iput v3, v1, Lt/g;->c:I

    iget v3, v2, Lt/g;->d:I

    iput v3, v1, Lt/g;->d:I

    iget v3, v2, Lt/g;->e:I

    iput v3, v1, Lt/g;->e:I

    iget v3, v2, Lt/g;->f:F

    iput v3, v1, Lt/g;->f:F

    iget v3, v2, Lt/g;->g:I

    iput v3, v1, Lt/g;->g:I

    iget v3, v2, Lt/g;->h:I

    iput v3, v1, Lt/g;->h:I

    iget v3, v2, Lt/g;->i:I

    iput v3, v1, Lt/g;->i:I

    iget v3, v2, Lt/g;->j:I

    iput v3, v1, Lt/g;->j:I

    iget v3, v2, Lt/g;->k:I

    iput v3, v1, Lt/g;->k:I

    iget v3, v2, Lt/g;->l:I

    iput v3, v1, Lt/g;->l:I

    iget v3, v2, Lt/g;->m:I

    iput v3, v1, Lt/g;->m:I

    iget v3, v2, Lt/g;->n:I

    iput v3, v1, Lt/g;->n:I

    iget v3, v2, Lt/g;->o:I

    iput v3, v1, Lt/g;->o:I

    iget v3, v2, Lt/g;->p:I

    iput v3, v1, Lt/g;->p:I

    iget v3, v2, Lt/g;->q:I

    iput v3, v1, Lt/g;->q:I

    iget v3, v2, Lt/g;->r:I

    iput v3, v1, Lt/g;->r:I

    iget v3, v2, Lt/g;->s:I

    iput v3, v1, Lt/g;->s:I

    iget v3, v2, Lt/g;->t:F

    iput v3, v1, Lt/g;->t:F

    iget v3, v2, Lt/g;->u:F

    iput v3, v1, Lt/g;->u:F

    iget-object v3, v2, Lt/g;->v:Ljava/lang/String;

    iput-object v3, v1, Lt/g;->v:Ljava/lang/String;

    iget v3, v2, Lt/g;->w:I

    iput v3, v1, Lt/g;->w:I

    iget v3, v2, Lt/g;->x:I

    iput v3, v1, Lt/g;->x:I

    iget v3, v2, Lt/g;->y:F

    iput v3, v1, Lt/g;->y:F

    iget v3, v2, Lt/g;->z:I

    iput v3, v1, Lt/g;->z:I

    iget v3, v2, Lt/g;->A:I

    iput v3, v1, Lt/g;->A:I

    iget v3, v2, Lt/g;->B:I

    iput v3, v1, Lt/g;->B:I

    iget v3, v2, Lt/g;->C:I

    iput v3, v1, Lt/g;->C:I

    iget v3, v2, Lt/g;->D:I

    iput v3, v1, Lt/g;->D:I

    iget v3, v2, Lt/g;->E:I

    iput v3, v1, Lt/g;->E:I

    iget v3, v2, Lt/g;->F:I

    iput v3, v1, Lt/g;->F:I

    iget v3, v2, Lt/g;->G:I

    iput v3, v1, Lt/g;->G:I

    iget v3, v2, Lt/g;->H:I

    iput v3, v1, Lt/g;->H:I

    iget v3, v2, Lt/g;->I:I

    iput v3, v1, Lt/g;->I:I

    iget v3, v2, Lt/g;->J:I

    iput v3, v1, Lt/g;->J:I

    iget v3, v2, Lt/g;->K:I

    iput v3, v1, Lt/g;->K:I

    iget v3, v2, Lt/g;->L:I

    iput v3, v1, Lt/g;->L:I

    iget v3, v2, Lt/g;->M:I

    iput v3, v1, Lt/g;->M:I

    iget v3, v2, Lt/g;->N:I

    iput v3, v1, Lt/g;->N:I

    iget v3, v2, Lt/g;->O:F

    iput v3, v1, Lt/g;->O:F

    iget v3, v2, Lt/g;->P:F

    iput v3, v1, Lt/g;->P:F

    iget v3, v2, Lt/g;->Q:I

    iput v3, v1, Lt/g;->Q:I

    iget v3, v2, Lt/g;->R:I

    iput v3, v1, Lt/g;->R:I

    iget v3, v2, Lt/g;->S:I

    iput v3, v1, Lt/g;->S:I

    iget v3, v2, Lt/g;->T:I

    iput v3, v1, Lt/g;->T:I

    iget v3, v2, Lt/g;->U:I

    iput v3, v1, Lt/g;->U:I

    iget v3, v2, Lt/g;->V:I

    iput v3, v1, Lt/g;->V:I

    iget v3, v2, Lt/g;->W:I

    iput v3, v1, Lt/g;->W:I

    iget v3, v2, Lt/g;->X:I

    iput v3, v1, Lt/g;->X:I

    iget v3, v2, Lt/g;->Y:F

    iput v3, v1, Lt/g;->Y:F

    iget v3, v2, Lt/g;->Z:F

    iput v3, v1, Lt/g;->Z:F

    iget v3, v2, Lt/g;->a0:I

    iput v3, v1, Lt/g;->a0:I

    iget v3, v2, Lt/g;->b0:I

    iput v3, v1, Lt/g;->b0:I

    iget v3, v2, Lt/g;->c0:I

    iput v3, v1, Lt/g;->c0:I

    iget-object v3, v2, Lt/g;->f0:Ljava/lang/String;

    iput-object v3, v1, Lt/g;->f0:Ljava/lang/String;

    iget-object v3, v2, Lt/g;->d0:[I

    if-eqz v3, :cond_0

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, v1, Lt/g;->d0:[I

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    iput-object v3, v1, Lt/g;->d0:[I

    :goto_0
    iget-object v3, v2, Lt/g;->e0:Ljava/lang/String;

    iput-object v3, v1, Lt/g;->e0:Ljava/lang/String;

    iget-boolean v3, v2, Lt/g;->g0:Z

    iput-boolean v3, v1, Lt/g;->g0:Z

    iget-boolean v3, v2, Lt/g;->h0:Z

    iput-boolean v3, v1, Lt/g;->h0:Z

    iget-boolean v2, v2, Lt/g;->i0:Z

    iput-boolean v2, v1, Lt/g;->i0:Z

    iget-object v1, v0, Lt/f;->c:Lt/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lt/f;->c:Lt/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Lt/h;->a:I

    iput v3, v1, Lt/h;->a:I

    iget v3, v2, Lt/h;->b:I

    iput v3, v1, Lt/h;->b:I

    iget v3, v2, Lt/h;->d:F

    iput v3, v1, Lt/h;->d:F

    iget v2, v2, Lt/h;->c:F

    iput v2, v1, Lt/h;->c:F

    iget-object v1, v0, Lt/f;->b:Lt/i;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lt/f;->b:Lt/i;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Lt/i;->a:I

    iput v3, v1, Lt/i;->a:I

    iget v3, v2, Lt/i;->c:F

    iput v3, v1, Lt/i;->c:F

    iget v3, v2, Lt/i;->d:F

    iput v3, v1, Lt/i;->d:F

    iget v2, v2, Lt/i;->b:I

    iput v2, v1, Lt/i;->b:I

    iget-object v1, v0, Lt/f;->e:Lt/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lt/f;->e:Lt/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Lt/j;->a:F

    iput v3, v1, Lt/j;->a:F

    iget v3, v2, Lt/j;->b:F

    iput v3, v1, Lt/j;->b:F

    iget v3, v2, Lt/j;->c:F

    iput v3, v1, Lt/j;->c:F

    iget v3, v2, Lt/j;->d:F

    iput v3, v1, Lt/j;->d:F

    iget v3, v2, Lt/j;->e:F

    iput v3, v1, Lt/j;->e:F

    iget v3, v2, Lt/j;->f:F

    iput v3, v1, Lt/j;->f:F

    iget v3, v2, Lt/j;->g:F

    iput v3, v1, Lt/j;->g:F

    iget v3, v2, Lt/j;->h:F

    iput v3, v1, Lt/j;->h:F

    iget v3, v2, Lt/j;->i:F

    iput v3, v1, Lt/j;->i:F

    iget v3, v2, Lt/j;->j:F

    iput v3, v1, Lt/j;->j:F

    iget-boolean v3, v2, Lt/j;->k:Z

    iput-boolean v3, v1, Lt/j;->k:Z

    iget v2, v2, Lt/j;->l:F

    iput v2, v1, Lt/j;->l:F

    iget v1, p0, Lt/f;->a:I

    iput v1, v0, Lt/f;->a:I

    return-object v0
.end method
