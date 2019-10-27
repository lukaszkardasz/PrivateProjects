package javastart_exercises.lotery_statistics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class LotteryStats {

    private static Map<Integer, Integer> numbersOccurences(List<Result> results){
        Map<Integer, Integer> numbersOccurences = new HashMap<>();
        for (Result result : results) {
            for (int number : result.getNumbers()) {
                numbersOccurences.merge(number, 1, Integer::sum);
            }
        }
        return numbersOccurences;
    }

}
