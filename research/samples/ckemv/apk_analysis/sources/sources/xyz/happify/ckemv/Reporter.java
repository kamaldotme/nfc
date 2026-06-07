package xyz.happify.ckemv;

/* loaded from: classes.dex */
public final class Reporter {
    public static final Reporter INSTANCE = new Reporter();

    static {
        System.loadLibrary("ckemv_reporter");
    }

    private Reporter() {
    }

    public final native String fetchCves(String str, String str2);

    public final native String fetchReport(String str, String str2);

    public final native String uploadHarvestData(String str, String str2, String str3);
}
