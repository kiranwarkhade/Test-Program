
import java.util.*;

class Employee {
	private String name;
	private int salary;
	private int id;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public int getSalary() {
		return this.salary;
	}

	public int getId() {
		return this.id;
	}

	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}
	
	
	
	
}

public class Main {
	public static void main(String args[]) {
		HashMap<Employee, String> hashMap = new HashMap<Employee, String>();
		hashMap.put(new Employee(1, "Sachin", 40000), "Sachin");
		hashMap.put(new Employee(2, "Sachin", 30000), "Sachin");
		hashMap.put(new Employee(3, "Dravid", 10000), "Dravid");
		hashMap.put(new Employee(10, "Sachin", 40000), "Sachin");
		hashMap.put(new Employee(4, "Yuvi", 59000), "Yuvi");
		
		
		
		for(Employee emp : hashMap.keySet())
		{
			if(!hashMap.containsKey(emp))
			{
				hashMap.put(emp, emp.getName());
			}
		}
		
		
		for(Employee emp : hashMap.keySet())
		{
			System.out.println(emp+ "-> " +hashMap.get(emp));
			
		}
		
		
		
		
		
		
	}
}
