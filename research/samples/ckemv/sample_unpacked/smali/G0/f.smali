.class public final LG0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:LU0/a;


# instance fields
.field public final a:LU0/c;

.field public final b:LU0/c;

.field public final c:LU0/c;

.field public final d:LU0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU0/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU0/a;-><init>(F)V

    sput-object v0, LG0/f;->e:LU0/a;

    return-void
.end method

.method public constructor <init>(LU0/c;LU0/c;LU0/c;LU0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG0/f;->a:LU0/c;

    iput-object p3, p0, LG0/f;->b:LU0/c;

    iput-object p4, p0, LG0/f;->c:LU0/c;

    iput-object p2, p0, LG0/f;->d:LU0/c;

    return-void
.end method
