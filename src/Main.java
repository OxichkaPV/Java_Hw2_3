public class Main {
    public static void main(String[] args) {
        CreditPaymentService cpService = new CreditPaymentService();
        int srokYear;
        double procentYear = 9.9;
        int summaKredita = 1_000_000;
        System.out.println("Сумма кредита: " + summaKredita + " руб.");
        System.out.println("Процент: " + procentYear + " %");
        srokYear = 1; // 1 год
        System.out.println("Ежемесячный платеж: " + cpService.calculate(summaKredita, procentYear, srokYear)+ " руб.");
        srokYear = 2; // 2 года
        System.out.println("Ежемесячный платеж: " + cpService.calculate(summaKredita, procentYear, srokYear)+ " руб.");
        srokYear = 3; // 3 года
        System.out.println("Ежемесячный платеж: " + cpService.calculate(summaKredita, procentYear, srokYear)+ " руб.");
    }
}