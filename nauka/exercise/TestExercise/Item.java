package nauka.exercise.TestExercise;

public class Item implements Comparable<Item> {

    private final double price;
    private final String name;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Item(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        Item item = (Item) obj;

        if (obj == null || !(obj instanceof Item)) {
            return false;
        }
            return name.equals(item.name);
    }

    @Override
    public int compareTo(Item other) {
        if (other == null) {
            return 1;
        }
        int comparision = this.getName().compareTo(other.getName());
        if (comparision != 0) {
            return comparision;
        }
        return Double.compare(this.getPrice(), other.getPrice());
    }
}
