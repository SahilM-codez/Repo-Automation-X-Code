package method_argument;

public class Prac_Method_Parameters { // variables assign in instance method

	int a;
	float i; // inside class area = instance variables
	short w;
	String v;
	boolean x;
	char o;

	public void test(int b, float y, short c, String e, boolean z, char n ) {

		a = b;
		i = y;
		w = c;
		v = e;
		x=z;
		o=n;

		System.out.println(a);
		System.out.println(i);
		System.out.println(w);
		System.out.println(v);
		System.out.println("the parameter of boolean is :"+x);
		System.out.println("the parameter of char is :- "+o);
	}

	public static void unit(float g, byte j, String z) {

		// Method_Parameters l = new Method_Parameters();

		// l.i = g;
		// l.w = j;
		// l.v = z;
		// System.out.println(l.w);
		// System.out.println(l.i);
		// System.out.println(l.v);
	}

	public static void main(String[] args) {
		Prac_Method_Parameters u = new Prac_Method_Parameters();
		u.test(45, 44.7f, (short) 47, "Testing the unit",30<74, 'Q');
		// unit(44.4f, (byte)74, "Testing The Code"); // We use (byte) because Java does
		// not automatically convert an int value
		// into a byte when passing it to a method.
		// (byte) performs explicit type casting, converting the int value 77 into a
		// byte.
	} // while conversion take only int, long datatypes

}
