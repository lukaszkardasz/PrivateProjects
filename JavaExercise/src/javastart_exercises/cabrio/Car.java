package javastart_exercises.cabrio;

public class Car {
    private String name;
    private String mark;
    private boolean isMoving;
    private boolean isRoofOpened;

    public Car(String name, String mark, boolean isMoving, boolean isRoofOpened) {
        this.name = name;
        this.mark = mark;
        this.isMoving = isMoving;
        this.isRoofOpened = isRoofOpened;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean isRoofOpened() {
        return isRoofOpened;
    }

    public void setRoofOpened(boolean roofOpened) {
        isRoofOpened = roofOpened;
    }

    public void move(){
        if (isRoofOpened) {
            System.out.println();
        }
    }
}
