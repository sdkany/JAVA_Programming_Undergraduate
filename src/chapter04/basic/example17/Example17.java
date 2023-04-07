package chapter04.basic.example17;
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
//定义Dog类实现Animal接口
class Dog implements Animal {
	// 实现接口shout()方法
	public void shout() {
		System.out.println("汪汪……");
	}
}
//定义测试类
public class Example17 {
	public static void main(String[] args) {
		Animal an1 = new Dog(); 
		Cat cat = (Cat) an1;
		cat.shout();
		cat.catchMouse();
//		Animal an1 = new Dog(); 
//		if(an1 instanceof Cat){ // 判断an1本质类型
//			Cat cat = (Cat) an1;
//			cat.shout();
//			cat.catchMouse();
//		}else{
//			System.out.println("该类型的对象不是Cat类型！");
//		}
	}
}
