package c1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC0111b {
    String[] alternate() default {};

    String value();
}
