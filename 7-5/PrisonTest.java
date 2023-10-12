//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest {
    public static void main(String[] args) {

        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, 0, 0, new Cell("A1", false, 1223));
        Prisoner.display(true);
        bubba.openDoor();
    }

/*
public class Cell {
    private String name;
    private boolean doorIsOpen;
    private int code;

    private Cell (String name, boolean doorIsOpen, int code) {
        this.name = name;
        this.doorIsOpen = doorIsOpen;
        this.code = code;
    }


    Getters
    public String name() {
        return name();
    }
    public boolean doorIsOpen() {
        return doorIsOpen();
    }

    Setters
    public void setDoorIsOpen(int code, boolean doorIsOpen) {
        //this.doorIsOpen = doorIsOpen;
        if (code == 1223 && doorIsOpen == false) {
            doorIsOpen = true;
        } else if (code == 1223 && doorIsOpen == true) {
            doorIsOpen = false;
        } else {
            System.out.println("The code is incorrect");
        }
        if (doorIsOpen == true) {
            System.out.println("The door is open");
        } else {
            System.out.println("The door is closed");
        }
    }
*/
}