public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        int totalEggs = 0;
        int chickenCount = 8;
        int eggsPerChicken = 4;
        //Monday
        totalEggs = chickenCount * eggsPerChicken;
        //Tuesday
        totalEggs += ++chickenCount * eggsPerChicken;
        //Wednesday
        totalEggs += chickenCount / 2 * eggsPerChicken;
        /*
         * chickenCount = chickenCount + 1;
         * chickenCount = chickenCount / 2;
         *
         * eggsPerChicken = eggsPerChicken + 1;
         * eggsPerChicken = eggsPerChicken / 2;
        */
        System.out.println(totalEggs);
    }   
}