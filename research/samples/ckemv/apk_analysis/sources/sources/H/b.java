package H;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f260d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f261e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f262f;
    public static final b g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f264b;
    public final A1.h c;

    static {
        A1.h hVar = h.c;
        f260d = Character.toString((char) 8206);
        f261e = Character.toString((char) 8207);
        f262f = new b(false, 2, hVar);
        g = new b(true, 2, hVar);
    }

    public b(boolean z3, int i3, A1.h hVar) {
        this.f263a = z3;
        this.f264b = i3;
        this.c = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0073, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0079, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0083, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0086, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0089, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008c, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.c = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = aVar.c;
            if (i6 < aVar.f258b && i3 == 0) {
                CharSequence charSequence2 = aVar.f257a;
                char charAt = charSequence2.charAt(i6);
                aVar.f259d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.c);
                    aVar.c = Character.charCount(codePointAt) + aVar.c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.c++;
                    char c = aVar.f259d;
                    directionality = c < 1792 ? a.f256e[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i5 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i5++;
                                i4 = -1;
                                continue;
                            case 16:
                            case 17:
                                i5++;
                                i4 = 1;
                                continue;
                            case 18:
                                i5--;
                                i4 = 0;
                                continue;
                        }
                    }
                } else if (i5 == 0) {
                }
                i3 = i5;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0021. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.c = aVar.f258b;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            while (aVar.c > 0) {
                byte a3 = aVar.a();
                if (a3 != 0) {
                    if (a3 == 1 || a3 == 2) {
                        if (i3 != 0) {
                            if (i4 == 0) {
                                break;
                            }
                        }
                    } else if (a3 != 9) {
                        switch (a3) {
                            case 14:
                            case 15:
                                if (i4 == i3) {
                                    break;
                                }
                                i3--;
                                break;
                            case 16:
                            case 17:
                                if (i4 == i3) {
                                    break;
                                }
                                i3--;
                                break;
                            case 18:
                                i3++;
                                break;
                            default:
                                if (i4 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i3 != 0) {
                    if (i4 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
        return -1;
    }

    public final SpannableStringBuilder c(CharSequence charSequence, A1.h hVar) {
        if (charSequence == null) {
            return null;
        }
        boolean b3 = hVar.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = this.f264b & 2;
        String str = "";
        String str2 = f261e;
        String str3 = f260d;
        boolean z3 = this.f263a;
        if (i3 != 0) {
            boolean b4 = (b3 ? h.f270b : h.f269a).b(charSequence, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((z3 || !(b4 || a(charSequence) == 1)) ? (!z3 || (b4 && a(charSequence) != -1)) ? "" : str2 : str3));
        }
        if (b3 != z3) {
            spannableStringBuilder.append(b3 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b5 = (b3 ? h.f270b : h.f269a).b(charSequence, charSequence.length());
        if (!z3 && (b5 || b(charSequence) == 1)) {
            str = str3;
        } else if (z3 && (!b5 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
