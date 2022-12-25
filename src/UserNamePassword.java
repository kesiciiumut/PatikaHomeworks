import java.util.Scanner;

public class UserNamePassword {
    public static void main(String[] args) {
        String username , password;
        Scanner inp = new Scanner(System.in);


        System.out.print("please write your user name :");
        username = inp.nextLine();
        System.out.println("please write your password :");
        password = inp.nextLine();

        if (username.equals("kesiciiumut") && password.equals("12345678")){
            System.out.println("your username and password is correct ! :)");
        }else {
            System.out.println("your username or password is wrong , try again :(");
        }


    }




}
