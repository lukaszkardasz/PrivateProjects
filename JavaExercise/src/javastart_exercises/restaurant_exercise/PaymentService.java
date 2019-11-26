package javastart_exercises.restaurant_exercise;

import java.util.List;

/**
 * @author n2god on 23/09/2019
 * @project PrivateProjects
 */
    class PaymentService {
    private static final double TIP_BORDER = 100;
    private static final double LOW_TIP = 0.1;
    private static final double HIGH_TIP = 0.15;

    public static double calculateServiceCost(double price){
        return (price > TIP_BORDER) ? price * LOW_TIP : price * HIGH_TIP;
    }

    public static double calculateDishesSummary(List<Dish> dishes){
        return dishes.stream()
                .mapToDouble(Dish::getPrice)
                .sum();
    }
}
