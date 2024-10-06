package thread;

public class SalaryCalculation implements Runnable {

	Employee e=null;
	SalaryCalculation(Employee e)
	{
		this.e=e;
	}
	
	@Override
	public void run() {
	
		double salary=e.getBasicSalaryPerDay()*e.getNoOfWorkingdays();
		e.setSalary(salary);
	}
	
	

}
