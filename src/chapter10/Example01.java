package chapter10;
//1、定义一个继承Thread线程类的子类
class MyThread1 extends Thread {
	// 创建子线程类有参构造方法
	public MyThread1(String name) {
		super(name);
	}
	public void run() {	// 1.1、重写Thread类的run()方法
		int i=0;
		while (i++ <5)
			System.out.println(Thread.currentThread().getName()
					             +"的run()方法在运行");
	}
}
public class Example01 {
	public static void main(String[] args) {
		// 2、创建MyThread1实例对象
		MyThread1 thread1=new MyThread1("thread1");
		thread1.start(); // 2.1、调用start()方法启动线程
		int i = 0;
		while (i++ <5)
			System.out.println(Thread.currentThread().getName()
							+"()方法在运行");
	}
}


