package chapter04.basic.example09;
//定义Animal类
class Animal {
	// 使用final关键字修饰shout()方法
	public final void shout() {
	}
}
//定义Dog类继承Animal类
class Dog extends Animal {
	// 重写Animal类的shout()方法
//	public void shout() {
//	}
}
//定义测试类
public class Example09 {
	public static void main(String[] args) {
		Dog dog=new Dog(); // 创建Dog类的实例对象
	}
}

