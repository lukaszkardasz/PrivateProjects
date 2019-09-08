package javastart_exercises.draw_shapes;

public class Tree implements Drawable {
    int height;

    public Tree(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {

    }
}
