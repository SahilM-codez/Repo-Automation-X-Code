package return_statement;
	
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
				
				public static float name(int a, long b, float c) {
					
					return (a+b+c);		
				}
				public char institute (char q) {
					return 'S';
				}
		
				public String name(String login) {
					
					return "STP_Infotech";
					
				}
				
			public static void main(String[] args) {
				Returns i  = new Returns();
				i.test();
				Statement(50);
				System.out.println(i.add(120,1));
				System.out.println(i.name("World"));
				System.out.println(i.institute('G'));
				System.out.println(i.name(41, 786, 47.87f));

			}

}
