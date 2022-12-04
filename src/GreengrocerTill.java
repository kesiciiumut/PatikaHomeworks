import java.util.Scanner;

public class GreengrocerTill {
    public static void main(String[] args) {
        double apple,tomato,pear,banana,eggplant,total;
        Scanner input = new Scanner(System.in);
        System.out.println("please write how much kilogram do you want to buy apple :");
        apple = input.nextDouble();
        System.out.println("please write how much kilogram do you want to buy tomato :");
        tomato = input.nextDouble();
        System.out.println("please write how much kilogram do you want to buy pear :");
        pear = input.nextDouble();
        System.out.println("please write how much kilogram do you want to buy banana :");
        banana = input.nextDouble();
        System.out.println("please write how much kilogram do you want to buy eggplant :");
        eggplant = input.nextDouble();
        apple = apple * 1.50;
        tomato = tomato * 3.00;
        pear = pear * 1;
        banana = banana * 10;
        eggplant = eggplant * 4;

        System.out.println("this is the apple price : " + apple);
        System.out.println("this is the tomato price :" + tomato);
        System.out.println("this is the pear price : " + pear);
        System.out.println("this is the banana price:" + banana);
        System.out.println("this is the eggplant price :" + eggplant);
        total = apple + tomato + pear + banana + eggplant;
        System.out.println("this is what you need to pay :" + total);


    }
}
