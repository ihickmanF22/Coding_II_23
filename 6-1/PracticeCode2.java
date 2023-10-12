import java.util.Scanner;
public class PracticeCode2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int N = 5;
        System.out.println("This program checks 5 sets of numbers to see" +
                    " if one number is evenly divisible by another.");
        for(int i = 0; i < N-1; i++){
            System.out.println("Enter a number: ");
            int num1 = in.nextInt();
            System.out.println("Enter the divisor: ");
            int num2 = in.nextInt();
            if(num1%num2 == 0)
                System.out.println(num1 + "is divisible by " + num2);
            else
                System.out.println(num1 + "is not divisible by " + num2);
        in.close();
        }//end for
    } //end main method
} //end class