package Z;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public int f1189a;

    /* renamed from: b, reason: collision with root package name */
    public int f1190b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f1191d;

    /* renamed from: e, reason: collision with root package name */
    public int f1192e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1193f;
    public boolean g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1194i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1195j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1196k;

    /* renamed from: l, reason: collision with root package name */
    public int f1197l;

    /* renamed from: m, reason: collision with root package name */
    public long f1198m;

    /* renamed from: n, reason: collision with root package name */
    public int f1199n;

    public final void a(int i3) {
        if ((this.f1191d & i3) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i3) + " but it is " + Integer.toBinaryString(this.f1191d));
    }

    public final int b() {
        return this.g ? this.f1190b - this.c : this.f1192e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1189a + ", mData=null, mItemCount=" + this.f1192e + ", mIsMeasuring=" + this.f1194i + ", mPreviousLayoutItemCount=" + this.f1190b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.c + ", mStructureChanged=" + this.f1193f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.f1195j + ", mRunPredictiveAnimations=" + this.f1196k + '}';
    }
}
