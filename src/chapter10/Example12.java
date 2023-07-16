package chapter10;
//定义SaleThread2类实现Runnable接口
class SaleThread2 implements Runnable {
	private int tickets = 10;    // 10张票
	Object lock = new Object();  // 定义任意一个对象，用作同步代码块的锁
	public void run() {
		while (true) {
			synchronized (lock) { // 定义同步代码块
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() 
							+ " 正在发售第 " + tickets-- + " 张票 ");
					try {
						Thread.sleep(300); // 模拟售票耗时过程
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else break;
			}
		}}}
public class Example12 {
	public static void main(String[] args) {
		SaleThread2 saleThread = new SaleThread2();
		new Thread(saleThread, "窗口1").start();
		new Thread(saleThread, "窗口2").start();
		new Thread(saleThread, "窗口3").start();
		new Thread(saleThread, "窗口4").start();
	}
}


