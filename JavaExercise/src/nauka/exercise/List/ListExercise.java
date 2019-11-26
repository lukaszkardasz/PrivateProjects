package nauka.exercise.List;

import java.util.LinkedList;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {

        List<String> listaImion = new LinkedList<String>();
        listaImion.add("Franek");
        listaImion.add("Staszek");
        listaImion.add("Ziutek");
        listaImion.add("Benek");

        List<String> innaListaImion = new LinkedList<String>();
        innaListaImion.add("Beatka");
        innaListaImion.add("Marlenka");
        ((LinkedList<String>) innaListaImion).addFirst("Kurczak");
        ((LinkedList<String>) innaListaImion).addLast("Ostatni");
        System.out.println(innaListaImion.toString());
    }
}
