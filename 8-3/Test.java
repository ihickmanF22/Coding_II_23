import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        int a = 100, res;
        try {
            System.out.println("Enter the value for b");
            Scanner console = new Scanner(System.in);
            int b = console.nextInt();
            System.out.println("Enter the value for c");
            int c = console.nextInt();
            res = 10 / (b - c);
            System.out.println("The result is " + res);
            console.close();
        }
        catch(Exception e) {
            String errMsg = e.getMessage();
            System.out.println(errMsg);
        }//end try catch
        System.out.println("After catch block");
    }//end method main
}