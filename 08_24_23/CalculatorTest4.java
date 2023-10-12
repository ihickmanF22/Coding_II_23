public class CalculatorTest4 {
    public static void main(String[] args) {

        Calculator4 calc = new Calculator4();

        double total = 0;
        //Name your friends
        //String P1 = "Jason";
        total += calc.findTotal(10, "Jason");
        //String P2 = "Mike";
        total += calc.findTotal(12, "Mike");
        //String P3 = "Joe";
        total += calc.findTotal(9,  "Joe");
        //String P4 = "Jacob";
        total += calc.findTotal(8,  "Jacob");
        //String P5 = "Ryan";
        total += calc.findTotal(7,  "Ryan");
        total += calc.findTotal(15, "Alex");
        //String P8 = "Isaac";
        total += calc.findTotal(11, "Isaac");
        total += calc.findTotal(30, "Forgetful");


        //Find and print the entire table's total, including tax and tip
       System.out.println(total);
    }
}