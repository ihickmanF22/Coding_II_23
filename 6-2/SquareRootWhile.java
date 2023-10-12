import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
    Scanner console = new Scanner(System.in);
	int number = console.nextInt();
    while (number < 0) {
        System.out.println("Invalid number, try again: ");
        number = console.nextInt();
    }
    double sqrt = Math.sqrt(number);
    System.out.println("The square root of " + number + " is " + sqrt);
    console.close();
    }
}