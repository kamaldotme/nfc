package I1;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.journeyapps.barcodescanner.BarcodeView;
import j1.C0237g;
import j1.C0239i;
import j1.C0242l;
import j1.C0244n;
import j1.InterfaceC0240j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class c implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f322b;

    public /* synthetic */ c(int i3, Object obj) {
        this.f321a = i3;
        this.f322b = obj;
    }

    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, I1.b] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        a aVar;
        J1.l lVar;
        t tVar;
        C0239i c0239i;
        switch (this.f321a) {
            case 0:
                int i3 = message.what;
                BarcodeView barcodeView = (BarcodeView) this.f322b;
                if (i3 != R.id.zxing_decode_succeeded) {
                    if (i3 == R.id.zxing_decode_failed) {
                        return true;
                    }
                    if (i3 != R.id.zxing_possible_result_points) {
                        return false;
                    }
                    List list = (List) message.obj;
                    a aVar2 = barcodeView.f2592C;
                    if (aVar2 == null || barcodeView.f2591B == 1) {
                        return true;
                    }
                    aVar2.k(list);
                    return true;
                }
                b bVar = (b) message.obj;
                if (bVar == null || (aVar = barcodeView.f2592C) == null || barcodeView.f2591B == 1) {
                    return true;
                }
                aVar.n(bVar);
                if (barcodeView.f2591B != 2) {
                    return true;
                }
                barcodeView.f2591B = 1;
                barcodeView.f2592C = null;
                barcodeView.i();
                return true;
            case 1:
                int i4 = message.what;
                g gVar = (g) this.f322b;
                if (i4 != R.id.zxing_prewiew_size_ready) {
                    if (i4 != R.id.zxing_camera_error) {
                        if (i4 != R.id.zxing_camera_closed) {
                            return false;
                        }
                        gVar.f349z.a();
                        return false;
                    }
                    Exception exc = (Exception) message.obj;
                    if (gVar.f328b == null) {
                        return false;
                    }
                    gVar.c();
                    gVar.f349z.c(exc);
                    return false;
                }
                y yVar = (y) message.obj;
                gVar.f338o = yVar;
                y yVar2 = gVar.f337n;
                if (yVar2 != null) {
                    if (yVar == null || (lVar = gVar.f335l) == null) {
                        gVar.f342s = null;
                        gVar.f341r = null;
                        gVar.f339p = null;
                        throw new IllegalStateException("containerSize or previewSize is not set yet");
                    }
                    Rect b3 = ((J1.n) lVar.f580d).b(yVar, (y) lVar.c);
                    if (b3.width() > 0 && b3.height() > 0) {
                        gVar.f339p = b3;
                        Rect rect = new Rect(0, 0, yVar2.f387b, yVar2.c);
                        Rect rect2 = gVar.f339p;
                        Rect rect3 = new Rect(rect);
                        rect3.intersect(rect2);
                        if (gVar.f343t != null) {
                            rect3.inset(Math.max(0, (rect3.width() - gVar.f343t.f387b) / 2), Math.max(0, (rect3.height() - gVar.f343t.c) / 2));
                        } else {
                            int min = (int) Math.min(rect3.width() * gVar.f344u, rect3.height() * gVar.f344u);
                            rect3.inset(min, min);
                            if (rect3.height() > rect3.width()) {
                                rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                            }
                        }
                        gVar.f341r = rect3;
                        Rect rect4 = new Rect(gVar.f341r);
                        Rect rect5 = gVar.f339p;
                        rect4.offset(-rect5.left, -rect5.top);
                        int i5 = rect4.left;
                        int i6 = yVar.f387b;
                        int width = (i5 * i6) / gVar.f339p.width();
                        int i7 = rect4.top;
                        int i8 = yVar.c;
                        Rect rect6 = new Rect(width, (i7 * i8) / gVar.f339p.height(), (rect4.right * i6) / gVar.f339p.width(), (rect4.bottom * i8) / gVar.f339p.height());
                        gVar.f342s = rect6;
                        if (rect6.width() <= 0 || gVar.f342s.height() <= 0) {
                            gVar.f342s = null;
                            gVar.f341r = null;
                        } else {
                            gVar.f349z.e();
                        }
                    }
                    gVar.requestLayout();
                    gVar.f();
                }
                return true;
            case 2:
                int i9 = message.what;
                p pVar = (p) this.f322b;
                if (i9 == R.id.zxing_decode) {
                    z zVar = (z) message.obj;
                    pVar.getClass();
                    System.currentTimeMillis();
                    Rect rect7 = pVar.f373f;
                    zVar.f390d = rect7;
                    t tVar2 = zVar.f388a;
                    C0242l c0242l = null;
                    if (rect7 == null) {
                        c0239i = null;
                    } else {
                        byte[] bArr = tVar2.f376a;
                        int i10 = zVar.c;
                        int i11 = tVar2.c;
                        int i12 = tVar2.f377b;
                        if (i10 == 90) {
                            byte[] bArr2 = new byte[i12 * i11];
                            int i13 = 0;
                            for (int i14 = 0; i14 < i12; i14++) {
                                for (int i15 = i11 - 1; i15 >= 0; i15--) {
                                    bArr2[i13] = bArr[(i15 * i12) + i14];
                                    i13++;
                                }
                            }
                            tVar = new t(i11, i12, bArr2);
                        } else if (i10 == 180) {
                            int i16 = i12 * i11;
                            byte[] bArr3 = new byte[i16];
                            int i17 = i16 - 1;
                            for (int i18 = 0; i18 < i16; i18++) {
                                bArr3[i17] = bArr[i18];
                                i17--;
                            }
                            tVar = new t(i12, i11, bArr3);
                        } else if (i10 != 270) {
                            tVar = tVar2;
                        } else {
                            int i19 = i12 * i11;
                            byte[] bArr4 = new byte[i19];
                            int i20 = i19 - 1;
                            for (int i21 = 0; i21 < i12; i21++) {
                                for (int i22 = i11 - 1; i22 >= 0; i22--) {
                                    bArr4[i20] = bArr[(i22 * i12) + i21];
                                    i20--;
                                }
                            }
                            tVar = new t(i11, i12, bArr4);
                        }
                        Rect rect8 = zVar.f390d;
                        int width2 = rect8.width();
                        int height = rect8.height();
                        int i23 = rect8.top;
                        byte[] bArr5 = new byte[width2 * height];
                        int i24 = tVar.f377b;
                        int i25 = (i23 * i24) + rect8.left;
                        for (int i26 = 0; i26 < height; i26++) {
                            System.arraycopy(tVar.f376a, i25, bArr5, i26 * width2, width2);
                            i25 += i24;
                        }
                        c0239i = new C0239i(bArr5, width2, height, width2, height);
                    }
                    if (c0239i != null) {
                        m mVar = pVar.f371d;
                        v0.e b4 = mVar.b(c0239i);
                        InterfaceC0240j interfaceC0240j = mVar.f366a;
                        mVar.f367b.clear();
                        try {
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            interfaceC0240j.c();
                            throw th;
                        }
                        if (interfaceC0240j instanceof C0237g) {
                            C0237g c0237g = (C0237g) interfaceC0240j;
                            if (c0237g.f3488b == null) {
                                c0237g.e(null);
                            }
                            c0242l = c0237g.d(b4);
                            ((C0237g) interfaceC0240j).c();
                        } else {
                            c0242l = interfaceC0240j.b(b4);
                            interfaceC0240j.c();
                        }
                    }
                    Handler handler = pVar.f372e;
                    if (c0242l != null) {
                        System.currentTimeMillis();
                        if (handler != null) {
                            ?? obj = new Object();
                            obj.f319a = c0242l;
                            obj.f320b = zVar;
                            Message obtain = Message.obtain(handler, R.id.zxing_decode_succeeded, obj);
                            obtain.setData(new Bundle());
                            obtain.sendToTarget();
                        }
                    } else if (handler != null) {
                        Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                    }
                    if (handler != null) {
                        m mVar2 = pVar.f371d;
                        mVar2.getClass();
                        ArrayList arrayList = new ArrayList(mVar2.f367b);
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C0244n c0244n = (C0244n) it.next();
                            float f3 = 1;
                            float f4 = c0244n.f3505a * f3;
                            Rect rect9 = zVar.f390d;
                            float f5 = f4 + rect9.left;
                            float f6 = (c0244n.f3506b * f3) + rect9.top;
                            if (zVar.f391e) {
                                f5 = tVar2.f377b - f5;
                            }
                            arrayList2.add(new C0244n(f5, f6));
                        }
                        Message.obtain(handler, R.id.zxing_possible_result_points, arrayList2).sendToTarget();
                    }
                    J1.g gVar2 = pVar.f369a;
                    gVar2.h.post(new J1.d(gVar2, pVar.f375j, 0));
                } else if (i9 == R.id.zxing_preview_failed) {
                    J1.g gVar3 = pVar.f369a;
                    gVar3.h.post(new J1.d(gVar3, pVar.f375j, 0));
                }
                return true;
            case 3:
                int i27 = message.what;
                J1.b bVar2 = (J1.b) this.f322b;
                bVar2.getClass();
                if (i27 != 1) {
                    return false;
                }
                bVar2.b();
                return true;
            default:
                if (message.what != 0) {
                    return false;
                }
                K.r rVar = (K.r) this.f322b;
                X.d.q(message.obj);
                synchronized (rVar.f599a) {
                    throw null;
                }
        }
    }
}
