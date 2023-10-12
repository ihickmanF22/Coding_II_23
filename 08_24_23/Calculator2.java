    public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;

    public void findTotal(){
        //Calculate an individual's total after tax and tip
        //Print this value
        //double totalPrice = (originalPrice + (originalPrice * tax) + (originalPrice * tip));
        //System.out.println(totalPrice);
        System.out.println(originalPrice * (1 + tax) + (1 * tip));
    }
}