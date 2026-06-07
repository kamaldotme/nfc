.class public final Lm2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final synthetic b:I

.field public final c:J

.field public final d:Lz2/h;


# direct methods
.method public synthetic constructor <init>(JLz2/h;I)V
    .locals 0

    iput p4, p0, Lm2/s;->b:I

    iput-wide p1, p0, Lm2/s;->c:J

    iput-object p3, p0, Lm2/s;->d:Lz2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget v0, p0, Lm2/s;->b:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Lm2/s;->c:J

    return-wide v0

    :pswitch_0
    iget-wide v0, p0, Lm2/s;->c:J

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Lz2/h;
    .locals 1

    iget v0, p0, Lm2/s;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm2/s;->d:Lz2/h;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lm2/s;->d:Lz2/h;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    invoke-virtual {p0}, Lm2/s;->b()Lz2/h;

    move-result-object v0

    invoke-static {v0}, Ln2/b;->c(Ljava/io/Closeable;)V

    return-void
.end method
