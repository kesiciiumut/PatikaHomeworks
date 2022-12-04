import java.util.Scanner;
public class BodyIndex {
    public static void main(String[] args) {
        double mass,weight,bodyindex;
        Scanner input = new Scanner(System.in);
        System.out.println("please write your body mass : " );
        mass = input.nextDouble();
        System.out.println("please write your body weight(type of meter) : ");
        weight = input.nextDouble();
        bodyindex = mass/(weight*weight);
        System.out.println("this is your result : " + bodyindex);


    }
}
