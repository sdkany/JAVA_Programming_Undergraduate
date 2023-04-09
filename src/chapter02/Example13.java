package chapter02;
public class Example13 {
	public static void main(String[] args) {
		int sum = 0;                         // 定义变量sum，用于记住累加的和
		for (int i = 1; i <= 4; i++) {       // i的值会在1~4之间变化
			sum += i;                        // 实现sum与i的累加
		}
		System.out.println("sum = " + sum);  // 打印累加的和
	}
}


