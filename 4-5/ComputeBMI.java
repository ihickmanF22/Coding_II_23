import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight(lbs): ");
        double weight = sc.nextInt();
        System.out.print("Enter your height(inches): ");
        double height = sc.nextDouble();
        double bmi = (weight/(height*height)*703);
        long finalbmi = Math.round(bmi);
        System.out.println("Your BMI is " + finalbmi);
        sc.close();

    }
}