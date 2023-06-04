package chapter10;
class DeadLockThread implements Runnable {
	// 定义两个不同的锁对象
	static Object chopsticks = new Object();
	static Object knifeAndFork = new Object();
	private boolean flag;
	DeadLockThread(boolean flag) {
		this.flag = flag;
	}
	public void run() {
		if (flag) {
			while (true) {
				// chopsticks锁对象上的同步代码块
				synchronized (chopsticks) { 
					System.out.println(Thread.currentThread().getName()
							             + "---if---chopsticks");
					// knifeAndFork锁对象上的同步代码块
					synchronized (knifeAndFork) { 
					System.out.println(Thread.currentThread().getName()
								        + "---if---knifeAndFork");
					}
				}
			}
		} else {
			while (true) {
				// knifeAndFork锁对象上的同步代码块
				synchronized (knifeAndFork) { 
					System.out.println(Thread.currentThread().getName()
							             + "---else---knifeAndFork");
					// chopsticks锁对象上的同步代码块
					synchronized (chopsticks) { 
					System.out.println(Thread.currentThread().getName() 
								        + "---else---chopsticks");
					}
				}
			}
		}
	}
}
public class Example15 {
	public static void main(String[] args) {
		// 创建两个DeadLockThread对象
		DeadLockThread thread1 = new DeadLockThread(true);
		DeadLockThread thread2 = new DeadLockThread(false);
		// 创建并开启两个线程
		new Thread(thread1, "Chinese").start();
		new Thread(thread2, "American").start();
	}
}

