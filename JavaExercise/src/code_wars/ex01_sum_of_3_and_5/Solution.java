package code_wars.ex01_sum_of_3_and_5;

import java.util.stream.IntStream;

/**
 * @author n2god on 26/11/2019
 * @project PrivateProjects
 */
class Solution {
    public int solution(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}
