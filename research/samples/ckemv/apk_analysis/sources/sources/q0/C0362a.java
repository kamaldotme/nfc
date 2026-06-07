package q0;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import m0.r;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362a {

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f4413a;

    /* renamed from: b, reason: collision with root package name */
    public final r f4414b;

    static {
        r.b("SystemJobInfoConverter");
    }

    public C0362a(Context context, r rVar) {
        this.f4414b = rVar;
        this.f4413a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
