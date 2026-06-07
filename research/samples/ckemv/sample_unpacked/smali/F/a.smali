.class public final LF/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LF/a;->a:LF/a;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 0

    invoke-static {p1}, Landroid/os/ext/SdkExtensions;->getExtensionVersion(I)I

    move-result p1

    return p1
.end method
