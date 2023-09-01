public class TestClass {

    public static void main(String args[]) {
        //Temperature
        double comp = (5/9);
        double degreesF = 70;
        double FToC = ((comp)*(degreesF-32));

        //Hypotenuse
        int a = 5;
        int b = 12;
        double hypotenuse = (Math.sqrt((a*a) + (b*b)));

        //Dice Roll
        int c;
        c = (int)(Math.random() * 6);
        int d;
        d = (int)(Math.random() * 6);
        int roll = (c + d);

        System.out.println(FToC + "ºC");
        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.println("Sum: " + roll);

    }
}