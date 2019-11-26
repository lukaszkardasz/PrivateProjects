package javastart_exercises.netto_brutto_calculator;

public class PaymentCalculator {
    public static final double MONTHLY_ZUS = 1000;

    public static double nettoYearPayment(Employee employee) {
        return 12 * employee.getMonthSalary();
    }

    public static double bruttoYearPayment(Employee employee) {
        double nettoSalary = employee.getMonthSalary();
        double bruttoSalary = nettoSalary * 0.2;
        return 12 * (MONTHLY_ZUS + nettoSalary + bruttoSalary);

    }

}
