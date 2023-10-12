import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> numbers;
        numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println(num);
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}

//unboxing = wrapper to primitive