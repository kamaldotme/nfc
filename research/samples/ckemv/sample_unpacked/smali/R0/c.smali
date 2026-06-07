.class public final LR0/c;
.super Lv0/f;
.source "SourceFile"


# instance fields
.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Landroid/text/TextPaint;

.field public final synthetic f:Lv0/f;

.field public final synthetic g:LR0/d;


# direct methods
.method public constructor <init>(LR0/d;Landroid/content/Context;Landroid/text/TextPaint;Lv0/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/c;->g:LR0/d;

    iput-object p2, p0, LR0/c;->d:Landroid/content/Context;

    iput-object p3, p0, LR0/c;->e:Landroid/text/TextPaint;

    iput-object p4, p0, LR0/c;->f:Lv0/f;

    return-void
.end method


# virtual methods
.method public final D(I)V
    .locals 1

    iget-object v0, p0, LR0/c;->f:Lv0/f;

    invoke-virtual {v0, p1}, Lv0/f;->D(I)V

    return-void
.end method

.method public final E(Landroid/graphics/Typeface;Z)V
    .locals 3

    iget-object v0, p0, LR0/c;->e:Landroid/text/TextPaint;

    iget-object v1, p0, LR0/c;->g:LR0/d;

    iget-object v2, p0, LR0/c;->d:Landroid/content/Context;

    invoke-virtual {v1, v2, v0, p1}, LR0/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, LR0/c;->f:Lv0/f;

    invoke-virtual {v0, p1, p2}, Lv0/f;->E(Landroid/graphics/Typeface;Z)V

    return-void
.end method
