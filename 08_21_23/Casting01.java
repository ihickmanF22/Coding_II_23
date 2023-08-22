public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        //byte b = 128;

        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        short s = (byte)128;
        System.out.println(s);

        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
        byte b2 = 127;
        b2++;
        System.out.println(b2);
        b2++;
        System.out.println(b2);

    }    
}