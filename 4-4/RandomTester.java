public class RandomTester {
    public static void main(String[] args) {
        // define the range
        int max = 10;
        int min = 1;
        int range = max - min + 1; // generate random numbers
                                   //between 1 and 10
        int rand = (int)(Math.random() * range) + min;
        System.out.println(rand);
        // Output is different everytime this code is executed
    }
}