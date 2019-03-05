package nauka.Podstawy.AnonymousClass;

public class AnonymousClass {

    public static void main(String[] args) {

        ActionAfterClick b = new ActionAfterClick() {
            @Override
            public void action() {
                System.out.println("jestem z klasy anonimowej");
            }
        };
        b.action();

        Button button = new Button();
        button.addAction(b);


    }
}

interface ActionAfterClick {
    void action();
}

class Button {
    void addAction(ActionAfterClick z) {
        z.action();
    }
}


