import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        sum = 0;
        int num;
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter 10 numbers");
            System.out.println("Enter 0 to exit");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("The sum is " + sum);
                break;
            }
        }

        sc.close();
    }
}