package chapter04.basic.example16;
//定义接口Animal
interface Animal {
	void shout(); // 定义抽象shout()方法
}
//定义Cat类实现Animal接口
class Cat implements Animal {
	// 实现接口shout()方法
	public void shout() {
		System.out.println("喵喵……");
	}
	// 定义Cat类特有的抓老鼠catchMouse()方法
	public void catchMouse() {
		System.out.println("小猫抓老鼠……");
	}
}
//定义测试类
public class Example16 {
	public static void main(String[] args) {
//		Animal an1 = new Cat(); 
//		an1.shout();
//		an1.catchMouse();
		Animal an1 = new Cat(); 
		Cat cat = (Cat) an1;
		cat.shout();
		cat.catchMouse();
	}
}


