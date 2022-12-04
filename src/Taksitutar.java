import java.util.Scanner;

public class Taksitutar {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20,total,startprice;
        Scanner kackm = new Scanner(System.in);
        System.out.println("lütfen yolu giriniz :");
        km = kackm.nextInt();
        total = perKm * km;
        total = total + 10;

        total = (total < 20) ? 20 :total;
        System.out.print("this is the result : " + total);

    }
}
