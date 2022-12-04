import  java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double KdvOrani = 0.18, KdvTutari,KdvliTutar, tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("tutarı giriniz :");
        tutar = input.nextDouble();
        KdvTutari = tutar * KdvOrani;
        KdvliTutar = tutar + KdvTutari;

        System.out.println("KDV siz tutar: " + tutar);
        System.out.println("KDV oranınız :" + KdvTutari);
        System.out.println("KDV li değeriniz :"+ KdvliTutar);





    }
}
