package operators;

public class Logical_operator {

	public static void main(String[] args) {
		// logical-and--&&
		// logical-or--||
		// logical-not-- !

		// logical and &&

		// T T---F
		// T F---F
		// F T---F
		// F F---F

		// logical or ||

		// T T---T
		// T F---T
		// F T---T
		// F F---F

		// logical not !

		// T---F
		// F---T

		// logical and &&
		System.out.println("\n----- LOGICAL AND (&&) -----");
		// Both conditions must be true to get true.

		int a = 9;
		int b = 7;

		boolean c = a > b && b < a;
		System.out.println("The value of c is - " + c);

		boolean d = a > b && b > a;
		System.out.println("The value of d is - " + d);

		boolean e = a < b && b > a;
		System.out.println("The value of e is - " + e);

		boolean f = a < b && a > b;
		System.out.println("The value of f is - " + f);

		// LOGICAL OR (||)

		System.out.println("\n----- LOGICAL OR (||) -----");
		// At least one condition must be true to get true.

		boolean g = a > b || b < a;
		System.out.println("The value of g is - " + g);

		boolean h = a > b || b > a;
		System.out.println("The value of h is - " + h);

		boolean i = a < b || b > a;
		System.out.println("The value of i is - " + i);

		boolean j = a < b || a > b;
		System.out.println("The value of j is - " + j);

		// LOGICAL NOT (!)
		System.out.println("\n----- LOGICAL NOT (!) -----");
//It reverses the boolean result.
		boolean k = !(a > b);
		System.out.println("The value of k is - " + k);

		boolean l = !(a < b);
		System.out.println("The value of l is - " + l);

		boolean m = !(a == b);
		System.out.println("The value of m is - " + m);

	}

}
