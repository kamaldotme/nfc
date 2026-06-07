package J;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: J.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006e implements InterfaceC0005d, InterfaceC0007f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f415b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public int f416d;

    /* renamed from: e, reason: collision with root package name */
    public int f417e;

    /* renamed from: f, reason: collision with root package name */
    public Object f418f;
    public Cloneable g;

    public /* synthetic */ C0006e() {
        this.f415b = 0;
    }

    @Override // J.InterfaceC0005d
    public void a(Bundle bundle) {
        this.g = bundle;
    }

    @Override // J.InterfaceC0005d
    public void b(Uri uri) {
        this.f418f = uri;
    }

    @Override // J.InterfaceC0007f
    public int c() {
        return this.f416d;
    }

    @Override // J.InterfaceC0007f
    public ClipData d() {
        return (ClipData) this.c;
    }

    public void e(y0 y0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((l0) it.next()).f436a.c() & 8) != 0) {
                ((View) this.f418f).setTranslationY(B0.a.c(this.f417e, 0, r3.f436a.b()));
                return;
            }
        }
    }

    @Override // J.InterfaceC0005d
    public C0008g f() {
        return new C0008g(new C0006e(this));
    }

    @Override // J.InterfaceC0007f
    public int i() {
        return this.f417e;
    }

    @Override // J.InterfaceC0007f
    public ContentInfo l() {
        return null;
    }

    @Override // J.InterfaceC0005d
    public void o(int i3) {
        this.f417e = i3;
    }

    public String toString() {
        String str;
        switch (this.f415b) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.c).getDescription());
                sb.append(", source=");
                int i3 = this.f416d;
                sb.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? String.valueOf(i3) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i4 = this.f417e;
                sb.append((i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4));
                Uri uri = (Uri) this.f418f;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return X.d.j(sb, ((Bundle) this.g) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0006e(View view) {
        this.f415b = 2;
        this.g = new int[2];
        this.f418f = view;
    }

    public C0006e(C0006e c0006e) {
        this.f415b = 1;
        ClipData clipData = (ClipData) c0006e.c;
        clipData.getClass();
        this.c = clipData;
        int i3 = c0006e.f416d;
        if (i3 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i3 <= 5) {
            this.f416d = i3;
            int i4 = c0006e.f417e;
            if ((i4 & 1) == i4) {
                this.f417e = i4;
                this.f418f = (Uri) c0006e.f418f;
                this.g = (Bundle) c0006e.g;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
