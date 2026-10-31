package variables;

public class Local_v {
	

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
			Local_v t = new Local_v(); // for instance method create variable
			t.QDE(); // ref_v.instance method name
			DDE(); // static method so we directly called
			Local_v.DDE(); //classname.method name   // another way to access static method 
		}

	}

