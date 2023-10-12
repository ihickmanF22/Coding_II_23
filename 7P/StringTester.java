public class StringTester {
    public static void main(String[] args) {

        StringProject stats = new StringProject ("This land is your land.");
        System.out.println("Current string: " + stats);

        System.out.println("Current String with reversed case: " + stats.reverseCase());

        System.out.println("Times 'a' appears in the string: " + stats.characterCount("a"));

        System.out.println("String Reversed: " + stats.reverseString());

        System.out.println("Each word on a separate line: \n" + stats.eachWordOnALine());

        System.out.println("Number of words in the String: " + stats.wordCount());
        System.out.println("Number of characters in the String: " + stats.characterCount());
        System.out.println("Number of vowels in the String: " + stats.vowelCount());
        System.out.println("Number of times that the substring 's' occurs in the String: " + stats.substrCount("s"));

        System.out.println("Average word length in the String: " + stats.avgWordLength());
    }
}