package v2;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f5131a = new Handler();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        X1.g.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f5129a;
        String loggerName = logRecord.getLoggerName();
        X1.g.d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i3 = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        X1.g.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f5130b.get(loggerName);
        if (str == null) {
            str = d2.d.m0(loggerName, 23);
        }
        if (Log.isLoggable(str, i3)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i4 = 0;
            while (i4 < length) {
                int b02 = d2.d.b0(message, '\n', i4, false, 4);
                if (b02 == -1) {
                    b02 = length;
                }
                while (true) {
                    min = Math.min(b02, i4 + 4000);
                    String substring = message.substring(i4, min);
                    X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i3, str, substring);
                    if (min >= b02) {
                        break;
                    } else {
                        i4 = min;
                    }
                }
                i4 = min + 1;
            }
        }
    }
}
