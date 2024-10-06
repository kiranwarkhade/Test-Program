package thread.ExecutorFramework;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import customexception.userException;

public class ExecutorTest {
	
static int age=18;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			if(age < 18)
			{
				throw new userException("Age is below 18");
			}
		}catch(userException e)
		{
			System.out.println("Exception: "+ e);
			System.out.println("Exception Message: "+ e.getMessage());
		}
	}
}