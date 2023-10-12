import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int product;
        System.out.println("Choose a number: ");
        for (int i = 0; i <= 12; i++) {
            product = (num*i);
            System.out.println(num+"x"+i+" = "+product);
        }

        sc.close();
    }
}