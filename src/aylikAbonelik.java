import java.util.Scanner;

public class aylikAbonelik implements Abonelik {

    Scanner scanner = new Scanner(System.in);
   private void abonelikIptal() {
        this.abonelikIptal();
    }
    private void abonelikOlustur() {
        this.abonelikOlustur();
    }
    public Abonelik abonelikIslem(){
      System.out.println("Abonelik iptai çin 1, Abonelik Satın almak için 2 ");
       String secim = scanner.nextLine();
        Scanner scanner = new Scanner(System.in);

        Musteri musteri = new Musteri.MusteriBuilder().build();
        if (secim.equals("1")){
            abonelikIptal(musteri);
        }
        else if(secim.equals("2")){
            abonelikOlustur(musteri);
        }
        else {
            System.out.println("Hatali giris");
        }
        return null;
    }

    @Override
    public void abonelikOlustur(Musteri musteri) {
        System.out.println("Aylik aboneliginiz oluşturuldu");
    }

    @Override
    public void abonelikIptal(Musteri musteri) {
        System.out.println("Aylik aboneliginiz iptal edildi");
    }
}
