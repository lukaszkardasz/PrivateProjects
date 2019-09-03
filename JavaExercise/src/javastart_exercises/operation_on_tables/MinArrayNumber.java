package javastart_exercises.operation_on_tables;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinArrayNumber {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 6, 4, 1, 2};
        int solution = solution(array);
        System.out.println(solution);

    }

    public static int solution(int[] A) {
        int minNumber = 1;
        Arrays.sort(A);
        int length = A.length-1;
        int max = A[length];
        System.out.println("Lenght =" + length);
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            if (i > 0) {
                set.add(i);
            }
        }
        for (int j = 1; j <= max + 1; j++) {
            if (!set.contains(j)) {
                minNumber = j;
                break;
            }
        }
        return minNumber;
    }

}
