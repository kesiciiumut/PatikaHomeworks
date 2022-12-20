import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int n1,n2,options;
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen ilk  sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.println("lütfen ikinci  sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("lütfen yapmak istediğiniz işlemi seçin :");
        System.out.println("   \n");

        System.out.println("1-toplama\n2-çıkartma\n3-çarpma\n4-bölme");
        options = input.nextInt();
        if (options == 1) {
            System.out.println("toplam eşittir :" + (n1 + n2));
        } else if (options == 2) {
            System.out.println("çıkartma eşittir: " + (n1 - n2));

        } else if (options == 3) {
            System.out.println("çarpma eşittir :" + (n1 * n2));


        }else if (options == 4){
            System.out.println("bölme eşittir :" + (n1/n2));
            if (n1 == 0 ){
                System.out.println("0");

            }
            if (n2 == 0){
                System.out.println("0");
            }

        }else {
            System.out.println("lütfen tekrar seçim yapın");
        }


    }
}
