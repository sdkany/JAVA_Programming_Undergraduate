package chapter04.basic.example28;
public class Example28 {
	// 下面的方法实现了两个整数相除
	public static int divide(int x, int y) {
		int result = x / y; // 定义一个变量result记录两个数相除的结果
		return result; 		// 将结果返回
	}
	public static void main(String[] args) {
		int result = divide(4, 0); // 调用divide()方法
		System.out.println(result);
	}
}
