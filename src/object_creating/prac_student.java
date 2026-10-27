package object_creating;

public class prac_student {

	// primitive data type

	byte age = 25;
	int marks = 450;
	short rollno = 12083;
	long Mobileno = 7894159754l;

	double salary = 250000.47;
	float percentage = 78.89f;

	char grade = 'A';
	boolean isPassed = true;

// Non Primitive data type

	String name = "Sahil";

	public static void main(String[] args) {

		// creating an object

		prac_student s1 = new prac_student();
		prac_student s2 = new prac_student();
		prac_student s3 = new prac_student();
		prac_student s4 = new prac_student();
		prac_student s5 = new prac_student();
		prac_student s6 = new prac_student();
		
		// assign 
		System.out.println("User Age is "+ s1.age);
		System.out.println(s2.name);
		System.out.println(s3.Mobileno);
		System.out.println(s4.salary);
		System.out.println(s5.grade);
		System.out.println(s6.isPassed);

	}

}
