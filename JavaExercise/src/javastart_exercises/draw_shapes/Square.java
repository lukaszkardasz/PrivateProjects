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
        for (int i = 0; i < getSize(); i++) {
            for (int j = 0; j < getSize(); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
