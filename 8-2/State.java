public class State {
    private final int stateid;
    private final int population;

    public State(int sid, int pop) {
        stateid = sid;
        population = pop;
    }
    public int getStateid() {
        return stateid;
    }
    public int getPopulation() {
        return population;
    }
}