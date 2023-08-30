import java.util.Scanner;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userNum = numberScanner.nextInt();
        Random rnd = new Random();
        int winningNum = rnd.nextInt(10) + 1;
        System.out.println("Your Number: " + userNum);
        System.out.println("The winning number is: " + winningNum);

        numberScanner.close();

    }//end method main
}//end class RandomNumRange