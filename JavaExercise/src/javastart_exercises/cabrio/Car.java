package javastart_exercises.cabrio;

public class Car {
    private String name;
    private String mark;
    private boolean moving;
    private boolean roofOpened;

    public Car(String name, String mark) {
        this.name = name;
        this.mark = mark;
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
        return moving;
    }

    public void setMoving(boolean moving) {
        if (moving) {
            throw new IllegalStateException("Jedziesz! Nie mo¿na otworzyæ dachu!");
        } else{
            this.moving = moving;
        }
    }

    public boolean isRoofOpened() {
        return roofOpened;
    }

    public void setRoofOpened(boolean roofOpened) {
        this.roofOpened = roofOpened;
    }

    @Override
    public String toString() {
        return "Samochód marki: "+ name + " marki " + mark +
                ", czy jedzie: " + moving +
                ", czy ma otwarty dach: " + roofOpened;
    }
}
