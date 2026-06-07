package I1;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class d implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f323a;

    public d(g gVar) {
        this.f323a = gVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
        onSurfaceTextureSizeChanged(surfaceTexture, i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
        y yVar = new y(i3, i4);
        g gVar = this.f323a;
        gVar.f340q = yVar;
        gVar.f();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
