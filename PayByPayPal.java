public class PayByPayPal implements Payment {
    @Override
	public void pay(double amount) {
		amount += amount * 4.5 / 100;// PayPal charge
		System.out.println("Payable amount using Debit Card: Rs. " + amount);
	}
}
