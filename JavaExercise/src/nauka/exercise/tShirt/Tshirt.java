package nauka.exercise.tShirt;

public class Tshirt {

    private tShirtSize size;
    private String producent;

    public Tshirt(tShirtSize size, String producent){
        this.size = size;
        this.producent = producent;
    }



    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(tShirtSize.L, "Nike");
        System.out.println(tshirt.size);

        switch (tshirt.size) {
            case S:
                System.out.println("Kupiles koszulkę w rozmiarze Small!");
                break;
            case M:
                System.out.println("Kupiles koszulkę w rozmiarze Medium!");
                break;
            case L:
                System.out.println("Kupiles koszulkę w rozmiarze Large!");
                break;
            case XL:
                System.out.println("Kupiles koszulkę w rozmiarze XtraLarge!");
                break;
        }


    }
}
