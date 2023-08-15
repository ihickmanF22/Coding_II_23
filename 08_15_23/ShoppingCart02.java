public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Duke";
        String itemDesc = "Shirts";
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 5;
        double tax = 0.05;
        int quantity = 2;

        // Declare and assign a calculated totalPrice
        double totalPrice;
        totalPrice = (quantity * (price + tax));

        // Modify message to include quantity 
        String message = custName+" wants to purchase 2 "+itemDesc+". Total cost with tax is $"+totalPrice;
        System.out.println(message);
        
        // Print another message with the total cost
        
    }    
}