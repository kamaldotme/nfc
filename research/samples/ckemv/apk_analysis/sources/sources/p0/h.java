package p0;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f.ExecutorC0145B;
import java.util.Objects;
import m0.r;
import w0.p;
import y0.ExecutorC0445a;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4318b;
    public final j c;

    public /* synthetic */ h(j jVar, int i3) {
        this.f4318b = i3;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorC0445a executorC0445a;
        h hVar;
        boolean z3;
        boolean z4;
        int i3 = 1;
        switch (this.f4318b) {
            case 0:
                synchronized (this.c.h) {
                    j jVar = this.c;
                    jVar.f4324i = (Intent) jVar.h.get(0);
                }
                Intent intent = this.c.f4324i;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.c.f4324i.getIntExtra("KEY_START_ID", 0);
                    r a3 = r.a();
                    int i4 = j.f4319l;
                    Objects.toString(this.c.f4324i);
                    a3.getClass();
                    PowerManager.WakeLock a4 = p.a(this.c.f4320b, action + " (" + intExtra + ")");
                    try {
                        try {
                            r a5 = r.a();
                            a4.toString();
                            a5.getClass();
                            a4.acquire();
                            j jVar2 = this.c;
                            jVar2.g.a(jVar2.f4324i, intExtra, jVar2);
                            r a6 = r.a();
                            a4.toString();
                            a6.getClass();
                            a4.release();
                            j jVar3 = this.c;
                            executorC0445a = (ExecutorC0445a) jVar3.c.f5078e;
                            hVar = new h(jVar3, i3);
                        } catch (Throwable unused) {
                            r a7 = r.a();
                            int i5 = j.f4319l;
                            a7.getClass();
                            r a8 = r.a();
                            a4.toString();
                            a8.getClass();
                            a4.release();
                            j jVar4 = this.c;
                            executorC0445a = (ExecutorC0445a) jVar4.c.f5078e;
                            hVar = new h(jVar4, i3);
                        }
                        executorC0445a.execute(hVar);
                        return;
                    } catch (Throwable th) {
                        r a9 = r.a();
                        int i6 = j.f4319l;
                        a4.toString();
                        a9.getClass();
                        a4.release();
                        j jVar5 = this.c;
                        ((ExecutorC0445a) jVar5.c.f5078e).execute(new h(jVar5, i3));
                        throw th;
                    }
                }
                return;
            default:
                j jVar6 = this.c;
                jVar6.getClass();
                r.a().getClass();
                j.b();
                synchronized (jVar6.h) {
                    try {
                        if (jVar6.f4324i != null) {
                            r a10 = r.a();
                            Objects.toString(jVar6.f4324i);
                            a10.getClass();
                            if (!((Intent) jVar6.h.remove(0)).equals(jVar6.f4324i)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            jVar6.f4324i = null;
                        }
                        ExecutorC0145B executorC0145B = (ExecutorC0145B) jVar6.c.f5076b;
                        c cVar = jVar6.g;
                        synchronized (cVar.f4299d) {
                            z3 = !cVar.c.isEmpty();
                        }
                        if (!z3 && jVar6.h.isEmpty()) {
                            synchronized (executorC0145B.f2837f) {
                                z4 = !executorC0145B.c.isEmpty();
                            }
                            if (!z4) {
                                r.a().getClass();
                                i iVar = jVar6.f4325j;
                                if (iVar != null) {
                                    ((SystemAlarmService) iVar).a();
                                }
                            }
                        }
                        if (!jVar6.h.isEmpty()) {
                            jVar6.c();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
