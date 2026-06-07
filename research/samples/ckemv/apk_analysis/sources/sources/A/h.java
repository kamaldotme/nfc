package A;

import B2.u;
import J.C;
import J.C0008g;
import J.InterfaceC0005d;
import J.InterfaceC0007f;
import J.T;
import K.B;
import android.animation.Animator;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputContentInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.C0080q;
import androidx.profileinstaller.ProfileInstallReceiver;
import b0.AbstractC0102a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d1.p;
import d1.x;
import g1.AbstractC0178c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m0.z;
import v0.C0403c;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class h implements B, G0.a, I1.a, InterfaceC0005d, InterfaceC0007f, X.f, androidx.emoji2.text.i, F.c, p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8b;
    public Object c;

    public /* synthetic */ h(int i3, Object obj) {
        this.f8b = i3;
        this.c = obj;
    }

    @Override // J.InterfaceC0005d
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.c).setExtras(bundle);
    }

    @Override // J.InterfaceC0005d
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.c).setLinkUri(uri);
    }

    @Override // J.InterfaceC0007f
    public int c() {
        int source;
        source = ((ContentInfo) this.c).getSource();
        return source;
    }

    @Override // J.InterfaceC0007f
    public ClipData d() {
        ClipData clip;
        clip = ((ContentInfo) this.c).getClip();
        return clip;
    }

    @Override // K.B
    public boolean e(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.c;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = T.f402a;
        boolean z3 = C.d(view) == 1;
        int i3 = swipeDismissBehavior.f2277d;
        view.offsetLeftAndRight((!(i3 == 0 && z3) && (i3 != 1 || z3)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // J.InterfaceC0005d
    public C0008g f() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.c).build();
        return new C0008g(new h(build));
    }

    @Override // d1.p
    public Object g() {
        switch (this.f8b) {
            case 28:
                Class cls = (Class) this.c;
                try {
                    return x.f2652a.a(cls);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e3);
                }
            default:
                Constructor constructor = (Constructor) this.c;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e4) {
                    z zVar = AbstractC0178c.f3037a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e4);
                } catch (InstantiationException e5) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC0178c.b(constructor) + "' with no args", e5);
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC0178c.b(constructor) + "' with no args", e6.getCause());
                }
        }
    }

    @Override // F.c
    public void h() {
        switch (this.f8b) {
            case 22:
                ((Animator) this.c).end();
                return;
            default:
                ((androidx.fragment.app.T) this.c).a();
                return;
        }
    }

    @Override // J.InterfaceC0007f
    public int i() {
        int flags;
        flags = ((ContentInfo) this.c).getFlags();
        return flags;
    }

    @Override // androidx.emoji2.text.i
    public void j(z zVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.emoji2.text.k(this, zVar, threadPoolExecutor, 0));
    }

    @Override // I1.a
    public void k(List list) {
    }

    @Override // J.InterfaceC0007f
    public ContentInfo l() {
        return (ContentInfo) this.c;
    }

    @Override // X.f
    public void m(int i3, Object obj) {
        if (i3 == 6 || i3 == 7 || i3 == 8) {
        }
        ((ProfileInstallReceiver) this.c).setResultCode(i3);
    }

    @Override // I1.a
    public void n(I1.b bVar) {
        ((I1.l) this.c).f357b.f2596b.c();
        A1.h hVar = ((I1.l) this.c).f361i;
        synchronized (hVar) {
            if (hVar.f48a) {
                hVar.c();
            }
        }
        ((I1.l) this.c).f362j.post(new I1.k(this, 0, bVar));
    }

    @Override // J.InterfaceC0005d
    public void o(int i3) {
        ((ContentInfo.Builder) this.c).setFlags(i3);
    }

    public void p(AbstractC0102a... abstractC0102aArr) {
        X1.g.e(abstractC0102aArr, "migrations");
        for (AbstractC0102a abstractC0102a : abstractC0102aArr) {
            int i3 = abstractC0102a.f2217a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
            Integer valueOf = Integer.valueOf(i3);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i4 = abstractC0102a.f2218b;
            if (treeMap.containsKey(Integer.valueOf(i4))) {
                Objects.toString(treeMap.get(Integer.valueOf(i4)));
                abstractC0102a.toString();
            }
            treeMap.put(Integer.valueOf(i4), abstractC0102a);
        }
    }

    public void q() {
        ((C0080q) this.c).g.I();
    }

    public void r() {
        synchronized (((I1.p) this.c).h) {
            try {
                I1.p pVar = (I1.p) this.c;
                if (pVar.g) {
                    pVar.c.obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s() {
        ((InputContentInfo) this.c).requestPermission();
    }

    public void t() {
        View view;
        View view2 = (View) this.c;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(android.R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new u(2, view));
    }

    public String toString() {
        switch (this.f8b) {
            case 8:
                return "ContentInfoCompat{" + ((ContentInfo) this.c) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [J.v, java.lang.Object, A.h] */
    public h(View view) {
        this.f8b = 11;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? hVar = new h(10, view);
            hVar.f462d = view;
            this.c = hVar;
            return;
        }
        this.c = new h(10, view);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [J.v, java.lang.Object, A.h] */
    public h(WindowInsetsController windowInsetsController) {
        this.f8b = 11;
        ?? hVar = new h(10, (Object) null);
        hVar.f463e = windowInsetsController;
        this.c = hVar;
    }

    public h(TextView textView) {
        this.f8b = 16;
        z.k(textView, "textView cannot be null");
        this.c = new S.g(textView);
    }

    public h(EditText editText) {
        this.f8b = 15;
        z.k(editText, "editText cannot be null");
        this.c = new C0403c(editText);
    }

    public h(Object obj) {
        this.f8b = 12;
        this.c = (InputContentInfo) obj;
    }

    public h(Context context) {
        this.f8b = 21;
        this.c = context.getApplicationContext();
    }

    public h(ContentInfo contentInfo) {
        this.f8b = 8;
        contentInfo.getClass();
        this.c = F0.a.g(contentInfo);
    }

    public h(ClipData clipData, int i3) {
        this.f8b = 7;
        this.c = F0.a.e(clipData, i3);
    }

    public h(int i3) {
        this.f8b = i3;
        switch (i3) {
            case 2:
                this.c = D1.a.f142e;
                return;
            case 9:
                this.c = new CopyOnWriteArrayList();
                new HashMap();
                return;
            case 20:
                this.c = new LinkedHashMap();
                return;
            default:
                return;
        }
    }
}
