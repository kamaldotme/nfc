package n1;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements MediaPlayer.OnCompletionListener {
    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }
}
