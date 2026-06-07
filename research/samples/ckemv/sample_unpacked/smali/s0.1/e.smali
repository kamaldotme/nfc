.class public abstract Ls0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt0/e;


# direct methods
.method public constructor <init>(Lt0/e;)V
    .locals 1

    const-string v0, "tracker"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/e;->a:Lt0/e;

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b(Lv0/o;)Z
.end method

.method public abstract c(Ljava/lang/Object;)Z
.end method
