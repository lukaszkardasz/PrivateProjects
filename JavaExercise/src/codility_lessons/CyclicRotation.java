package codility_lessons;

import java.util.Arrays;

/**
 * @author n2god on 04/09/2019
 * @project PrivateProjects
 */
public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = new int[]{3, 8, 9, 7, 6};
        int k = 3;
        int[] solution = solution(A, k);
        System.out.println(Arrays.toString(solution));
    }

    private static int[] solution(int[] A, int k) {
        int length = A.length;
        int[] rotated = new int[length];
        for (int i = 0; i < length; i++) {
            rotated[(i + k) % length] = A[i];
        }
        return rotated;
    }
}
