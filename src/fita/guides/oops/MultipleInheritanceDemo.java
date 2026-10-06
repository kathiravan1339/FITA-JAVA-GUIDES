package fita.guides.oops;

//Multiple Inheritance using Interfaces
public class MultipleInheritanceDemo {

	public static void main(String[] args) {

		SmartPhone phone = new SmartPhone();

		phone.call();
		phone.takePhoto();
	}
}

// Interface 1
interface Phone {

	void call();
	
//	void creat();
//	
//	void retrive();
//	
//	void update();
//	
//	void delete();
	
	//c
	
	//r
	
	//u
	
	//d
}

// Interface 2
interface Camera {

	void takePhoto();
}

// Class implementing multiple interfaces
class SmartPhone implements Phone, Camera {

	public void call() {
		System.out.println("SmartPhone is calling");
	}

	public void takePhoto() {
		System.out.println("SmartPhone is taking photo");
	}
}

/*

Phone       Camera
\         /
 \       /
  ↓     ↓
 SmartPhone

 */