package javastart_exercises.draw_shapes;

public class Square implements Drawable {
    int size;

    public Square(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void draw() {

    }
}
