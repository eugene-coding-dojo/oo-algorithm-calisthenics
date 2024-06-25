package algorithms.workout.foodlines;

public class Foodline implements Comparable<Foodline> {
    private final People people;

    public Foodline(int length) {
        this.people = new People(length);
    }

    @Override
    public int compareTo(Foodline o) {
        return Integer.compare(this.people.size(), o.people.size());
    }

    public void queue(Person person) {
        this.people.add(person);
    }

    public int indexOf(Person person) {
        return this.people.indexOf(person);
    }
}
