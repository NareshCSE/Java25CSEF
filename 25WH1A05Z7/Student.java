package mypackage5z7;

public class Student {
	//props = variables
	String rollNumber;
	String address;
	String email;
	int mobile_number;
	double cgpa;
	
	//behaviours = methods
	double getCGPA(String rollnumber) {
		return cgpa;
	}
	
	double getAttendance() {
		return cgpa;
	}
	public static void main(String[] args) {
		Student veda= new Student();
		System.out.println(veda);
	}
}
