package thread.ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Task executed in callable";
	}

}

public class FutureImp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<String> futureObj = es.submit(new MyCallable());
	 	System.out.println(futureObj.get());

	 	
		FutureTask<String> ft= new FutureTask<>(new MyCallable());
		es.submit(ft);
		System.out.println(ft.isDone() +" "+ ft.get());
		

	}

}
