package operators;

public class Arithmetic_Operator {

	/*
	 * 1.Addition, 2. Subtraction 3. Multiplication 4.division 5. increment and
	 * decrement
	 * 
	 */

	public static void main(String[] args) {

		// Addition

		int a = 47;
		short b = 12;
		System.out.println("The addition result is - " + (a + b));

		// Subtraction

		byte t = 30;
		short r = 20;
		System.out.println("The Subtraction result is - " + (t - r));

		System.out.println("------------------------/-------------------------");

		// division
		// quotient----/
		// remainder---%

		long q = 8;
		int n = 4;
		System.out.println("quotient will be : -" + q / n);
		System.out.println("The remainder is - " + q % n);

		byte f = 9;
		long k = 3;
		System.out.println("quotient will be :- " + f / k);
		System.out.println("remainder will be  - " + f % k);

		System.out.println("------------------------/-------------------------");
		// multiplication

		int o = 50;
		int p = 4;
		System.out.println("multiplication is - " + o * p);

		System.out.println("------------------------/-------------------------");

		int s = 58;
		System.out.println("The increament value Is - " + ++s); // (++ operator only add 1 to value) 
		System.out.println("The increment  value is - " + s++);
		
		int y = 58;
		System.out.println("The post Decrement value is - " + y--); // post decrement
		System.out.println("The pre Decrement value is - " + --y); // pre decrement 
	
		// Pre-decrement changes the value first,
		// while post-decrement uses the current value first.

	}

}
