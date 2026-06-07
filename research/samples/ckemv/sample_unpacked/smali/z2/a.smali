.class public abstract Lz2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lz2/i;->e:Lz2/i;

    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    invoke-static {v0}, Ld1/e;->i(Ljava/lang/String;)Lz2/i;

    move-result-object v0

    iget-object v0, v0, Lz2/i;->b:[B

    sput-object v0, Lz2/a;->a:[B

    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    invoke-static {v0}, Ld1/e;->i(Ljava/lang/String;)Lz2/i;

    return-void
.end method
