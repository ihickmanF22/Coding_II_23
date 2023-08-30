import java.util.Random;
public class RandomDouble {
    public static void main(String[] args) {
        Random num = new Random();
        double randomDouble = num.nextDouble();
        System.out.println("Random Number: " + randomDouble);
    }//end method main
}//end class RandomDouble