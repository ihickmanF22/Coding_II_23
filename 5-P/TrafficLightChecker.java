import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String args[]) {

        System.out.print("Enter a color code \n");

        Scanner sc = new Scanner(System.in);

        int currentColor = sc.nextInt();

            if (currentColor >= 1 && currentColor <= 3) {
                if (currentColor == 1) {
                    System.out.println("Next Traffic Light is green");
                }

                if (currentColor == 2) {
                    System.out.println("Next Traffic Light is yellow");
                }

                if (currentColor == 3) {
                    System.out.println("Next Traffic Light is red");
                }

                else {
                    System.out.println("Invalid color");
                }
            }

        sc.close();

        }
    }