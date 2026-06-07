package k;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class b1 extends O.c implements View.OnClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f3653y = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f3654i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3655j;

    /* renamed from: k, reason: collision with root package name */
    public final LayoutInflater f3656k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f3657l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f3658m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f3659n;

    /* renamed from: o, reason: collision with root package name */
    public final WeakHashMap f3660o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3661p;

    /* renamed from: q, reason: collision with root package name */
    public int f3662q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f3663r;

    /* renamed from: s, reason: collision with root package name */
    public int f3664s;

    /* renamed from: t, reason: collision with root package name */
    public int f3665t;

    /* renamed from: u, reason: collision with root package name */
    public int f3666u;

    /* renamed from: v, reason: collision with root package name */
    public int f3667v;

    /* renamed from: w, reason: collision with root package name */
    public int f3668w;

    /* renamed from: x, reason: collision with root package name */
    public int f3669x;

    public b1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.c = true;
        this.f691d = null;
        this.f690b = false;
        this.f692e = -1;
        this.f693f = new O.a(this);
        this.g = new O.b(0, this);
        this.f3655j = suggestionRowLayout;
        this.f3654i = suggestionRowLayout;
        this.f3656k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f3662q = 1;
        this.f3664s = -1;
        this.f3665t = -1;
        this.f3666u = -1;
        this.f3667v = -1;
        this.f3668w = -1;
        this.f3669x = -1;
        this.f3657l = searchView;
        this.f3658m = searchableInfo;
        this.f3661p = searchView.getSuggestionCommitIconResId();
        this.f3659n = context;
        this.f3660o = weakHashMap;
    }

    public static String h(Cursor cursor, int i3) {
        if (i3 == -1) {
            return null;
        }
        try {
            return cursor.getString(i3);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    @Override // O.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        Drawable f3;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        a1 a1Var = (a1) view.getTag();
        int i3 = this.f3669x;
        int i4 = i3 != -1 ? cursor.getInt(i3) : 0;
        TextView textView = a1Var.f3648a;
        if (textView != null) {
            String h = h(cursor, this.f3664s);
            textView.setText(h);
            if (TextUtils.isEmpty(h)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f3659n;
        TextView textView2 = a1Var.f3649b;
        if (textView2 != null) {
            String h3 = h(cursor, this.f3666u);
            if (h3 != null) {
                if (this.f3663r == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f3663r = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h3);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f3663r, null), 0, h3.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f3665t);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = a1Var.c;
        if (imageView != null) {
            int i5 = this.f3667v;
            if (i5 == -1) {
                f3 = null;
            } else {
                f3 = f(cursor.getString(i5));
                if (f3 == null) {
                    ComponentName searchActivity = this.f3658m.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f3660o;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f3 = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e3) {
                            e3.toString();
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                searchActivity.flattenToShortString();
                            } else {
                                f3 = drawable;
                                weakHashMap.put(flattenToShortString, f3 != null ? null : f3.getConstantState());
                            }
                        }
                        f3 = null;
                        weakHashMap.put(flattenToShortString, f3 != null ? null : f3.getConstantState());
                    }
                    if (f3 == null) {
                        f3 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(f3);
            if (f3 == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                f3.setVisible(false, false);
                f3.setVisible(true, false);
            }
        }
        ImageView imageView2 = a1Var.f3650d;
        if (imageView2 != null) {
            int i6 = this.f3668w;
            Drawable f4 = i6 == -1 ? null : f(cursor.getString(i6));
            imageView2.setImageDrawable(f4);
            if (f4 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                f4.setVisible(false, false);
                f4.setVisible(true, false);
            }
        }
        int i7 = this.f3662q;
        ImageView imageView3 = a1Var.f3651e;
        if (i7 != 2 && (i7 != 1 || (i4 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // O.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f3664s = cursor.getColumnIndex("suggest_text_1");
                this.f3665t = cursor.getColumnIndex("suggest_text_2");
                this.f3666u = cursor.getColumnIndex("suggest_text_2_url");
                this.f3667v = cursor.getColumnIndex("suggest_icon_1");
                this.f3668w = cursor.getColumnIndex("suggest_icon_2");
                this.f3669x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // O.c
    public final String c(Cursor cursor) {
        String h;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        SearchableInfo searchableInfo = this.f3658m;
        if (searchableInfo.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h;
    }

    @Override // O.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f3656k.inflate(this.f3654i, viewGroup, false);
        inflate.setTag(new a1(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f3661p);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f3659n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.f3660o;
        Context context = this.f3659n;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable b3 = y.c.b(context, parseInt);
                if (b3 != null) {
                    weakHashMap.put(str2, b3.getConstantState());
                }
                return b3;
            } catch (Resources.NotFoundException unused) {
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e3) {
                    Objects.toString(parse);
                    e3.getMessage();
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = e(parse);
                        if (drawable != null) {
                            weakHashMap.put(str, drawable.getConstantState());
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream == null) {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                    try {
                        drawable = Drawable.createFromStream(openInputStream, null);
                        if (drawable != null) {
                        }
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException unused4) {
                            parse.toString();
                        }
                    }
                }
            }
        }
        return drawable;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f3659n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // O.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            View inflate = this.f3656k.inflate(this.f3655j, viewGroup, false);
            if (inflate != null) {
                ((a1) inflate.getTag()).f3648a.setText(e3.toString());
            }
            return inflate;
        }
    }

    @Override // O.c, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            View d3 = d(viewGroup);
            ((a1) d3.getTag()).f3648a.setText(e3.toString());
            return d3;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f691d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f691d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3657l.r((CharSequence) tag);
        }
    }
}
