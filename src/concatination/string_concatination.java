package concatination;

// concatination is process to join requirements
// concate denote by ( + )

public class string_concatination { //variable declare in class but outside the main method = this is Instance variable
	
	String t = "STP";
	String r = "infotech";
	

	public static void main(String[] args) { 
		
		int a = 12;
		int b = 14;
		
	string_concatination j = new string_concatination ();
	
	System.out.println("institue name is -"+j.t+" "+j.r );
	
	System.out.println("addition of two variable is :-" +a+b); // o/p :- 1214 ( 1st + for concate and a+b means jvm think not addition of variable value.  
	
	System.out.println("addition of two variable is :-"+ (a+b)); // o/p will be addition of var-value because in curcle ( a+b ) 
 
	}

}
