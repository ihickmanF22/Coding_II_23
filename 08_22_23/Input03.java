import java.util.Scanner;

class Input03 {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);

        //Find and print the sum of three integers entered by the user
        int num1 = sc.nextInt();
        System.out.println(num1);
        int num2 = sc.nextInt();
        System.out.println(num2);
        int num3 = sc.nextInt();
        System.out.println(num3);

        //Remember to close the Scanner
        sc.close();

    }
}