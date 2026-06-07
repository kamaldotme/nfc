.class public final Lq2/n;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final b:Ljava/io/IOException;

.field public c:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, Lq2/n;->b:Ljava/io/IOException;

    iput-object p1, p0, Lq2/n;->c:Ljava/io/IOException;

    return-void
.end method
