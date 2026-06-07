package com.journeyapps.barcodescanner;

import C1.e;
import I1.a;
import I1.c;
import I1.g;
import I1.m;
import I1.n;
import I1.p;
import I1.u;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.TextureView;
import j1.EnumC0233c;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import u2.d;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class BarcodeView extends g {

    /* renamed from: B, reason: collision with root package name */
    public int f2591B;

    /* renamed from: C, reason: collision with root package name */
    public a f2592C;
    public p D;

    /* renamed from: E, reason: collision with root package name */
    public n f2593E;

    /* renamed from: F, reason: collision with root package name */
    public final Handler f2594F;

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2591B = 1;
        this.f2592C = null;
        c cVar = new c(0, this);
        this.f2593E = new e(1);
        this.f2594F = new Handler(cVar);
    }

    @Override // I1.g
    public final void c() {
        TextureView textureView;
        SurfaceView surfaceView;
        i();
        d.G();
        this.f333j = -1;
        J1.g gVar = this.f328b;
        if (gVar != null) {
            d.G();
            if (gVar.f559f) {
                gVar.f555a.c(gVar.f563l);
            } else {
                gVar.g = true;
            }
            gVar.f559f = false;
            this.f328b = null;
            this.h = false;
        } else {
            this.f329d.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.f340q == null && (surfaceView = this.f331f) != null) {
            surfaceView.getHolder().removeCallback(this.f347x);
        }
        if (this.f340q == null && (textureView = this.g) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f337n = null;
        this.f338o = null;
        this.f342s = null;
        e eVar = this.f332i;
        u uVar = (u) eVar.f130d;
        if (uVar != null) {
            uVar.disable();
        }
        eVar.f130d = null;
        eVar.c = null;
        eVar.f131e = null;
        this.f349z.j();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [I1.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [j1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [I1.m, I1.s] */
    public final m g() {
        m mVar;
        if (this.f2593E == null) {
            this.f2593E = new e(1);
        }
        ?? obj = new Object();
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0233c.f3480k, obj);
        e eVar = (e) this.f2593E;
        eVar.getClass();
        EnumMap enumMap = new EnumMap(EnumC0233c.class);
        enumMap.putAll(hashMap);
        Map map = (Map) eVar.f130d;
        if (map != null) {
            enumMap.putAll(map);
        }
        Collection collection = (Collection) eVar.c;
        if (collection != null) {
            enumMap.put((EnumMap) EnumC0233c.f3475d, (EnumC0233c) collection);
        }
        String str = (String) eVar.f131e;
        if (str != null) {
            enumMap.put((EnumMap) EnumC0233c.f3477f, (EnumC0233c) str);
        }
        ?? obj2 = new Object();
        obj2.e(enumMap);
        int i3 = eVar.f129b;
        if (i3 == 0) {
            mVar = new m(obj2);
        } else if (i3 == 1) {
            mVar = new m(obj2);
        } else if (i3 != 2) {
            mVar = new m(obj2);
        } else {
            ?? mVar2 = new m(obj2);
            mVar2.c = true;
            mVar = mVar2;
        }
        obj.f368a = mVar;
        return mVar;
    }

    public n getDecoderFactory() {
        return this.f2593E;
    }

    public final void h() {
        i();
        if (this.f2591B == 1 || !this.h) {
            return;
        }
        p pVar = new p(getCameraInstance(), g(), this.f2594F);
        this.D = pVar;
        pVar.f373f = getPreviewFramingRect();
        p pVar2 = this.D;
        pVar2.getClass();
        d.G();
        HandlerThread handlerThread = new HandlerThread("p");
        pVar2.f370b = handlerThread;
        handlerThread.start();
        pVar2.c = new Handler(pVar2.f370b.getLooper(), pVar2.f374i);
        pVar2.g = true;
        J1.g gVar = pVar2.f369a;
        gVar.h.post(new J1.d(gVar, pVar2.f375j, 0));
    }

    public final void i() {
        p pVar = this.D;
        if (pVar != null) {
            pVar.getClass();
            d.G();
            synchronized (pVar.h) {
                pVar.g = false;
                pVar.c.removeCallbacksAndMessages(null);
                pVar.f370b.quit();
            }
            this.D = null;
        }
    }

    public void setDecoderFactory(n nVar) {
        d.G();
        this.f2593E = nVar;
        p pVar = this.D;
        if (pVar != null) {
            pVar.f371d = g();
        }
    }
}
