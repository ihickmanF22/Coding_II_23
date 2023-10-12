import java.util.Scanner;

public class NameMaker {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(NameMaker.class.getResourceAsStream("namemaker.txt"));
        String firstName = sc.nextLine();
        String middleName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = (firstName + " " + middleName + " " + lastName);

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
        System.out.println(fullName);

        sc.close();
    }
}