package methods;
// syntax - Access Modifier returntype methodname () {block of code}
// Belong to the Variable
// Instance/Non-static method/ User defined

public class Instance_M {

	public void M() {

		String a = "Manual Testing";
		long p = 987156925;

		System.out.println("Contact For - "+p);
		System.out.println(a);
	}

	public static void main(String[] args) {
		// In instance method we need create object

		Instance_M K = new Instance_M();

		// ref_var.methodn

		K.M();
		

	}

}
