package javastart_exercises.smart_sort;

import java.util.Comparator;

/**
 * @author n2god on 23/09/2019
 * @project PrivateProjects
 */
public enum MovieComparator {
    TITLE("Title", Comparator.comparing(Movie::getTitle)),

    /*
     or before java 8:
    TITLE("Title", new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2) {
            return m1.getTitle().compareTo(m2.getTitle());
        }
    }),
    */

    RATING("Rating", Comparator.comparing(Movie::getRating).reversed()),
    YEAR("Year", Comparator.comparing(Movie::getYear).reversed());

    private final String criteria;
    private final Comparator<Movie> comparator;

    MovieComparator(String criteria, Comparator<Movie> comparator) {
        this.criteria = criteria;
        this.comparator = comparator;
    }

    public String getCriteria() {
        return criteria;
    }

    public Comparator<Movie> getComparator() {
        return comparator;
    }

    public static MovieComparator convert(String criteria){
        MovieComparator[] values = MovieComparator.values();
        for (MovieComparator value : values) {
            if (value.getCriteria().toLowerCase().equals(criteria.toLowerCase()));
            return value;
        }
        throw new IllegalArgumentException("Nieprawidłowe kryterium sortowania " + criteria);
    }
}
