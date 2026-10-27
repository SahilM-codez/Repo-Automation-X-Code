package method_argument;

public class Method_Parameters {// method parameters are variables declared inside the parentheses of a method

	int a;
	float i; // inside class area = instance variables
	byte w;
	String v;

	public void test(int b) {

		a = b;

		System.out.println(a);

	}

	public static void unit(float g, byte j, String z) { // instance variables assign in static method i.e need to
															// create object.

		Method_Parameters l = new Method_Parameters();

		l.i = g;
		l.w = j;
		l.v = z;
		System.out.println(l.w);
		System.out.println(l.i);
		System.out.println(l.v);
	}

	public static void main(String[] args) {
		Method_Parameters u = new Method_Parameters();
		u.test(45);
		unit(44.4f, (byte) 74, "Testing The Code"); // We use (byte) because Java does not automatically convert an int
													// value
		// into a byte when passing it to a method.
		// (byte) performs explicit type casting, converting the int value 77 into a
		// byte.
	} // while conversion take only int, long datatypes

	/*
	 * 1. Implicit casting (automatic) Java converts a smaller-range type to a
	 * larger-range type automatically when the conversion is valid. 
	 * 2. Explicit casting (manual) You specify the target type yourself, commonly when
	 * converting from a wider type to a narrower type
	 * a
	 * 
	 */

}
