public class Countdown {
    public static void main(String[] args) {

        System.out.println("Countdown to Launch: ");

        int i;

        for(i = 0; i >= 20; i = i+2) {
            System.out.print(i +" ");
        }

        System.out.println("Blast Off!");
    }
}