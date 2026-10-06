package fita.guides.oops.part.two;

public class InterfaceAbstractionDemo {

	public static void main(String[] args) {

		Car car = new Car();

		car.start();
		car.stop();
	}
}

//  Interface
//	An interface is used to define a contract that implementing classes must follow.
//	A class uses the implements keyword to implement an interface.
interface Vehicle {

	void start();

	void stop();
}

// Implementation class
class Car implements Vehicle {

	public void start() {
		System.out.println("Car is starting");
	}

	public void stop() {
		System.out.println("Car is stopping");
	}
}

/*

	        Vehicle
	       (Interface)
	        /      \
	       /        \
	   start()     stop()
	       ↑         ↑
	       |         |
	       +--- Car -+

*/

/*

	Advantages of Abstraction
	-------------------------
	Hides unnecessary implementation details.
	Reduces complexity.
	Provides better security by hiding internal implementation.
	Makes code easier to maintain.
	Supports loose coupling.

*/