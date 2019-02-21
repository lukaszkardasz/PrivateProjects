package nauka.training.core;

import java.util.Objects;

class ObjectSuperclass {

    public static void main(String[] args) {


    }

}
class Punkt{
    private int x;
    private int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public  Punkt() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punkt punkt = (Punkt) o;
        return x == punkt.x &&
                y == punkt.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
