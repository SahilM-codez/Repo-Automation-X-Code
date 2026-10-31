package string;

public class StringNew_001 {

	public static void main(String[] args) {
		// Using new keyword --- heap area ----- with reference to variable
		
		String d = new String("Functional"); //---Heap area
		
		String e = new String ("Functional");
		
		String e1 = new String ("Non- Functional");
		
		// Storage in heap area
		
		
		System.out.println("---------------heap area--------------");
		
		System.out.println("The Storage of d in heap area will be -"+d);
		System.out.println("The Storage of e in heap area will be -"+e);
		System.out.println("The Storage of e1 in heap area will be -"+e1);
		
		//SCP---d=e----SCP area
		System.out.println("------------------SCP storage Area----------");
		
		System.out.println("The storage of d and e in SCP area will be -"+(d=e));
		System.out.println("The storage of e1 in SCP area will be - "+e1);

		

	}

}
