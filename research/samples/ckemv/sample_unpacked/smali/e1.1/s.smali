.class public final Le1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/y;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Class;

.field public final synthetic d:Ljava/lang/Class;

.field public final synthetic e:Lb1/x;


# direct methods
.method public constructor <init>(Lb1/i;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le1/s;->b:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ljava/util/Calendar;

    iput-object v0, p0, Le1/s;->c:Ljava/lang/Class;

    const-class v0, Ljava/util/GregorianCalendar;

    iput-object v0, p0, Le1/s;->d:Ljava/lang/Class;

    iput-object p1, p0, Le1/s;->e:Lb1/x;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lb1/x;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le1/s;->b:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/s;->c:Ljava/lang/Class;

    iput-object p2, p0, Le1/s;->d:Ljava/lang/Class;

    iput-object p3, p0, Le1/s;->e:Lb1/x;

    return-void
.end method


# virtual methods
.method public final a(Lb1/l;Lcom/google/gson/reflect/TypeToken;)Lb1/x;
    .locals 0

    iget p1, p0, Le1/s;->b:I

    packed-switch p1, :pswitch_data_0

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p1

    iget-object p2, p0, Le1/s;->c:Ljava/lang/Class;

    if-eq p1, p2, :cond_1

    iget-object p2, p0, Le1/s;->d:Ljava/lang/Class;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Le1/s;->e:Lb1/x;

    :goto_1
    return-object p1

    :pswitch_0
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p1

    iget-object p2, p0, Le1/s;->c:Ljava/lang/Class;

    if-eq p1, p2, :cond_3

    iget-object p2, p0, Le1/s;->d:Ljava/lang/Class;

    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    iget-object p1, p0, Le1/s;->e:Lb1/x;

    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Le1/s;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Factory[type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le1/s;->c:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le1/s;->d:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",adapter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le1/s;->e:Lb1/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Factory[type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le1/s;->d:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le1/s;->c:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",adapter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le1/s;->e:Lb1/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
