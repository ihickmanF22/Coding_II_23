public class StringProject {

    private String myString;

    public StringProject (String str) {
        myString = str;
    }

    public String String() {
        return myString;
    }

    public int characterCount;
    public int wordCount;
    public int vowelCount;
    public int substrCount;

    public double avgWordLength;

    public boolean isPalindrome;

    public String l;

    //added methods
    public String reverseCase() {
        myString.toUpperCase();
        String str = myString;
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                newString += Character.toLowerCase(str.charAt(i));
            }
        }
        return newString;
    }

    public java.lang.String characterCount(String character) {
        char a = 'a';
        int characterCount = 0;
        String str = myString;
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                characterCount++;
            }
        }
        newString += characterCount;
        return newString;
    }

    public String reverseString() {
        int beginIndex = 0;
        int endIndex = myString.length();
        myString.substring(beginIndex, endIndex);
        //String str = myString;
        String newString = "";
        newString += myString;
        return newString;
    }

    public String eachWordOnALine() {
        char ch = ' ';
        int beginIndex = 0;
        int in1dex = myString.indexOf(ch);
        int in2dex = myString.indexOf(ch, in1dex);
        int in3dex = myString.indexOf(ch, in2dex);
        int in4dex = myString.indexOf(ch, in3dex);
        //String str = myString;
        String newString = "";
        newString += myString.substring(beginIndex, in1dex) + "\n" + 
        myString.substring(in1dex, in2dex) + "\n" + 
        myString.substring(in2dex, in3dex) + "\n" + 
        myString.substring(in3dex, in4dex);
        return newString + "\n";
    }

    public int wordCount() {
        char ch = ' ';
        int beginIndex = 0;
        int wordCount = 0;
        String str = myString;
        for (int i = beginIndex; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                wordCount++;
            }
        }
        return wordCount + 1;
    }

    public int characterCount() {
        return myString.replaceAll(" ", "").length();
    }

    public double avgWordLength() {
        return characterCount() / (double) wordCount();
    }

    public int vowelCount() {
        return vowelCount;
    }

    public int substrCount(String str) {
        int substrCount = 0;
        int currentIdx = 0;
        while (currentIdx != 1) {
            currentIdx = myString.indexOf(str, currentIdx + 1);
            if (currentIdx != -1) {
                substrCount++;
            }
        }
        return substrCount;
    }

    public boolean isPalindrome() {
        String str;
        str = myString;
        for(int i = 0; i < myString.length(); i++) {
            if (Character.isLetter(myString.charAt(i))) {
                str += Character.toLowerCase(myString.charAt(i));
            }
        }
        for(int i = 0; i < ((myString.length()) / 2);) {
            if (Character.isLetter(myString.charAt(i) - 1)) {
                str += Character.toLowerCase(myString.charAt(i));
            }
            return false;
        }
        return true;
    }
}