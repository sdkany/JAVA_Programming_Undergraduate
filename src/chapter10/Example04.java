package chapter10;
//1、定义一个继承Thread线程类的子类
class TicketWindow extends Thread {
	private int tickets = 5;
	public void run() {
		while (true) { 
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName()
						+ " 正在发售第 " + tickets-- + " 张票 ");
			}else break;
		}
	}
}
public class Example04 {
	public static void main(String[] args) {
		// 分别创建4个线程对象TicketWindow并开启，来模拟4个售票窗口
		new TicketWindow().start(); 
		new TicketWindow().start(); 
		new TicketWindow().start(); 
		new TicketWindow().start(); 
	}
}


