import java.util.Scanner;
public class PracticeCode {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int N = 10;
        System.out.println("This program will find the maximum of " + N + " numbers.");
        System.out.println("Enter the first number:");
        int maximum = in.nextInt();
        for(int i = 0; i < N-1; i++){
            System.out.println("Enter the next number: ");
            int value = in.nextInt();
            if(value > maximum)
                maximum = value;
        }//end for
        System.out.println("The maximum value is " + maximum + ".");
        in.close();
    }//end method main
}