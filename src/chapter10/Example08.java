package chapter10;
public class Example08 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().
						getName() + "正在输出i：" + i);
				if(i == 2){
					try {
						Thread.sleep(500); // 让线程休眠
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int j = 0; j < 10; j++)
				System.out.println(Thread.currentThread().
						getName()+ "正在输出j：" + j);
		});
		thread1.start(); thread2.start();
	}
}


