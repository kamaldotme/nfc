package b1;

import java.lang.reflect.Field;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0103a extends h {
    public C0103a() {
        super("IDENTITY", 0);
    }

    @Override // b1.h
    public final String b(Field field) {
        return field.getName();
    }
}
