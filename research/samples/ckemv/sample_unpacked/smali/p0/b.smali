.class public abstract Lp0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Alarms"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;Lv0/j;I)V
    .locals 3

    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    sget v1, Lp0/c;->g:I

    new-instance v1, Landroid/content/Intent;

    const-class v2, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "ACTION_DELAY_MET"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {v1, p1}, Lp0/c;->c(Landroid/content/Intent;Lv0/j;)V

    const/high16 v2, 0x24000000

    invoke-static {p0, p2, v1, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    if-eqz p0, :cond_0

    if-eqz v0, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p1}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lv0/j;J)V
    .locals 9

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->q()Lv0/i;

    move-result-object v0

    invoke-virtual {v0, p2}, Lv0/i;->i(Lv0/j;)Lv0/g;

    move-result-object v1

    const/4 v2, 0x0

    const/high16 v3, 0xc000000

    const-string v4, "ACTION_DELAY_MET"

    const-class v5, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    const-string v6, "alarm"

    if-eqz v1, :cond_0

    iget p1, v1, Lv0/g;->c:I

    invoke-static {p0, p2, p1}, Lp0/b;->a(Landroid/content/Context;Lv0/j;I)V

    invoke-virtual {p0, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    sget v1, Lp0/c;->g:I

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {v1, p2}, Lp0/c;->c(Landroid/content/Intent;Lv0/j;)V

    invoke-static {p0, p1, v1, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    if-eqz v0, :cond_1

    invoke-static {v0, v2, p3, p4, p0}, Lp0/a;->a(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lw0/i;

    invoke-direct {v1, p1, v2}, Lw0/i;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    new-instance v7, Lw0/g;

    invoke-direct {v7, v1}, Lw0/g;-><init>(Lw0/i;)V

    invoke-virtual {p1, v7}, Landroidx/work/impl/WorkDatabase;->o(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "workDatabase.runInTransa\u2026ANAGER_ID_KEY)\n        })"

    invoke-static {p1, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v1, Lv0/g;

    iget-object v7, p2, Lv0/j;->a:Ljava/lang/String;

    iget v8, p2, Lv0/j;->b:I

    invoke-direct {v1, v8, p1, v7}, Lv0/g;-><init>(IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lv0/i;->j(Lv0/g;)V

    invoke-virtual {p0, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    sget v1, Lp0/c;->g:I

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {v1, p2}, Lp0/c;->c(Landroid/content/Intent;Lv0/j;)V

    invoke-static {p0, p1, v1, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    if-eqz v0, :cond_1

    invoke-static {v0, v2, p3, p4, p0}, Lp0/a;->a(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    :cond_1
    :goto_0
    return-void
.end method
