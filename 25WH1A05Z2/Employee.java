

package mypackage5z2;



public class Employee {





   //props = variables

	int emp_id;

	String emp_name;

	String emp_salary;

	String address;

	int mobile_number;

	double cgpa;

	

	//behaviours = methods

	String getEmployeeSalary (int emp_id) {

		return emp_salary;

	}

	

	

	String getEmpAddress(int emp_id) {

		return address;

	}

	

	Employee[] getEmployees(String dept_name) {

		return null;

	}

	

	

	public static void main(String[] args) {

		Employee medha = new Employee();

		System.out.println(medha);

		

	


	}
	}


