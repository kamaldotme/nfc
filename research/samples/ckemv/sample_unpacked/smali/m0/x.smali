.class public interface abstract Lm0/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm0/w;

.field public static final b:Lm0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm0/w;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm0/x;->a:Lm0/w;

    new-instance v0, Lm0/v;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm0/x;->b:Lm0/v;

    return-void
.end method
