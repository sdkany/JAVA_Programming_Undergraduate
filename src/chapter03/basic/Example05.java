package chapter03.basic;
public class Example05 {
	// 1、实现两个整数相加
	public static int add01(int x, int y) {
		return x + y;
	}
	// 2、实现三个整数相加
	public static int add02(int x, int y, int z) {
		return x + y + z;
	}
	// 3、实现两个小数相加
	public static double add03(double x, double y) {
		return x + y;
	}
	public static void main(String[] args) {
		// 针对求和方法的调用
		int sum1 = Example05.add01(1, 2);
		int sum2 = add02(3, 4, 7);
		double sum3 = add03(0.2, 5.3);
		//打印求和的结果
		System.out.println("sum1=" + sum1);
		System.out.println("sum2=" + sum2);
		System.out.println("sum3=" + sum3);
	}
}


