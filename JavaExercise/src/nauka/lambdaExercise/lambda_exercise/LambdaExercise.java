package nauka.lambdaExercise.lambda_exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * @author n2god on 03/11/2019
 * @project PrivateProjects
 */
public class LambdaExercise {

    private static final Map<String, CalculationInterface> calculationMap = new HashMap<>();

    private static void fillMap(){
        calculationMap.put("+", (a,b) -> a + b);
        calculationMap.put("-", (a,b) -> a - b);
        calculationMap.put("*", (a,b) -> a * b);
        calculationMap.put("/", (a,b) -> a / b);
    }

    /**
     * Ta metoda zwraca nam gotowy wynik po wybraniu operatorem odpowiedniej lambdy i wykonaniu metody calculate
     *
     * @param operator
     * @param a
     * @param b
     */

    private static void result(String operator, double a, double b){
        double result = calculationMap.get(operator).calculateMethod(a,b);
        System.out.println(result);
    }

    public static void main(String[] args) {
        fillMap();
        result("+", 2,2);
        result("-", 6,2);
        result("*", 2,5);
        result("/", 10,2);
    }
}
