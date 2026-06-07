package androidx.appcompat.widget;

import J.B;
import J.T;
import Q1.e;
import X0.A;
import X0.u;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import e.AbstractC0116a;
import i.InterfaceC0185c;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.A0;
import k.AbstractC0321z0;
import k.C0296n;
import k.S0;
import k.T0;
import k.U0;
import k.V0;
import k.W0;
import k.X0;
import k.Y0;
import k.Z0;
import k.b1;
import k.o1;
import v0.m;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class SearchView extends AbstractC0321z0 implements InterfaceC0185c {

    /* renamed from: h0, reason: collision with root package name */
    public static final e f1597h0;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f1598A;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f1599B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f1600C;
    public final int[] D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f1601E;

    /* renamed from: F, reason: collision with root package name */
    public final Drawable f1602F;

    /* renamed from: G, reason: collision with root package name */
    public final int f1603G;

    /* renamed from: H, reason: collision with root package name */
    public final int f1604H;

    /* renamed from: I, reason: collision with root package name */
    public final Intent f1605I;

    /* renamed from: J, reason: collision with root package name */
    public final Intent f1606J;

    /* renamed from: K, reason: collision with root package name */
    public final CharSequence f1607K;

    /* renamed from: L, reason: collision with root package name */
    public View.OnFocusChangeListener f1608L;

    /* renamed from: M, reason: collision with root package name */
    public View.OnClickListener f1609M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1610N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f1611O;

    /* renamed from: P, reason: collision with root package name */
    public O.c f1612P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f1613Q;

    /* renamed from: R, reason: collision with root package name */
    public CharSequence f1614R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f1615S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f1616T;

    /* renamed from: U, reason: collision with root package name */
    public int f1617U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1618V;

    /* renamed from: W, reason: collision with root package name */
    public CharSequence f1619W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1620a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f1621b0;

    /* renamed from: c0, reason: collision with root package name */
    public SearchableInfo f1622c0;

    /* renamed from: d0, reason: collision with root package name */
    public Bundle f1623d0;

    /* renamed from: e0, reason: collision with root package name */
    public final S0 f1624e0;

    /* renamed from: f0, reason: collision with root package name */
    public final S0 f1625f0;

    /* renamed from: g0, reason: collision with root package name */
    public final WeakHashMap f1626g0;

    /* renamed from: q, reason: collision with root package name */
    public final SearchAutoComplete f1627q;

    /* renamed from: r, reason: collision with root package name */
    public final View f1628r;

    /* renamed from: s, reason: collision with root package name */
    public final View f1629s;

    /* renamed from: t, reason: collision with root package name */
    public final View f1630t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f1631u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f1632v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f1633w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f1634x;

    /* renamed from: y, reason: collision with root package name */
    public final View f1635y;

    /* renamed from: z, reason: collision with root package name */
    public Z0 f1636z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C0296n {

        /* renamed from: f, reason: collision with root package name */
        public int f1637f;
        public SearchView g;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public final d f1638i;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1638i = new d(this);
            this.f1637f = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i3 = configuration.screenWidthDp;
            int i4 = configuration.screenHeightDp;
            if (i3 >= 960 && i4 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i3 < 600) {
                return (i3 < 640 || i4 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            e eVar = SearchView.f1597h0;
            eVar.getClass();
            e.a();
            Method method = eVar.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f1637f <= 0 || super.enoughToFilter();
        }

        @Override // k.C0296n, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.h) {
                d dVar = this.f1638i;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z3, int i3, Rect rect) {
            super.onFocusChanged(z3, i3, rect);
            SearchView searchView = this.g;
            searchView.y(searchView.f1611O);
            searchView.post(searchView.f1624e0);
            if (searchView.f1627q.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
            if (i3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z3) {
            super.onWindowFocusChanged(z3);
            if (z3 && this.g.hasFocus() && getVisibility() == 0) {
                this.h = true;
                Context context = getContext();
                e eVar = SearchView.f1597h0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f1638i;
            if (!z3) {
                this.h = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.h = true;
                    return;
                }
                this.h = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.g = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i3) {
            super.setThreshold(i3);
            this.f1637f = i3;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Q1.e, java.lang.Object] */
    static {
        e eVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.f823a = null;
            obj.f824b = null;
            obj.c = null;
            e.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                obj.f823a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                obj.f824b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            eVar = obj;
        }
        f1597h0 = eVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f1627q;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // i.InterfaceC0185c
    public final void a() {
        if (this.f1620a0) {
            return;
        }
        this.f1620a0 = true;
        SearchAutoComplete searchAutoComplete = this.f1627q;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f1621b0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1616T = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1627q;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1616T = false;
    }

    @Override // i.InterfaceC0185c
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f1627q;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1619W = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f1621b0);
        this.f1620a0 = false;
    }

    public int getImeOptions() {
        return this.f1627q.getImeOptions();
    }

    public int getInputType() {
        return this.f1627q.getInputType();
    }

    public int getMaxWidth() {
        return this.f1617U;
    }

    public CharSequence getQuery() {
        return this.f1627q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1614R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1622c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1607K : getContext().getText(this.f1622c0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1604H;
    }

    public int getSuggestionRowLayout() {
        return this.f1603G;
    }

    public O.c getSuggestionsAdapter() {
        return this.f1612P;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1619W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1623d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1622c0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1623d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i3 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f1627q;
        if (i3 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        e eVar = f1597h0;
        eVar.getClass();
        e.a();
        Method method = eVar.f823a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        eVar.getClass();
        e.a();
        Method method2 = eVar.f824b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f1627q;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f1610N) {
            clearFocus();
            y(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1624e0);
        post(this.f1625f0);
        super.onDetachedFromWindow();
    }

    @Override // k.AbstractC0321z0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        if (z3) {
            int[] iArr = this.f1600C;
            SearchAutoComplete searchAutoComplete = this.f1627q;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.D;
            getLocationInWindow(iArr2);
            int i7 = iArr[1] - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i8;
            int height = searchAutoComplete.getHeight() + i7;
            Rect rect = this.f1598A;
            rect.set(i8, i7, width, height);
            int i9 = rect.left;
            int i10 = rect.right;
            int i11 = i6 - i4;
            Rect rect2 = this.f1599B;
            rect2.set(i9, 0, i10, i11);
            Z0 z02 = this.f1636z;
            if (z02 == null) {
                Z0 z03 = new Z0(rect2, rect, searchAutoComplete);
                this.f1636z = z03;
                setTouchDelegate(z03);
            } else {
                z02.f3642b.set(rect2);
                Rect rect3 = z02.f3643d;
                rect3.set(rect2);
                int i12 = -z02.f3644e;
                rect3.inset(i12, i12);
                z02.c.set(rect);
            }
        }
    }

    @Override // k.AbstractC0321z0, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f1611O) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            int i6 = this.f1617U;
            size = i6 > 0 ? Math.min(i6, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1617U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i5 = this.f1617U) > 0) {
            size = Math.min(i5, size);
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Y0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Y0 y02 = (Y0) parcelable;
        super.onRestoreInstanceState(y02.f783b);
        y(y02.f3630d);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, P.b, k.Y0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new P.b(super.onSaveInstanceState());
        bVar.f3630d = this.f1611O;
        return bVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        post(this.f1624e0);
    }

    public final void p(int i3) {
        String h;
        Cursor cursor = this.f1612P.f691d;
        if (cursor != null && cursor.moveToPosition(i3)) {
            Intent intent = null;
            try {
                try {
                    int i4 = b1.f3653y;
                    String h3 = b1.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (h3 == null) {
                        h3 = this.f1622c0.getSuggestIntentAction();
                    }
                    if (h3 == null) {
                        h3 = "android.intent.action.SEARCH";
                    }
                    String h4 = b1.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (h4 == null) {
                        h4 = this.f1622c0.getSuggestIntentData();
                    }
                    if (h4 != null && (h = b1.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        h4 = h4 + "/" + Uri.encode(h);
                    }
                    intent = l(h3, h4 == null ? null : Uri.parse(h4), b1.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), b1.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException unused3) {
                    intent.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1627q;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i3) {
        Editable text = this.f1627q.getText();
        Cursor cursor = this.f1612P.f691d;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i3)) {
            setQuery(text);
            return;
        }
        String c = this.f1612P.c(cursor);
        if (c != null) {
            setQuery(c);
        } else {
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i3, Rect rect) {
        if (this.f1616T || !isFocusable()) {
            return false;
        }
        if (this.f1611O) {
            return super.requestFocus(i3, rect);
        }
        boolean requestFocus = this.f1627q.requestFocus(i3, rect);
        if (requestFocus) {
            y(false);
        }
        return requestFocus;
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f1627q;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1622c0 != null) {
            getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1623d0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.f1627q;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1609M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f1610N == z3) {
            return;
        }
        this.f1610N = z3;
        y(z3);
        v();
    }

    public void setImeOptions(int i3) {
        this.f1627q.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.f1627q.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.f1617U = i3;
        requestLayout();
    }

    public void setOnCloseListener(V0 v02) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1608L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(W0 w02) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1609M = onClickListener;
    }

    public void setOnSuggestionListener(X0 x02) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1614R = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        this.f1615S = z3;
        O.c cVar = this.f1612P;
        if (cVar instanceof b1) {
            ((b1) cVar).f3662q = z3 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1622c0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f1627q;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1622c0.getImeOptions());
            int inputType = this.f1622c0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1622c0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            O.c cVar = this.f1612P;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f1622c0.getSuggestAuthority() != null) {
                b1 b1Var = new b1(getContext(), this, this.f1622c0, this.f1626g0);
                this.f1612P = b1Var;
                searchAutoComplete.setAdapter(b1Var);
                ((b1) this.f1612P).f3662q = this.f1615S ? 2 : 1;
            }
            v();
        }
        SearchableInfo searchableInfo2 = this.f1622c0;
        boolean z3 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f1622c0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1605I;
            } else if (this.f1622c0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f1606J;
            }
            if (intent != null) {
                z3 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f1618V = z3;
        if (z3) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        y(this.f1611O);
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f1613Q = z3;
        y(this.f1611O);
    }

    public void setSuggestionsAdapter(O.c cVar) {
        this.f1612P = cVar;
        this.f1627q.setAdapter(cVar);
    }

    public final void t() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f1627q.getText());
        if (!z4 && (!this.f1610N || this.f1620a0)) {
            z3 = false;
        }
        int i3 = z3 ? 0 : 8;
        ImageView imageView = this.f1633w;
        imageView.setVisibility(i3);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z4 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void u() {
        int[] iArr = this.f1627q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1629s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1630t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z3 = this.f1610N;
        SearchAutoComplete searchAutoComplete = this.f1627q;
        if (z3 && (drawable = this.f1602F) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        this.f1630t.setVisibility(((this.f1613Q || this.f1618V) && !this.f1611O && (this.f1632v.getVisibility() == 0 || this.f1634x.getVisibility() == 0)) ? 0 : 8);
    }

    public final void x(boolean z3) {
        boolean z4 = this.f1613Q;
        this.f1632v.setVisibility((!z4 || !(z4 || this.f1618V) || this.f1611O || !hasFocus() || (!z3 && this.f1618V)) ? 8 : 0);
    }

    public final void y(boolean z3) {
        this.f1611O = z3;
        int i3 = 8;
        int i4 = z3 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f1627q.getText());
        this.f1631u.setVisibility(i4);
        x(!isEmpty);
        this.f1628r.setVisibility(z3 ? 8 : 0);
        ImageView imageView = this.f1601E;
        imageView.setVisibility((imageView.getDrawable() == null || this.f1610N) ? 8 : 0);
        t();
        if (this.f1618V && !this.f1611O && isEmpty) {
            this.f1632v.setVisibility(8);
            i3 = 0;
        }
        this.f1634x.setVisibility(i3);
        w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f1598A = new Rect();
        this.f1599B = new Rect();
        this.f1600C = new int[2];
        this.D = new int[2];
        this.f1624e0 = new S0(this, 0);
        this.f1625f0 = new S0(this, 1);
        this.f1626g0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        U0 u02 = new U0(this);
        u uVar = new u(2, this);
        A0 a02 = new A0(1, this);
        A a3 = new A(this, 1);
        int[] iArr = AbstractC0116a.f2682u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        m mVar = new m(context, obtainStyledAttributes);
        T.k(this, context, iArr, attributeSet, obtainStyledAttributes, i3);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1627q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1628r = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f1629s = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f1630t = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1631u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1632v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1633w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1634x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f1601E = imageView5;
        B.q(findViewById, mVar.r(20));
        B.q(findViewById2, mVar.r(25));
        imageView.setImageDrawable(mVar.r(23));
        imageView2.setImageDrawable(mVar.r(15));
        imageView3.setImageDrawable(mVar.r(12));
        imageView4.setImageDrawable(mVar.r(28));
        imageView5.setImageDrawable(mVar.r(23));
        this.f1602F = mVar.r(22);
        o1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f1603G = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1604H = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(a3);
        searchAutoComplete.setOnEditorActionListener(u02);
        searchAutoComplete.setOnItemClickListener(uVar);
        searchAutoComplete.setOnItemSelectedListener(a02);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new T0(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f1607K = obtainStyledAttributes.getText(14);
        this.f1614R = obtainStyledAttributes.getText(21);
        int i4 = obtainStyledAttributes.getInt(6, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = obtainStyledAttributes.getInt(5, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        mVar.J();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1605I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1606J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1635y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new E0.a(1, this));
        }
        y(this.f1610N);
        v();
    }
}
