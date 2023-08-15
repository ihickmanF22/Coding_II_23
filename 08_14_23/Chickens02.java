public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
        double dailyAverage = 0;
        double monthlyAverage = 0;
        double monthlyProfit = 0;
        final double Monday = 100;
        final double Tuesday = 121;
        final double Wednesday = 117;
        dailyAverage = (Monday + Tuesday + Wednesday) / 3;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = monthlyAverage * 0.18;
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
}