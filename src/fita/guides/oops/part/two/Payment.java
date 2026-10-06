package fita.guides.oops.part.two;

/*

	When to use an Interface
	Use an interface when you want to define a contract/capability that different and potentially unrelated classes can implement.

*/
interface Payment {
    
	void pay(double amount);
	
	
}

class CreditCardPayment implements Payment {

	public void pay(double amount) {
		System.out.println("Paid using Credit Card: " + amount);
	}
}

class UpiPayment implements Payment {

	public void pay(double amount) {
		System.out.println("Paid using UPI: " + amount);
	}
}

class CashPayment implements Payment {

	public void pay(double amount) {
		System.out.println("Paid using Cash: " + amount);
	}
}

// Can an abstract class have an interface? YES
abstract class OnlinePayment implements Payment {

	void validatePayment() {
		System.out.println("Payment validated");
	}
}

class QRPayment extends OnlinePayment {

	public void pay(double amount) {
		System.out.println("Paid using Cash: " + amount);
	}
}