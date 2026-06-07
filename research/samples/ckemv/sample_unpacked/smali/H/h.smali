.class public abstract LH/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA1/h;

.field public static final b:LA1/h;

.field public static final c:LA1/h;

.field public static final d:LA1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LA1/h;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LA1/h;-><init>(LH/g;Z)V

    sput-object v0, LH/h;->a:LA1/h;

    new-instance v0, LA1/h;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, LA1/h;-><init>(LH/g;Z)V

    sput-object v0, LH/h;->b:LA1/h;

    new-instance v0, LA1/h;

    sget-object v1, LH/g;->a:LH/g;

    invoke-direct {v0, v1, v2}, LA1/h;-><init>(LH/g;Z)V

    sput-object v0, LH/h;->c:LA1/h;

    new-instance v0, LA1/h;

    invoke-direct {v0, v1, v3}, LA1/h;-><init>(LH/g;Z)V

    sput-object v0, LH/h;->d:LA1/h;

    return-void
.end method
