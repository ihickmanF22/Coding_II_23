public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        double P1 = 10;
        double P2 = 12;
        double P3 = 9;
        double P4 = 8;
        double P5 = 7;
        double P6 = 15;
        double P7 = 11;
        double P8 = 30;
        double Total1 = (P1 + (0.05 * P1) + (0.15 * P1));
        System.out.println("Person 1 Owes $" + Total1);
        double Total2 = (P2 + (0.05 * P2) + (0.15 * P2));
        System.out.println("Person 2 Owes $" + Total2);
        double Total3 = (P3 + (0.05 * P3) + (0.15 * P3));
        System.out.println("Person 3 Owes $" + Total3);
        double Total4 = (P4 + (0.05 * P4) + (0.15 * P4));
        System.out.println("Person 4 Owes $" + Total4);
        double Total5 = (P5 + (0.05 * P5) + (0.15 * P5));
        System.out.println("Person 5 Owes $" + Total5);
        double Total6 = (P6 + (0.05 * P6) + (0.15 * P6));
        System.out.println("Person 6 Owes $" + Total6);
        double Total7 = (P7 + (0.05 * P7) + (0.15 * P7));
        System.out.println("Person 7 Owes $" + Total7);
        double Total8 = (P8 + (0.05 * P8) + (0.15 * P8));
        System.out.println("Person 8 Owes $" + Total8);
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
    }    
}