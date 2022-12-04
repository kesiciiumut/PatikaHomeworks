import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {
        double hipotenus,kisakenar,uzunkenar;
        Scanner input = new Scanner(System.in);
        System.out.println("please write short edge :");
        kisakenar = input.nextDouble();
        System.out.println(kisakenar);
        System.out.println("please write long edge :");
        uzunkenar = input.nextDouble();
        hipotenus = (kisakenar * kisakenar) + (uzunkenar * uzunkenar);
        System.out.print("here is the result of calculation : " + hipotenus);

    }
}

