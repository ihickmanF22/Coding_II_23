import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1-3: ");
        int input = sc.nextInt();
        Random rnd = new Random();
        int result = rnd.nextInt(3) + 1;
        System.out.println("You picked " + input);
        System.out.println("The winning number is " + result);

        sc.close();

    }
}