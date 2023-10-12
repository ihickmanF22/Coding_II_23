import java.util.Scanner;

public class ComputeAvg {
    public static void main(String args[]) {
        double scores[] = new double[5];
        double total = 0.0, avg = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter scores of 5 students");
        for(int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        for(int i = 0; i < scores.length; i++) {
            total = total + scores[i];
            avg = total / scores.length;
        }
        System.out.println("The class stored an average of " + avg);

        sc.close();
    }
}