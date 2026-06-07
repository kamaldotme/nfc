package t;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f4797a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4798b;
    public final h c;

    /* renamed from: d, reason: collision with root package name */
    public final g f4799d;

    /* renamed from: e, reason: collision with root package name */
    public final j f4800e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4801f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t.i] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, t.h] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t.g] */
    /* JADX WARN: Type inference failed for: r0v3, types: [t.j, java.lang.Object] */
    public f() {
        ?? obj = new Object();
        obj.f4863a = 0;
        obj.f4864b = 0;
        obj.c = 1.0f;
        obj.f4865d = Float.NaN;
        this.f4798b = obj;
        ?? obj2 = new Object();
        obj2.f4860a = -1;
        obj2.f4861b = -1;
        obj2.c = Float.NaN;
        obj2.f4862d = Float.NaN;
        this.c = obj2;
        ?? obj3 = new Object();
        obj3.f4828a = false;
        obj3.f4833d = -1;
        obj3.f4835e = -1;
        obj3.f4837f = -1.0f;
        obj3.g = -1;
        obj3.h = -1;
        obj3.f4841i = -1;
        obj3.f4842j = -1;
        obj3.f4843k = -1;
        obj3.f4844l = -1;
        obj3.f4845m = -1;
        obj3.f4846n = -1;
        obj3.f4847o = -1;
        obj3.f4848p = -1;
        obj3.f4849q = -1;
        obj3.f4850r = -1;
        obj3.f4851s = -1;
        obj3.f4852t = 0.5f;
        obj3.f4853u = 0.5f;
        obj3.f4854v = null;
        obj3.f4855w = -1;
        obj3.f4856x = 0;
        obj3.f4857y = 0.0f;
        obj3.f4858z = -1;
        obj3.f4803A = -1;
        obj3.f4804B = -1;
        obj3.f4805C = -1;
        obj3.D = -1;
        obj3.f4806E = -1;
        obj3.f4807F = -1;
        obj3.f4808G = -1;
        obj3.f4809H = -1;
        obj3.f4810I = -1;
        obj3.f4811J = -1;
        obj3.f4812K = -1;
        obj3.f4813L = -1;
        obj3.f4814M = -1;
        obj3.f4815N = -1;
        obj3.f4816O = -1.0f;
        obj3.f4817P = -1.0f;
        obj3.f4818Q = 0;
        obj3.f4819R = 0;
        obj3.f4820S = 0;
        obj3.f4821T = 0;
        obj3.f4822U = -1;
        obj3.f4823V = -1;
        obj3.f4824W = -1;
        obj3.f4825X = -1;
        obj3.f4826Y = 1.0f;
        obj3.f4827Z = 1.0f;
        obj3.f4829a0 = -1;
        obj3.f4831b0 = 0;
        obj3.f4832c0 = -1;
        obj3.f4839g0 = false;
        obj3.f4840h0 = false;
        obj3.i0 = true;
        this.f4799d = obj3;
        ?? obj4 = new Object();
        obj4.f4867a = 0.0f;
        obj4.f4868b = 0.0f;
        obj4.c = 0.0f;
        obj4.f4869d = 1.0f;
        obj4.f4870e = 1.0f;
        obj4.f4871f = Float.NaN;
        obj4.g = Float.NaN;
        obj4.h = 0.0f;
        obj4.f4872i = 0.0f;
        obj4.f4873j = 0.0f;
        obj4.f4874k = false;
        obj4.f4875l = 0.0f;
        this.f4800e = obj4;
        this.f4801f = new HashMap();
    }

    public final void a(d dVar) {
        g gVar = this.f4799d;
        dVar.f4765d = gVar.g;
        dVar.f4767e = gVar.h;
        dVar.f4769f = gVar.f4841i;
        dVar.g = gVar.f4842j;
        dVar.h = gVar.f4843k;
        dVar.f4773i = gVar.f4844l;
        dVar.f4774j = gVar.f4845m;
        dVar.f4776k = gVar.f4846n;
        dVar.f4778l = gVar.f4847o;
        dVar.f4782p = gVar.f4848p;
        dVar.f4783q = gVar.f4849q;
        dVar.f4784r = gVar.f4850r;
        dVar.f4785s = gVar.f4851s;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = gVar.f4805C;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = gVar.D;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = gVar.f4806E;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = gVar.f4807F;
        dVar.f4790x = gVar.f4815N;
        dVar.f4791y = gVar.f4814M;
        dVar.f4787u = gVar.f4811J;
        dVar.f4789w = gVar.f4813L;
        dVar.f4792z = gVar.f4852t;
        dVar.f4735A = gVar.f4853u;
        dVar.f4779m = gVar.f4855w;
        dVar.f4780n = gVar.f4856x;
        dVar.f4781o = gVar.f4857y;
        dVar.f4736B = gVar.f4854v;
        dVar.f4749P = gVar.f4858z;
        dVar.f4750Q = gVar.f4803A;
        dVar.f4738E = gVar.f4816O;
        dVar.D = gVar.f4817P;
        dVar.f4740G = gVar.f4819R;
        dVar.f4739F = gVar.f4818Q;
        dVar.f4752S = gVar.f4839g0;
        dVar.f4753T = gVar.f4840h0;
        dVar.f4741H = gVar.f4820S;
        dVar.f4742I = gVar.f4821T;
        dVar.f4745L = gVar.f4822U;
        dVar.f4746M = gVar.f4823V;
        dVar.f4743J = gVar.f4824W;
        dVar.f4744K = gVar.f4825X;
        dVar.f4747N = gVar.f4826Y;
        dVar.f4748O = gVar.f4827Z;
        dVar.f4751R = gVar.f4804B;
        dVar.c = gVar.f4837f;
        dVar.f4760a = gVar.f4833d;
        dVar.f4762b = gVar.f4835e;
        ((ViewGroup.MarginLayoutParams) dVar).width = gVar.f4830b;
        ((ViewGroup.MarginLayoutParams) dVar).height = gVar.c;
        String str = gVar.f4838f0;
        if (str != null) {
            dVar.f4754U = str;
        }
        dVar.setMarginStart(gVar.f4809H);
        dVar.setMarginEnd(gVar.f4808G);
        dVar.a();
    }

    public final Object clone() {
        f fVar = new f();
        g gVar = fVar.f4799d;
        gVar.getClass();
        g gVar2 = this.f4799d;
        gVar.f4828a = gVar2.f4828a;
        gVar.f4830b = gVar2.f4830b;
        gVar.c = gVar2.c;
        gVar.f4833d = gVar2.f4833d;
        gVar.f4835e = gVar2.f4835e;
        gVar.f4837f = gVar2.f4837f;
        gVar.g = gVar2.g;
        gVar.h = gVar2.h;
        gVar.f4841i = gVar2.f4841i;
        gVar.f4842j = gVar2.f4842j;
        gVar.f4843k = gVar2.f4843k;
        gVar.f4844l = gVar2.f4844l;
        gVar.f4845m = gVar2.f4845m;
        gVar.f4846n = gVar2.f4846n;
        gVar.f4847o = gVar2.f4847o;
        gVar.f4848p = gVar2.f4848p;
        gVar.f4849q = gVar2.f4849q;
        gVar.f4850r = gVar2.f4850r;
        gVar.f4851s = gVar2.f4851s;
        gVar.f4852t = gVar2.f4852t;
        gVar.f4853u = gVar2.f4853u;
        gVar.f4854v = gVar2.f4854v;
        gVar.f4855w = gVar2.f4855w;
        gVar.f4856x = gVar2.f4856x;
        gVar.f4857y = gVar2.f4857y;
        gVar.f4858z = gVar2.f4858z;
        gVar.f4803A = gVar2.f4803A;
        gVar.f4804B = gVar2.f4804B;
        gVar.f4805C = gVar2.f4805C;
        gVar.D = gVar2.D;
        gVar.f4806E = gVar2.f4806E;
        gVar.f4807F = gVar2.f4807F;
        gVar.f4808G = gVar2.f4808G;
        gVar.f4809H = gVar2.f4809H;
        gVar.f4810I = gVar2.f4810I;
        gVar.f4811J = gVar2.f4811J;
        gVar.f4812K = gVar2.f4812K;
        gVar.f4813L = gVar2.f4813L;
        gVar.f4814M = gVar2.f4814M;
        gVar.f4815N = gVar2.f4815N;
        gVar.f4816O = gVar2.f4816O;
        gVar.f4817P = gVar2.f4817P;
        gVar.f4818Q = gVar2.f4818Q;
        gVar.f4819R = gVar2.f4819R;
        gVar.f4820S = gVar2.f4820S;
        gVar.f4821T = gVar2.f4821T;
        gVar.f4822U = gVar2.f4822U;
        gVar.f4823V = gVar2.f4823V;
        gVar.f4824W = gVar2.f4824W;
        gVar.f4825X = gVar2.f4825X;
        gVar.f4826Y = gVar2.f4826Y;
        gVar.f4827Z = gVar2.f4827Z;
        gVar.f4829a0 = gVar2.f4829a0;
        gVar.f4831b0 = gVar2.f4831b0;
        gVar.f4832c0 = gVar2.f4832c0;
        gVar.f4838f0 = gVar2.f4838f0;
        int[] iArr = gVar2.f4834d0;
        if (iArr != null) {
            gVar.f4834d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            gVar.f4834d0 = null;
        }
        gVar.f4836e0 = gVar2.f4836e0;
        gVar.f4839g0 = gVar2.f4839g0;
        gVar.f4840h0 = gVar2.f4840h0;
        gVar.i0 = gVar2.i0;
        h hVar = fVar.c;
        hVar.getClass();
        h hVar2 = this.c;
        hVar2.getClass();
        hVar.f4860a = hVar2.f4860a;
        hVar.f4861b = hVar2.f4861b;
        hVar.f4862d = hVar2.f4862d;
        hVar.c = hVar2.c;
        i iVar = fVar.f4798b;
        iVar.getClass();
        i iVar2 = this.f4798b;
        iVar2.getClass();
        iVar.f4863a = iVar2.f4863a;
        iVar.c = iVar2.c;
        iVar.f4865d = iVar2.f4865d;
        iVar.f4864b = iVar2.f4864b;
        j jVar = fVar.f4800e;
        jVar.getClass();
        j jVar2 = this.f4800e;
        jVar2.getClass();
        jVar.f4867a = jVar2.f4867a;
        jVar.f4868b = jVar2.f4868b;
        jVar.c = jVar2.c;
        jVar.f4869d = jVar2.f4869d;
        jVar.f4870e = jVar2.f4870e;
        jVar.f4871f = jVar2.f4871f;
        jVar.g = jVar2.g;
        jVar.h = jVar2.h;
        jVar.f4872i = jVar2.f4872i;
        jVar.f4873j = jVar2.f4873j;
        jVar.f4874k = jVar2.f4874k;
        jVar.f4875l = jVar2.f4875l;
        fVar.f4797a = this.f4797a;
        return fVar;
    }
}
