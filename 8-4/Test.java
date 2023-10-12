public class Test {
    public static void main(String[] args) {
        int n = 10;
        int sum = 10;
        while (n > 1) {
            System.out.println(n);
            System.out.println(sum);
            //sum = sum + n;
            n--;
        }//end while
        System.out.println("The sum of the integers 1 to 10 is " + sum);
    }
}