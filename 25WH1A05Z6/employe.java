package mypackage5z6;

public class Employeobject {
	//properties
	String emp_name;
	double emp_salary;
	String address;
	int mobile_number;
	
	//behaviours
	double getEmployeeSalary(int emp_id) {
		return emp_salary;
		
	}

	String getEmpAddress(int emp_id) {
		return address;
	}
	
	Employeobject[] getEmployees(String dept_name) {
		return null;
	}
	public static void main(String[] args) {
		Employeobject manasvi = new Employeobject();
		System.out.println(manasvi);

	}

}
