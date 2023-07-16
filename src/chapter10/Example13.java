package chapter10;
//定义SaleThread3类实现Runnable接口
class SaleThread3 implements Runnable {
	private int tickets = 10;
	public void run() {
		while (true) {
			saleTicket(); // 调用售票方法
			try {Thread.sleep(100);}
			catch (InterruptedException e) {e.printStackTrace();}
			if(tickets <= 0) break;
		}
	}
	// 定义一个同步方法saleTicket()
	private synchronized void saleTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(300); // 模拟售票耗时过程
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() 
					             + " 正在发售第 " + tickets-- + " 张票 ");
		}
	}
}
public class Example13 {
	public static void main(String[] args) {
		SaleThread3 saleThread = new SaleThread3(); 
		// 创建并开启四个线程，模拟4个售票窗口
		new Thread(saleThread, "窗口1").start();
		new Thread(saleThread, "窗口2").start();
		new Thread(saleThread, "窗口3").start();
		new Thread(saleThread, "窗口4").start();
	}
}


