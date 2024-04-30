import java.util.Scanner;

public class Musteri {
    private final String firstName;
    private final String lastName;
    private final String Plaka;
    private final String adres;
    private final String tckimlikNo;
    private final String email;
    private final String telNo;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPlaka() {
        return Plaka;
    }
    public String getAdres() {
        return adres;
    }
    public String getTckimlikNo() {
        return tckimlikNo;
    }
    public String getEmail() {
        return email;
    }
    public String getTelNo() {
        return telNo;
    }
    private Musteri(MusteriBuilder builder){
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.Plaka=builder.Plaka;
        this.adres=builder.adres;
        this.tckimlikNo=builder.tckimlikNo;
        this.email=builder.email;
        this.telNo =builder.telNo;
    }
    public static class MusteriBuilder {
        private final String firstName;
        private final String lastName;
        private final String Plaka;
        private String adres;
        private String tckimlikNo;
        private String email;
        private String telNo;


        public MusteriBuilder(String firstName, String lastName, String plaka) {
            this.firstName = firstName;
            this.lastName = lastName;
            Plaka = plaka;
        }
        public MusteriBuilder adres(String adres){
            this.adres=adres;
            return this;
        }
        public MusteriBuilder tckimlikno(String tckimlikNo){
            this.tckimlikNo=tckimlikNo;
            return this;
        }
        public MusteriBuilder email(String email){
            this.email=email;
            return this;
        }
        public MusteriBuilder telNo(String telNo){
            this.telNo=telNo;
            return this;
        }

        public MusteriBuilder(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("First Name: ");
            this.firstName = scanner.nextLine();

            System.out.println("Last Name: ");
            this.lastName = scanner.nextLine();

            System.out.println("Plaka: ");
            this.Plaka = scanner.nextLine();

            System.out.println("Adres(opsiyonel): ");
            this.adres = scanner.nextLine();

            System.out.println("TC kimlik no(opsiyonel): ");
            this.tckimlikNo = scanner.nextLine();

            System.out.println("Email adresi(opsiyonel): ");
            this.email = scanner.nextLine();

            System.out.println("Telefon numarasi(opsiyonel): ");
            this.telNo = scanner.nextLine();

            scanner.close();

        }
        public Musteri build(){
            return new Musteri(this);
        }
    }
       public static void musteriIslem(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hangi islemi yapmak istersiniz: ");
        System.out.println("1. Abonelik işlemleri");
        System.out.println("2. Araç girişlerini Görüntüleme");
        System.out.println("3. Ödeme geçmişini görüntüleme");
        System.out.println("4. Cıkıs");

        int secim = scanner.nextInt();

        switch (secim){
            case 1:
                AbonelikFactory.abonelikTipi();
                break;
            case 2:
                odemeGecmisi();
                break;
            case 3:
                girisleriGoruntule();
                break;
            case 4:
                System.out.println("Cıkıs yapılıyor...");
                scanner.close();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
       }
       public static void odemeGecmisi(){

           System.out.println("Odeme gecmisiniz:");
       }
       public static void girisleriGoruntule(){
           System.out.println("Girisleriniz: ");
       }
}
