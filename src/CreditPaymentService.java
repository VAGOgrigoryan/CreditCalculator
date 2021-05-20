public class CreditPaymentService {
    public double calculate(double creditAmount, double percent, int term) {
        /// Ежемесячная процентная ставка, которую обозначим знаком "i"
        double i = percent / 100 / term;
        /// Возведение в степень
        double a = i + 1;
        double b = term;
        double x = Math.pow(a, b);
        /// Расчет ежемесячного платежа
        double payment = creditAmount * (i + i / (x - 1));
        return payment;
    }
}
