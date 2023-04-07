package chapter04.basic.example23;
//定义无参、无返回值的函数式接口
@FunctionalInterface
interface Animal {
	void shout();
}
//定义有参、有返回值的函数式接口
interface Calculate {
	int sum(int a, int b);
}
public class Example23 {
	public static void main(String[] args) {
	   // 分别两个函数式接口进行测试
	   animalShout(() -> System.out.println("无参、无返回值的函数式接口调用"));
	   showSum(10, 20, (x, y) -> x + y);
	}
	// 创建一个动物叫的方法，并传入接口对象Animal作为参数
	private static void animalShout(Animal animal) {
		animal.shout();
	}
	// 创建一个求和的方法，并传入两个int类型以及接口Calculate类型的参数
	private static void showSum(int x, int y, Calculate calculate) {
		System.out.println(x + "+" + y + "的和为：" + calculate.sum(x, y));
	}
}


