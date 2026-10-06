package fita.guides.oops;

//Java does not support multiple inheritance using classes.
//Java avoids this because of ambiguity.
class parent1 {
	void run() {
		System.out.println("run1");
	}
}

class parent2 {
	void run() {
		System.out.println("run2");
	}
}

// NOT ALLOWED
//class Child extends parent1, parent2 {
//	
//	public static void main(String[] arg) {
//		Child child = Child();
//		child.run();
//	}
//	
//}

//Java avoids this because of ambiguity.
//
//Instead, Java supports multiple inheritance through interfaces.