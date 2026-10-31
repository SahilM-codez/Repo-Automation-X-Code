package variables;

	
	// data type variable=value;

	// Instance variable: Inside the class outside the method

	public class Instance_v {
	 
		int a = 67;

		public void test() {

			// we need not to create object for instance variable to access instance
			// variable
			System.out.println(a);
	 
		}

		public static void login() { // static method but need create object cuz we take instance variable 'a'
			Instance_v d = new Instance_v();
			System.out.println(d.a);

		}

		public static void main(String[] args) {
			Instance_v d = new Instance_v(); // create variable for instance variable to execute instance variable
			d.test(); // ref_v.instancemethodname
			login();  // this static method so we directly called 
		} 

	}

	//Inside an instance method: You can access an instance variable directly.

	//Inside a static method: You need an object to access an instance variable.

	//To call an instance method from main(): You need an object.

	//To call a static method


