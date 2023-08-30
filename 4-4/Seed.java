import java.util.Random;

public class Seed {
    public static void main(String[] args) {

        Random rand = new Random(20L);
        System.out.println("Random Number 1: " + rand.nextInt(100));
        System.out.println("Random Number 2: " + rand.nextInt(100));
        System.out.println("Random Number 3: " + rand.nextInt(100));
        System.out.println("Changing seed to change to sequence");
        rand.setSeed(5L);
        System.out.println("Random Number 4: " + rand.nextInt(100));
        System.out.println("Random Number 5: " + rand.nextInt(100));
        System.out.println("Random Number 6: " + rand.nextInt(100));
        System.out.println("Setting seed 20 produce previous sequence");
        rand.setSeed(20L);
        System.out.println("Random Number 7: " + rand.nextInt(100));
        System.out.println("Random Number 8: " + rand.nextInt(100));
        System.out.println("Random Number 9: " + rand.nextInt(100));

    }//end method main
}//end class Seed