package androidx.appcompat.view.menu;

import J.B;
import J.T;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import e.AbstractC0116a;
import j.C0209o;
import j.InterfaceC0189A;
import j.MenuC0207m;
import java.util.WeakHashMap;
import v0.m;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0189A, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b, reason: collision with root package name */
    public C0209o f1515b;
    public ImageView c;

    /* renamed from: d, reason: collision with root package name */
    public RadioButton f1516d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f1517e;

    /* renamed from: f, reason: collision with root package name */
    public CheckBox f1518f;
    public TextView g;
    public ImageView h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f1519i;

    /* renamed from: j, reason: collision with root package name */
    public LinearLayout f1520j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f1521k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1522l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f1523m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1524n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f1525o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1526p;

    /* renamed from: q, reason: collision with root package name */
    public LayoutInflater f1527q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1528r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m F2 = m.F(getContext(), attributeSet, AbstractC0116a.f2679r, R.attr.listMenuViewStyle, 0);
        this.f1521k = F2.r(5);
        TypedArray typedArray = (TypedArray) F2.f5087d;
        this.f1522l = typedArray.getResourceId(1, -1);
        this.f1524n = typedArray.getBoolean(7, false);
        this.f1523m = context;
        this.f1525o = F2.r(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1526p = obtainStyledAttributes.hasValue(0);
        F2.J();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1527q == null) {
            this.f1527q = LayoutInflater.from(getContext());
        }
        return this.f1527q;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1519i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1519i.getLayoutParams();
        rect.top = this.f1519i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if ((r0.f3345n.n() ? r0.f3341j : r0.h) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    @Override // j.InterfaceC0189A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0209o c0209o) {
        boolean z3;
        String sb;
        this.f1515b = c0209o;
        int i3 = 0;
        setVisibility(c0209o.isVisible() ? 0 : 8);
        setTitle(c0209o.f3338e);
        setCheckable(c0209o.isCheckable());
        if (c0209o.f3345n.o()) {
            if ((c0209o.f3345n.n() ? c0209o.f3341j : c0209o.h) != 0) {
                z3 = true;
                c0209o.f3345n.n();
                if (z3) {
                    C0209o c0209o2 = this.f1515b;
                    if (c0209o2.f3345n.o()) {
                    }
                }
                i3 = 8;
                if (i3 == 0) {
                    TextView textView = this.g;
                    C0209o c0209o3 = this.f1515b;
                    char c = c0209o3.f3345n.n() ? c0209o3.f3341j : c0209o3.h;
                    if (c == 0) {
                        sb = "";
                    } else {
                        MenuC0207m menuC0207m = c0209o3.f3345n;
                        Resources resources = menuC0207m.f3309a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0207m.f3309a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i4 = menuC0207m.n() ? c0209o3.f3342k : c0209o3.f3340i;
                        C0209o.c(sb2, i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        C0209o.c(sb2, i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        C0209o.c(sb2, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        C0209o.c(sb2, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        C0209o.c(sb2, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        C0209o.c(sb2, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c != ' ') {
                            sb2.append(c);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.g.getVisibility() != i3) {
                    this.g.setVisibility(i3);
                }
                setIcon(c0209o.getIcon());
                setEnabled(c0209o.isEnabled());
                setSubMenuArrowVisible(c0209o.hasSubMenu());
                setContentDescription(c0209o.f3348q);
            }
        }
        z3 = false;
        c0209o.f3345n.n();
        if (z3) {
        }
        i3 = 8;
        if (i3 == 0) {
        }
        if (this.g.getVisibility() != i3) {
        }
        setIcon(c0209o.getIcon());
        setEnabled(c0209o.isEnabled());
        setSubMenuArrowVisible(c0209o.hasSubMenu());
        setContentDescription(c0209o.f3348q);
    }

    @Override // j.InterfaceC0189A
    public C0209o getItemData() {
        return this.f1515b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = T.f402a;
        B.q(this, this.f1521k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1517e = textView;
        int i3 = this.f1522l;
        if (i3 != -1) {
            textView.setTextAppearance(this.f1523m, i3);
        }
        this.g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1525o);
        }
        this.f1519i = (ImageView) findViewById(R.id.group_divider);
        this.f1520j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (this.c != null && this.f1524n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.c.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f1516d == null && this.f1518f == null) {
            return;
        }
        if ((this.f1515b.f3355x & 4) != 0) {
            if (this.f1516d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1516d = radioButton;
                LinearLayout linearLayout = this.f1520j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1516d;
            view = this.f1518f;
        } else {
            if (this.f1518f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1518f = checkBox;
                LinearLayout linearLayout2 = this.f1520j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1518f;
            view = this.f1516d;
        }
        if (z3) {
            compoundButton.setChecked(this.f1515b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1518f;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1516d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f1515b.f3355x & 4) != 0) {
            if (this.f1516d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1516d = radioButton;
                LinearLayout linearLayout = this.f1520j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1516d;
        } else {
            if (this.f1518f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1518f = checkBox;
                LinearLayout linearLayout2 = this.f1520j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1518f;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f1528r = z3;
        this.f1524n = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f1519i;
        if (imageView != null) {
            imageView.setVisibility((this.f1526p || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1515b.f3345n.getClass();
        boolean z3 = this.f1528r;
        if (z3 || this.f1524n) {
            ImageView imageView = this.c;
            if (imageView == null && drawable == null && !this.f1524n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.c = imageView2;
                LinearLayout linearLayout = this.f1520j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1524n) {
                this.c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.c;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.c.getVisibility() != 0) {
                this.c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1517e.getVisibility() != 8) {
                this.f1517e.setVisibility(8);
            }
        } else {
            this.f1517e.setText(charSequence);
            if (this.f1517e.getVisibility() != 0) {
                this.f1517e.setVisibility(0);
            }
        }
    }
}
