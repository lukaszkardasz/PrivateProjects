package javastart_exercises.restaurant_exercise;

import java.util.List;

/**
 * @author n2god on 23/09/2019
 * @project PrivateProjects
 */
public class Order {
    private List<Dish> orderByUser;

    public Order(List<Dish> orderByUser) {
        this.orderByUser = orderByUser;
    }

    @Override
    public String toString() {
        double dishesCost = PaymentService.calculateDishesSummary(orderByUser);
        double serviceCost = PaymentService.calculateServiceCost(dishesCost);
        double totalCost = dishesCost + serviceCost;
        return String.format("Do zapłaty: %.2f, w tym: \n" +
                "koszt dań: %.2f\n" +
                "Napiwek: %.2f",
                totalCost, dishesCost, serviceCost);
    }
}
