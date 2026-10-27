package variables;

public class local_v {

	// inside the class and method

	public void QDE() { // Method area // instance method
		int a = 112; // Local variable
		System.out.println(a);
	}

	public static void DDE() {
		int a = 100;
		System.out.println(a);
	}

	public static void main(String[] args) {
		local_v t = new local_v(); // for instance method create variable
		t.QDE(); // ref_v.instance method name
		DDE(); // static method so we directly called
		local_v.DDE(); //classname.method name   // another way to access static method 
	}

}
