import java.util.Scanner;

public class ValidatePin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin;
        pin = 1102;
        int userPin;
        userPin = sc.nextInt();
        System.out.println("Enter the pin: ");

        do {
            System.out.print("Re-enter the pin: ");
            userPin = sc.nextInt();
        } while (userPin != pin);
        System.out.println("You got it!");
        sc.close();
    }
}