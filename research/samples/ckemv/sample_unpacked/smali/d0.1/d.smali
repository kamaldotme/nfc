.class public final Ld0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public e:Landroid/os/Parcelable;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lm/f;

    invoke-direct {v0}, Lm/f;-><init>()V

    iput-object v0, p0, Ld0/d;->d:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Ld0/d;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-object v0, p0, Ld0/d;->e:Landroid/os/Parcelable;

    iput-object v0, p0, Ld0/d;->f:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld0/d;->a:Z

    iput-boolean v0, p0, Ld0/d;->b:Z

    iput-object p1, p0, Ld0/d;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Ld0/d;->d:Ljava/lang/Object;

    check-cast v0, Landroid/widget/CompoundButton;

    invoke-static {v0}, LN/c;->a(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-boolean v2, p0, Ld0/d;->a:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Ld0/d;->b:Z

    if-eqz v2, :cond_4

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-boolean v2, p0, Ld0/d;->a:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Ld0/d;->e:Landroid/os/Parcelable;

    check-cast v2, Landroid/content/res/ColorStateList;

    invoke-static {v1, v2}, LB/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-boolean v2, p0, Ld0/d;->b:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Ld0/d;->f:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2}, LB/b;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Ld0/d;->d:Ljava/lang/Object;

    check-cast v0, Landroid/widget/CheckedTextView;

    invoke-virtual {v0}, Landroid/widget/CheckedTextView;->getCheckMarkDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-boolean v2, p0, Ld0/d;->a:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Ld0/d;->b:Z

    if-eqz v2, :cond_4

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-boolean v2, p0, Ld0/d;->a:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Ld0/d;->e:Landroid/os/Parcelable;

    check-cast v2, Landroid/content/res/ColorStateList;

    invoke-static {v1, v2}, LB/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-boolean v2, p0, Ld0/d;->b:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Ld0/d;->f:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2}, LB/b;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    return-void
.end method

.method public c(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3

    iget-boolean v0, p0, Ld0/d;->b:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ld0/d;->e:Landroid/os/Parcelable;

    check-cast v0, Landroid/os/Bundle;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iget-object v2, p0, Ld0/d;->e:Landroid/os/Parcelable;

    check-cast v2, Landroid/os/Bundle;

    if-eqz v2, :cond_0

    invoke-virtual {v2, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Ld0/d;->e:Landroid/os/Parcelable;

    check-cast p1, Landroid/os/Bundle;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iput-object v1, p0, Ld0/d;->e:Landroid/os/Parcelable;

    :goto_0
    return-object v0

    :cond_2
    return-object v1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Landroid/util/AttributeSet;I)V
    .locals 10

    iget-object v0, p0, Ld0/d;->d:Ljava/lang/Object;

    check-cast v0, Landroid/widget/CompoundButton;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v3, Le/a;->m:[I

    const/4 v7, 0x0

    invoke-static {v1, p1, v3, p2, v7}, Lv0/m;->F(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lv0/m;

    move-result-object v8

    iget-object v1, v8, Lv0/m;->d:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v1, v8, Lv0/m;->d:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Landroid/content/res/TypedArray;

    move-object v1, v0

    move-object v4, p1

    move v6, p2

    invoke-static/range {v1 .. v6}, LJ/T;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 p1, 0x1

    :try_start_0
    invoke-virtual {v9, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {v9, p1, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    :try_start_1
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, La/a;->s(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :cond_0
    :try_start_2
    invoke-virtual {v9, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v9, v7, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, La/a;->s(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    :goto_0
    const/4 p1, 0x2

    invoke-virtual {v9, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {v8, p1}, Lv0/m;->q(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {v0, p1}, LN/b;->c(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    :cond_2
    const/4 p1, 0x3

    invoke-virtual {v9, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, -0x1

    invoke-virtual {v9, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lk/o0;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-static {v0, p1}, LN/b;->d(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    invoke-virtual {v8}, Lv0/m;->J()V

    return-void

    :goto_1
    invoke-virtual {v8}, Lv0/m;->J()V

    throw p1
.end method

.method public e(Ljava/lang/String;Ld0/c;)V
    .locals 2

    const-string v0, "provider"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld0/d;->d:Ljava/lang/Object;

    check-cast v0, Lm/f;

    invoke-virtual {v0, p1}, Lm/f;->a(Ljava/lang/Object;)Lm/c;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object p1, v1, Lm/c;->b:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance v1, Lm/c;

    invoke-direct {v1, p1, p2}, Lm/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget p1, v0, Lm/f;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Lm/f;->e:I

    iget-object p1, v0, Lm/f;->c:Lm/c;

    if-nez p1, :cond_1

    iput-object v1, v0, Lm/f;->b:Lm/c;

    iput-object v1, v0, Lm/f;->c:Lm/c;

    goto :goto_0

    :cond_1
    iput-object v1, p1, Lm/c;->c:Lm/c;

    iput-object p1, v1, Lm/c;->d:Lm/c;

    iput-object v1, v0, Lm/f;->c:Lm/c;

    :goto_0
    const/4 p1, 0x0

    :goto_1
    check-cast p1, Ld0/c;

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SavedStateProvider with the given key is already registered"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()V
    .locals 5

    const-class v0, Landroidx/lifecycle/i;

    iget-boolean v1, p0, Ld0/d;->c:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Ld0/d;->f:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/o;

    if-nez v1, :cond_0

    new-instance v1, Landroidx/fragment/app/o;

    invoke-direct {v1, p0}, Landroidx/fragment/app/o;-><init>(Ld0/d;)V

    :cond_0
    iput-object v1, p0, Ld0/d;->f:Ljava/lang/Object;

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Ld0/d;->f:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/o;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v1, Landroidx/fragment/app/o;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashSet;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Class "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " must have default constructor in order to be automatically recreated"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
