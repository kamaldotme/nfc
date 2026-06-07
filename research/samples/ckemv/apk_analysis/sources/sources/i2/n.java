package i2;

import L1.w;
import e2.AbstractC0139v;
import e2.InterfaceC0137t;
import java.util.concurrent.atomic.AtomicInteger;
import m0.z;

/* loaded from: classes.dex */
public final class n extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public g2.h f3222f;
    public byte[] g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f3223i;

    /* renamed from: j, reason: collision with root package name */
    public int f3224j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3225k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h2.f[] f3226l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W1.a f3227m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W1.q f3228n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h2.g f3229o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h2.f[] fVarArr, W1.a aVar, W1.q qVar, h2.g gVar, O1.d dVar) {
        super(2, dVar);
        this.f3226l = fVarArr;
        this.f3227m = aVar;
        this.f3228n = qVar;
        this.f3229o = gVar;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        n nVar = new n(this.f3226l, this.f3227m, this.f3228n, this.f3229o, dVar);
        nVar.f3225k = obj;
        return nVar;
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((n) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
    
        if (r9 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        r12 = (java.lang.Object[]) r20.f3227m.d();
        r13 = r20.f3229o;
        r14 = r20.f3228n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        if (r12 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
    
        r20.f3225k = r10;
        r20.f3222f = r11;
        r20.g = r2;
        r20.h = r9;
        r20.f3223i = r8;
        r20.f3224j = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0102, code lost:
    
        if (r14.a(r13, r10, r20) != r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0104, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
    
        L1.j.S(r10, r12, 0, 0, r10.length);
        r20.f3225k = r10;
        r20.f3222f = r11;
        r20.g = r2;
        r20.h = r9;
        r20.f3223i = r8;
        r20.f3224j = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
    
        if (r14.a(r13, r12, r20) != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r9 != 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0102 -> B:8:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x011a -> B:7:0x011d). Please report as a decompilation issue!!! */
    @Override // Q1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int length;
        Object[] objArr;
        g2.h a3;
        byte[] bArr;
        byte b3;
        Object obj2;
        w wVar;
        int i3;
        Object obj3;
        P1.a aVar = P1.a.f784b;
        int i4 = this.f3224j;
        d1.f fVar = q.f3232b;
        K1.h hVar = K1.h.f605a;
        byte b4 = 1;
        if (i4 == 0) {
            z.m0(obj);
            InterfaceC0137t interfaceC0137t = (InterfaceC0137t) this.f3225k;
            length = this.f3226l.length;
            if (length == 0) {
                return hVar;
            }
            objArr = new Object[length];
            L1.j.T(objArr, fVar, 0, length);
            a3 = u2.d.a(length, 0, 6);
            AtomicInteger atomicInteger = new AtomicInteger(length);
            for (int i5 = 0; i5 < length; i5++) {
                AbstractC0139v.k(interfaceC0137t, 0, new m(this.f3226l, i5, atomicInteger, a3, null), 3);
            }
            bArr = new byte[length];
            b3 = 0;
        } else if (i4 == 1) {
            ?? r22 = this.f3223i;
            length = this.h;
            byte[] bArr2 = this.g;
            a3 = this.f3222f;
            Object[] objArr2 = (Object[]) this.f3225k;
            z.m0(obj);
            obj2 = ((g2.k) obj).f3074a;
            b3 = r22;
            bArr = bArr2;
            objArr = objArr2;
            if (obj2 instanceof g2.j) {
                obj2 = null;
            }
            wVar = (w) obj2;
            if (wVar == null) {
                return hVar;
            }
            while (true) {
                i3 = wVar.f625a;
                obj3 = objArr[i3];
                objArr[i3] = wVar.f626b;
                if (obj3 == fVar) {
                    length--;
                }
                if (bArr[i3] != b3) {
                    bArr[i3] = b3;
                    Object h = a3.h();
                    if (h instanceof g2.j) {
                        h = null;
                    }
                    wVar = (w) h;
                    if (wVar == null) {
                        break;
                    }
                }
            }
        } else if (i4 == 2) {
            ?? r23 = this.f3223i;
            length = this.h;
            byte[] bArr3 = this.g;
            a3 = this.f3222f;
            Object[] objArr3 = (Object[]) this.f3225k;
            z.m0(obj);
            b3 = r23;
            bArr = bArr3;
            objArr = objArr3;
        } else {
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r24 = this.f3223i;
            length = this.h;
            byte[] bArr4 = this.g;
            a3 = this.f3222f;
            Object[] objArr4 = (Object[]) this.f3225k;
            z.m0(obj);
            b3 = r24;
            bArr = bArr4;
            objArr = objArr4;
            b4 = 1;
        }
        b3 = (byte) (b3 + b4);
        this.f3225k = objArr;
        this.f3222f = a3;
        this.g = bArr;
        this.h = length;
        this.f3223i = b3;
        this.f3224j = b4;
        obj2 = a3.n(this);
        if (obj2 == aVar) {
            return aVar;
        }
        if (obj2 instanceof g2.j) {
        }
        wVar = (w) obj2;
        if (wVar == null) {
        }
        while (true) {
            i3 = wVar.f625a;
            obj3 = objArr[i3];
            objArr[i3] = wVar.f626b;
            if (obj3 == fVar) {
            }
            if (bArr[i3] != b3) {
            }
        }
    }
}
