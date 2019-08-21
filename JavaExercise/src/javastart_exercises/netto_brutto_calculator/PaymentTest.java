package javastart_exercises.netto_brutto_calculator;

public class PaymentTest {
    public static void main(String[] args) {
        Employee janek = new Employee("Jan", "Fiutek", 3000);
        double nettoYearPayment = PaymentCalculator.nettoYearPayment(janek);
        double bruttoYearPayment = PaymentCalculator.bruttoYearPayment(janek);

        System.out.println("Kwota netto jak¹ zarabia " +
                janek.getFirstName() + " " +
                janek.getLastName() + " to: " +
                nettoYearPayment);
        System.out.println("Kwota brutto jak¹ zarabia " +
                janek.getFirstName() + " " +
                janek.getLastName() + " to: " +
                bruttoYearPayment);

    }
}
