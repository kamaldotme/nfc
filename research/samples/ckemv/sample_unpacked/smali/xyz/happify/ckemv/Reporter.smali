.class public final Lxyz/happify/ckemv/Reporter;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lxyz/happify/ckemv/Reporter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxyz/happify/ckemv/Reporter;

    invoke-direct {v0}, Lxyz/happify/ckemv/Reporter;-><init>()V

    sput-object v0, Lxyz/happify/ckemv/Reporter;->INSTANCE:Lxyz/happify/ckemv/Reporter;

    const-string v0, "ckemv_reporter"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native fetchCves(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public final native fetchReport(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public final native uploadHarvestData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method
