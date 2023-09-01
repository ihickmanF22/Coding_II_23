import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        boolean drivingUnderAge;
        drivingUnderAge = false;
        drivingUnderAge = (age <= 18);
        drivingUnderAge = true;
        System.out.println("You are driving underage: "+ drivingUnderAge);
        sc.close();

    }
}