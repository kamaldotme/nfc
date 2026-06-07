package n1;

import J1.i;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345a implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public i f4235a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f4236b;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f3 = sensorEvent.values[0];
        if (this.f4235a != null) {
            if (f3 <= 45.0f) {
                this.f4236b.post(new J1.e(this, true, 2));
            } else if (f3 >= 450.0f) {
                this.f4236b.post(new J1.e(this, false, 2));
            }
        }
    }
}
