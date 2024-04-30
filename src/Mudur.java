import java.util.Scanner;

public class Mudur {
       private static Mudur instance;
       Scanner scanner = new Scanner(System.in);
    public static Mudur getInstance() {
        if(instance==null){
            synchronized (Mudur.class){
                if (instance== null){
                    System.out.println("getInstance():getInstance"+"ilk kez çağrıldı!");
                    instance = new Mudur();
                }
            }
        }

        return instance;
    }
      private static String aylikRapor;
      private static String oneriler;
      private static String sikayetler;
    public Mudur(){

        this.aylikRapor = "";
        this.oneriler = "";
        this.sikayetler = "";
    }

        public static void Mudurislem(){
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Yapmak istediginiz işlemi seçiniz :");
            System.out.println("1. Aylik Rapor oluşturma ");
            System.out.println("2.Aylık Rapor Görüntüle ");
            System.out.println("3. Onerileri  göruntuleme");
            System.out.println("4. Sikayetleri göruntuleme");
            System.out.println("5. Cıkıs");

            int secim = scanner2.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Aylık Rapor oluşturunuz: ");
                    aylikRaporYazma();
                    break;
                case 2:
                    System.out.println("Aylık Raporunuz: ");
                    aylikRaporGoruntuleme();
                    break;
                case 3:
                     System.out.println("Oneriler: ");
                     oneriTakibi();
                    break;
                case 4:
                    System.out.println("Sikayetler:");
                    sikayetTakibi();
                    break;
                case 5:
                    System.out.println("Cıkıs yapılıyor...");
                    scanner2.close();
                    break;
                default:
                    System.out.println("Gecersiz secim");
                    break;
            }
        }

        public static void aylikRaporGoruntuleme () {
            if (aylikRapor.isEmpty()) {
                System.out.println("Olusturulmus Rapor bulunamamaktadir");
            } else {
                System.out.println(aylikRapor);
            }
        }

        public static void aylikRaporYazma () {
            Scanner scanner1 = new Scanner(System.in);
            String aylikRapor=scanner1.next();
            aylikRapor = "Aylik rapor mudur tarafından olusturuldu";
            System.out.println("Aylik rapor oluşturuldu.");
        }
        public static void oneriTakibi () {
        if (oneriler.isEmpty()) {
            System.out.println("Oneri bulunmamaktadir! ");
        } else {
            System.out.println(oneriler);
        }
    }
    public static void sikayetTakibi(){
        if (sikayetler.isEmpty()) {
            System.out.println("Sikayet bulunmamaktadir! ");
        } else {
            System.out.println(sikayetler);
        }
    }


}
