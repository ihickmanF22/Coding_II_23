public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    public double price;
    
    public void findTotal(int i){
        double total = price * (1 + tax + tip);
        System.out.println("$" + total);

    }
}