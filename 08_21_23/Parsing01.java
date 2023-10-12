public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        System.out.println(shirtPrice);
        String taxRate = "0.05";
        System.out.println(taxRate);
        String gibberish = "987ds6nns65dsfs";
        System.out.println(gibberish);

        //Parse shirtPrice and taxRate, and print the total tax
        System.out.println((Integer.parseInt("15")) * (Double.parseDouble("0.05")));

        //Try to parse taxRate as an int
        System.out.println(Integer.parseInt("0.05"));

        //Try to parse gibberish as an int
        System.out.println(Integer.parseInt("987ds6nns65dsfs"));

    }
}