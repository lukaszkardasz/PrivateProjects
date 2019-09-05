package codility_lessons;

/**
 * @author n2god on 05/09/2019
 * @project PrivateProjects
 */
public class Castles {
    public static void main(String[] args) {
        int[] A = new int[]{-3, -3};
        System.out.println(solution(A));
        ;
    }

    private static int solution(int[] A) {
        int length = A.length;
        if (length == 1)
            return 1;

        if (A == null || length == 0)
            return 0;

        int count = 1;
        int i = 0;
        int j = i + 1;

        while (i < length && j < length) {
            if (A[j] == A[i]) {
                ++i;
                ++j;
            } else if (A[j] > A[i]) {
                ++count;
                int x = j + 1;
                while (x < length && A[x] >= A[x - 1]) {
                    ++x;
                }
                if (x == length)
                    return count;
                i = x - 1;
                j = x;
            } else {
                ++count;
                int y = j + 1;
                while (y < length && A[y] <= A[y - 1]) {
                    ++y;
                }
                if (y == length)
                    return count;
                i = y - 1;
                j = y;
            }
        }
        return count;
    }


}
