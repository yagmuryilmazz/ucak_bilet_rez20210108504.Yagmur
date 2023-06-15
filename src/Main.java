public class Main {
    public static void main(String[] args) {
        Rezervasyon rezervasyon = new Rezervasyon("Yagmur", "Yılmaz", "2024-04-11", "06:30", 16);

        // Rezervasyon bilgilerini ekrana yazdırma
        System.out.println("Rezervasyon Bilgileri:");
        System.out.println("Ad: " + rezervasyon.getAd());
        System.out.println("Soyad: " + rezervasyon.getSoyad());
        System.out.println("Tarih: " + rezervasyon.getTarih());
        System.out.println("Saat: " + rezervasyon.getSaat());
        System.out.println("Koltuk No: " + rezervasyon.getKoltukNo());
    }
}