package codility_lessons;

import java.util.HashMap;
import java.util.Map;

/**
 * @author n2god on 04/09/2019
 * @project PrivateProjects
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A = new int[]{1,1,7,7,3,3,9,9,5};
        int solution = solution(A);
        System.out.println(solution);
    }

    private static int solution(int[] A){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i]) && map.get(A[i]) == 1){
                map.remove(A[i]);
            } else {
                map.put(A[i], 1);
            }
        }
        for (int key : map.keySet()) {
            return key;
        }
        return 0;
    }
}
