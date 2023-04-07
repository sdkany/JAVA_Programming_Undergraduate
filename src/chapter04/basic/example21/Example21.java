package chapter04.basic.example21;
//定义动物类接口
interface Animal {
	void shout();
}
public class Example21 {
	public static void main(String[] args) {
		String name = "小花";
		// 定义匿名内部类作为参数传递给animalShout()方法
		animalShout(new Animal() {
			// 实现shout()方法
			public void shout() {
				// JDK 8开始，局部内部类、匿名内部类可以访问非final的局部变量
				System.out.println(name + "喵喵...");
			}
		});
	}
	// 定义静态方法animalShout()，接收接口类型参数
	public static void animalShout(Animal an) {
		an.shout(); // 调用传入对象an的shout()方法
	}
}
