import java.util.Scanner;
public class KdvOraniCalisma {
    public static void main(String[] args) {
        double kdvtutari,kdvorani = 0.18,tutar,kdvlitutar;
        Scanner input = new Scanner(System.in);
        System.out.print("please write the value what you want to calculate : ");
        tutar = input.nextDouble();
        kdvtutari = tutar * kdvorani;
        kdvlitutar = kdvtutari + tutar;
        System.out.println("this is your first value :" + tutar);
        System.out.println("this the value of tax :" + kdvorani);
        System.out.println("this is the final result :" + kdvlitutar);



    }
}
git init
git add .
