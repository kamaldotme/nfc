.class public final enum Lj1/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:Lj1/c;

.field public static final enum d:Lj1/c;

.field public static final enum e:Lj1/c;

.field public static final enum f:Lj1/c;

.field public static final enum g:Lj1/c;

.field public static final enum h:Lj1/c;

.field public static final enum i:Lj1/c;

.field public static final enum j:Lj1/c;

.field public static final enum k:Lj1/c;

.field public static final enum l:Lj1/c;

.field public static final synthetic m:[Lj1/c;


# instance fields
.field public final b:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lj1/c;

    const-class v1, Ljava/lang/Object;

    const-string v2, "OTHER"

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lj1/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    new-instance v1, Lj1/c;

    const-string v2, "PURE_BARCODE"

    const/4 v3, 0x1

    const-class v4, Ljava/lang/Void;

    invoke-direct {v1, v3, v4, v2}, Lj1/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v1, Lj1/c;->c:Lj1/c;

    new-instance v2, Lj1/c;

    const-class v3, Ljava/util/List;

    const-string v5, "POSSIBLE_FORMATS"

    const/4 v6, 0x2

    invoke-direct {v2, v6, v3, v5}, Lj1/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v2, Lj1/c;->d:Lj1/c;

    new-instance v3, Lj1/c;

    const-string v5, "TRY_HARDER"

    const/4 v6, 0x3

    invoke-direct {v3, v6, v4, v5}, Lj1/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v3, Lj1/c;->e:Lj1/c;

    new-instance v5, Lj1/c;

    const-class v6, Ljava/lang/String;

    const-string v7, "CHARACTER_SET"

    const/4 v8, 0x4

    invoke-direct {v5, v8, v6, v7}, Lj1/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v5, Lj1/c;->f:Lj1/c;

    new-instance v6, Lj1/c;

    const-string v7, "ALLOWED_LENGTHS"

    const/4 v8, 0x5

    const-class v9, [I

    invoke-direct {v6, v8, v9, v7}, Lj1/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v6, Lj1/c;->g:Lj1/c;

    new-instance v7, Lj1/c;

    const-string v8, "ASSUME_CODE_39_CHECK_DIGIT"

    const/4 v10, 0x6

    invoke-direct {v7, v10, v4, v8}, Lj1/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v7, Lj1/c;->h:Lj1/c;

    new-instance v8, Lj1/c;

    const-string v10, "ASSUME_GS1"

    const/4 v11, 0x7

    invoke-direct {v8, v11, v4, v10}, Lj1/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v8, Lj1/c;->i:Lj1/c;

    new-instance v10, Lj1/c;

    const-string v11, "RETURN_CODABAR_START_END"

    const/16 v12, 0x8

    invoke-direct {v10, v12, v4, v11}, Lj1/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v10, Lj1/c;->j:Lj1/c;

    new-instance v11, Lj1/c;

    const-class v4, Lj1/o;

    const-string v12, "NEED_RESULT_POINT_CALLBACK"

    const/16 v13, 0x9

    invoke-direct {v11, v13, v4, v12}, Lj1/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v11, Lj1/c;->k:Lj1/c;

    new-instance v12, Lj1/c;

    const-string v4, "ALLOWED_EAN_EXTENSIONS"

    const/16 v13, 0xa

    invoke-direct {v12, v13, v9, v4}, Lj1/c;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v12, Lj1/c;->l:Lj1/c;

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    filled-new-array/range {v0 .. v10}, [Lj1/c;

    move-result-object v0

    sput-object v0, Lj1/c;->m:[Lj1/c;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Class;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p2, p0, Lj1/c;->b:Ljava/lang/Class;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj1/c;
    .locals 1

    const-class v0, Lj1/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj1/c;

    return-object p0
.end method

.method public static values()[Lj1/c;
    .locals 1

    sget-object v0, Lj1/c;->m:[Lj1/c;

    invoke-virtual {v0}, [Lj1/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj1/c;

    return-object v0
.end method
