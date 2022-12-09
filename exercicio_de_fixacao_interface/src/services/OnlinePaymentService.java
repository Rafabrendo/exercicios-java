package services;

public interface OnlinePaymentService {
	
	double paymenteFee(double amount);
	double interest(double amount, int months);
	
	
}
