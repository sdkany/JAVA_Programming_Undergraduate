package chapter10;
//定义YieldThread类继承Thread类
class YieldThread extends Thread {
	// 定义一个有参的构造方法
	public YieldThread(String name) {
		super(name); // 调用父类的构造方法
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "---" + i);
			if (i == 2) {
				System.out.print("线程让步:");
				Thread.yield(); // 线程运行到此，作出让步
			}
		}
	}
}
public class Example09 {
	public static void main(String[] args) {
		// 创建两个线程
		Thread thread1 = new YieldThread("thread1");
		Thread thread2 = new YieldThread("thread2");
		// 开启两个线程
		thread1.start();
		thread2.start();
	}
}
