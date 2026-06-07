package M;

import A.h;
import J.C0006e;
import J.InterfaceC0005d;
import J.T;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B2.b f627a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, B2.b bVar) {
        super(inputConnection, false);
        this.f627a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0005d interfaceC0005d;
        h hVar = inputContentInfo == null ? null : new h(13, new h(inputContentInfo));
        B2.b bVar = this.f627a;
        bVar.getClass();
        if ((i3 & 1) != 0) {
            try {
                ((h) hVar.c).s();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((h) hVar.c).c;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception unused) {
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((h) hVar.c).c).getDescription();
        h hVar2 = (h) hVar.c;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) hVar2.c).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0005d = new h(clipData, 2);
        } else {
            C0006e c0006e = new C0006e();
            c0006e.c = clipData;
            c0006e.f416d = 2;
            interfaceC0005d = c0006e;
        }
        interfaceC0005d.b(((InputContentInfo) hVar2.c).getLinkUri());
        interfaceC0005d.a(bundle2);
        if (T.h((View) bVar.f76b, interfaceC0005d.f()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i3, bundle);
    }
}
