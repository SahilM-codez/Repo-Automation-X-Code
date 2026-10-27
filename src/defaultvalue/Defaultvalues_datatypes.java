package defaultvalue;

public class Defaultvalues_datatypes {
// integer // primative datatypes

	byte a;
	short b;
	int c;
	long d;

	// floating

	float e;
	double f;

	// non numeric

	char g;
	boolean h;

	// Non primitive

	String i; // predefined class
	 //Array [][]l; // predefined class

	public static void main(String[] args) {

		Defaultvalues_datatypes q = new Defaultvalues_datatypes();

		System.out.println(" -------------default  integer datatypes are -------------");

		System.out.println("The default value of byte is - " + q.a);
		System.out.println("The default value of short is - " + q.b);
		System.out.println("The default value of int is - " + q.c);
		System.out.println("The default value of long is - " + q.d);

		System.out.println(" -------------default floating datatypes are -------------");

		System.out.println("The default value of float is - " + q.e);
		System.out.println("The default value of double is - " + q.f);

		System.out.println(" ------------- Non Numeric datatypes are -------------");

		System.out.println("The default value of char is - " + q.g);
		System.out.println("The default value of boolean is - " + q.h);
		
		System.out.println(" ------------- Non Primative datatypes are -------------");

		System.out.println("The default value of String is - " + q.i);
		//System.out.println("The default value of Array is - " + q.l);
	}
}

/*Primative = Size and type
 byte short long etc
 represent as bold
 Lowercase
 Default values of primitive data types cannot be null
 it has specific size as per the data type

 Non Primative = Refers to the object class
String, Array
 Not represent in bold
Uppercase
can be null
it has all the same size
 */