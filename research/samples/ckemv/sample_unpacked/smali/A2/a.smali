.class public abstract LA2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ld2/a;->a:Ljava/nio/charset/Charset;

    const-string v1, "0123456789abcdef"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LA2/a;->a:[B

    return-void
.end method

.method public static final a(Lz2/f;J)Ljava/lang/String;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const-wide/16 v1, 0x1

    if-lez v0, :cond_0

    sub-long v3, p1, v1

    invoke-virtual {p0, v3, v4}, Lz2/f;->b(J)B

    move-result v0

    const/16 v5, 0xd

    if-ne v0, v5, :cond_0

    sget-object p1, Ld2/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v3, v4, p1}, Lz2/f;->A(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lz2/f;->u(J)V

    goto :goto_0

    :cond_0
    sget-object v0, Ld2/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1, p2, v0}, Lz2/f;->A(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v1, v2}, Lz2/f;->u(J)V

    :goto_0
    return-object p1
.end method
