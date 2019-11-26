package javastart_exercises.restaurant_exercise;

/**
 * @author n2god on 23/09/2019
 * @project PrivateProjects
 */
public class Dish {
    private int id;
    private String dishName;
    private double price;

    public Dish(int id, String name, double price) {
        this.id = id;
        this.dishName = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getDishName() {
        return dishName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  id + ", " +
                "name='" + dishName + '\'' +
                ", price=" + price + "zł";
    }
}
