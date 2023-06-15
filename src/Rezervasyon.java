public class Rezervasyon {
    private final String ad;
    private final String soyad;
    private final String tarih;
    private final String saat;
    private final int koltukNo;

    public Rezervasyon(String ad, String soyad, String tarih, String saat, int koltukNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.tarih = tarih;
        this.saat = saat;
        this.koltukNo = koltukNo;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTarih() {
        return tarih;
    }

    public String getSaat() {
        return saat;
    }

    public int getKoltukNo() {
        return koltukNo;
    }
}
