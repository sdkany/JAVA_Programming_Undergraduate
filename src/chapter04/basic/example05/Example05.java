package chapter04.basic.example05;
//定义Animal类
class Animal {
	// 定义Animal无参的构造方法
	public Animal() {
		System.out.println("我是一只动物");
	}
	// 定义Animal有参的构造方法
	public Animal(String name) {
		System.out.println("我是一只" + name);
	}
}
// 定义Dog类，继承自Animal类
class Dog extends Animal {
	// 定义Dog类无参的构造方法
	public Dog() {
	}
}
// 定义测试类
public class Example05 {
	public static void main(String[] args) {
		Dog dog = new Dog(); // 创建Dog类的实例对象
	}
}
