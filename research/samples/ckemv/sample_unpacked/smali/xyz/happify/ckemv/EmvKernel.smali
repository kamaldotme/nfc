.class public final Lxyz/happify/ckemv/EmvKernel;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lxyz/happify/ckemv/EmvKernel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxyz/happify/ckemv/EmvKernel;

    invoke-direct {v0}, Lxyz/happify/ckemv/EmvKernel;-><init>()V

    sput-object v0, Lxyz/happify/ckemv/EmvKernel;->INSTANCE:Lxyz/happify/ckemv/EmvKernel;

    const-string v0, "ckemv_android"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native getAid()Ljava/lang/String;
.end method

.method public final native getArqc()Ljava/lang/String;
.end method

.method public final native getAtc()Ljava/lang/String;
.end method

.method public final native getNextCommand()Ljava/lang/String;
.end method

.method public final native getPan()Ljava/lang/String;
.end method

.method public final native getRawData()Ljava/lang/String;
.end method

.method public final native getStatus()Ljava/lang/String;
.end method

.method public final native getTxParameters()Ljava/lang/String;
.end method

.method public final native initialize(ZLjava/lang/String;)V
.end method

.method public final native processResponse(Ljava/lang/String;)Ljava/lang/String;
.end method
