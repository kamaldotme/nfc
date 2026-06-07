package c1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC0110a {
    boolean nullSafe() default true;

    Class value();
}
