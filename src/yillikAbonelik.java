import java.util.Scanner;

public class yillikAbonelik implements Abonelik {
    Scanner scanner = new Scanner(System.in);
    public void abonelikIslem(){
        System.out.println("Abonelik iptai çin 1, Abonelik Satın almak için 2 ");
        String secim = scanner.nextLine();

        if (secim.equals("1")){
            abonelikIptal();
        }
        else if(secim.equals("2")){
            abonelikOlustur();
        }
        else {
            System.out.println("Hatali giris");
        }
    }

    private void abonelikIptal() {
        this.abonelikIptal();
    }

    private void abonelikOlustur() {
        this.abonelikOlustur();
    }
    public void abonelikOlustur(Musteri musteri) {
        System.out.println("Yillik aboneliginiz olusturuldu");
    }
    @Override
    public void abonelikIptal(Musteri musteri) {
        System.out.println("Yillik aboneliginiz iptal edildi");
    }
}
