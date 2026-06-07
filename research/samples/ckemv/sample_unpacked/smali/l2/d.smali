.class public final Ll2/d;
.super Ll2/g;
.source "SourceFile"


# static fields
.field public static final e:Ll2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Ll2/d;

    sget v1, Ll2/k;->c:I

    sget v2, Ll2/k;->d:I

    sget-wide v3, Ll2/k;->e:J

    sget-object v5, Ll2/k;->a:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll2/g;-><init>(IIJLjava/lang/String;)V

    sput-object v6, Ll2/d;->e:Ll2/d;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method
