public class CountChar {
    public static void main(String[] args) {

        String str = "www.oracle.com";

        int max = str.length();
        int count = 0;
        int i;

        for (i = 0; i < max; i++) {
            if (str.charAt(i) != 'w')
                continue;
            count++;
        }

        System.out.println("Counting w: " + count );
    }
}