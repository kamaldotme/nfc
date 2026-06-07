package n0;

import android.content.Context;
import android.content.SharedPreferences;
import b0.AbstractC0102a;
import f0.C0167c;

/* loaded from: classes.dex */
public final class h extends AbstractC0102a {
    public final /* synthetic */ int c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f4186d;

    public h(Context context, int i3, int i4) {
        super(i3, i4);
        this.f4186d = context;
    }

    @Override // b0.AbstractC0102a
    public final void a(C0167c c0167c) {
        switch (this.c) {
            case 0:
                if (this.f2218b >= 10) {
                    c0167c.D("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f4186d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c0167c.A("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f4186d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j3 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j4 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c0167c.a();
                    try {
                        c0167c.D("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j3)});
                        c0167c.D("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j4)});
                        sharedPreferences.edit().clear().apply();
                        c0167c.M();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i3 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i4 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c0167c.a();
                    try {
                        c0167c.D("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i3)});
                        c0167c.D("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i4)});
                        sharedPreferences2.edit().clear().apply();
                        c0167c.M();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public h(Context context) {
        super(9, 10);
        this.f4186d = context;
    }
}
