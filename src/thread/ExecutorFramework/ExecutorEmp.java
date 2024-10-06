package thread.ExecutorFramework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


// execute(), shutDown(), awaitTermination(), submit(runnable, //callable),invokeAny(),
// InvokeAll(), Future & FutureTask



class Service implements Callable<String> // Runnable
{

	int i;

	public Service(int i) {
		this.i = i;
	}

	/*
	 * @Override public void run() { System.out.println("In thread: " +i); try {
	 * Thread.sleep(1000); }catch(InterruptedException e) { e.printStackTrace(); } }
	 */

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		System.out.println("in thread " + i);

		return "From thread " + i;
	}

}

public class ExecutorEmp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(2);
		System.out.println(new Date());

		// List<Future<String>> FutureList=new ArrayList();
		/*
		 * List<Callable<String>> FutureList=new ArrayList(); FutureList.add(new
		 * Service(1)); FutureList.add(new Service(2)); FutureList.add(new Service(3));
		 * FutureList.add(new Service(4)); FutureList.add(new Service(5));
		 */

		List<Callable<String>> CallableList = new ArrayList();
		CallableList.add(new Service(1));
		CallableList.add(new Service(2));
		CallableList.add(new Service(3));
		CallableList.add(new Service(4));
		CallableList.add(new Service(5));

		//List<Future<String>> FutureList1 = es.invokeAny(FutureList); // only invoke one thread it can be any from list
		
		List<Future<String>> FutureList = es.invokeAll(CallableList);
		
		es.shutdown();
		/*
		 * for(int i=0; i< 10; i++) { //es.execute(new Service(i));
		 * //FutureList.add((Future<String>) es.submit(new Service(i)));
		 * 
		 * 
		 * }
		 */
		es.shutdown();
		es.awaitTermination(10, TimeUnit.SECONDS);
		System.out.println("=================================");
		//.out.println(str);
		
		  for(Future<String> fut:FutureList) System.out.println(fut.get());// null in
		  {
			  
		  }
		 
		System.out.println(new Date());
	}

}
