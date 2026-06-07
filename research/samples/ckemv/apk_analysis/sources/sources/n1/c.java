package n1;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements MediaPlayer.OnErrorListener {
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i3, int i4) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }
}
