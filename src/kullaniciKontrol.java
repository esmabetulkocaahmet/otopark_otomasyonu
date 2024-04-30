import java.io.*;
import java.util.Scanner;

public class kullaniciKontrol {
    public static boolean kullaniciKontrol(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanici adini giriniz: ");
        String userName = scanner.nextLine();
        System.out.println("Sifrenizi giriniz: ");
        String password = scanner.nextLine();

        boolean kullaniciKayitli = false;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C://Users//Esma Betül KOCAAHMET//IdeaProjects//YazilimMimarisiodev//src//kullanicilar.txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] parts = line.split(",");
                if (parts.length == 2){
                    String fileUsenname = parts[0];
                    String filePassword = parts[1];
                    if (fileUsenname.equals(userName) && filePassword.equals(password)){
                        kullaniciKayitli = true;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (kullaniciKayitli){
            System.out.println("Giris basarili");
        }
        else {
            System.out.println("Kullanici adi veya sifre hatali tekrar kontrol ediniz!");
            yeniKayit();
        }
        return kullaniciKayitli;
    }

    public static void yeniKayit(){
        System.out.println("Böyle bir kullanıcı bulunmamaktadir.Kayitli degilseniz Kayit olun.");
        System.out.println("1. Kayıt ol");
        System.out.println("2. Yeniden giriş yap");
        System.out.println("3. Cıkıs");

        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();

        switch (secim){
            case 1:
                if (kayitOl()){
                    System.out.println("Yeni kullanici olusturuldu.");
                    kullaniciKontrol();
                }
                else {
                    System.out.println("Maalesef kayit yapilamadi");
                }
                break;
            case 2:
               kullaniciKontrol();
               break;
            case 3:
                System.out.println("Cıkıs yapiliyor...");
                break;
            default:
                System.out.println("Hatali Giris Yaptiniz.");
        }
    }
    public static boolean kayitOl(){

        System.out.println("Lutfen gerekli bilgileri giriniz. ");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Bir kullanici adi belirleyiniz: ");
        String usenName = scanner.next();
        System.out.println("Guclu bir sifre belirleyiniz: ");
        String password = scanner.next();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C://Users//Esma Betül KOCAAHMET//IdeaProjects//YazilimMimarisiodev//src//kullanicilar.txt",true))){
           writer.write(usenName+ "," +password+ "\n");
           return true;
        } catch (IOException e) {
            System.out.println("Dosya yazma hatasi"+ e.getMessage());
            return false;
        }
    }
}
