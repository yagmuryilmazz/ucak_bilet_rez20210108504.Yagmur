import java.util.Scanner;

public class Ucak {
    private final String ucakModeli;
    private final String marka;
    private final String seriNo;
    private final int koltukKapasitesi;

    public Ucak(String ucakModeli, String marka, String seriNo, int koltukKapasitesi) {
        this.ucakModeli = ucakModeli;
        this.marka = marka;
        this.seriNo = seriNo;
        this.koltukKapasitesi = koltukKapasitesi;
    }

    public String getUcakModeli() {
        return ucakModeli;
    }

    public String getMarka() {
        return marka;
    }

    public String getSeriNo() {
        return seriNo;
    }

    public int getKoltukKapasitesi() {
        return koltukKapasitesi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uçak Modeli: ");
        String ucakModeli = scanner.nextLine();

        System.out.print("Marka: ");
        String marka = scanner.nextLine();

        System.out.print("Seri No: ");
        String seriNo = scanner.nextLine();

        int koltukKapasitesi;
        while (true) {
            System.out.print("Koltuk Kapasitesi: ");
            String koltukKapasitesiStr = scanner.nextLine();

            try {
                koltukKapasitesi = Integer.parseInt(koltukKapasitesiStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Geçersiz koltuk kapasitesi. Bir tamsayı girmelisiniz.");
            }
        }

        Ucak ucak = new Ucak(ucakModeli, marka, seriNo, koltukKapasitesi);
        System.out.println("Uçak Bilgileri:");
        System.out.println("Uçak Modeli: " + ucak.getUcakModeli());
        System.out.println("Marka: " + ucak.getMarka());
        System.out.println("Seri No: " + ucak.getSeriNo());
        System.out.println("Koltuk Kapasitesi: " + ucak.getKoltukKapasitesi());
    }
}

