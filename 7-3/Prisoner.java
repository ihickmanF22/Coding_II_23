//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6

public class Prisoner {

    //Fields

    public static String name;
    public double height;
    public int sentence;

    //Constructor

    public Prisoner(String name, double height, int sentence) {
        System.out.println("This is a constructor");
        Prisoner.name = name;
        this.height = height;
        this.sentence = sentence;
    }

    //Methods

    public Prisoner() {
    }

    public void think() {
        System.out.println("I'll have my revenge.");
    }

    /*
    public void setFields(String n, double h, int s) {
        name = n;
        height = h;
        sentence = s;
    }
    */

}