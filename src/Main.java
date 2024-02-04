public class Main {
    public static void main(String[] args) {
        CreditPaymentService cpService = new CreditPaymentService();
        double yearPercent = 9.9;
        int credit = 1_000_000;
        System.out.println("Сумма кредита: " + credit + " руб.");
        System.out.println("Процент: " + yearPercent + " %");
        int termYear = 1; // 1 год
        System.out.println("Ежемесячный платеж: " + cpService.calculate(credit, yearPercent, termYear)+ " руб.");
        termYear = 2; // 2 года
        System.out.println("Ежемесячный платеж: " + cpService.calculate(credit, yearPercent, termYear)+ " руб.");
        termYear = 3; // 3 года
        System.out.println("Ежемесячный платеж: " + cpService.calculate(credit, yearPercent, termYear)+ " руб.");
    }
}