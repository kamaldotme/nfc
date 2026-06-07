package A1;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import java.io.IOException;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f48a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f49b;

    public /* synthetic */ h(Object obj, boolean z3) {
        this.f48a = z3;
        this.f49b = obj;
    }

    public boolean a() {
        return this.f48a;
    }

    public boolean b(CharSequence charSequence, int i3) {
        if (charSequence == null || i3 < 0 || charSequence.length() - i3 < 0) {
            throw new IllegalArgumentException();
        }
        H.g gVar = (H.g) this.f49b;
        if (gVar == null) {
            return a();
        }
        int a3 = gVar.a(charSequence, i3);
        if (a3 == 0) {
            return true;
        }
        if (a3 != 1) {
            return a();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, android.media.MediaPlayer$OnCompletionListener] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.media.MediaPlayer$OnErrorListener, java.lang.Object] */
    public void c() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new Object());
        mediaPlayer.setOnErrorListener(new Object());
        try {
            AssetFileDescriptor openRawResourceFd = ((Context) this.f49b).getResources().openRawResourceFd(R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (Throwable th) {
                openRawResourceFd.close();
                throw th;
            }
        } catch (IOException unused) {
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    public h(Activity activity) {
        this.f48a = true;
        activity.setVolumeControlStream(3);
        this.f49b = activity.getApplicationContext();
    }

    public h(H.g gVar, boolean z3) {
        this.f49b = gVar;
        this.f48a = z3;
    }

    public h(boolean z3, String str) {
        this.f48a = z3;
        this.f49b = str;
    }
}
