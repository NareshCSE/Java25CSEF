package mypackage5z7;

public class Employee {
	//properties
	int emp_id;
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
	
	Employee[] getEmployees(String dept_name){
		return null;
	}
	
	public static void main(String[] args) {
		Employee harshitha= new Employee();
		System.out.println(harshitha);
	}

}
