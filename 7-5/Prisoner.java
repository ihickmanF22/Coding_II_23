//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private boolean doorIsOpen;
    private int code;

    //Constructor
    private Prisoner(String name, double height, int sentence, boolean doorIsOpen, int code){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.doorIsOpen = doorIsOpen;
    this.code = code;
    }

    //Getters and Setters
    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double height() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int sentence() {
        return sentence;
    }

    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    public boolean doorIsOpen() {
        return doorIsOpen;
    }

    public void setDoorIsOpen(boolean doorIsOpen) {
        this.doorIsOpen = doorIsOpen;
    }

    public int code() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    //Methods
    public void think() {
        System.out.println("I'll have my revenge.");
    }
    public void openDoor() {
        if (doorIsOpen == false) {
            doorIsOpen = true;
        } else if (doorIsOpen == true) {
            doorIsOpen = false;
        }
    }
    public void display(boolean b) {
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Is the door open: " +doorIsOpen);
        System.out.println("Cell: " +name);
    }
}