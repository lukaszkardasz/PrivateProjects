package javastart_exercises.draw_shapes;

import java.util.Scanner;

public class ShapeDrawer {
    private static final String SQUARE_NAME = "square";
    private static final String RECTANGLE_NAME = "rectangle";
    private static final String TREE_NAME = "tree";

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Drawable drawable = readAndCreateShape();
        if (drawable != null) {
            drawable.draw();
        }
        sc.close();
    }


    private static Drawable readAndCreateShape() {
        Drawable drawable = null;
        System.out.println("Co chcesz narysowaæ? (square / rectangle / tree)");
        String element = sc.nextLine();

        switch(element){
            case SQUARE_NAME -> drawable = readAndDrawSquare();
            case RECTANGLE_NAME -> drawable = readAndDrawRectangle();
            case TREE_NAME -> drawable = readAndDrawTree();
            default -> throw new IllegalArgumentException("Taki kszta³t nie istnieje!");
        }
        System.out.println("Wybrano " + element + ":");
        return drawable;
    }

    private static Drawable readAndDrawTree() {
        System.out.println("Podaj wysokoœæ choinki");
        int height = sc.nextInt();
        return new Tree(height);
    }

    private static Drawable readAndDrawRectangle() {
        System.out.println("Podaj d³ugoœæ i wysokoœæ prostok¹ta");
        System.out.println("D³ugoœæ: ");
        int width = sc.nextInt();
        System.out.println("Wysokoœæ: ");
        int height = sc.nextInt();
        return new Rectangle(width, height);
    }

    private static Drawable readAndDrawSquare() {
        System.out.print("Podaj bok kwadratu: ");
        int lenght = sc.nextInt();
        return new Square(lenght);
    }
}
