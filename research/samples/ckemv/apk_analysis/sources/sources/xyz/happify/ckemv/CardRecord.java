package xyz.happify.ckemv;

import X1.g;
import java.util.List;

/* loaded from: classes.dex */
public final class CardRecord {
    private final String aid;
    private final String network;
    private final String pan;
    private final String rawData;
    private final List<HarvestedTx> txs;

    public CardRecord(String str, String str2, String str3, String str4, List<HarvestedTx> list) {
        g.e(str, "pan");
        g.e(str2, "aid");
        g.e(str3, "network");
        g.e(str4, "rawData");
        g.e(list, "txs");
        this.pan = str;
        this.aid = str2;
        this.network = str3;
        this.rawData = str4;
        this.txs = list;
    }

    public static /* synthetic */ CardRecord copy$default(CardRecord cardRecord, String str, String str2, String str3, String str4, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cardRecord.pan;
        }
        if ((i3 & 2) != 0) {
            str2 = cardRecord.aid;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = cardRecord.network;
        }
        String str6 = str3;
        if ((i3 & 8) != 0) {
            str4 = cardRecord.rawData;
        }
        String str7 = str4;
        if ((i3 & 16) != 0) {
            list = cardRecord.txs;
        }
        return cardRecord.copy(str, str5, str6, str7, list);
    }

    public final String component1() {
        return this.pan;
    }

    public final String component2() {
        return this.aid;
    }

    public final String component3() {
        return this.network;
    }

    public final String component4() {
        return this.rawData;
    }

    public final List<HarvestedTx> component5() {
        return this.txs;
    }

    public final CardRecord copy(String str, String str2, String str3, String str4, List<HarvestedTx> list) {
        g.e(str, "pan");
        g.e(str2, "aid");
        g.e(str3, "network");
        g.e(str4, "rawData");
        g.e(list, "txs");
        return new CardRecord(str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardRecord)) {
            return false;
        }
        CardRecord cardRecord = (CardRecord) obj;
        return g.a(this.pan, cardRecord.pan) && g.a(this.aid, cardRecord.aid) && g.a(this.network, cardRecord.network) && g.a(this.rawData, cardRecord.rawData) && g.a(this.txs, cardRecord.txs);
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getNetwork() {
        return this.network;
    }

    public final String getPan() {
        return this.pan;
    }

    public final String getRawData() {
        return this.rawData;
    }

    public final List<HarvestedTx> getTxs() {
        return this.txs;
    }

    public int hashCode() {
        return this.txs.hashCode() + ((this.rawData.hashCode() + ((this.network.hashCode() + ((this.aid.hashCode() + (this.pan.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "CardRecord(pan=" + this.pan + ", aid=" + this.aid + ", network=" + this.network + ", rawData=" + this.rawData + ", txs=" + this.txs + ")";
    }
}
