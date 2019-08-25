package javastart_exercises.fizz_buzz.stream_way;

import java.util.stream.Stream;

public class FizzBuzzStream {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n+1).limit(100).forEach(FizzBuzzStream::fizzBuzz);
    }

    public static void fizzBuzz(int i){
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + " FizzBuzz");
        }
        else if (i % 3 == 0 && i % 5 != 0) {
            System.out.println(i + " Fizz");
        }
        else if (i % 5 == 0 && i % 3 != 3) {
            System.out.println(i + " Buzz");
        }
    }
}
