package returns_statements;

public class Returns {
//Without return statement and no Parameters
	//without using return statement and didnt take parameters in method () parenthesis
	
	public void test() {
		
		System.out.println("Testing Automation");
	}
	
	//Without return statement and with parameter
	
	public static void Statement(int a) {
		System.out.println(a);
		
	}
	
	//With return statement with parameters
	
	public int add (int a , int b) {   // void and return statement both can't use at same time 
		                               // void does not return any value and return statement return specific output.
		return(a+b);
		 
		
	}
	
	public static void main(String[] args) {
		Returns i  = new Returns();
		i.test();
		Statement(50);
		System.out.println(i.add(120,1));

	}
}
