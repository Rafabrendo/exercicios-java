package services;

public class PaypalService implements OnlinePaymentService{

	@Override
	public double paymenteFee(double amount) {
		return amount * 0.02;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * 0.01 * months;
	}

}
