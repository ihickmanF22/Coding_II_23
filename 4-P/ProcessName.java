import java.util.Scanner;

public class ProcessName {
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
 
        // your code goes here
        String name = console.nextLine();
        String initial;
        String lastName;
        int index;
        initial = name.substring(0, 1);
        index = name.indexOf(" ");
        lastName = name.substring(index);

        System.out.println("Your name is: " + lastName + ", " + initial + ".");
        console.close();

    }
}