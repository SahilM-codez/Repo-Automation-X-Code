package methods;

//syntax - Access Modifier Static Variable returntype methodname () {block of code}
// Belong to class
// static method/ User defined

public class Static_M {

	public static void A() {

		int b = 78;
		char i = 'S';

		System.out.println(b);
		System.out.println(i);

	}

	public static void main(String[] args) {

		// don't need to create object in static method
		// directly we can access by the methodname
		// methodname();

		A();
		
		// or we can  call as well by classname.methodnames
		System.out.println("-------------------");
		
		Static_M.A();

	}

}
