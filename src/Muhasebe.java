import java.util.Scanner;

public class Muhasebe {
        private static Muhasebe instance;

    public static Muhasebe getInstance() {
        if (instance==null){
            synchronized (Muhasebe.class) {
                if (instance == null) {
                    System.out.println("getInstance():getInstance"+"ilk kez çağırıldı!");
                    instance = new Muhasebe();
                }
            }
        }
        return instance;
    }

    public static void odemePlani(){
        System.out.println("Hangi islemi yapmak istersiniz: ");
        System.out.println("1. Odeme Planı Oluştur ");
        System.out.println("2. Odeme Planını Musteriye Gonder ");
        System.out.println("3. Odeme Planlarını Göster ");
        System.out.println("4. Cıkıs");

        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();

        switch (secim){
            case 1:
                System.out.println("Odeme Plani olusturunuz.");
                planOlusturma();
                break;
            case 2:
                musteriGonder();
                break;
            case 3:
                System.out.println("Odeme Planlari: ");
                planiGoster();
                break;
            case 4:
                System.out.println("Cıkıs yapılıyor...");
                scanner.close();
                break;
        }


    }

    private static String odemePlani;
    public Muhasebe(){
        this.odemePlani = "";

    }
    private static void planiGoster() {
        if (odemePlani.isEmpty()){
            System.out.println("Olusturulmus Rapor bulunamamaktadir");
        }
        else {
            System.out.println(odemePlani);
        }
    }

    private static void musteriGonder() {
        if (odemePlani.isEmpty()){
            System.out.println("Olusturulmus Rapor bulunamamaktadir");
        }
        else {
            System.out.println("Plan musteriye gonderildi."+odemePlani);
        }
    }

    private static void planOlusturma() {
        odemePlani = "Odeme plani muhasebe tarafından olusturuldu";
        System.out.println("Odeme Planı olusturuldu.");
    }

}
