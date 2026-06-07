package xyz.happify.ckemv;

/* loaded from: classes.dex */
public final class EmvKernel {
    public static final EmvKernel INSTANCE = new EmvKernel();

    static {
        System.loadLibrary("ckemv_android");
    }

    private EmvKernel() {
    }

    public final native String getAid();

    public final native String getArqc();

    public final native String getAtc();

    public final native String getNextCommand();

    public final native String getPan();

    public final native String getRawData();

    public final native String getStatus();

    public final native String getTxParameters();

    public final native void initialize(boolean z3, String str);

    public final native String processResponse(String str);
}
