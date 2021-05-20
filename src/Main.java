public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double payment = service.calculate(1_000_000, 9.99, 12);
        System.out.printf(" ежемесячный платеж: %.0f", payment);

        double payment2 = service.calculate(1_000_000, 19.98, 24);
        System.out.printf(" ежемесячный платеж: %.0f", payment2);

        double payment3 = service.calculate(1_000_000, 29.97, 36);
        System.out.printf(" ежемесячный платеж: %.0f", payment3);
    }
}
