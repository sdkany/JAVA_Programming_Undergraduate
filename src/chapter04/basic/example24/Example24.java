package chapter04.basic.example24;
//定义一个函数式接口
@FunctionalInterface
interface Calcable {
	int calc(int num);
}
//定义一个类，并在类中定义一个静态方法
class Math {
	// 定义一个求绝对值方法
	public static int abs(int num) {
		if (num < 0) {
			return -num;
		} else {
			return num;
		}
	}
}
//定义测试类
public class Example24 {
	private static void printAbs(int num, Calcable calcable) {
		System.out.println(calcable.calc(num));
	}
	public static void main(String[] args) {
		// 使用Lambda表达式方式
		printAbs(-10, n -> Math.abs(n));
		// 使用方法引用的方式
		printAbs(-10, Math::abs);
	}
}
