import java.util.Scanner;

public class AbonelikFactory{
    public static Abonelik abonelikTipi(){
        String aboneTuru = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Abonelik turunuzu belirtin (aylik/yillik)");
        aboneTuru = scanner.next();
        if (aboneTuru.equals("aylik")){
            return new aylikAbonelik().abonelikIslem();
        }
        else if (aboneTuru.equals("yillik")){
            return new yillikAbonelik();
        }
        else
            return null;
    }
}
