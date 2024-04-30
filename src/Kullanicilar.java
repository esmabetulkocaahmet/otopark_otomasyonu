import java.util.Scanner;

public class Kullanicilar {
    private String kisi;

    public Kullanicilar(String kisi){
        this.kisi = kisi;
    }

    public static void kullanici(){
        System.out.println("Giris yapmak istediginiz kullaniciyi seciniz: ");
        System.out.println("1. Musteri");
        System.out.println("2. İsletme Sahibi");
        System.out.println("3. Mudur");
        System.out.println("4. Muhasebe");

        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();

        switch (secim){
            case 1:
                Musteri.musteriIslem();
                break;
            case 2:
                isletmeSahibi.islemler();
                break;
            case 3:
               Mudur.Mudurislem();
                break;
            case 4:
                Muhasebe.odemePlani();
                break;
            case 5:
                System.out.println("Cıkıs yapılıyor...");
                break;
            default:
                System.out.println("Hatali giris yaptiniz.");
                break;
        }
    }

}
