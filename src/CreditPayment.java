public class CreditPayment {
    public double calculate(double term, double amount){
        double payment = (amount * 9.99 / 100 + amount) / term / 12;

        return payment;
    }
}
