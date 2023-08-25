import java.util.Locale;
import java.util.Scanner;

public class JavaLibsPractice {
    public static void main(String[] args){
        Scanner story = new Scanner(JavaLibsPractice.class.getResourceAsStream("javalibspracticetext.txt")).useLocale(Locale.US);

        //Testing to advance the scanner
        story.nextLine();
        story.nextLine();
        System.out.println(story.nextLine());

        //Strings
        String name = story.nextLine();
        String adj1 = story.nextLine();
        String contemplation = story.nextLine();
        String nameinstance1 = story.nextLine();
        String location1 = story.nextLine();
        String adj2 = story.nextLine();
        String adj3 = story.nextLine();
        String nameinstance2 = story.nextLine();
        String food = story.nextLine();
        String escapistinstance1 = story.nextLine();
        String escapistinstance2 = story.nextLine();
        String location2 = story.nextLine();

        //Remaining Inputs
        int time = story.nextInt();
        double price = story.nextDouble();
        double tax = (price * .1);
        story.nextLine();
        String connotation = story.nextLine();

        //Story
        System.out.print("This morning " + name + " woke up feeling absolutely " + adj1 + ". Was it " + contemplation + "? " + nameinstance1 + " decided to go to the " + location1 + ", hoping to feel " + adj2 + ". It was " + adj3 + ". " + nameinstance2 + " needed something to eat. " + food + " seemed like the perfect idea, but there was something wrong. " + escapistinstance1 + " got out of the cage! " + escapistinstance2 + " had ran " + location2 + " and passed out " + time + " minutes after. This was a world where cats ruled the land. A $" + price + " meal with a tax of $" + tax + " was not worth the " + connotation + ".\n" + //
                "");

        story.close();
    }
}