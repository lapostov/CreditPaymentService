public class CreditPaymentService {
    public static void main(String[] args) {

        CreditPayment service = new CreditPayment();
        double amount = 1_000_000;
        double term = 1;
        double payment = service.calculate(amount, term);
        
        System.out.println("Ежемесячный платеж со сроком кредита на 1 год составляет " + payment);

        System.out.println("Ежемесячный платеж со сроком кредита на 2 года составляет " + payment / 2);

        System.out.println("Ежемесячный платеж со сроком кредита на 3 года составляет " + payment / 3);
    }
}
