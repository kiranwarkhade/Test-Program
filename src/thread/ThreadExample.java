package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample extends Thread {

	public void run() {		System.out.println("Thread started...");	}

	public void Display() {		System.out.println("Display Method...");	}

	public static void main(String[] args) {
		ThreadExample t = new ThreadExample();
		t.start();		
		ThreadExample t1 = new ThreadExample();
		t1.start();		
		t.Display();
		t.run();
				
		//t.start();
		
		//Thread pool	
		//ExecutorService ex=Executors.newFixedThreadPool(3);
	//	ex.submit(null);
		
		Employee e=new Employee(123,"Kiran", 10000, 25);
		Employee e1=new Employee(124,"Karthik", 20000, 21);
		Employee e2=new Employee(125,"Sachin", 30000, 20);
		Employee e3=new Employee(126,"Shankar", 5000, 26);
		Employee e4=new Employee(127,"Ajit", 9000, 23);
		Employee e5=new Employee(128,"Om", 7000, 28);
		Employee e6=new Employee(129,"Pooja", 15000, 22);
		Employee e7=new Employee(130,"Putin", 12000, 30);
		
		
		
		List<Employee> emplist=new ArrayList();
		emplist.add(e);
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		emplist.add(e6);
		emplist.add(e7);
		
		ExecutorService ex=Executors.newCachedThreadPool();
		for(int i=0;i< emplist.size();i++)
		{
			SalaryCalculation s=new SalaryCalculation(emplist.get(i));
			ex.submit(s);
		}
		ex.isTerminated();
		
	}

}
