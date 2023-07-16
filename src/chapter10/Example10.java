package chapter10;
class EmergencyThread implements Runnable {
	public void run() {
		for (int i = 1; i < 6; i++)
			System.out.println(Thread.currentThread().getName()+"输入："+i);
		try {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()
					+"休眠结束");
		} catch (InterruptedException e) {e.printStackTrace();}
	}
}
public class Example10 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new EmergencyThread(),"thread1");
		thread1.start();
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"输入："+i);
			if (i == 2) {
				System.out.println("thread1开始插队");
				thread1.join();
			}
		}
	}
}




