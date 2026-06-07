package s;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public m f4688a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4689b;

    public static long a(C0376f c0376f, long j3) {
        m mVar = c0376f.f4679d;
        if (mVar instanceof C0379i) {
            return j3;
        }
        ArrayList arrayList = c0376f.f4684k;
        int size = arrayList.size();
        long j4 = j3;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC0374d interfaceC0374d = (InterfaceC0374d) arrayList.get(i3);
            if (interfaceC0374d instanceof C0376f) {
                C0376f c0376f2 = (C0376f) interfaceC0374d;
                if (c0376f2.f4679d != mVar) {
                    j4 = Math.min(j4, a(c0376f2, c0376f2.f4681f + j3));
                }
            }
        }
        if (c0376f != mVar.f4697i) {
            return j4;
        }
        long j5 = mVar.j();
        long j6 = j3 - j5;
        return Math.min(Math.min(j4, a(mVar.h, j6)), j6 - r9.f4681f);
    }

    public static long b(C0376f c0376f, long j3) {
        m mVar = c0376f.f4679d;
        if (mVar instanceof C0379i) {
            return j3;
        }
        ArrayList arrayList = c0376f.f4684k;
        int size = arrayList.size();
        long j4 = j3;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC0374d interfaceC0374d = (InterfaceC0374d) arrayList.get(i3);
            if (interfaceC0374d instanceof C0376f) {
                C0376f c0376f2 = (C0376f) interfaceC0374d;
                if (c0376f2.f4679d != mVar) {
                    j4 = Math.max(j4, b(c0376f2, c0376f2.f4681f + j3));
                }
            }
        }
        if (c0376f != mVar.h) {
            return j4;
        }
        long j5 = mVar.j();
        long j6 = j3 + j5;
        return Math.max(Math.max(j4, b(mVar.f4697i, j6)), j6 - r9.f4681f);
    }
}
