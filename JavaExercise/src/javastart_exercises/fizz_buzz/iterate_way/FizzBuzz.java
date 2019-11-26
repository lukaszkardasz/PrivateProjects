package javastart_exercises.fizz_buzz.iterate_way;

/**
 * @author n2god on 24/08/2019
 * @project PrivateProjects
 */
public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz(i);
            }
            else if (i % 3 == 0 && i % 5 != 0) {
                fizz(i);
            }
            else if (i % 5 == 0 && i % 3 != 3) {
                buzz(i);
            }
        }
    }

    private static void fizzBuzz(int i) {
        System.out.print(i + " FizzBuzz\n");
    }

    private static void buzz (int i) {
            System.out.print(i + " Fizz\n");
        }

        private static void fizz (int i) {
            System.out.print(i + " Buzz\n");
        }

}
