package variables;

public class Static_v {
	// static variable - Inside the class but outside the method

	static int a = 75;
	static byte b = 80;

	public void Student() {
		System.out.println(b);

	}

	public static void stud() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Static_v d = new Static_v();
		d.Student(); // ref_v.classname for instance method
		stud(); // static method

	}
}