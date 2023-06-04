package chapter10;
import java.util.concurrent.*;
//1、定义一个实现Callable接口的实现类
class MyThread4 implements Callable<Object> {
	// 1.1、重写Callable接口的call()方法
	public Object call() throws Exception {
		int i = 0;
		while (i++ < 5) {
			System.out.println(Thread.currentThread().getName() 
							    + "的call()方法在运行");
		}
		return i;
	}
}
public class Example18 {
	public static void main(String[] args) throws InterruptedException,
												    ExecutionException {
		// 2、创建Callable接口的实现类对象
		MyThread4 myThread4 = new MyThread4();
		// 3、使用Executors线程执行器类创建可扩展的线程池
		ExecutorService executor = Executors.newCachedThreadPool();
		// 4、将Callable接口实现类对象提交到线程池进行管理
		Future<Object> result1 = executor.submit(myThread4);
		Future<Object> result2 = executor.submit(myThread4);
		// 5、关闭线程池
		executor.shutdown();
		// 对于有返回值的线程任务，获取执行结果
		System.out.println("thread-1返回结果:" + result1.get());
		System.out.println("thread-2返回结果:" + result2.get());
	}
}

