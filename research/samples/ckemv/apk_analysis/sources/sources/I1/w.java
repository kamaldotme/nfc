package I1;

import android.content.Intent;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f380a;

    /* renamed from: b, reason: collision with root package name */
    public final String f381b;
    public final byte[] c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f382d;

    /* renamed from: e, reason: collision with root package name */
    public final String f383e;

    /* renamed from: f, reason: collision with root package name */
    public final String f384f;
    public final Intent g;

    public w(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f380a = str;
        this.f381b = str2;
        this.c = bArr;
        this.f382d = num;
        this.f383e = str3;
        this.f384f = str4;
        this.g = intent;
    }

    public final String toString() {
        byte[] bArr = this.c;
        return "Format: " + this.f381b + "\nContents: " + this.f380a + "\nRaw bytes: (" + (bArr == null ? 0 : bArr.length) + " bytes)\nOrientation: " + this.f382d + "\nEC level: " + this.f383e + "\nBarcode image: " + this.f384f + "\nOriginal intent: " + this.g + '\n';
    }
}
