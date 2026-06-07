.class public final Le2/g;
.super Le2/m;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile _resumed:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Le2/g;

    const-string v1, "_resumed"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Le2/g;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LO1/d;Ljava/lang/Throwable;Z)V
    .locals 0

    invoke-direct {p0, p2, p3}, Le2/m;-><init>(Ljava/lang/Throwable;Z)V

    const/4 p1, 0x0

    iput p1, p0, Le2/g;->_resumed:I

    return-void
.end method
