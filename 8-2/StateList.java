import java.util.ArrayList;
public class StateList {
    private final ArrayList<State> list;

    public StateList()
    {
        list = new ArrayList<>();
    }
    public void addState(State a) {
        list.add(a);
    }
    public String findMax() {
            if (list.isEmpty())
                return null;
            State largest = list.get(0);
            for(int i = 1; i < list.size(); i++)
            {
                State a = list.get(i);
                if(a.getPopulation() > largest.getPopulation())
                    largest = a;
        }
        return "The state with the largest population is State id: " +
                largest.getStateid() + "\nThe population is " +
                    largest.getPopulation();
    }
}