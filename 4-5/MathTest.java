public class MathTest {
    public static void main(String[] args) {

        System.out.println(Math.abs(-1.23));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.abs(Math.min(-3, -5)));
        System.out.println(Math.sqrt(121.0) - Math.sqrt(256.0));

        int age = -3;
        System.out.println(Math.min(Math.max(age, 0), 40));

        int number;
        number = (int)(Math.random() * 10);
        System.out.println("The random number is " + number + ".");

    }
}