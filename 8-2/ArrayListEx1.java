import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> students;
        students = new ArrayList();
        //students.add("Nick");
        //students.add("Mike");
        students.add("Amy");
        students.add("Bob");
        students.add("Cindy");
        students.add("David");
        students.add(0, "Nick");
        students.add(1, "Mike");
        students.remove(3);
        System.out.println(students);
        System.out.println(students.size());
    }
}