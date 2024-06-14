package algorithms.workout.foodlines;

public class Foodline implements Comparable<Foodline> {
    private int length;

    private People people;

    public Foodline(int length) {
        this.length = length;
        this.people = new People(length);
    }

    @Override
    public int compareTo(Foodline o) {
        return Integer.compare(this.length, o.length);
    }

    public void queue(Person person) {
        this.people.add(person);
        this.length++;
    }

    public int indexOf(Person person) {
        return this.people.indexOf(person);
    }
}
