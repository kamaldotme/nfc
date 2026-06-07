package p1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4335a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4336b;
    public final List c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4337d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4338e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4339f;
    public final int g;

    public d(byte[] bArr, String str, ArrayList arrayList, String str2) {
        this(bArr, str, arrayList, str2, -1, -1);
    }

    public d(byte[] bArr, String str, ArrayList arrayList, String str2, int i3, int i4) {
        this.f4335a = bArr;
        if (bArr != null) {
            int length = bArr.length;
        }
        this.f4336b = str;
        this.c = arrayList;
        this.f4337d = str2;
        this.f4339f = i4;
        this.g = i3;
    }
}
