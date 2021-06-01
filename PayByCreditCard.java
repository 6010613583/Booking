public class PayByCreditCard implements Payment {

	@Override
	public void pay(double amount) {
		amount -= amount * 3 / 100;// 3% discount
		System.out.println("Payable amount using Credit Card: Rs. " + amount);
	}

}