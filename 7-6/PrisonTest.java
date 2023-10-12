//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class PrisonTest {
    public static void main(String[] args) {
        Cell cellA1 = new Cell("A1", false, 1234);
        //Cell cellB1 = new Cell("B1", false, 1234);
        //Cell cellC1 = new Cell("C1", false, 1234);
        //Cell cellD1 = new Cell("D1", false, 1234);

        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, 0, 0, cellA1);

        System.out.println(Prisoner.getPrisonerCount());
        System.out.println(bubba);

        Prisoner.display(true);

        //getPrisonerCount();
    }
}