package nauka.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Strumienie {

    public static void main(String[] args) {
        List<Mieszkanie> mList = Arrays.asList(
                new Mieszkanie("Białystok", "dziesieciny", "Palmowa",
                        4, 67.5f, true, 300_000),
                new Mieszkanie("Białystok", "pieczurki", "Rolna",
                        3, 47.5f, true, 320_000)
        );

        mList.stream()
                .filter(mieszkanie -> mieszkanie.getMiasto().equals("Białystok"))
                .filter(mieszkanie -> mieszkanie.getCena() < 400_000)
                .filter(mieszkanie -> mieszkanie.getPokoje() > 3)
                .map(mieszkanie -> mieszkanie.getMiasto())
                .forEach(System.out::println);
        //tworzymy warunek
        Predicate<Mieszkanie> mNazwa = m -> m.getDzielnica().equals("pieczurki");
        Predicate<Mieszkanie> mPiwnica = m -> m.isPiwnica() == true;

        List<Mieszkanie> lista = new ArrayList<>();

        //filtrujemy po warunku stworzonym w predicate
        lista = mList.stream()
                .filter(mNazwa)
                .filter(mPiwnica)
                .collect(Collectors.toList());
        System.out.println(lista);


    }
}
