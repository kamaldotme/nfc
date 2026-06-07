.class public abstract Lt2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt2/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lt2/h;->a:Lt2/g;

    return-void
.end method


# virtual methods
.method public a(Lt2/q;Lt2/C;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract b(Lt2/y;)V
.end method
