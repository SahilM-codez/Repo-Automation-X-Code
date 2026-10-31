package string;

public class String_Methods {

	public static void main(String[] args) {

		String a = " API Project";

		System.out.println("--------Is Empty Method-----------");

		System.out.println(a.isEmpty());

		String b = "";

		System.out.println(b.isEmpty());

		// Length start from 1
		System.out.println("----------------Length Method-------------");

		String u = "STP Project"; // count space/blank in " "
		System.out.println(u.length());

		// index start with 0

		System.out.println("--------- Index Method----------------");

		String h = "Western Department";
		System.out.println(h.indexOf("t"));
		
		// replace method
		System.out.println("--------- replace Method----------------");

		String k= " Rotating Earth";
		System.out.println(k.replace("Earth", "Wheel"));
		System.out.println(k.replace("ting", "tation"));
		
		// CharAt Method
		System.out.println("-----------ChartAt Method------------------");
		
		String j="Old age history";
		System.out.println(j.charAt(5));
		
		System.out.println("----------Lower and upper method------------------");
		
		// toLowecase
				System.out.println(j.toLowerCase());
				
				//to uppercase

				System.out.println(j.toUpperCase());
				
			//Substring method
				
			String l="STP Infotech";
			System.out.println(l.substring(4));
			System.out.println(l.substring(1, 5));
			
			System.out.println("----------------concatination-------------------");
			// Concatination
			String p1 = "Loan organization";
			System.out.println(p1.concat(" System"));
			System.out.println(p1+" Area");
			
			//Contain
			
			System.out.println("-----------Contain method-------------");
			
			System.out.println(p1.contains("m"));
			
			// equals 
			
			String v="Batman";
			String m="BAtman";
			System.out.println(v.equals(m));
			
			System.out.println(v.equalsIgnoreCase(m));
			
		//Trim method
			System.out.println("----------------Trim method-------------------");
			
			String z="      Automation                   ";
			System.out.println(z.trim());
			
			
					
			
			
				 
	}

}
