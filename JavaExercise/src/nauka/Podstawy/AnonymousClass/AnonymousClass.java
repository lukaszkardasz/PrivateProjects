package nauka.Podstawy.AnonymousClass;

public class AnonymousClass {

    public static void main(String[] args) {

        ActionAfterClick b = () -> System.out.println("jestem z klasy anonimowej");

        ActionAfterClick2 b2 = (a, c) -> System.out.println(a + c);

        b2.action2(2,22);

        b.action();

        Button button = new Button();
        button.addAction(b);


    }
}

interface ActionAfterClick {
    void action();
}

interface ActionAfterClick2{
    void action2(int a, int b);
}

class Button {
    void addAction(ActionAfterClick z) {
        z.action();
    }
    void addAction2 (int a, int b, ActionAfterClick2 z){
        z.action2(a,b);
    }
}


