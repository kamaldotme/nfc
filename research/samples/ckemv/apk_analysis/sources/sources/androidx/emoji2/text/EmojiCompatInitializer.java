package androidx.emoji2.text;

import Z.AbstractC0055w;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.InterfaceC0087d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import h0.C0179a;
import h0.InterfaceC0180b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0180b {
    @Override // h0.InterfaceC0180b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // h0.InterfaceC0180b
    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z.w, androidx.emoji2.text.q] */
    public final void c(Context context) {
        Object obj;
        ?? abstractC0055w = new AbstractC0055w(new A.h(context));
        abstractC0055w.f1366a = 1;
        if (j.f1769j == null) {
            synchronized (j.f1768i) {
                try {
                    if (j.f1769j == null) {
                        j.f1769j = new j(abstractC0055w);
                    }
                } finally {
                }
            }
        }
        C0179a c = C0179a.c(context);
        c.getClass();
        synchronized (C0179a.f3083e) {
            try {
                obj = c.f3084a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final androidx.lifecycle.t d3 = ((androidx.lifecycle.r) obj).d();
        d3.a(new InterfaceC0087d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
            @Override // androidx.lifecycle.InterfaceC0087d
            public final void a() {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Object(), 500L);
                d3.f(this);
            }
        });
    }
}
