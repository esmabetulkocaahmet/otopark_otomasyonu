import java.util.Scanner;

public class isletmeSahibi {
    public static void islemler(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kimin sistemine erişmek istersiniz?(Müdür/Muhasebe) ");
        String kisi = scanner.nextLine();
        if (kisi.equals("Muhasebe")){
            Muhasebe.odemePlani();
        } else if (kisi.equals("Müdür")) {
            Mudur.Mudurislem();
        }
        else {
            System.out.println("Girdiğiniz kişi bulunmamaktadır.");
        }
        scanner.close();
    }
}
