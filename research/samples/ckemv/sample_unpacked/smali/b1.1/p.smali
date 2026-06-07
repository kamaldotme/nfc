.class public final Lb1/p;
.super Lb1/n;
.source "SourceFile"


# static fields
.field public static final b:Lb1/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb1/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb1/p;->b:Lb1/p;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lb1/p;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const-class v0, Lb1/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
