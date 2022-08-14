public class Person implements Comparable<Person> {
    int diff;
    int city0;
    int city1;

    public Person(int diff, int city0, int city1) {
        this.diff = diff;
        this.city0 = city0;
        this.city1 = city1;
    }


    @Override
    public int compareTo(Person o) {
        return -Math.abs(o.diff - this.diff);
    }
}
