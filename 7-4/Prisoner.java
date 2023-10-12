public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    public boolean i;

    //Constructor
    public Prisoner(String name, double height, int sentence) {
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }

    public Prisoner() {
    name = null;
    height = 0.0;
    sentence = 0;
    }

    //Methods
    public void think() {
        System.out.println("I'll have my revenge.");
    }

    public void prisonerDesc() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Length of Sentence: " + sentence);
    }

    public void prisonerDesc(boolean i) {
        this.i = i;
        prisonerDesc();
        if (i) {
            think();
        }
    }
}