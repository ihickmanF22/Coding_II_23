import java.util.Scanner;

public class TrafficLightSwitch {
    public static void main(String args[]) {

        System.out.print("Enter a color code \n");

        Scanner sc = new Scanner(System.in);

        int currentColor = sc.nextInt();

        System.out.println(currentColor);

        sc.close();

    }

}