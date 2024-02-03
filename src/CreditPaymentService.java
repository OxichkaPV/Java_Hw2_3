public class CreditPaymentService {
    public int calculate(int pSumma, double pProcent, int pSrok) {
        double result;
        double mProcent = pProcent / (12 * 100);
        int mSrok = pSrok * 12;
        result = pSumma * (mProcent * (Math.pow(1 + mProcent, mSrok) / (Math.pow(1 + mProcent, mSrok) - 1)));
        System.out.println("Срок кредита: " + pSrok + " год");
        return (int) result;
    }
}
