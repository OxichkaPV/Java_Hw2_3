public class CreditPaymentService {
    public int calculate(int sum, double percent, int term) {
        double monthPercent = percent / (12 * 100);
        int monthTerm = term * 12;
        double result = sum * (monthPercent * (Math.pow(1 + monthPercent, monthTerm) / (Math.pow(1 + monthPercent, monthTerm) - 1)));
        System.out.println("Срок кредита: " + term + " год");
        return (int) result;
    }
}
