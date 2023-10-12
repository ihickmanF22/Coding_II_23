//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class Prisoner {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private static int prisonerCount = 0;
    private int bookingNumber;
    private Cell cell;

    //Constructor
    public Prisoner(String name, double height, int sentence, int prisonerCount, int bookingNumber, Cell cell) {
    Prisoner.prisonerCount = prisonerCount;
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.cell = cell;
    this.bookingNumber = bookingNumber;
    prisonerCount++;
    }

    public Prisoner(String string, double d, int i) {
    }

    //Methods
    public void think() {
        System.out.println("I'll have my revenge.");
    }
    public void display() {
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight() +"m");
        System.out.println("Sentence: " +getSentence() +" yrs");
        System.out.println("Cell: " +getCell().getName());
        System.out.println("Prisoner Count: " +getPrisonerCount());
        System.out.println("Booking Number: " +getBookingNumber());
    }

    //Getters
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getSentence() {
        return sentence;
    }
    public static int getPrisonerCount() {
        return prisonerCount;
    }
    public int getBookingNumber() {
        return bookingNumber;
    }
    public Cell getCell() {
        return cell;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public void setPrisonerCount(int prisonerCount) {
    }

    public void setBookingNumber(int bookingNumber) {
    }

    public static void display(boolean b) {
    }

    public void openDoor() {
    }

    public void prisonerDesc() {
    }

    public void prisonerDesc(boolean b) {
    }
}