package thread;

public class Employee {

	
	int empId;
	String empName;
	double salary;
	double basicSalaryPerDay;
	int noOfWorkingdays;
	
	
	public Employee(int empId, String empName, double basicSalaryPerDay, int noOfWorkingdays) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalaryPerDay = basicSalaryPerDay;
		this.noOfWorkingdays = noOfWorkingdays;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBasicSalaryPerDay() {
		return basicSalaryPerDay;
	}

	public void setBasicSalaryPerDay(double basicSalaryPerDay) {
		this.basicSalaryPerDay = basicSalaryPerDay;
	}

	public int getNoOfWorkingdays() {
		return noOfWorkingdays;
	}

	public void setNoOfWorkingdays(int noOfWorkingdays) {
		this.noOfWorkingdays = noOfWorkingdays;
	}

	


	/*
	 * @Override public String toString() { return "Employee [empId=" + empId +
	 * ", empName=" + empName + ", salary=" + salary + ", basicSalaryPerDay=" +
	 * basicSalaryPerDay + ", noOfWorkingdays=" + noOfWorkingdays + "]"; }
	 */
	
	
	
	

}
