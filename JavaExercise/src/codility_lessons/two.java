package codility_lessons;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author n2god on 05/09/2019
 * @project PrivateProjects
 */
public class two {
    public static void main(String[] args) {
        int number = 5;
        int[] result = solution(number);
        System.out.println(Arrays.toString(result));
    }


    public static int[] solution(int N) {
        Set<Integer> set = new HashSet<>();
        int a = N % 2;
        int b = N / 2;
        for (int i = 0; i < b; i++) {
            if (!set.contains(b - i)) {
                set.add(-(b - i));
            }
        }
        if (a != 0) {
            set.add(0);
        }
        for (int j = 0; j < b; j++) {
            if (!set.contains(b - j)) {
                set.add((b - j));
            }
        }
        int[] entries = set.stream().mapToInt(Integer::intValue).toArray();
        return entries;
    }

}
