package returns_statements;

public class Practice_return {

	public void checkAge(int age) {
		if (age < 18) {
			System.out.println("Not eligible");
			return;

		}
	}

	public static void main(String[] args) {
		Practice_return i = new Practice_return();
		
		System.out.println("eligible");

	}
}
