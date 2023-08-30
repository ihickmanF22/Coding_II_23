import java.util.Random;
public class RandomNumRange {
    public static void main(String[] args) {
        Random num = new Random();
        int randomnum = num.nextInt(20);
        System.out.println("Random Number: " + randomnum);
    }//end method main
}//end class RandomNumRange