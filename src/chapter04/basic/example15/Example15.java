package chapter04.basic.example15;
//定义抽象类Animal
abstract class Animal {
	abstract void shout(); // 定义抽象shout()方法
}
//定义Cat类继承Animal抽象类
class Cat extends Animal {
	// 实现shout()方法
	public void shout() {
		System.out.println("喵喵……");
	}
}
//定义Dog类继承Animal抽象类
class Dog extends Animal {
	// 实现shout()方法
	public void shout() {
		System.out.println("汪汪……");
	}
}
//定义测试类
public class Example15 {
	public static void main(String[] args) {
		Animal an1 = new Cat(); 
		Animal an2 = new Dog(); 
		an1.shout();
		an2.shout();
	}
}

