package codility_lessons;

import java.util.*;

/**
 * @author n2god on 05/09/2019
 * @project PrivateProjects
 */
public class three {

    public static void main(String[] args) {
        int numbers = 1213;
        int[] array = convertIntToArray(numbers);
        System.out.println(Arrays.toString(array));
        System.out.println(solution(numbers));
    }

    private static int solution(int N) {
        int[] numbers = convertIntToArray(N);
        String maxNumber = maxNumber(numbers);
        int result = Integer.parseInt(maxNumber);
        return result;
    }

    private static int[] convertIntToArray(int number) {
        //convert int to array of ints
        String s = Integer.toString(number);
        int[] array = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i) - '0';
        }
        return array;
    }

    public static String maxNumber(int[] numbers) {
        List<String> list = new ArrayList<>(numbers.length);
        for (int number : numbers) {
            list.add(String.valueOf(number));
        }
        Collections.sort(list, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        return String.join("", list);
    }
}
