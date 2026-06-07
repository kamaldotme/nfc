package F0;

import K.B;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f.C0153a;
import f.C0154b;
import f.C0157e;
import f.DialogC0158f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements B {

    /* renamed from: b, reason: collision with root package name */
    public int f166b;
    public final Object c;

    public /* synthetic */ e(int i3, Object[] objArr) {
        this.f166b = i3;
        this.c = objArr;
    }

    public DialogC0158f a() {
        C0154b c0154b = (C0154b) this.c;
        DialogC0158f dialogC0158f = new DialogC0158f(c0154b.f2875a, this.f166b);
        View view = c0154b.f2878e;
        C0157e c0157e = dialogC0158f.g;
        if (view != null) {
            c0157e.f2894o = view;
        } else {
            CharSequence charSequence = c0154b.f2877d;
            if (charSequence != null) {
                c0157e.f2885d = charSequence;
                TextView textView = c0157e.f2892m;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0154b.c;
            if (drawable != null) {
                c0157e.f2890k = drawable;
                c0157e.f2889j = 0;
                ImageView imageView = c0157e.f2891l;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0157e.f2891l.setImageDrawable(drawable);
                }
            }
        }
        if (c0154b.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0154b.f2876b.inflate(c0157e.f2898s, (ViewGroup) null);
            int i3 = c0154b.f2880i ? c0157e.f2899t : c0157e.f2900u;
            ListAdapter listAdapter = c0154b.g;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(c0154b.f2875a, i3, R.id.text1, (Object[]) null);
            }
            c0157e.f2895p = listAdapter;
            c0157e.f2896q = c0154b.f2881j;
            if (c0154b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0153a(c0154b, c0157e));
            }
            if (c0154b.f2880i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0157e.f2886e = alertController$RecycleListView;
        }
        dialogC0158f.setCancelable(true);
        dialogC0158f.setCanceledOnTouchOutside(true);
        dialogC0158f.setOnCancelListener(null);
        dialogC0158f.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = c0154b.f2879f;
        if (onKeyListener != null) {
            dialogC0158f.setOnKeyListener(onKeyListener);
        }
        return dialogC0158f;
    }

    public boolean b() {
        return this.f166b < ((List) this.c).size();
    }

    @Override // K.B
    public boolean e(View view) {
        ((BottomSheetBehavior) this.c).B(this.f166b);
        return true;
    }

    public e(int i3, A1.i iVar) {
        this.f166b = i3;
        this.c = new A1.i[]{iVar};
    }

    public e(A1.i iVar, A1.i iVar2) {
        this.f166b = 62;
        this.c = new A1.i[]{iVar, iVar2};
    }

    public e(ArrayList arrayList) {
        this.c = arrayList;
    }

    public e(Context context) {
        int i3 = DialogC0158f.i(context, 0);
        this.c = new C0154b(new ContextThemeWrapper(context, DialogC0158f.i(context, i3)));
        this.f166b = i3;
    }

    public e(BottomSheetBehavior bottomSheetBehavior, int i3) {
        this.c = bottomSheetBehavior;
        this.f166b = i3;
    }
}
