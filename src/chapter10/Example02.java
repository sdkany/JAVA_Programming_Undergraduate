package chapter10;
//1、定义一个实现Runnable接口的实现类
class MyThread2 implements Runnable {
	// 1.1、重写Runnable接口的run()方法
	public void run() {
		int i=0;
		while (i++ <5) { 
			System.out.println(Thread.currentThread().getName()
					             +"的run()方法在运行");
		}
	}
}
public class Example02 {
	public static void main(String[] args) {
		// 2、创建Runnable接口实现类的实例对象
		MyThread2 myThread2 = new MyThread2();
		// 3、使用Thread(Runnable target, String name)构造方法创建线程对象
		Thread thread1 = new Thread(myThread2,"thread1");
		thread1.start();  // 4、调用线程对象的start()方法启动线程
		// 创建并启动另一个线程thread2
		Thread thread2 = new Thread(myThread2,"thread2");
		thread2.start();
	}
}



