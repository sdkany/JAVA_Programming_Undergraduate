package chapter10;
import java.util.*;
public class Example17 {
	public static void main(String[] args) {
		// 定义一个集合类，模拟存储生产的商品
		List<Object> goods = new ArrayList<>();
		// 记录线程执行前统一的起始时间start
		long start = System.currentTimeMillis();
		// 创建一个生产者线程，用于生产商品并存入商品集合
		Thread thread1 = new Thread(() -> {
			int num = 0;
			while (System.currentTimeMillis()-start<=100) {
				// 使用synchronized关键字同步商品生产和消费
				synchronized (goods) {
					// 有商品就让生产者进入等待状态
					if(goods.size() >0){
						try {
							goods.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}else{
						// 生产者继续生产商品
						goods.add("商品" + ++num);
						System.out.println("生产商品" + num);
					}
				}
			}
		}, "生产者");
		// 创建一个消费线程，用于消费商品并将商品从集合删除
		Thread thread2 = new Thread(() -> {
			int num = 0;
			while (System.currentTimeMillis()-start<=100) {
				// 使用synchronized关键字同步商品消费和消费
				synchronized (goods) {
					// 商品不足就唤醒生产者进行生产
					if(goods.size()<= 0){
						goods.notify();
					}else{
						// 继续消费商品
						goods.remove("商品" + ++num);
						System.out.println("消费商品" + num);
					}
				}
			}
		}, "消费者");
		// 同时启动生产者和消费者两个线程，并统一执行100毫秒的时间
		thread1.start();
		thread2.start();
	}
}
