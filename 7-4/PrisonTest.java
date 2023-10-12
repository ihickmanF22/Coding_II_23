public class PrisonTest {
    public static void main(String[] args){
        Prisoner p01 = new Prisoner("Bubba", 2.08, 4, 0, 0, null);
        Prisoner p02 = new Prisoner();
        p02.prisonerDesc();
        p01.prisonerDesc(true);
    }
}