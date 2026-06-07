.class public final Lv0/b;
.super La0/m;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public constructor <init>(Landroidx/work/impl/WorkDatabase;I)V
    .locals 0

    iput p2, p0, Lv0/b;->d:I

    const-string p2, "database"

    invoke-static {p1, p2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, La0/m;-><init>(Landroidx/work/impl/WorkDatabase;)V

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lv0/b;->d:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"

    return-object v0

    :pswitch_0
    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0

    :pswitch_1
    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    return-object v0

    :pswitch_2
    const-string v0, "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)"

    return-object v0

    :pswitch_3
    const-string v0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)"

    return-object v0

    :pswitch_4
    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    return-object v0

    :pswitch_5
    const-string v0, "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final s(Lf0/i;Ljava/lang/Object;)V
    .locals 10

    iget v0, p0, Lv0/b;->d:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Lv0/q;

    iget-object v0, p2, Lv0/q;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Le0/d;->g(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v0, v1}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_0
    const/4 v0, 0x2

    iget-object p2, p2, Lv0/q;->b:Ljava/lang/String;

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Le0/d;->g(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, p2, v0}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_1
    return-void

    :pswitch_0
    check-cast p2, Lv0/o;

    const/4 v0, 0x1

    iget-object v1, p2, Lv0/o;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    invoke-interface {p1, v0}, Le0/d;->g(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_2
    iget v1, p2, Lv0/o;->b:I

    invoke-static {v1}, Lu2/l;->N(I)I

    move-result v1

    const/4 v2, 0x2

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Le0/d;->x(IJ)V

    iget-object v1, p2, Lv0/o;->c:Ljava/lang/String;

    const/4 v2, 0x3

    if-nez v1, :cond_3

    invoke-interface {p1, v2}, Le0/d;->g(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v2}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_3
    iget-object v1, p2, Lv0/o;->d:Ljava/lang/String;

    const/4 v2, 0x4

    if-nez v1, :cond_4

    invoke-interface {p1, v2}, Le0/d;->g(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v2}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_4
    iget-object v1, p2, Lv0/o;->e:Lm0/g;

    invoke-static {v1}, Lm0/g;->b(Lm0/g;)[B

    move-result-object v1

    const/4 v2, 0x5

    if-nez v1, :cond_5

    invoke-interface {p1, v2}, Le0/d;->g(I)V

    goto :goto_5

    :cond_5
    invoke-interface {p1, v2, v1}, Le0/d;->f(I[B)V

    :goto_5
    iget-object v1, p2, Lv0/o;->f:Lm0/g;

    invoke-static {v1}, Lm0/g;->b(Lm0/g;)[B

    move-result-object v1

    const/4 v2, 0x6

    if-nez v1, :cond_6

    invoke-interface {p1, v2}, Le0/d;->g(I)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v2, v1}, Le0/d;->f(I[B)V

    :goto_6
    const/4 v1, 0x7

    iget-wide v2, p2, Lv0/o;->g:J

    invoke-interface {p1, v1, v2, v3}, Le0/d;->x(IJ)V

    const/16 v1, 0x8

    iget-wide v2, p2, Lv0/o;->h:J

    invoke-interface {p1, v1, v2, v3}, Le0/d;->x(IJ)V

    const/16 v1, 0x9

    iget-wide v2, p2, Lv0/o;->i:J

    invoke-interface {p1, v1, v2, v3}, Le0/d;->x(IJ)V

    iget v1, p2, Lv0/o;->k:I

    int-to-long v1, v1

    const/16 v3, 0xa

    invoke-interface {p1, v3, v1, v2}, Le0/d;->x(IJ)V

    iget v1, p2, Lv0/o;->l:I

    const-string v2, "backoffPolicy"

    invoke-static {v2, v1}, LX/d;->o(Ljava/lang/String;I)V

    invoke-static {v1}, Lq/h;->a(I)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    if-ne v1, v0, :cond_7

    move v1, v0

    goto :goto_7

    :cond_7
    new-instance p1, LK1/b;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_8
    move v1, v2

    :goto_7
    const/16 v3, 0xb

    int-to-long v4, v1

    invoke-interface {p1, v3, v4, v5}, Le0/d;->x(IJ)V

    const/16 v1, 0xc

    iget-wide v3, p2, Lv0/o;->m:J

    invoke-interface {p1, v1, v3, v4}, Le0/d;->x(IJ)V

    const/16 v1, 0xd

    iget-wide v3, p2, Lv0/o;->n:J

    invoke-interface {p1, v1, v3, v4}, Le0/d;->x(IJ)V

    const/16 v1, 0xe

    iget-wide v3, p2, Lv0/o;->o:J

    invoke-interface {p1, v1, v3, v4}, Le0/d;->x(IJ)V

    const/16 v1, 0xf

    iget-wide v3, p2, Lv0/o;->p:J

    invoke-interface {p1, v1, v3, v4}, Le0/d;->x(IJ)V

    iget-boolean v1, p2, Lv0/o;->q:Z

    const/16 v3, 0x10

    int-to-long v4, v1

    invoke-interface {p1, v3, v4, v5}, Le0/d;->x(IJ)V

    iget v1, p2, Lv0/o;->r:I

    const-string v3, "policy"

    invoke-static {v3, v1}, LX/d;->o(Ljava/lang/String;I)V

    invoke-static {v1}, Lq/h;->a(I)I

    move-result v1

    if-eqz v1, :cond_a

    if-ne v1, v0, :cond_9

    goto :goto_8

    :cond_9
    new-instance p1, LK1/b;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_a
    move v0, v2

    :goto_8
    const/16 v1, 0x11

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Le0/d;->x(IJ)V

    iget v0, p2, Lv0/o;->s:I

    int-to-long v0, v0

    const/16 v2, 0x12

    invoke-interface {p1, v2, v0, v1}, Le0/d;->x(IJ)V

    iget v0, p2, Lv0/o;->t:I

    int-to-long v0, v0

    const/16 v2, 0x13

    invoke-interface {p1, v2, v0, v1}, Le0/d;->x(IJ)V

    iget-wide v0, p2, Lv0/o;->u:J

    const/16 v2, 0x14

    invoke-interface {p1, v2, v0, v1}, Le0/d;->x(IJ)V

    iget v0, p2, Lv0/o;->v:I

    int-to-long v0, v0

    const/16 v2, 0x15

    invoke-interface {p1, v2, v0, v1}, Le0/d;->x(IJ)V

    iget v0, p2, Lv0/o;->w:I

    int-to-long v0, v0

    const/16 v2, 0x16

    invoke-interface {p1, v2, v0, v1}, Le0/d;->x(IJ)V

    iget-object p2, p2, Lv0/o;->j:Lm0/d;

    const/16 v0, 0x1e

    const/16 v1, 0x1d

    const/16 v2, 0x1c

    const/16 v3, 0x1b

    const/16 v4, 0x1a

    const/16 v5, 0x19

    const/16 v6, 0x18

    const/16 v7, 0x17

    if-eqz p2, :cond_b

    iget v8, p2, Lm0/d;->a:I

    invoke-static {v8}, Lu2/l;->B(I)I

    move-result v8

    int-to-long v8, v8

    invoke-interface {p1, v7, v8, v9}, Le0/d;->x(IJ)V

    iget-boolean v7, p2, Lm0/d;->b:Z

    int-to-long v7, v7

    invoke-interface {p1, v6, v7, v8}, Le0/d;->x(IJ)V

    iget-boolean v6, p2, Lm0/d;->c:Z

    int-to-long v6, v6

    invoke-interface {p1, v5, v6, v7}, Le0/d;->x(IJ)V

    iget-boolean v5, p2, Lm0/d;->d:Z

    int-to-long v5, v5

    invoke-interface {p1, v4, v5, v6}, Le0/d;->x(IJ)V

    iget-boolean v4, p2, Lm0/d;->e:Z

    int-to-long v4, v4

    invoke-interface {p1, v3, v4, v5}, Le0/d;->x(IJ)V

    iget-wide v3, p2, Lm0/d;->f:J

    invoke-interface {p1, v2, v3, v4}, Le0/d;->x(IJ)V

    iget-wide v2, p2, Lm0/d;->g:J

    invoke-interface {p1, v1, v2, v3}, Le0/d;->x(IJ)V

    iget-object p2, p2, Lm0/d;->h:Ljava/util/Set;

    invoke-static {p2}, Lu2/l;->I(Ljava/util/Set;)[B

    move-result-object p2

    invoke-interface {p1, v0, p2}, Le0/d;->f(I[B)V

    goto :goto_9

    :cond_b
    invoke-interface {p1, v7}, Le0/d;->g(I)V

    invoke-interface {p1, v6}, Le0/d;->g(I)V

    invoke-interface {p1, v5}, Le0/d;->g(I)V

    invoke-interface {p1, v4}, Le0/d;->g(I)V

    invoke-interface {p1, v3}, Le0/d;->g(I)V

    invoke-interface {p1, v2}, Le0/d;->g(I)V

    invoke-interface {p1, v1}, Le0/d;->g(I)V

    invoke-interface {p1, v0}, Le0/d;->g(I)V

    :goto_9
    return-void

    :pswitch_1
    invoke-static {p2}, LX/d;->n(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_2
    check-cast p2, Lv0/k;

    iget-object v0, p2, Lv0/k;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_c

    invoke-interface {p1, v1}, Le0/d;->g(I)V

    goto :goto_a

    :cond_c
    invoke-interface {p1, v0, v1}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_a
    const/4 v0, 0x2

    iget-object p2, p2, Lv0/k;->b:Ljava/lang/String;

    if-nez p2, :cond_d

    invoke-interface {p1, v0}, Le0/d;->g(I)V

    goto :goto_b

    :cond_d
    invoke-interface {p1, p2, v0}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_b
    return-void

    :pswitch_3
    check-cast p2, Lv0/g;

    iget-object v0, p2, Lv0/g;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_e

    invoke-interface {p1, v1}, Le0/d;->g(I)V

    goto :goto_c

    :cond_e
    invoke-interface {p1, v0, v1}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_c
    iget v0, p2, Lv0/g;->b:I

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Le0/d;->x(IJ)V

    iget p2, p2, Lv0/g;->c:I

    int-to-long v0, p2

    const/4 p2, 0x3

    invoke-interface {p1, p2, v0, v1}, Le0/d;->x(IJ)V

    return-void

    :pswitch_4
    check-cast p2, Lv0/d;

    iget-object v0, p2, Lv0/d;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_f

    invoke-interface {p1, v1}, Le0/d;->g(I)V

    goto :goto_d

    :cond_f
    invoke-interface {p1, v0, v1}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_d
    const/4 v0, 0x2

    iget-object p2, p2, Lv0/d;->b:Ljava/lang/Long;

    if-nez p2, :cond_10

    invoke-interface {p1, v0}, Le0/d;->g(I)V

    goto :goto_e

    :cond_10
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Le0/d;->x(IJ)V

    :goto_e
    return-void

    :pswitch_5
    check-cast p2, Lv0/a;

    iget-object v0, p2, Lv0/a;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_11

    invoke-interface {p1, v1}, Le0/d;->g(I)V

    goto :goto_f

    :cond_11
    invoke-interface {p1, v0, v1}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_f
    const/4 v0, 0x2

    iget-object p2, p2, Lv0/a;->b:Ljava/lang/String;

    if-nez p2, :cond_12

    invoke-interface {p1, v0}, Le0/d;->g(I)V

    goto :goto_10

    :cond_12
    invoke-interface {p1, p2, v0}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_10
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, La0/m;->a()Lf0/i;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lv0/b;->s(Lf0/i;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf0/i;->a()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, La0/m;->p(Lf0/i;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, La0/m;->p(Lf0/i;)V

    throw p1
.end method
