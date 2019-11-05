package nauka.lambdaExercise.lambda_exercise;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author n2god on 03/11/2019
 * @project PrivateProjects
 */
public class PredicateExercise {
    public static void main(String[] args) {

        class Book{
            double price;
            String coverType;

            Book(double price, String coverType){
                this.price = price;
                this.coverType = coverType;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Book book = (Book) o;
                return Double.compare(book.price, price) == 0 &&
                        Objects.equals(coverType, book.coverType);
            }

            @Override
            public int hashCode() {
                return Objects.hash(price, coverType);
            }
        }

        Book book = new Book(39.99, "twarda");
        Book book4 = new Book(1, "coś");
        Book book5 = book4;

        Predicate<Book> checkPrice = book1 -> book1.price > 29.99;
        Predicate<Book> checkCoverType = book2 -> book2.coverType.equals("twarda");
        Predicate<Book> nextBook = Predicate.isEqual(new Book(39.99, "twarda"));

        Predicate<Book> checkBooks = Predicate.isEqual(book4);

        Predicate<String> i  = Predicate.isEqual("asdf");
        System.out.println(i.test("asdf"));

        System.out.println("Czy ta sama książka 4 i 5? " + checkBooks.test(book5));

        if (checkPrice.test(book)) {
            System.out.println("Drogo!");
        }

        if (checkCoverType.and(checkPrice).test(book)){
            System.out.println("Drogo ale okladka twarda");
        }

        if (checkCoverType.or(checkPrice).test(book)) {
            System.out.println("Tanio lub drogo!");
        }

        if (!checkPrice.negate().test(book)) {
            System.out.println("A jenak tanio!");
        }

        System.out.println("Czy ta sama książka? " + nextBook.test(book));
    }
}
