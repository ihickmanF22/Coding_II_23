public class PrisonTest {
    public static void main(String[] args) {
        Prisoner bubba = new Prisoner();
        bubba.name = new String("Bubba");
        bubba.height = 2.08;
        bubba.sentence = 4;

        Prisoner twitch = new Prisoner();

        /*
        twitch.name = "Twitch";
        twitch.height = 1.73;
        twitch.sentence = 3;
        */

        twitch.name = new String("Bubba");
        twitch.height = 2.08;
        twitch.sentence = 4;

        System.out.println(bubba == twitch);

        bubba.name = "Bubba";
        twitch.name = "Bubba";

        System.out.println(bubba.name == twitch.name);
    }
}