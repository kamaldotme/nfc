package t1;

import A1.i;
import F0.e;

/* loaded from: classes.dex */
public final class b {
    public static final b[] h = {new b(1, 10, 10, 8, 8, new e(5, new i(1, 3, 5))), new b(2, 12, 12, 10, 10, new e(7, new i(1, 5, 5))), new b(3, 14, 14, 12, 12, new e(10, new i(1, 8, 5))), new b(4, 16, 16, 14, 14, new e(12, new i(1, 12, 5))), new b(5, 18, 18, 16, 16, new e(14, new i(1, 18, 5))), new b(6, 20, 20, 18, 18, new e(18, new i(1, 22, 5))), new b(7, 22, 22, 20, 20, new e(20, new i(1, 30, 5))), new b(8, 24, 24, 22, 22, new e(24, new i(1, 36, 5))), new b(9, 26, 26, 24, 24, new e(28, new i(1, 44, 5))), new b(10, 32, 32, 14, 14, new e(36, new i(1, 62, 5))), new b(11, 36, 36, 16, 16, new e(42, new i(1, 86, 5))), new b(12, 40, 40, 18, 18, new e(48, new i(1, 114, 5))), new b(13, 44, 44, 20, 20, new e(56, new i(1, 144, 5))), new b(14, 48, 48, 22, 22, new e(68, new i(1, 174, 5))), new b(15, 52, 52, 24, 24, new e(42, new i(2, 102, 5))), new b(16, 64, 64, 14, 14, new e(56, new i(2, 140, 5))), new b(17, 72, 72, 16, 16, new e(36, new i(4, 92, 5))), new b(18, 80, 80, 18, 18, new e(48, new i(4, 114, 5))), new b(19, 88, 88, 20, 20, new e(56, new i(4, 144, 5))), new b(20, 96, 96, 22, 22, new e(68, new i(4, 174, 5))), new b(21, 104, 104, 24, 24, new e(56, new i(6, 136, 5))), new b(22, 120, 120, 18, 18, new e(68, new i(6, 175, 5))), new b(23, 132, 132, 20, 20, new e(62, new i(8, 163, 5))), new b(24, 144, 144, 22, 22, new e(new i(8, 156, 5), new i(2, 155, 5))), new b(25, 8, 18, 6, 16, new e(7, new i(1, 5, 5))), new b(26, 8, 32, 6, 14, new e(11, new i(1, 10, 5))), new b(27, 12, 26, 10, 24, new e(14, new i(1, 16, 5))), new b(28, 12, 36, 10, 16, new e(18, new i(1, 22, 5))), new b(29, 16, 36, 14, 16, new e(24, new i(1, 32, 5))), new b(30, 16, 48, 14, 22, new e(28, new i(1, 49, 5)))};

    /* renamed from: a, reason: collision with root package name */
    public final int f4904a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4905b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4906d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4907e;

    /* renamed from: f, reason: collision with root package name */
    public final e f4908f;
    public final int g;

    public b(int i3, int i4, int i5, int i6, int i7, e eVar) {
        this.f4904a = i3;
        this.f4905b = i4;
        this.c = i5;
        this.f4906d = i6;
        this.f4907e = i7;
        this.f4908f = eVar;
        int i8 = 0;
        for (i iVar : (i[]) eVar.c) {
            i8 += (iVar.c + eVar.f166b) * iVar.f51b;
        }
        this.g = i8;
    }

    public final String toString() {
        return String.valueOf(this.f4904a);
    }
}
