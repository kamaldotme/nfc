.class public final Lr0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/g;


# instance fields
.field public final synthetic a:Lr0/e;

.field public final synthetic b:Lv0/o;


# direct methods
.method public constructor <init>(Lr0/e;Lv0/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/i;->a:Lr0/e;

    iput-object p2, p0, Lr0/i;->b:Lv0/o;

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Lr0/c;

    iget-object p1, p0, Lr0/i;->a:Lr0/e;

    iget-object v0, p0, Lr0/i;->b:Lv0/o;

    invoke-interface {p1, v0, p2}, Lr0/e;->c(Lv0/o;Lr0/c;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
