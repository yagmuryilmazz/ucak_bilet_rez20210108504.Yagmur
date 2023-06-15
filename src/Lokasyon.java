public class Lokasyon {
    private final String ulke;
    private final String sehir;
    private final String havaalani;
    private final boolean aktif;

    public Lokasyon(String ulke, String sehir, String havaalani, boolean aktif) {
        this.ulke = ulke;
        this.sehir = sehir;
        this.havaalani = havaalani;
        this.aktif = aktif;
    }

    public String getUlke() {
        return ulke;
    }

    public String getSehir() {
        return sehir;
    }

    public String getHavaalani() {
        return havaalani;
    }

    public boolean isAktif() {
        return aktif;
    }

    public static void main(String[] args) {
        Lokasyon lokasyon = new Lokasyon("Norvec", "Oslo", "Oslo Gardermoen Havalimanı", true);
        System.out.println("Ülke: " + lokasyon.getUlke());
        System.out.println("Şehir: " + lokasyon.getSehir());
        System.out.println("Havaalanı: " + lokasyon.getHavaalani());
        System.out.println("Aktif: " + lokasyon.isAktif());
    }
}
