import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctEmail = "admin@gmail.com";
        String correctPassword = "12345";

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (email.equals(correctEmail) && password.equals(correctPassword)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Email or Password!");
        }

        sc.close();
    }
}